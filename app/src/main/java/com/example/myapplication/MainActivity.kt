package com.example.myapplication

import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.style.AbsoluteSizeSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

/*
 * La clase MainActivity hereda de ComponentActivity, que es
 * la clase base para actividades en Android. La actividad es
 * la unidad de ejecución más pequeña en Android y es responsable
 *  de manejar la interfaz de usuario y la lógica de negocio.
 */
class MainActivity : ComponentActivity() {
    /*
     * EL método onCreate es el punto de entrada cuando
     * la actividad es creada.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        /*
         * se llama al método onCreate de la superclase para
         * realizar la configuración estándar.
         */
        super.onCreate(savedInstanceState)
        /*
         * Permite que la interfaz ocupe toda la pantalla,
         * ocultando las barras de sistema (estado y navegación).
         */
        enableEdgeToEdge()
        /*
         * Define el contenido de la actividad utilizando una
         * función lambda que configura la UI usando Jetpack Compose.
         */
        setContent {
            //Aplica el tema de la aplicación
            MyApplicationTheme {
                /*
                 * Scaffold es un componente composable que proporciona una
                 * estructura de diseño de alto nivel para organizar y
                 * gestionar la interfaz de usuario.
                 */
                Scaffold { innerPadding ->
                    Box(
                        /*
                         * Un objeto Modifier es una función que se encarga de
                         * personalizar la apariencia y el comportamiento de un
                         * elemento compuesto (composable).
                         */
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .background(Color.White)
                    ) {
                        Column(
                            modifier = Modifier.align(Alignment.Center)
                        ) {
                            text("SENA", 48)
                            text("Análisis y Desarrollo de Software (2758333)", 36)
                            text("Evidencia: GA8-220501096-AA2-EV01", 36)
                            text("Estudiante: LUIS MIGUEL RODRÍGUEZ VARGAS", 36)
                            text("Instructor: FERNANDO FORERO GOMEZ", 36)
                        }
                    }
                }
            }
        }
    }

}

@Composable
private fun text(text: String, textSize: Int) = Text(
    text = text,
    fontSize = textSize.sp
)

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}