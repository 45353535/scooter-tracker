package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3728g8 extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlVideoPlaybackState f38620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38621b;

    public C3728g8(HtmlVideoPlaybackState videoReadyEvent, int i10) {
        Intrinsics.checkNotNullParameter(videoReadyEvent, "videoReadyEvent");
        this.f38620a = videoReadyEvent;
        this.f38621b = i10;
    }
}
