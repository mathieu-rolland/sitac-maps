package com.istic.sit.sitac_maps;

import android.os.Bundle;

import com.istic.sit.framework.view.MainActivity;

public class MapsActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		initializeBackground(TypeBackgroundEnum.Map);
	}
	
}


