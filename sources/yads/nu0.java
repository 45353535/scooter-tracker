package yads;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class nu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f114037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f114038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f114039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f114040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f114041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f114042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f114043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mu0 f114044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fr1 f114045l;

    public nu0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, mu0 mu0Var, fr1 fr1Var) {
        this.f114034a = i10;
        this.f114035b = i11;
        this.f114036c = i12;
        this.f114037d = i13;
        this.f114038e = i14;
        this.f114039f = b(i14);
        this.f114040g = i15;
        this.f114041h = i16;
        this.f114042i = a(i16);
        this.f114043j = j10;
        this.f114044k = mu0Var;
        this.f114045l = fr1Var;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j10;
        long j11;
        int i10 = this.f114037d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f114036c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f114034a;
            j10 = ((((i11 != this.f114035b || i11 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i11) * ((long) this.f114040g)) * ((long) this.f114041h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public final long b() {
        long j10 = this.f114043j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f114038e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.yv0 a(byte[] r4, yads.fr1 r5) {
        /*
            r3 = this;
            r0 = 4
            r1 = -128(0xffffffffffffff80, float:NaN)
            r4[r0] = r1
            int r0 = r3.f114037d
            if (r0 <= 0) goto La
            goto Lb
        La:
            r0 = -1
        Lb:
            yads.fr1 r1 = r3.f114045l
            if (r1 != 0) goto L10
            goto L28
        L10:
            if (r5 != 0) goto L13
            goto L18
        L13:
            yads.er1[] r5 = r5.f110835b
            int r2 = r5.length
            if (r2 != 0) goto L1a
        L18:
            r5 = r1
            goto L28
        L1a:
            yads.fr1 r2 = new yads.fr1
            yads.er1[] r1 = r1.f110835b
            java.lang.Object[] r5 = yads.w83.a(r1, r5)
            yads.er1[] r5 = (yads.er1[]) r5
            r2.<init>(r5)
            r5 = r2
        L28:
            yads.xv0 r1 = new yads.xv0
            r1.<init>()
            java.lang.String r2 = "audio/flac"
            r1.f117982k = r2
            r1.f117983l = r0
            int r0 = r3.f114040g
            r1.f117995x = r0
            int r0 = r3.f114038e
            r1.f117996y = r0
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r1.f117984m = r4
            r1.f117980i = r5
            yads.yv0 r4 = new yads.yv0
            r4.<init>(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.nu0.a(byte[], yads.fr1):yads.yv0");
    }

    public nu0(int i10, byte[] bArr) {
        v92 v92Var = new v92(bArr);
        v92Var.b(i10 * 8);
        this.f114034a = v92Var.a(16);
        this.f114035b = v92Var.a(16);
        this.f114036c = v92Var.a(24);
        this.f114037d = v92Var.a(24);
        int iA = v92Var.a(20);
        this.f114038e = iA;
        this.f114039f = b(iA);
        this.f114040g = v92Var.a(3) + 1;
        int iA2 = v92Var.a(5) + 1;
        this.f114041h = iA2;
        this.f114042i = a(iA2);
        this.f114043j = v92Var.f();
        this.f114044k = null;
        this.f114045l = null;
    }

    public final long a(long j10) {
        long j11 = (j10 * ((long) this.f114038e)) / 1000000;
        long j12 = this.f114043j - 1;
        int i10 = w83.f117341a;
        return Math.max(0L, Math.min(j11, j12));
    }
}
