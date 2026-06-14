package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lj2 f118839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f118840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f118841c;

    public zu2(lj2 lj2Var, long j10, long j11) {
        this.f118839a = lj2Var;
        this.f118840b = j10;
        this.f118841c = j11;
    }

    public lj2 a(gm2 gm2Var) {
        return this.f118839a;
    }

    public final long a() {
        return w83.a(this.f118841c, 1000000L, this.f118840b);
    }
}
