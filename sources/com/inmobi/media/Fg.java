package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f36856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f36857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f36859f;

    public Fg(VideoExperience videoExperience, boolean z10, AdConfig.VideoPlayerProgressConfig progressConfig) {
        Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        Boolean showProgress = videoExperience.getProgress().getShowProgress();
        this.f36854a = showProgress != null ? showProgress.booleanValue() : progressConfig.getShowProgress();
        this.f36855b = !(videoExperience.getLoopVideoOnComplete() != null ? r0.booleanValue() : z10);
        int[] color = videoExperience.getProgress().getColor();
        this.f36856c = color == null ? CollectionsKt.toIntArray(progressConfig.getForegroundColor()) : color;
        this.f36857d = CollectionsKt.toIntArray(progressConfig.getBackgroundColor());
        Integer height = videoExperience.getProgress().getHeight();
        this.f36858e = height != null ? height.intValue() : progressConfig.getHeight();
        this.f36859f = progressConfig.getProgressPolling();
    }
}
