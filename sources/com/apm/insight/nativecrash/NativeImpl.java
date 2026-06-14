package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.apm.insight.b.d;
import com.apm.insight.b.f;
import com.apm.insight.e;
import com.apm.insight.l.j;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class NativeImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f7983a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f7984b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7985c = true;

    public static boolean a() {
        if (f7984b) {
            return f7983a;
        }
        f7984b = true;
        if (!f7983a) {
            f7983a = com.apm.insight.a.b("apminsighta");
        }
        return f7983a;
    }

    public static int b() {
        if (f7983a) {
            return doCreateCallbackThread();
        }
        return -1;
    }

    public static void c() {
    }

    public static void d() {
    }

    @Keep
    private static native boolean doCheckNativeCrash();

    @Keep
    private static native void doCloseFile(int i10);

    @Keep
    private static native int doCreateCallbackThread();

    @Keep
    private static native void doDump(String str);

    @Keep
    private static native void doDumpFds(String str);

    @Keep
    private static native void doDumpHprof(String str);

    @Keep
    private static native void doDumpLogcat(String str, String str2, String str3);

    @Keep
    private static native void doDumpMaps(String str);

    @Keep
    private static native void doDumpMemInfo(String str);

    @Keep
    private static native void doDumpThreads(String str);

    @Keep
    private static native long doGetAppCpuTime();

    @Keep
    private static native long doGetChildCpuTime();

    @Keep
    private static native String doGetCrashHeader(String str);

    @Keep
    private static native long doGetDeviceCpuTime();

    @Keep
    private static native int doGetFDCount();

    @Keep
    private static native String[] doGetFdDump(int i10, int i11, int[] iArr, String[] strArr);

    @Keep
    private static native long doGetFreeMemory();

    @Keep
    private static native long doGetThreadCpuTime(int i10);

    @Keep
    private static native int doGetThreadsCount();

    @Keep
    private static native long doGetTotalMemory();

    @Keep
    private static native long doGetVMSize();

    @Keep
    private static native void doInitThreadDump();

    @Keep
    private static native int doLock(String str, int i10);

    @Keep
    private static native int doOpenFile(String str);

    @Keep
    private static native void doRebuildTombstone(String str, String str2, String str3);

    @Keep
    private static native void doSetAlogConfigPath(String str);

    @Keep
    private static native void doSetAlogFlushAddr(long j10);

    @Keep
    private static native void doSetAlogLogDirAddr(long j10);

    @Keep
    private static native void doSetResendSigQuit(int i10);

    @Keep
    private static native void doSetUploadEnd();

    @Keep
    private static native void doSignalMainThread();

    @Keep
    private static native int doStart(int i10, String str, String str2, String str3, int i11);

    @Keep
    private static native void doStartAnrMonitor(int i10);

    @Keep
    private static native void doWriteFile(int i10, String str, int i11);

    public static boolean e() {
        if (!f7983a) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean f() {
        if (!f7983a) {
            return false;
        }
        try {
            return is64Bit();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void g() {
        new Thread(new Runnable() { // from class: com.apm.insight.nativecrash.NativeImpl.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    NativeImpl.l();
                } catch (Throwable th2) {
                    try {
                        com.apm.insight.c.a(th2, "NPTH_ANR_MONITOR_ERROR");
                    } catch (Throwable unused) {
                    }
                }
            }
        }, "NPTH-AnrMonitor").start();
    }

    public static int h(String str) {
        if (!f7983a) {
            return -1;
        }
        try {
            return doOpenFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Keep
    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    public static void i(String str) {
        if (f7983a) {
            doDump(str);
        }
    }

    @Keep
    private static native boolean is64Bit();

    public static void j() {
        if (f7983a) {
            doSetUploadEnd();
        }
    }

    public static void k() {
        if (f7983a) {
            doInitThreadDump();
        }
    }

    static /* synthetic */ void l() {
        if (f7983a) {
            try {
                doStartAnrMonitor(Build.VERSION.SDK_INT);
            } catch (Throwable unused) {
            }
        }
    }

    @Keep
    private static void reportEventForAnrMonitor() {
        try {
            System.currentTimeMillis();
            e.j();
            d.c();
            f.a(e.g()).a().e();
        } catch (Throwable unused) {
        }
    }

    public static int c(String str) {
        if (f7983a && !TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static void d(String str) {
        if (f7983a) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(long j10) {
        if (f7983a) {
            try {
                doSetAlogLogDirAddr(j10);
            } catch (Throwable unused) {
            }
        }
    }

    public static void e(String str) {
        if (f7983a) {
            try {
                doDumpFds(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void f(String str) {
        if (f7983a) {
            try {
                doDumpMaps(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean h() {
        return f7985c;
    }

    public static void i() {
        if (f7983a) {
            doSignalMainThread();
        }
    }

    public static void g(String str) {
        if (f7983a) {
            try {
                doDumpThreads(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(String str) {
        if (f7983a) {
            doDumpHprof(str);
        }
    }

    public static boolean a(@NonNull Context context) {
        String strA;
        boolean zA = a();
        if (zA) {
            String str = j.j(context) + "/apminsight";
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libapminsightb.so").exists()) {
                strA = context.getApplicationInfo().nativeLibraryDir;
            } else {
                strA = com.apm.insight.h.b.a();
                com.apm.insight.h.b.b("apminsightb");
            }
            doStart(Build.VERSION.SDK_INT, strA, str, e.f(), e.m());
        }
        return zA;
    }

    public static void b(int i10) {
        if (f7983a) {
            try {
                doCloseFile(i10);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(long j10) {
        if (f7983a) {
            try {
                doSetAlogFlushAddr(j10);
            } catch (Throwable unused) {
            }
        }
    }

    public static String a(String str) {
        if (f7983a) {
            return doGetCrashHeader(str);
        }
        return null;
    }

    public static void a(File file) {
        if (f7983a) {
            doRebuildTombstone(j.c(file).getAbsolutePath(), j.b(file).getAbsolutePath(), j.d(file).getAbsolutePath());
        }
    }

    public static int a(int i10) {
        if (f7983a && i10 >= 0) {
            try {
                return doLock("", i10);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static void a(String str, String str2, String str3) {
        if (f7983a) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(int i10, String str) {
        if (!f7983a || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            doWriteFile(i10, str, str.length());
        } catch (Throwable unused) {
        }
    }

    public static void a(boolean z10) {
        f7985c = z10;
        if (f7983a) {
            doSetResendSigQuit(z10 ? 1 : 0);
        }
    }
}
