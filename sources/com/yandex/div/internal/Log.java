package com.yandex.div.internal;

import androidx.annotation.NonNull;
import com.yandex.div.logging.Severity;

/* JADX INFO: loaded from: classes11.dex */
public abstract class Log {
    private static volatile boolean sEnabled;
    private static volatile Severity sSeverity = Severity.VERBOSE;

    public static void d(@NonNull String str, @NonNull String str2) {
        if (isAtLeast(Severity.DEBUG)) {
            android.util.Log.d(str, str2);
        }
    }

    public static void e(@NonNull String str, @NonNull String str2) {
        if (isAtLeast(Severity.ERROR)) {
            android.util.Log.e(str, str2);
        }
    }

    static boolean isAtLeast(Severity severity) {
        if (isEnabled()) {
            return sSeverity.isAtLeast(severity);
        }
        return false;
    }

    public static boolean isEnabled() {
        return sEnabled;
    }

    public static void w(@NonNull String str, @NonNull String str2) {
        if (isAtLeast(Severity.WARNING)) {
            android.util.Log.w(str, str2);
        }
    }

    public static void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (isAtLeast(Severity.ERROR)) {
            android.util.Log.e(str, str2, th2);
        }
    }
}
