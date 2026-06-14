package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class SK {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{2, 6, 10, Ascii.FF, Ascii.SO};
    }

    public static int A00(BitmapFactory.Options options, int halfWidth, int i10) {
        int width = options.outHeight;
        int height = options.outWidth;
        int halfHeight = 1;
        if (width > i10 || height > halfWidth) {
            int inSampleSize = width / 2;
            int width2 = height / 2;
            while (inSampleSize / halfHeight >= i10 && width2 / halfHeight >= halfWidth) {
                halfHeight *= 2;
            }
        }
        return halfHeight;
    }

    public static Bitmap A01(InputStream inputStream, int i10, int i11) throws IOException {
        LC lc2 = new LC(inputStream);
        lc2.mark(8192);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(lc2, null, options);
        lc2.reset();
        if (!lc2.A00()) {
            options.inSampleSize = A00(options, i11, i10);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(lc2, null, options);
        }
        return BitmapFactory.decodeStream(lc2);
    }

    public static Bitmap A02(String str, int i10, int i11, SQ sq) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i11, i10);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable t10) {
            sq.A08().AAy(A03(0, 5, 116), AbstractC2433Sv.A1h, new C2434Sw(t10));
            return null;
        }
    }
}
