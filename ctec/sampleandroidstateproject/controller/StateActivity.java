package ctec.sampleandroidstateproject.controller;

import ctec.sampleandroidstateproject.model.AndroidAppState;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StateActivity extends Activity
{
	private EditText nameEditText;
	private EditText phraseEditText;
	private EditText ageEditText;
	private EditText stuffEditText;
	private Button swapButton;
	private AndroidAppState appState;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_state);
		
		nameEditText = (EditText) findViewById(R.id.nameEditText);
		phraseEditText = (EditText) findViewById(R.id.phraseEditText);
		ageEditText = (EditText) findViewById(R.id.ageEditText);
		stuffEditText = (EditText) findViewById(R.id.stuffEditText);
		swapButton = (Button) findViewById(R.id.swapButton);
		
		appState = (AndroidAppState) getApplication();
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		swapButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				appState.setName(nameEditText.getText().toString());
				appState.setAge(ageEditText.getText().toString());
				appState.setPhrase(phraseEditText.getText().toString());
				appState.setStuff(stuffEditText.getText().toString());
				
				
				Intent myIntent = new Intent(currentView.getContext(), TransferDataActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	}
}
