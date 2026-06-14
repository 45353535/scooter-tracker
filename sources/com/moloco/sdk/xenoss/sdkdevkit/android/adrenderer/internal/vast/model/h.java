package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f57570b;

    public h(String clickThroughUrl, List clickTrackingUrls) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
        this.f57569a = clickThroughUrl;
        this.f57570b = clickTrackingUrls;
    }

    public final String a() {
        return this.f57569a;
    }

    public final List b() {
        return this.f57570b;
    }
}
