package com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud;

import android.graphics.Bitmap;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.component.mzz.yt;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements yt {
    private int lnr;
    private com.bytedance.sdk.component.mzz.mml.lnr.qdl.lnr<String, Bitmap> mml;
    private long qdl = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16628ud;

    public qdl(int i10, int i11) {
        this.f16628ud = i11;
        this.lnr = i10;
        this.mml = new com.bytedance.sdk.component.mzz.mml.lnr.qdl.lnr<>(i11);
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean ud(String str) {
        return this.mml.qdl(str) != null;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean qdl(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int iQdl = qdl(bitmap);
                if (iQdl <= this.qdl && iQdl != 0) {
                    this.mml.qdl(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public Bitmap qdl(String str) {
        try {
            return this.mml.qdl(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int qdl(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
