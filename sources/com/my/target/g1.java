package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.ironsource.C4240b4;
import com.my.target.common.models.ImageData;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.models.APIAsset;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f59683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f59684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f59685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final db f59686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f59687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f59688f = true;

    public g1(u uVar, j jVar, Context context) {
        this.f59684b = uVar;
        this.f59685c = jVar;
        this.f59683a = context;
        this.f59686d = db.a(uVar, jVar, context);
    }

    public static g1 a(u uVar, j jVar, Context context) {
        return new g1(uVar, jVar, context);
    }

    public final void b(String str, String str2) {
        if (this.f59688f) {
            String str3 = this.f59684b.f60845a;
            q5 q5VarD = q5.a(str).f(str2).a(this.f59685c.i()).d(this.f59687e);
            if (str3 == null) {
                str3 = this.f59684b.f60846b;
            }
            q5VarD.c(str3).b(this.f59683a);
        }
    }

    public static String a(JSONObject jSONObject, n nVar) {
        return a(jSONObject, nVar, i0.f59838d);
    }

    public static String a(JSONObject jSONObject, n nVar, i0 i0Var) {
        String strA = null;
        if (jSONObject.has("src") || jSONObject.has("source")) {
            String strOptString = jSONObject.optString("src", "");
            if (!TextUtils.isEmpty(strOptString) && (strA = y1.a(strOptString)) != null) {
                return strA;
            }
            String strOptString2 = jSONObject.optString("source", "");
            return !TextUtils.isEmpty(strOptString2) ? lb.a(strOptString2) : strA;
        }
        nVar.a(m.f60109n);
        i0Var.a("src").c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        i0Var.a("source").c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        return null;
    }

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder(str2);
            if (sb2.length() > 0) {
                Matcher matcher = Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*(\\\\?[\\\"\\'])mraid\\.js\\1[^>]*>\\s*<\\/script>\\n*", 2).matcher(str2);
                if (matcher.find()) {
                    int iStart = matcher.start();
                    sb2.delete(iStart, matcher.end());
                    sb2.insert(iStart, "<script src=\"" + str + "\"></script>");
                    return sb2.toString();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String[] a(org.json.JSONObject r5, com.my.target.p r6) {
        /*
            r4 = this;
            java.lang.String r0 = "bannerID"
            boolean r1 = r5.has(r0)
            r2 = 0
            if (r1 == 0) goto L1e
            java.lang.String r1 = r5.optString(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L28
            com.my.target.p r6 = r6.a(r0)
            r0 = 3007(0xbbf, float:4.214E-42)
            r6.a(r0)
        L1c:
            r1 = r2
            goto L28
        L1e:
            com.my.target.p r6 = r6.a(r0)
            r0 = 3006(0xbbe, float:4.212E-42)
            r6.a(r0)
            goto L1c
        L28:
            java.lang.String r6 = "impressionId"
            boolean r0 = r5.has(r6)
            if (r0 == 0) goto L34
            java.lang.String r2 = r5.optString(r6)
        L34:
            java.lang.String[] r5 = new java.lang.String[]{r1, r2}
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.g1.a(org.json.JSONObject, com.my.target.p):java.lang.String[]");
    }

    public void a(JSONObject jSONObject, b bVar) {
        a(jSONObject, bVar, i0.f59838d);
    }

    public void a(JSONObject jSONObject, b bVar, i0 i0Var) {
        boolean zOptBoolean;
        boolean zOptBoolean2;
        Boolean boolG = this.f59684b.G();
        if (boolG != null) {
            this.f59688f = boolG.booleanValue();
            this.f59686d.a(boolG);
            bVar.c(this.f59688f);
        } else if (jSONObject.has("logErrors")) {
            boolean zOptBoolean3 = jSONObject.optBoolean("logErrors", true);
            this.f59688f = zOptBoolean3;
            this.f59686d.a(Boolean.valueOf(zOptBoolean3));
            bVar.c(this.f59688f);
        }
        String strOptString = jSONObject.optString("id");
        this.f59687e = strOptString;
        if (TextUtils.isEmpty(strOptString)) {
            if (!jSONObject.has("bannerID") && i0Var.a()) {
                i0Var.a("bannerID").a(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
            }
            this.f59687e = jSONObject.optString("bannerID", bVar.r());
        } else {
            i0Var.a("id").c(3004);
        }
        bVar.k(this.f59687e);
        String strOptString2 = jSONObject.optString("type");
        if (!TextUtils.isEmpty(strOptString2)) {
            bVar.r(strOptString2);
        }
        bVar.d(jSONObject.optInt("width", bVar.G()));
        bVar.b(jSONObject.optInt("height", bVar.p()));
        String strOptString3 = jSONObject.optString("ageRestrictions");
        if (!TextUtils.isEmpty(strOptString3)) {
            bVar.b(strOptString3);
        } else if (i0Var.a()) {
            i0Var.a("ageRestrictions").c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        }
        String strOptString4 = jSONObject.optString(Constants.DEEPLINK);
        if (!TextUtils.isEmpty(strOptString4)) {
            bVar.g(strOptString4);
        }
        String strOptString5 = jSONObject.optString("trackingLink");
        if (!TextUtils.isEmpty(strOptString5)) {
            bVar.q(strOptString5);
        }
        String strOptString6 = jSONObject.optString("ctaLink");
        if (!TextUtils.isEmpty(strOptString6)) {
            bVar.e(strOptString6);
        }
        String strOptString7 = jSONObject.optString("bundle_id");
        if (!TextUtils.isEmpty(strOptString7)) {
            bVar.c(strOptString7);
        }
        String strOptString8 = jSONObject.optString("urlscheme");
        if (!TextUtils.isEmpty(strOptString8)) {
            bVar.s(strOptString8);
        }
        if (i0Var.a() && TextUtils.isEmpty(strOptString5) && TextUtils.isEmpty(strOptString6)) {
            i0Var.a("trackingLink").c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
            i0Var.a("ctaLink").c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        }
        Boolean boolX = this.f59684b.x();
        if (boolX != null) {
            zOptBoolean = boolX.booleanValue();
        } else {
            zOptBoolean = jSONObject.optBoolean("openInBrowser", bVar.K());
        }
        bVar.d(zOptBoolean);
        Boolean boolQ = this.f59684b.q();
        if (boolQ != null) {
            zOptBoolean2 = boolQ.booleanValue();
        } else {
            zOptBoolean2 = jSONObject.optBoolean("directLink", bVar.I());
        }
        bVar.b(zOptBoolean2);
        bVar.m(jSONObject.optString("paidType", bVar.v()));
        String strOptString9 = jSONObject.optString("navigationType");
        if (!TextUtils.isEmpty(strOptString9)) {
            if (Constants.DEEPLINK.equals(strOptString9)) {
                i0Var.a("navigationType").b(3005, "legacy value " + strOptString9);
                bVar.l("store");
            } else {
                bVar.l(strOptString9);
            }
        } else if (i0Var.a()) {
            i0Var.a("navigationType").c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        }
        String strA = n5.a(jSONObject, "storeType");
        bVar.n(strA);
        if (TextUtils.isEmpty(strA) && "store".equals(strOptString9)) {
            i0Var.a("storeType").c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        }
        String strOptString10 = jSONObject.optString("title");
        if (!TextUtils.isEmpty(strOptString10)) {
            bVar.p(strOptString10);
        } else if (i0Var.a()) {
            i0Var.a("title").c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        }
        String strOptString11 = jSONObject.optString("description");
        if (!TextUtils.isEmpty(strOptString11)) {
            bVar.h(strOptString11);
        }
        String strOptString12 = jSONObject.optString("disclaimer");
        if (!TextUtils.isEmpty(strOptString12)) {
            bVar.i(strOptString12);
        }
        if (jSONObject.has("disclaimer_id")) {
            bVar.a(a(jSONObject.optInt("disclaimer_id", -1), i0Var.a("disclaimer_id")));
        } else if (jSONObject.has("disclaimer")) {
            i0Var.a("disclaimer_id").b(AuthApiStatusCodes.AUTH_APP_CERT_ERROR, "has disclaimer, but has no disclaimer_id");
        }
        bVar.c(jSONObject.optInt(APIAsset.VOTES, bVar.F()));
        if (i0Var.a()) {
            if (!jSONObject.has(APIAsset.VOTES)) {
                i0Var.a(APIAsset.VOTES).c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
            } else {
                int iOptInt = jSONObject.optInt(APIAsset.VOTES);
                if (iOptInt <= 0) {
                    i0Var.a(APIAsset.VOTES).b(3007, Integer.toString(iOptInt));
                }
            }
        }
        String strOptString13 = jSONObject.optString("category");
        if (!TextUtils.isEmpty(strOptString13)) {
            bVar.d(strOptString13);
        }
        String strOptString14 = jSONObject.optString("subcategory");
        if (!TextUtils.isEmpty(strOptString14)) {
            bVar.o(strOptString14);
        }
        String strOptString15 = jSONObject.optString(C4240b4.j.D);
        if (!TextUtils.isEmpty(strOptString15)) {
            bVar.j(strOptString15);
        }
        bVar.a((float) jSONObject.optDouble("duration", bVar.o()));
        if (jSONObject.has("rating")) {
            float fOptDouble = (float) jSONObject.optDouble("rating", -1.0d);
            double d10 = fOptDouble;
            if (d10 <= 5.0d && d10 >= 0.0d) {
                bVar.b(fOptDouble);
            } else {
                b("Bad value", "unable to parse rating " + fOptDouble);
                i0Var.a("rating").b(3007, Float.toString(fOptDouble));
            }
        }
        boolean zHas = jSONObject.has("ctaText");
        bVar.f(jSONObject.optString("ctaText", bVar.i()));
        if (!TextUtils.isEmpty(strOptString6) && !zHas) {
            i0Var.a("ctaText").c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        }
        if (zHas && TextUtils.isEmpty(strOptString6) && TextUtils.isEmpty(strOptString5)) {
            i0Var.a("ctaText").b(3008, "ctaText is not empty, but ctaLink and trackingLink are empty");
        }
        String strOptString16 = jSONObject.optString("iconLink");
        int iOptInt2 = jSONObject.optInt("iconWidth");
        int iOptInt3 = jSONObject.optInt("iconHeight");
        if (!TextUtils.isEmpty(strOptString16)) {
            bVar.a(ImageData.newImageData(strOptString16, iOptInt2, iOptInt3));
        }
        if (i0Var.a()) {
            if (TextUtils.isEmpty(strOptString16)) {
                i0Var.a("iconLink").c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
            } else if (!lb.e(strOptString16)) {
                i0Var.a("iconLink").b(3007, strOptString16);
            }
        }
        String strOptString17 = jSONObject.optString("imageLink");
        int iOptInt4 = jSONObject.optInt("imageWidth");
        int iOptInt5 = jSONObject.optInt("imageHeight");
        if (!TextUtils.isEmpty(strOptString17)) {
            bVar.b(ImageData.newImageData(strOptString17, iOptInt4, iOptInt5));
        }
        int iN = this.f59684b.n();
        if (iN >= 0) {
            bVar.a(d1.a(iN));
        } else if (jSONObject.has("clickArea")) {
            int iOptInt6 = jSONObject.optInt("clickArea");
            if (iOptInt6 <= 0) {
                b("Bad value", "Bad ClickArea mask " + iOptInt6);
                i0Var.a("clickArea").b(3007, Integer.toString(iOptInt6));
            } else {
                bVar.a(d1.a(iOptInt6));
            }
        } else if (jSONObject.has("extendedClickArea")) {
            i0Var.a("extendedClickArea").c(3004);
            if (jSONObject.optBoolean("extendedClickArea", true)) {
                bVar.a(d1.f59449p);
            } else {
                bVar.a(d1.f59450q);
            }
        }
        String strOptString18 = jSONObject.optString("advertisingLabel", "");
        if (i0Var.a()) {
            if (!jSONObject.has("advertisingLabel")) {
                i0Var.a("advertisingLabel").c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
            } else if (TextUtils.isEmpty(strOptString18)) {
                i0Var.a("advertisingLabel").c(3007);
            }
        }
        bVar.a(strOptString18);
        c cVarA = this.f59684b.a();
        if (cVarA == null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adChoices");
            i0 i0VarA = i0Var.a("adChoices");
            if (jSONObjectOptJSONObject != null) {
                cVarA = h.a().a(jSONObjectOptJSONObject, this.f59687e, this.f59684b.f60845a, this.f59685c.i(), this.f59688f, i0VarA, this.f59683a);
                if (cVarA == null) {
                    i0VarA.b(3007, "adChoices element is not parsed");
                }
            } else if (i0VarA.a()) {
                i0VarA.c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
            }
        }
        bVar.a(cVarA);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("viewability");
        if (jSONObjectOptJSONObject2 != null) {
            i0 i0VarA2 = i0Var.a("viewability");
            xb xbVarE = bVar.E();
            if (jSONObjectOptJSONObject2.has("percent")) {
                int iOptInt7 = jSONObjectOptJSONObject2.optInt("percent");
                if (iOptInt7 >= 5 && iOptInt7 <= 100) {
                    xbVarE.c(iOptInt7 / 100.0f);
                } else {
                    b("Bad value", "invalid viewability percent " + iOptInt7);
                    i0VarA2.a("percent").a(3007, Integer.toString(iOptInt7));
                }
            }
            if (jSONObjectOptJSONObject2.has("rate")) {
                double dOptDouble = jSONObjectOptJSONObject2.optDouble("rate");
                if (dOptDouble >= 0.5d) {
                    xbVarE.b((float) dOptDouble);
                } else {
                    b("Bad value", "invalid viewability rate " + dOptDouble);
                    i0VarA2.a("rate").a(3007, Double.toString(dOptDouble));
                }
            }
            xbVarE.a((float) jSONObjectOptJSONObject2.optDouble("duration", xbVarE.a()));
            if (!jSONObjectOptJSONObject2.has("duration")) {
                i0VarA2.a("duration").c(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
            } else {
                float fOptDouble2 = (float) jSONObjectOptJSONObject2.optDouble("duration");
                if (fOptDouble2 <= 0.0d || Float.isNaN(fOptDouble2)) {
                    i0VarA2.a("duration").b(3007, Float.toString(fOptDouble2));
                }
            }
        }
        bVar.a(jSONObject.optBoolean("isAppInWhitelist", bVar.H()));
        bVar.a(a(this.f59684b.v(), jSONObject.optJSONObject("omdata")));
        this.f59686d.a(bVar.x(), jSONObject, this.f59687e, bVar.o(), i0Var);
    }

    public void a(int i10) {
        this.f59686d.a(i10);
    }

    public final int a(int i10, i0 i0Var) {
        if (i10 == 0 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) {
            return i10;
        }
        switch (i10) {
            case 8:
            case 9:
            case 10:
                return i10;
            default:
                b("Bad value", "Invalid disclaimerId");
                i0Var.a(3007, Integer.toString(i10));
                return 0;
        }
    }

    public final j8 a(j8 j8Var, JSONObject jSONObject) {
        return jSONObject == null ? j8Var : k8.a(this.f59685c, this.f59684b.f60846b, this.f59688f, this.f59683a).a(j8Var, jSONObject);
    }
}
