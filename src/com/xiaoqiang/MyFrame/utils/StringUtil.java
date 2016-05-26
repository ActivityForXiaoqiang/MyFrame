package com.xiaoqiang.MyFrame.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

/**
 * 字符串处理工具类
 * 
 * @author xiaoqiang
 *
 */
public class StringUtil {
	/**
	 * 检查登录信息
	 * 
	 * @param con
	 * @param usernmae
	 *            用户名 不为空，必须为11位
	 * @param password
	 *            密码 不为空，不少于 6位
	 * @return
	 */
	public boolean CheckInfoWithPhone(Context con, EditText usernmae, EditText password) {
		if (TextUtils.isEmpty(usernmae.getText().toString())) {
			Toast.makeText(con, "手机号不能为空", 0).show();
			return false;
		}
		if (TextUtils.isEmpty(password.getText().toString())) {
			Toast.makeText(con, "密码不能为空", 0).show();
			return false;
		}
		if (usernmae.getText().length() != 11) {
			Toast.makeText(con, "请输入正确手机号", 0).show();
			return false;
		}
		if (password.getText().length() < 6) {
			Toast.makeText(con, "密码不能少于6位数", 0).show();
			return false;
		}

		return true;

	}

}
