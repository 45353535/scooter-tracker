package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55389d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55390e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.o f55391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.internal.services.n f55392c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(com.moloco.sdk.internal.services.o advertisingService) {
        Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
        this.f55391b = advertisingService;
        this.f55392c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f55392c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean z10 = !Intrinsics.areEqual(this.f55392c, e());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AdvertisingSignalProvider", "[CBT][ASP]: needsRefresh: " + z10, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "AdvertisingSignalProvider";
    }

    public final com.moloco.sdk.internal.services.n e() {
        com.moloco.sdk.internal.services.n nVarA = this.f55391b.a();
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AdvertisingSignalProvider", "[CBT][ASP]: adData: " + nVarA, false, 4, null);
        return nVarA;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.n d() {
        return e();
    }
}
