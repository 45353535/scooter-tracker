package yads;

import androidx.core.view.MotionEventCompat;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f116264a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f116265b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f116266c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static yv0 a(byte[] bArr, String str, String str2) {
        v92 v92Var;
        if (bArr[0] == 127) {
            v92Var = new v92(bArr.length, bArr);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = bArrCopyOf[0];
            if (b10 == -2 || b10 == -1) {
                for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                    byte b11 = bArrCopyOf[i10];
                    int i11 = i10 + 1;
                    bArrCopyOf[i10] = bArrCopyOf[i11];
                    bArrCopyOf[i11] = b11;
                }
            }
            v92Var = new v92(bArrCopyOf.length, bArrCopyOf);
            if (bArrCopyOf[0] == 31) {
                v92 v92Var2 = new v92(bArrCopyOf.length, bArrCopyOf);
                while (v92Var2.b() >= 16) {
                    v92Var2.c(2);
                    int iA = v92Var2.a(14) & 16383;
                    int iMin = Math.min(8 - v92Var.f116908c, 14);
                    int i12 = v92Var.f116908c;
                    int i13 = (8 - i12) - iMin;
                    int i14 = (MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i12) | ((1 << i13) - 1);
                    byte[] bArr2 = v92Var.f116906a;
                    int i15 = v92Var.f116907b;
                    byte b12 = (byte) (i14 & bArr2[i15]);
                    bArr2[i15] = b12;
                    int i16 = 14 - iMin;
                    bArr2[i15] = (byte) (b12 | ((iA >>> i16) << i13));
                    int i17 = i15 + 1;
                    while (i16 > 8) {
                        v92Var.f116906a[i17] = (byte) (iA >>> (i16 - 8));
                        i16 -= 8;
                        i17++;
                    }
                    int i18 = 8 - i16;
                    byte[] bArr3 = v92Var.f116906a;
                    byte b13 = (byte) (bArr3[i17] & ((1 << i18) - 1));
                    bArr3[i17] = b13;
                    bArr3[i17] = (byte) (((iA & ((1 << i16) - 1)) << i18) | b13);
                    v92Var.c(14);
                    v92Var.a();
                }
            }
            v92Var.a(bArrCopyOf.length, bArrCopyOf);
        }
        v92Var.c(60);
        int i19 = f116264a[v92Var.a(6)];
        int i20 = f116265b[v92Var.a(4)];
        int iA2 = v92Var.a(5);
        int i21 = iA2 < 29 ? (f116266c[iA2] * 1000) / 2 : -1;
        v92Var.c(10);
        int i22 = i19 + (v92Var.a(2) > 0 ? 1 : 0);
        xv0 xv0Var = new xv0();
        xv0Var.f117972a = str;
        xv0Var.f117982k = "audio/vnd.dts";
        xv0Var.f117977f = i21;
        xv0Var.f117995x = i22;
        xv0Var.f117996y = i20;
        xv0Var.f117985n = null;
        xv0Var.f117974c = str2;
        return new yv0(xv0Var);
    }
}
