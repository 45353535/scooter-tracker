package com.ironsource;

import android.app.Activity;
import com.ironsource.C4344h6;
import com.ironsource.InterfaceC4355i0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4447n6 implements InterfaceC4481p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Za f44449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f44450b;

    public C4447n6(@NotNull Za adInternal, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f44449a = adInternal;
        this.f44450b = adInfo;
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string = this.f44449a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f44449a.a(new LevelPlayAdError(string, this.f44449a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.f44450b);
    }

    @Override // com.ironsource.InterfaceC4481p6
    @NotNull
    public InterfaceC4355i0 c() {
        return new InterfaceC4355i0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void loadAd() {
        String string = this.f44449a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        Za.a(this.f44449a, new LevelPlayAdError(string, this.f44449a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdClicked() {
        this.f44449a.a("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdClosed() {
        this.f44449a.a("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4441n0 c4441n0F = this.f44449a.f();
        final LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(adInfo, this.f44450b.getPlacementName());
        IronLog.INTERNAL.verbose(C4441n0.a(c4441n0F, "onAdDisplayed adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        c4441n0F.e().h().e();
        Za za2 = this.f44449a;
        za2.a(new C4464o6(za2, levelPlayAdInfo));
        c4441n0F.e(new Runnable() { // from class: com.ironsource.hl
            @Override // java.lang.Runnable
            public final void run() {
                C4447n6.a(this.f43291b, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f44449a.a("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f44449a.a("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f44449a.a("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.f44450b;
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f44449a.a(a(error, this.f44450b));
        this.f44449a.a(error, this.f44450b);
    }

    private final InterfaceC4481p6 a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (C4258c5.f42807a.a(Gf.f41012a.a(levelPlayAdError))) {
            Za za2 = this.f44449a;
            return new C4411l6(za2, levelPlayAdInfo, za2.j());
        }
        return new C4344h6(this.f44449a, C4344h6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a() {
        this.f44449a.a("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4447n6 this$0, LevelPlayAdInfo adInfoWithPlacement) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfoWithPlacement, "$adInfoWithPlacement");
        InterfaceC4229ab interfaceC4229abK = this$0.f44449a.k();
        if (interfaceC4229abK != null) {
            interfaceC4229abK.onAdDisplayed(adInfoWithPlacement);
        }
    }
}
