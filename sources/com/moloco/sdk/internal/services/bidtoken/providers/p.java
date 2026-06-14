package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f55430e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55431f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f55432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.f f55433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f55434d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public p(i0 deviceInfoService, com.moloco.sdk.internal.services.f screenInfoService) {
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        Intrinsics.checkNotNullParameter(screenInfoService, "screenInfoService");
        this.f55432b = deviceInfoService;
        this.f55433c = screenInfoService;
        this.f55434d = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f55434d = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        o oVarE = e();
        boolean z10 = !Intrinsics.areEqual(oVarE, this.f55434d);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "DSignalProvider", "[CBT] DSP needsRefresh: " + z10 + ", with current: " + oVarE + ", cached: " + this.f55434d, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "DSignalProvider";
    }

    public final o e() {
        try {
            return new o(this.f55433c.b(), this.f55432b.c(), this.f55432b.d());
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "DSignalProvider", "[CBT] DSP Error", e10, false, 8, null);
            return new o(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public o d() {
        return this.f55434d;
    }
}
