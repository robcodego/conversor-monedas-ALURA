<h1>💶->💵 Challenge Conversor de Monedas</h1>  

Esta es mi propuesta de solución para el Challenge Conversor de Monedas de ALURA-LATAM usando la ExchangeRate-API.

![Version Java](https://img.shields.io/badge/java-17.0.0+-blue)
![Version Java](https://img.shields.io/badge/gson-2.10.1-black)

# ¿Cómo funciona?  

Para comenzar solo debes tomar en cuenta la **moneda base** 💶 y la **moneda objetivo** y escribir el código de cada una
de ellas en formato "XXX" donde cada X representa una letra.  
Puedes revisar todos los códigos de monedas disponibles en: https://www.exchangerate-api.com/docs/supported-currencies



# Configuración  

Como requisitos debes tomar en cuenta:

- Java JDK 17+
- Un IDE para Java. Por ejemplo: IntelliJ, Eclipse, NetBeans.

Abre una terminal y...

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/robcodego/conversor-monedas-alura.git
   ```
2. Abre el proyecto en tu IDE preferido.
3. Asegúrate de tener agregada la dependencia de Gson y ejecútalo.
   
# Ejemplo de una conversión con las monedas **GBP** y **JPY**

```bash
Bienvenido@ al conversor de monedas

Usarlo es en definitiva simple, solo debes...
Ingresar la moneda base (en formato de tres letras mayúsculas) y
en seguida la moneda objetivo (en formato de tres letras mayúsculas).
 - Por ejemplo: 'MXN' a 'USD'

Consulta la lista de códigos de moneda en: https://www.exchangerate-api.com/docs/supported-currencies

Ingresa la moneda base: 
GBP
Ingresa la moneda objetivo: 
JPY

```

Respuesta de la ExchangeRate-API 
____________________

```bash
   {
	"result": "success",
	"documentation": "https://www.exchangerate-api.com/docs",
	"terms_of_use": "https://www.exchangerate-api.com/terms",
	"time_last_update_unix": 1585267200,
	"time_last_update_utc": "Fri, 27 Mar 2020 00:00:00 +0000",
	"time_next_update_unix": 1585270800,
	"time_next_update_utc": "Sat, 28 Mar 2020 01:00:00 +0000",
	"base_code": "GBP",
	"target_code": "JPY",
	"conversion_rate": 142.0543,
	"target_data": {
		"locale": "Japan",
		"two_letter_code": "JP",
		"currency_name": "Japanese Yen",
		"currency_name_short": "Yen",
		"display_symbol": "00A5",
		"flag_url": "https://www.exchangerate-api.com/img/docs/JP.gif"
	}
}
```
Respuesta del conversor
____________________

```bash
1 GBP equivale a 193.6472 JPY
```
