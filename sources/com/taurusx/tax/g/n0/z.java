package com.taurusx.tax.g.n0;

import android.content.Context;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.n0.y;
import com.taurusx.tax.g.t;
import com.taurusx.tax.log.LogUtil;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f66237c = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static y f66238o = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f66239w = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f66240y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66241z = "taurusx-cache";

    public static boolean w(Context context) {
        if (context == null) {
            return false;
        }
        if (f66238o == null) {
            File fileZ = z(context);
            if (fileZ == null) {
                return false;
            }
            try {
                f66238o = y.z(fileZ, 1, 1, t.z(fileZ));
            } catch (IOException e10) {
                LogUtil.v("taurusx", "Unable to create DiskLruCache" + e10);
                return false;
            }
        }
        return true;
    }

    public static String y(String str) {
        if (f66238o == null) {
            return null;
        }
        return f66238o.c() + File.separator + w(str) + ".0";
    }

    public static File z(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        return new File(cacheDir.getPath() + File.separator + f66241z);
    }

    public static boolean z(String str) {
        y yVar = f66238o;
        if (yVar == null) {
            return false;
        }
        return yVar.w(w(str)) != null;
    }

    public static String w(String str) {
        return j0.w(str);
    }

    public static boolean z(String str, InputStream inputStream) {
        y yVar = f66238o;
        if (yVar == null) {
            return false;
        }
        y.w wVarZ = null;
        try {
            wVarZ = yVar.z(w(str));
            if (wVarZ == null) {
                return false;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(wVarZ.y(0));
            j0.z(inputStream, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            f66238o.y();
            wVarZ.y();
            return true;
        } catch (Exception e10) {
            LogUtil.v("taurusx", "Unable to put to DiskLruCache" + e10);
            if (wVarZ != null) {
                try {
                    wVarZ.z();
                } catch (IOException unused) {
                }
            }
            return false;
        }
    }
}
