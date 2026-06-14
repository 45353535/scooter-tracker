package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f57561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f57562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f57564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f57565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f57566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f57567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f57568i;

    public g(String str, Integer num, Integer num2, String str2, String str3, h hVar, e eVar, List creativeViewTrackingList, List resources) {
        Intrinsics.checkNotNullParameter(creativeViewTrackingList, "creativeViewTrackingList");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f57560a = str;
        this.f57561b = num;
        this.f57562c = num2;
        this.f57563d = str2;
        this.f57564e = str3;
        this.f57565f = hVar;
        this.f57566g = eVar;
        this.f57567h = creativeViewTrackingList;
        this.f57568i = resources;
    }

    public final String a() {
        return this.f57564e;
    }

    public final h b() {
        return this.f57565f;
    }

    public final List c() {
        return this.f57567h;
    }

    public final Integer d() {
        return this.f57562c;
    }

    public final List e() {
        return this.f57568i;
    }

    public final Integer f() {
        return this.f57561b;
    }
}
