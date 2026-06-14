package com.taurusx.tax.api;

import android.text.TextUtils;
import android.util.Base64;
import com.taurusx.tax.a.z.y;
import com.taurusx.tax.a.z.z;
import com.taurusx.tax.g.a;
import com.taurusx.tax.g.e0;
import com.taurusx.tax.g.n;
import com.taurusx.tax.g.q;
import com.taurusx.tax.g.r0.c;
import com.taurusx.tax.w.o.w;
import com.taurusx.tax.w.s.s;
import com.taurusx.tax.y.z.z;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class BidManager {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static BidManager f65780z;

    public static BidManager getInstance() {
        if (f65780z == null) {
            synchronized (BidManager.class) {
                try {
                    if (f65780z == null) {
                        f65780z = new BidManager();
                    }
                } finally {
                }
            }
        }
        return f65780z;
    }

    public void getToken(final String str, final OnTaurusXTokenListener onTaurusXTokenListener) {
        c.z().execute(new Runnable() { // from class: com.taurusx.tax.api.BidManager.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    y.w wVarZ = z.z(TaurusXAds.getContext(), TaurusXAds.getAppId(), str);
                    if (w.a()) {
                        JSONObject jSONObject = new JSONObject();
                        List<z.c> listZ = com.taurusx.tax.w.z.t().a().z(String.valueOf(System.currentTimeMillis() - ((long) (w.n() * 60000))));
                        JSONArray jSONArray = new JSONArray();
                        for (z.c cVar : listZ) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("time", cVar.f67733y);
                            jSONObject2.put(s.I, cVar.f67732w);
                            jSONObject2.put("placement", cVar.f67731c);
                            jSONArray.put(jSONObject2);
                        }
                        jSONObject.put(n.N, jSONArray);
                        q.z(com.taurusx.tax.w.z.t().o()).w(jSONObject);
                        q.z(com.taurusx.tax.w.z.t().o()).z(jSONObject);
                        wVarZ.c(jSONObject);
                    } else {
                        com.taurusx.tax.w.z.t().a().w(String.valueOf(System.currentTimeMillis() - SignalManager.TWENTY_FOUR_HOURS_MILLIS));
                    }
                    wVarZ.n(com.taurusx.tax.g.p0.w.z(TaurusXAds.getContext()));
                    wVarZ.h(e0.y(TaurusXAds.getContext()));
                    wVarZ.x(com.taurusx.tax.g.w.c(TaurusXAds.getContext()));
                    wVarZ.i(com.taurusx.tax.g.p0.w.s(TaurusXAds.getContext()) ? "1" : "0");
                    wVarZ.y(com.taurusx.tax.y.s.w.y(TaurusXAds.getContext()));
                    com.taurusx.tax.g.q0.y yVarZ = com.taurusx.tax.g.q0.w.z(TaurusXAds.getContext());
                    if (yVarZ != null && !TextUtils.isEmpty(yVarZ.f66310z)) {
                        wVarZ.l(yVarZ.f66310z);
                        wVarZ.e(yVarZ.f66309w ? "1" : "0");
                    }
                    String strEncodeToString = Base64.encodeToString(com.taurusx.tax.g.z.z(com.taurusx.tax.a.z.w.z(wVarZ.z().w().toString()), a.z(), a.w()), 2);
                    OnTaurusXTokenListener onTaurusXTokenListener2 = onTaurusXTokenListener;
                    if (onTaurusXTokenListener2 != null) {
                        onTaurusXTokenListener2.getToken(strEncodeToString);
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                    e10.printStackTrace();
                }
            }
        });
    }
}
