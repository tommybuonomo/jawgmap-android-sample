package com.tbuonomo.jawgmapsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;

public class MainActivity extends AppCompatActivity {

  private MapView mapView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Mapbox.getInstance(this, BuildConfig.MAP_BOX_TOKEN);
    setContentView(R.layout.activity_main);
    mapView = findViewById(R.id.mapView);
    mapView.setStyleUrl("https://tile.jawg.io/jawg-streets.json?access-token=" + BuildConfig.JAWG_API_KEY);
    mapView.onCreate(savedInstanceState);
  }

  @Override public void onStart() {
    super.onStart();
    mapView.onStart();
  }

  @Override public void onResume() {
    super.onResume();
    mapView.onResume();
  }

  @Override public void onPause() {
    super.onPause();
    mapView.onPause();
  }

  @Override public void onStop() {
    super.onStop();
    mapView.onStop();
  }

  @Override public void onLowMemory() {
    super.onLowMemory();
    mapView.onLowMemory();
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    mapView.onDestroy();
  }

  @Override protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    mapView.onSaveInstanceState(outState);
  }
}
