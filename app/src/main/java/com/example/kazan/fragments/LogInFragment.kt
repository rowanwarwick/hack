package com.example.kazan.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.kazan.interfaces.DrawerLocker
import com.example.kazan.MainActivity
import com.example.kazan.R
import com.example.kazan.callback.BackCallback
import com.example.kazan.databinding.FragmentLogInBinding
import com.example.kazan.shared_preferences.SharedPrefs

class LogInFragment : Fragment() {

    lateinit var binding: FragmentLogInBinding
    private var role: String? = null
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
            R.layout.item_role,
            requireContext().resources.getTextArray(R.array.spinner_role)
        )
        binding.something.setAdapter(adapter)
        binding.name.visibility = View.GONE
        binding.nameLayout.visibility = View.GONE
        binding.spinner.visibility = View.GONE
        logIn()
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, backCallback)
        binding.kindLogIn.setOnCheckedChangeListener { _, isChecked ->
            if (!binding.registration.isChecked) {
                binding.name.visibility = View.GONE
                binding.nameLayout.visibility = View.GONE
                binding.spinner.visibility = View.GONE
                binding.unknownPassword.visibility = View.VISIBLE
                binding.logInButton.text = "Вход"
            } else {
                binding.unknownPassword.visibility = View.GONE
                binding.name.visibility = View.VISIBLE
                binding.nameLayout.visibility = View.VISIBLE
                binding.spinner.visibility = View.VISIBLE
                binding.logInButton.text = "Регистрация"
            }
        }
        binding.something.setOnItemClickListener { parent, _, position, _ ->
            role = parent.getItemAtPosition(position) as String
        }

        binding.unknownPassword.setOnClickListener {
            Toast.makeText(requireContext(), "Я не знаю, как Вам помочь", Toast.LENGTH_SHORT).show()
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
                if (role == null) return@setOnClickListener
                SharedPrefs.setValue(requireContext(), "name", binding.name.text.toString())
                SharedPrefs.setValue(requireContext(), "mail", binding.mail.text.toString())
                SharedPrefs.setValue(requireContext(), "password", binding.password.text.toString())
                SharedPrefs.setValue(requireContext(), "role", role!!)
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