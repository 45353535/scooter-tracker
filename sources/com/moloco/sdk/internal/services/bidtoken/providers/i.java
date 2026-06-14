package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.a0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55407d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55408e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f55409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f55410c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public i(a0 batteryInfoService) {
        Intrinsics.checkNotNullParameter(batteryInfoService, "batteryInfoService");
        this.f55409b = batteryInfoService;
        this.f55410c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f55410c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean z10 = !Intrinsics.areEqual(this.f55410c, e());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: needsRefresh: " + z10, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "BInfoSignalProvider";
    }

    public final h e() {
        try {
            h hVar = new h(Integer.valueOf(this.f55409b.b()), Integer.valueOf(this.f55409b.a()), Boolean.valueOf(this.f55409b.c()));
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: blev: " + hVar.b() + ", bst: " + hVar.a() + ", psm: " + hVar.c(), false, 4, null);
            return hVar;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: Error", e10, false, 8, null);
            return new h(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public h d() {
        return this.f55410c;
    }
}
