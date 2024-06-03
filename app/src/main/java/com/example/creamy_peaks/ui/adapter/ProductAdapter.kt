package com.example.creamy_peaks.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.creamy_peaks.data.ProductsResponse
import com.example.creamy_peaks.databinding.GridItemBinding

class ProductAdapter: RecyclerView.Adapter<ProductAdapter.CustomViewHolder>() {

    inner class CustomViewHolder(private val binding: GridItemBinding)
        : RecyclerView.ViewHolder(binding.root) {

        fun bindData(item: ProductsResponse) {
            with (binding) {
                tvProductName.text = item.productName
                ivProduct.setImageResource(item.productImage)
            }
        }
    }

    private var daftarProduct = mutableListOf<ProductsResponse>()

    fun isiList(list: MutableList<ProductsResponse>) {
        daftarProduct.clear()
        daftarProduct.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(GridItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun getItemCount(): Int {
        return daftarProduct.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindData(daftarProduct[position])
    }
}