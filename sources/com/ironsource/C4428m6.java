package com.ironsource;

import android.app.Activity;
import com.ironsource.C4344h6;
import com.ironsource.InterfaceC4355i0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4428m6 implements InterfaceC4481p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Za f43695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4496q4 f43696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f43697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f43698d;

    public C4428m6(@NotNull Za adInternal, @NotNull InterfaceC4496q4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f43695a = adInternal;
        this.f43696b = currentTimeProvider;
        this.f43697c = currentTimeProvider.a();
        String string = adInternal.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f43698d = new LevelPlayAdInfo(string, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string = this.f43695a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f43695a.a(new LevelPlayAdError(string, this.f43695a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.f43698d);
    }

    @Override // com.ironsource.InterfaceC4481p6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.f43698d;
    }

    @Override // com.ironsource.InterfaceC4481p6
    @NotNull
    public InterfaceC4355i0 c() {
        return new InterfaceC4355i0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void loadAd() {
        String string = this.f43695a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f43695a.a(new LevelPlayAdError(string, this.f43695a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.f43696b.a() - this.f43697c);
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdClicked() {
        this.f43695a.a("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdClosed() {
        this.f43695a.a("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f43695a.a("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f43695a.a("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f43695a.a(error, this.f43696b.a() - this.f43697c);
        this.f43695a.a(C4344h6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Za za2 = this.f43695a;
        za2.a(new C4411l6(za2, adInfo, this.f43696b));
        this.f43695a.a(adInfo);
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a() {
        this.f43695a.a("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f43695a.a("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
