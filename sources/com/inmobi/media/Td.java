package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Td implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ud f37765a;

    public Td(Ud ud2) {
        this.f37765a = ud2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i10, int i11) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Hj hj = this.f37765a.f37851e;
        if (hj != null) {
            hj.a(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Hj hj = this.f37765a.f37851e;
        if (hj == null) {
            return true;
        }
        hj.a();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }
}
