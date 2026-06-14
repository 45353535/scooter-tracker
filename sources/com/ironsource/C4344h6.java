package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC4355i0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4344h6 implements InterfaceC4481p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Za f43233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f43234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f43235c;

    /* JADX INFO: renamed from: com.ironsource.h6$a */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C4344h6(@NotNull Za adInternal, @NotNull a status) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f43233a = adInternal;
        this.f43234b = status;
        String string = adInternal.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f43235c = new LevelPlayAdInfo(string, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    private final boolean d() {
        if (this.f43233a.h().length() == 0) {
            Za za2 = this.f43233a;
            String string = this.f43233a.e().toString();
            Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
            Za.a(za2, new LevelPlayAdError(string, this.f43233a.h(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.f43233a.f().g()) {
            Za za3 = this.f43233a;
            String string2 = this.f43233a.e().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "adInternal.adId.toString()");
            Za.a(za3, new LevelPlayAdError(string2, this.f43233a.h(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        Xa xaA = this.f43233a.l().e().a();
        if (xaA != null && xaA.a(this.f43233a.h(), this.f43233a.d())) {
            return true;
        }
        Za za4 = this.f43233a;
        String string3 = this.f43233a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "adInternal.adId.toString()");
        Za.a(za4, new LevelPlayAdError(string3, this.f43233a.h(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str2 = this.f43234b == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String string = this.f43233a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f43233a.a(new LevelPlayAdError(string, this.f43233a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.f43235c);
    }

    @Override // com.ironsource.InterfaceC4481p6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.f43235c;
    }

    @Override // com.ironsource.InterfaceC4481p6
    @NotNull
    public InterfaceC4355i0 c() {
        return new InterfaceC4355i0.a(this.f43234b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void loadAd() {
        if (d()) {
            this.f43233a.o();
        }
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdClicked() {
        this.f43233a.a("onAdClicked on " + this.f43234b + " state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdClosed() {
        this.f43233a.a("onAdClosed on " + this.f43234b + " state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f43233a.a("onAdDisplayed on " + this.f43234b + " state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f43233a.a("onAdInfoChanged on " + this.f43234b + " state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f43233a.a("onAdLoadFailed on " + this.f43234b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f43233a.a("onAdLoaded on " + this.f43234b + " state");
    }

    public /* synthetic */ C4344h6(Za za2, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(za2, (i10 & 2) != 0 ? a.Created : aVar);
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f43233a.a("onAdDisplayFailed on " + this.f43234b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a() {
        this.f43233a.a("onAdExpired on " + this.f43234b + " state");
    }
}
