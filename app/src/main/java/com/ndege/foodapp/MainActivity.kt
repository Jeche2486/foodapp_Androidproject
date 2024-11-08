package com.ndege.foodapp

import android.os.Bundle
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        fetch your recyclerview by id
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

//        define the layout manager
//        the layout manager sets the recycler views appear in vertical format
        val layoutmanager = LinearLayoutManager(applicationContext)

//        put the layout manager inside the recycler to make items appear vertical
        recyclerView.layoutManager = layoutmanager

//        get an instance of the recycler adapter
//        the recycler adapter contains all the arrays
//        the arrays include images, titles, descriptions and cost
        val adapter = RecyclerAdapter(applicationContext)

//        load the data to the recycler view
        recyclerView.adapter = adapter

//        find the bottomsheet by id
        val botomsheet = findViewById<FrameLayout>(R.id.bottomsheet)

        BottomSheetBehavior.from(botomsheet).apply {
            peekHeight = 350
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }


    }
}