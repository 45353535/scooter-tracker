package yads;

import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class gu3 extends bt3 {
    public gu3(mt3 mt3Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(mt3Var, hashSet, jSONObject, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.nt3, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        ut3 ut3Var = ut3.f116776c;
        if (ut3Var != null) {
            for (dt3 dt3Var : DesugarCollections.unmodifiableCollection(ut3Var.f116777a)) {
                if (this.f109104c.contains(dt3Var.f110068h)) {
                    ia iaVar = dt3Var.f110065e;
                    if (this.f109106e >= iaVar.f111926f && iaVar.f111925e != 3) {
                        iaVar.f111925e = 3;
                        pu3.f114791a.a((WebView) iaVar.f111922b.get(), "setNativeViewHierarchy", str, iaVar.f111921a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return this.f109105d.toString();
    }
}
