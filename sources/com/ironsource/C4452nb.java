package com.ironsource;

import android.app.Activity;
import com.ironsource.Za;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4452nb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Za f44459a;

    /* JADX INFO: renamed from: com.ironsource.nb$a */
    public static final class a implements InterfaceC4593w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I7 f44460a;

        a(I7 i72) {
            this.f44460a = i72;
        }

        @Override // com.ironsource.InterfaceC4593w0
        @NotNull
        public AbstractC4576v0 a(boolean z10, @NotNull C4304f0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return Ld.f41286z.a(adProperties, this.f44460a.e().a(), z10);
        }
    }

    public C4452nb(@NotNull String adUnitId, @NotNull Za.b config, @NotNull C4441n0 adTools, @NotNull C4310f6 adControllerFactory, @NotNull I7 provider, @NotNull InterfaceC4496q4 currentTimeProvider, @NotNull C4600w7 idFactory) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.f44459a = new Za(LevelPlay.AdFormat.REWARDED, adUnitId, config, adTools, adControllerFactory, a(provider), provider, currentTimeProvider, idFactory);
    }

    @NotNull
    public final String a() {
        String string = this.f44459a.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final boolean b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.f44459a.m();
    }

    public final void c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.f44459a.n();
    }

    public final void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.f44459a.a(activity, str);
    }

    public final void a(@Nullable LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.f44459a.a(levelPlayRewardedAdListener != null ? C4469ob.b(levelPlayRewardedAdListener) : null);
    }

    private final a a(I7 i72) {
        return new a(i72);
    }
}
