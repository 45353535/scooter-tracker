package tc;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ void a(d dVar, ic.f fVar, id.f fVar2, boolean z10, Runnable runnable, Runnable runnable2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareAndAnimate");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        dVar.f(fVar, fVar2, z10, (i10 & 8) != 0 ? null : runnable, (i10 & 16) != 0 ? null : runnable2);
    }
}
