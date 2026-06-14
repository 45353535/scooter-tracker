package sg.bigo.ads.core.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.b.c;
import sg.bigo.ads.common.utils.j;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static Map<String, Object> a(@NonNull String str, @NonNull l lVar, @NonNull sg.bigo.ads.api.b bVar, @Nullable sg.bigo.ads.api.core.b bVar2, @Nullable Integer num) {
        sg.bigo.ads.api.core.b bVarI;
        HashMap map = new HashMap();
        map.put("action", str);
        map.put("slot", lVar.l());
        map.put("config_id", Long.valueOf(i.f102116a.i()));
        map.put(Reporting.Key.PLACEMENT_ID, lVar.n());
        map.put("strategy_id", lVar.a());
        map.put("ad_type", Integer.valueOf(lVar.b()));
        map.put("abflags", q.a(i.f102116a.j(), lVar.o()));
        map.put("ts", Long.valueOf(System.currentTimeMillis()));
        map.put("begin_ts", Long.valueOf(bVar.f102124h.f102130f));
        map.put("banner_type", Integer.valueOf(bVar.f102119c));
        map.put("adn_name", "bigoad");
        JSONObject jSONObject = new JSONObject();
        b.a aVar = bVar.f102124h;
        j.a(jSONObject, "session_id", aVar.c());
        j.a(jSONObject, "gps_country", aVar.d());
        j.a(jSONObject, "sim_country", aVar.e());
        j.a(jSONObject, "system_country", aVar.f());
        j.a(jSONObject, "req_status", Integer.valueOf(aVar.h()));
        if (bVar2 != null) {
            j.a(jSONObject, "adx_country", bVar2.m());
        }
        if (lVar.w()) {
            j.a(jSONObject, "config_country", i.f102116a.k());
        }
        String strG = aVar.g();
        if (!q.a((CharSequence) strG)) {
            j.a(jSONObject, "load_ext", strG);
        }
        if (num != null) {
            j.a(jSONObject, "auc_mode", num);
        }
        if ((bVar instanceof sg.bigo.ads.api.b.b) && (bVarI = ((sg.bigo.ads.api.b.b) bVar).i()) != null) {
            j.a(jSONObject, "host_slot", bVarI.b());
            j.a(jSONObject, "host_placement", bVarI.c());
            j.a(jSONObject, "host_sid", Long.valueOf(bVarI.y()));
            j.a(jSONObject, "host_ad_id", bVarI.r());
        }
        if (bVar instanceof c) {
            j.a(jSONObject, "icon_req_num", Integer.valueOf(((c) bVar).j()));
        }
        map.put("extra_json", jSONObject.toString());
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01bf A[PHI: r0
  0x01bf: PHI (r0v5 sg.bigo.ads.api.core.n) = (r0v4 sg.bigo.ads.api.core.n), (r0v11 sg.bigo.ads.api.core.n) binds: [B:70:0x01d6, B:65:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.Object> a(@androidx.annotation.NonNull java.lang.String r19, @androidx.annotation.NonNull sg.bigo.ads.api.a.l r20, @androidx.annotation.NonNull sg.bigo.ads.api.b r21, @androidx.annotation.Nullable sg.bigo.ads.api.core.b r22, @androidx.annotation.Nullable java.lang.Integer r23, @androidx.annotation.Nullable java.lang.String r24, @androidx.annotation.Nullable java.lang.String r25, @androidx.annotation.Nullable sg.bigo.ads.api.b.a r26) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.b.a.a(java.lang.String, sg.bigo.ads.api.a.l, sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, java.lang.Integer, java.lang.String, java.lang.String, sg.bigo.ads.api.b.a):java.util.Map");
    }
}
