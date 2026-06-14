package androidx.test.internal.util;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.test.internal.util.ProcSummary;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class LogUtil {
    private static volatile String myProcName;

    public interface Supplier {
        String get();
    }

    public static /* synthetic */ String a(String str) {
        return str;
    }

    public static /* synthetic */ String b(String str) {
        return str + " in " + procName();
    }

    private static boolean isLoggable(String str, int i10) {
        if (str.length() > 23) {
            str = str.substring(0, 22);
        }
        return Log.isLoggable(str, i10);
    }

    public static Supplier lazyArg(Supplier supplier) {
        return supplier;
    }

    public static void logDebug(String str, final String str2, Object... objArr) {
        logDebug(str, new Supplier() { // from class: androidx.test.internal.util.c
            @Override // androidx.test.internal.util.LogUtil.Supplier
            public final String get() {
                return LogUtil.a(str2);
            }
        }, objArr);
    }

    public static void logDebugWithProcess(String str, final String str2, Object... objArr) {
        logDebug(str, new Supplier() { // from class: androidx.test.internal.util.b
            @Override // androidx.test.internal.util.LogUtil.Supplier
            public final String get() {
                return LogUtil.b(str2);
            }
        }, objArr);
    }

    private static final String procName() {
        String str;
        String str2 = myProcName;
        if (str2 != null) {
            return str2;
        }
        try {
            str = ProcSummary.summarize("self").cmdline;
        } catch (ProcSummary.SummaryException unused) {
            str = "unknown";
        }
        return (str.length() <= 64 || !str.contains("-classpath")) ? str : "robolectric";
    }

    private static void logDebug(String str, Supplier supplier, Object... objArr) {
        if (isLoggable(str, 3)) {
            Object[] objArr2 = new Object[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                Object obj = objArr[i10];
                if (obj instanceof Supplier) {
                    objArr2[i10] = ((Supplier) obj).get();
                } else {
                    objArr2[i10] = obj;
                }
            }
            Log.d(str, String.format(supplier.get(), objArr2));
        }
    }
}
