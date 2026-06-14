package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4632y5 implements InterfaceC4655zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final RewardedAdRequest f45868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Jd f45869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4476p1 f45870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final IronSourceError f45871d;

    public C4632y5(@NotNull RewardedAdRequest adRequest, @NotNull Jd adLoadTaskListener, @NotNull InterfaceC4476p1 analytics, @NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f45868a = adRequest;
        this.f45869b = adLoadTaskListener;
        this.f45870c = analytics;
        this.f45871d = error;
    }

    @NotNull
    public final IronSourceError a() {
        return this.f45871d;
    }

    @Override // com.ironsource.InterfaceC4655zb
    public void start() {
        C4547t5 c4547t5 = new C4547t5(this.f45870c, this.f45868a.getAdId$mediationsdk_release(), this.f45868a.getProviderName$mediationsdk_release());
        c4547t5.a();
        c4547t5.a(this.f45871d);
        this.f45869b.b(this.f45871d);
    }
}
