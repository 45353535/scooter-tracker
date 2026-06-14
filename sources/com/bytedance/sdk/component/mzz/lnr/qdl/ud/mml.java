package com.bytedance.sdk.component.mzz.lnr.qdl.ud;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.mzz.yt;

/* JADX INFO: loaded from: classes6.dex */
public class mml implements yt {
    private final yt qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.component.mzz.lnr.qdl.ud f16599ud;

    public mml(yt ytVar) {
        this(ytVar, null);
    }

    public mml(yt ytVar, com.bytedance.sdk.component.mzz.lnr.qdl.ud udVar) {
        this.qdl = ytVar;
        this.f16599ud = udVar;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean ud(String str) {
        return this.qdl.ud(str);
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean qdl(String str, Bitmap bitmap) {
        return this.qdl.qdl(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public Bitmap qdl(String str) {
        return this.qdl.qdl(str);
    }
}
