package com.taurusx.tax.g;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66106w = "android.permission.WRITE_EXTERNAL_STORAGE";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f66107y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66108z = "StorageUtil";

    public enum w {
        FILES,
        CACHE
    }

    public static /* synthetic */ class z {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final /* synthetic */ int[] f66110z;

        static {
            int[] iArr = new int[w.values().length];
            f66110z = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f66110z;
                w wVar = w.FILES;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static File w(Context context, String str, w wVar) {
        return z(context, str, wVar, true);
    }

    public static File z(Context context, w wVar) {
        return z(context, wVar, true);
    }

    public static File w(Context context, w wVar) {
        File file = new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data");
        int iOrdinal = wVar.ordinal();
        File file2 = new File(new File(file, context.getPackageName()), iOrdinal != 0 ? iOrdinal != 1 ? null : Reporting.EventType.CACHE : "files");
        if (!file2.exists()) {
            if (!file2.mkdirs()) {
                Log.w(f66108z, "Unable to create external files directory");
                return null;
            }
            File file3 = new File(file2, ".nomedia_tmp");
            try {
                try {
                    try {
                        if (!file3.createNewFile()) {
                            Log.e(f66108z, "Can't create \".nomedia_tmp\" file in application external files directory");
                        }
                        file3.delete();
                    } catch (Error | Exception unused) {
                        Log.e(f66108z, "Can't create \".nomedia_tmp\" file in application external files directory");
                        file3.delete();
                    }
                } catch (Throwable th2) {
                    try {
                        file3.delete();
                    } catch (Error | Exception unused2) {
                    }
                    throw th2;
                }
            } catch (Error | Exception unused3) {
            }
        }
        return file2;
    }

    public static File z(Context context, w wVar, boolean z10) {
        String externalStorageState;
        f66107y = false;
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (IncompatibleClassChangeError | NullPointerException unused) {
            externalStorageState = "";
        }
        String str = null;
        File fileW = (z10 && "mounted".equals(externalStorageState) && z(context)) ? w(context, wVar) : null;
        if (fileW == null) {
            int iOrdinal = wVar.ordinal();
            if (iOrdinal == 0) {
                fileW = context.getFilesDir();
            } else if (iOrdinal == 1) {
                fileW = context.getCacheDir();
            }
            f66107y = true;
        }
        if (fileW != null) {
            return fileW;
        }
        int iOrdinal2 = wVar.ordinal();
        if (iOrdinal2 == 0) {
            str = "files";
        } else if (iOrdinal2 == 1) {
            str = Reporting.EventType.CACHE;
        }
        String str2 = "/data/data/" + context.getPackageName() + "/" + str + "/";
        Log.w(f66108z, "Can't define system files directory! '" + str2 + "' will be used.");
        File file = new File(str2);
        f66107y = true;
        return file;
    }

    public static boolean z() {
        return f66107y;
    }

    public static File z(Context context, String str, w wVar) {
        File fileZ = z(context, wVar);
        File file = new File(fileZ, str);
        return (file.exists() || file.mkdir()) ? file : fileZ;
    }

    public static File z(Context context, String str, w wVar, boolean z10) {
        f66107y = false;
        File file = (z10 && "mounted".equals(Environment.getExternalStorageState()) && z(context)) ? new File(Environment.getExternalStorageDirectory(), str) : null;
        if (file != null && (file.exists() || file.mkdirs())) {
            return file;
        }
        int iOrdinal = wVar.ordinal();
        if (iOrdinal == 0) {
            file = context.getFilesDir();
        } else if (iOrdinal == 1) {
            file = context.getCacheDir();
        }
        f66107y = true;
        return file;
    }

    public static boolean z(Context context) {
        return context.checkCallingOrSelfPermission(f66106w) == 0;
    }
}
