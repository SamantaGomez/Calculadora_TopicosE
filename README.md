TOPICOS ESPECIALES - CALCULADORA
# :information_desk_person: Samanta Michelle Gómez Jácome

# **Instrucciones**

Realizar una calculadora con Android Studio, con al menos 7 funcionalidades, entregable: link de hithub, en el readme debe constar la explicación de las funciones y los integrantes, además deberá tener capturas de pantalla.

# **DESARROLLO DEL APLICATIVO**

Para el desarrollo de la calculadora se proceda a crear un nuevo proyecto que en este caso se llama "calculadorasgomez" con lenguaje Java, y el SDK que usamos es: API 29 ANDROID 10.0(Q) y se comprueba el emulador que se va a utilizar para eso hemos conectado un celular Xiaomi Mi A2, con version de Android 10, conseguimos esto poniendo en las propiedades del telefono en modo depuración por USB conectada en el celular.

![depuracion](https://user-images.githubusercontent.com/49683650/106196710-c479f580-617f-11eb-9406-1bc59979f563.jpeg)

De esta manera nos reconoce Android Studio como emulador 

![image](https://user-images.githubusercontent.com/49683650/106191912-7d890180-6179-11eb-90d1-aa91f2c4f4c9.png)

Luego procedemos a realizar el diseño de la calculadora con sus respectivos botones

![intgrafica](https://user-images.githubusercontent.com/49683650/106194854-5cc2ab00-617d-11eb-86fa-11daf81710b2.JPG)

Asi la interfaz gráfica de la calculadora se nota aunque los estilos de sus elementos se registran automaticamente en el archivo activity_main.xml en la sección de "Code", ahi podemos modificar las posisciones, colores, entre otros; ademaás se puede incluir otras caracteristicas.

![code](https://user-images.githubusercontent.com/49683650/106195199-d2c71200-617d-11eb-86f4-d6a6484952cb.JPG)

Luego en el archivo MainActivity.java procedemos a codificar para el funcionamiento que va a tener la calculadora, comenzamos por declarar las variables que vamos a utilizar para las funciones de los botones y también declaramos el arreglo de numeros que nos permitirá ingresar en este caso tiene un maximo de 20 numeros.

![variables](https://user-images.githubusercontent.com/49683650/106195912-d14a1980-617e-11eb-9e95-5013fc57ca20.JPG)

incluimos una imagen como un pequeño encabezado, en este caso fue realizado en canva.com

![navbar](https://user-images.githubusercontent.com/49683650/106195959-de670880-617e-11eb-919e-6e2577249146.JPG)

Realizamos el llamado a los botones de numeros que en este caso es desde el 0 al 9 con la funcion setOnClickListener, el cual nos permitirá responder a lo que oye dependiendo los métodos seleccionados.

![botones](https://user-images.githubusercontent.com/49683650/106195985-e4f58000-617e-11eb-81a5-0315f40ee339.JPG)

Luego hacemos lo mismo con los botones de operaciones 

![llamaoperaciones](https://user-images.githubusercontent.com/49683650/106196000-e7f07080-617e-11eb-8b4f-d379ec02a298.JPG)

Luego procedemos a declarar la seleccion de un numero y la acción ha realizarse como efecto en la pantalla de resultado.

![texto](https://user-images.githubusercontent.com/49683650/106196051-f76fb980-617e-11eb-9ef2-535f8e8d7658.JPG)

Los métodos para seleccionar los botones se pueden notar en la imagen donde unicamente llamamos al boton del mismo valor que pinte en el recuadro al ser seleccionado.

![seleccionarbotones](https://user-images.githubusercontent.com/49683650/106196089-02c2e500-617f-11eb-9097-500215e1c6a1.JPG)

Luego procedemos con los métodos para las operaciones que la calculadora es capaz de ejecutar.
En el caso de llevar a cabo la operacion de logaritmo natural o logaritmo en base 10 utilizamos las operaciones matematicas con "log" para logaritmo natural y "log10" para logaritmo en base 10 multiplicados por el numero seleccionado.

![logaritmo](https://user-images.githubusercontent.com/49683650/106196104-07879900-617f-11eb-8bfa-f4aa71a101ed.JPG)

Para sacar el porcentaje dividimos el resultaado para 100

![porcentaje](https://user-images.githubusercontent.com/49683650/106203253-1b37fd00-6189-11eb-9e50-35f3b30e1641.JPG)

Para sacar la raíz cuadrada usamos la operación matemática sqrt que nos proporciona ya android como función.

![raiz](https://user-images.githubusercontent.com/49683650/106203255-1b37fd00-6189-11eb-805d-88ca19442ddf.JPG)

Para sacar el seno  usamos la operación matemática sin que nos proporciona ya android como función.

![seno](https://user-images.githubusercontent.com/49683650/106203256-1bd09380-6189-11eb-907f-63a50574c486.JPG)

Para sacar el coseno  usamos la operación matemática cos que nos proporciona ya android como función.

![coseno](https://user-images.githubusercontent.com/49683650/106203251-1a9f6680-6189-11eb-9cde-5b5dd21bfd8c.JPG)

Para sacar la tangente  usamos la operación matemática tan que nos proporciona ya android como función.

![tan](https://user-images.githubusercontent.com/49683650/106203257-1bd09380-6189-11eb-9914-e22ddff8598f.JPG)

Y para las operaciones básicas usamos los arreglos con las operaciones respectivas

![igual](https://user-images.githubusercontent.com/49683650/106203860-090a8e80-618a-11eb-8635-8d4ed2fadc1d.JPG)

Generamos la APK en la sección build

![apkgenerar](https://user-images.githubusercontent.com/49683650/106205569-ac5ca300-618c-11eb-8443-9a6c6b27009d.JPG)

Ingresamos datos que se requieren y creamos contraseña.

![credenciales sdk](https://user-images.githubusercontent.com/49683650/106205570-acf53980-618c-11eb-9bca-b96c88dffaa9.JPG)

Con la contraseña ingresamos el fichero de destino

![apk2](https://user-images.githubusercontent.com/49683650/106205567-ac5ca300-618c-11eb-872a-c531e957071b.JPG)

Obtenemos la aplicación

![generada](https://user-images.githubusercontent.com/49683650/106205571-acf53980-618c-11eb-9f6d-5380cda60cb6.JPG)

Como resultado podemos ver de esta manera nos queda la interfaz gráfica de la calculadora en el celular Xiaomi Mi A2

![abrirapp](https://user-images.githubusercontent.com/49683650/106205946-53413f00-618d-11eb-8ae2-3f2286c3d8a6.jpeg)

Listo para usar

![app](https://user-images.githubusercontent.com/49683650/106205948-53d9d580-618d-11eb-9d9f-83794b1aa508.jpeg)

El ingreso de datos

![ingresodatos](https://user-images.githubusercontent.com/49683650/106205950-53d9d580-618d-11eb-8cf8-67240eef1822.jpeg)

Y el resultado de una operación en este caso el logarimo natura se nota de esta manera como podemos ver nos muestra varios decimales sin problema.

![resultado](https://user-images.githubusercontent.com/49683650/106205951-53d9d580-618d-11eb-8260-95f169b161ab.jpeg)


# **REFERENCIAS DE APOYO PARA EL DESARROLLO DE LA CALCULADORA**

El desarrollo de la calculadora fue basado en las clase impartida de la materia de tópicos especiales el 21 de enero del 2021 por el Ing. Juan Pablo Zaldumbide :man:, además se tuvo de apoyo los siguientes link encontrados en la web:

* Tópicos especiales 21 de enero 2021 by Juan Pablo Zaldumbide
https://www.youtube.com/watch?v=8SJSxvNhleI&t=7371s

* Calculadora Científica en Android Studio by Alexandre Laine
https://www.youtube.com/watch?v=Z4QWT5JjAww
