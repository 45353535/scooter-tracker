package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4636y9 implements Cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterstitialAdRequest f45877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterstitialAdLoaderListener f45878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4271d1 f45879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4459o1 f45880d;

    public C4636y9(@NotNull InterstitialAdRequest adRequest, @NotNull InterstitialAdLoaderListener publisherListener, @NotNull InterfaceC4271d1 adapterConfigProvider, @NotNull InterfaceC4459o1 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f45877a = adRequest;
        this.f45878b = publisherListener;
        this.f45879c = adapterConfigProvider;
        this.f45880d = analyticsFactory;
    }

    @Override // com.ironsource.Cb
    @NotNull
    public InterfaceC4655zb a() throws Exception {
        IronSourceError ironSourceErrorB;
        String instanceId = this.f45877a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC4476p1 interfaceC4476p1A = this.f45880d.a(new C4372j1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Ab abA = new Bb(this.f45877a.getAdm(), this.f45877a.getProviderName$mediationsdk_release(), this.f45879c, C4333gc.f43184e.a().c().get()).a();
            new C4602w9(abA).a();
            C4537sc c4537sc = new C4537sc();
            C4390k2 c4390k2 = new C4390k2(this.f45877a.getAdm(), this.f45877a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.f45877a;
            Intrinsics.checkNotNull(abA);
            S7 s72 = S7.f41731a;
            return new C4585v9(interstitialAdRequest, abA, new C4619x9(s72, this.f45878b), c4390k2, c4537sc, interfaceC4476p1A, new C4517r9(interfaceC4476p1A, s72.c()), null, null, 384, null);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            if (e10 instanceof C4352he) {
                ironSourceErrorB = ((C4352he) e10).a();
            } else {
                C4598w5 c4598w5 = C4598w5.f45712a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                ironSourceErrorB = c4598w5.b(message);
            }
            return new C4615x5(this.f45877a, new C4619x9(S7.f41731a, this.f45878b), interfaceC4476p1A, ironSourceErrorB);
        }
    }

    public /* synthetic */ C4636y9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC4271d1 interfaceC4271d1, InterfaceC4459o1 interfaceC4459o1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC4271d1, (i10 & 8) != 0 ? new C4442n1(IronSource.a.INTERSTITIAL) : interfaceC4459o1);
    }
}
