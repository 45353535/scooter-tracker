package yads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dy0 {
    public static void a() {
        int i10 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            uf1.b("GlUtil", "glError: " + GLU.gluErrorString(iGlGetError));
            i10 = iGlGetError;
        }
        if (i10 != 0) {
            uf1.b("GlUtil", "glError: " + GLU.gluErrorString(i10));
        }
    }

    public static boolean c() {
        String strEglQueryString;
        return w83.f117341a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static boolean a(Context context) {
        String strEglQueryString;
        int i10 = w83.f117341a;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26) {
            byte[] bArrDecode = Base64.decode("c2Ftc3VuZw==", 0);
            Charset charset = Charsets.UTF_8;
            if (new String(bArrDecode, charset).equals(w83.f117343c) || new String(Base64.decode("WFQxNjUw", 0), charset).equals(w83.f117344d)) {
                return false;
            }
        }
        return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
    }
}
