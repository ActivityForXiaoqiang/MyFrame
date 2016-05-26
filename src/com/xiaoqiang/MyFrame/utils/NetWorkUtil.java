package com.xiaoqiang.MyFrame.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.util.Log;

/**
 * 网络链接工具类
 * 
 * @author xiaoqiang
 *
 */
public class NetWorkUtil {
	/**
	 * 网络链接状态 1 wife已链接 2 gprs已链接 3 没有网络链接
	 */
	public static final int WIFE_CONNECT = 1;
	public static final int GPRS_CONNECT = 2;
	public static final int NO_NETWORK = -1;

	/**
	 * 判断是否有网络链接
	 * 
	 * @param con
	 * @return
	 */
	public static int iswork(Context con) {

		ConnectivityManager manager = (ConnectivityManager) con.getSystemService(con.CONNECTIVITY_SERVICE);

		State Wstate = manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState();

		State Gstate = manager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState();
		NetworkInfo info = manager.getActiveNetworkInfo();

		if (State.CONNECTED == Wstate) {

			if (info.isAvailable()) {
				// Log.i("wife", "wife is live");
				return WIFE_CONNECT;
			}
		} else {
			if (State.CONNECTED == Gstate) {
				if (info.isAvailable()) {
					// Log.i("gprs", "gprs is live");
					return GPRS_CONNECT;
				}
			}

		}
		return NO_NETWORK;
	}

}
