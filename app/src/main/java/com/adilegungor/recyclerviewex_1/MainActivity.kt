package com.adilegungor.recyclerviewex_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.adilegungor.recyclerviewex_1.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var carAdapter: CarAdapter
    private lateinit var carList: ArrayList<Car>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager =
            StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL)
        addData()
    }

    private fun addData() {
        val car1 = Car(1, " Hudson Hornet. Q7", 100.000, "c_1")
        val car2 = Car(2, " Porsche 911 Carrera.", 200.000, "c_2")
        val car3 = Car(3, "Dacia Logan", 50.000, "c_3")
        val car4 = Car(4, "Ford Model T ", 310.000, "c4")
        val car5 = Car(5, "Willys Jeep MB.", 400.000, "c5")
        val car6 = Car(6, "Fiat 500", 200.000, "c6")
        val car7 = Car(7, "Mack Superliner", 99.000, "c7")
        val car8 = Car(8, "Chevrolet 3800 Task Force", 450.000, "c8")
        val car9 = Car(9, "Volkswagen", 250.000, "c9")

        carList = ArrayList<Car>()
        carList.add(car1)
        carList.add(car2)
        carList.add(car3)
        carList.add(car4)
        carList.add(car5)
        carList.add(car6)
        carList.add(car7)
        carList.add(car8)
        carList.add(car9)

        carAdapter = CarAdapter(this, carList)
        binding.rv.adapter = carAdapter
    }
}