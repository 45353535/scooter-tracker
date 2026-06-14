package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f57605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f57606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f57607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f57608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f57609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f57610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f57611g;

    public r(t tVar, e eVar, Long l10, List mediaFiles, List trackingList, a aVar, List icons) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(trackingList, "trackingList");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f57605a = tVar;
        this.f57606b = eVar;
        this.f57607c = l10;
        this.f57608d = mediaFiles;
        this.f57609e = trackingList;
        this.f57610f = aVar;
        this.f57611g = icons;
    }

    public final Long a() {
        return this.f57607c;
    }

    public final List b() {
        return this.f57611g;
    }

    public final List c() {
        return this.f57608d;
    }

    public final t d() {
        return this.f57605a;
    }

    public final List e() {
        return this.f57609e;
    }

    public final a f() {
        return this.f57610f;
    }
}
