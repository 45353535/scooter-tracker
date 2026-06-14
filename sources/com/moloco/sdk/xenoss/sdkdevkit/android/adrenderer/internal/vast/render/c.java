package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f57758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f57762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f57763f;

    public c(a0 resource, int i10, int i11, String str, List clickTracking, List creativeViewTracking) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(creativeViewTracking, "creativeViewTracking");
        this.f57758a = resource;
        this.f57759b = i10;
        this.f57760c = i11;
        this.f57761d = str;
        this.f57762e = clickTracking;
        this.f57763f = creativeViewTracking;
    }

    public final String a() {
        return this.f57761d;
    }

    public final List b() {
        return this.f57762e;
    }

    public final List c() {
        return this.f57763f;
    }

    public final int d() {
        return this.f57760c;
    }

    public final a0 e() {
        return this.f57758a;
    }

    public final int f() {
        return this.f57759b;
    }
}
