package yads;

import android.util.Log;
import android.webkit.WebView;
import com.ironsource.C4240b4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt3 f109746a;

    public d4(dt3 dt3Var) {
        this.f109746a = dt3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        dt3 dt3Var = this.f109746a;
        boolean z10 = dt3Var.f110067g;
        if (z10) {
            throw new IllegalStateException("AdSession is finished");
        }
        if (r92.f115374c != dt3Var.f110062b.f110664a) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        if (!dt3Var.f110066f || z10) {
            try {
                dt3Var.c();
            } catch (Exception unused) {
            }
        }
        dt3 dt3Var2 = this.f109746a;
        if (!dt3Var2.f110066f || dt3Var2.f110067g) {
            return;
        }
        if (dt3Var2.f110069i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        ia iaVar = dt3Var2.f110065e;
        pu3.f114791a.a((WebView) iaVar.f111922b.get(), "publishImpressionEvent", iaVar.f111921a);
        dt3Var2.f110069i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ba3 ba3Var) {
        lu3.a(this.f109746a);
        dt3 dt3Var = this.f109746a;
        if (r92.f115374c == dt3Var.f110062b.f110664a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("skippable", ba3Var.f108952a);
                if (ba3Var.f108952a) {
                    jSONObject.put("skipOffset", ba3Var.f108953b);
                }
                jSONObject.put("autoPlay", ba3Var.f108954c);
                jSONObject.put(C4240b4.i.L, ba3Var.f108955d);
            } catch (JSONException e10) {
                Log.e("OMIDLIB", "VastProperties: JSON error", e10);
            }
            if (!dt3Var.f110070j) {
                ia iaVar = dt3Var.f110065e;
                pu3.f114791a.a((WebView) iaVar.f111922b.get(), "publishLoadedEvent", jSONObject, iaVar.f111921a);
                dt3Var.f110070j = true;
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
