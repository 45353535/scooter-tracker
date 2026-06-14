package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class co implements ki1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f109491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f109492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f109493d;

    public co(long j10, long j11) {
        this.f109491b = j10;
        this.f109492c = j11;
        c();
    }

    public final void c() {
        this.f109493d = this.f109491b - 1;
    }

    @Override // yads.ki1
    public final boolean next() {
        long j10 = this.f109493d + 1;
        this.f109493d = j10;
        return !(j10 > this.f109492c);
    }
}
