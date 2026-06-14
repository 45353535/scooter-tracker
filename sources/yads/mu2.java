package yads;

/* JADX INFO: loaded from: classes4.dex */
public class mu2 implements nu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f113612b;

    public mu2() {
        this(-9223372036854775807L, 0L);
    }

    @Override // yads.nu2
    public final boolean b() {
        return false;
    }

    @Override // yads.nu2
    public final long c() {
        return this.f113611a;
    }

    public mu2(long j10, long j11) {
        this.f113611a = j10;
        this.f113612b = new lu2(j11 == 0 ? pu2.f114788c : new pu2(0L, j11));
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        return this.f113612b;
    }
}
