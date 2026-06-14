package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 56 + strValueOf2.length() + 1);
        sb2.append("checkMainThread: current thread ");
        sb2.append(strValueOf);
        sb2.append(" IS NOT the main thread ");
        sb2.append(strValueOf2);
        sb2.append("!");
        Log.e("Asserts", sb2.toString());
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 55 + strValueOf2.length() + 1);
        sb2.append("checkNotMainThread: current thread ");
        sb2.append(strValueOf);
        sb2.append(" IS the main thread ");
        sb2.append(strValueOf2);
        sb2.append("!");
        Log.e("Asserts", sb2.toString());
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @KeepForSdk
    public static void checkNull(Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @KeepForSdk
    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    public static void checkNotNull(Object obj, @NonNull Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @KeepForSdk
    public static void checkNull(Object obj, @NonNull Object obj2) {
        if (obj != null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z10, @NonNull Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
