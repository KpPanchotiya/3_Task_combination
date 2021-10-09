package com.example.a3_task_combination_assignment;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.a3_task_combination_assignment.databinding.ActivityTask2CafeLocationBinding;

public class Task2_CafeLocation extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityTask2CafeLocationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTask2CafeLocationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng gujarat = new LatLng(22.309425, 72.136230);
        mMap.addMarker(new MarkerOptions().position(gujarat).title("Main Branch KP'S Cafe").icon(BitmapDescriptorFactory.fromResource(R.drawable.main_cafe)));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(gujarat,5));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(gujarat));

        LatLng mumbai = new LatLng(19.0551,72.9139);
        MarkerOptions markerOptions =new MarkerOptions().position(mumbai).title("KP'S Cafe").icon(BitmapDescriptorFactory.fromResource(R.drawable.cafe1));
        mMap.addMarker(markerOptions);

        LatLng kolkata = new LatLng(22.5726,88.3639);
        MarkerOptions markerOptions1 =new MarkerOptions().position(kolkata).title("KP'S Restaurants").icon(BitmapDescriptorFactory.fromResource(R.drawable.cafe2));
        mMap.addMarker(markerOptions1);

        LatLng delhi = new LatLng(28.38,77.12);
        MarkerOptions markerOptions2 =new MarkerOptions().position(delhi).title("KP'S cold drinks").icon(BitmapDescriptorFactory.fromResource(R.drawable.cafe3));
        mMap.addMarker(markerOptions2);}
}