package f1;

import android.content.SharedPreferences;
import com.ironsource.C4240b4;
import f1.z2;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f71432a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f71433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cif f71434c;

    public w2(SharedPreferences sharedPreferences, Cif cif) {
        this.f71433b = sharedPreferences;
        this.f71434c = cif;
        e();
    }

    public HashMap a() {
        return this.f71432a;
    }

    public final JSONObject b(j1.d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacyStandard", dVar.a());
            jSONObject.put(C4240b4.j.f42669b0, dVar.getConsent());
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public final void c(SharedPreferences sharedPreferences, JSONArray jSONArray) {
        if (sharedPreferences == null || jSONArray == null) {
            return;
        }
        sharedPreferences.edit().putString("privacy_standards", jSONArray.toString()).apply();
    }

    public final void d(JSONException jSONException) {
        this.f71434c.mo4436e(w3.t(z2.d.f71714d, jSONException.getMessage(), "", ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.w2.e():void");
    }

    public void f(j1.d dVar) {
        eg.d("Added privacy standard: " + dVar.a() + " with consent: " + dVar.getConsent(), null);
        this.f71432a.put(dVar.a(), dVar);
        h();
    }

    public final void g(String str) {
        this.f71434c.mo4436e(w3.t(z2.d.f71716f, str, "", ""));
    }

    public final void h() {
        if (this.f71433b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f71432a.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(b((j1.d) it.next()));
            }
            c(this.f71433b, jSONArray);
        }
    }
}
