package com.example.fragmentkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragmentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setTitle("Fragment Kotlin")

        binding.fragment1Btn.setOnClickListener {

            val fragmentManager = supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, Fragment1::class.java, null)
                .commit()

        }

        binding.fragment2Btn.setOnClickListener {


            replaceFragment(Fragment2())
        }

    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()

    }
}