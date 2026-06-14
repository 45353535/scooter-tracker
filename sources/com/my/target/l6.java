package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.purchase.ADJPConstants;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import com.my.target.s9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class l6 {
    public static JSONObject a(a aVar) throws JSONException {
        s1 s1Var = aVar.f60042a;
        Map map = aVar.f60043b;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            o oVar = (o) entry.getKey();
            s9.a aVar2 = (s9.a) entry.getValue();
            if (!aVar2.f60807a.isEmpty()) {
                jSONArray.put(a(oVar, null, null, aVar2.f60807a));
            }
            for (Map.Entry entry2 : aVar2.f60808b.entrySet()) {
                h0 h0Var = (h0) entry2.getKey();
                jSONArray.put(a(oVar, h0Var.f59789b, h0Var.f59790c, ((s9.b) entry2.getValue()).f60809a));
            }
        }
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, s1Var);
        jSONObject.put("logs", jSONArray);
        return jSONObject;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s1 f60042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f60043b;

        public a(s1 s1Var, o oVar, List list) {
            s9.a aVar = new s9.a();
            aVar.f60807a.addAll(list);
            HashMap map = new HashMap();
            map.put(oVar, aVar);
            this.f60042a = s1Var;
            this.f60043b = map;
        }

        public a(s1 s1Var, o oVar, h0 h0Var, List list) {
            s9.b bVar = new s9.b();
            bVar.f60809a.addAll(list);
            s9.a aVar = new s9.a();
            aVar.f60808b.put(h0Var, bVar);
            HashMap map = new HashMap();
            map.put(oVar, aVar);
            this.f60042a = s1Var;
            this.f60043b = map;
        }
    }

    public static JSONObject a(o oVar, String str, String str2, List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(a(str, str2, (s9.c) it.next()));
        }
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, oVar);
        jSONObject.put("events", jSONArray);
        return jSONObject;
    }

    public static JSONObject a(String str, String str2, s9.c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("banner_id", str);
        }
        if (str2 != null) {
            jSONObject.put(Reporting.Key.IMP_ID, str2);
        }
        jSONObject.put(C4240b4.i.f42646q, cVar.f60811b);
        jSONObject.put("level", cVar.f60812c);
        jSONObject.put("code", cVar.f60813d);
        if (!TextUtils.isEmpty(cVar.f60814e)) {
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, cVar.f60814e);
        }
        jSONObject.put("client_timestamp", cVar.f60810a);
        if (!TextUtils.isEmpty(cVar.f60815f)) {
            jSONObject.put("add_data", cVar.f60815f);
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject, s1 s1Var) throws JSONException {
        Objects.requireNonNull(s1Var);
        jSONObject.put(ADJPConstants.KEY_SDK_VERSION, "5.27.4");
        jSONObject.put("sdk_version_int", 5027004);
        jSONObject.put("app_bundle_id", s1Var.f60782h);
        jSONObject.put("app_version", s1Var.f60783i);
        jSONObject.put("os", "Android");
        String str = s1Var.f60776b;
        if (str == null) {
            str = "";
        }
        jSONObject.put(CommonUrlParts.OS_VERSION, str);
        String str2 = s1Var.f60777c;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("device_name", str2);
        String str3 = s1Var.f60778d;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("device_model", str3);
        String str4 = s1Var.f60779e;
        jSONObject.put("device_manufacturer", str4 != null ? str4 : "");
    }

    public static void a(JSONObject jSONObject, o oVar) throws JSONException {
        jSONObject.put("ad_format", oVar.f60436c);
        jSONObject.put("cache_policy", oVar.b());
        Integer num = oVar.f60437d;
        if (num != null) {
            jSONObject.put("slot_id", num.intValue());
        }
        jSONObject.put("ad_id", oVar.f60434a);
        String str = oVar.f60435b;
        if (str != null) {
            jSONObject.put("handle_data_id", str);
        }
        jSONObject.put("source_type", oVar.f60438e);
        String strA = oVar.a();
        if (strA != null) {
            jSONObject.put("ad_url", strA);
        }
    }

    public void a(s1 s1Var, Map map, Context context) {
        for (Map.Entry entry : map.entrySet()) {
            o oVar = (o) entry.getKey();
            s9.a aVar = (s9.a) entry.getValue();
            if (!aVar.f60807a.isEmpty()) {
                a(new a(s1Var, oVar, aVar.f60807a), context);
            }
            for (Map.Entry entry2 : aVar.f60808b.entrySet()) {
                h0 h0Var = (h0) entry2.getKey();
                s9.b bVar = (s9.b) entry2.getValue();
                if (h0Var.b() && !bVar.f60809a.isEmpty()) {
                    a(new a(s1Var, oVar, h0Var, bVar.f60809a), context);
                }
            }
        }
    }

    public final void a(a aVar, Context context) {
        try {
            m2.a().a("https://ad.mail.ru/sdk/log/v2", a(aVar).toString(), context);
        } catch (Throwable unused) {
        }
    }
}
