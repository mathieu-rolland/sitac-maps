package com.istic.sit.sitac_maps;

import android.os.Bundle;

import com.istic.sit.framework.api.model.IEntity;
import com.istic.sit.framework.model.Entity;
import com.istic.sit.framework.view.MapsActivity;

public class MainActivity extends MapsActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		
		
		testAddMarker();
	}

}
