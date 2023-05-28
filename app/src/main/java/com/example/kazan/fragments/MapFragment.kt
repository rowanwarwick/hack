package com.example.kazan.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kazan.R
import com.example.kazan.databinding.FragmentMapBinding
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKit
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.runtime.image.ImageProvider

class MapFragment : Fragment() {

    lateinit var binding: FragmentMapBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        MapKitFactory.setApiKey("285dc553-610c-46b0-8afa-9a3a93bd91b1")
        MapKitFactory.initialize(requireContext())
        binding = FragmentMapBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.map.map.move(CameraPosition(Point(55.785, 49.1178), 11.0f, 0.0f, 0.0f),
        Animation(Animation.Type.SMOOTH, 4f), null)
        val mapKit = MapKitFactory.getInstance()
        val yourLocation = mapKit.createUserLocationLayer(binding.map.mapWindow)
        yourLocation.isVisible = true
        binding.map.map.mapObjects.addPlacemark(Point(55.785, 49.1178), ImageProvider.fromResource(requireContext(), R.drawable.location))
    }

    override fun onStop() {
        binding.map.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onStart() {
        binding.map.onStart()
        MapKitFactory.getInstance().onStart()
        super.onStart()
    }

}