package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3966pm extends AbstractC4174y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f39303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f39304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f39305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Qm f39306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ml f39307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3992qn f39308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V3 f39309h;

    public C3966pm(String mediaDuration, ArrayList companionAds, ArrayList mediaFiles, AdConfig.VastVideoConfig vastVideoConfig, Qm videoPlayerConfig, Ml videoBeaconProcessor, C3992qn videoTelemetryHelper, V3 companionTelemetryHelper) {
        Intrinsics.checkNotNullParameter(mediaDuration, "mediaDuration");
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(vastVideoConfig, "vastVideoConfig");
        Intrinsics.checkNotNullParameter(videoPlayerConfig, "videoPlayerConfig");
        Intrinsics.checkNotNullParameter(videoBeaconProcessor, "videoBeaconProcessor");
        Intrinsics.checkNotNullParameter(videoTelemetryHelper, "videoTelemetryHelper");
        Intrinsics.checkNotNullParameter(companionTelemetryHelper, "companionTelemetryHelper");
        this.f39302a = mediaDuration;
        this.f39303b = companionAds;
        this.f39304c = mediaFiles;
        this.f39305d = vastVideoConfig;
        this.f39306e = videoPlayerConfig;
        this.f39307f = videoBeaconProcessor;
        this.f39308g = videoTelemetryHelper;
        this.f39309h = companionTelemetryHelper;
    }
}
