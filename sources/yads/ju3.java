package yads;

import android.text.TextUtils;
import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ju3 extends bt3 {
    public ju3(mt3 mt3Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(mt3Var, hashSet, jSONObject, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.nt3, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        ut3 ut3Var;
        if (!TextUtils.isEmpty(str) && (ut3Var = ut3.f116776c) != null) {
            for (dt3 dt3Var : DesugarCollections.unmodifiableCollection(ut3Var.f116777a)) {
                if (this.f109104c.contains(dt3Var.f110068h)) {
                    ia iaVar = dt3Var.f110065e;
                    if (this.f109106e >= iaVar.f111926f) {
                        iaVar.f111925e = 2;
                        pu3.f114791a.a((WebView) iaVar.f111922b.get(), "setNativeViewHierarchy", str, iaVar.f111921a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (st3.c(this.f109105d, this.f114033b.f113603a)) {
            return null;
        }
        mt3 mt3Var = this.f114033b;
        JSONObject jSONObject = this.f109105d;
        mt3Var.f113603a = jSONObject;
        return jSONObject.toString();
    }
}
