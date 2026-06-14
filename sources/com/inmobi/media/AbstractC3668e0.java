package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3668e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3945p1 f38475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f38476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig f38477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jg f38478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3903n9 f38479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3617c0 f38480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3869m0 f38481g;

    public AbstractC3668e0(C3920o1 adManagerComponent) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullExpressionValue(adManagerComponent.f39144b.getApplicationContext(), "getApplicationContext(...)");
        C3945p1 c3945p1 = adManagerComponent.f39143a;
        this.f38475a = c3945p1;
        this.f38476b = adManagerComponent.f39147e;
        this.f38477c = c3945p1.f39234b;
        this.f38478d = c3945p1.f39233a;
        this.f38479e = adManagerComponent.f39145c;
        this.f38480f = adManagerComponent.f39146d;
        this.f38481g = adManagerComponent.f39148f;
    }
}
