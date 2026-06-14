package com.bytedance.sdk.openadsdk.jl.qdl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.mml;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private byte[] lnr;
    private Bitmap mml;
    private Bitmap mzz;
    int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private Drawable f17605ud;

    public ud(Drawable drawable, int i10) {
        this.lnr = null;
        this.mml = null;
        this.mzz = null;
        this.f17605ud = drawable;
        this.qdl = i10;
    }

    public byte[] lnr() {
        try {
            if (this.lnr == null) {
                this.lnr = mml.qdl(this.mml);
            }
        } catch (OutOfMemoryError e10) {
            aaj.lnr("GifRequestResult", e10.getMessage());
        }
        return this.lnr;
    }

    public Drawable mml() {
        return this.f17605ud;
    }

    public boolean mzz() {
        if (this.mml != null || this.f17605ud != null) {
            return true;
        }
        byte[] bArr = this.lnr;
        return bArr != null && bArr.length > 0;
    }

    public Bitmap qdl() {
        return this.mml;
    }

    public Bitmap ud() {
        return this.mzz;
    }

    public ud(byte[] bArr, int i10) {
        this.f17605ud = null;
        this.mml = null;
        this.mzz = null;
        this.lnr = bArr;
        this.qdl = i10;
    }

    public ud(Bitmap bitmap, Bitmap bitmap2, int i10) {
        this.f17605ud = null;
        this.lnr = null;
        this.mzz = bitmap2;
        this.mml = bitmap;
        this.qdl = i10;
    }
}
