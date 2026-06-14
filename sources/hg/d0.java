package hg;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends ig.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f73202a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Continuation f73203b;

    @Override // ig.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(b0 b0Var) {
        if (this.f73202a >= 0) {
            return false;
        }
        this.f73202a = b0Var.X();
        return true;
    }

    @Override // ig.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Continuation[] b(b0 b0Var) {
        long j10 = this.f73202a;
        this.f73202a = -1L;
        this.f73203b = null;
        return b0Var.W(j10);
    }
}
