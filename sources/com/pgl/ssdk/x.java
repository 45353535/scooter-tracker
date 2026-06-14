package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes11.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f62186a = -1;

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.f62186a = x.b(z.a());
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt("camera_count", x.f62186a).apply();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(Context context) {
        int i10 = f62186a;
        if (i10 != -1) {
            return i10;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                f62186a = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                f62186a = -1;
            }
        } else {
            f62186a = -2;
        }
        return f62186a;
    }

    public static int a() {
        int i10;
        int i11 = f62186a;
        if (i11 != -1) {
            return i11;
        }
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA == null || (i10 = sharedPreferencesA.getInt("camera_count", -1)) == -1) {
            ar.b(new a());
            return -1;
        }
        f62186a = i10;
        return i10;
    }
}
