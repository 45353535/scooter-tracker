package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Z implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4520rc f42200a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f42201a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f42202b = 1000;

        private a() {
        }
    }

    public Z(@NotNull InterfaceC4520rc networkLoadApi) {
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        this.f42200a = networkLoadApi;
    }

    @Override // com.ironsource.Y
    @NotNull
    public String a() {
        return this.f42200a.a();
    }

    @Override // com.ironsource.Y
    public void a(@NotNull L9 adInstance, @NotNull Map<String, String> loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        try {
            this.f42200a.a(adInstance, new C4554tc(null, false, 3, null));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e10.getMessage());
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("1000: loadAd failed: ");
            sb2.append(message);
            String string = sb2.toString();
            Ec ecB = adInstance.b();
            if (ecB instanceof C4242b6) {
                Ec ecB2 = adInstance.b();
                Intrinsics.checkNotNull(ecB2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((C4242b6) ecB2).onInterstitialLoadFailed(string);
            } else if (ecB instanceof Gc) {
                Ec ecB3 = adInstance.b();
                Intrinsics.checkNotNull(ecB3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((Gc) ecB3).onBannerLoadFail(string);
            }
        }
    }
}
