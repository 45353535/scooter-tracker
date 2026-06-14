package com.inmobi.media;

import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import com.inmobi.media.Ud;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3750h5 f37847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f37848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaPlayer f37849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3903n9 f37850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Hj f37851e;

    public Ud(C3750h5 textureView, RelativeLayout parentView, MediaPlayer mediaPlayer, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        this.f37847a = textureView;
        this.f37848b = parentView;
        this.f37849c = mediaPlayer;
        this.f37850d = c3903n9;
    }

    public final void a(Hj surfaceTextureListener) {
        Intrinsics.checkNotNullParameter(surfaceTextureListener, "surfaceTextureListener");
        this.f37851e = surfaceTextureListener;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.f37848b.addView(this.f37847a, layoutParams);
        a();
        int videoWidth = this.f37849c.getVideoWidth();
        int videoHeight = this.f37849c.getVideoHeight();
        if (videoHeight == 0) {
            this.f37847a.setAspectRatio(1.0f);
        } else {
            this.f37847a.setAspectRatio(videoWidth / videoHeight);
        }
        this.f37847a.setSurfaceTextureListener(new Td(this));
    }

    public final void a() {
        this.f37849c.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: w3.s4
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                Ud.a(this.f107295b, mediaPlayer, i10, i11);
            }
        });
    }

    public static final void a(Ud ud2, MediaPlayer mediaPlayer, int i10, int i11) {
        C3903n9 c3903n9 = ud2.f37850d;
        if (c3903n9 != null) {
            c3903n9.a("NativePlayerTextureManager", "Video Size Changed: " + i10 + " x " + i11);
        }
        int videoWidth = ud2.f37849c.getVideoWidth();
        int videoHeight = ud2.f37849c.getVideoHeight();
        if (videoHeight == 0) {
            ud2.f37847a.setAspectRatio(1.0f);
        } else {
            ud2.f37847a.setAspectRatio(videoWidth / videoHeight);
        }
    }
}
