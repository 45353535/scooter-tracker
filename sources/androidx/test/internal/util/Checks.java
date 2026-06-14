package androidx.test.internal.util;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.internal.platform.ThreadChecker;
import androidx.test.internal.util.Checks;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Checks {

    /* JADX INFO: Access modifiers changed from: private */
    static class ThreadCheckerSingleton {
        private static final ThreadChecker INSTANCE = (ThreadChecker) ServiceLoaderWrapper.loadSingleService(ThreadChecker.class, new ServiceLoaderWrapper.Factory() { // from class: androidx.test.internal.util.a
            @Override // androidx.test.internal.platform.ServiceLoaderWrapper.Factory
            public final Object create() {
                return Checks.ThreadCheckerSingleton.a();
            }
        });

        private ThreadCheckerSingleton() {
        }

        public static /* synthetic */ ThreadChecker a() {
            return new ThreadChecker() { // from class: androidx.test.internal.util.Checks.ThreadCheckerSingleton.1
                @Override // androidx.test.internal.platform.ThreadChecker
                public void checkMainThread() {
                    Checks.checkState(Thread.currentThread().equals(Looper.getMainLooper().getThread()), "Method cannot be called off the main application thread (on: %s)", Thread.currentThread().getName());
                }

                @Override // androidx.test.internal.platform.ThreadChecker
                public void checkNotMainThread() {
                    Checks.checkState(!Thread.currentThread().equals(Looper.getMainLooper().getThread()), "Method cannot be called on the main application thread (on: %s)", Thread.currentThread().getName());
                }
            };
        }
    }

    private Checks() {
    }

    public static void checkArgument(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkMainThread() {
        ThreadCheckerSingleton.INSTANCE.checkMainThread();
    }

    public static void checkNotMainThread() {
        ThreadCheckerSingleton.INSTANCE.checkNotMainThread();
    }

    @NonNull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t10) {
        t10.getClass();
        return t10;
    }

    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    private static String format(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (i10 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i11)) != -1) {
            sb2.append(strValueOf.substring(i11, iIndexOf));
            sb2.append(objArr[i10]);
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append(strValueOf.substring(i11));
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i12 = i10 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void checkArgument(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @NonNull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, objArr));
        }
    }

    @NonNull
    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t10, String str, Object... objArr) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, objArr));
    }

    public static void checkState(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(format(str, objArr));
        }
    }
}
