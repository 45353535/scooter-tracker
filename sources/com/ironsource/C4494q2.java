package com.ironsource;

import com.ironsource.P1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4494q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final V0 f44670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f44671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.ironsource.mediationsdk.e f44672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C4272d2 f44673d;

    /* JADX INFO: renamed from: com.ironsource.q2$a */
    public static final class a implements P1.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4510r2 f44675b;

        a(InterfaceC4510r2 interfaceC4510r2) {
            this.f44675b = interfaceC4510r2;
        }

        @Override // com.ironsource.P1.d
        public void a(@NotNull P1 auction) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            C4494q2.this.b(auction, this.f44675b);
        }

        @Override // com.ironsource.P1.d
        public void a(@NotNull P1 auction, @NotNull String error) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            Intrinsics.checkNotNullParameter(error, "error");
            C4494q2.this.b(auction, this.f44675b);
        }
    }

    public C4494q2(@NotNull V0 adTools, @NotNull AbstractC4576v0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f44670a = adTools;
        this.f44671b = adUnitData;
        C4460o2 c4460o2E = adUnitData.e();
        String strD = IronSourceUtils.d();
        Intrinsics.checkNotNullExpressionValue(strD, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(c4460o2E, strD));
        this.f44672c = eVar;
        this.f44673d = new C4272d2(adTools, eVar);
    }

    @NotNull
    public final C4272d2 b() {
        return this.f44673d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(P1 p12, InterfaceC4510r2 interfaceC4510r2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("auction waterfallString = " + ((Object) p12.d().c())));
        if (!p12.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.f44670a.e().b().a(1005, "No candidates available for auctioning");
            interfaceC4510r2.a(C4644z0.e(this.f44671b.b().a()), "no available ad to load");
        } else {
            this.f44670a.e().b().b(p12.d().c().toString());
            this.f44672c.a(ContextProvider.getInstance().getApplicationContext(), a(p12, this.f44670a.f()), new b(interfaceC4510r2, p12));
        }
    }

    public void a(@NotNull InterfaceC4510r2 completionListener) {
        Intrinsics.checkNotNullParameter(completionListener, "completionListener");
        IronLog.INTERNAL.verbose(a());
        this.f44670a.e().b().a(this.f44671b.b().d());
        a(new P1(this.f44670a, this.f44671b), completionListener);
    }

    /* JADX INFO: renamed from: com.ironsource.q2$b */
    public static final class b implements R1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4510r2 f44676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ P1 f44677b;

        b(InterfaceC4510r2 interfaceC4510r2, P1 p12) {
            this.f44676a = interfaceC4510r2;
            this.f44677b = p12;
        }

        @Override // com.ironsource.R1
        public void a(@NotNull List<C4424m2> newWaterfall, @NotNull String auctionId, @Nullable C4424m2 c4424m2, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, int i10, long j10, int i11, @Nullable String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f44676a.a(newWaterfall, this.f44677b.c(), auctionId, c4424m2, jSONObject, jSONObject2, i10, j10, i11, str);
        }

        @Override // com.ironsource.R1
        public void a(int i10, @Nullable String str, int i11, @NotNull String auctionFallback, long j10) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            this.f44676a.a(i10, str, i11, auctionFallback, j10);
        }
    }

    private final void a(P1 p12, InterfaceC4510r2 interfaceC4510r2) {
        if (!p12.f()) {
            b(p12, interfaceC4510r2);
        } else {
            p12.a(new a(interfaceC4510r2));
        }
    }

    private final com.ironsource.mediationsdk.i a(P1 p12, int i10) {
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f44671b.b().a());
        iVar.b(IronSourceUtils.g());
        iVar.a(p12.d().a());
        iVar.a(p12.d().b());
        iVar.a(this.f44670a.h());
        iVar.a(i10);
        iVar.a(this.f44670a.k());
        C4642yf c4642yfG = this.f44671b.b().g();
        iVar.e(c4642yfG != null ? c4642yfG.b() : false);
        iVar.a(this.f44671b.b().d());
        InterfaceC4323g2 interfaceC4323g2I = this.f44670a.i();
        if (interfaceC4323g2I != null) {
            interfaceC4323g2I.a(iVar);
        }
        return iVar;
    }

    private final String a(String str) {
        return C4441n0.a(this.f44670a, str, (String) null, 2, (Object) null);
    }

    private final String a() {
        return C4441n0.a(this.f44670a, (String) null, (String) null, 2, (Object) null);
    }
}
