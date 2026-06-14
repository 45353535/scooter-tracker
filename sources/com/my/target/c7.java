package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.target.common.models.ImageData;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f59380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f59381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f59382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f59383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f59384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f59385f = true;

    public c7(u uVar, j jVar, Context context) {
        this.f59380a = uVar;
        this.f59381b = jVar;
        this.f59382c = context;
        this.f59383d = g1.a(uVar, jVar, context);
    }

    public static c7 a(u uVar, j jVar, Context context) {
        return new c7(uVar, jVar, context);
    }

    public f7 b(JSONObject jSONObject, b7 b7Var, n nVar, i0 i0Var) {
        String strOptString = jSONObject.optString("type");
        if (!"html".equals(strOptString)) {
            gb.a("NativeAdBannerParser: NativeAdContent banner has type " + strOptString);
            i0Var.a("type").b(3007, strOptString);
            return null;
        }
        String strA = g1.a(jSONObject, nVar, i0Var);
        if (TextUtils.isEmpty(strA)) {
            a("Required field", "NativeAdContent has no source field");
            i0Var.a(3007, "unable to decode src/source property");
            return null;
        }
        f7 f7VarA = f7.a(b7Var, strA);
        this.f59383d.a(jSONObject, f7VarA, i0Var);
        return f7VarA;
    }

    public String[] a(JSONObject jSONObject, p pVar) {
        return this.f59383d.a(jSONObject, pVar);
    }

    public void a(JSONObject jSONObject, b7 b7Var, n nVar, i0 i0Var) {
        this.f59383d.a(jSONObject, b7Var, i0Var);
        this.f59385f = b7Var.J();
        this.f59384e = b7Var.r();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cards");
        i0 i0VarB = i0Var.a("cards").b();
        if (jSONArrayOptJSONArray != null && kb.d()) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                i0 i0VarB2 = i0VarB.b(i10);
                if (jSONObjectOptJSONObject != null) {
                    d7 d7VarA = a(jSONObjectOptJSONObject, b7Var, i0VarB2);
                    if (d7VarA != null) {
                        b7Var.a(d7VarA);
                    }
                } else {
                    i0VarB2.c(3007);
                }
            }
            return;
        }
        if (jSONObject.has("content")) {
            b7Var.t(jSONObject.optString("ctcText", b7Var.N()));
            String strOptString = jSONObject.optString("ctcIconLink");
            if (!TextUtils.isEmpty(strOptString)) {
                b7Var.c(ImageData.newImageData(strOptString));
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("content");
            if (jSONObjectOptJSONObject2 != null) {
                b7Var.a(b(jSONObjectOptJSONObject2, b7Var, nVar, i0Var.a("content").b()));
            }
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject3 != null) {
            s5 s5VarN0 = s5.n0();
            s5VarN0.k(b7Var.r());
            s5VarN0.c(b7Var.J());
            if (j1.a(this.f59380a, this.f59381b, this.f59382c).a(jSONObjectOptJSONObject3, s5VarN0, i0Var.a("video"))) {
                za zaVarX = s5VarN0.x();
                if (!zaVarX.c()) {
                    zaVarX.b(b7Var.x(), s5VarN0.o());
                }
                b7Var.a(s5VarN0);
            }
        }
    }

    public d7 a(JSONObject jSONObject, b7 b7Var, i0 i0Var) {
        d7 d7VarA = d7.a(b7Var);
        this.f59383d.a(jSONObject, d7VarA, i0Var);
        String strOptString = jSONObject.optString(FirebaseAnalytics.Param.DISCOUNT);
        if (TextUtils.isEmpty(strOptString)) {
            gb.a("NativeAdBannerParser: no discount value or the value is empty.");
        } else {
            d7VarA.u(strOptString);
        }
        String strOptString2 = jSONObject.optString("price");
        if (TextUtils.isEmpty(strOptString2)) {
            gb.a("NativeAdBannerParser: no price value or the value is empty.");
        } else {
            d7VarA.w(strOptString2);
        }
        String strOptString3 = jSONObject.optString("oldPrice");
        if (TextUtils.isEmpty(strOptString3)) {
            gb.a("NativeAdBannerParser: no oldPrice value or the value is empty.");
        } else {
            d7VarA.v(strOptString3);
        }
        String strOptString4 = jSONObject.optString("currency");
        if (TextUtils.isEmpty(strOptString4)) {
            gb.a("NativeAdBannerParser: no currency value or the value is empty.");
        } else {
            d7VarA.t(strOptString4);
        }
        if (TextUtils.isEmpty(d7VarA.B())) {
            a("Required field", "no tracking link in nativeAdCard");
            i0Var.a(3008, "required trackingLink is empty");
            return null;
        }
        if (d7VarA.s() == null) {
            a("Required field", "no image in nativeAdCard");
            i0Var.a(3008, "required image is empty");
            return null;
        }
        d7VarA.k(jSONObject.optString("cardID", d7VarA.r()));
        return d7VarA;
    }

    public final void a(String str, String str2) {
        if (this.f59385f) {
            String str3 = this.f59380a.f60845a;
            q5 q5VarD = q5.a(str).f(str2).a(this.f59381b.i()).d(this.f59384e);
            if (str3 == null) {
                str3 = this.f59380a.f60846b;
            }
            q5VarD.c(str3).b(this.f59382c);
        }
    }
}
