package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f21415h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f21416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f21417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f21418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONArray f21419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f21420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONArray f21421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21422g;

    public w(t tVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.f21417b = tVar;
        this.f21416a = null;
        this.f21419d = null;
    }

    public final w a(Object... objArr) {
        if (objArr.length > 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i10 = 0; i10 < objArr.length - 1; i10 += 2) {
                String string = objArr[i10].toString();
                Object obj = objArr[i10 + 1];
                try {
                    jSONObject.put(string, obj);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", string, obj);
                }
            }
            this.f21421f.put(jSONObject);
        }
        return this;
    }

    public w(t tVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.f21417b = tVar;
        this.f21416a = inneractiveAdRequest;
        this.f21419d = null;
    }

    public final void a(String str) {
        String str2;
        String str3;
        Long l10;
        String str4;
        String str5;
        String campaignId;
        String spotId;
        InneractiveAdRequest inneractiveAdRequest;
        com.fyber.inneractive.sdk.response.e eVar;
        boolean zIsDeprecated;
        UnitDisplayType unitDisplayType;
        UnitDisplayType unitDisplayType2;
        if (IAConfigManager.d() && !u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED.equals(this.f21418c)) {
            String strA = IAlog.a(this);
            Object obj = this.f21418c;
            if (obj == null) {
                obj = this.f21417b;
            }
            IAlog.a("%sSdk event dispatcher - aborting dispatch: %s", strA, obj);
            return;
        }
        com.fyber.inneractive.sdk.response.e eVar2 = this.f21420e;
        if (eVar2 != null) {
            ImpressionData impressionData = eVar2.f23740t;
            String impressionId = impressionData != null ? impressionData.getImpressionId() : null;
            ImpressionData impressionData2 = this.f21420e.f23740t;
            String demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
            ImpressionData impressionData3 = this.f21420e.f23740t;
            Long demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
            ImpressionData impressionData4 = this.f21420e.f23740t;
            String creativeId = impressionData4 != null ? impressionData4.getCreativeId() : null;
            ImpressionData impressionData5 = this.f21420e.f23740t;
            String advertiserDomain = impressionData5 != null ? impressionData5.getAdvertiserDomain() : null;
            ImpressionData impressionData6 = this.f21420e.f23740t;
            if (impressionData6 != null) {
                str2 = impressionId;
                str3 = demandSource;
                l10 = demandId;
                str4 = creativeId;
                str5 = advertiserDomain;
                campaignId = impressionData6.getCampaignId();
            } else {
                str2 = impressionId;
                campaignId = null;
                str3 = demandSource;
                l10 = demandId;
                str4 = creativeId;
                str5 = advertiserDomain;
            }
        } else {
            str2 = null;
            str3 = null;
            l10 = null;
            str4 = null;
            str5 = null;
            campaignId = null;
        }
        IAConfigManager iAConfigManager = IAConfigManager.O;
        y yVar = new y(iAConfigManager.f20297c, str2, str3, l10, str4, str5, campaignId, str);
        InneractiveAdRequest inneractiveAdRequest2 = this.f21416a;
        com.fyber.inneractive.sdk.config.s0 selectedUnitConfig = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSelectedUnitConfig();
        if (selectedUnitConfig != null) {
            com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) selectedUnitConfig;
            com.fyber.inneractive.sdk.config.o0 o0Var = r0Var.f20436d;
            Track track = Track.ERRORS;
            Set set = o0Var.f20428a;
            if (!(set == null ? false : set.contains(track))) {
                return;
            }
            com.fyber.inneractive.sdk.config.l0 l0Var = r0Var.f20435c;
            if (l0Var != null && (unitDisplayType2 = l0Var.f20420b) != null) {
                zIsDeprecated = unitDisplayType2.isDeprecated();
            } else {
                com.fyber.inneractive.sdk.config.t0 t0Var = r0Var.f20438f;
                zIsDeprecated = (t0Var == null || (unitDisplayType = t0Var.f20498j) == null) ? false : unitDisplayType.isDeprecated();
            }
            if (zIsDeprecated) {
                return;
            }
        }
        if (selectedUnitConfig == null && (eVar = this.f21420e) != null) {
            com.fyber.inneractive.sdk.config.a.a(eVar.f23735o);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = this.f21420e;
        String str6 = eVar3 == null ? null : eVar3.f23724d;
        String str7 = TextUtils.isEmpty(iAConfigManager.f20314t) ? null : iAConfigManager.f20314t;
        if (this.f21417b == null && this.f21418c == null) {
            IAlog.a("Sdk event dispatcher - error id or event id must be provided", new Object[0]);
            return;
        }
        InneractiveAdRequest inneractiveAdRequest3 = this.f21416a;
        if (inneractiveAdRequest3 != null) {
            spotId = inneractiveAdRequest3.getSpotId();
        } else {
            com.fyber.inneractive.sdk.response.e eVar4 = this.f21420e;
            spotId = eVar4 != null ? eVar4.C : null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(iAConfigManager.f20306l)) {
            sb2.append(iAConfigManager.f20306l);
            sb2.append("_");
        }
        com.fyber.inneractive.sdk.response.e eVar5 = this.f21420e;
        UnitDisplayType unitDisplayTypeA = eVar5 == null ? null : eVar5.f23736p;
        if (unitDisplayTypeA == null && (inneractiveAdRequest = this.f21416a) != null && inneractiveAdRequest.getSpotId() != null) {
            unitDisplayTypeA = com.fyber.inneractive.sdk.serverapi.b.a(this.f21416a.getSpotId());
        }
        sb2.append(unitDisplayTypeA != null ? unitDisplayTypeA.name().toLowerCase(Locale.US) : "unknown");
        String string = sb2.toString();
        com.fyber.inneractive.sdk.response.e eVar6 = this.f21420e;
        Integer numValueOf = eVar6 != null ? Integer.valueOf(eVar6.f23727g) : null;
        com.fyber.inneractive.sdk.response.e eVar7 = this.f21420e;
        com.fyber.inneractive.sdk.util.r.f23895a.execute(new v(this, yVar, str6, str7, string, spotId, numValueOf, eVar7 == null ? "" : eVar7.f23728h));
    }

    public w(u uVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.f21418c = uVar;
        this.f21416a = null;
        this.f21419d = null;
    }

    public w(u uVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.f21418c = uVar;
        this.f21416a = inneractiveAdRequest;
        this.f21419d = null;
    }

    public w(com.fyber.inneractive.sdk.response.e eVar) {
        this.f21422g = false;
        this.f21420e = eVar;
        this.f21421f = new JSONArray();
    }
}
