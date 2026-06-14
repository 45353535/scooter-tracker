package sg.bigo.ads.core.e.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.k;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f104121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f104122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f104123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f104124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    JSONObject f104125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f104126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f104127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f104128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f104129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f104130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f104131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, String> f104132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private sg.bigo.ads.common.g f104133m;

    e(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    private boolean f() {
        return this.f104123c == 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String g() {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.e.a.e.g():java.lang.String");
    }

    public final void a(@NonNull String str, @NonNull String str2) {
        this.f104132l.put(str, str2);
    }

    public final boolean b() {
        return this.f104131k != 0 && r.a() / 1000 > ((long) this.f104131k);
    }

    public final boolean c() {
        return this.f104121a == 0;
    }

    @NonNull
    public final sg.bigo.ads.common.u.a d() {
        k.b aVar;
        if (TextUtils.isEmpty(this.f104130j)) {
            e();
            sg.bigo.ads.common.t.a.a(0, 3, "ThirdTrack", "getRealUrl url = " + this.f104130j);
        }
        if (c() && f()) {
            k kVar = d.a().f104114d;
            if (kVar != null) {
                aVar = kVar.a(this.f104130j);
                sg.bigo.ads.common.t.a.a(0, 3, "ThirdTrack", "replaceHost new url = " + aVar.a());
            } else {
                sg.bigo.ads.common.t.a.a(0, "ThirdTrack", "replaceHost handle is null, replace failed");
                aVar = null;
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new k.a(this.f104130j);
        }
        return new sg.bigo.ads.core.e.a(aVar);
    }

    public final void e() {
        this.f104130j = g();
        sg.bigo.ads.common.t.a.a(0, 3, "ThirdTrack", "updateRealUrl url = " + this.f104130j);
        JSONObject jSONObject = this.f104125e;
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("real_url", this.f104130j);
            } catch (JSONException unused) {
            }
        }
    }

    public final String toString() {
        return "type=" + this.f104121a + ",name=" + this.f104122b + ",url=" + this.f104130j;
    }

    public e(JSONObject jSONObject, sg.bigo.ads.common.g gVar) {
        this.f104133m = gVar;
        this.f104125e = jSONObject;
        this.f104132l = new HashMap();
        this.f104121a = jSONObject.optInt("type", 0);
        this.f104126f = jSONObject.optString("value", "");
        this.f104122b = jSONObject.optString("name", "");
        this.f104127g = jSONObject.optString(CommonUrlParts.UUID, "");
        this.f104131k = jSONObject.optInt("expired");
        this.f104123c = jSONObject.optInt("replace", 0);
        this.f104124d = jSONObject.optInt("norepeat", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reg");
        if (jSONArrayOptJSONArray != null) {
            this.f104128h = new String[jSONArrayOptJSONArray.length()];
            this.f104129i = new String[jSONArrayOptJSONArray.length()];
            a(jSONArrayOptJSONArray);
        }
        this.f104130j = jSONObject.optString("real_url");
    }

    private void a(JSONArray jSONArray) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (jSONArray.optJSONObject(i10) != null) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                this.f104128h[i10] = jSONObjectOptJSONObject.optString("token", "");
                this.f104129i[i10] = jSONObjectOptJSONObject.optString("value", "");
            }
        }
    }

    public final boolean a() {
        return "bigo_tracker".equals(this.f104127g);
    }
}
