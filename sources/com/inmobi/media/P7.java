package com.inmobi.media;

import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class P7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3750h5 f37521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1 f37522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExoPlayer f37523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3878m9 f37524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Hj f37525e;

    public P7(C3750h5 textureView, G1 parentView, ExoPlayer mediaPlayer, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        this.f37521a = textureView;
        this.f37522b = parentView;
        this.f37523c = mediaPlayer;
        this.f37524d = interfaceC3878m9;
    }

    public final void a(int i10, int i11) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37524d;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("HtmlPlayerTextureManager", "Video Size Changed: " + i10 + " x " + i11);
        }
        int i12 = this.f37523c.getVideoSize().width;
        int i13 = this.f37523c.getVideoSize().height;
        if (i13 == 0) {
            this.f37521a.setAspectRatio(1.0f);
        } else {
            this.f37521a.setAspectRatio(i12 / i13);
        }
    }

    public final void a(Hj surfaceTextureListener) {
        Intrinsics.checkNotNullParameter(surfaceTextureListener, "surfaceTextureListener");
        this.f37525e = surfaceTextureListener;
        this.f37522b.addView(this.f37521a, new FrameLayout.LayoutParams(-1, -1));
        int i10 = this.f37523c.getVideoSize().width;
        int i11 = this.f37523c.getVideoSize().height;
        if (i11 == 0) {
            this.f37521a.setAspectRatio(1.0f);
        } else {
            this.f37521a.setAspectRatio(i10 / i11);
        }
        this.f37521a.setSurfaceTextureListener(new O7(this));
    }
}
