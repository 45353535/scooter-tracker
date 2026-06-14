package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import vh.l0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class RequestHandler {

    public static final class Result {
        private final Bitmap bitmap;
        private final int exifOrientation;
        private final Picasso.LoadedFrom loadedFrom;
        private final l0 source;

        public Result(@NonNull Bitmap bitmap, @NonNull Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) Utils.checkNotNull(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        @Nullable
        public Bitmap getBitmap() {
            return this.bitmap;
        }

        int getExifOrientation() {
            return this.exifOrientation;
        }

        @NonNull
        public Picasso.LoadedFrom getLoadedFrom() {
            return this.loadedFrom;
        }

        @Nullable
        public l0 getSource() {
            return this.source;
        }

        public Result(@NonNull l0 l0Var, @NonNull Picasso.LoadedFrom loadedFrom) {
            this(null, (l0) Utils.checkNotNull(l0Var, "source == null"), loadedFrom, 0);
        }

        Result(@Nullable Bitmap bitmap, @Nullable l0 l0Var, @NonNull Picasso.LoadedFrom loadedFrom, int i10) {
            if ((bitmap != null) != (l0Var != null)) {
                this.bitmap = bitmap;
                this.source = l0Var;
                this.loadedFrom = (Picasso.LoadedFrom) Utils.checkNotNull(loadedFrom, "loadedFrom == null");
                this.exifOrientation = i10;
                return;
            }
            throw new AssertionError();
        }
    }

    static void calculateInSampleSize(int i10, int i11, BitmapFactory.Options options, Request request) {
        calculateInSampleSize(i10, i11, options.outWidth, options.outHeight, options, request);
    }

    static BitmapFactory.Options createBitmapOptions(Request request) {
        boolean zHasSize = request.hasSize();
        boolean z10 = request.config != null;
        if (!zHasSize && !z10 && !request.purgeable) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = zHasSize;
        boolean z11 = request.purgeable;
        options.inInputShareable = z11;
        options.inPurgeable = z11;
        if (z10) {
            options.inPreferredConfig = request.config;
        }
        return options;
    }

    static boolean requiresInSampleSize(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean canHandleRequest(Request request);

    int getRetryCount() {
        return 0;
    }

    @Nullable
    public abstract Result load(Request request, int i10) throws IOException;

    boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        return false;
    }

    boolean supportsReplay() {
        return false;
    }

    static void calculateInSampleSize(int i10, int i11, int i12, int i13, BitmapFactory.Options options, Request request) {
        int iMax;
        double dFloor;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                dFloor = Math.floor(i12 / i10);
            } else if (i10 == 0) {
                dFloor = Math.floor(i13 / i11);
            } else {
                int iFloor = (int) Math.floor(i13 / i11);
                int iFloor2 = (int) Math.floor(i12 / i10);
                iMax = request.centerInside ? Math.max(iFloor, iFloor2) : Math.min(iFloor, iFloor2);
            }
            iMax = (int) dFloor;
        } else {
            iMax = 1;
        }
        options.inSampleSize = iMax;
        options.inJustDecodeBounds = false;
    }
}
