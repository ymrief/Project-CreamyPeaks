package com.example.creamy_peaks.ui.botnavdest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.creamy_peaks.R
import com.example.creamy_peaks.data.ProductsResponse
import com.example.creamy_peaks.databinding.FragmentHomeBinding
import com.example.creamy_peaks.ui.adapter.ProductAdapter

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    val listProduct = mutableListOf<ProductsResponse>(
        ProductsResponse(
            R.drawable.ice_cream_1,
            "Ice Cream 1"
        ),
        ProductsResponse(
            R.drawable.ice_cream_2,
            "Ice Cream 2"
        ),
        ProductsResponse(
            R.drawable.ice_cream_3,
            "Ice Cream 3"
        ),
        ProductsResponse(
            R.drawable.ice_cream_4,
            "Ice Cream 4"
        ),
        ProductsResponse(
            R.drawable.ice_cream_5,
            "Ice Cream 5"
        ),
        ProductsResponse(
            R.drawable.ice_cream_6,
            "Ice Cream 6"
        ),
        ProductsResponse(
            R.drawable.ice_cream_7,
            "Ice Cream 7"
        ),
        ProductsResponse(
            R.drawable.ice_cream_8,
            "Ice Cream 8"
        ),
        ProductsResponse(
            R.drawable.ice_cream_9,
            "Ice Cream 9"
        ),
        ProductsResponse(
            R.drawable.ice_cream_10,
            "Ice Cream 10"
        )
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            rvListProduct.layoutManager = GridLayoutManager(rvListProduct.context, 2)
            rvListProduct.setHasFixedSize(true)

            val adapter = ProductAdapter()
            adapter.isiList(listProduct)
            rvListProduct.adapter = adapter
        }
    }
}