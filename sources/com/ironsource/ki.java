package com.ironsource;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class ki {
    public static /* synthetic */ void a(Kf kf2, Runnable runnable, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        kf2.a(runnable, j10);
    }
}
