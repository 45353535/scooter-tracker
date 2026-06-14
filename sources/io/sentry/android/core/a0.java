package io.sentry.android.core;

import android.os.Debug;
import io.sentry.s3;

/* JADX INFO: loaded from: classes3.dex */
public class a0 implements io.sentry.w0 {
    @Override // io.sentry.w0
    public void c() {
    }

    @Override // io.sentry.w0
    public void d(s3 s3Var) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        s3Var.f(Long.valueOf(jFreeMemory));
        s3Var.g(Long.valueOf(nativeHeapSize));
    }
}
