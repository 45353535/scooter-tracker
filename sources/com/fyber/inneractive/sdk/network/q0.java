package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4455ne;
import com.ironsource.N6;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends t0 implements o {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InneractiveAdRequest f21358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap f21359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public StringBuffer f21360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.d f21361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.j f21362t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f21363u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.timeouts.request.a f21364v;

    public q0(q qVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.r rVar) {
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(rVar);
        super(qVar, g0.f21317c.a(), rVar);
        this.f21362t = null;
        this.f21363u = false;
        this.f21388o = true;
        this.f21358p = inneractiveAdRequest;
        this.f21361s = cVar;
        if (inneractiveAdRequest != null) {
            String strA = com.fyber.inneractive.sdk.util.n1.a(inneractiveAdRequest.getSpotId());
            String mediationName = inneractiveAdRequest.getMediationName();
            com.fyber.inneractive.sdk.config.global.features.j jVar = (com.fyber.inneractive.sdk.config.global.features.j) rVar.a(com.fyber.inneractive.sdk.config.global.features.j.class);
            this.f21364v = TextUtils.isEmpty(mediationName) ? new com.fyber.inneractive.sdk.network.timeouts.request.b(jVar, strA) : new com.fyber.inneractive.sdk.network.timeouts.request.d(strA, jVar, mediationName);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final StringBuffer a() {
        return this.f21360r;
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final Map b() {
        return this.f21359q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c(long j10) {
        super.c(j10);
        IAlog.a("%s : NetworkRequestAd : set start connection timestamp", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d() {
        super.d();
        IAlog.a("%s : NetworkRequestAd cancel by timeout - resolve request with no fill", IAlog.a(this));
        this.f21374a = true;
        a((Object) null, (Exception) new k1("no fill", 204), false);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        JSONArray jSONArrayA;
        byte[] bytes = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            com.fyber.inneractive.sdk.config.global.r rVar = ((com.fyber.inneractive.sdk.serverapi.c) this.f21361s).f23777a;
            if (rVar != null) {
                jSONArrayA = com.fyber.inneractive.sdk.config.global.g.a(rVar.f20398b, true);
                IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
            } else {
                jSONArrayA = null;
            }
            if (jSONArrayA != null && jSONArrayA.length() > 0) {
                jSONObject2.put(C4455ne.f44465d, jSONArrayA);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            UnitDisplayType unitDisplayTypeA = com.fyber.inneractive.sdk.serverapi.b.a(this.f21358p.getSpotId());
            IAConfigManager iAConfigManager = IAConfigManager.O;
            JSONArray jSONArrayA2 = iAConfigManager.f20318x.a(unitDisplayTypeA);
            if (jSONArrayA2 != null && jSONArrayA2.length() > 0) {
                jSONObject.put("user_sessions", jSONArrayA2);
            }
            int iA = iAConfigManager.f20315u.f20484b.a("dv_enabled_v3", 0, 0);
            if (unitDisplayTypeA != null && iA == 1) {
                com.fyber.inneractive.sdk.dv.j jVarA = iAConfigManager.G.a(unitDisplayTypeA);
                this.f21362t = jVarA;
                if (jVarA != null) {
                    jSONObject.put("gdem_signal", jVarA.f20547a.getQuery());
                }
            }
            com.fyber.inneractive.sdk.topics.b bVar = iAConfigManager.F;
            if (bVar != null && IAConfigManager.f()) {
                Object objB = bVar.b();
                if (objB != null) {
                    jSONObject.put("topics", objB);
                }
                Object objA = bVar.a();
                if (objA != null) {
                    jSONObject.put("encrypted_topics", objA);
                }
            }
            String string = jSONObject.toString();
            bytes = string.getBytes(StandardCharsets.UTF_8);
            IAlog.a("request json body - %s", string);
            return bytes;
        } catch (Exception unused) {
            IAlog.a("Failed building body for ad request!", new Object[0]);
            return bytes;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int j() {
        return q();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final Map l() {
        int i10 = com.fyber.inneractive.sdk.config.k.f20410a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("mockadnetworkresponseid", property);
        IAlog.a("NetworkRequestAd: Adding mock response header - %s", property);
        return map;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l1 p() {
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.f21364v;
        return new l1(aVar.f21398i, aVar.f21397h);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        String str;
        String str2;
        int i10 = com.fyber.inneractive.sdk.config.k.f20410a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        String strA = TextUtils.isEmpty(property) ? DtbConstants.HTTPS + IAConfigManager.O.f20303i.f20415e : com.fyber.inneractive.sdk.config.a.a(property, "clientRequestEnhancedXmlAd");
        if (this.f21358p.getFloorPrice() != null) {
            String property2 = System.getProperty("ia.testEnvironmentConfiguration.name");
            strA = TextUtils.isEmpty(property2) ? DtbConstants.HTTPS + IAConfigManager.O.f20303i.f20417g : com.fyber.inneractive.sdk.config.a.a(property2, "clientRequestEnhancedXmlAd");
        }
        InneractiveAdRequest inneractiveAdRequest = this.f21358p;
        com.fyber.inneractive.sdk.serverapi.d dVar = this.f21361s;
        r0 r0Var = new r0(inneractiveAdRequest, dVar);
        r0Var.f21367b = new HashMap();
        r0Var.a("fromSDK", Boolean.toString(true));
        r0Var.a("po", System.getProperty("ia.testEnvironmentConfiguration.number"));
        r0Var.a("secure", !com.fyber.inneractive.sdk.util.s.a() || IAConfigManager.O.f20311q ? "1" : "0");
        r0Var.a("spotid", inneractiveAdRequest.getSpotId());
        String property3 = System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
        if (property3 == null) {
            property3 = inneractiveAdRequest.getSelectedUnitConfig() == null ? null : ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f20433a;
        }
        r0Var.a(com.taurusx.tax.g.e0.f66120c, property3);
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (TextUtils.isEmpty(iAConfigManager.f20308n)) {
            r0Var.a("med", iAConfigManager.f20306l);
        } else {
            r0Var.a("med", iAConfigManager.f20306l + "_" + iAConfigManager.f20308n);
        }
        dVar.getClass();
        r0Var.a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        com.fyber.inneractive.sdk.serverapi.c cVar = (com.fyber.inneractive.sdk.serverapi.c) dVar;
        List list = com.fyber.inneractive.sdk.serverapi.c.f23776d;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf((Integer) it.next()));
            }
            r0Var.a("protocols", com.fyber.inneractive.sdk.util.o.a(arrayList));
        }
        List list2 = com.fyber.inneractive.sdk.serverapi.c.f23775c;
        if (!list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(String.valueOf((Integer) it2.next()));
            }
            r0Var.a("api", com.fyber.inneractive.sdk.util.o.a(arrayList2));
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("zip", iAConfigManager.f20304j.getZipCode());
        }
        r0Var.a("a", Integer.toString(iAConfigManager.f20304j.getAge()));
        InneractiveUserConfig.Gender gender = iAConfigManager.f20304j.getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            r0Var.a("g", "m");
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            r0Var.a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        r0Var.a(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, Long.toString(System.currentTimeMillis()));
        StringBuilder sb2 = new StringBuilder("2.2.0-Android-8.4.1");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb2.append('-');
            sb2.append(InneractiveAdManager.getDevPlatform());
        }
        r0Var.a("v", sb2.toString());
        Boolean boolD = iAConfigManager.D.d();
        if (boolD != null) {
            r0Var.a("gdpr_privacy_consent", boolD.booleanValue() ? "1" : "0");
        }
        com.fyber.inneractive.sdk.config.g gVar = iAConfigManager.D;
        if (gVar != null) {
            Boolean bool = com.fyber.inneractive.sdk.util.o.f23888a == null ? null : gVar.f20360i;
            if (bool != null) {
                r0Var.a("lgpd_consent", bool.booleanValue() ? "1" : "0");
            }
            Boolean bool2 = iAConfigManager.D.f20361j;
            if (bool2 != null && bool2.booleanValue()) {
                r0Var.a("coppaApplies", "1");
            }
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            String property4 = System.getProperty("ia.testEnvironmentConfiguration.device");
            com.fyber.inneractive.sdk.config.w wVar = com.fyber.inneractive.sdk.config.u.f20500a;
            com.fyber.inneractive.sdk.config.v vVar = wVar.f20508b;
            String str3 = vVar != null ? vVar.f20506c : false ? "amazonId" : "aaid";
            if (TextUtils.isEmpty(property4)) {
                com.fyber.inneractive.sdk.config.v vVar2 = wVar.f20508b;
                property4 = vVar2 != null ? vVar2.f20504a : null;
            }
            r0Var.a(str3, property4);
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            com.fyber.inneractive.sdk.config.v vVar3 = com.fyber.inneractive.sdk.config.u.f20500a.f20508b;
            r0Var.a("dnt", Boolean.toString(vVar3 != null ? vVar3.f20505b : false));
        }
        r0Var.a("dml", com.fyber.inneractive.sdk.util.k.j());
        int iC = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        int iC2 = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        if (iC > 0 && iC2 > 0) {
            r0Var.a(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, Integer.toString(iC));
            r0Var.a("h", Integer.toString(iC2));
        }
        int iC3 = com.fyber.inneractive.sdk.util.o.c();
        r0Var.a("o", iC3 == 1 ? "p" : iC3 == 2 ? CmcdData.Factory.STREAM_TYPE_LIVE : ApsMetricsDataMap.APSMETRICS_FIELD_URL);
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("ciso", com.fyber.inneractive.sdk.util.k.i());
            String str4 = cVar.f23778b;
            r0Var.a("mcc", str4 == null ? "" : str4.substring(0, Math.min(3, str4.length())));
            String str5 = cVar.f23778b;
            r0Var.a("mnc", str5 == null ? "" : str5.substring(Math.min(3, str5.length())));
            com.fyber.inneractive.sdk.util.z0 z0VarA = com.fyber.inneractive.sdk.util.z0.a();
            IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", z0VarA, z0VarA.b());
            r0Var.a("nt", z0VarA.b());
            r0Var.a("crn", cVar.a());
        }
        r0Var.a("os", "Android");
        r0Var.a("lng", iAConfigManager.f20309o);
        ArrayList arrayList3 = iAConfigManager.f20310p;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            r0Var.a("in_lng", com.fyber.inneractive.sdk.util.o.a(arrayList3));
        }
        r0Var.a("bid", com.fyber.inneractive.sdk.util.o.f23888a.getPackageName());
        r0Var.a("appv", com.fyber.inneractive.sdk.util.k.l());
        com.fyber.inneractive.sdk.config.g gVar2 = iAConfigManager.D;
        if (gVar2.f20355d == null) {
            gVar2.f20356e = gVar2.h();
        }
        if (com.fyber.inneractive.sdk.util.o.f23888a == null) {
            str = null;
        } else {
            str = gVar2.f20355d;
            if (str == null) {
                str = gVar2.f20356e;
            }
        }
        r0Var.a("gdpr_consent_data", str);
        com.fyber.inneractive.sdk.config.g gVar3 = iAConfigManager.D;
        if (com.fyber.inneractive.sdk.util.o.f23888a == null) {
            gVar3.getClass();
            str2 = null;
        } else {
            str2 = gVar3.f20359h;
        }
        r0Var.a(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY, str2);
        r0Var.a("mute_video", Boolean.toString(iAConfigManager.f20305k));
        r0Var.a(N6.G, Build.VERSION.RELEASE);
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f21084p;
        r0Var.a("ignitep", lVar != null ? lVar.f93862a.d() : null);
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.E.f21084p;
        r0Var.a("ignitev", lVar2 != null ? lVar2.f93862a.i() : null);
        HashMap map = new HashMap();
        cVar.a(inneractiveAdRequest.getSpotId(), map);
        for (Map.Entry entry : map.entrySet()) {
            r0Var.a((String) entry.getKey(), (String) entry.getValue());
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("childMode", "1");
        }
        com.fyber.inneractive.sdk.ignite.l lVar3 = IAConfigManager.O.E.f21084p;
        r0Var.a("odt", lVar3 != null ? lVar3.getOdt() : "");
        Double floorPrice = r0Var.f21366a.getFloorPrice();
        r0Var.a("floorprice", floorPrice != null ? com.bytedance.adsdk.qdl.a.a(new BigDecimal(Double.toString(floorPrice.doubleValue())).setScale(5, RoundingMode.CEILING)).toPlainString() : null);
        String strA2 = com.fyber.inneractive.sdk.util.f1.a(strA, r0Var.f21367b);
        if (!this.f21363u) {
            this.f21363u = true;
        }
        return strA2;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int s() {
        return this.f21364v.f21394f;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    @Override // com.fyber.inneractive.sdk.network.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l r8, java.util.Map r9, int r10) throws com.fyber.inneractive.sdk.network.n0 {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.q0.a(com.fyber.inneractive.sdk.network.l, java.util.Map, int):com.fyber.inneractive.sdk.network.o0");
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void b(long j10) {
        super.b(j10);
        IAlog.a("%s : NetworkRequestAd : set end read timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l a(String str) {
        IAlog.a("%s: NetworkRequestAd Ad request execution started, timeouts(connection: %d read: %d)", IAlog.a(this), Integer.valueOf(p().f21341a), Integer.valueOf(p().f21342b));
        return super.a(str);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void a(long j10) {
        super.a(j10);
        IAlog.a("%s : NetworkRequestAd : set end connection timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(q()));
    }
}
