package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Kd implements Cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final RewardedAdRequest f41213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final RewardedAdLoaderListener f41214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4271d1 f41215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4459o1 f41216d;

    public Kd(@NotNull RewardedAdRequest adRequest, @NotNull RewardedAdLoaderListener publisherListener, @NotNull InterfaceC4271d1 adapterConfigProvider, @NotNull InterfaceC4459o1 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f41213a = adRequest;
        this.f41214b = publisherListener;
        this.f41215c = adapterConfigProvider;
        this.f41216d = analyticsFactory;
    }

    @Override // com.ironsource.Cb
    @NotNull
    public InterfaceC4655zb a() throws Exception {
        IronSourceError ironSourceErrorD;
        String instanceId = this.f41213a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC4476p1 interfaceC4476p1A = this.f41216d.a(new C4372j1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Ab abA = new Bb(this.f41213a.getAdm(), this.f41213a.getProviderName$mediationsdk_release(), this.f41215c, C4333gc.f43184e.a().c().get()).a();
            new Id(abA).a();
            C4537sc c4537sc = new C4537sc();
            C4390k2 c4390k2 = new C4390k2(this.f41213a.getAdm(), this.f41213a.getProviderName$mediationsdk_release());
            RewardedAdRequest rewardedAdRequest = this.f41213a;
            Intrinsics.checkNotNull(abA);
            S7 s72 = S7.f41731a;
            return new Hd(rewardedAdRequest, abA, new Jd(s72, this.f41214b), c4390k2, c4537sc, interfaceC4476p1A, new Cd(interfaceC4476p1A, s72.c()), null, null, 384, null);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            if (e10 instanceof C4352he) {
                ironSourceErrorD = ((C4352he) e10).a();
            } else {
                C4598w5 c4598w5 = C4598w5.f45712a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorD = c4598w5.d(message);
            }
            return new C4632y5(this.f41213a, new Jd(S7.f41731a, this.f41214b), interfaceC4476p1A, ironSourceErrorD);
        }
    }

    public /* synthetic */ Kd(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, InterfaceC4271d1 interfaceC4271d1, InterfaceC4459o1 interfaceC4459o1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardedAdRequest, rewardedAdLoaderListener, interfaceC4271d1, (i10 & 8) != 0 ? new C4442n1(IronSource.a.REWARDED_VIDEO) : interfaceC4459o1);
    }
}
