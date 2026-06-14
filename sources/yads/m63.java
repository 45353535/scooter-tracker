package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class m63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f113333a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f113334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f113336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f113339g;

    public final void a(z43 z43Var, long j10, int i10, int i11, int i12, y43 y43Var) {
        if (!(this.f113339g <= i11 + i12)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f113334b) {
            int i13 = this.f113335c;
            int i14 = i13 + 1;
            this.f113335c = i14;
            if (i13 == 0) {
                this.f113336d = j10;
                this.f113337e = i10;
                this.f113338f = 0;
            }
            int i15 = this.f113338f + i11;
            this.f113338f = i15;
            this.f113339g = i12;
            if (i14 < 16 || i14 <= 0) {
                return;
            }
            z43Var.a(this.f113336d, this.f113337e, i15, i12, y43Var);
            this.f113335c = 0;
        }
    }

    public final void a(yo0 yo0Var) {
        if (this.f113334b) {
            return;
        }
        yo0Var.a(this.f113333a, 0, 10);
        yo0Var.d();
        byte[] bArr = this.f113333a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) != 186) {
                return;
            }
            if ((40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7)) == 0) {
                return;
            }
            this.f113334b = true;
        }
    }
}
