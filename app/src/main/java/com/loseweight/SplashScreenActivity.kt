package com.loseweight

import android.app.PendingIntent.getActivity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.facebook.ads.AdSettings
import com.loseweight.facebookad.AudienceNetworkInitializeHelper
import com.loseweight.utils.Constant
import com.loseweight.utils.Utils
import com.utillity.db.DataHelper

class SplashScreenActivity : AppCompatActivity() {

    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        // Inicializa la nueva API SplashScreen antes de llamar a super.onCreate y setContentView
        installSplashScreen()

        super.onCreate(savedInstanceState)

        // Inicialización de Audience Network y otras inicializaciones
        AudienceNetworkInitializeHelper.initialize(this)

        // Comprobación de la base de datos y otras operaciones de inicio
        DataHelper(this).checkDBExist()

        // Log para imprimir el hash key, útil para configuraciones de Facebook u otros SDKs
        Utils.printHashKey(this)

        // Programar la decisión de qué actividad iniciar después de la SplashScreen
        handler.postDelayed({
            decideNextActivity()
        }, 1000) // Suponiendo un retardo de 2 segundos para demostración
    }

    private fun decideNextActivity() {
        // Elimina cualquier callback pendiente para evitar lanzar la actividad más de una vez
        handler.removeCallbacksAndMessages(null)

        // Aquí tu lógica existente para decidir qué actividad iniciar, simplificada para el ejemplo
        val isFirstTime = Utils.getPref(this, Constant.PREF_IS_FIRST_TIME, true)
        val goalIsEmpty = Utils.getPref(this, Constant.PREF_GOAL, "").isNullOrEmpty()

        val intent = if (isFirstTime && goalIsEmpty) {
            Intent(this, ChooseYourPlanActivity::class.java)
        } else {
            Intent(this, HomeActivity::class.java).apply {
                if (intent.extras?.containsKey("isFrom") == true && intent.extras!!.get("isFrom") == Constant.FROM_DRINK_NOTIFICATION) {
                    putExtra("isFrom", Constant.FROM_DRINK_NOTIFICATION)
                }
            }
        }
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
        finish()
    }



    fun startapp(userStatus: Int) {
        val intent = when (userStatus) {
            0 -> Intent(this, ChooseYourPlanActivity::class.java)
            1 -> Intent(this, HomeActivity::class.java)
            else -> return // Si el estado no es reconocido, no hace nada (o maneja según sea necesario)
        }
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
        finish()
    }

}


