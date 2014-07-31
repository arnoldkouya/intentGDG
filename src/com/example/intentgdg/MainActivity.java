package com.example.intentgdg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;

public class MainActivity extends SherlockActivity {
    Button btn_go;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn_go = (Button)findViewById(R.id.btn_go);
		
		
		btn_go.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent otherActivity = new Intent(getApplicationContext(), SecondActivity.class);
				startActivity(otherActivity);
				
				Toast.makeText(getApplicationContext(), "Go other Activity", Toast.LENGTH_LONG).show();
				
			}
		});
		
	}

	

}
