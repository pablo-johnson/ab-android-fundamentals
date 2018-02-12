# ab-android-fundamentals
Android Bootcamp - Android Fundamentals

## Gradle

- Android Plugin for Gradle

- Ejecutar tareas por Líneas de comando

- Crear nuestra propia tarea

- Manejo de Keys usando Gradle

### Android Plugin for Gradle 

Gradle es una herramienta de automatización de tareas y construcción de código, esta basado en Apache Maven y Apache Ant . Utiliza un lenguaje (DSL) basado en Groovy.

Gradle se usa en android como una  herramienta de compilación, que te permite manejar dependencias , construir los ejecutables (APK)

* Revisar https://developer.android.com/studio/releases/gradle-plugin.html

* Migración a Android Plugin para Gradle 3.0 https://developer.android.com/studio/build/gradle-plugin-3-0-0-migration.html

APK ( Android Aplication Package)

![img](https://developer.android.com/images/tools/studio/build-process_2x.png)

Build configuration

![img](https://developer.android.com/images/tools/studio/project-structure_2x.png)


### Gradle en Android Studio

- Tareas del Proyecto

![img](https://raw.githubusercontent.com/learning-android-pe/training-resources/master/gradle/gradle_tasks.png)

- Consola

![img](https://github.com/learning-android-pe/training-resources/blob/master/gradle/gradle_console.png?raw=true)

- Ejecutar una tarea

![img](https://github.com/learning-android-pe/training-resources/blob/master/gradle/gradle_run_task.png?raw=true)


### Ejecutar tareas por Líneas de comando

Con el comando "gradlew" puedes acceder a todas las herramientas que nos ofrece gradle para Android. Por ejemplo

- Listado de tareas disponibles :

```java
	gradlew tasks
	//mac o linux
	./gradlew tasks
	// windows
	gradlew tasks
```

Output :
```java
	> Task :tasks

	------------------------------------------------------------
	All tasks runnable from root project
	------------------------------------------------------------

	Android tasks
	-------------
	androidDependencies - Displays the Android dependencies of the project.
	signingReport - Displays the signing info for each variant.
	sourceSets - Prints out all the source sets defined in this project.

	Build tasks
	-----------
	assemble - Assembles all variants of all applications and secondary packages.
	assembleAndroidTest - Assembles all the Test applications.
	assembleDebug - Assembles all Debug builds.
	assembleRelease - Assembles all Release builds.
	build - Assembles and tests this project.
	buildDependents - Assembles and tests this project and all projects that depend on it.
	buildNeeded - Assembles and tests this project and all projects it depends on.
	clean - Deletes the build directory.
	cleanBuildCache - Deletes the build cache directory.
	compileDebugAndroidTestSources
	compileDebugSources
	compileDebugUnitTestSources
	compileReleaseSources
	compileReleaseUnitTestSources
	mockableAndroidJar - Creates a version of android.jar that's suitable for unit tests.

	Build Setup tasks
	-----------------
	init - Initializes a new Gradle build.
	wrapper - Generates Gradle wrapper files.

	Help tasks
	----------
	buildEnvironment - Displays all buildscript dependencies declared in root project 'GallerySample'.
	components - Displays the components produced by root project 'GallerySample'. [incubating]
	dependencies - Displays all dependencies declared in root project 'GallerySample'.
	dependencyInsight - Displays the insight into a specific dependency in root project 'GallerySample'.
	dependentComponents - Displays the dependent components of components in root project 'GallerySample'. [incubating]
	help - Displays a help message.
	model - Displays the configuration model of root project 'GallerySample'. [incubating]
	projects - Displays the sub-projects of root project 'GallerySample'.
	properties - Displays the properties of root project 'GallerySample'.
	tasks - Displays the tasks runnable from root project 'GallerySample' (some of the displayed tasks may belong to subprojects).

	Install tasks
	-------------
	installDebug - Installs the Debug build.
	installDebugAndroidTest - Installs the android (on device) tests for the Debug build.
	uninstallAll - Uninstall all applications.
	uninstallDebug - Uninstalls the Debug build.
	uninstallDebugAndroidTest - Uninstalls the android (on device) tests for the Debug build.
	uninstallRelease - Uninstalls the Release build.

	Verification tasks
	------------------
	check - Runs all checks.
	connectedAndroidTest - Installs and runs instrumentation tests for all flavors on connected devices.
	connectedCheck - Runs all device checks on currently connected devices.
	connectedDebugAndroidTest - Installs and runs the tests for debug on connected devices.
	deviceAndroidTest - Installs and runs instrumentation tests using all Device Providers.
	deviceCheck - Runs all device checks using Device Providers and Test Servers.
	lint - Runs lint on all variants.
	lintDebug - Runs lint on the Debug build.
	lintRelease - Runs lint on the Release build.
	lintVitalRelease - Runs lint on just the fatal issues in the release build.
	test - Run unit tests for all variants.
	testDebugUnitTest - Run unit tests for the debug build.
	testReleaseUnitTest - Run unit tests for the release build.

	To see all tasks and more detail, run gradlew tasks --all

	To see more detail about a task, run gradlew help --task <task>


	BUILD SUCCESSFUL in 8s

```

- Limpiar el proyecto

```java
	./gradlew clean
```

Output
```java
	./gradlew clean

	BUILD SUCCESSFUL in 3s
	2 actionable tasks: 2 executed

```


- Generar Apk de desarrollo
```java
	./gradlew assembleDebug
```

Output
```java
	./gradlew assembleDebug

	BUILD SUCCESSFUL in 2s
	26 actionable tasks: 1 executed, 25 up-to-date

```
* El archivo generado lo pueden encontrar en

```java
	app/build/outputs/apk/debug/app-debug.apk
```

- Listar dependencias del proyecto
```java
	./gradlew :app:dependencies
```

```java
	./gradlew :app:dependencies --configuration releaseCompileClasspath
```

Output
```
	./gradlew :app:dependencies --configuration releaseCompileClasspath

	> Task :app:dependencies

	------------------------------------------------------------
	Project :app
	------------------------------------------------------------

	releaseCompileClasspath - Resolved configuration for compilation for variant: release
	+--- org.jetbrains.kotlin:kotlin-stdlib-jre7:1.1.51
	|    \--- org.jetbrains.kotlin:kotlin-stdlib:1.1.51
	|         \--- org.jetbrains:annotations:13.0
	+--- com.android.support:appcompat-v7:26.1.0
	|    +--- com.android.support:support-annotations:26.1.0
	|    +--- com.android.support:support-v4:26.1.0
	|    |    +--- com.android.support:support-compat:26.1.0
	|    |    |    +--- com.android.support:support-annotations:26.1.0
	|    |    |    \--- android.arch.lifecycle:runtime:1.0.0
	|    |    |         +--- android.arch.lifecycle:common:1.0.0
	|    |    |         \--- android.arch.core:common:1.0.0
	|    |    +--- com.android.support:support-media-compat:26.1.0
	|    |    |    +--- com.android.support:support-annotations:26.1.0
	|    |    |    \--- com.android.support:support-compat:26.1.0 (*)
	|    |    +--- com.android.support:support-core-utils:26.1.0
	|    |    |    +--- com.android.support:support-annotations:26.1.0
	|    |    |    \--- com.android.support:support-compat:26.1.0 (*)
	|    |    +--- com.android.support:support-core-ui:26.1.0
	|    |    |    +--- com.android.support:support-annotations:26.1.0
	|    |    |    \--- com.android.support:support-compat:26.1.0 (*)
	|    |    \--- com.android.support:support-fragment:26.1.0
	|    |         +--- com.android.support:support-compat:26.1.0 (*)
	|    |         +--- com.android.support:support-core-ui:26.1.0 (*)
	|    |         \--- com.android.support:support-core-utils:26.1.0 (*)
	|    +--- com.android.support:support-vector-drawable:26.1.0
	|    |    +--- com.android.support:support-annotations:26.1.0
	|    |    \--- com.android.support:support-compat:26.1.0 (*)
	|    \--- com.android.support:animated-vector-drawable:26.1.0
	|         +--- com.android.support:support-vector-drawable:26.1.0 (*)
	|         \--- com.android.support:support-core-ui:26.1.0 (*)
	+--- com.android.support:support-v4:26.1.0 (*)
	+--- com.android.support:cardview-v7:26.1.0
	|    \--- com.android.support:support-annotations:26.1.0
	+--- com.android.support:design:26.1.0
	|    +--- com.android.support:support-v4:26.1.0 (*)
	|    +--- com.android.support:appcompat-v7:26.1.0 (*)
	|    +--- com.android.support:recyclerview-v7:26.1.0
	|    |    +--- com.android.support:support-annotations:26.1.0
	|    |    +--- com.android.support:support-compat:26.1.0 (*)
	|    |    \--- com.android.support:support-core-ui:26.1.0 (*)
	|    \--- com.android.support:transition:26.1.0
	|         +--- com.android.support:support-annotations:26.1.0
	|         \--- com.android.support:support-v4:26.1.0 (*)
	+--- com.android.support:recyclerview-v7:26.1.0 (*)
	\--- com.android.support.constraint:constraint-layout:1.0.2
	     \--- com.android.support.constraint:constraint-layout-solver:1.0.2

	(*) - dependencies omitted (listed previously)


	BUILD SUCCESSFUL in 1s
	1 actionable task: 1 executed

```

### Crear nuestra propia tarea

Nosotros podemos crear nuestras propias tareas y elegir cuando realizarlas.
Por ejemplo, digamos que queremos copiar archivos de una carpeta "MyFolder" a la carpeta "assets" de nuestro proyecto y que este se ejecute antes de compilar.

![img](https://github.com/learning-android-pe/training-resources/blob/master/gradle/gradle_custom_task.png?raw=true)

Para esto , agregamos un "task" en el archivo build.gradle que se encuentra dentro de "app"

```java
	task copyFilesToAssets(type: Copy) {
	    from 'myFolder'
	    into 'src/main/assets'
	}
```

Luego, definimos que esta tarea se ejecute "preBuild"
```java
	preBuild.dependsOn(copyFilesToAssets)
```

Finalmente, sincronizamos nuestro proyecto y verán que se realiza la tarea y los archivos fueron copias de folder al otro.


### Manejo de Keys usando Gradle

Con Gradle podemos manejar las keys de nuestra app , por ejemplo:
Creamos un archivo llamado "signing.properties" donde colocaremos algunas keys de nuestra app.

![img](https://github.com/learning-android-pe/training-resources/blob/master/gradle/gradle_properties.png?raw=true)

signing.properties
```java
	STORE_FILE=/path/to/your.keystore
	STORE_PASSWORD=yourkeystorepass
	KEY_ALIAS=projectkeyalias
	KEY_PASSWORD=keyaliaspassword
```


En el archivo build.gradle de la app , podemos escribir el siguiente script, el cual nos permite leer el archivo "signing.properties" y obtener las keys.
```java
def Properties props = new Properties()
def propFile = new File('signing.properties')
if(propFile.canRead()){
    props.load(new FileInputStream(propFile))
    println '############ properties #############'
    println 'STORE_FILE '+props['STORE_FILE']
    println 'STORE_PASSWORD '+props['STORE_PASSWORD']
    println 'KEY_ALIAS '+props['KEY_ALIAS']
    println 'KEY_PASSWORD '+props['KEY_PASSWORD']
    println '############ properties ############'
}
```

Output
```java
	...
	Executing tasks: [:app:generateDebugSources, :app:generateDebugAndroidTestSources, :app:mockableAndroidJar]

	Configuration on demand is an incubating feature.
	############ properties #############
	STORE_FILE /path/to/your.keystore
	STORE_PASSWORD yourkeystorepass
	KEY_ALIAS projectkeyalias
	KEY_PASSWORD keyaliaspassword
	############ properties ############
	:app:copyFilesToAssets UP-TO-DATE
	:app:preBuild UP-TO-DATE
	:app:preDebugBuild UP-TO-DATE
	:app:compileDebugAidl UP-TO-DATE
	...
```
### Referencias

- Gradle https://gradle.org/

- Building Android Apps https://guides.gradle.org/building-android-apps/

- Gradle books https://gradle.org/books/?_ga=2.136829173.417676176.1518442551-1176616368.1505674525

- Write you own custom tasks in Gradle https://www.oreilly.com/learning/write-your-own-custom-tasks-in-gradle

- Build Your App from the Command Line https://developer.android.com/studio/build/building-cmdline.html

- Gradle Wrapper https://docs.gradle.org/current/userguide/gradle_wrapper.html

- Gradle Plugin User Guide http://tools.android.com/tech-docs/new-build-system/user-guide

- Gradle - Custom tasks https://docs.gradle.org/current/userguide/custom_tasks.html

- Gradle Guides https://gradle.org/guides/




