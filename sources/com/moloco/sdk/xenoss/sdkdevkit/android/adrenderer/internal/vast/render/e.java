package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f58186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f58189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f58190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f58191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f58192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t f58193h;

    public e(a0 resource, int i10, int i11, String str, List clickTracking, List viewTracking, Long l10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(viewTracking, "viewTracking");
        this.f58186a = resource;
        this.f58187b = i10;
        this.f58188c = i11;
        this.f58189d = str;
        this.f58190e = clickTracking;
        this.f58191f = viewTracking;
        this.f58192g = l10;
        this.f58193h = tVar;
    }

    public final String a() {
        return this.f58189d;
    }

    public final List b() {
        return this.f58190e;
    }

    public final Long c() {
        return this.f58192g;
    }

    public final int d() {
        return this.f58188c;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t e() {
        return this.f58193h;
    }

    public final a0 f() {
        return this.f58186a;
    }

    public final List g() {
        return this.f58191f;
    }

    public final int h() {
        return this.f58187b;
    }
}
