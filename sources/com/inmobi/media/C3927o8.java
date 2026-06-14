package com.inmobi.media;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3927o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f39169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExoPlayer f39170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f39171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P7 f39172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f39173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ij f39174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f39175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3902n8 f39176h;

    public C3927o8(CoroutineScope coroutineScope, ExoPlayer mediaPlayer, G1 mediaPlayerLayout, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(mediaPlayerLayout, "mediaPlayerLayout");
        this.f39169a = coroutineScope;
        this.f39170b = mediaPlayer;
        this.f39171c = new ArrayList();
        Context context = mediaPlayerLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f39172d = new P7(new C3750h5(context), mediaPlayerLayout, mediaPlayer, interfaceC3878m9);
        this.f39176h = new C3902n8(this);
    }

    public final void a() {
        P4.a(this.f39171c);
        P7 p72 = this.f39172d;
        p72.f37525e = null;
        p72.f37521a.setSurfaceTextureListener(null);
        Surface surface = this.f39173e;
        if (surface != null) {
            surface.release();
        }
        this.f39173e = null;
        this.f39174f = null;
    }
}
