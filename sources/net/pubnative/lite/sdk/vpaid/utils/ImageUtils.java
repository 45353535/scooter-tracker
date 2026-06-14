package net.pubnative.lite.sdk.vpaid.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class ImageUtils {
    private static final String TAG = "ImageUtils";

    @VisibleForTesting
    static int calculateInSampleSize(BitmapFactory.Options options, int i10, int i11) {
        return calculateInSampleSize(options.outWidth, options.outHeight, i10, i11);
    }

    @VisibleForTesting
    static Bitmap decodeSampledBitmap(String str, int i10, int i11) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = calculateInSampleSize(options, i10, i11);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError | RuntimeException e10) {
            HyBid.reportException(e10);
            return new AndroidBitmapDecoder().decodeFile(new File(str), i10, i11);
        }
    }

    public static void setScaledImage(ImageView imageView, String str) {
        setScaledImage(imageView, str, new AndroidBitmapDecoder());
    }

    public static void setScaledImage(final ImageView imageView, final String str, final BitmapDecoder bitmapDecoder) {
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: net.pubnative.lite.sdk.vpaid.utils.ImageUtils.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    imageView.getViewTreeObserver().removeOnPreDrawListener(this);
                    int measuredHeight = imageView.getMeasuredHeight();
                    Bitmap bitmapDecodeFile = bitmapDecoder.decodeFile(new File(str), imageView.getMeasuredWidth(), measuredHeight);
                    if (bitmapDecodeFile == null) {
                        return true;
                    }
                    imageView.setImageBitmap(bitmapDecodeFile);
                    return true;
                }
            });
        }
    }

    @VisibleForTesting
    static int calculateInSampleSize(int i10, int i11, int i12, int i13) {
        int i14 = 1;
        if (i11 <= i13 && i10 <= i12) {
            return 1;
        }
        int i15 = i11 / 2;
        int i16 = i10 / 2;
        while (i15 / i14 > i13 && i16 / i14 > i12) {
            i14 *= 2;
        }
        return i14;
    }

    @VisibleForTesting
    static Bitmap decodeSampledBitmap(Bitmap bitmap, int i10, int i11) {
        try {
            int iCalculateInSampleSize = calculateInSampleSize(bitmap.getWidth(), bitmap.getHeight(), i10, i11);
            return Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / iCalculateInSampleSize, bitmap.getHeight() / iCalculateInSampleSize, false);
        } catch (RuntimeException e10) {
            HyBid.reportException((Exception) e10);
            Logger.e(TAG, e10.getMessage());
            return null;
        }
    }
}
