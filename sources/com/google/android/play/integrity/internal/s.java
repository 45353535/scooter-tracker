package com.google.android.play.integrity.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28785a;

    public s(String str) {
        this.f28785a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    private static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + C4240b4.j.f42674e;
            }
        }
        return str + " : " + str2;
    }

    public final int a(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", f(this.f28785a, str, objArr));
        }
        return 0;
    }

    public final int b(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f28785a, str, objArr));
        }
        return 0;
    }

    public final int c(Throwable th2, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", f(this.f28785a, str, objArr), th2);
        }
        return 0;
    }

    public final int d(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", f(this.f28785a, str, objArr));
        }
        return 0;
    }

    public final int e(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", f(this.f28785a, str, objArr));
        }
        return 0;
    }
}
