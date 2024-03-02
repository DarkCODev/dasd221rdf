package com.loseweight

import android.app.Application
import android.content.*
import android.os.Handler
import android.os.StrictMode
import android.speech.tts.TextToSpeech
import android.util.Log
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.loseweight.BuildConfig.DEBUG
import com.loseweight.facebookad.AudienceNetworkInitializeHelper
import com.loseweight.utils.*
import java.lang.Exception
import java.util.*
import com.facebook.samples.ads.debugsettings.DebugSettings



class MyApplication : Application() {

    internal var handler = Handler()

    companion object {
        var textToSpeech: TextToSpeech? = null
        //var musicUtil: MusicUtil? = null

        fun speechText(context: Context, strSpeechText: String,fromTestTTS:Boolean = false) {
            if (checkVoiceOnOrOff(context) || fromTestTTS) {
                if (textToSpeech != null) {
                    textToSpeech!!.setSpeechRate(0.9f)
                    textToSpeech!!.speak(strSpeechText, TextToSpeech.QUEUE_FLUSH, null,Date().time.toString())
                }
            }
        }

        fun checkVoiceOnOrOff(context: Context): Boolean {
            return Utils.getPref(context, Constant.PREF_IS_INSTRUCTION_SOUND_ON, true)
        }


    }

    override fun onCreate() {
        super.onCreate()

        textToSpeech = TextToSpeech(this, TextToSpeech.OnInitListener { status ->
            if (status != TextToSpeech.ERROR) {
                // Se declara 'locale' como mutable para poder cambiar su valor después
                var locale = Locale.getDefault()
                var result = textToSpeech!!.setLanguage(locale)

                // Si el idioma predeterminado no es soportado, intenta cambiar a inglés
                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Log.e("Texttospeech", "El idioma no es soportado, cambiando a inglés.")
                    locale = Locale.ENGLISH // Ahora puedes reasignar un nuevo valor a 'locale'
                    result = textToSpeech!!.setLanguage(locale)

                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("Texttospeech", "Incluso el inglés no es soportado.")
                    } else {
                        Log.d("Texttospeech", "Idioma cambiado a inglés correctamente")
                    }
                } else {
                    Log.d("Texttospeech", "Idioma configurado correctamente")
                }
            }
        })


        DebugSettings.initialize(this)

        AudienceNetworkInitializeHelper.initialize(this)

        if (DEBUG) {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())
            StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build())
        }
    }



    class InternetConnectionReceiver() : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {

            if (Utils.isInternetConnected(context) && Utils.isUserLoggedIn(context!!)) {
                Debug.e("InternetConnectionReceiver", "internet Connected")

                LocalBroadcastManager.getInstance(context)
                    .sendBroadcast(Intent(Constant.CONNECTIVITY_CHANGE))

            }

        }

    }


}