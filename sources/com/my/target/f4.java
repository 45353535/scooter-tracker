package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.common.models.ImageData;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f59638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f59639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f59640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f59641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59642e = true;

    public f4(u uVar, j jVar, Context context) {
        this.f59638a = uVar;
        this.f59639b = jVar;
        this.f59640c = context;
        this.f59641d = g1.a(uVar, jVar, context);
    }

    public static f4 a(u uVar, j jVar, Context context) {
        return new f4(uVar, jVar, context);
    }

    public g4 b(JSONObject jSONObject, e4 e4Var) {
        g4 g4VarA = g4.a(e4Var);
        g4VarA.a(e4Var.g());
        this.f59641d.a(jSONObject, g4VarA);
        if (!jSONObject.has("title")) {
            g4VarA.e(true);
        }
        if (TextUtils.isEmpty(g4VarA.B())) {
            a("Required field", "no tracking link in interstitialAdCard", e4Var.r());
            return null;
        }
        if (g4VarA.s() == null) {
            a("Required field", "no image in interstitialAdCard", e4Var.r());
            return null;
        }
        g4VarA.k(jSONObject.optString("cardID", g4VarA.r()));
        return g4VarA;
    }

    public e4 a(JSONObject jSONObject, String str, n nVar) {
        String strOptString = jSONObject.optString("type", "");
        strOptString.getClass();
        switch (strOptString) {
            case "banner":
            case "fullscreen":
                l4 l4VarT = l4.T();
                if (a(jSONObject, l4VarT, nVar)) {
                    return l4VarT;
                }
                return null;
            case "html":
                j4 j4VarS = j4.S();
                if (a(jSONObject, j4VarS, str, nVar)) {
                    return j4VarS;
                }
                return null;
            case "promo":
                o4 o4VarY = o4.Y();
                if (a(jSONObject, o4VarY, str, nVar)) {
                    return o4VarY;
                }
                return null;
            default:
                nVar.a(m.f60114s);
                return null;
        }
    }

    public boolean a(JSONObject jSONObject, l4 l4Var, n nVar) {
        a(jSONObject, l4Var);
        return m4.a(this.f59638a, this.f59639b, this.f59640c).a(jSONObject, l4Var, nVar);
    }

    public boolean a(JSONObject jSONObject, o4 o4Var, String str, n nVar) {
        JSONObject jSONObjectOptJSONObject;
        g4 g4VarB;
        a(jSONObject, o4Var);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("styleSettings");
        if (jSONObjectOptJSONObject2 != null) {
            a(jSONObjectOptJSONObject2, o4Var.T());
        }
        int iC = this.f59638a.C();
        if (iC > 0) {
            o4Var.e(iC);
        } else {
            o4Var.e(jSONObject.optInt("style", o4Var.U()));
        }
        o4Var.g(jSONObject.optBoolean("closeOnClick", o4Var.W()));
        o4Var.h(jSONObject.optBoolean("videoRequired", o4Var.X()));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cards");
        if (jSONArrayOptJSONArray != null && kb.d()) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject3 != null && (g4VarB = b(jSONObjectOptJSONObject3, o4Var)) != null) {
                    o4Var.a(g4VarB);
                }
            }
        }
        if (o4Var.S().isEmpty() && (jSONObjectOptJSONObject = jSONObject.optJSONObject("video")) != null) {
            s5 s5VarN0 = s5.n0();
            s5VarN0.k(o4Var.r());
            s5VarN0.c(o4Var.J());
            if (j1.a(this.f59638a, this.f59639b, this.f59640c).a(jSONObjectOptJSONObject, s5VarN0, i0.f59838d)) {
                za zaVarX = s5VarN0.x();
                if (!zaVarX.c()) {
                    zaVarX.b(o4Var.x(), s5VarN0.o());
                }
                o4Var.a(s5VarN0);
                if (s5VarN0.h0()) {
                    o4Var.f(s5VarN0.a0());
                    o4Var.c(s5VarN0.M());
                }
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
            if (jSONObjectOptJSONObject4 != null) {
                e4 e4VarA = a(jSONObjectOptJSONObject4, str, nVar);
                if (e4VarA != null && e4VarA.r().length() == 0) {
                    e4VarA.k(o4Var.r());
                }
                o4Var.a(e4VarA);
            }
        }
        String strOptString = jSONObject.optString("adIconLink");
        if (TextUtils.isEmpty(strOptString)) {
            return true;
        }
        o4Var.d(ImageData.newImageData(strOptString));
        o4Var.t(jSONObject.optString("adIconClickLink"));
        return true;
    }

    public boolean a(JSONObject jSONObject, j4 j4Var, String str, n nVar) {
        String strA;
        a(jSONObject, j4Var);
        String strA2 = g1.a(jSONObject, nVar);
        if (TextUtils.isEmpty(strA2)) {
            nVar.a(m.f60112q);
            a("Required field", "Banner with type 'html' has no source field", j4Var.r());
            return false;
        }
        if (!TextUtils.isEmpty(str) && (strA = g1.a(str, strA2)) != null) {
            j4Var.r("mraid");
            strA2 = strA;
        }
        if (j4Var.u() != null) {
            strA2 = l8.a(strA2);
        }
        j4Var.g(jSONObject.optBoolean("forceWebMediaPlayback"));
        j4Var.t(strA2);
        j4Var.d((float) jSONObject.optDouble("timeToReward", j4Var.R()));
        return true;
    }

    public final void a(JSONObject jSONObject, m9 m9Var) {
        m9Var.c(m5.a(jSONObject, "ctaButtonColor", m9Var.d()));
        m9Var.e(m5.a(jSONObject, "ctaButtonTouchColor", m9Var.f()));
        m9Var.d(m5.a(jSONObject, "ctaButtonTextColor", m9Var.e()));
        m9Var.a(m5.a(jSONObject, "backgroundColor", m9Var.a()));
        m9Var.h(m5.a(jSONObject, "textColor", m9Var.j()));
        m9Var.i(m5.a(jSONObject, "titleTextColor", m9Var.j()));
        m9Var.f(m5.a(jSONObject, "domainTextColor", m9Var.g()));
        m9Var.g(m5.a(jSONObject, "progressBarColor", m9Var.h()));
        m9Var.b(m5.a(jSONObject, "barColor", m9Var.b()));
        float fOptDouble = (float) jSONObject.optDouble("barOverlayAlpha", m9Var.c());
        if (0.0f <= fOptDouble && fOptDouble <= 1.0f) {
            m9Var.a(fOptDouble);
        }
        String strOptString = jSONObject.optString("storeIcon");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        m9Var.a(ImageData.newImageData(strOptString));
    }

    public final void a(JSONObject jSONObject, e4 e4Var) {
        this.f59641d.a(jSONObject, e4Var);
        this.f59642e = e4Var.J();
        Boolean boolC = this.f59638a.c();
        e4Var.e(boolC != null ? boolC.booleanValue() : jSONObject.optBoolean("allowBackButton", e4Var.N()));
        e4Var.c((float) jSONObject.optDouble("allowCloseDelay", e4Var.L()));
        String strOptString = jSONObject.optString("close_icon_hd");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        e4Var.c(ImageData.newImageData(strOptString));
    }

    public final void a(String str, String str2, String str3) {
        if (this.f59642e) {
            String str4 = this.f59638a.f60845a;
            q5 q5VarD = q5.a(str).f(str2).a(this.f59639b.i()).d(str3);
            if (str4 == null) {
                str4 = this.f59638a.f60846b;
            }
            q5VarD.c(str4).b(this.f59640c);
        }
    }
}
