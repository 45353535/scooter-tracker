package ng;

import jg.e0;
import jg.h0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f96142a = h0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e0 f96143b = new e0("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e0 f96144c = new e0("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e0 f96145d = new e0("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e0 f96146e = new e0("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f96147f = h0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static final g a(int i10, int i11) {
        return new j(i10, i11);
    }

    public static /* synthetic */ g b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l j(long j10, l lVar) {
        return new l(j10, lVar, 0);
    }
}
