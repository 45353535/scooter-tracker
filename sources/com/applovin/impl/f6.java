package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.d6;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class f6 extends i5 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final AtomicBoolean f8841o = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a3 f8842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f8843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f8844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0175a f8845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference f8846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f8847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f8848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f8849n;

    private class b extends i5 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f8850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f8851h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final y2 f8852i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f8853j;

        class a extends i3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MaxAdFormat f8855b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f8856c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a.InterfaceC0175a interfaceC0175a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0175a);
                this.f8855b = maxAdFormat;
                this.f8856c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f8850g;
                com.applovin.impl.sdk.o unused = b.this.f9073c;
                if (com.applovin.impl.sdk.o.a()) {
                    b.this.f9073c.a(b.this.f9072b, "Ad failed to load in " + jElapsedRealtime + " ms for " + this.f8855b.getLabel() + " ad unit " + str + " with error: " + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.f8852i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f8851h >= b.this.f8853j.size() - 1) {
                    f6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.f9071a.q0().a((i5) new b(bVar2.f8851h + 1, b.this.f8853j), d6.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f8850g;
                com.applovin.impl.sdk.o unused = b.this.f9073c;
                if (com.applovin.impl.sdk.o.a()) {
                    b.this.f9073c.a(b.this.f9072b, "Ad loaded in " + jElapsedRealtime + "ms for " + this.f8855b.getLabel() + " ad unit " + this.f8856c);
                }
                y2 y2Var = (y2) maxAd;
                b.this.a(y2Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i10 = b.this.f8851h;
                while (true) {
                    i10++;
                    if (i10 >= b.this.f8853j.size()) {
                        f6.this.b(y2Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((y2) bVar.f8853j.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = f6.this.f8842g.b();
            MaxAdFormat maxAdFormatA = f6.this.f8842g.a();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Loading ad " + (this.f8851h + 1) + " of " + this.f8853j.size() + " from " + this.f8852i.c() + " for " + maxAdFormatA.getLabel() + " ad unit " + strB);
            }
            b("started to load ad");
            Context context = (Context) f6.this.f8846k.get();
            Activity activityU0 = context instanceof Activity ? (Activity) context : this.f9071a.u0();
            this.f9071a.a0().b(this.f8852i);
            this.f9071a.X().loadThirdPartyMediatedAd(strB, this.f8852i, activityU0, new a(f6.this.f8845j, maxAdFormatA, strB));
        }

        private b(int i10, List list) {
            super(f6.this.f9072b, f6.this.f9071a, f6.this.f8842g.b());
            this.f8850g = SystemClock.elapsedRealtime();
            this.f8851h = i10;
            this.f8852i = (y2) list.get(i10);
            this.f8853j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(y2 y2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            f6.this.f8849n.add(new MaxNetworkResponseInfoImpl(adLoadState, w3.a(y2Var.b()), y2Var.E(), y2Var.W(), j10, y2Var.B(), maxError));
        }
    }

    public f6(a3 a3Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0175a interfaceC0175a) {
        super("TaskProcessMediationWaterfall", kVar, a3Var.b());
        this.f8842g = a3Var;
        this.f8843h = jSONObject;
        this.f8845j = interfaceC0175a;
        this.f8846k = new WeakReference(context);
        this.f8847l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        this.f8844i = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f8844i.add(y2.a(a3Var, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, kVar));
        }
        this.f8849n = new ArrayList(this.f8844i.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        final MaxErrorImpl maxErrorImpl;
        this.f8848m = SystemClock.elapsedRealtime();
        int i10 = 0;
        if (this.f8843h.optBoolean("is_testing", false) && !this.f9071a.s0().c() && f8841o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ra
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10363b.e();
                }
            });
        }
        String strB = this.f8842g.b();
        MaxAdFormat maxAdFormatA = this.f8842g.a();
        if (this.f8844i.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Starting waterfall for " + maxAdFormatA.getLabel() + " ad unit " + strB + " with " + this.f8844i.size() + " ad(s)...");
            }
            this.f9071a.q0().a(new b(i10, this.f8844i));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.k(this.f9072b, "No ads were returned from the server for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        n7.a(strB, maxAdFormatA, this.f8843h, this.f9071a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8843h, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (w3.a(this.f8843h, strB, this.f9071a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + strB + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (n7.c(this.f9071a) && ((Boolean) this.f9071a.a(x4.A6)).booleanValue()) {
                j10 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j10 <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j10);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.sa
            @Override // java.lang.Runnable
            public final void run() {
                this.f10425b.b(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            g0.a(millis, this.f9071a, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        this.f9071a.a0().c(y2Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8848m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.d(this.f9072b, "Waterfall loaded in " + jElapsedRealtime + "ms from " + y2Var.c() + " for " + this.f8842g.a().getLabel() + " ad unit " + this.f8842g.b());
        }
        y2Var.a(new MaxAdWaterfallInfoImpl(y2Var, jElapsedRealtime, this.f8849n, this.f8847l));
        t2.f(this.f8845j, y2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        n7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f9071a.u0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f8849n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f8849n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======");
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                i10++;
                sb2.append(i10);
                sb2.append(") ");
                sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("..code: ");
                sb2.append(maxNetworkResponseInfo2.getError().getCode());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("..message: ");
                sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
        }
        String strB = this.f8842g.b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8848m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.d(this.f9072b, "Waterfall failed in " + jElapsedRealtime + "ms for " + this.f8842g.a().getLabel() + " ad unit " + strB + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f8843h, "waterfall_name", ""), JsonUtils.getString(this.f8843h, "waterfall_test_name", ""), jElapsedRealtime, this.f8849n, this.f8842g, JsonUtils.optList(JsonUtils.getJSONArray(this.f8843h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f8847l, JsonUtils.getString(this.f8843h, "event_id", "")));
        t2.a(this.f8845j, strB, maxError);
    }
}
