package sg.bigo.ads.api.core;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.e;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements sg.bigo.ads.api.a.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sg.bigo.ads.api.a.f[] f102190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.api.a.f f102191f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f102186a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f102187b = "en";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f102188c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f102189d = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f102192g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f102193h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f102194i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f102195j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public e.b f102197l = new e.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public e.a f102198m = new e.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public e.c[] f102196k = new e.c[0];

    @Override // sg.bigo.ads.api.a.e
    public final String a() {
        return this.f102188c;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String b() {
        return this.f102189d;
    }

    @Override // sg.bigo.ads.api.a.e
    public final long c() {
        return this.f102186a;
    }

    @Override // sg.bigo.ads.api.a.e
    public final int d() {
        return this.f102194i;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String e() {
        return this.f102187b;
    }

    @Override // sg.bigo.ads.api.a.e
    public final int f() {
        return this.f102195j;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String g() {
        return this.f102193h;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String h() {
        return this.f102192g;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f[] i() {
        return this.f102190e;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f j() {
        sg.bigo.ads.api.a.f[] fVarArr = this.f102190e;
        if (fVarArr == null || fVarArr.length <= 0) {
            return null;
        }
        return fVarArr[0];
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f k() {
        return this.f102191f;
    }

    @Override // sg.bigo.ads.api.a.e
    public final e.b l() {
        return this.f102197l;
    }

    @Override // sg.bigo.ads.api.a.e
    public final e.c[] m() {
        return this.f102196k;
    }

    @Override // sg.bigo.ads.api.a.e
    public final e.a n() {
        return this.f102198m;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f102186a = jSONObject.optLong("form_id", 0L);
            this.f102188c = jSONObject.optString("title", "");
            this.f102187b = jSONObject.optString("ad_lang", "en");
            this.f102189d = jSONObject.optString("description", "");
            this.f102192g = jSONObject.optString("purpose", "");
            this.f102194i = jSONObject.optInt("color", 0);
            this.f102195j = jSONObject.optInt("form_style_id", 0);
            this.f102193h = jSONObject.optString("extra", "");
            a(jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("icon");
            if (jSONObjectOptJSONObject != null) {
                this.f102191f = new j(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("questions");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject2 != null) {
                        arrayList.add(new e.c(jSONObjectOptJSONObject2));
                    }
                }
                e.c[] cVarArr = new e.c[arrayList.size()];
                this.f102196k = cVarArr;
                this.f102196k = (e.c[]) arrayList.toArray(cVarArr);
            }
            e.b bVar = this.f102197l;
            String strOptString = jSONObject.optString("privacy", "");
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    bVar.f102110a = jSONObject2.optString("name", "");
                    bVar.f102111b = jSONObject2.optString("url", "");
                } catch (JSONException unused) {
                }
            }
            e.a aVar = this.f102198m;
            String strOptString2 = jSONObject.optString("feedback", "");
            if (TextUtils.isEmpty(strOptString2)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString2);
            aVar.f102106a = jSONObject3.optString("title", "");
            aVar.f102107b = jSONObject3.optString("description", "");
            aVar.f102108c = jSONObject3.optString("cta", "");
            aVar.f102109d = jSONObject3.optString("land_url", "");
        } catch (JSONException unused2) {
        }
    }

    private void a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new j(jSONObjectOptJSONObject));
                }
            }
            j[] jVarArr = new j[arrayList.size()];
            this.f102190e = jVarArr;
            this.f102190e = (sg.bigo.ads.api.a.f[]) arrayList.toArray(jVarArr);
        }
    }
}
