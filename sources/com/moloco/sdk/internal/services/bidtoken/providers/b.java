package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55385d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55386e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.l f55387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.internal.services.bidtoken.providers.a f55388c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public b(com.moloco.sdk.internal.services.l accessibilityInfoService) {
        Intrinsics.checkNotNullParameter(accessibilityInfoService, "accessibilityInfoService");
        this.f55387b = accessibilityInfoService;
        this.f55388c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f55388c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        com.moloco.sdk.internal.services.bidtoken.providers.a aVarE = e();
        boolean z10 = !Intrinsics.areEqual(aVarE, this.f55388c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] needsRefresh: " + z10 + ", with current: " + aVarE + ", cached: " + this.f55388c, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "AcSignalProvider";
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.a e() {
        try {
            return new com.moloco.sdk.internal.services.bidtoken.providers.a(Boolean.valueOf(this.f55387b.c()), Boolean.valueOf(this.f55387b.b()), Boolean.valueOf(this.f55387b.a()), Float.valueOf(this.f55387b.getFontScale()));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] ACS Error", e10, false, 8, null);
            return new com.moloco.sdk.internal.services.bidtoken.providers.a(null, null, null, null, 15, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.a d() {
        return this.f55388c;
    }
}
