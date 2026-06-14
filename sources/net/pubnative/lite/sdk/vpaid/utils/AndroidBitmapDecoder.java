package net.pubnative.lite.sdk.vpaid.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidBitmapDecoder implements BitmapDecoder {
    private int calculateInSampleSize(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i11 > 0 && i10 > 0 && (i12 > i11 || i13 > i10)) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 >= i11 && i16 / i14 >= i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    @VisibleForTesting
    Bitmap decode(InputStream inputStream, InputStream inputStream2, int i10, int i11) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        options.inSampleSize = calculateInSampleSize(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream2, null, options);
    }

    @Override // net.pubnative.lite.sdk.vpaid.utils.BitmapDecoder
    public Bitmap decodeFile(File file, int i10, int i11) {
        try {
            return decode(new FileInputStream(file), new FileInputStream(file), i10, i11);
        } catch (FileNotFoundException e10) {
            HyBid.reportException((Exception) e10);
            return null;
        }
    }
}
