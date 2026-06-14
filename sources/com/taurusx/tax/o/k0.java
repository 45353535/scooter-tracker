package com.taurusx.tax.o;

import android.content.Context;
import android.content.Intent;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes11.dex */
public class k0 {
    public static String z(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b10 : bArrDigest) {
                stringBuffer.append(Integer.toHexString((b10 & 255) | 256).substring(1));
            }
            return stringBuffer.toString();
        } catch (NullPointerException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static boolean z(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
    }
}
