package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.on, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3942on implements Hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3967pn f39224a;

    public C3942on(C3967pn c3967pn) {
        this.f39224a = c3967pn;
    }

    @Override // com.inmobi.media.Hj
    public final void a(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Surface surface2 = new Surface(surface);
        C3967pn c3967pn = this.f39224a;
        c3967pn.f39316g = surface2;
        MediaPlayer mediaPlayer = c3967pn.f39311b;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setSurface(surface2);
        } catch (IllegalStateException unused) {
        }
        this.f39224a.a();
        Ij ij = this.f39224a.f39317h;
        if (ij != null) {
            ij.c();
        }
    }

    @Override // com.inmobi.media.Hj
    public final void a() {
        Surface surface = this.f39224a.f39316g;
        if (surface != null) {
            surface.release();
        }
        C3967pn c3967pn = this.f39224a;
        c3967pn.f39316g = null;
        MediaPlayer mediaPlayer = c3967pn.f39311b;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setSurface(null);
        } catch (IllegalStateException unused) {
        }
        this.f39224a.a();
    }
}
