package com.bytedance.sdk.component.mzz.lnr.ud;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.taurusx.tax.g.n;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    public static final ImageView.ScaleType qdl = ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static final Bitmap.Config f16601ud = Bitmap.Config.ARGB_4444;
    private final ImageView.ScaleType jpc;
    private final Bitmap.Config lnr;
    private int mml;
    private final int mo;
    private int mzz;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final int f16602wd;
    private final int tvp = 3840;
    private final int to = n.A;

    public qdl(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.lnr = config;
        this.mml = i10;
        this.mzz = i11;
        this.jpc = scaleType;
        this.mo = i12;
        this.f16602wd = i13;
        qdl(i10, i11);
    }

    static int qdl(int i10, int i11, int i12, int i13, int i14, int i15) {
        double dMin = Math.min(((double) i10) / ((double) i12), ((double) i11) / ((double) i13));
        if (i14 > 0 && i15 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(i10, i11)) / ((double) Math.max(i14, i15)), ((double) Math.min(i10, i11)) / ((double) Math.min(i14, i15))));
        }
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > dMin) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private static int qdl(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 != 0 || i11 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i10 == 0) {
                    return (int) (((double) i12) * (((double) i11) / ((double) i13)));
                }
                if (i11 == 0) {
                    return i10;
                }
                double d10 = ((double) i13) / ((double) i12);
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d11 = i11;
                    return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
                }
                double d12 = i11;
                return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
            }
            if (i10 != 0) {
                return i10;
            }
        }
        return i12;
    }

    public Bitmap qdl(byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mml == 0 && this.mzz == 0) {
            options.inPreferredConfig = this.lnr;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iQdl = qdl(this.mml, this.mzz, i10, i11, this.jpc);
            int iQdl2 = qdl(this.mzz, this.mml, i11, i10, this.jpc);
            options.inJustDecodeBounds = false;
            options.inSampleSize = qdl(i10, i11, iQdl, iQdl2, this.mo, this.f16602wd);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iQdl || bitmapDecodeByteArray.getHeight() > iQdl2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iQdl, iQdl2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 104857600) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }

    private void qdl(int i10, int i11) {
        if (i10 > 3840 && i11 > 3840) {
            if (i10 > i11) {
                this.mml = 3840;
                this.mzz = (i11 * 3840) / i10;
                return;
            } else {
                this.mml = (i10 * 3840) / i11;
                this.mzz = 3840;
                return;
            }
        }
        if (i10 > 3840) {
            this.mml = 3840;
            this.mzz = (i11 * 3840) / i10;
        } else if (i11 > 3840) {
            this.mml = (i10 * 3840) / i11;
            this.mzz = 3840;
        }
    }
}
