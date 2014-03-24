package com.istic.sit.sitac_maps;

import android.os.Bundle;
import android.view.Menu;

import com.istic.sit.R;
import com.istic.sit.framework.view.MainActivity;

public class MapsActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		initializeBackground(TypeBackgroundEnum.Map, savedInstanceState);
	}
	
	@Override
	public void onItemMenuClicked(int position) {
		
	}
	
	@Override
	public void onCreateSlideMenu()
	{
		this.addItemMenu(getResources().getString(R.string.menu_dynamic));
		this.addItemMenu(getResources().getString(R.string.menu_virtuel));
		this.addItemMenu(getResources().getString(R.string.menu_static));
	}
}


