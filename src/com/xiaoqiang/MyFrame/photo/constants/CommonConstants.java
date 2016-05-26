package com.xiaoqiang.MyFrame.photo.constants;

import android.os.Environment;

public interface CommonConstants {

	/** 文件缓存目录 */
	public static final String SDPATH = Environment.getExternalStorageDirectory() + "/myframe/";
	public static final String SDPATH_IMAGE = SDPATH + "image/";
}
