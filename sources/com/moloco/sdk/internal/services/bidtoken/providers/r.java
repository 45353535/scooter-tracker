package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55443d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55444e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f55445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f55446c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public r(Function0 _ilrdService) {
        Intrinsics.checkNotNullParameter(_ilrdService, "_ilrdService");
        this.f55445b = _ilrdService;
        this.f55446c = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f55446c = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        q qVarF = f();
        boolean z10 = !Intrinsics.areEqual(qVarF, this.f55446c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "IlrdSignalProvider", "[Ilrd] needsRefresh: " + z10 + ", with current: " + qVarF + ", cached: " + this.f55446c, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "IlrdSignalProvider";
    }

    public final q e() {
        return new q("", -1L, -1L, -1, -1, -1, -1, -1);
    }

    public final q f() {
        q qVarF;
        try {
            com.moloco.sdk.internal.ilrd.g gVar = (com.moloco.sdk.internal.ilrd.g) this.f55445b.invoke();
            if (gVar != null && (qVarF = gVar.f()) != null) {
                return qVarF;
            }
            return e();
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "IlrdSignalProvider", "Error retrieving ILRD signal", e10, false, 8, null);
            return e();
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public q d() {
        return this.f55446c;
    }
}
