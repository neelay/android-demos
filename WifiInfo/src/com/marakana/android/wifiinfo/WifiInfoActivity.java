package com.marakana.android.wifiinfo;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.View;
import android.widget.TextView;

public class WifiInfoActivity extends Activity {
	TextView out;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		out = (TextView) findViewById(R.id.out);
		refresh(null);
	}

	public void refresh(View v) {
		WifiManager wifimanager = (WifiManager) getSystemService(WIFI_SERVICE);
		out.append("\nThe ip address is "
				+ Formatter.formatIpAddress(wifimanager.getConnectionInfo()
						.getIpAddress()));

	}
}