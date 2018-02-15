# ab-android-fundamentals
Android Bootcamp - Android Fundamentals

### User Interface (4h)

  - Layout y Widgets
  - User Events

### Overview

  - Estructura de un elemento XML :
  
```
    <?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools" android:layout_width="match_parent"
        android:layout_height="match_parent" android:paddingLeft="@dimen/activity_horizontal_margin"
        android:paddingRight="@dimen/activity_horizontal_margin"
        android:paddingTop="@dimen/activity_vertical_margin"
        android:paddingBottom="@dimen/activity_vertical_margin">
    
        <TextView android:text="Hello World!" android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
    </RelativeLayout>
```

  - ID :
  
```
      android:id="@+id/img"
```

```
      <TextView
            android:id="@+id/txtImg"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Medium Text"
            android:textAppearance="?android:attr/textAppearanceMedium" />
```
    
  - Atributos :
    
```
        android:layout_width="300dp"
```
    
  - En el código podemos invocar a los elementos XML de la siguiente manera :
  
```
      @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
      }
```
    
```
     private ImageView img;
     private Button btnImg;
     private TextView txtImg;

     img= (ImageView)findViewById(R.id.img);
     btnImg= (Button)findViewById(R.id.butImg);
     txtImg = (TextView)findViewById(R.id.txtImg);
```

### Layouts

<img src="https://github.com/learning-android-pe/training-resources/blob/master/ui/layoutparams.png?raw=true" height="320" />

- LinearLayout

<img src="https://github.com/learning-android-pe/training-resources/blob/master/ui/linearlayout.png?raw=true" height="300"/>

Horizontal / Vertical

<img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-linear-horizontal.png?raw=true" height="360"/>  <img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-linear-vertical.png?raw=true" height="360"/>

Pesos

<img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-linear-weight-horizontal.png?raw=true" height="360" />  <img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layou-linear-weight-vertical.png?raw=true" height="360" />

- RelativeLayout

<img src="https://github.com/learning-android-pe/training-resources/blob/master/ui/relativelayout.png?raw=true" height="300" />

- ConstraintLayout

<img src="https://github.com/learning-android-pe/training-resources/blob/master/ui/constraint-fail_2x.png?raw=true" height="300" /> <img src="https://github.com/learning-android-pe/training-resources/blob/master/ui/constraint-fail-fixed_2x.png?raw=true" height="300" />

- ListView & GridView

<img src="https://developer.android.com/images/ui/listview.png?hl=es-419" height="300"/> <img src="https://developer.android.com/images/ui/gridview.png?hl=es-419" height="300"/>

### Layout resources 

- Box Model 

![img](http://porterwebsites.com/wp-content/uploads/2016/10/boxmodel-image.png)

- Margin / Padding

<img src="https://github.com/learning-android-pe/training-resources/blob/master/ui/box-margin.png?raw=true" height="320" />   <img src="https://github.com/learning-android-pe/training-resources/blob/master/ui/box-padding.png?raw=true" height="320"/>

- Hexadecimal colors

Podemos usar este web para buscar colores en hexadecimal
http://www.color-hex.com/

Android utiliza los colores en formato Hexadecimal , por ejemplo este valor representa el color 'negro'

```java
    #000000
```
Para manejar la transparencia, agregamos uno de estos valores adelante del color. Por ejemplo, si queremos un color 'negro' con 70% de transparencia :

```java
    #B3000000
```

En esta tabla están todos los valores de 0-100 para la transparencia de colores

```java

    100% — FF
    95% — F2
    90% — E6
    85% — D9
    80% — CC
    75% — BF
    70% — B3
    65% — A6
    60% — 99
    55% — 8C
    50% — 80
    45% — 73
    40% — 66
    35% — 59
    30% — 4D
    25% — 40
    20% — 33
    15% — 26
    10% — 1A
    5% — 0D
    0% — 00

```

- Shapes 
Estos componentes te permiten dibujar formas , sin necesidad de usar recursos de diseño (imágenes) , puedes realizar cuadrados, círculos y elementos con bordes redondeados.

Por ejemplo, si requerimos crear un rectángulo con un color sólido de fondo :
```java
    <?xml version="1.0" encoding="utf-8"?>
    <shape xmlns:android="http://schemas.android.com/apk/res/android" 
    android:shape="rectangle" >

    <solid android:color="#58A023" />
    </shape>
```

Ahora, si necesitamos agregarle bordes redondeandos

```java
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <solid android:color="@color/blueskye"></solid>
    <corners android:radius="10dp"></corners>

</shape>
```


### Exercises

- Ejercicio 1 - 2

<img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-login.png?raw=true" height="360"/> <img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-pinterest.png?raw=true" height="360"/>

- Ejercicio 3 - 4 

<img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-login-vine.png?raw=true" height="360" /> <img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout_tumblr.png?raw=true" height="360"/>

- Ejercicio 5 - 6

<img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-home-flipboard.png?raw=true" height="360" /> <img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-home-vine.png?raw=true"  height="360" />

- Ejercicio 7 - 8

<img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-home-daily.png?raw=true"  height="360" /> <img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-home-dropbox.png?raw=true"  height="360" />

- Ejercicio 9 - 10

<img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-home-explore.png?raw=true"  height="360" /> <img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-home-nwply.png?raw=true"  height="360" />

- Ejercicio 11 -12 

<img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-home-pinterest.png?raw=true"  height="360" /> <img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/layout-home-runkeeper.png?raw=true"  height="360" />

- Ejercicio 12

<img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/exercice-login.png?raw=true"  height="360" />

- Ejercicio 13

<img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/exercise-login-2.jpg?raw=true"  height="360" />

- Ejercicio 14

<img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/exercise-login-3.jpg?raw=true"  height="360" />

- Ejercicio 15

<img src="https://github.com/learning-android-pe/training-resources/blob/master/samples/ui/exercice-weight.png?raw=true" height="360" />

## Referencias

- Layouts https://developer.android.com/guide/topics/ui/declaring-layout.html

- User Interface https://developer.android.com/guide/topics/ui/index.html

- Layout Editor https://developer.android.com/studio/write/layout-editor.html

- LinearLayout https://developer.android.com/guide/topics/ui/layout/linear.html

- RelativeLayout https://developer.android.com/guide/topics/ui/layout/relative.html

- ConstraintLayout https://developer.android.com/training/constraint-layout/index.html

- Recursos de diseño https://www.uplabs.com/

- Iconos https://www.iconfinder.com/

- Drawable Resources https://developer.android.com/guide/topics/resources/drawable-resource.html

