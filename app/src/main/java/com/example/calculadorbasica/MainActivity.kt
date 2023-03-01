package com.example.calculadorbasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.time.temporal.TemporalQueries

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun suma(view: View) {//Capturar Valores de EditText, despues converit y guardar valor a una string
        var edit_num1: EditText = findViewById(R.id.edit_num1)
        var edit_num1_str: String = edit_num1.text.toString()
        var edit_num2: EditText = findViewById(R.id.edit_num2)
        var edit_num2_str: String = edit_num2.text.toString()

       if( !edit_num1_str.isNullOrEmpty() && !edit_num2_str.isNullOrEmpty() ) { //Verificar que no este vacio
           val textView = findViewById<TextView>(R.id.txtResultado)//Get id of text view
           //Get two numbers
            var resultado : Int = 0 //Variable para guardar el resultado de la operacion
            var num1 = edit_num1_str.toInt() //Se convierte el valor de string a numero y se guarda
            var num2 = edit_num2_str.toInt()
           println("Num1 "+num1) //Se imprimen en consola para verificar
           println("Num2 "+num2)

           //Operate two numbers
           resultado = (num1 + num2);//Se hace la operacion de ambos numeros
           println("Resultado "+resultado)//Se imprime en consola el valor

           //Convert to String and show to textView
           textView.setText("Resultado = "+resultado.toString()).toString()//Se convierte el resultado a string y se escribe el valor a una textView
           var textViewValue = textView.text//Change text of textView
       }
        else {//Campo vacio
            println("null or empty!")//Se imprime en consola si esta vacio
           val text = "Campo vacio!"//Mensaje de Error
           val duration = Toast.LENGTH_SHORT
           val toast = Toast.makeText(applicationContext, text, duration)
           toast.show()//Se muestra el mensaje
        }
    }

    fun restar(view: View) {//Capturar Valores de EditText, despues converit y guardar valor a una string
        var edit_num1: EditText = findViewById(R.id.edit_num1)
        var edit_num1_str: String = edit_num1.text.toString()
        var edit_num2: EditText = findViewById(R.id.edit_num2)
        var edit_num2_str: String = edit_num2.text.toString()

        if( !edit_num1_str.isNullOrEmpty() && !edit_num2_str.isNullOrEmpty() ) { //Verificar que no este vacio
            val textView = findViewById<TextView>(R.id.txtResultado)//Get id of text view
            //Get two numbers
            var resultado : Int = 0 //Variable para guardar el resultado de la operacion
            var num1 = edit_num1_str.toInt() //Se convierte el valor de string a numero y se guarda
            var num2 = edit_num2_str.toInt()
            println("Num1 "+num1) //Se imprimen en consola para verificar
            println("Num2 "+num2)

            //Operate two numbers
            resultado = (num1 - num2);//Se hace la operacion de ambos numeros
            println("Resultado "+resultado)//Se imprime en consola el valor

            //Convert to String and show to textView
            textView.setText("Resultado = "+resultado.toString()).toString()//Se convierte el resultado a string y se escribe el valor a una textView
            var textViewValue = textView.text//Change text of textView
        }
        else {//Campo vacio
            println("null or empty!")//Se imprime en consola si esta vacio
            val text = "Campo vacio!"//Mensaje de Error
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()//Se muestra el mensaje
        }
    }

    fun mul(view: View) {//Capturar Valores de EditText, despues converit y guardar valor a una string
        var edit_num1: EditText = findViewById(R.id.edit_num1)
        var edit_num1_str: String = edit_num1.text.toString()
        var edit_num2: EditText = findViewById(R.id.edit_num2)
        var edit_num2_str: String = edit_num2.text.toString()

        if( !edit_num1_str.isNullOrEmpty() && !edit_num2_str.isNullOrEmpty() ) { //Verificar que no este vacio
            val textView = findViewById<TextView>(R.id.txtResultado)//Get id of text view
            //Get two numbers
            var resultado : Int = 0 //Variable para guardar el resultado de la operacion
            var num1 = edit_num1_str.toInt() //Se convierte el valor de string a numero y se guarda
            var num2 = edit_num2_str.toInt()
            println("Num1 "+num1) //Se imprimen en consola para verificar
            println("Num2 "+num2)

            //Operate two numbers
            resultado = (num1*num2);//Se hace la operacion de ambos numeros
            println("Resultado "+resultado)//Se imprime en consola el valor

            //Convert to String and show to textView
            textView.setText("Resultado = "+resultado.toString()).toString()//Se convierte el resultado a string y se escribe el valor a una textView
            var textViewValue = textView.text//Change text of textView
        }
        else {//Campo vacio
            println("null or empty!")//Se imprime en consola si esta vacio
            val text = "Campo vacio!"//Mensaje de Error
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()//Se muestra el mensaje
        }
    }

    fun div(view: View) {//Capturar Valores de EditText, despues converit y guardar valor a una string
        var edit_num1: EditText = findViewById(R.id.edit_num1)
        var edit_num1_str: String = edit_num1.text.toString()
        var edit_num2: EditText = findViewById(R.id.edit_num2)
        var edit_num2_str: String = edit_num2.text.toString()

        if( !edit_num1_str.isNullOrEmpty() && !edit_num2_str.isNullOrEmpty() ) { //Verificar que no este vacio
            val textView = findViewById<TextView>(R.id.txtResultado)//Get id of text view
            //Get two numbers
            var resultado : Int = 0 //Variable para guardar el resultado de la operacion
            var num1 = edit_num1_str.toInt() //Se convierte el valor de string a numero y se guarda
            var num2 = edit_num2_str.toInt()
            println("Num1 "+num1) //Se imprimen en consola para verificar
            println("Num2 "+num2)

            //Operate two numbers
            resultado = (num1 / num2);//Se hace la operacion de ambos numeros
            println("Resultado "+resultado)//Se imprime en consola el valor

            //Convert to String and show to textView
            textView.setText("Resultado = "+resultado.toString()).toString()//Se convierte el resultado a string y se escribe el valor a una textView
            var textViewValue = textView.text//Change text of textView
        }
        else {//Campo vacio
            println("null or empty!")//Se imprime en consola si esta vacio
            val text = "Campo vacio!"//Mensaje de Error
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()//Se muestra el mensaje
        }
    }

}