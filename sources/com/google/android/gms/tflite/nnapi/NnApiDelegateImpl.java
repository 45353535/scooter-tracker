package com.google.android.gms.tflite.nnapi;

import ci.a;
import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.b;

/* JADX INFO: loaded from: classes8.dex */
public class NnApiDelegateImpl implements a.b, b, AutoCloseable {
    private long zza;

    public NnApiDelegateImpl(a.C0154a c0154a) {
        TensorFlowLite.a();
        int iD = c0154a.d();
        String strA = c0154a.a();
        String strC = c0154a.c();
        String strF = c0154a.f();
        int iE = c0154a.e();
        Boolean boolH = c0154a.h();
        this.zza = createDelegate(iD, strA, strC, strF, iE, boolH != null, c0154a.h() == null || !c0154a.h().booleanValue(), c0154a.b(), c0154a.g());
    }

    private static native long createDelegate(int i10, String str, String str2, String str3, int i11, boolean z10, boolean z11, boolean z12, long j10);

    private static native void deleteDelegate(long j10);

    private static native int getNnapiErrno(long j10);

    @Override // ci.a.b, org.tensorflow.lite.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j10 = this.zza;
        if (j10 != 0) {
            deleteDelegate(j10);
            this.zza = 0L;
        }
    }

    @Override // org.tensorflow.lite.b
    public final long getNativeHandle() {
        return this.zza;
    }

    public final int getNnapiErrno() {
        long j10 = this.zza;
        if (j10 != 0) {
            return getNnapiErrno(j10);
        }
        throw new IllegalStateException("Should not access delegate after it has been closed.");
    }
}
