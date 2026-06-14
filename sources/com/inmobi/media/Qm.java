package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fg f37619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O1 f37620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final In f37621e;

    public Qm(boolean z10, VideoExperience videoExperience, AdConfig.NativeConfig nativeConfig) {
        Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        Intrinsics.checkNotNullParameter(nativeConfig, "nativeConfig");
        this.f37617a = z10;
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.f37618b = loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete();
        this.f37619c = new Fg(videoExperience, nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete(), nativeConfig.getVideoPlayerConfig().getProgressConfig());
        this.f37620d = new O1(videoExperience, nativeConfig.getVideoPlayerConfig().getAudioConfig());
        this.f37621e = new In(nativeConfig.getVideoPlayerConfig().getViewability());
    }
}
