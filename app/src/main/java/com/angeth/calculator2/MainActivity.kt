package com.angeth.calculator2

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

lateinit var binding:ActivityMainBinding

//    lateinit var tilNum1:TextInputLayout
//    lateinit var tilNum2:TextInputLayout
//    lateinit var etNum1:TextInputLayout
//    lateinit var etNum2:TextInputLayout
//    lateinit var
//    lateinit var tvresult:TextView

}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
    }

    override fun onResume() {
        super.onResume()
        add()
        substract()

        binding.btnAdd.setOnClicklistener { add }
        binding.btnsubstract.setOnClicklistener { substract }
        binding.btnMultiply.setOnClicklistener { multiply }
        binding.btnModulus.setOnClicklistener { modulus }
    }

//    fun castViews(){
        tilNum1=findViewById(R.id.tilFirstNumber)
        tilNum2=findViewById(R.id.tilFirstNumber)
        etNum1=findViewById(R.id.tilFirstNumber)
        etNum2=findViewById(R.id.tilFirstNumber)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubstract=findViewById(R.id.btnSubstract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        tvresult=findViewById(R.id.tvresult)


//    }
    fun validate():values?{
//        to remove error message
        tilNum1.error=null
        tilNum2.error=null
        val num1=etNum1.text.toString()
        val num2=etNum2.text.toString()
        var error=false
        if(num1.isBlank()){
            binding.tilNum1.error="num 1 is required"
            error=true
        }
        if (num2.isBlank()){
            tilNum2.error="num 2 required"
            error=true
        }
        if (!error){
            return values(num1=num1.toInt(),num2=num2.toInt)
        }
        return null
    }
    fun add(values:Values){
        if(values!=null) {
            var sum = values.num1 + values.num2
            binding.tvresult.text = sum.toString()
        }
        fun substract(values:Values){
            if(values!=null){
                var difference=values.num1+values.num2
                binding.tvresult.text=difference.toString()
            }
            fun multiply(values:Values){
                if(values!=null){
                    var product=values.num1+values.num2
                        binding.tvresult.text=product.toString()
                }
                fun modulus(values:Values){
                    if(values!=null){
                        var remainder=values.num1+values.num2
                        binding.tvresult.text=remainder.toString()
                    }
    }
    fun add(){
        val num1=etNum1.text.toString()
        val num2=etNum2.text.toString()
        var error=false
        if(num1.isBlank()){
            binding.tilNum1.error="num 1 is required"
            error=true
        }
        if (num2.isBlank()){
            binding.tilNum2.error="num 2 required"
            error=true
        }
        if (!error){
            var sum=num1.toInt()+num2.toInt()
            var result.setText(sum.toString())
        }
    }
    fun substract(){

        if (!error){
            var difference=num1.toInt()-num2.toInt()
            var result.setText(difference.toString())
        }

    }
}
fun modulus() {
    val num1 = etNum1.text.toString()
    val num2 = etNum2.text.toString()
    var error = false
    if (num1.isBlank()) {
        binding.tilNum1.error = "num 1 is required"
        error = true
    }
    if (num2.isBlank()) {
        binding.tilNum2.error = "num 2 required"
        error = true
    }
    if (!kotlin.error){
        var remainder=num1.toInt()-num2.toInt()
        var result.setText(difference.toString())
    }
    "+"->firstNum+secondNum
    "-"->firstNum-secondNum
    "*"->firstNum*secondNum
    "%"->firstNum%secondNum
}
fun multiply() {
    val num1 = etNum1.text.toString()
    val num2 = etNum2.text.toString()
    var error = false
    if (num1.isBlank()) {
        binding.tilNum1.error = "num 1 is required"
        error = true
    }
    if (num2.isBlank()) {
        binding.tilNum2.error = "num 2 required"
        error = true
    }
    if (!kotlin.error){
        var product=num1.toInt()-num2.toInt()
        var product.setText(product.toString())
    }
}
data class Values(var num1:Int,var num2=Int)


