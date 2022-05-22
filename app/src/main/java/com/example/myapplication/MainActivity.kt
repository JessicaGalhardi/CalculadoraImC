package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtDiagnostico= findViewById<TextView>(R.id.txtDiagnostico)


        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener{
            var edtPeso = findViewById<TextView>(R.id.edtPeso)
            var edtAltura = findViewById<TextView>(R.id.edtAltura)
            var peso = edtPeso.text.toString().toDouble()
            var altura = edtAltura.text.toString().toDouble()

            var imc= peso/ (altura*altura)

            Log.i("msg","+++peso is ${peso},altura is ${altura},O IMC é ${imc}")

            txtDiagnostico.visibility= View.VISIBLE
            txtDiagnostico.text= "O seu IMC é ${String.format("%.2f", imc)} e você está ${imcDiagnostico(imc)}"


        }

    }





}
fun imcDiagnostico (imc:Double): String{
    var ans= ""
    if (imc<18.5)
        ans = "abaixo do peso."
    else if (imc>18.5 && imc< 25){
        ans= "dentro do seu peso ideal."
    }else{
        ans= "obeso."

    }
    return ans




}


