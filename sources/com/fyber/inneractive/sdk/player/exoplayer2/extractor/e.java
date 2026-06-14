package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21758i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21759j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21760k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21761l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f21766q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21767r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21750a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f21751b = new int[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f21752c = new long[1000];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long[] f21755f = new long[1000];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f21754e = new int[1000];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f21753d = new int[1000];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[][] f21756g = new byte[1000][];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] f21757h = new com.fyber.inneractive.sdk.player.exoplayer2.o[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f21762m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f21763n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21765p = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21764o = true;

    public final synchronized void a(long j10, int i10, long j11, int i11, byte[] bArr) {
        try {
            if (this.f21764o) {
                if ((i10 & 1) == 0) {
                    return;
                } else {
                    this.f21764o = false;
                }
            }
            if (this.f21765p) {
                throw new IllegalStateException();
            }
            b(j10);
            long[] jArr = this.f21755f;
            int i12 = this.f21761l;
            jArr[i12] = j10;
            long[] jArr2 = this.f21752c;
            jArr2[i12] = j11;
            this.f21753d[i12] = i11;
            this.f21754e[i12] = i10;
            this.f21756g[i12] = bArr;
            this.f21757h[i12] = this.f21766q;
            this.f21751b[i12] = this.f21767r;
            int i13 = this.f21758i + 1;
            this.f21758i = i13;
            int i14 = this.f21750a;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                int[] iArr = new int[i15];
                long[] jArr3 = new long[i15];
                long[] jArr4 = new long[i15];
                int[] iArr2 = new int[i15];
                int[] iArr3 = new int[i15];
                byte[][] bArr2 = new byte[i15][];
                com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i15];
                int i16 = this.f21760k;
                int i17 = i14 - i16;
                System.arraycopy(jArr2, i16, jArr3, 0, i17);
                System.arraycopy(this.f21755f, this.f21760k, jArr4, 0, i17);
                System.arraycopy(this.f21754e, this.f21760k, iArr2, 0, i17);
                System.arraycopy(this.f21753d, this.f21760k, iArr3, 0, i17);
                System.arraycopy(this.f21756g, this.f21760k, bArr2, 0, i17);
                System.arraycopy(this.f21757h, this.f21760k, oVarArr, 0, i17);
                System.arraycopy(this.f21751b, this.f21760k, iArr, 0, i17);
                int i18 = this.f21760k;
                System.arraycopy(this.f21752c, 0, jArr3, i17, i18);
                System.arraycopy(this.f21755f, 0, jArr4, i17, i18);
                System.arraycopy(this.f21754e, 0, iArr2, i17, i18);
                System.arraycopy(this.f21753d, 0, iArr3, i17, i18);
                System.arraycopy(this.f21756g, 0, bArr2, i17, i18);
                System.arraycopy(this.f21757h, 0, oVarArr, i17, i18);
                System.arraycopy(this.f21751b, 0, iArr, i17, i18);
                this.f21752c = jArr3;
                this.f21755f = jArr4;
                this.f21754e = iArr2;
                this.f21753d = iArr3;
                this.f21756g = bArr2;
                this.f21757h = oVarArr;
                this.f21751b = iArr;
                this.f21760k = 0;
                int i19 = this.f21750a;
                this.f21761l = i19;
                this.f21758i = i19;
                this.f21750a = i15;
            } else {
                int i20 = i12 + 1;
                this.f21761l = i20;
                if (i20 == i14) {
                    this.f21761l = 0;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(long j10) {
        this.f21763n = Math.max(this.f21763n, j10);
    }

    public final synchronized boolean a(long j10) {
        try {
            if (this.f21762m >= j10) {
                return false;
            }
            int i10 = this.f21758i;
            while (i10 > 0 && this.f21755f[((this.f21760k + i10) - 1) % this.f21750a] >= j10) {
                i10--;
            }
            int i11 = this.f21759j;
            int i12 = this.f21758i;
            int i13 = (i11 + i12) - (i10 + i11);
            if (i13 < 0 || i13 > i12) {
                throw new IllegalArgumentException();
            }
            if (i13 != 0) {
                int i14 = i12 - i13;
                this.f21758i = i14;
                int i15 = this.f21761l;
                int i16 = this.f21750a;
                this.f21761l = ((i15 + i16) - i13) % i16;
                this.f21763n = Long.MIN_VALUE;
                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                    int i18 = (this.f21760k + i17) % this.f21750a;
                    this.f21763n = Math.max(this.f21763n, this.f21755f[i18]);
                    if ((this.f21754e[i18] & 1) != 0) {
                        break;
                    }
                }
                long j11 = this.f21752c[this.f21761l];
            } else if (i11 != 0) {
                int i19 = this.f21761l;
                if (i19 == 0) {
                    i19 = this.f21750a;
                }
                int i20 = i19 - 1;
                long j12 = this.f21752c[i20];
                int i21 = this.f21753d[i20];
            }
            return true;
        } finally {
        }
    }
}
