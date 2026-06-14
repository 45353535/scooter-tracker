package eg;

import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements p0, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f69152b = new g1();

    private g1() {
    }

    @Override // eg.n
    public boolean a(Throwable th2) {
        return false;
    }

    @Override // eg.n
    public Job getParent() {
        return null;
    }

    public String toString() {
        return "NonDisposableHandle";
    }

    @Override // eg.p0
    public void dispose() {
    }
}
