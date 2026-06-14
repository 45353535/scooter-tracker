package com.appodeal.ads;

import android.os.Handler;
import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.SdkInternalEvent;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class uc implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te f14935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdNetwork f14936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2 f14937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14938d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public UnifiedAd f14940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public UnifiedAdParams f14941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UnifiedAdCallback f14942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImpressionLevelData f14943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.appodeal.ads.utils.campaign_frequency.b f14944j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f14947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f14948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f14949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f14950p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f14939e = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14945k = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14951q = false;

    public uc(te teVar, AdNetwork adNetwork, x2 x2Var, int i10) {
        this.f14935a = teVar;
        this.f14936b = adNetwork;
        this.f14937c = x2Var;
        this.f14938d = adNetwork.getName();
        this.f14946l = i10;
    }

    public static void e(bc bcVar, te teVar) {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdAdObjectLoadAbort", "name");
        ((bd) bcVar).f13147a.b(LoadingError.IncorrectAdunit);
    }

    public static void j(bc bcVar, te teVar) {
        ((bd) bcVar).f13147a.b(LoadingError.AdTypeNotSupportedInAdapter);
    }

    public abstract UnifiedAd a(AdNetwork adNetwork);

    public abstract UnifiedAdCallback b();

    /* JADX WARN: Removed duplicated region for block: B:103:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:16:0x0089, B:19:0x0091, B:21:0x0095, B:22:0x009c, B:25:0x00c2, B:27:0x00c6, B:29:0x00ea, B:31:0x0103, B:36:0x0120, B:38:0x0128, B:39:0x0130, B:41:0x0136, B:44:0x0144, B:46:0x0147, B:48:0x0151, B:50:0x015b, B:52:0x0163, B:56:0x017a, B:57:0x017f, B:59:0x0185, B:60:0x0190, B:62:0x0196), top: B:140:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:16:0x0089, B:19:0x0091, B:21:0x0095, B:22:0x009c, B:25:0x00c2, B:27:0x00c6, B:29:0x00ea, B:31:0x0103, B:36:0x0120, B:38:0x0128, B:39:0x0130, B:41:0x0136, B:44:0x0144, B:46:0x0147, B:48:0x0151, B:50:0x015b, B:52:0x0163, B:56:0x017a, B:57:0x017f, B:59:0x0185, B:60:0x0190, B:62:0x0196), top: B:140:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fd A[Catch: Exception -> 0x01ab, TryCatch #1 {Exception -> 0x01ab, blocks: (B:80:0x01e2, B:81:0x01f7, B:83:0x01fd, B:85:0x020c, B:86:0x020f, B:90:0x0217, B:96:0x0223, B:99:0x0238, B:106:0x0247, B:108:0x024c, B:109:0x0264, B:112:0x026a, B:113:0x0282, B:115:0x0286, B:64:0x019c, B:67:0x01a6, B:72:0x01b3, B:74:0x01bd, B:76:0x01c7, B:77:0x01d0, B:79:0x01d6), top: B:141:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.appodeal.ads.context.o r22, final com.appodeal.ads.te r23, final com.appodeal.ads.bd r24) {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.uc.c(com.appodeal.ads.context.o, com.appodeal.ads.te, com.appodeal.ads.bd):void");
    }

    public final void d(final com.appodeal.ads.context.o oVar, final te teVar, final bd bdVar, wa waVar) {
        final bd bdVar2;
        final AdUnitParams adUnitParams;
        if (this.f14937c.f15243t == null) {
            UnifiedAd unifiedAdA = a(this.f14936b);
            this.f14940f = unifiedAdA;
            if (unifiedAdA == null) {
                Runnable task = new Runnable() { // from class: com.appodeal.ads.mc
                    @Override // java.lang.Runnable
                    public final void run() {
                        uc.j(bdVar, teVar);
                    }
                };
                Handler handler = b6.f13134a;
                Intrinsics.checkNotNullParameter(task, "task");
                b6.f13134a.post(task);
                return;
            }
            this.f14941g = i();
            this.f14942h = b();
            try {
                adUnitParams = this.f14936b.getAdUnitParams(oVar, this, waVar);
                bdVar2 = bdVar;
            } catch (Throwable th2) {
                th = th2;
                bdVar2 = bdVar;
            }
            try {
                Runnable task2 = new Runnable() { // from class: com.appodeal.ads.nc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13892b.g(oVar, adUnitParams, bdVar2, teVar);
                    }
                };
                Handler handler2 = b6.f13134a;
                Intrinsics.checkNotNullParameter(task2, "task");
                b6.f13134a.post(task2);
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                hd hdVar = bdVar2.f13147a;
                hdVar.getClass();
                Log.log(th4);
                if (th4 instanceof JSONException) {
                    hdVar.b(LoadingError.IncorrectAdunit);
                } else {
                    hdVar.b(LoadingError.InternalError);
                }
            }
        }
    }

    public final void f(final ImpressionLevelData impressionLevelData) {
        AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.oc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f14258b.h(impressionLevelData);
            }
        });
        if (impressionLevelData != null && impressionLevelData.isFinalIld()) {
            this.f14943i = impressionLevelData;
        }
        if (!this.f14937c.f15237n || impressionLevelData == null) {
            return;
        }
        String id2 = impressionLevelData.getId();
        if (id2 != null && !id2.isEmpty()) {
            x2 x2Var = this.f14937c;
            x2Var.getClass();
            Intrinsics.checkNotNullParameter(id2, "id");
            x2Var.f15226c = id2;
        }
        String demandSource = impressionLevelData.getDemandSource();
        if (demandSource != null && !demandSource.isEmpty()) {
            this.f14938d = demandSource;
        }
        Double ecpm = impressionLevelData.getEcpm();
        if (ecpm == null || ecpm.doubleValue() <= 0.0d) {
            return;
        }
        this.f14937c.f15229f = ecpm.doubleValue();
    }

    public final void g(ContextProvider contextProvider, AdUnitParams adUnitParams, bc bcVar, te teVar) {
        try {
            Handler handler = b6.f13134a;
            Intrinsics.checkNotNullParameter("ApdAdObjectLoad", "name");
            this.f14940f.load(contextProvider, this.f14941g, adUnitParams, this.f14942h);
        } catch (Throwable th2) {
            hd hdVar = ((bd) bcVar).f13147a;
            hdVar.getClass();
            Log.log(th2);
            if (th2 instanceof JSONException) {
                hdVar.b(LoadingError.IncorrectAdunit);
            } else {
                hdVar.b(LoadingError.InternalError);
            }
        }
    }

    @Override // com.appodeal.ads.AdUnit
    public final String getAdUnitName() {
        return this.f14937c.f15234k;
    }

    @Override // com.appodeal.ads.AdUnit
    public final double getEcpm() {
        return this.f14937c.f15229f;
    }

    @Override // com.appodeal.ads.AdUnit
    public final long getExpTime() {
        return this.f14937c.f15230g;
    }

    @Override // com.appodeal.ads.AdUnit
    public final String getId() {
        return this.f14937c.f15226c;
    }

    @Override // com.appodeal.ads.AdUnit
    public final int getImpressionInterval() {
        return this.f14937c.f15235l;
    }

    @Override // com.appodeal.ads.AdUnit
    public final JSONObject getJsonData() {
        return this.f14937c.f15225b;
    }

    @Override // com.appodeal.ads.AdUnit
    public final int getLoadingTimeout() {
        int i10 = this.f14937c.f15231h;
        return i10 > 0 ? i10 : this.f14946l;
    }

    @Override // com.appodeal.ads.AdUnit
    public final String getMediatorName() {
        return this.f14937c.f15233j;
    }

    @Override // com.appodeal.ads.AdUnit
    public final b3 getRequestResult() {
        return this.f14937c.f15243t;
    }

    @Override // com.appodeal.ads.AdUnit
    public final String getStatus() {
        return this.f14937c.f15227d;
    }

    public final /* synthetic */ Event h(ImpressionLevelData impressionLevelData) {
        return new SdkInternalEvent.SdkIldReceived(this.f14935a.u(), impressionLevelData);
    }

    public abstract UnifiedAdParams i();

    @Override // com.appodeal.ads.AdUnit
    public final boolean isAsync() {
        return this.f14937c.f15232i;
    }

    @Override // com.appodeal.ads.AdUnit
    public final Boolean isMuted() {
        return this.f14937c.f15236m;
    }

    @Override // com.appodeal.ads.AdUnit
    public final boolean isPrecache() {
        return this.f14937c.f15228e;
    }

    public final AdNetwork k() {
        return this.f14936b;
    }

    public final boolean l() {
        return !this.f14939e.isEmpty();
    }

    public final void m() {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdAdObjectDestroy", "name");
        o();
    }

    public final void n() {
        com.appodeal.ads.utils.campaign_frequency.b bVar = this.f14944j;
        if (bVar != null) {
            try {
                com.appodeal.ads.utils.campaign_frequency.a aVar = bVar.f14973a;
                com.appodeal.ads.storage.e0 e0Var = com.appodeal.ads.utils.campaign_frequency.a.f14969b;
                String campaignId = aVar.f14971a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                e0Var.getClass();
                Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                com.appodeal.ads.storage.a0 a0Var = e0Var.f14800a;
                a0Var.getClass();
                Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                eg.i.d((CoroutineScope) a0Var.f14784b.getValue(), null, null, new com.appodeal.ads.storage.p(a0Var, campaignId, jCurrentTimeMillis, null), 3, null);
            } catch (Exception e10) {
                Log.log(e10);
            }
        }
        UnifiedAd unifiedAd = this.f14940f;
        if (unifiedAd != null) {
            unifiedAd.onClicked();
        }
        if (this.f14948n == 0) {
            this.f14948n = System.currentTimeMillis();
        }
    }

    public void o() {
        UnifiedAd unifiedAd = this.f14940f;
        if (unifiedAd != null) {
            unifiedAd.onDestroy();
        }
    }

    public final void p() {
        HashMap map;
        com.appodeal.ads.utils.campaign_frequency.b bVar = this.f14944j;
        if (bVar != null) {
            com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext();
            try {
                JSONObject jSONObjectB = bVar.f14973a.b();
                if (jSONObjectB == null) {
                    jSONObjectB = new JSONObject();
                }
                JSONObject jSONObject = jSONObjectB;
                try {
                    JSONArray jSONArray = jSONObject.has(bVar.f14976d) ? jSONObject.getJSONArray(bVar.f14976d) : new JSONArray();
                    jSONArray.put((System.currentTimeMillis() / 1000) / 60);
                    jSONObject.put(bVar.f14976d, jSONArray);
                } catch (Exception e10) {
                    Log.log(e10);
                }
                com.appodeal.ads.utils.campaign_frequency.a aVar = bVar.f14973a;
                aVar.getClass();
                try {
                    com.appodeal.ads.storage.e0 e0Var = com.appodeal.ads.utils.campaign_frequency.a.f14969b;
                    String campaignId = aVar.f14971a;
                    String campaignData = jSONObject.toString();
                    e0Var.getClass();
                    Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                    Intrinsics.checkNotNullParameter(campaignData, "campaignData");
                    com.appodeal.ads.storage.a0 a0Var = e0Var.f14800a;
                    a0Var.getClass();
                    Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                    Intrinsics.checkNotNullParameter(campaignData, "campaignData");
                    eg.i.d((CoroutineScope) a0Var.f14784b.getValue(), null, null, new com.appodeal.ads.storage.o(a0Var, campaignId, campaignData, null), 3, null);
                } catch (Exception e11) {
                    Log.log(e11);
                }
                HashMap map2 = com.appodeal.ads.utils.campaign_frequency.b.f14972l;
                if (map2.containsKey(bVar.f14975c)) {
                    map = (HashMap) map2.get(bVar.f14975c);
                } else {
                    HashMap map3 = new HashMap();
                    map2.put(bVar.f14975c, map3);
                    map = map3;
                }
                map.put(bVar.f14976d, Integer.valueOf(((map == null || !map.containsKey(bVar.f14976d)) ? 0 : ((Integer) map.get(bVar.f14976d)).intValue()) + 1));
            } catch (Exception e12) {
                Log.log(e12);
            }
        }
        UnifiedAd unifiedAd = this.f14940f;
        if (unifiedAd != null) {
            unifiedAd.onImpression();
        }
        if (this.f14949o == 0) {
            this.f14949o = System.currentTimeMillis();
        }
    }

    public final void q() {
        Runnable task = new Runnable() { // from class: com.appodeal.ads.kc
            @Override // java.lang.Runnable
            public final void run() {
                this.f13552b.m();
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }

    @Override // com.appodeal.ads.AdUnit
    public final boolean shouldGetNetworkEcpm() {
        return this.f14937c.f15238o;
    }

    @Override // com.appodeal.ads.AdUnit
    public final boolean shouldUseExactEcpm() {
        return this.f14937c.f15237n;
    }
}
