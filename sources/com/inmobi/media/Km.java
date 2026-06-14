package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class Km implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f37233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lm f37234b;

    public Km(ExoPlayer exoPlayer, Lm lm) {
        this.f37233a = exoPlayer;
        this.f37234b = lm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f37233a.removeListener(this.f37234b);
        this.f37233a.stop();
        this.f37233a.clearMediaItems();
        return Unit.f93236a;
    }
}
