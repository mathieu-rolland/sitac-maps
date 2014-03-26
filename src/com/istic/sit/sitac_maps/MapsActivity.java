package com.istic.sit.sitac_maps;

import android.os.Bundle;
import android.view.View;
import android.view.View.DragShadowBuilder;
import com.istic.sit.R;
import com.istic.sit.framework.api.model.IEntity;
import com.istic.sit.framework.couch.DataBaseCommunication;
import com.istic.sit.framework.model.DynamicEntity;
import com.istic.sit.framework.model.Representation;
import com.istic.sit.framework.view.MainActivity;

public class MapsActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		DataBaseCommunication.BASE_URL = "http://148.60.11.236:5984/sitac/";
		initializeBackground(TypeBackgroundEnum.Map, savedInstanceState);
	}
	
	@Override
	public void onResume() {
		super.onResume();
		loadEntities();
		startServiceSynchronisation();
	}
	
	@Override
	public void onItemMenuClicked(int position, View view) {
		
	}
	
	@Override
	public void onCreateSlideMenu()
	{		
		IEntity entityDynamic = new DynamicEntity();
		entityDynamic.setLibelle(getResources().getString(R.string.menu_dynamic));
		entityDynamic.setRepresentation(new Representation(R.drawable.ic_camion));
		
		IEntity entityVirtuel = new DynamicEntity();
		entityVirtuel.setLibelle(getResources().getString(R.string.menu_virtuel));
		entityVirtuel.setRepresentation(new Representation(R.drawable.ic_bouche_incendie));
		
		IEntity entityStatic = new DynamicEntity();
		entityStatic.setLibelle(getResources().getString(R.string.menu_static));
		
		this.addItemMenu(entityDynamic);
		this.addItemMenu(entityVirtuel);
		this.addItemMenu(entityStatic);
	}

	@Override
	public void onItemMenuLongClicked(int position, View view) {
		IEntity entity = (IEntity)this.entityAdapter.getItem(position);
		
		DragShadowBuilder entityShadow = new DragShadowBuilder(view);

		view.startDrag(null,	//ClipData
				entityShadow,   //View.DragShadowBuilder 
				entity,	//Object myLocalState
                0);
		
		this.mDrawerLayout.closeDrawer(listMenu);				
	}
}


