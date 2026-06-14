package oa;

import com.amazon.device.ads.DtbConstants;
import com.google.common.primitives.SignedBytes;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f96478a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, DtbConstants.DEFAULT_PLAYER_HEIGHT, 400, 400, 2048};

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f96479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f96480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f96481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f96482d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f96483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f96484f;

        private b() {
            this.f96479a = true;
            this.f96480b = -1;
            this.f96481c = -1;
            this.f96482d = true;
            this.f96483e = 2;
            this.f96484f = 0;
        }
    }

    /* JADX INFO: renamed from: oa.c$c, reason: collision with other inner class name */
    public static final class C1110c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f96485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f96486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f96487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f96488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f96489e;

        private C1110c(int i10, int i11, int i12, int i13, int i14) {
            this.f96485a = i10;
            this.f96487c = i11;
            this.f96486b = i12;
            this.f96488d = i13;
            this.f96489e = i14;
        }
    }

    public static void a(int i10, q9.d0 d0Var) {
        d0Var.S(7);
        byte[] bArrE = d0Var.e();
        bArrE[0] = -84;
        bArrE[1] = SignedBytes.MAX_POWER_OF_TWO;
        bArrE[2] = -1;
        bArrE[3] = -1;
        bArrE[4] = (byte) ((i10 >> 16) & 255);
        bArrE[5] = (byte) ((i10 >> 8) & 255);
        bArrE[6] = (byte) (i10 & 255);
    }

    private static int b(int i10, boolean z10, int i11) {
        int iC = c(i10);
        if (i10 != 11 && i10 != 12 && i10 != 13 && i10 != 14) {
            return iC;
        }
        if (!z10) {
            iC -= 2;
        }
        return i11 != 0 ? i11 != 1 ? iC : iC - 2 : iC - 4;
    }

    private static int c(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.bidmachine.media3.common.a d(q9.d0 r19, java.lang.String r20, java.lang.String r21, io.bidmachine.media3.common.DrmInitData r22) throws n9.x {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.c.d(q9.d0, java.lang.String, java.lang.String, io.bidmachine.media3.common.DrmInitData):io.bidmachine.media3.common.a");
    }

    public static int e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return f(new q9.c0(bArr)).f96489e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r11 != 8) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static oa.c.C1110c f(q9.c0 r11) {
        /*
            r0 = 16
            int r1 = r11.h(r0)
            int r0 = r11.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.h(r0)
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
            r8 = r0
            r0 = 2
            int r1 = r11.h(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = j(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.h(r1)
            boolean r4 = r11.g()
            if (r4 == 0) goto L45
            int r4 = r11.h(r2)
            if (r4 <= 0) goto L45
            r11.r(r0)
        L45:
            boolean r4 = r11.g()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r4 = r7
            goto L55
        L53:
            r4 = r7
            r7 = r6
        L55:
            int r11 = r11.h(r3)
            if (r7 != r6) goto L65
            r6 = 13
            if (r11 != r6) goto L65
            int[] r0 = oa.c.f96478a
            r11 = r0[r11]
        L63:
            r9 = r11
            goto L95
        L65:
            if (r7 != r4) goto L93
            int[] r4 = oa.c.f96478a
            int r6 = r4.length
            if (r11 >= r6) goto L93
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r9 = 1
            if (r1 == r9) goto L8c
            r9 = 11
            if (r1 == r0) goto L87
            if (r1 == r2) goto L8c
            if (r1 == r3) goto L7e
            goto L91
        L7e:
            if (r11 == r2) goto L84
            if (r11 == r6) goto L84
            if (r11 != r9) goto L91
        L84:
            int r11 = r4 + 1
            goto L63
        L87:
            if (r11 == r6) goto L84
            if (r11 != r9) goto L91
            goto L84
        L8c:
            if (r11 == r2) goto L84
            if (r11 != r6) goto L91
            goto L84
        L91:
            r9 = r4
            goto L95
        L93:
            r11 = 0
            goto L63
        L95:
            oa.c$c r4 = new oa.c$c
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.c.f(q9.c0):oa.c$c");
    }

    public static int g(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static void h(q9.c0 c0Var, b bVar) throws n9.x {
        int iH = c0Var.h(5);
        c0Var.r(2);
        if (c0Var.g()) {
            c0Var.r(5);
        }
        if (iH >= 7 && iH <= 10) {
            c0Var.q();
        }
        if (c0Var.g()) {
            int iH2 = c0Var.h(3);
            if (bVar.f96480b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                bVar.f96480b = iH;
            }
            if (c0Var.g()) {
                l(c0Var);
            }
        }
    }

    private static void i(q9.c0 c0Var, b bVar) throws n9.x {
        c0Var.r(2);
        boolean zG = c0Var.g();
        int iH = c0Var.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            c0Var.r(2);
            if (c0Var.g()) {
                c0Var.r(5);
            }
            if (zG) {
                c0Var.r(24);
            } else {
                if (c0Var.g()) {
                    if (!c0Var.g()) {
                        c0Var.r(4);
                    }
                    bVar.f96481c = c0Var.h(6) + 1;
                }
                c0Var.r(4);
            }
        }
        if (c0Var.g()) {
            c0Var.r(3);
            if (c0Var.g()) {
                l(c0Var);
            }
        }
    }

    private static int j(q9.c0 c0Var, int i10) {
        int i11 = 0;
        while (true) {
            int iH = i11 + c0Var.h(i10);
            if (!c0Var.g()) {
                return iH;
            }
            i11 = (iH + 1) << i10;
        }
    }

    private static boolean k(q9.c0 c0Var) {
        if (c0Var.b() < 66) {
            return false;
        }
        c0Var.r(66);
        return true;
    }

    private static void l(q9.c0 c0Var) throws n9.x {
        int iH = c0Var.h(6);
        if (iH < 2 || iH > 42) {
            throw n9.x.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        c0Var.r(iH * 8);
    }
}
