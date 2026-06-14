package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.my.target.common.models.ImageData;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f59792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f59793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f59794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f59795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59796e = true;

    public h1(u uVar, j jVar, int i10, Context context) {
        this.f59792a = uVar;
        this.f59793b = jVar;
        this.f59794c = context;
        g1 g1VarA = g1.a(uVar, jVar, context);
        this.f59795d = g1VarA;
        g1VarA.a(i10);
    }

    public k1 a(JSONObject jSONObject, String str) {
        k1 k1VarV = k1.V();
        this.f59795d.a(jSONObject, k1VarV);
        if (k1VarV.G() == 0 || k1VarV.p() == 0) {
            a("Required field", "Unable to add companion banner with width " + k1VarV.G() + " and height " + k1VarV.p(), str);
            return null;
        }
        k1VarV.f(jSONObject.optInt("assetWidth"));
        k1VarV.e(jSONObject.optInt("assetHeight"));
        k1VarV.h(jSONObject.optInt("expandedWidth"));
        k1VarV.g(jSONObject.optInt("expandedHeight"));
        k1VarV.y(jSONObject.optString("staticResource"));
        k1VarV.w(jSONObject.optString("iframeResource"));
        k1VarV.v(jSONObject.optString("htmlResource"));
        k1VarV.u(jSONObject.optString("apiFramework"));
        k1VarV.t(jSONObject.optString(com.taurusx.tax.f.c.f65999g));
        String strOptString = jSONObject.optString(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD);
        if (!TextUtils.isEmpty(strOptString)) {
            if (!"all".equals(strOptString) && !"any".equals(strOptString) && !"none".equals(strOptString)) {
                a("Bad value", "Wrong companion required attribute:" + strOptString, str);
                return k1VarV;
            }
            k1VarV.x(strOptString);
        }
        return k1VarV;
    }

    public void b(JSONObject jSONObject, k0 k0Var) {
        float fY = this.f59792a.y();
        if (fY < 0.0f && jSONObject.has("point")) {
            fY = (float) jSONObject.optDouble("point");
            if (fY < 0.0f) {
                a("Bad value", "Wrong value " + fY + " for point", k0Var.r());
            }
        }
        float fZ = this.f59792a.z();
        if (fZ < 0.0f && jSONObject.has("pointP")) {
            fZ = (float) jSONObject.optDouble("pointP");
            if (fZ < 0.0f) {
                a("Bad value", "Wrong value " + fZ + " for pointP", k0Var.r());
            }
        }
        if (fY < 0.0f && fZ < 0.0f) {
            fY = -1.0f;
            fZ = -1.0f;
        }
        k0Var.d(fY);
        k0Var.e(fZ);
    }

    public void c(JSONObject jSONObject, k0 k0Var) {
        k1 k1VarA;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("companionAds");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null && (k1VarA = a(jSONObjectOptJSONObject, k0Var.r())) != null) {
                k0Var.a(k1VarA);
            }
        }
    }

    public o1 d(JSONObject jSONObject, k0 k0Var) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            gb.a("CommonVideoParser: CTA button hasn't button link");
            a("Required field", "CTA button hasn't button link", k0Var.r());
            return null;
        }
        String strOptString2 = jSONObject.optString("buttonText");
        if (TextUtils.isEmpty(strOptString2)) {
            gb.a("CommonVideoParser: CTA button hasn't button link text");
            a("Required field", "CTA button hasn't button link text", k0Var.r());
            return null;
        }
        String strOptString3 = jSONObject.optString("additionalText");
        if (TextUtils.isEmpty(strOptString3)) {
            gb.a("CommonVideoParser: CTA button hasn't text");
        }
        int iA = m5.a(jSONObject, "buttonColor", Integer.MAX_VALUE);
        if (iA == Integer.MAX_VALUE) {
            gb.a("CommonVideoParser: CTA button hasn't button color");
        }
        int iA2 = m5.a(jSONObject, "buttonTextColor", Integer.MAX_VALUE);
        if (iA2 == Integer.MAX_VALUE) {
            gb.a("CommonVideoParser: CTA button hasn't button text color");
        }
        return o1.a(strOptString3, strOptString, strOptString2, iA == Integer.MAX_VALUE ? null : Integer.valueOf(iA), iA2 != Integer.MAX_VALUE ? Integer.valueOf(iA2) : null, (!jSONObject.has("icon") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("icon")) == null) ? null : e(jSONObjectOptJSONObject, k0Var));
    }

    public final ImageData e(JSONObject jSONObject, k0 k0Var) {
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            gb.a("CommonVideoParser: PostView background image hasn't url");
            a("Required field", "PostView background image hasn't url", k0Var.r());
            return null;
        }
        int iOptInt = jSONObject.optInt("width", -1);
        if (iOptInt < 0) {
            gb.a("CommonVideoParser: PostView background image hasn't width");
            a("Required field", "PostView background image hasn't width", k0Var.r());
            return null;
        }
        int iOptInt2 = jSONObject.optInt("height", -1);
        if (iOptInt2 >= 0) {
            return ImageData.newImageData(strOptString, iOptInt, iOptInt2);
        }
        gb.a("CommonVideoParser: PostView background image hasn't height");
        a("Required field", "PostView background image hasn't height", k0Var.r());
        return null;
    }

    public boolean f(JSONObject jSONObject, k0 k0Var) {
        this.f59795d.a(jSONObject, k0Var);
        this.f59796e = k0Var.J();
        if (!"statistics".equals(k0Var.C())) {
            return false;
        }
        b(jSONObject, k0Var);
        return true;
    }

    public u8 g(JSONObject jSONObject, k0 k0Var) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString = jSONObject.optString("text");
        if (TextUtils.isEmpty(strOptString)) {
            gb.a("CommonVideoParser: PostView hasn't text");
        }
        ImageData imageDataE = (!jSONObject.has("backgroundImage") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("backgroundImage")) == null) ? null : e(jSONObjectOptJSONObject, k0Var);
        if (imageDataE == null) {
            gb.a("CommonVideoParser: PostView hasn't backgroundImage");
        }
        if (TextUtils.isEmpty(strOptString) && imageDataE == null) {
            gb.a("CommonVideoParser: PostView Text or Background Image should exist but both are empty");
            a("Bad value", "PostView missing the text and background image. At least one of them should exist", k0Var.r());
            return null;
        }
        boolean zOptBoolean = jSONObject.optBoolean("pauseOnHide", false);
        int iA = m5.a(jSONObject, "overlay", Integer.MAX_VALUE);
        if (iA == Integer.MAX_VALUE) {
            gb.a("CommonVideoParser: PostView hasn't overlay");
        }
        double dOptDouble = jSONObject.optDouble("duration", 3.0d);
        return u8.a(strOptString, dOptDouble >= 0.001d ? dOptDouble : 3.0d, zOptBoolean, iA != Integer.MAX_VALUE ? Integer.valueOf(iA) : null, imageDataE);
    }

    public fa h(JSONObject jSONObject, k0 k0Var) {
        int iOptInt;
        String strOptString = jSONObject.optString("src");
        if (TextUtils.isEmpty(strOptString)) {
            gb.a("CommonVideoParser: encoded shoppable source is empty or null");
            return null;
        }
        try {
            String str = new String(Base64.decode(strOptString, 0));
            int i10 = 2;
            if (jSONObject.has("interactionTimeout")) {
                iOptInt = jSONObject.optInt("interactionTimeout");
            } else {
                a("Bad value", "Shoppable banner hasn't interactionTimeout", k0Var.r());
                iOptInt = 2;
            }
            if (iOptInt < 0) {
                a("Bad value", "Shoppable banner has invalid interactionTimeout", k0Var.r());
            } else {
                i10 = iOptInt;
            }
            fa faVarA = fa.a(str, (long) (Math.min(i10, k0Var.o()) * 1000.0f));
            this.f59795d.a(jSONObject, faVarA);
            return faVarA;
        } catch (Throwable th2) {
            gb.a("CommonVideoParser: shoppable source parsing is ended with exception - " + th2);
            a("Bad value", "Shoppable banner has invalid or empty source", k0Var.r());
            return null;
        }
    }

    public void a(JSONObject jSONObject, k0 k0Var) {
        b(jSONObject, k0Var);
        Boolean boolD = this.f59792a.d();
        k0Var.e(boolD != null ? boolD.booleanValue() : jSONObject.optBoolean("allowClose", k0Var.a0()));
        Boolean boolF = this.f59792a.f();
        k0Var.f(boolF != null ? boolF.booleanValue() : jSONObject.optBoolean("hasPause", k0Var.b0()));
        Boolean boolG = this.f59792a.g();
        k0Var.g(boolG != null ? boolG.booleanValue() : jSONObject.optBoolean("allowReplay", k0Var.c0()));
        float fE = this.f59792a.e();
        if (fE < 0.0f) {
            fE = (float) jSONObject.optDouble("allowCloseDelay", k0Var.M());
        }
        k0Var.c(fE);
    }

    public void a(String str, String str2, String str3) {
        if (this.f59796e) {
            String str4 = this.f59792a.f60845a;
            q5 q5VarD = q5.a(str).f(str2).a(this.f59793b.i()).d(str3);
            if (str4 == null) {
                str4 = this.f59792a.f60846b;
            }
            q5VarD.c(str4).b(this.f59794c);
        }
    }
}
