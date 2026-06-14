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

/* JADX INFO: renamed from: com.ironsource.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4464o6 implements InterfaceC4481p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Za f44557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdInfo f44558b;

    public C4464o6(@NotNull Za adInternal, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f44557a = adInternal;
        this.f44558b = adInfo;
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string = this.f44557a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        this.f44557a.a(new LevelPlayAdError(string, this.f44557a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.f44558b);
    }

    @Override // com.ironsource.InterfaceC4481p6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.f44558b;
    }

    @Override // com.ironsource.InterfaceC4481p6
    @NotNull
    public InterfaceC4355i0 c() {
        return new InterfaceC4355i0.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void loadAd() {
        String string = this.f44557a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInternal.adId.toString()");
        Za.a(this.f44557a, new LevelPlayAdError(string, this.f44557a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44557a.f(), "onAdClicked adInfo: " + this.f44558b, (String) null, 2, (Object) null));
        this.f44557a.f().e(new Runnable() { // from class: com.ironsource.jl
            @Override // java.lang.Runnable
            public final void run() {
                C4464o6.a(this.f43427b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44557a.f(), "onAdClosed adInfo: " + this.f44558b, (String) null, 2, (Object) null));
        this.f44557a.f().d(new Runnable() { // from class: com.ironsource.kl
            @Override // java.lang.Runnable
            public final void run() {
                C4464o6.b(this.f43491b);
            }
        });
        this.f44557a.f().e(new Runnable() { // from class: com.ironsource.ll
            @Override // java.lang.Runnable
            public final void run() {
                C4464o6.c(this.f43602b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f44557a.a("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f44557a.a("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f44557a.a("onAdLoadFailed on shown state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f44557a.a("onAdLoaded on shown state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4464o6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f44557a.a(C4344h6.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4464o6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4229ab interfaceC4229abK = this$0.f44557a.k();
        if (interfaceC4229abK != null) {
            interfaceC4229abK.onAdClosed(this$0.f44558b);
        }
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a() {
        this.f44557a.a("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f44557a.a("onAdDisplayFailed on shown state with error: " + error.getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4464o6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4229ab interfaceC4229abK = this$0.f44557a.k();
        if (interfaceC4229abK != null) {
            interfaceC4229abK.onAdClicked(this$0.f44558b);
        }
    }
}
