package com.adilegungor.recyclerviewex_1

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

import com.adilegungor.recyclerviewex_1.databinding.CarItemBinding

class CarAdapter(private val mContext: Context, private val carList: List<Car>) :
    RecyclerView.Adapter<CarAdapter.CarsViewHolder>() {

    inner class CarsViewHolder(val binding: CarItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {
        val binding = CarItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    @SuppressLint("DiscouragedApi", "SetTextI18n")
    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        val car = carList[position]
        val binding = holder.binding
        binding.cardName.text = car.name
        binding.cardPrice.text = "${car.price} $"
        val imageId = mContext.resources.getIdentifier(car.image, "drawable", mContext.packageName)
        binding.cardImage.setImageResource(imageId)

        binding.cardBuyButton.setOnClickListener {
            Toast.makeText(mContext, "${car.name} purchased", Toast.LENGTH_SHORT).show()
        }
    }
}