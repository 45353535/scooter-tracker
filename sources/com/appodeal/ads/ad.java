package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.app.AppState;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ad extends l0 {
    public ad(AdType adType, gd gdVar) {
        super(adType, gdVar);
    }

    @Override // com.appodeal.ads.l0
    public final void M() {
        Activity resumedActivity = com.appodeal.ads.context.o.f13205b.getResumedActivity();
        if (resumedActivity == null) {
            return;
        }
        ac acVarP = P();
        t7 t7Var = acVarP.o(resumedActivity).f13515a;
        if (t7Var != null ? acVarP.z(resumedActivity, new ic(y(), t7Var), this) : false) {
            return;
        }
        super.M();
    }

    @Override // com.appodeal.ads.l0
    public final boolean N() {
        return this.f13578r && A() == null;
    }

    public abstract xe O();

    public abstract ac P();

    @Override // com.appodeal.ads.l0
    public final void e(Activity activity, AppState appState) {
        ac acVarP = P();
        if (appState == AppState.Resumed && this.f13570j && !com.appodeal.ads.utils.c.c(activity)) {
            ja jaVarO = acVarP.o(activity);
            if (jaVarO.f13516b == f3.VISIBLE || jaVarO.f13515a != null) {
                com.appodeal.ads.segments.o oVarY = y();
                t7 t7Var = acVarP.o(activity).f13515a;
                if (t7Var == null && (t7Var = acVarP.f11900g) == null) {
                    t7Var = acVarP.f11899f;
                }
                acVarP.z(activity, new ic(oVarY, t7Var), this);
            }
        }
        if (appState == AppState.Destroyed) {
            for (Map.Entry entry : acVarP.f11905l.entrySet()) {
                if (((WeakReference) entry.getKey()).get() == activity) {
                    acVarP.f11905l.remove(entry.getKey());
                    Log.debug("ViewAdRenderer", "handleActivityDestroy", activity == null ? "null" : activity.toString());
                    return;
                }
            }
        }
    }

    @Override // com.appodeal.ads.l0
    public final void f(Context context) {
        g(context, O());
    }

    @Override // com.appodeal.ads.l0
    public final void n(JSONObject jSONObject) {
        ac acVarP = P();
        acVarP.getClass();
        if (jSONObject.has("refresh_period")) {
            acVarP.f11894a = Integer.valueOf(jSONObject.optInt("refresh_period") * 1000);
        }
        if (jSONObject.has("use_visibility_tracker")) {
            acVarP.f11895b = jSONObject.optBoolean("use_visibility_tracker", true);
        }
    }
}
