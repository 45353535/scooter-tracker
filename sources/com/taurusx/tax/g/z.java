package com.taurusx.tax.g;

import android.util.Base64;
import com.google.common.base.Ascii;
import com.taurusx.tax.log.LogUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public class z {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66366z = c.w(new byte[]{-72, 60, -2, 110, -115, -107, -119, 13, -59, -63, -61, -65, 91, 90, -57, -85, -44, -49, -45, -61, 45, 72, -27, -32, -32, -19, -2, -9});

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66365w = c.w(new byte[]{125, 32, -17, Ascii.SO, 94, -117, 47, 101, Ascii.FS, Ascii.CAN, -78});

    public static String w(String str, String str2, String str3) {
        try {
            byte[] bArrZ = a.z(str2);
            byte[] bArrZ2 = a.z(str3);
            Cipher cipher = Cipher.getInstance(f66366z);
            cipher.getBlockSize();
            byte[] bytes = str.getBytes();
            cipher.init(1, new SecretKeySpec(bArrZ, f66365w), new IvParameterSpec(bArrZ2));
            return Base64.encodeToString(cipher.doFinal(bytes), 2);
        } catch (Error | Exception e10) {
            LogUtil.e("taurusx", "encrypt error : " + e10);
            return null;
        }
    }

    public static byte[] z(byte[] bArr, String str, String str2) {
        try {
            byte[] bArrZ = a.z(str);
            byte[] bArrZ2 = a.z(str2);
            Cipher cipher = Cipher.getInstance(f66366z);
            cipher.getBlockSize();
            cipher.init(1, new SecretKeySpec(bArrZ, f66365w), new IvParameterSpec(bArrZ2));
            return cipher.doFinal(bArr);
        } catch (Error | Exception e10) {
            LogUtil.e("taurusx", "encrypt error : " + e10);
            return null;
        }
    }

    public static InputStream z(InputStream inputStream, String str, String str2) {
        try {
            byte[] bArrZ = a.z(str);
            byte[] bArrZ2 = a.z(str2);
            Cipher cipher = Cipher.getInstance(f66366z);
            cipher.init(2, new SecretKeySpec(bArrZ, f66365w), new IvParameterSpec(bArrZ2));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (-1 != i10) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                } else {
                    return new ByteArrayInputStream(cipher.doFinal(byteArrayOutputStream.toByteArray()));
                }
            }
        } catch (Exception e10) {
            LogUtil.e("taurusx", "the decrypt error is: " + e10);
            return null;
        }
    }

    public static String z(String str, String str2, String str3) {
        try {
            byte[] bArrZ = a.z(str2);
            byte[] bArrZ2 = a.z(str3);
            Cipher cipher = Cipher.getInstance(f66366z);
            cipher.init(2, new SecretKeySpec(bArrZ, f66365w), new IvParameterSpec(bArrZ2));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(Base64.decode(str, 0));
            return new String(cipher.doFinal(byteArrayOutputStream.toByteArray()));
        } catch (Exception e10) {
            LogUtil.e("taurusx", "the des error is: " + e10);
            return null;
        }
    }
}
