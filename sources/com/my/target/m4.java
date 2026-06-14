package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.models.ImageData;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f60128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f60129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f60130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f60131d = true;

    public m4(u uVar, j jVar, Context context) {
        this.f60128a = uVar;
        this.f60129b = jVar;
        this.f60130c = context;
    }

    public static m4 a(u uVar, j jVar, Context context) {
        return new m4(uVar, jVar, context);
    }

    public boolean a(JSONObject jSONObject, l4 l4Var, n nVar) {
        ImageData imageDataA;
        ImageData imageDataA2;
        this.f60131d = l4Var.J();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("portrait");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("landscape");
        if ((jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) && (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0)) {
            nVar.a(m.f60111p);
            a("No images in InterstitialAdImageBanner", "Required field", l4Var.r());
            return false;
        }
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && (imageDataA2 = a(jSONObjectOptJSONObject, l4Var.r())) != null) {
                    l4Var.e(imageDataA2);
                }
            }
        }
        if (jSONArrayOptJSONArray2 != null) {
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i11);
                if (jSONObjectOptJSONObject2 != null && (imageDataA = a(jSONObjectOptJSONObject2, l4Var.r())) != null) {
                    l4Var.d(imageDataA);
                }
            }
        }
        boolean z10 = (l4Var.P().isEmpty() && l4Var.S().isEmpty()) ? false : true;
        if (z10) {
            nVar.a(m.f60111p);
        }
        return z10;
    }

    public final ImageData a(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString("imageLink");
        if (TextUtils.isEmpty(strOptString)) {
            a("InterstitialAdImageBanner no imageLink for image", "Required field", str);
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        if (iOptInt > 0 && iOptInt2 > 0) {
            return ImageData.newImageData(strOptString, iOptInt, iOptInt2);
        }
        a("InterstitialAdImageBanner  image has wrong dimensions, w = " + iOptInt + ", h = " + iOptInt2, "Required field", str);
        return null;
    }

    public final void a(String str, String str2, String str3) {
        if (this.f60131d) {
            String str4 = this.f60128a.f60845a;
            q5 q5VarD = q5.a(str2).f(str).a(this.f60129b.i()).d(str3);
            if (str4 == null) {
                str4 = this.f60128a.f60846b;
            }
            q5VarD.c(str4).b(this.f60130c);
        }
    }
}
