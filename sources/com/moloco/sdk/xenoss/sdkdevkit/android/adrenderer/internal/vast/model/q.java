package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f57597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f57601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f57602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f57603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f57604h;

    public q(f fVar, String str, String str2, String str3, u uVar, List impressions, List errorUrls, List creatives) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        this.f57597a = fVar;
        this.f57598b = str;
        this.f57599c = str2;
        this.f57600d = str3;
        this.f57601e = uVar;
        this.f57602f = impressions;
        this.f57603g = errorUrls;
        this.f57604h = creatives;
    }

    public final List a() {
        return this.f57604h;
    }

    public final List b() {
        return this.f57603g;
    }

    public final List c() {
        return this.f57602f;
    }
}
