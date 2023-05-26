package com.example.kazan.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.kazan.interfaces.DrawerLocker
import com.example.kazan.MainActivity
import com.example.kazan.R
import com.example.kazan.callback.BackCallback
import com.example.kazan.databinding.FragmentLogInBinding
import com.example.kazan.shared_preferences.SharedPrefs

class LogInFragment : Fragment() {

    lateinit var binding: FragmentLogInBinding
    private val backCallback: BackCallback by lazy { BackCallback(requireActivity()) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLogInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.spinner_layout,
            requireContext().resources.getTextArray(R.array.spinner_role)
        )
        binding.spinner.adapter = adapter
        logIn()
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, backCallback)
        binding.kindLogIn.setOnCheckedChangeListener { _, isChecked ->
            if (!binding.registration.isChecked) {
                binding.secName.visibility = View.GONE
                binding.spinner.visibility = View.GONE
                binding.logInButton.text = "Вход"
            } else {
                binding.secName.visibility = View.VISIBLE
                binding.spinner.visibility = View.VISIBLE
                binding.logInButton.text = "Регистрация"
            }
        }
    }

    override fun onStart() {
        super.onStart()
        (activity as DrawerLocker).setDrawerLocker(true)
    }

    override fun onStop() {
        super.onStop()
        (activity as DrawerLocker).setDrawerLocker(false)
    }

    private fun logIn() {
        binding.logInButton.setOnClickListener {
            if (binding.registration.isChecked) {
                SharedPrefs.setValue(requireContext(), "name", binding.secName.text.toString())
                SharedPrefs.setValue(requireContext(), "mail", binding.mail.text.toString())
                SharedPrefs.setValue(requireContext(), "password", binding.password.text.toString())
                SharedPrefs.setValue(
                    requireContext(),
                    "role",
                    requireActivity().resources.getTextArray(R.array.spinner_role)[binding.spinner.selectedItemPosition].toString()
                )
            } else {
                when (binding.password.text.toString()) {
                    "investor" -> {
                        SharedPrefs.setValue(requireContext(), "name", "Important")
                        SharedPrefs.setValue(requireContext(), "mail", "school21@mail.ru")
                        SharedPrefs.setValue(requireContext(), "password", "1234")
                        SharedPrefs.setValue(requireContext(), "role", "Инвестор")
                    }
                    "startup" -> {
                        SharedPrefs.setValue(requireContext(), "name", "Important")
                        SharedPrefs.setValue(requireContext(), "mail", "school21@mail.ru")
                        SharedPrefs.setValue(requireContext(), "password", "1234")
                        SharedPrefs.setValue(requireContext(), "role", "Стартапер")
                    }
                    "specialist" -> {
                        SharedPrefs.setValue(requireContext(), "name", "Important")
                        SharedPrefs.setValue(requireContext(), "mail", "school21@mail.ru")
                        SharedPrefs.setValue(requireContext(), "password", "1234")
                        SharedPrefs.setValue(requireContext(), "role", "Специалист")
                    }
                    else -> return@setOnClickListener
                }
            }
            (activity as MainActivity).navController.navigate(R.id.action_logInFragment_to_mainFragment)
        }
    }
}