package com.example.sarapavas.santaelena;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.FragmentPagerAdapter;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;


/**
 * A simple {@link Fragment} subclass.
 */
public class Turismo1Fragment extends Fragment {
    MapView mapView;
    GoogleMap map;

    public Turismo1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_turismo1, container, false);

        mapView = (MapView)v.findViewById(R.id.mapbares3);

            mapView.onCreate(savedInstanceState);

            map = mapView.getMap();
            map.getUiSettings().setMyLocationButtonEnabled(false);
            map.setMyLocationEnabled(true);

            MapsInitializer.initialize(this.getActivity());
            LatLng magica = new LatLng(6.2102379, -75.4990367);
            CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(magica, 16);
            map.addMarker(new MarkerOptions().position(magica).title("Aventuras").snippet("Sitios Turisticos"));
            map.animateCamera(cameraUpdate);

        return v;
    }

    @Override
    public void onResume() {
        mapView.onResume();
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }


}
