package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55458d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55459e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.b f55460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f55461c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public v(com.moloco.sdk.internal.services.b networkInfoService) {
        Intrinsics.checkNotNullParameter(networkInfoService, "networkInfoService");
        this.f55460b = networkInfoService;
        this.f55461c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f55461c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        u uVarE = e();
        boolean z10 = !Intrinsics.areEqual(uVarE, this.f55461c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS needsRefresh: " + z10 + ", with nis: " + uVarE + ", cached: " + this.f55461c, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "NISignalProvider";
    }

    public final u e() {
        try {
            u uVar = new u(this.f55460b.d(), this.f55460b.b(), Boolean.valueOf(this.f55460b.a()), this.f55460b.c());
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS providing " + uVar, false, 4, null);
            return uVar;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS Error", e10, false, 8, null);
            return new u(null, null, null, null, 15, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public u d() {
        return this.f55461c;
    }
}
