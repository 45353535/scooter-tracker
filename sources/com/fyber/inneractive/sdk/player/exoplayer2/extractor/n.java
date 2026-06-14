package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f22296h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f22297i = {44100, 48000, 32000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f22298j = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f22299k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f22300l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f22301m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f22302n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22309g;

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f22297i[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f22298j[i13 - 1] : f22299k[i13 - 1]) * 12000) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f22300l[i13 - 1] : f22301m[i13 - 1] : f22302n[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144000) / i15) + i16;
        }
        return (((i12 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i17) / i15) + i16;
    }

    public static boolean a(int i10, n nVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i19 = f22297i[i14];
        if (i11 == 2) {
            i19 /= 2;
        } else if (i11 == 0) {
            i19 /= 4;
        }
        int i20 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            i15 = i11 == 3 ? f22298j[i13 - 1] : f22299k[i13 - 1];
            i17 = (((i15 * 12000) / i19) + i20) * 4;
            i18 = 384;
        } else {
            if (i11 == 3) {
                i15 = i12 == 2 ? f22300l[i13 - 1] : f22301m[i13 - 1];
                i16 = (144000 * i15) / i19;
            } else {
                i15 = f22302n[i13 - 1];
                i = i12 == 1 ? 576 : 1152;
                i16 = ((i12 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i15) / i19;
            }
            i17 = i16 + i20;
            i18 = i;
        }
        String str = f22296h[3 - i12];
        int i21 = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        nVar.f22303a = i11;
        nVar.f22304b = str;
        nVar.f22305c = i17;
        nVar.f22306d = i19;
        nVar.f22307e = i21;
        nVar.f22308f = i15 * 1000;
        nVar.f22309g = i18;
        return true;
    }
}
