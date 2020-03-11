package com.example.calculatorku


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.calculatorku.databinding.FragmentHalamanAwalBinding

/**
 * A simple [Fragment] subclass.
 */
class HalamanAwal : Fragment() {
    private lateinit var viewModel: ViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentHalamanAwalBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_halaman_awal, container, false
        )


        viewModel = ViewModelProviders.of(this).get(ViewModel::class.java)

        binding.viewModel = viewModel
        binding.setLifecycleOwner(this)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }


}
