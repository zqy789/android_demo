package org.demo.crow.os;

import org.demo.crow.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class OSFuncTestActivity extends Activity {
	
	private static final String TAG = "OSFuncTestActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_os_func_test);
	}

	@Override
	protected void onStart() {
		Log.i(TAG, "onStart");
		super.onStart();
	}

	@Override
	protected void onRestart() {
		Log.i(TAG, "onRestart");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.i(TAG, "onResume");
		super.onResume();
	}

	@Override
	protected void onNewIntent(Intent intent) {
		Log.i(TAG, "onNewIntent");
		super.onNewIntent(intent);
	}

	@Override
	protected void onPause() {
		Log.i(TAG, "onPause");
		super.onPause();
	}

	@Override
	protected void onStop() {
		Log.i(TAG, "onStop");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Log.i(TAG, "onDestroy");
		super.onDestroy();
	}
	
}