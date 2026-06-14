package yads;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class bq {
    public static Bitmap a(Bitmap bitmap, double d10) {
        int i10;
        int i11;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, zf.a.c(((double) bitmap.getWidth()) * d10), zf.a.c(((double) bitmap.getHeight()) * d10), false);
        int i12 = 1;
        Bitmap bitmapCopy = bitmapCreateScaledBitmap.copy(bitmapCreateScaledBitmap.getConfig(), true);
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i13 = width * height;
        int[] iArr = new int[i13];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i14 = width - 1;
        int i15 = height - 1;
        int[] iArr2 = new int[i13];
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[kotlin.ranges.g.e(width, height)];
        int[] iArr6 = new int[1024];
        for (int i16 = 0; i16 < 1024; i16++) {
            iArr6[i16] = i16 / 4;
        }
        char c10 = 3;
        int[][] iArr7 = new int[3][];
        for (int i17 = 0; i17 < 3; i17++) {
            iArr7[i17] = new int[3];
        }
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (i18 < height) {
            char c11 = c10;
            int i21 = -1;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            while (i21 <= i12) {
                int[] iArr8 = iArr4;
                int i31 = i12;
                int i32 = iArr[kotlin.ranges.g.j(i14, kotlin.ranges.g.e(i21, 0)) + i19];
                int i33 = i21 + 1;
                int[] iArr9 = iArr7[i33];
                iArr9[0] = (i32 & 16711680) >> 16;
                iArr9[i31] = (i32 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[2] = i32 & 255;
                int iAbs = 2 - StrictMath.abs(i21);
                int i34 = iArr9[0];
                i22 = (i34 * iAbs) + i22;
                int i35 = iArr9[i31];
                i23 = (i35 * iAbs) + i23;
                int i36 = iArr9[2];
                i24 = (iAbs * i36) + i24;
                if (i21 > 0) {
                    i30 += i34;
                    i29 += i35;
                    i28 += i36;
                } else {
                    i27 += i34;
                    i26 += i35;
                    i25 += i36;
                }
                i12 = i31;
                iArr4 = iArr8;
                i21 = i33;
            }
            int[] iArr10 = iArr4;
            int i37 = i12;
            int i38 = 0;
            while (i38 < width) {
                iArr2[i19] = iArr6[i22];
                iArr3[i19] = iArr6[i23];
                iArr10[i19] = iArr6[i24];
                int i39 = i22 - i27;
                int i40 = i23 - i26;
                int i41 = i24 - i25;
                int[] iArr11 = iArr7[(i12 + 2) % 3];
                int i42 = i27 - iArr11[0];
                int i43 = i26 - iArr11[i37];
                int i44 = i25 - iArr11[2];
                if (i18 == 0) {
                    i11 = i38;
                    iArr5[i11] = Math.min(i11 + 2, i14);
                } else {
                    i11 = i38;
                }
                int i45 = iArr[i20 + iArr5[i11]];
                int i46 = (i45 & 16711680) >> 16;
                iArr11[0] = i46;
                int i47 = (i45 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr11[i37] = i47;
                int i48 = i45 & 255;
                iArr11[2] = i48;
                int i49 = i30 + i46;
                int i50 = i29 + i47;
                int i51 = i28 + i48;
                i22 = i39 + i49;
                i23 = i40 + i50;
                i24 = i41 + i51;
                i12 = (i12 + 1) % 3;
                int[] iArr12 = iArr7[i12 % 3];
                int i52 = iArr12[0];
                i27 = i42 + i52;
                int i53 = iArr12[i37];
                i26 = i43 + i53;
                int i54 = iArr12[2];
                i25 = i44 + i54;
                i30 = i49 - i52;
                i29 = i50 - i53;
                i28 = i51 - i54;
                i19++;
                i38 = i11 + 1;
            }
            i20 += width;
            i18++;
            c10 = c11;
            i12 = i37;
            iArr4 = iArr10;
        }
        int[] iArr13 = iArr4;
        int i55 = i12;
        int i56 = 0;
        while (i56 < width) {
            int i57 = width * (-1);
            int i58 = -1;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            for (int i68 = i55; i58 <= i68; i68 = 1) {
                int iMax = Math.max(0, i57) + i56;
                int i69 = i58 + 1;
                int[] iArr14 = iArr7[i69];
                iArr14[0] = iArr2[iMax];
                iArr14[i68] = iArr3[iMax];
                iArr14[2] = iArr13[iMax];
                int iAbs2 = 2 - StrictMath.abs(i58);
                i65 = (iArr2[iMax] * iAbs2) + i65;
                i66 = (iArr3[iMax] * iAbs2) + i66;
                i67 = (iArr13[iMax] * iAbs2) + i67;
                if (i58 > 0) {
                    i64 += iArr14[0];
                    i63 += iArr14[1];
                    i62 += iArr14[2];
                } else {
                    i61 += iArr14[0];
                    i60 += iArr14[1];
                    i59 += iArr14[2];
                }
                if (i58 < i15) {
                    i57 += width;
                }
                i58 = i69;
            }
            int i70 = i65;
            int i71 = i67;
            int i72 = 1;
            int i73 = i56;
            int i74 = i64;
            int i75 = i63;
            int i76 = i62;
            int i77 = i61;
            int i78 = i60;
            int i79 = i59;
            for (int i80 = 0; i80 < height; i80++) {
                iArr[i73] = (iArr[i73] & ViewCompat.MEASURED_STATE_MASK) | (iArr6[i70] << 16) | (iArr6[i66] << 8) | iArr6[i71];
                int i81 = i70 - i77;
                int i82 = i66 - i78;
                int i83 = i71 - i79;
                int[] iArr15 = iArr7[(i72 + 2) % 3];
                int i84 = i77 - iArr15[0];
                int i85 = i78 - iArr15[1];
                int i86 = i79 - iArr15[2];
                if (i56 == 0) {
                    i10 = i81;
                    iArr5[i80] = Math.min(i80 + 2, i15) * width;
                } else {
                    i10 = i81;
                }
                int i87 = iArr5[i80] + i56;
                int i88 = iArr2[i87];
                iArr15[0] = i88;
                int i89 = iArr3[i87];
                iArr15[1] = i89;
                int i90 = iArr13[i87];
                iArr15[2] = i90;
                int i91 = i74 + i88;
                int i92 = i75 + i89;
                int i93 = i76 + i90;
                i70 = i10 + i91;
                i66 = i82 + i92;
                i71 = i83 + i93;
                i72 = (i72 + 1) % 3;
                int[] iArr16 = iArr7[i72];
                int i94 = iArr16[0];
                i77 = i84 + i94;
                int i95 = iArr16[1];
                i78 = i85 + i95;
                int i96 = iArr16[2];
                i79 = i86 + i96;
                i74 = i91 - i94;
                i75 = i92 - i95;
                i76 = i93 - i96;
                i73 += width;
            }
            i56++;
            i55 = 1;
        }
        bitmapCopy.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCopy;
    }
}
