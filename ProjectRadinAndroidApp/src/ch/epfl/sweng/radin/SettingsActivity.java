package ch.epfl.sweng.radin;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

public class SettingsActivity extends DashBoardActivity {

	private SharedPreferences prefs;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_settings);
		setHeader(getString(R.string.title_activity_settings), true, true);
		prefs = getSharedPreferences(LoginActivity.PREFS, MODE_PRIVATE);
		displayId();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings, menu);
		return true;
	}

	//@Override
	/*public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.action_home:
	        	Intent intent = new Intent(this, HomeActivity.class);
	        	startActivity(intent);
	            return true;
	        case R.id.action_settings:
	         
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}*/
	
	
	private void displayId() {
		
		TextView userID = (TextView) findViewById(R.id.value_id);
		userID.setText(prefs.getString(getString(R.string.username), "NA"));
		
		
	}
}
