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

/* JADX INFO: renamed from: com.ironsource.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4411l6 implements InterfaceC4481p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Za f43547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f43548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4496q4 f43549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f43550d;

    public C4411l6(@NotNull Za adInternal, @NotNull LevelPlayAdInfo adInfo, @NotNull InterfaceC4496q4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f43547a = adInternal;
        this.f43548b = adInfo;
        this.f43549c = currentTimeProvider;
        this.f43550d = currentTimeProvider.a();
    }

    private final long d() {
        return this.f43549c.a() - this.f43550d;
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4283dd c4283ddA = this.f43547a.f().a(this.f43547a.d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.f43548b, str);
        this.f43548b = levelPlayAdInfo;
        Za za2 = this.f43547a;
        za2.a(new C4447n6(za2, levelPlayAdInfo));
        this.f43547a.c().a(activity, c4283ddA);
    }

    @Override // com.ironsource.InterfaceC4481p6
    @NotNull
    public InterfaceC4355i0 c() {
        L3 l3A = this.f43547a.l().f().a(this.f43547a.h());
        return l3A.d() ? InterfaceC4355i0.a.f43297c.a(l3A.e()) : InterfaceC4355i0.b.f43300a;
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void loadAd() {
        this.f43547a.f().e().h().a(Long.valueOf(d()));
        this.f43547a.a(this.f43548b);
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdClicked() {
        this.f43547a.a("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdClosed() {
        this.f43547a.a("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f43547a.a("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdInfoChanged(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4441n0 c4441n0F = this.f43547a.f();
        IronLog.INTERNAL.verbose(C4441n0.a(c4441n0F, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        c4441n0F.e().h().a(this.f43548b, adInfo);
        this.f43548b = adInfo;
        c4441n0F.e(new Runnable() { // from class: com.ironsource.fl
            @Override // java.lang.Runnable
            public final void run() {
                C4411l6.a(this.f43139b, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f43547a.a("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f43547a.a("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC4481p6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.f43548b;
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a() {
        IronLog.INTERNAL.verbose(C4441n0.a(this.f43547a.f(), "onAdExpired", (String) null, 2, (Object) null));
        this.f43547a.a(C4344h6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4411l6 this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC4229ab interfaceC4229abK = this$0.f43547a.k();
        if (interfaceC4229abK != null) {
            interfaceC4229abK.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4481p6
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f43547a.a("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
