package com.ang.iocdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ang.iocdemo.ioc.ContentView;
import com.ang.iocdemo.ioc.ViewInject;
import com.ang.iocdemo.ioc.ViewInjectUtils;
import com.ang.iocdemo.ioc.listener.OnClick;

@ContentView(R.layout.activity_main)
public class MainActivity extends Activity {

	@ViewInject(R.id.btn)
	private Button btn;
	
	@ViewInject(R.id.tv)
	private TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewInjectUtils.inject(this);
		
		btn.setText("btn");
		tv.setText("tv");
	}

	@OnClick(R.id.tv)
	public void clickB(View v)
	{
		Toast.makeText(MainActivity.this, "tv", Toast.LENGTH_SHORT).show();
	}
}
