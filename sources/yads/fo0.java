package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class fo0 implements d23 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f110810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y31 f110811c;

    public fo0(long j10, nk2 nk2Var) {
        this.f110810b = j10;
        this.f110811c = nk2Var;
    }

    @Override // yads.d23
    public final int a() {
        return 1;
    }

    @Override // yads.d23
    public final List b(long j10) {
        if (j10 >= this.f110810b) {
            return this.f110811c;
        }
        v31 v31Var = y31.f118068c;
        return nk2.f113952f;
    }

    @Override // yads.d23
    public final long a(int i10) {
        if (i10 == 0) {
            return this.f110810b;
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.d23
    public final int a(long j10) {
        return this.f110810b > j10 ? 0 : -1;
    }
}
