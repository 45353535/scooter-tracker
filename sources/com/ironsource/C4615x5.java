package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4615x5 implements InterfaceC4655zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterstitialAdRequest f45816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4619x9 f45817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4476p1 f45818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final IronSourceError f45819d;

    public C4615x5(@NotNull InterstitialAdRequest adRequest, @NotNull C4619x9 adLoadTaskListener, @NotNull InterfaceC4476p1 analytics, @NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f45816a = adRequest;
        this.f45817b = adLoadTaskListener;
        this.f45818c = analytics;
        this.f45819d = error;
    }

    @NotNull
    public final IronSourceError a() {
        return this.f45819d;
    }

    @Override // com.ironsource.InterfaceC4655zb
    public void start() {
        C4547t5 c4547t5 = new C4547t5(this.f45818c, this.f45816a.getAdId$mediationsdk_release(), this.f45816a.getProviderName$mediationsdk_release());
        c4547t5.a();
        c4547t5.a(this.f45819d);
        this.f45817b.b(this.f45819d);
    }
}
