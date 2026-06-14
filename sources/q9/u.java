package q9;

import android.text.TextUtils;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f98877b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f98878c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f98876a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f98879d = a.f98880a;

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f98880a = new C1168a();

        /* JADX INFO: renamed from: q9.u$a$a, reason: collision with other inner class name */
        class C1168a implements a {
            C1168a() {
            }

            @Override // q9.u.a
            public void d(String str, String str2, Throwable th2) {
                Log.d(str, u.a(str2, th2));
            }

            @Override // q9.u.a
            public void e(String str, String str2, Throwable th2) {
                Log.e(str, u.a(str2, th2));
            }

            @Override // q9.u.a
            public void i(String str, String str2, Throwable th2) {
                Log.i(str, u.a(str2, th2));
            }

            @Override // q9.u.a
            public void w(String str, String str2, Throwable th2) {
                Log.w(str, u.a(str2, th2));
            }
        }

        void d(String str, String str2, Throwable th2);

        void e(String str, String str2, Throwable th2);

        void i(String str, String str2, Throwable th2);

        void w(String str, String str2, Throwable th2);
    }

    public static String a(String str, Throwable th2) {
        String strE = e(th2);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "\n  " + strE.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f98876a) {
            try {
                if (f98877b == 0) {
                    f98879d.d(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f98876a) {
            try {
                if (f98877b <= 3) {
                    f98879d.e(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (f98876a) {
            try {
                if (f98877b <= 3) {
                    f98879d.e(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static String e(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (f98876a) {
            try {
                if (g(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f98878c) {
                    return Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f98876a) {
            try {
                if (f98877b <= 1) {
                    f98879d.i(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean g(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (f98876a) {
            try {
                if (f98877b <= 2) {
                    f98879d.w(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        synchronized (f98876a) {
            try {
                if (f98877b <= 2) {
                    f98879d.w(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
