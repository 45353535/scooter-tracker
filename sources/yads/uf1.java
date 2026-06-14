package yads;

import android.text.TextUtils;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f116630a = new Object();

    public static String a(String str, Throwable th2) {
        String strReplace;
        synchronized (f116630a) {
            try {
                if (th2 != null) {
                    Throwable cause = th2;
                    while (true) {
                        if (cause == null) {
                            strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    }
                } else {
                    strReplace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f116630a) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2) {
        synchronized (f116630a) {
            Log.i(str, str2);
        }
    }

    public static void d(String str, String str2) {
        synchronized (f116630a) {
            Log.w(str, str2);
        }
    }

    public static void a(String str, String str2, IllegalArgumentException illegalArgumentException) {
        b(str, a(str2, illegalArgumentException));
    }

    public static void a(String str, String str2) {
        synchronized (f116630a) {
            Log.d(str, str2);
        }
    }

    public static void a(RuntimeException runtimeException) {
        d("StreamVolumeManager", a("Error registering stream volume receiver", runtimeException));
    }
}
