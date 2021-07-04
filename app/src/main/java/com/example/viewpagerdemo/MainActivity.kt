package com.example.viewpagerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerdemo.databinding.ActivityMainBinding
import com.example.viewpagerdemo.databinding.SingleItemViewBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val images = listOf(R.drawable.t1,
            R.drawable.t2,
            R.drawable.t3,
            R.drawable.t4,
            R.drawable.t5)

            val adapter = ViewPagerAdapter(images)
            binding.apply {
                viewPager.adapter = adapter

                //change orientation to vertical (by default it's horizontal)
               //viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
            }
    }
}