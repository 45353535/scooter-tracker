package com.taurusx.tax.g;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.ironsource.D5;
import com.taurusx.tax.log.LogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66120c = "uid";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66121w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66122y = "taurusx_uid";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66123z;

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStorageState());
        String str = File.separator;
        sb2.append(str);
        sb2.append("com.taurusx.tax");
        String string = sb2.toString();
        f66123z = string;
        f66121w = string + str + "uid.data";
    }

    public static String w(Context context) {
        String strW = b.z().w(context, f66122y, f66120c);
        if (TextUtils.isEmpty(strW)) {
            if (context.checkCallingPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                File file = new File(f66121w);
                if (file.exists()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        strW = i.z(fileInputStream, Charset.forName(D5.N));
                        fileInputStream.close();
                    } catch (Error | Exception e10) {
                        LogUtil.v("taurusx", "get uid error : " + e10);
                        strW = z(context);
                    }
                } else {
                    File file2 = new File(f66123z);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    String strZ = z(context);
                    try {
                        if (context.checkCallingPermission(d.f66106w) == 0) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            fileOutputStream.write(strZ.getBytes());
                            fileOutputStream.close();
                        }
                    } catch (Error | Exception e11) {
                        LogUtil.v("taurusx", "get uid error : " + e11);
                    }
                    strW = strZ;
                }
            } else {
                strW = z(context);
            }
            b.z().z(context, f66122y, f66120c, strW);
        }
        return strW;
    }

    public static String y(Context context) {
        String strW = w(context);
        return TextUtils.isEmpty(strW) ? "UNKNOWN" : strW;
    }

    public static String z(Context context) {
        String packageName = context.getPackageName();
        String strZ = t.z(context);
        String strZ2 = com.taurusx.tax.g.p0.w.z(context);
        if (!TextUtils.isEmpty(strZ)) {
            LogUtil.v("taurusx", "generate user id with android id : " + strZ);
        } else if (TextUtils.isEmpty(strZ2)) {
            strZ = "";
        } else {
            LogUtil.v("taurusx", "generate user id with gaid : " + strZ2);
            strZ = strZ2;
        }
        if (TextUtils.isEmpty(strZ)) {
            return UUID.randomUUID().toString();
        }
        return UUID.nameUUIDFromBytes((strZ + packageName).getBytes()).toString();
    }
}
