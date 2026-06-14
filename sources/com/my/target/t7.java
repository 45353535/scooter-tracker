package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.models.ImageData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7 f60841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f60842b;

    public t7(y7 y7Var, u uVar, j jVar, Context context) {
        this.f60841a = y7Var;
        this.f60842b = g1.a(uVar, jVar, context);
    }

    public static t7 a(y7 y7Var, u uVar, j jVar, Context context) {
        return new t7(y7Var, uVar, jVar, context);
    }

    public void a(JSONObject jSONObject, s7 s7Var) {
        this.f60842b.a(jSONObject, s7Var);
        s7Var.g(jSONObject.optBoolean("hasNotification", s7Var.b0()));
        s7Var.f(jSONObject.optBoolean("Banner", s7Var.a0()));
        s7Var.j(jSONObject.optBoolean("RequireCategoryHighlight", s7Var.e0()));
        s7Var.h(jSONObject.optBoolean("ItemHighlight", s7Var.c0()));
        s7Var.i(jSONObject.optBoolean("Main", s7Var.d0()));
        s7Var.k(jSONObject.optBoolean("RequireWifi", s7Var.f0()));
        s7Var.l(jSONObject.optBoolean("subitem", s7Var.g0()));
        s7Var.t(jSONObject.optString("bubble_id", s7Var.M()));
        s7Var.u(jSONObject.optString("labelType", s7Var.V()));
        s7Var.v(jSONObject.optString("status", s7Var.X()));
        s7Var.h(jSONObject.optInt("mrgs_id"));
        s7Var.e(jSONObject.optInt("coins"));
        s7Var.f(m5.a(jSONObject, "coins_icon_bgcolor", s7Var.P()));
        s7Var.g(m5.a(jSONObject, "coins_icon_textcolor", s7Var.Q()));
        String strOptString = jSONObject.optString("icon_hd");
        if (!TextUtils.isEmpty(strOptString)) {
            s7Var.a(ImageData.newImageData(strOptString));
        }
        String strOptString2 = jSONObject.optString("coins_icon_hd");
        if (!TextUtils.isEmpty(strOptString2)) {
            s7Var.d(ImageData.newImageData(strOptString2));
        }
        String strOptString3 = jSONObject.optString("cross_notif_icon_hd");
        if (!TextUtils.isEmpty(strOptString3)) {
            s7Var.e(ImageData.newImageData(strOptString3));
        }
        String strD = this.f60841a.d();
        if (!TextUtils.isEmpty(strD)) {
            s7Var.c(ImageData.newImageData(strD));
        }
        String strE = this.f60841a.e();
        if (!TextUtils.isEmpty(strE)) {
            s7Var.f(ImageData.newImageData(strE));
        }
        String strH = this.f60841a.h();
        if (!TextUtils.isEmpty(strH)) {
            s7Var.h(ImageData.newImageData(strH));
        }
        String strX = s7Var.X();
        if (strX != null) {
            String strA = this.f60841a.a(strX);
            if (!TextUtils.isEmpty(strA)) {
                s7Var.i(ImageData.newImageData(strA));
            }
        }
        String strG = this.f60841a.g();
        if (!s7Var.c0() || TextUtils.isEmpty(strG)) {
            return;
        }
        s7Var.g(ImageData.newImageData(strG));
    }
}
