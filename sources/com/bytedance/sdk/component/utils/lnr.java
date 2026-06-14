package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.taurusx.tax.y.s.w;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private static HashMap<String, ArrayList<String>> qdl = new HashMap<>();

    public static ArrayList<String> qdl(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (qdl.get(str) != null) {
                return qdl.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : ud(context, packageName)) {
                    String strQdl = "error!";
                    if ("MD5".equals(str)) {
                        strQdl = qdl(signature, "MD5");
                    } else if (w.f67666t.equals(str)) {
                        strQdl = qdl(signature, w.f67666t);
                    } else if ("SHA256".equals(str)) {
                        strQdl = qdl(signature, "SHA256");
                    }
                    arrayList.add(strQdl);
                }
            } catch (Exception unused) {
            }
            qdl.put(str, arrayList);
        }
        return arrayList;
    }

    private static Signature[] ud(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String qdl(Context context) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> arrayListQdl = qdl(context, w.f67666t);
        if (arrayListQdl != null && arrayListQdl.size() != 0) {
            for (int i10 = 0; i10 < arrayListQdl.size(); i10++) {
                sb2.append(arrayListQdl.get(i10));
                if (i10 < arrayListQdl.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private static String qdl(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] bArrDigest = messageDigest.digest(byteArray);
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                    sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                return sb2.substring(0, sb2.length() - 1).toString();
            }
            return "error!";
        } catch (Exception unused) {
            return "error!";
        }
    }
}
