package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.core.view.ViewCompat;
import androidx.work.WorkInfo;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes4.dex */
public final class jk0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f112366h = {0, 7, 8, Ascii.SI};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f112367i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f112368j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f112369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f112370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f112371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ck0 f112372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bk0 f112373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ik0 f112374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f112375g;

    public jk0(int i10, int i11) {
        Paint paint = new Paint();
        this.f112369a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f112370b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f112371c = new Canvas();
        this.f112372d = new ck0(719, 575, 0, 719, 0, 575);
        this.f112373e = new bk0(0, a(), b(), c());
        this.f112374f = new ik0(i10, i11);
    }

    public static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = a(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int[] a() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0225 A[LOOP:3: B:96:0x0184->B:132:0x0225, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018a  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.jk0.a(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static bk0 a(v92 v92Var, int i10) {
        int iA;
        int i11;
        int iA2;
        int iA3;
        int iA4;
        int i12 = 8;
        int iA5 = v92Var.a(8);
        v92Var.c(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrA = a();
        int[] iArrB = b();
        int[] iArrC = c();
        while (i14 > 0) {
            int iA6 = v92Var.a(i12);
            int iA7 = v92Var.a(i12);
            int[] iArr = (iA7 & 128) != 0 ? iArrA : (iA7 & 64) != 0 ? iArrB : iArrC;
            if ((iA7 & 1) != 0) {
                iA3 = v92Var.a(i12);
                iA4 = v92Var.a(i12);
                iA = v92Var.a(i12);
                iA2 = v92Var.a(i12);
                i11 = i14 - 6;
            } else {
                int iA8 = v92Var.a(6) << i13;
                int iA9 = v92Var.a(4) << 4;
                iA = v92Var.a(4) << 4;
                i11 = i14 - 4;
                iA2 = v92Var.a(i13) << 6;
                iA3 = iA8;
                iA4 = iA9;
            }
            if (iA3 == 0) {
                iA2 = 255;
                iA4 = 0;
                iA = 0;
            }
            double d10 = iA3;
            int i15 = iA5;
            double d11 = iA4 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            int i16 = (int) ((1.402d * d11) + d10);
            double d12 = iA + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            int i17 = (int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d));
            int i18 = (int) ((d12 * 1.772d) + d10);
            int i19 = w83.f117341a;
            iArr[iA6] = a((byte) (255 - (iA2 & 255)), Math.max(0, Math.min(i16, 255)), Math.max(0, Math.min(i17, 255)), Math.max(0, Math.min(i18, 255)));
            i14 = i11;
            iA5 = i15;
            i12 = 8;
            i13 = 2;
        }
        return new bk0(iA5, iArrA, iArrB, iArrC);
    }

    public static dk0 a(v92 v92Var) {
        byte[] bArr;
        int iA = v92Var.a(16);
        v92Var.c(4);
        int iA2 = v92Var.a(2);
        boolean zE = v92Var.e();
        v92Var.c(1);
        byte[] bArr2 = w83.f117346f;
        if (iA2 == 1) {
            v92Var.c(v92Var.a(8) * 16);
        } else {
            if (iA2 == 0) {
                int iA3 = v92Var.a(16);
                int iA4 = v92Var.a(16);
                if (iA3 > 0) {
                    bArr2 = new byte[iA3];
                    if (v92Var.f116908c == 0) {
                        System.arraycopy(v92Var.f116906a, v92Var.f116907b, bArr2, 0, iA3);
                        v92Var.f116907b += iA3;
                        v92Var.a();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (iA4 > 0) {
                    bArr = new byte[iA4];
                    if (v92Var.f116908c == 0) {
                        System.arraycopy(v92Var.f116906a, v92Var.f116907b, bArr, 0, iA4);
                        v92Var.f116907b += iA4;
                        v92Var.a();
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            return new dk0(iA, zE, bArr2, bArr);
        }
        bArr = bArr2;
        return new dk0(iA, zE, bArr2, bArr);
    }
}
