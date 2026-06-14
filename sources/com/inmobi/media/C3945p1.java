package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3945p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jg f39233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdConfig f39234b;

    public C3945p1(Gc gc2, Jg jg2) {
        gc2.getClass();
        this.f39233a = jg2;
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        this.f39234b = (AdConfig) Y3.f38021a.a(AdConfig.class);
    }
}
