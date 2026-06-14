package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3990ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f39400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f39403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f39404g;

    public C3990ql(String universalAdId, String adServingId, ArrayList trackers, String clickThroughUrl, String mediaDuration, ArrayList companionAds, ArrayList mediaFiles) {
        Intrinsics.checkNotNullParameter(universalAdId, "universalAdId");
        Intrinsics.checkNotNullParameter(adServingId, "adServingId");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(mediaDuration, "mediaDuration");
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        this.f39398a = universalAdId;
        this.f39399b = adServingId;
        this.f39400c = trackers;
        this.f39401d = clickThroughUrl;
        this.f39402e = mediaDuration;
        this.f39403f = companionAds;
        this.f39404g = mediaFiles;
    }
}
