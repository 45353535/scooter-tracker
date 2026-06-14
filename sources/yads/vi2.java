package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class vi2 extends lp {
    public vi2(l43 l43Var, long j10, long j11) {
        super(new gp(), new ui2(l43Var), j10, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
