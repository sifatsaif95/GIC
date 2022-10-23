package com.greenwichislamiccenter.gic.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.greenwichislamiccenter.gic.databinding.FragmentContactUsBinding
import com.greenwichislamiccenter.gic.databinding.FragmentVolunteeringBinding

class VolunteeringFragment: Fragment() {

    private lateinit var binding: FragmentVolunteeringBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentVolunteeringBinding.inflate(inflater, container, false).apply {
        binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}