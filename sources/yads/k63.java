package yads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k63 implements us3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k63 f112606g = new k63();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Handler f112607h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Handler f112608i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i63 f112609j = new i63();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j63 f112610k = new j63();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f112616f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f112611a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f112612b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final at3 f112614d = new at3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jt3 f112613c = new jt3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mt3 f112615e = new mt3(new tt3());

    public final void a(View view, xs3 xs3Var, JSONObject jSONObject, boolean z10) {
        Object obj;
        boolean z11;
        if (ou3.a(view) == null) {
            at3 at3Var = this.f112614d;
            char c10 = at3Var.f108808d.contains(view) ? (char) 1 : at3Var.f108814j ? (char) 2 : (char) 3;
            if (c10 == 3) {
                return;
            }
            JSONObject jSONObjectA = xs3Var.a(view);
            st3.a(jSONObject, jSONObjectA);
            at3 at3Var2 = this.f112614d;
            if (at3Var2.f108805a.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) at3Var2.f108805a.get(view);
                if (obj2 != null) {
                    at3Var2.f108805a.remove(view);
                }
                obj = obj2;
            }
            boolean z12 = false;
            if (obj != null) {
                try {
                    jSONObjectA.put("adSessionId", obj);
                } catch (JSONException e10) {
                    au3.a("Error with setting ad session id", e10);
                }
                at3 at3Var3 = this.f112614d;
                if (at3Var3.f108813i.containsKey(view)) {
                    at3Var3.f108813i.put(view, Boolean.TRUE);
                } else {
                    z12 = true;
                }
                try {
                    jSONObjectA.put("hasWindowFocus", Boolean.valueOf(z12));
                } catch (JSONException e11) {
                    Log.e("OMIDLIB", "Error with setting has window focus", e11);
                }
                boolean zContains = this.f112614d.f108812h.contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectA.put("isPipActive", objValueOf);
                    } catch (JSONException e12) {
                        Log.e("OMIDLIB", "Error with setting is picture-in-picture active", e12);
                    }
                }
                this.f112614d.f108814j = true;
                return;
            }
            at3 at3Var4 = this.f112614d;
            ts3 ts3Var = (ts3) at3Var4.f108806b.get(view);
            if (ts3Var != null) {
                at3Var4.f108806b.remove(view);
            }
            if (ts3Var != null) {
                eu3 eu3Var = ts3Var.f116361a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = ts3Var.f116362b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", eu3Var.f110464b);
                    jSONObjectA.put("friendlyObstructionPurpose", eu3Var.f110465c);
                    jSONObjectA.put("friendlyObstructionReason", eu3Var.f110466d);
                } catch (JSONException e13) {
                    Log.e("OMIDLIB", "Error with setting friendly obstruction", e13);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            xs3Var.a(view, jSONObjectA, this, c10 == 1, z10 || z11);
        }
    }
}
