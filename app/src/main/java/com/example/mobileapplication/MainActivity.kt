package com.example.mobileapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.mobileapplication.databinding.LayoutActivityBinding

class MainActivity : AppCompatActivity() {
    private var _binding: LayoutActivityBinding? = null
    private val binding: LayoutActivityBinding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = LayoutActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(binding.fragment.id, HomeFragment(), "Fragment home")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}