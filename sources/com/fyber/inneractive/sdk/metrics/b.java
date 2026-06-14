package com.fyber.inneractive.sdk.metrics;

import android.app.Application;
import android.content.SharedPreferences;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f21126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f21127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f21128c;

    public b(c cVar, g gVar, Map map) {
        this.f21128c = cVar;
        this.f21126a = gVar;
        this.f21127b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnitDisplayType unitDisplayType;
        int iA;
        int iA2;
        String str;
        IAlog.a("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
        c cVar = this.f21128c;
        UnitDisplayType unitDisplayType2 = cVar.f21134c;
        if (unitDisplayType2 == null || !(unitDisplayType2 == (unitDisplayType = UnitDisplayType.BANNER) || unitDisplayType2 == UnitDisplayType.MRECT || unitDisplayType2.isFullscreenUnit())) {
            UnitDisplayType unitDisplayType3 = cVar.f21134c;
            IAlog.a("Unit display type %s is not supported for metric event", unitDisplayType3 != null ? unitDisplayType3.value() : "");
            return;
        }
        IAlog.a("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", this.f21126a.toString());
        o oVar = IAConfigManager.O.f20315u.f20484b;
        UnitDisplayType unitDisplayType4 = this.f21128c.f21134c;
        if (unitDisplayType4 == unitDisplayType || unitDisplayType4 == UnitDisplayType.MRECT) {
            String strA = oVar.a("ad_metrics_interval_banner", c.f21129g);
            String strA2 = oVar.a("ad_metrics_limit_banner", c.f21130h);
            iA = v.a(strA, 24);
            iA2 = v.a(strA2, 3);
            str = "LastSentMetricsBanner";
        } else {
            String strA3 = oVar.a("ad_metrics_interval_interstitial", c.f21131i);
            String strA4 = oVar.a("ad_metrics_limit_interstitial", c.f21132j);
            iA = v.a(strA3, 24);
            iA2 = v.a(strA4, 3);
            str = "LastSentMetricsInterstitial";
        }
        Application application = com.fyber.inneractive.sdk.util.o.f23888a;
        if (application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(sharedPreferences.getString(str, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
            } catch (JSONException unused) {
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (oVar.a(false, this.f21128c.f21125a) && !a.a(iA, iA2, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                c cVar2 = this.f21128c;
                InneractiveAdRequest inneractiveAdRequest = cVar2.f21136e;
                com.fyber.inneractive.sdk.response.e eVar = cVar2.f21135d;
                Map map = this.f21127b;
                try {
                    u uVar = u.METRIC_MEASUREMENTS_EVENT;
                    JSONArray jSONArray2 = cVar2.f21137f;
                    w wVar = new w(eVar);
                    wVar.f21418c = uVar;
                    wVar.f21416a = inneractiveAdRequest;
                    wVar.f21419d = jSONArray2;
                    JSONObject jSONObject = new JSONObject();
                    for (String str2 : map.keySet()) {
                        Object obj = map.get(str2);
                        try {
                            jSONObject.put(str2, obj);
                        } catch (Exception unused2) {
                            IAlog.f("Got exception adding param to json object: %s, %s", str2, obj);
                        }
                    }
                    wVar.f21421f.put(jSONObject);
                    wVar.a((String) null);
                } catch (Exception unused3) {
                }
            }
            sharedPreferences.edit().putString(str, new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
