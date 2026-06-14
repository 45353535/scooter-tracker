package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.sdk.internal.a9;
import com.startapp.sdk.internal.g2;
import com.startapp.sdk.internal.k2;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class ImageResourceConfig implements Serializable {
    private static final long serialVersionUID = -8927634568015374287L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Bitmap f63972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Bitmap f63973b;
    private String name;
    private String imageUrlSecured = "";
    private String imageFallbackUrl = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Bitmap f63974c = null;
    private int width = 1;
    private int height = 1;

    private ImageResourceConfig() {
    }

    public final Bitmap a(Context context) throws Throwable {
        if (this.f63974c == null) {
            Bitmap bitmap = this.f63972a;
            this.f63974c = bitmap;
            if (bitmap == null) {
                if (this.f63973b == null) {
                    String str = this.imageFallbackUrl;
                    Bitmap bitmapB = g2.b(context, str);
                    if (bitmapB == null) {
                        bitmapB = g2.b(context, str);
                    }
                    this.f63973b = bitmapB;
                }
                this.f63974c = this.f63973b;
            }
        }
        return this.f63974c;
    }

    public final void b(int i10) {
        this.width = i10;
    }

    public final String c() {
        return this.name;
    }

    public final int d() {
        return this.width;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ImageResourceConfig imageResourceConfig = (ImageResourceConfig) obj;
            if (this.width == imageResourceConfig.width && this.height == imageResourceConfig.height && vi.a((Object) this.imageUrlSecured, (Object) imageResourceConfig.imageUrlSecured) && vi.a((Object) this.imageFallbackUrl, (Object) imageResourceConfig.imageFallbackUrl) && vi.a((Object) this.name, (Object) imageResourceConfig.name)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.imageUrlSecured, this.imageFallbackUrl, Integer.valueOf(this.width), Integer.valueOf(this.height), this.name};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }

    public final String b() {
        String str = this.imageUrlSecured;
        return str != null ? str : "";
    }

    public final void b(String str) {
        this.imageFallbackUrl = str;
    }

    public final void b(Context context) {
        this.f63972a = null;
        String str = this.imageUrlSecured;
        if (str == null) {
            str = "";
        }
        k2 k2Var = new k2(context, str, new a9(this), 0);
        k2Var.f64810b = true;
        k2Var.a();
    }

    public final int a() {
        return this.height;
    }

    public final void a(int i10) {
        this.height = i10;
    }

    public static ImageResourceConfig a(String str) {
        ImageResourceConfig imageResourceConfig = new ImageResourceConfig();
        imageResourceConfig.name = str;
        return imageResourceConfig;
    }
}
