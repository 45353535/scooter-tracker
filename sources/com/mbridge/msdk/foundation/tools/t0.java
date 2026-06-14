package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f49074a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f49075b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f49076c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f49077d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f49078e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t0.b();
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f49075b) {
                return;
            }
            f49075b = true;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                f49074a = externalFilesDir.getAbsolutePath();
            }
            try {
                b(context);
            } catch (Exception unused) {
                b(context);
            }
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }

    private static void b(Context context) {
        File externalFilesDir;
        if (TextUtils.isEmpty(f49074a) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            f49074a = externalFilesDir.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(f49074a)) {
            com.mbridge.msdk.foundation.same.directory.e.a(new com.mbridge.msdk.foundation.same.directory.d(f49074a));
            com.mbridge.msdk.foundation.same.directory.e.b().a();
        }
        b();
    }

    public static int c() {
        return f49077d;
    }

    public static int a() {
        if (System.currentTimeMillis() - f49078e > 1800000) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a());
        }
        return f49076c;
    }

    public static void b() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            f49077d = Long.valueOf(((((long) statFs.getBlockCount()) * blockSize) / 1000) / 1000).intValue();
            f49076c = Long.valueOf(((availableBlocks * blockSize) / 1000) / 1000).intValue();
            f49078e = System.currentTimeMillis();
        } catch (Exception e10) {
            q0.b("SameSDCardTool", e10.getMessage());
        }
    }
}
