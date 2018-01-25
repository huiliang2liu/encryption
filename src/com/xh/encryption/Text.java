package com.xh.encryption;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Text {
	public static void main(String[] args) {
		File file = new File("E:\\lhl\\工具\\工具\\dex2jar/classes.dex");
		byte[] buff = new byte[(int) file.length()];
		try {
			IEncryption encryption = EncryptionFactory.getDES(EncryptionFactory
					.CreateDESKey("liuhuiliang"));
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read(buff);
			byte[] b = encryption.encryption(buff);
			FileOutputStream fileOutputStream = new FileOutputStream(
					"E:\\lhl\\工具\\工具\\dex2jar/classes1.dex");
			fileOutputStream.write(b);
			fileOutputStream.flush();
			fileOutputStream.close();
			fileInputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
