package com.info;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHashing {
	
public static String algoinit(String data) throws NoSuchAlgorithmException {
	String algoName="SHA-256";
	return generateHash(algoName,data);
	
}
	
	
private static String generateHash(String algoName, String data) throws NoSuchAlgorithmException {
	
	MessageDigest ms=MessageDigest.getInstance(algoName);
	ms.reset();
	return bytesToHex(ms.digest(data.getBytes()));
	
	
}
private static String bytesToHex(byte[] hashInBytes) {

    StringBuilder sb = new StringBuilder();
    for (byte b : hashInBytes) {
        sb.append(String.format("%02x", b));
    }
    return sb.toString();

}

public static void main(String[] args) {
	try {
		System.out.println(algoinit("hello"));
		System.out.println(algoinit("Hello"));
	} catch (NoSuchAlgorithmException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
