package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.v;

/* JADX INFO: loaded from: classes5.dex */
public class i extends com.android.volley.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f7576j = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f7577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p.b f7578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bitmap.Config f7579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f7580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ImageView.ScaleType f7582i;

    public i(String str, p.b bVar, int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, p.a aVar) {
        super(0, str, aVar);
        this.f7577d = new Object();
        setRetryPolicy(new com.android.volley.e(1000, 2, 2.0f));
        this.f7578e = bVar;
        this.f7579f = config;
        this.f7580g = i10;
        this.f7581h = i11;
        this.f7582i = scaleType;
    }

    private p e(com.android.volley.k kVar) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = kVar.f7526b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f7580g == 0 && this.f7581h == 0) {
            options.inPreferredConfig = this.f7579f;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iG = g(this.f7580g, this.f7581h, i10, i11, this.f7582i);
            int iG2 = g(this.f7581h, this.f7580g, i11, i10, this.f7582i);
            options.inJustDecodeBounds = false;
            options.inSampleSize = f(i10, i11, iG, iG2);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iG || bitmapDecodeByteArray.getHeight() > iG2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iG, iG2, true);
                bitmapDecodeByteArray.recycle();
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? p.a(new com.android.volley.m(kVar)) : p.c(bitmapDecodeByteArray, e.e(kVar));
    }

    static int f(int i10, int i11, int i12, int i13) {
        double dMin = Math.min(((double) i10) / ((double) i12), ((double) i11) / ((double) i13));
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > dMin) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private static int g(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
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

    @Override // com.android.volley.n
    public void cancel() {
        super.cancel();
        synchronized (this.f7577d) {
            this.f7578e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void deliverResponse(Bitmap bitmap) {
        p.b bVar;
        synchronized (this.f7577d) {
            bVar = this.f7578e;
        }
        if (bVar != null) {
            bVar.onResponse(bitmap);
        }
    }

    @Override // com.android.volley.n
    public n.c getPriority() {
        return n.c.LOW;
    }

    @Override // com.android.volley.n
    protected p parseNetworkResponse(com.android.volley.k kVar) {
        p pVarE;
        synchronized (f7576j) {
            try {
                try {
                    pVarE = e(kVar);
                } catch (OutOfMemoryError e10) {
                    v.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(kVar.f7526b.length), getUrl());
                    return p.a(new com.android.volley.m(e10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVarE;
    }
}
