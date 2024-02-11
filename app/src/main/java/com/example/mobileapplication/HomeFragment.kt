package com.example.mobileapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import com.example.mobileapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Toast.makeText(context, "Home", Toast.LENGTH_SHORT).show()
        binding.userBtn.setOnClickListener {
            parentFragmentManager.commit {
                replace(
                    R.id.fragment,
                    UserFragment::class.java,
                    bundleOf("text" to "User", "id" to 12),
                    "Fragment User"
                )
                addToBackStack(null)
            }
        }
    }

}