package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5024cm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ea f76980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5038da f76981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ki f76982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fe f76983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lm f76984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5312o3 f76985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5510w2 f76986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5320ob f76987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Im f76988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C5571yd f76989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final K9 f76990k;

    public C5024cm() {
        this(new C5320ob(), new Ea(), new C5038da(), new Ki(), new Fe(), new Lm(), new C5312o3(), new C5510w2(), new Im(), new C5571yd(), new K9());
    }

    public final void a(C5153hm c5153hm, C5270mb c5270mb) {
        long jOptLong;
        long jOptLong2;
        String string;
        ArrayList arrayListA;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4 = c5270mb.optJSONObject("queries");
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("list")) != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("host")) != null) {
            c5153hm.f77333g = jSONObjectOptJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c5270mb.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject jSONObjectOptJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (jSONObjectOptJSONObject5 != null) {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(next);
                if (jSONObjectOptJSONObject6 != null && jSONObjectOptJSONObject6.has("value")) {
                    map.put(next, jSONObjectOptJSONObject6.getString("value"));
                }
            }
            c5153hm.f77336j = Jm.a((Map) map);
        }
        JSONObject jSONObjectOptJSONObject7 = c5270mb.optJSONObject(CommonUrlParts.LOCALE);
        String string2 = "";
        c5153hm.f77339m = (jSONObjectOptJSONObject7 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject7.optJSONObject("country")) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString("value", "");
        JSONObject jSONObjectOptJSONObject8 = c5270mb.optJSONObject("time");
        if (jSONObjectOptJSONObject8 != null) {
            try {
                c5153hm.f77338l = Long.valueOf(jSONObjectOptJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C5605zm c5605zm = new C5605zm();
        JSONObject jSONObjectOptJSONObject9 = c5270mb.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject9 != null) {
            c5605zm.f78662a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject9, "disabled_reporting_interval_seconds", c5605zm.f78662a);
        }
        this.f76984e.getClass();
        c5153hm.f77342p = new Km(c5605zm.f78662a);
        this.f76981b.getClass();
        C5505vm c5505vm = new C5505vm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c5270mb.get(AdaptiveRenderingConfig.NATIVE_FEATURES_KEY);
            } catch (Throwable unused3) {
            }
            JSONObject jSONObjectOptJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (jSONObjectOptJSONObject10 != null) {
                C5363q4 c5363q4 = new C5363q4();
                c5363q4.f78026a = C5038da.a(jSONObjectOptJSONObject10, "permissions_collecting", c5505vm.f78466a);
                c5363q4.f78027b = C5038da.a(jSONObjectOptJSONObject10, "features_collecting", c5505vm.f78467b);
                c5363q4.f78028c = C5038da.a(jSONObjectOptJSONObject10, "google_aid", c5505vm.f78468c);
                c5363q4.f78029d = C5038da.a(jSONObjectOptJSONObject10, "sim_info", c5505vm.f78469d);
                c5363q4.f78030e = C5038da.a(jSONObjectOptJSONObject10, "huawei_oaid", c5505vm.f78470e);
                c5363q4.f78031f = jSONObjectOptJSONObject10.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c5153hm.f77328b = new C5412s4(c5363q4);
            }
        } catch (Throwable unused4) {
        }
        this.f76980a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c5270mb.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject jSONObjectOptJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (jSONObjectOptJSONObject11 != null) {
                try {
                    string = jSONObjectOptJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    string = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    c5153hm.f77330d = string;
                }
                ArrayList arrayListA2 = Ea.a(jSONObjectOptJSONObject11, Constants.REPORT);
                if (!no.a((Collection) arrayListA2)) {
                    c5153hm.f77331e = arrayListA2;
                }
                try {
                    string2 = jSONObjectOptJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(string2)) {
                    c5153hm.f77332f = string2;
                }
                ArrayList arrayListA3 = Ea.a(jSONObjectOptJSONObject11, "startup");
                if (!no.a((Collection) arrayListA3)) {
                    c5153hm.f77329c = arrayListA3;
                }
                ArrayList arrayListA4 = Ea.a(jSONObjectOptJSONObject11, "diagnostic");
                if (!no.a((Collection) arrayListA4)) {
                    c5153hm.f77340n = arrayListA4;
                }
                HashMap map2 = new HashMap();
                Iterator<String> itKeys2 = jSONObjectOptJSONObject11.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!Ea.f75734a.contains(next2) && (arrayListA = Ea.a(jSONObjectOptJSONObject11, next2)) != null) {
                        map2.put(next2, arrayListA);
                    }
                }
                c5153hm.f77341o = map2;
            }
        } catch (Throwable unused8) {
        }
        this.f76982c.getClass();
        Am am = new Am();
        JSONObject jSONObjectOptJSONObject12 = c5270mb.optJSONObject("retry_policy");
        int iOptInt = am.f75555w;
        int iOptInt2 = am.f75556x;
        if (jSONObjectOptJSONObject12 != null) {
            iOptInt = jSONObjectOptJSONObject12.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject12.optInt("exponential_multiplier", am.f75556x);
        }
        c5153hm.f77343q = new RetryPolicyConfig(iOptInt, iOptInt2);
        this.f76983d.getClass();
        if (c5153hm.f77328b.f78208a) {
            JSONObject jSONObjectOptJSONObject13 = c5270mb.optJSONObject("permissions_collecting");
            C5555xm c5555xm = new C5555xm();
            if (jSONObjectOptJSONObject13 != null) {
                jOptLong = jSONObjectOptJSONObject13.optLong("check_interval_seconds", c5555xm.f78564a);
                jOptLong2 = jSONObjectOptJSONObject13.optLong("force_send_interval_seconds", c5555xm.f78565b);
            } else {
                jOptLong = c5555xm.f78564a;
                jOptLong2 = c5555xm.f78565b;
            }
            c5153hm.f77337k = new De(jOptLong, jOptLong2);
        }
        C5312o3 c5312o3 = this.f76985f;
        c5312o3.getClass();
        C5430sm c5430sm = new C5430sm();
        JSONObject jSONObjectOptJSONObject14 = c5270mb.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject14 != null) {
            c5430sm.f78247a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject14, "last_known_location_ttl", c5430sm.f78247a);
        }
        c5312o3.f77879a.getClass();
        c5153hm.f77344r = new C5237l3(c5430sm.f78247a);
        this.f76986g.getClass();
        C5510w2.a(c5153hm, c5270mb);
        Im im = this.f76988i;
        im.getClass();
        JSONObject jSONObjectOptJSONObject15 = c5270mb.optJSONObject("startup_update");
        C5580ym c5580ym = new C5580ym();
        Integer numA = AbstractC5295nb.a(jSONObjectOptJSONObject15, "interval_seconds", null);
        if (numA != null) {
            c5580ym.f78587a = numA.intValue();
        }
        im.f75963a.getClass();
        c5153hm.f77346t = new Gm(c5580ym.f78587a);
        Map<String, C5092fd> mapC = this.f76989j.f78580a.c();
        C5546xd c5546xd = new C5546xd(c5270mb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C5092fd> entry : mapC.entrySet()) {
            Object objInvoke = c5546xd.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(entry.getKey(), objInvoke);
            }
        }
        c5153hm.f77347u = linkedHashMap;
        J9 j92 = this.f76990k.f76019a;
        C5480um c5480um = new C5480um();
        JSONObject jSONObjectOptJSONObject16 = c5270mb.optJSONObject("external_attribution");
        if (jSONObjectOptJSONObject16 != null) {
            c5480um.f78398a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject16, "collecting_interval_seconds", c5480um.f78398a);
        }
        j92.getClass();
        c5153hm.f77348v = new I9(c5480um.f78398a);
    }

    public C5024cm(C5320ob c5320ob, Ea ea2, C5038da c5038da, Ki ki, Fe fe2, Lm lm, C5312o3 c5312o3, C5510w2 c5510w2, Im im, C5571yd c5571yd, K9 k92) {
        this.f76980a = ea2;
        this.f76981b = c5038da;
        this.f76982c = ki;
        this.f76983d = fe2;
        this.f76984e = lm;
        this.f76985f = c5312o3;
        this.f76986g = c5510w2;
        this.f76987h = c5320ob;
        this.f76988i = im;
        this.f76989j = c5571yd;
        this.f76990k = k92;
    }
}
