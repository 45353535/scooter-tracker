package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55400d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55401e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f55402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f55403c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public g(y audioService) {
        Intrinsics.checkNotNullParameter(audioService, "audioService");
        this.f55402b = audioService;
        this.f55403c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f55403c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        f fVarE = e();
        boolean z10 = !Intrinsics.areEqual(fVarE, this.f55403c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] needsRefresh: " + z10 + ", with current: " + fVarE + ", cached: " + this.f55403c, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "AudSignalProvider";
    }

    public final f e() {
        try {
            return new f(this.f55402b.a(), Integer.valueOf(this.f55402b.b()));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] AS Error", e10, false, 8, null);
            return new f(null, null, 3, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public f d() {
        return this.f55403c;
    }
}
