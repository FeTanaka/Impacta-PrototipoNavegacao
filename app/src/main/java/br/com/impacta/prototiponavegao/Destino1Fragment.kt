package br.com.impacta.prototiponavegao

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.com.impacta.prototiponavegao.databinding.FragmentDestino1Binding


class Destino1Fragment : Fragment() {

    private var _binding: FragmentDestino1Binding? = null
    private val binding: FragmentDestino1Binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater
        , container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDestino1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_destino1Fragment_to_destino2Fragment)
        }
    }
}