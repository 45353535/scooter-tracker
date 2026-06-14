package com.yandex.div.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.internal.Assert;

/* JADX INFO: loaded from: classes11.dex */
public abstract class Assert {

    @NonNull
    private static AssertionErrorHandler sAssertionErrorHandler = new AssertionErrorHandler() { // from class: x7.a
        @Override // com.yandex.div.internal.AssertionErrorHandler
        public final void handleError(AssertionError assertionError) {
            Assert.a(assertionError);
        }
    };
    private static volatile boolean sEnabled = false;

    public static void assertEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            if (!(obj instanceof String) || !(obj2 instanceof String)) {
                failNotEquals(str, obj, obj2);
                return;
            }
            if (str == null) {
                str = "";
            }
            performFail(new ComparisonFailure(str, (String) obj, (String) obj2));
        }
    }

    public static void assertMainThread() {
        if (isEnabled()) {
            assertSame("Code run not in main thread!", Looper.getMainLooper(), Looper.myLooper());
        }
    }

    public static void assertNull(@Nullable String str, @Nullable Object obj) {
        assertTrue(str, obj == null);
    }

    public static void assertSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2) {
            return;
        }
        failNotSame(str, obj, obj2);
    }

    public static void assertTrue(@Nullable String str, boolean z10) {
        if (z10) {
            return;
        }
        fail(str);
    }

    public static void fail(@Nullable String str) {
        if (sEnabled) {
            if (str == null) {
                str = "";
            }
            performFail(new AssertionError(str));
        }
    }

    private static void failNotEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        fail(format(str, obj, obj2));
    }

    private static void failNotSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        fail(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    static String format(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        String str2 = "";
        if (str != null && !str.equals("")) {
            str2 = str + " ";
        }
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        if (strValueOf.equals(strValueOf2)) {
            return str2 + "expected: " + formatClassAndValue(obj, strValueOf) + " but was: " + formatClassAndValue(obj2, strValueOf2);
        }
        return str2 + "expected:<" + strValueOf + "> but was:<" + strValueOf2 + ">";
    }

    private static String formatClassAndValue(@Nullable Object obj, @Nullable String str) {
        return (obj == null ? "null" : obj.getClass().getName()) + "<" + str + ">";
    }

    public static boolean isEnabled() {
        return sEnabled;
    }

    private static void performFail(@NonNull AssertionError assertionError) {
        if (isEnabled()) {
            sAssertionErrorHandler.handleError(assertionError);
        }
    }

    public static void assertNull(@Nullable Object obj) {
        assertNull(null, obj);
    }

    public static void assertTrue(boolean z10) {
        assertTrue(null, z10);
    }

    public static void fail(@Nullable String str, @Nullable Throwable th2) {
        if (sEnabled) {
            AssertionError assertionError = new AssertionError(str);
            assertionError.initCause(th2);
            performFail(assertionError);
        }
    }

    public static /* synthetic */ void a(AssertionError assertionError) {
        throw assertionError;
    }
}
