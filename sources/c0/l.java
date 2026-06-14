package c0;

import android.os.SystemClock;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f6442a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final File f6443b = new File("/proc/self/fd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6444c = 30;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f6445d = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f6446e = true;

    private l() {
    }

    private final boolean a() {
        int i10 = f6444c;
        f6444c = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > f6445d + ((long) 30000);
    }

    public final synchronized boolean b(q qVar) {
        try {
            if (a()) {
                f6444c = 0;
                f6445d = SystemClock.uptimeMillis();
                String[] list = f6443b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z10 = length < 800;
                f6446e = z10;
                if (!z10 && qVar != null && qVar.getLevel() <= 5) {
                    qVar.a("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f6446e;
    }
}
