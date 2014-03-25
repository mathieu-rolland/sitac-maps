package com.istic.sit.sitac_maps;

import android.os.Bundle;
import android.view.DragEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.widget.TextView;

import com.istic.sit.R;
import com.istic.sit.framework.api.model.IEntity;
import com.istic.sit.framework.api.view.IBackground;
import com.istic.sit.framework.model.DynamicEntity;
import com.istic.sit.framework.model.Representation;
import com.istic.sit.framework.view.MainActivity;
import com.istic.sit.framework.view.MapFragment;

public class MapsActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		initializeBackground(TypeBackgroundEnum.Map, savedInstanceState);
	}
	
	@Override
	public void onItemMenuClicked(int position, View view) {
		
	}
	
	@Override
	public void onCreateSlideMenu()
	{
		this.addItemMenu(getResources().getString(R.string.menu_dynamic));
		this.addItemMenu(getResources().getString(R.string.menu_virtuel));
		this.addItemMenu(getResources().getString(R.string.menu_static));
	}

	@Override
	public void onItemMenuLongClicked(int position, View view) {
		String entityString = (String) this.entityAdapter.getItem(position);
		DragShadowBuilder entityShadow = new DragShadowBuilder(view);

		view.startDrag(null,	//ClipData
				entityShadow,   //View.DragShadowBuilder 
				entityString,	//Object myLocalState
                0);	
		
		this.mDrawerLayout.closeDrawer(listMenu);				
	}

}


