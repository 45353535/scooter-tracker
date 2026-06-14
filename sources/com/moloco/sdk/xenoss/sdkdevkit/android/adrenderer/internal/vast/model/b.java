package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f57544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f57545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f57546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f57547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f57548f;

    public b(String vastAdTagUrl, Boolean bool, f fVar, List impressions, List errorUrls, List creatives) {
        Intrinsics.checkNotNullParameter(vastAdTagUrl, "vastAdTagUrl");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        this.f57543a = vastAdTagUrl;
        this.f57544b = bool;
        this.f57545c = fVar;
        this.f57546d = impressions;
        this.f57547e = errorUrls;
        this.f57548f = creatives;
    }

    public final List a() {
        return this.f57548f;
    }

    public final List b() {
        return this.f57547e;
    }

    public final Boolean c() {
        return this.f57544b;
    }

    public final List d() {
        return this.f57546d;
    }

    public final String e() {
        return this.f57543a;
    }
}
