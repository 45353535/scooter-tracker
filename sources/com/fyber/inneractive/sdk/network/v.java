package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4455ne;
import com.ironsource.D5;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f21404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f21407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f21408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f21410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f21411h;

    public v(w wVar, y yVar, String str, String str2, String str3, String str4, Integer num, String str5) {
        this.f21411h = wVar;
        this.f21404a = yVar;
        this.f21405b = str;
        this.f21406c = str2;
        this.f21407d = str3;
        this.f21408e = str4;
        this.f21409f = num;
        this.f21410g = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strA;
        HashMap map;
        com.fyber.inneractive.sdk.response.e eVar;
        w wVar = this.f21411h;
        t tVar = wVar.f21417b;
        if (tVar != null) {
            this.f21404a.a(Integer.valueOf(tVar.val), NotificationCompat.CATEGORY_ERROR);
            this.f21411h.f21417b.getClass();
            strA = r1.ERROR_TABLE.a();
            IAlog.a("Event dispatcher - dispatching error: %s", this.f21411h.f21417b);
            int i10 = this.f21411h.f21417b.val;
        } else {
            u uVar = wVar.f21418c;
            if (uVar != null) {
                this.f21404a.a(Integer.valueOf(uVar.val), "event");
                this.f21411h.f21418c.getClass();
                strA = r1.EVENT_TABLE.a();
                IAlog.a("Event dispatcher - dispatching event: %s", this.f21411h.f21418c);
                int i11 = this.f21411h.f21418c.val;
            } else {
                strA = null;
            }
        }
        y yVar = this.f21404a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strA);
        w wVar2 = this.f21411h;
        t tVar2 = wVar2.f21417b;
        sb2.append(tVar2 != null ? String.valueOf(tVar2.val) : String.valueOf(wVar2.f21418c.val));
        yVar.a(sb2.toString(), D5.Q);
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        this.f21404a.a(Long.valueOf(calendar.getTimeInMillis()), "date_created");
        if (!IAConfigManager.d()) {
            this.f21404a.a(this.f21405b, "contentid");
            this.f21404a.a(this.f21406c, "fairbidv");
            if (!TextUtils.isEmpty(this.f21407d)) {
                this.f21404a.a(this.f21407d, "placement_type");
            }
            if (!TextUtils.isEmpty(this.f21408e)) {
                this.f21404a.a(this.f21408e, "spot_id");
            }
            if (!InneractiveAdManager.isCurrentUserAChild()) {
                String strI = com.fyber.inneractive.sdk.util.k.i();
                if (!TextUtils.isEmpty(strI)) {
                    this.f21404a.a(strI, "ciso");
                }
            }
            this.f21404a.a(this.f21409f, "ad_type");
            if (this.f21411h.f21422g && !TextUtils.isEmpty(this.f21410g)) {
                this.f21404a.f21429c = this.f21410g;
            }
            this.f21404a.a(com.fyber.inneractive.sdk.util.z0.a().b(), "n");
            try {
                this.f21404a.a(w.f21415h.format(calendar.getTime()), "day");
            } catch (Throwable unused) {
            }
            this.f21404a.a(Integer.valueOf(calendar.get(11)), "hour");
            JSONArray jSONArray = this.f21411h.f21419d;
            if (jSONArray != null && jSONArray.length() > 0) {
                this.f21404a.a(this.f21411h.f21419d, C4455ne.f44465d);
            }
            com.fyber.inneractive.sdk.response.e eVar2 = this.f21411h.f21420e;
            if (eVar2 != null && eVar2.D) {
                this.f21404a.a("1", "sdk_bidding");
            }
            if (InneractiveAdManager.isCurrentUserAChild()) {
                this.f21404a.a("1", "child_mode");
            }
            IAConfigManager iAConfigManager = IAConfigManager.O;
            this.f21404a.a(iAConfigManager.E.n() && (eVar = this.f21411h.f21420e) != null && eVar.H != com.fyber.inneractive.sdk.ignite.m.NONE ? "1" : "0", "ignite");
            y yVar2 = this.f21404a;
            com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f21084p;
            yVar2.a(lVar != null ? lVar.f93862a.d() : null, "ignitep");
            y yVar3 = this.f21404a;
            com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.E.f21084p;
            yVar3.a(lVar2 != null ? lVar2.f93862a.i() : null, "ignitev");
            JSONArray jSONArrayB = iAConfigManager.M.b();
            if (jSONArrayB != null && jSONArrayB.length() > 0) {
                this.f21404a.a(jSONArrayB, "s_experiments");
            }
            JSONArray jSONArray2 = this.f21411h.f21421f;
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= jSONArray2.length()) {
                        break;
                    }
                    if (jSONArray2.optJSONObject(i12).length() >= 1) {
                        this.f21404a.a(this.f21411h.f21421f, "extra");
                        break;
                    }
                    i12++;
                }
            }
            com.fyber.inneractive.sdk.response.e eVar3 = this.f21411h.f21420e;
            if (eVar3 != null && eVar3.L) {
                this.f21404a.a("1", "dynamic_controls");
            }
        }
        y yVar4 = this.f21404a;
        if (TextUtils.isEmpty(yVar4.f21427a) || (map = yVar4.f21428b) == null || map.size() == 0) {
            return;
        }
        f fVar = IAConfigManager.O.I;
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        HashMap map2 = yVar4.f21428b;
        for (String str : map2.keySet()) {
            Object obj = map2.get(str);
            if (obj != null) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused2) {
                }
            }
        }
        String strSubstring = yVar4.f21429c;
        if (strSubstring != null) {
            int length = strSubstring.length();
            if (length > 51200) {
                int iIndexOf = strSubstring.indexOf("iawrapper");
                if (iIndexOf == -1) {
                    iIndexOf = 0;
                }
                strSubstring = strSubstring.substring(iIndexOf, 51199);
                IAlog.a("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", Integer.valueOf(length), 51200);
            }
            try {
                jSONObject.put("ad", strSubstring);
            } catch (JSONException e10) {
                IAlog.a("Failed inserting ad body to json", e10, new Object[0]);
            }
        }
        if (IAlog.f23840a == 1) {
            try {
                jSONObject.toString();
            } catch (Throwable unused3) {
            }
        }
        fVar.f21304a.offer(jSONObject);
        if (fVar.f21304a.size() > 30) {
            com.fyber.inneractive.sdk.util.d1 d1Var = fVar.f21307d;
            if (d1Var != null && d1Var.hasMessages(12312329)) {
                fVar.f21307d.removeMessages(12312329);
            }
            com.fyber.inneractive.sdk.util.d1 d1Var2 = fVar.f21307d;
            if (d1Var2 != null) {
                d1Var2.post(new c(fVar, 12312329, 0L));
            }
        }
    }
}
