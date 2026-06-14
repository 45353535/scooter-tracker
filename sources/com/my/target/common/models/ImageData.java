package com.my.target.common.models;

import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.gb;
import com.my.target.t5;
import com.taurusx.tax.g.n;
import j$.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageData extends t5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile LruCache f59431f = new a(n.f66173q);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f59432e;

    public static class a extends LruCache {
        public a(int i10) {
            super(i10);
        }

        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    public ImageData(String str) {
        super(str);
    }

    @AnyThread
    public static void clearCache() {
        f59431f.evictAll();
    }

    @NonNull
    public static ImageData newImageData(@NonNull String str) {
        return new ImageData(str);
    }

    @AnyThread
    public static void setCacheSize(int i10) {
        if (i10 < 5242880) {
            gb.a("ImageData: Setting cache size ignored - size should be >= 5242880");
        } else {
            f59431f.resize(i10);
        }
    }

    @Override // com.my.target.t5
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ImageData.class == obj.getClass() && super.equals(obj) && this.f59432e == ((ImageData) obj).f59432e;
    }

    @Nullable
    public Bitmap getBitmap() {
        return getData();
    }

    @Nullable
    public Bitmap getData() {
        return this.f59432e ? (Bitmap) f59431f.get(this.f60834a) : (Bitmap) super.a();
    }

    @Override // com.my.target.t5
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Boolean.valueOf(this.f59432e));
    }

    public boolean isUseCache() {
        return this.f59432e;
    }

    public void setBitmap(@Nullable Bitmap bitmap) {
        setData(bitmap);
    }

    public void setData(@Nullable Bitmap bitmap) {
        if (!this.f59432e) {
            super.a(bitmap);
        } else if (bitmap == null) {
            f59431f.remove(this.f60834a);
        } else {
            f59431f.put(this.f60834a, bitmap);
        }
    }

    @NonNull
    public String toString() {
        return "ImageData{url='" + this.f60834a + "', width=" + this.f60835b + ", height=" + this.f60836c + ", bitmap=" + getData() + '}';
    }

    public void useCache(boolean z10) {
        if (z10 == this.f59432e) {
            return;
        }
        this.f59432e = z10;
        if (!z10) {
            super.a((Bitmap) f59431f.remove(this.f60834a));
            return;
        }
        Bitmap bitmap = (Bitmap) super.a();
        if (bitmap != null) {
            super.a(null);
            f59431f.put(this.f60834a, bitmap);
        }
    }

    public ImageData(String str, int i10, int i11) {
        super(str);
        this.f60835b = i10;
        this.f60836c = i11;
    }

    @NonNull
    public static ImageData newImageData(@NonNull String str, int i10, int i11) {
        return new ImageData(str, i10, i11);
    }
}
