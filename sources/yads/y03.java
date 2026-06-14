package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class y03 implements yo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo0 f118046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f118047b;

    public y03(yc0 yc0Var, long j10) {
        this.f118046a = yc0Var;
        fi.a(yc0Var.a() >= j10);
        this.f118047b = j10;
    }

    @Override // yads.yo0
    public final long a() {
        return this.f118046a.a() - this.f118047b;
    }

    @Override // yads.yo0
    public final void b(int i10) {
        this.f118046a.b(i10);
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) {
        return this.f118046a.c(bArr, i10, i11);
    }

    @Override // yads.yo0
    public final void d() {
        this.f118046a.d();
    }

    @Override // yads.yo0
    public final long f() {
        return this.f118046a.f() - this.f118047b;
    }

    @Override // yads.yo0
    public final long b() {
        return this.f118046a.b() - this.f118047b;
    }

    @Override // yads.yo0
    public final void a(byte[] bArr, int i10, int i11) {
        this.f118046a.a(bArr, i10, i11);
    }

    @Override // yads.yo0
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f118046a.a(bArr, i10, i11, z10);
    }

    @Override // yads.yo0
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f118046a.b(bArr, i10, i11, z10);
    }

    @Override // yads.yo0
    public final void a(int i10) {
        this.f118046a.a(i10);
    }

    @Override // yads.yo0
    public final void b(byte[] bArr, int i10, int i11) {
        this.f118046a.b(bArr, i10, i11);
    }
}
