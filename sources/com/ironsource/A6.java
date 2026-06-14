package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class A6 implements B6, InterfaceC4548t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4599w6 f40390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4498q6 f40391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private C4498q6 f40392c;

    public A6(@NotNull C4599w6 strategy, @NotNull C4498q6 currentAdUnit, @Nullable C4498q6 c4498q6) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f40390a = strategy;
        this.f40391b = currentAdUnit;
        this.f40392c = c4498q6;
        currentAdUnit.a(this);
    }

    @Override // com.ironsource.B6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f40390a.a("show called while showing");
    }

    @Override // com.ironsource.B6
    public void b(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.f40391b) {
            this.f40390a.a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.B6
    public void c(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.f40391b) {
            this.f40390a.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.J0
    public void e() {
        this.f40390a.c().e();
    }

    @Override // com.ironsource.B6
    public void loadAd() {
        this.f40390a.a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC4548t6
    public void onClosed() {
        this.f40390a.a(a(this, null, 1, null));
        this.f40390a.c().onClosed();
    }

    @Override // com.ironsource.B6
    public void a(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.f40391b)) {
            this.f40390a.d().a(adInfo);
        } else {
            this.f40390a.a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.B6
    public void b(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.f40392c) {
            this.f40392c = null;
        } else {
            this.f40390a.a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.B6
    public void a(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (!Intrinsics.areEqual(adUnit, this.f40391b)) {
            this.f40390a.a("progressive show failed while showing current ad");
            return;
        }
        this.f40390a.a(a(ironSourceError));
        this.f40390a.d().c(ironSourceError);
    }

    @Override // com.ironsource.B6
    public void a(@NotNull C4498q6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.f40392c) {
            this.f40392c = null;
        } else {
            this.f40390a.a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC4548t6
    public void a(@NotNull LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f40390a.c().a(reward);
    }

    static /* synthetic */ B6 a(A6 a62, IronSourceError ironSourceError, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ironSourceError = null;
        }
        return a62.a(ironSourceError);
    }

    private final B6 a(IronSourceError ironSourceError) {
        if (C4258c5.f42807a.a(ironSourceError)) {
            return new C4633y6(this.f40390a, this.f40391b, this.f40392c, true);
        }
        C4498q6 c4498q6 = this.f40392c;
        if (c4498q6 == null) {
            return new C4616x6(this.f40390a);
        }
        if (c4498q6.e() != null) {
            return new C4633y6(this.f40390a, c4498q6, null, false, 8, null);
        }
        return new C4650z6(this.f40390a, c4498q6, false);
    }
}
