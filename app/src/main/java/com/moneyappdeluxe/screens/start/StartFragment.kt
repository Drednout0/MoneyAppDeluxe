package com.moneyappdeluxe.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Transformations.map
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.moneyappdeluxe.R
import kotlinx.android.synthetic.main.fragment_start.view.*
import java.util.Collections.list


class StartFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: StartAdapter
    private val viewModel = ViewModelProvider(this)[StartViewModel::class.java]


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflate = inflater.inflate(R.layout.fragment_start, container, false)
        recyclerView  = inflate.rv_start
        adapter  = StartAdapter()
        recyclerView.adapter = adapter
        viewModel.getNalMoney()
        viewModel.moneyList.observe(viewLifecycleOwner, { list ->
            list.body()?.let { adapter.setList(list(it)) }
        })
        return inflate
    }
}