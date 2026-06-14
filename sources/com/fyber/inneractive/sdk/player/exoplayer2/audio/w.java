package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final short[] f21673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public short[] f21675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f21677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f21679l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21687t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f21689v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21691x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21680m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21681n = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21688u = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f21682o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f21683p = 1.0f;

    public w(int i10, int i11) {
        this.f21668a = i10;
        this.f21669b = i11;
        this.f21670c = i10 / 400;
        int i12 = i10 / 65;
        this.f21671d = i12;
        int i13 = i12 * 2;
        this.f21672e = i13;
        this.f21673f = new short[i13];
        this.f21674g = i13;
        int i14 = i11 * i13;
        this.f21675h = new short[i14];
        this.f21676i = i13;
        this.f21677j = new short[i14];
        this.f21678k = i13;
        this.f21679l = new short[i14];
    }

    public final void a(int i10) {
        int i11 = this.f21684q + i10;
        int i12 = this.f21674g;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f21674g = i13;
            this.f21675h = Arrays.copyOf(this.f21675h, i13 * this.f21669b);
        }
    }

    public final void b(int i10) {
        int i11 = this.f21685r + i10;
        int i12 = this.f21676i;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f21676i = i13;
            this.f21677j = Arrays.copyOf(this.f21677j, i13 * this.f21669b);
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        int i12 = this.f21672e / i11;
        int i13 = this.f21669b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f21673f[i16] = (short) (i17 / i14);
        }
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f21669b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                short s10 = sArr[i13 + i19];
                short s11 = sArr[i13 + i11 + i19];
                i18 += s10 >= s11 ? s10 - s11 : s11 - s10;
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f21690w = i15 / i16;
        this.f21691x = i17 / i14;
        return i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0253 A[LOOP:4: B:13:0x0048->B:103:0x0253, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0175 A[EDGE_INSN: B:113:0x0175->B:65:0x0175 BREAK  A[LOOP:4: B:13:0x0048->B:103:0x0253], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.w.a():void");
    }

    public static void a(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }
}
