package eb;

import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f69010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f69011c;

    private a(long j10, byte[] bArr, long j11) {
        this.f69009a = j11;
        this.f69010b = j10;
        this.f69011c = bArr;
    }

    static a b(d0 d0Var, int i10, long j10) {
        long J = d0Var.J();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        return new a(J, bArr, j10);
    }

    @Override // eb.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f69009a + ", identifier= " + this.f69010b + " }";
    }
}
