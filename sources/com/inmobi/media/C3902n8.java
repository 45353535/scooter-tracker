package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3902n8 implements Hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3927o8 f39084a;

    public C3902n8(C3927o8 c3927o8) {
        this.f39084a = c3927o8;
    }

    @Override // com.inmobi.media.Hj
    public final void a(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Surface surface2 = new Surface(surface);
        C3927o8 c3927o8 = this.f39084a;
        Surface surface3 = c3927o8.f39173e;
        if (surface3 != null) {
            surface3.release();
        }
        c3927o8.f39173e = surface2;
        Ij ij = this.f39084a.f39174f;
        if (ij != null) {
            ij.c();
        }
    }

    @Override // com.inmobi.media.Hj
    public final void a() {
        this.f39084a.f39170b.clearVideoSurface();
        this.f39084a.f39170b.setVideoSurface(null);
        Surface surface = this.f39084a.f39173e;
        if (surface != null) {
            surface.release();
        }
        this.f39084a.f39173e = null;
    }
}
