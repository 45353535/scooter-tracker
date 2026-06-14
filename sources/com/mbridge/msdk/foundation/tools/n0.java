package com.mbridge.msdk.foundation.tools;

import com.google.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes10.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static char[] f49041a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static MessageDigest f49042b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f49043c = "SameFileMD5";

    static {
        try {
            f49042b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e10) {
            System.err.println(n0.class.getName() + "初始化失败，MessageDigest不支持MD5Util.");
            e10.printStackTrace();
        }
    }

    public static String a(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        if (file == null || !file.exists()) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[10485760];
                while (true) {
                    int i10 = randomAccessFile.read(bArr);
                    if (i10 == -1) {
                        String strA = a(messageDigest.digest());
                        try {
                            randomAccessFile.close();
                            return strA;
                        } catch (IOException e10) {
                            q0.b(f49043c, e10.getMessage());
                            return strA;
                        }
                    }
                    messageDigest.update(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    q0.b(f49043c, th.getMessage());
                    return "";
                } finally {
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e11) {
                            q0.b(f49043c, e11.getMessage());
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    private static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private static String a(byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer(i11 * 2);
        int i12 = i11 + i10;
        while (i10 < i12) {
            a(bArr[i10], stringBuffer);
            i10++;
        }
        return stringBuffer.toString();
    }

    private static void a(byte b10, StringBuffer stringBuffer) {
        char[] cArr = f49041a;
        char c10 = cArr[(b10 & 240) >> 4];
        char c11 = cArr[b10 & Ascii.SI];
        stringBuffer.append(c10);
        stringBuffer.append(c11);
    }
}
