# 💱 Conversor de Monedas

Este es un proyecto de práctica desarrollado en Java como parte del programa Oracle Next Education (ONE). La aplicación permite convertir valores entre diferentes monedas en tiempo real utilizando una API de tipo de cambio.

---

## 🚀 ¿Cómo funciona?

La aplicación presenta un menú interactivo en consola con varias opciones de conversión de divisas. El usuario elige una opción, introduce el monto que desea convertir, y el programa consulta una API externa para obtener el valor actualizado de la conversión.

### Monedas disponibles para conversión:

1. Dólar estadounidense (USD) => Peso argentino (ARS)
2. Peso argentino (ARS) => Dólar estadounidense (USD)
3. Dólar estadounidense (USD) => Real brasileño (BRL)
4. Real brasileño (BRL) => Dólar estadounidense (USD)
5. Dólar estadounidense (USD) => Peso colombiano (COP)
6. Peso colombiano (COP) => Dólar estadounidense (USD)
7. Salir

---

## 🛠️ Tecnologías utilizadas

- **Java 17**
- **HttpClient (Java SE)**
- **Gson (para procesar respuestas JSON)**
- **API externa de tipo de cambio:** [ExchangeRate API](https://www.exchangerate-api.com/)

---

## 🧪 ¿Cómo ejecutar el programa?

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/tuusuario/conversor-monedas.git
   cd conversor-monedas

2. Asegúrate de tener instalado Java 17 o superior. Puedes comprobarlo con:
    ```bash
   java -version

3. Ejecuta el programa con tu entorno preferido (IDE o consola). Si usas consola, compila y ejecuta con:
    ```bash
    javac -d bin src/com/alura/challenge/**/*.java
    java -cp bin com.alura.challenge.principal.Main
   
## 🧭 ¿Cómo utilizar la aplicación?

1. Al iniciar el programa, verás un menú con las opciones de conversión.
2. Introduce el número correspondiente a la conversión deseada (entre 1 y 6).
3. Introduce el monto que deseas convertir.
4. El sistema mostrará el valor convertido en tiempo real.
5. Elige 7 para salir del programa.

## 📌 Notas adicionales
- La conexión a la API es en tiempo real, por lo tanto, necesitas una conexión a Internet activa.

## 📄 Licencia
Este proyecto es de uso libre para fines educativos. Desarrollado como parte del programa Oracle Next Education.