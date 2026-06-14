package yads;

import com.amazon.device.ads.DtbConstants;
import com.google.common.primitives.SignedBytes;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f112899a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, DtbConstants.DEFAULT_PLAYER_HEIGHT, 400, 400, 2048};

    public static void a(int i10, w92 w92Var) {
        w92Var.c(7);
        byte[] bArr = w92Var.f117356a;
        bArr[0] = -84;
        bArr[1] = SignedBytes.MAX_POWER_OF_TWO;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.k0 a(yads.v92 r9) {
        /*
            r0 = 16
            int r1 = r9.a(r0)
            int r0 = r9.a(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.a(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.a(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.a(r1)
            boolean r2 = r9.e()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.a(r2)
            boolean r5 = r9.e()
            if (r5 == 0) goto L47
            int r5 = r9.a(r4)
            if (r5 <= 0) goto L47
            r9.c(r1)
        L47:
            boolean r5 = r9.e()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.a(r3)
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            int[] r1 = yads.l0.f112899a
            r9 = r1[r9]
            goto L96
        L65:
            if (r5 != r7) goto L95
            int[] r6 = yads.l0.f112899a
            r7 = 14
            if (r9 >= r7) goto L95
            r6 = r6[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7f
            goto L90
        L7f:
            if (r9 == r4) goto L92
            if (r9 == r8) goto L92
            if (r9 != r7) goto L90
            goto L92
        L86:
            if (r9 == r8) goto L92
            if (r9 != r7) goto L90
            goto L92
        L8b:
            if (r9 == r4) goto L92
            if (r9 != r8) goto L90
            goto L92
        L90:
            r9 = r6
            goto L96
        L92:
            int r9 = r6 + 1
            goto L96
        L95:
            r9 = 0
        L96:
            yads.k0 r1 = new yads.k0
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.l0.a(yads.v92):yads.k0");
    }
}
