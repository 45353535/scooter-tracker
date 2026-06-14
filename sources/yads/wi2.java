package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class wi2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f117468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f117469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f117470e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l43 f117466a = new l43(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f117471f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f117472g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f117473h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f117467b = new w92();

    public static long a(w92 w92Var) {
        int i10 = w92Var.f117357b;
        if (w92Var.f117358c - i10 < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        w92Var.a(bArr, 0, 9);
        w92Var.e(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }
}
