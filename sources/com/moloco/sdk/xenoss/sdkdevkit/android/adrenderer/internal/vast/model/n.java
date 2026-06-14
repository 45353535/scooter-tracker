package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f57585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f57586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f57588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f57589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f57590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f57591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f57592i;

    public n(String str, Integer num, Integer num2, String str2, t tVar, Long l10, o oVar, List viewTrackingUrlList, a0 resource) {
        Intrinsics.checkNotNullParameter(viewTrackingUrlList, "viewTrackingUrlList");
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.f57584a = str;
        this.f57585b = num;
        this.f57586c = num2;
        this.f57587d = str2;
        this.f57588e = tVar;
        this.f57589f = l10;
        this.f57590g = oVar;
        this.f57591h = viewTrackingUrlList;
        this.f57592i = resource;
    }

    public final String a() {
        return this.f57587d;
    }

    public final o b() {
        return this.f57590g;
    }

    public final Long c() {
        return this.f57589f;
    }

    public final Integer d() {
        return this.f57586c;
    }

    public final t e() {
        return this.f57588e;
    }

    public final a0 f() {
        return this.f57592i;
    }

    public final List g() {
        return this.f57591h;
    }

    public final Integer h() {
        return this.f57585b;
    }
}
