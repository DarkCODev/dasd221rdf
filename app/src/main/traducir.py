import os
import shutil
import requests
from bs4 import BeautifulSoup

def translate_text(text, target_language):
    # URL de la API de Google Translate
    url = 'https://translate.googleapis.com/translate_a/single?client=gtx&sl=auto&tl={}&dt=t&q={}'.format(target_language, text)

    # Realizar la solicitud GET a la API
    response = requests.get(url)

    # Parsear la respuesta JSON
    translated_text = response.json()[0][0][0]

    return translated_text

def create_translations(selected_languages=None):
    # Lista de idiomas más comunes y sus códigos
    common_languages = {
        'es': 'Spanish',
        'fr': 'French',
        'de': 'German',
        'it': 'Italian',
        'pt': 'Portuguese',
        'ru': 'Russian',
        'zh': 'Chinese',
        'ja': 'Japanese',
        'ko': 'Korean',
        'ar': 'Arabic',
        'tr': 'Turkish',
        'hi': 'Hindi',
        'bn': 'Bengali',
        'pa': 'Punjabi',
        'vi': 'Vietnamese',
        'th': 'Thai',
        'ms': 'Malay',
        'fil': 'Filipino',
        'id': 'Indonesian',
        'nl': 'Dutch',
        'sv': 'Swedish',
        'no': 'Norwegian',
        'fi': 'Finnish',
        'da': 'Danish',
        'pl': 'Polish',
        'hu': 'Hungarian',
        'cs': 'Czech',
        'sk': 'Slovak',
        'uk': 'Ukrainian',
        'ro': 'Romanian',
        'el': 'Greek',
        'bg': 'Bulgarian',
        'sr': 'Serbian',
        'hr': 'Croatian',
    }

    # Ruta al directorio res
    res_dir = os.path.join(os.getcwd(), 'res')

    # Verificar si el directorio res existe
    if not os.path.exists(res_dir):
        print("El directorio 'res' no existe en la ubicación actual.")
        return

    # Ruta al archivo strings.xml en la carpeta values
    default_strings_path = os.path.join(res_dir, 'values', 'strings.xml')

    # Verificar si el archivo strings.xml existe
    if not os.path.exists(default_strings_path):
        print("El archivo 'strings.xml' no existe en la carpeta 'values'.")
        return

    # Si no se especifican idiomas seleccionados, usar los 34 idiomas más comunes
    if selected_languages is None:
        selected_languages = common_languages.keys()

    # Crear directorios y archivos de traducción
    for lang_code, lang_name in common_languages.items():
        if lang_code in selected_languages:
            lang_dir = os.path.join(res_dir, f'values-{lang_code}')
            os.makedirs(lang_dir, exist_ok=True)
            translated_strings_path = os.path.join(lang_dir, 'strings.xml')
            shutil.copy(default_strings_path, translated_strings_path)
            # Traducir las cadenas de texto al idioma correspondiente
            with open(translated_strings_path, 'r+') as f:
                content = f.read()
                f.seek(0)
                for line in content.splitlines():
                    if '<string name=' in line:
                        start_index = line.find('>') + 1
                        end_index = line.rfind('</')
                        text_to_translate = line[start_index:end_index]
                        translated_text = translate_text(text_to_translate, lang_code)
                        line = line[:start_index] + translated_text + line[end_index:]
                    f.write(line + '\n')
            print(f"Traducción creada para {lang_name} ({lang_code}) en {translated_strings_path}")

if __name__ == "__main__":
    print("Seleccione los idiomas de destino separados por comas (p. ej., es,fr,de) o presione Enter para usar los 34 idiomas más comunes:")
    selected_languages_input = input().strip()
    if selected_languages_input:
        selected_languages = [lang.strip() for lang in selected_languages_input.split(',')]
    else:
        selected_languages = None
    create_translations(selected_languages)

