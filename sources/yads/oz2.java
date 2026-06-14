package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class oz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f114458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f114459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f114460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f114461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f114462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f114463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f114464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f114465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f114466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f114467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f114468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f114469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f114470o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f114471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f114472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f114473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f114474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f114475t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f114476u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f114477v;

    public oz2(int i10, int i11, float f10, float f11, int i12) {
        this.f114456a = i10;
        this.f114457b = i11;
        this.f114458c = f10;
        this.f114459d = f11;
        this.f114460e = i10 / i12;
        this.f114461f = i10 / 400;
        int i13 = i10 / 65;
        this.f114462g = i13;
        int i14 = i13 * 2;
        this.f114463h = i14;
        this.f114464i = new short[i14];
        int i15 = i14 * i11;
        this.f114465j = new short[i15];
        this.f114467l = new short[i15];
        this.f114469n = new short[i15];
    }

    public final void a(short[] sArr, int i10, int i11) {
        int i12 = this.f114463h / i11;
        int i13 = this.f114457b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f114464i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] b(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f114457b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f114457b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f114476u = i15 / i16;
        this.f114477v = i17 / i14;
        return i16;
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0262 A[LOOP:4: B:13:0x004c->B:100:0x0262, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018f A[EDGE_INSN: B:110:0x018f->B:65:0x018f BREAK  A[LOOP:4: B:13:0x004c->B:100:0x0262], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.oz2.a():void");
    }
}
