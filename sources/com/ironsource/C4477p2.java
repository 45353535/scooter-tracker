package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4477p2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4477p2 extends ng {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final V0 f44596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f44597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final C4494q2 f44598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Sc f44599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private InterfaceC4510r2 f44600i;

    /* JADX INFO: renamed from: com.ironsource.p2$a */
    public static final class a implements InterfaceC4510r2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f44602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ og f44603c;

        a(C c10, og ogVar) {
            this.f44602b = c10;
            this.f44603c = ogVar;
        }

        @Override // com.ironsource.InterfaceC4510r2
        public void a(@NotNull final List<C4424m2> newWaterfall, @NotNull final Map<String, G> adInstancePayloads, @NotNull final String auctionId, @Nullable final C4424m2 c4424m2, @Nullable final JSONObject jSONObject, @Nullable final JSONObject jSONObject2, final int i10, final long j10, final int i11, @Nullable final String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            V0 v02 = C4477p2.this.f44596e;
            final C4477p2 c4477p2 = C4477p2.this;
            final C c10 = this.f44602b;
            final og ogVar = this.f44603c;
            v02.a(new Runnable() { // from class: com.ironsource.nl
                @Override // java.lang.Runnable
                public final void run() {
                    C4477p2.a.a(c4477p2, c10, ogVar, newWaterfall, adInstancePayloads, auctionId, c4424m2, jSONObject, jSONObject2, i10, j10, i11, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4477p2 this$0, C adInstanceFactory, og waterfallFetcherListener, List newWaterfall, Map adInstancePayloads, String auctionId, C4424m2 c4424m2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(newWaterfall, "$newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "$adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "$auctionId");
            this$0.f44600i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, c4424m2, jSONObject, jSONObject2, i10, j10, i11, str);
        }

        @Override // com.ironsource.InterfaceC4510r2
        public void a(final int i10, @Nullable final String str, final int i11, @NotNull final String auctionFallback, final long j10) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            V0 v02 = C4477p2.this.f44596e;
            final C4477p2 c4477p2 = C4477p2.this;
            final C c10 = this.f44602b;
            final og ogVar = this.f44603c;
            v02.a(new Runnable() { // from class: com.ironsource.ml
                @Override // java.lang.Runnable
                public final void run() {
                    C4477p2.a.a(c4477p2, c10, ogVar, i10, str, i11, auctionFallback, j10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4477p2 this$0, C adInstanceFactory, og waterfallFetcherListener, int i10, String str, int i11, String auctionFallback, long j10) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(auctionFallback, "$auctionFallback");
            this$0.f44600i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, i10, str, i11, auctionFallback, j10);
        }

        @Override // com.ironsource.InterfaceC4510r2
        public void a(int i10, @NotNull String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            this.f44603c.a(i10, errorReason);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4477p2(@NotNull V0 adTools, @NotNull AbstractC4576v0 adUnitData) {
        super(adTools, adUnitData);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f44596e = adTools;
        this.f44597f = adUnitData;
        C4494q2 c4494q2 = new C4494q2(adTools, adUnitData);
        this.f44598g = c4494q2;
        this.f44599h = c4494q2.b();
    }

    @Override // com.ironsource.ng
    @NotNull
    public Sc a() {
        return this.f44599h;
    }

    @Override // com.ironsource.ng
    public void a(@NotNull C adInstanceFactory, @NotNull og waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        a aVar = new a(adInstanceFactory, waterfallFetcherListener);
        this.f44598g.a(aVar);
        this.f44600i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C c10, og ogVar, List<C4424m2> list, Map<String, G> map, String str, C4424m2 c4424m2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44596e, (String) null, (String) null, 3, (Object) null));
        C4373j2 c4373j2 = new C4373j2(str, jSONObject, c4424m2, i10, "");
        if (!TextUtils.isEmpty(str2)) {
            this.f44596e.e().h().a(i11, str2);
        }
        a(jSONObject2);
        pg pgVarA = a(list, map, c4373j2, c10);
        this.f44596e.e().a(new T1(c4373j2));
        this.f44596e.e().b().a(j10, this.f44597f.v() + ";wtf=" + pgVarA.c());
        this.f44596e.e().b().c(pgVarA.d());
        a(pgVarA, ogVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C c10, og ogVar, int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44596e, "Auction failed (error " + i10 + " - " + str + ")", (String) null, 2, (Object) null));
        boolean zN = this.f44597f.e().n();
        String strA = X1.f42009a.a(zN);
        C4373j2 c4373j2 = new C4373j2(strA, null, null, i11, str2);
        B5 b5E = this.f44596e.e();
        b5E.a(new T1(c4373j2));
        b5E.b().a(j10, i10, str);
        if (zN) {
            a(c10, ogVar, i11, str2, strA);
        } else {
            a(ogVar);
        }
    }

    private final void a(pg pgVar, og ogVar) {
        this.f44596e.h().a(pgVar);
        ogVar.a(pgVar);
    }

    private final void a(JSONObject jSONObject) {
        int i10;
        try {
            if (jSONObject == null) {
                this.f44597f.b(false);
                IronLog.INTERNAL.verbose(C4441n0.a(this.f44596e, "loading configuration from auction response is null, using the following: " + this.f44597f.v(), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.f43835x) && (i10 = jSONObject.getInt(com.ironsource.mediationsdk.d.f43835x)) > 0) {
                    this.f44597f.a(i10);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.f43836y)) {
                    this.f44597f.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.f43836y));
                }
                this.f44597f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f43837z, false));
                IronLog.INTERNAL.verbose(C4441n0.a(this.f44596e, this.f44597f.v(), (String) null, 2, (Object) null));
            } catch (JSONException e10) {
                C4462o4.d().a(e10);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f44597f.b().a() + " Error: " + e10.getMessage());
                ironLog.verbose(C4441n0.a(this.f44596e, this.f44597f.v(), (String) null, 2, (Object) null));
            }
        } catch (Throwable th2) {
            IronLog.INTERNAL.verbose(C4441n0.a(this.f44596e, this.f44597f.v(), (String) null, 2, (Object) null));
            throw th2;
        }
    }

    private final void a(C c10, og ogVar, int i10, String str, String str2) {
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44596e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new Bc(this.f44596e, this.f44597f).a(ogVar, i10, str, str2, c10);
    }

    private final void a(og ogVar) {
        ogVar.a(509, "Mediation No fill");
    }
}
