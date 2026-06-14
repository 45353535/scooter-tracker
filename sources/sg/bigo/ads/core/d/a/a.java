package sg.bigo.ads.core.d.a;

import com.appodeal.ads.modules.common.internal.Constants;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104010a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f104011b = 900000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, C1289a> f104012c;

    /* JADX INFO: renamed from: sg.bigo.ads.core.d.a.a$a, reason: collision with other inner class name */
    public static class C1289a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f104013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f104014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f104015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f104016d;

        public static C1289a a(String str) {
            C1289a c1289a = new C1289a();
            c1289a.f104013a = str;
            c1289a.f104014b = true;
            c1289a.f104015c = true;
            c1289a.f104016d = Constants.DEFAULT_WATERFALL_VALIDITY_PERIOD;
            return c1289a;
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject == null) {
                sg.bigo.ads.common.t.a.a(0, "Stats", "eventConfig is null.");
                return;
            }
            this.f104013a = jSONObject.optString("event_id");
            this.f104014b = jSONObject.optInt("status") == 1;
            this.f104015c = jSONObject.optInt(POBCTAOverlayData.KEY_CTA_DELAY) == 1;
            int iOptInt = jSONObject.optInt("expired") * 1000;
            this.f104016d = iOptInt;
            if (iOptInt == 0) {
                this.f104016d = Constants.DEFAULT_WATERFALL_VALIDITY_PERIOD;
            }
        }
    }

    public a() {
        HashMap<String, C1289a> map = new HashMap<>();
        this.f104012c = map;
        b();
        map.put("06002002", C1289a.a("06002002"));
        map.put("06002007", C1289a.a("06002007"));
    }

    private void b() {
        this.f104010a = 10;
        this.f104011b = 900000;
        this.f104012c.clear();
    }

    public final int a() {
        return Math.round(this.f104010a * 0.8f);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            b();
            return;
        }
        this.f104010a = jSONObject.optInt("delay_num", 10);
        int iOptInt = jSONObject.optInt("delay_interval") * 1000;
        this.f104011b = iOptInt;
        if (iOptInt == 0) {
            this.f104011b = 900000;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("event_config");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            C1289a c1289a = new C1289a();
            c1289a.a(jSONArrayOptJSONArray.optJSONObject(i10));
            if (q.b((CharSequence) c1289a.f104013a)) {
                this.f104012c.put(c1289a.f104013a, c1289a);
            }
        }
    }

    public final boolean a(String str) {
        C1289a c1289a = this.f104012c.get(str);
        if (c1289a == null) {
            return false;
        }
        return c1289a.f104014b;
    }
}
