package com.mbridge.msdk.video.module.listener.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;

/* JADX INFO: loaded from: classes10.dex */
public class j extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52761d;

    public j(ImageView imageView, int i10) {
        super(imageView);
        this.f52761d = i10;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.e, com.mbridge.msdk.foundation.same.image.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        Bitmap bitmapA;
        if (bitmap == null) {
            return;
        }
        try {
            if (this.f52754a == null || bitmap.isRecycled() || (bitmapA = p0.a(bitmap, 1, this.f52761d)) == null) {
                return;
            }
            this.f52754a.setImageBitmap(bitmapA);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }
}
