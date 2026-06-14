package yads;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* JADX INFO: loaded from: classes4.dex */
public final class ok3 implements pk3 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f114348m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f114349n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap0 f114350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z43 f114351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sk3 f114352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f114353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f114354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w92 f114355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f114356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yv0 f114357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f114358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f114359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f114360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f114361l;

    public ok3(ap0 ap0Var, z43 z43Var, sk3 sk3Var) throws ba2 {
        this.f114350a = ap0Var;
        this.f114351b = z43Var;
        this.f114352c = sk3Var;
        int iMax = Math.max(1, sk3Var.f115845b / 10);
        this.f114356g = iMax;
        w92 w92Var = new w92(sk3Var.f115848e);
        w92Var.h();
        int iH = w92Var.h();
        this.f114353d = iH;
        int i10 = sk3Var.f115844a;
        int i11 = (((sk3Var.f115846c - (i10 * 4)) * 8) / (sk3Var.f115847d * i10)) + 1;
        if (iH != i11) {
            throw ba2.a("Expected frames per block: " + i11 + "; got: " + iH);
        }
        int iA = w83.a(iMax, iH);
        this.f114354e = new byte[sk3Var.f115846c * iA];
        this.f114355f = new w92(a(iH, i10) * iA);
        int i12 = ((sk3Var.f115845b * sk3Var.f115846c) * 8) / iH;
        this.f114357h = new xv0().d("audio/raw").a(i12).e(i12).c(a(iMax, i10)).b(sk3Var.f115844a).g(sk3Var.f115845b).d(2).a();
    }

    public static int a(int i10, int i11) {
        return i10 * 2 * i11;
    }

    @Override // yads.pk3
    public final void a(int i10, long j10) {
        this.f114350a.a(new vk3(this.f114352c, this.f114353d, i10, j10));
        this.f114351b.a(this.f114357h);
    }

    @Override // yads.pk3
    public final void a(long j10) {
        this.f114358i = 0;
        this.f114359j = j10;
        this.f114360k = 0;
        this.f114361l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:11:0x0040). Please report as a decompilation issue!!! */
    @Override // yads.pk3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(yads.yc0 r20, long r21) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ok3.a(yads.yc0, long):boolean");
    }
}
