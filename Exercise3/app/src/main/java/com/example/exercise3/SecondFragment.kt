package com.example.exercise3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exercise3.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = listOf(
            ReasonsList(R.string.reason1),
            ReasonsList(R.string.reason2),
            ReasonsList(R.string.reason3),
            ReasonsList(R.string.reason4),
            ReasonsList(R.string.reason5),
            ReasonsList(R.string.reason6),
            ReasonsList(R.string.reason7),
            ReasonsList(R.string.reason8),
            ReasonsList(R.string.reason9),
            ReasonsList(R.string.reason10),
        )
        binding.reasonsList.layoutManager = LinearLayoutManager(context)
        binding.reasonsList.adapter = ReasonsAdapter(list)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}