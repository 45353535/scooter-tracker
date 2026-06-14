package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdv {
    public static boolean zza(Context context) throws zzdu {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && (Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzg("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzb() throws zzdu {
        return zzg("EGL_KHR_surfaceless_context");
    }

    public static boolean zzc(int i10) throws zzdu {
        if (i10 == 6) {
            return zzd();
        }
        if (i10 == 7) {
            return zzg("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    public static boolean zzd() throws zzdu {
        return Build.VERSION.SDK_INT >= 33 && zzg("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static void zze() throws zzdu {
        StringBuilder sb2 = new StringBuilder();
        zzguc zzgucVar = new zzguc();
        boolean z10 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            zzgucVar.zzf(Integer.valueOf(iGlGetError));
            z10 = true;
        }
        if (z10) {
            throw new zzdu(sb2.toString(), zzgucVar.zzi());
        }
    }

    public static void zzf(boolean z10, String str) throws zzdu {
        if (!z10) {
            throw new zzdu(str, zzguf.zzi());
        }
    }

    private static boolean zzg(String str) throws zzdu {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        zzf(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        zzf(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        zze();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }
}
