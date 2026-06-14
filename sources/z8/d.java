package z8;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import b9.u;
import io.bidmachine.iab.mraid.a0;
import io.bidmachine.iab.mraid.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes12.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b9.b f119188a = new b9.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f119189b = true;

    private static Pair a(String str) {
        String[] strArrSplit = str.split("/");
        return new Pair(strArrSplit[0], strArrSplit[1]);
    }

    private static void b(a0 a0Var) {
        if (a0Var != null) {
            a0Var.m("nativeStorage.fireErrorEvent('internal error');");
        }
    }

    static void c(a0 a0Var, String str) {
        if (f(a0Var, str)) {
            return;
        }
        try {
            Pair pairA = a(f119188a.g(URLDecoder.decode(str, "UTF-8")));
            if (f(a0Var, (String) pairA.first, (String) pairA.second)) {
                return;
            }
            boolean z10 = f119189b;
            if (!z10 && a0Var == null) {
                throw new AssertionError();
            }
            Object obj = a0Var.getContext().getApplicationContext().getSharedPreferences((String) pairA.first, 0).getAll().get(pairA.second);
            if (obj == null) {
                b(a0Var);
                return;
            }
            String strValueOf = String.valueOf(obj);
            if (f(a0Var, strValueOf)) {
                return;
            }
            if (!z10 && str == null) {
                throw new AssertionError();
            }
            e(a0Var, "fireReadDefaultsSuccessEvent", str, Base64.encodeToString(strValueOf.getBytes(), 2));
        } catch (Throwable th2) {
            b(a0Var);
            i.e("NativeStorage", th2);
        }
    }

    static void d(a0 a0Var, String str, String str2) {
        if (f(a0Var, str, str2)) {
            return;
        }
        try {
            String strG = f119188a.g(URLDecoder.decode(str, "UTF-8"));
            byte[] bArrDecode = Base64.decode(URLDecoder.decode(str2, "UTF-8"), 2);
            Pair pairA = a(strG);
            if (f(a0Var, (String) pairA.first, (String) pairA.second)) {
                return;
            }
            if (!f119189b && a0Var == null) {
                throw new AssertionError();
            }
            a0Var.getContext().getApplicationContext().getSharedPreferences((String) pairA.first, 0).edit().putString((String) pairA.second, new String(bArrDecode)).apply();
        } catch (Throwable th2) {
            b(a0Var);
            i.e("NativeStorage", th2);
        }
    }

    private static void e(a0 a0Var, String str, String str2, String str3) {
        if (a0Var != null) {
            a0Var.m(String.format("nativeStorage.%s(\"%s\", \"%s\");", str, str2, str3));
        }
    }

    private static boolean f(a0 a0Var, String... strArr) {
        if (a0Var == null || a0Var.n() || a0Var.getContext() == null) {
            b(a0Var);
            return true;
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    b(a0Var);
                    return true;
                }
            }
        }
        return false;
    }

    static void g(a0 a0Var, String str) {
        FileInputStream fileInputStreamOpenFileInput;
        if (f(a0Var, str)) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            String strG = f119188a.g(URLDecoder.decode(str, "UTF-8"));
            if (!f119189b && a0Var == null) {
                throw new AssertionError();
            }
            Context applicationContext = a0Var.getContext().getApplicationContext();
            File file = strG.contains("/") ? new File(strG) : applicationContext.getFileStreamPath(strG);
            if (file != null && file.exists()) {
                fileInputStreamOpenFileInput = applicationContext.openFileInput(strG);
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        if (fileInputStreamOpenFileInput != null) {
                            while (true) {
                                int i10 = fileInputStreamOpenFileInput.read(bArr);
                                if (-1 == i10) {
                                    break;
                                } else {
                                    byteArrayOutputStream2.write(bArr, 0, i10);
                                }
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        if (byteArray.length > 0) {
                            if (!f119189b && str == null) {
                                throw new AssertionError();
                            }
                            e(a0Var, "fireReadFileSuccessEvent", str, Base64.encodeToString(byteArray, 2));
                        } else {
                            b(a0Var);
                        }
                        u.n(fileInputStreamOpenFileInput);
                        u.n(byteArrayOutputStream2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        try {
                            b(a0Var);
                            i.e("NativeStorage", th);
                            return;
                        } finally {
                            u.n(fileInputStreamOpenFileInput);
                            u.n(byteArrayOutputStream);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            b(a0Var);
            u.n(null);
            u.n(null);
        } catch (Throwable th4) {
            th = th4;
            fileInputStreamOpenFileInput = null;
        }
    }

    static void h(a0 a0Var, String str, String str2) {
        if (f(a0Var, str, str2)) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            String strG = f119188a.g(URLDecoder.decode(str, "UTF-8"));
            byte[] bArrDecode = Base64.decode(URLDecoder.decode(str2, "UTF-8"), 2);
            if (!f(a0Var, strG, new String(bArrDecode))) {
                if (!f119189b && a0Var == null) {
                    throw new AssertionError();
                }
                fileOutputStream = strG.contains("/") ? new FileOutputStream(strG) : a0Var.getContext().getApplicationContext().openFileOutput(strG, 0);
                fileOutputStream.write(bArrDecode);
            }
        } catch (Throwable th2) {
            try {
                b(a0Var);
                i.e("NativeStorage", th2);
            } finally {
                u.q(null);
                u.n(null);
            }
        }
    }
}
