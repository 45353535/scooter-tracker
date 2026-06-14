package com.ironsource;

import com.google.android.material.internal.ViewUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4290e3 implements Cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final BannerAdRequest f42957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final BannerAdLoaderListener f42958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4271d1 f42959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4459o1 f42960d;

    public C4290e3(@NotNull BannerAdRequest adRequest, @NotNull BannerAdLoaderListener publisherListener, @NotNull InterfaceC4271d1 adapterConfigProvider, @NotNull InterfaceC4459o1 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f42957a = adRequest;
        this.f42958b = publisherListener;
        this.f42959c = adapterConfigProvider;
        this.f42960d = analyticsFactory;
    }

    @Override // com.ironsource.Cb
    @NotNull
    public InterfaceC4655zb a() throws Exception {
        IronSourceError ironSourceErrorA;
        String instanceId = this.f42957a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.BANNER;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC4476p1 interfaceC4476p1A = this.f42960d.a(new C4372j1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Ab abA = new Bb(this.f42957a.getAdm(), this.f42957a.getProviderName$mediationsdk_release(), this.f42959c, C4333gc.f43184e.a().c().get()).a();
            new C4256c3(abA, this.f42957a.getSize()).a();
            C4537sc c4537sc = new C4537sc();
            C4390k2 c4390k2 = new C4390k2(this.f42957a.getAdm(), this.f42957a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.f42957a;
            AdSize size = bannerAdRequest.getSize();
            Intrinsics.checkNotNull(abA);
            S7 s72 = S7.f41731a;
            return new C4239b3(bannerAdRequest, size, c4390k2, abA, c4537sc, interfaceC4476p1A, new C4273d3(s72, this.f42958b), new D2(interfaceC4476p1A, s72.c()), null, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            if (e10 instanceof C4352he) {
                ironSourceErrorA = ((C4352he) e10).a();
            } else {
                C4598w5 c4598w5 = C4598w5.f45712a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorA = c4598w5.a(message);
            }
            return new C4581v5(ironSourceErrorA, new C4273d3(S7.f41731a, this.f42958b), interfaceC4476p1A);
        }
    }

    public /* synthetic */ C4290e3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC4271d1 interfaceC4271d1, InterfaceC4459o1 interfaceC4459o1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC4271d1, (i10 & 8) != 0 ? new C4442n1(IronSource.a.BANNER) : interfaceC4459o1);
    }
}
