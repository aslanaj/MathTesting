package com.example.mathtesting


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mathtesting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding){
            btnAdd.setOnClickListener {
                tvResult.text = Math().add(etFirst.text.toString(),etSecond.text.toString())
            }
            btnDivide.setOnClickListener {
                tvResult.text = Math().divide(etFirst.text.toString(),etSecond.text.toString())
            }
        }
    }
}