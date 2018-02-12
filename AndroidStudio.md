# ab-android-fundamentals
Android Bootcamp - Android Fundamentals

## Android Studio

- Android

- Entorno de Desarrollo (Android Studio)

- Ejercicios

- Construir nuestra  App en Android

### Android

  * Revisar https://developer.android.com/guide/index.html

- Versiones 

  https://developer.android.com/about/dashboards/index.html

- Densidades

  * Revisar https://developer.android.com/guide/practices/screens_support.html

  ![img](https://developer.android.com/images/screens_support/screens-ranges.png)

  ![img](https://developer.android.com/images/screens_support/screens-densities.png)

  Android Fragmentation *2015* https://opensignal.com/reports/2015/08/android-fragmentation/

- Arquitectura

  ![img](https://developer.android.com/guide/platform/images/android-stack_2x.png)

- Componentes 

	- Activities, se pueden considerar como las pantallas de una aplicación pero realmente son controladores( que manejan) de nuestras vistas. Es el único componente en Android que dispone de interacción directa con la UI.

	- Services , te permiten ejecutar tareas en segundo plano, asi la aplicación este cerrada.

	- Broadcast receivers , te permite escuchar acciones que suceden en el device como el estado de la bateria, conexión a internet, etc etc.

	- Content providers , son proveedores de contenido y te permite proveedor información (Base de datos) a múltiples applicaciones.


### Conociendo el Entorno del Trabajo

  ![img](https://developer.android.com/studio/images/intro/main-window_2-2_2x.png)

- Estructura del proyecto

  ![img](https://developer.android.com/studio/images/intro/project-android-view_2-1_2x.png)

- Construir nuestro primer proyecto en Android
  
  Revisar https://developer.android.com/studio/projects/create-project.html

  ![img](https://developer.android.com/studio/images/projects/new-project-wizard-configure_2x.png)


- Usar un template para nuestros proyectos

- Conociendo la carpeta "JAVA"

	- Crear un clase Java
	- Crear un activity

  ![img](https://developer.android.com/studio/images/cnc-createclass_2-2_2x.png)


- Conociendo la carpeta "res"

	- Agregar  recursos , layouts, colors, strings
	- Agregar imágenes

  ![img](https://developer.android.com/studio/images/write/new-resource-dir_2-2_2x.png)

### Ejercicios

- Ejercicio I : Dibujar la siguiente interface y programar para que cuando toques el botón muestre un texto prefefinido.

![img](https://github.com/learning-android-pe/training-resources/blob/master/samples/basic/AndroidStudio-E1.jpg?raw=true)

En este ejercicio veremos como usar los elementos del folder values
```java
		res/value
			- colors.xml
			- strings.xml
			- styles.xml
```
Usaremos la actividad llamada TextActivity


- Ejercicio II : Dibujar la siguiente interface y programar para que cuando toques el boton carge una imagen predefinida.
![img](https://github.com/learning-android-pe/training-resources/blob/master/samples/basic/AndroidStudio-E2.jpg?raw=true)

En este ejercicio veremos como usar los folder para imágenes y logos
```java
		res/value
			- drawable/
			- mipmap/
```
Usaremos la actividad llamada ImageActivity

- Ejercicio III : Dibujar la siguiente interface y programar para que cuando toques el boton muestre el texto ingresado por el usuario.
![img](https://github.com/learning-android-pe/training-resources/blob/master/samples/basic/AndroidStudio-E3.jpg?raw=true)

En este ejercicio veremos como usar capturar los valores ingresados por el usuario en una caja de texto llamada 'EditText'

### Construir nuestra App en Android

- Diseñando nuestras interfaces

	- Crear una interfaz de usuario (UI)

  ![img](https://developer.android.com/studio/images/write/layout-editor-callouts_2x.png)

  Vamos a crear 2 activities :

![img](https://github.com/learning-android-pe/training-resources/blob/master/samples/basic/AndroidStudio-E4-1.jpg?raw=true) ![img](https://github.com/learning-android-pe/training-resources/blob/master/samples/basic/AndroidStudio-E4-2.jpg?raw=true)

  - WriteMessageActivity
  - MessageActivity

- Agregar acciones a la UI

	Para agregar una acción a botón, escribimos lo siguiente:

```java
	button.setOnClickListener(new View.OnClickListener() {
	            @Override
	            public void onClick(View view) {
	                //action
	            }
	        });
```

	Para capturar lo que usuario escribe , en un EditText

```java
	String userMessage= editText.getText().toString().trim();
```

	Para mostrar un mensaje en la pantalla o la consola

```java

	 private void showMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        Log.v("CONSOLE",message);
    }
```

- Navegar entre pantallas

  Usamos el siguiente método para navegar desde WriteMessageActity a 
  MessageActivity y enviámos el mensaje ingresado por el usuario.

```java
   private void goToBundleMessageActivity(String message){

        Bundle bundle= new Bundle();
        bundle.putString("MESSAGE",message);
        Intent intent= new Intent(this,MessageActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
```

- Ejecutar nuestra App

  Run/ Run 'app'

Si ya conoces esta parte, te recomiendo seguir el training oficial de Android en este link https://developer.android.com/training/index.html

### Referencias

- Android Studio https://developer.android.com/studio/index.html?hl=es-419

- Android Studio Features https://developer.android.com/studio/features.html

- Android Studio User Guide https://developer.android.com/studio/intro/index.html

- Genymotion https://www.genymotion.com/

- Genymotion basic steps https://docs.genymotion.com/Content/01_Get_Started/Basic_steps.html

- Android Emulator https://developer.android.com/studio/run/emulator.html

- Run Apps on a hardware device https://developer.android.com/studio/run/device.html

- Build Your First Android App in Java https://codelabs.developers.google.com/codelabs/build-your-first-android-app/index.html?index=..%2F..%2Findex

- Build Your First Android App in Kotlin https://codelabs.developers.google.com/codelabs/build-your-first-android-app-kotlin/index.html?index=..%2F..%2Findex

- Android Resizer https://github.com/asystat/Final-Android-Resizer




