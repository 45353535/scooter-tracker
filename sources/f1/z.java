package f1;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.ironsource.N6;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import f1.bb;
import f1.bd;
import f1.ke;
import f1.z2;
import g1.a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class z extends bd {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f71682u = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f71683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n3 f71684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f71685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f71686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Cif f71687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wc f71688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public JSONObject f71689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public JSONArray f71690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f71691t;

    public interface a {
        void b(z zVar, JSONObject jSONObject);

        void c(z zVar, g1.a aVar);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(bd.c method, String endpoint, String path, n3 n3Var, r priority, String str, a aVar, Cif eventTracker, wc wcVar) {
        super(method, h1.b.f72867a.b(endpoint, path), priority, null);
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f71683l = path;
        this.f71684m = n3Var;
        this.f71685n = str;
        this.f71686o = aVar;
        this.f71687p = eventTracker;
        this.f71688q = wcVar;
        this.f71689r = new JSONObject();
    }

    public final String A() {
        cd cdVar = cd.f69528a;
        String strA = cdVar.a();
        int[] iArrB = cdVar.b();
        JSONObject jSONObject = new JSONObject();
        if (strA.length() > 0 && iArrB != null) {
            if (!(iArrB.length == 0)) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 : iArrB) {
                        jSONArray.put(i10);
                    }
                    jSONObject.put("exchangeMode", 2);
                    jSONObject.put("bidFloor", 0.01d);
                    jSONObject.put("code", strA);
                    jSONObject.put("forceCreativeTypes", jSONArray);
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
        return jSONObject.toString();
    }

    public final JSONArray B() {
        return this.f71690s;
    }

    public final String C() {
        if (StringsKt.a0(this.f71683l, "/", false, 2, null)) {
            return this.f71683l;
        }
        return "/" + this.f71683l;
    }

    public final n3 D() {
        return this.f71684m;
    }

    public final String E() {
        return C();
    }

    @Override // f1.bd
    public qd a() {
        String strA;
        kf kfVarF;
        String strD;
        String strF;
        z();
        String string = this.f71689r.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        n3 n3Var = this.f71684m;
        String str = n3Var != null ? n3Var.f70522h : null;
        if (str == null) {
            str = "";
        }
        String str2 = n3Var != null ? n3Var.f70523i : null;
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str3 = String.format(Locale.US, "%s %s\n%s\n%s", Arrays.copyOf(new Object[]{h(), E(), str2, string}, 4));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        String strA2 = j6.a(str3);
        HashMap map = new HashMap();
        map.put("Accept", D5.L);
        map.put("X-Chartboost-Client", g3.c());
        map.put("X-Chartboost-API", "9.10.2");
        map.put("X-Chartboost-App", str);
        map.put("X-Chartboost-Signature", strA2);
        wc wcVar = this.f71688q;
        if (wcVar != null && (strF = wcVar.f()) != null) {
            map.put("x-monetization-session-id", strF);
        }
        n3 n3Var2 = this.f71684m;
        if (n3Var2 != null && (kfVarF = n3Var2.f()) != null && (strD = kfVarF.d()) != null) {
            map.put("x-monetization-idfv", strD);
        }
        map.put("x-monetization-sdk-version", "9.10.2");
        if (h8.f70006a.g()) {
            String strC = h8.c();
            String str4 = strC.length() > 0 ? strC : null;
            if (str4 != null) {
                map.put("X-Chartboost-Test", str4);
            }
            String strA3 = h8.a();
            if (strA3 != null) {
                map.put("X-Chartboost-Test", strA3);
            }
        }
        if (b1.c.f5787a.a() && (strA = A()) != null && strA.length() != 0) {
            map.put("X-Chartboost-DspDemoApp", strA);
        }
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new qd(map, bytes, D5.L);
    }

    @Override // f1.bd
    public ke b(ef efVar) {
        byte[] bArrA;
        try {
            if (efVar == null || (bArrA = efVar.a()) == null) {
                bArrA = new byte[0];
            }
            JSONObject jSONObject = new JSONObject(new String(bArrA, Charsets.UTF_8));
            String strC = C();
            Integer numValueOf = efVar != null ? Integer.valueOf(efVar.b()) : null;
            eg.n("Request " + strC + " succeeded. Response code: " + numValueOf + ", body: " + jSONObject.toString(4), null);
            if (this.f71691t) {
                int iOptInt = jSONObject.optInt("status");
                String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
                if (iOptInt == 404) {
                    Intrinsics.checkNotNull(strOptString);
                    return q(strOptString);
                }
                if (iOptInt < 200 || iOptInt > 299) {
                    eg.i("Request failed due to status code " + iOptInt + " in message", null);
                    Intrinsics.checkNotNull(strOptString);
                    return k(iOptInt, strOptString);
                }
            }
            return ke.f70267c.b(jSONObject);
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            y(message);
            eg.i("parseServerResponse", e10);
            return o(e10);
        }
    }

    @Override // f1.bd
    public void c(g1.a aVar, ef efVar) {
        if (aVar == null) {
            return;
        }
        eg.n("Request failure: " + j() + " status: " + aVar.d(), null);
        a aVar2 = this.f71686o;
        if (aVar2 != null) {
            aVar2.c(this, aVar);
        }
        r(efVar, aVar);
    }

    public final ke k(int i10, String str) {
        JSONObject jSONObjectX = x(i10, str);
        ke.a aVar = ke.f70267c;
        a.c cVar = a.c.f72145h;
        String string = jSONObjectX.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return aVar.a(new g1.a(cVar, string));
    }

    public final ke o(Exception exc) {
        ke.a aVar = ke.f70267c;
        a.c cVar = a.c.f72139b;
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        return aVar.a(new g1.a(cVar, localizedMessage));
    }

    public final ke q(String str) {
        JSONObject jSONObjectX = x(404, str);
        ke.a aVar = ke.f70267c;
        a.c cVar = a.c.f72144g;
        String string = jSONObjectX.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return aVar.a(new g1.a(cVar, string));
    }

    public final void r(ef efVar, g1.a aVar) {
        String string;
        String strD;
        a.d dVarH;
        bb.a aVarA = bb.a(D5.f40571r, C());
        String str = "None";
        bb.a aVarA2 = bb.a("statuscode", efVar == null ? "None" : Integer.valueOf(efVar.b()));
        if (aVar == null || (dVarH = aVar.h()) == null || (string = dVarH.toString()) == null) {
            string = "None";
        }
        bb.a aVarA3 = bb.a("error", string);
        if (aVar != null && (strD = aVar.d()) != null) {
            str = strD;
        }
        JSONObject jSONObjectC = bb.c(aVarA, aVarA2, aVarA3, bb.a("errorDescription", str), bb.a("retryCount", 0));
        Intrinsics.checkNotNullExpressionValue(jSONObjectC, "jsonObject(...)");
        eg.d("sendToSessionLogs: " + jSONObjectC, null);
    }

    public final void s(String str, Object obj) {
        bb.d(this.f71689r, str, obj);
    }

    public final void t(JSONArray jSONArray) {
        this.f71690s = jSONArray;
    }

    public final void v(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.f71689r = jSONObject;
    }

    @Override // f1.bd
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void d(JSONObject jSONObject, ef efVar) {
        int iB = efVar != null ? efVar.b() : -1;
        eg.n("Request success: " + j() + " status: " + iB, null);
        a aVar = this.f71686o;
        if (aVar != null) {
            aVar.b(this, jSONObject);
        }
        r(efVar, null);
    }

    public final JSONObject x(int i10, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i10);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            return jSONObject;
        } catch (JSONException e10) {
            eg.i("Error creating JSON", e10);
            return jSONObject;
        }
    }

    public final void y(String str) {
        this.f71687p.mo4436e(w3.f71435m.a(z2.h.f71741d, str));
    }

    public void z() {
        me meVarA;
        ne neVarD;
        ne neVarD2;
        ne neVarD3;
        ne neVarD4;
        ne neVarD5;
        z8 z8VarJ;
        fg fgVarD;
        ne neVarD6;
        ne neVarD7;
        z8 z8VarJ2;
        b9 b9VarM;
        n3 n3Var = this.f71684m;
        s("app", n3Var != null ? n3Var.f70522h : null);
        n3 n3Var2 = this.f71684m;
        s("model", n3Var2 != null ? n3Var2.f70515a : null);
        n3 n3Var3 = this.f71684m;
        s(N6.f41422t, n3Var3 != null ? n3Var3.f70525k : null);
        n3 n3Var4 = this.f71684m;
        s(CommonUrlParts.DEVICE_TYPE, n3Var4 != null ? n3Var4.f70524j : null);
        n3 n3Var5 = this.f71684m;
        s("actual_device_type", n3Var5 != null ? n3Var5.f70526l : null);
        n3 n3Var6 = this.f71684m;
        s("os", n3Var6 != null ? n3Var6.f70516b : null);
        n3 n3Var7 = this.f71684m;
        s("country", n3Var7 != null ? n3Var7.f70517c : null);
        n3 n3Var8 = this.f71684m;
        s("language", n3Var8 != null ? n3Var8.f70518d : null);
        n3 n3Var9 = this.f71684m;
        s("sdk", n3Var9 != null ? n3Var9.f70521g : null);
        s("user_agent", ld.f70416c.a());
        n3 n3Var10 = this.f71684m;
        s("timestamp", (n3Var10 == null || (b9VarM = n3Var10.m()) == null) ? null : String.valueOf(TimeUnit.MILLISECONDS.toSeconds(b9VarM.a())));
        n3 n3Var11 = this.f71684m;
        s(com.taurusx.tax.g.b.f66095s, n3Var11 != null ? Integer.valueOf(n3Var11.l()) : null);
        n3 n3Var12 = this.f71684m;
        s("reachability", (n3Var12 == null || (z8VarJ2 = n3Var12.j()) == null) ? null : z8VarJ2.b());
        n3 n3Var13 = this.f71684m;
        s("is_portrait", (n3Var13 == null || (neVarD7 = n3Var13.d()) == null) ? null : Boolean.valueOf(neVarD7.k()));
        n3 n3Var14 = this.f71684m;
        s("scale", (n3Var14 == null || (neVarD6 = n3Var14.d()) == null) ? null : Float.valueOf(neVarD6.h()));
        n3 n3Var15 = this.f71684m;
        s("bundle", n3Var15 != null ? n3Var15.f70519e : null);
        n3 n3Var16 = this.f71684m;
        s("bundle_id", n3Var16 != null ? n3Var16.f70520f : null);
        n3 n3Var17 = this.f71684m;
        s(N6.Q0, n3Var17 != null ? n3Var17.f70527m : null);
        n3 n3Var18 = this.f71684m;
        l7 l7VarG = n3Var18 != null ? n3Var18.g() : null;
        if (l7VarG != null) {
            s("mediation", l7VarG.c());
            s("mediation_version", l7VarG.b());
            s("adapter_version", l7VarG.a());
        }
        n3 n3Var19 = this.f71684m;
        s("timezone", n3Var19 != null ? n3Var19.f70529o : null);
        n3 n3Var20 = this.f71684m;
        s(D5.f40558e, (n3Var20 == null || (z8VarJ = n3Var20.j()) == null || (fgVarD = z8VarJ.d()) == null) ? null : Integer.valueOf(fgVarD.h()));
        n3 n3Var21 = this.f71684m;
        s("dw", (n3Var21 == null || (neVarD5 = n3Var21.d()) == null) ? null : Integer.valueOf(neVarD5.c()));
        n3 n3Var22 = this.f71684m;
        s("dh", (n3Var22 == null || (neVarD4 = n3Var22.d()) == null) ? null : Integer.valueOf(neVarD4.a()));
        n3 n3Var23 = this.f71684m;
        s("dpi", (n3Var23 == null || (neVarD3 = n3Var23.d()) == null) ? null : neVarD3.d());
        n3 n3Var24 = this.f71684m;
        s(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, (n3Var24 == null || (neVarD2 = n3Var24.d()) == null) ? null : Integer.valueOf(neVarD2.j()));
        n3 n3Var25 = this.f71684m;
        s("h", (n3Var25 == null || (neVarD = n3Var25.d()) == null) ? null : Integer.valueOf(neVarD.e()));
        s("commit_hash", "09decf9845eb8f00ac06b030676751feddd00887");
        n3 n3Var26 = this.f71684m;
        kf kfVarF = n3Var26 != null ? n3Var26.f() : null;
        s("identity", kfVarF != null ? kfVarF.b() : null);
        s("instance_id", kfVarF != null ? kfVarF.c() : null);
        f6 f6VarF = kfVarF != null ? kfVarF.f() : null;
        if (f6VarF != f6.f69801c) {
            s(CommonUrlParts.LIMIT_AD_TRACKING, Boolean.valueOf(f6VarF == f6.f69803e));
        }
        s("appsetidscope", kfVarF != null ? kfVarF.e() : null);
        n3 n3Var27 = this.f71684m;
        v0 v0VarI = n3Var27 != null ? n3Var27.i() : null;
        Object objH = v0VarI != null ? v0VarI.h() : null;
        if (objH != null) {
            s(C4240b4.j.f42669b0, objH);
        }
        s("pidatauseconsent", v0VarI != null ? v0VarI.f() : null);
        n3 n3Var28 = this.f71684m;
        String strA = (n3Var28 == null || (meVarA = n3Var28.a()) == null) ? null : meVarA.a();
        if (!s3.d().c(strA)) {
            s("config_variant", strA);
        }
        JSONObject jSONObjectG = v0VarI != null ? v0VarI.g() : null;
        String strB = v0VarI != null ? v0VarI.b() : null;
        String strA2 = v0VarI != null ? v0VarI.a() : null;
        if (jSONObjectG != null) {
            try {
                jSONObjectG.put(EidRequestBuilder.REQUEST_FIELD_GPP, strB);
                jSONObjectG.put("gpp_sid", strA2);
            } catch (JSONException e10) {
                eg.i("Failed to add GPP and/or GPP SID to request body", e10);
            }
        }
        s("privacy", jSONObjectG);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(String endpoint, String path, n3 n3Var, r priority, a aVar, Cif eventTracker, wc wcVar) {
        this(bd.c.f69469c, endpoint, path, n3Var, priority, (String) null, aVar, eventTracker, wcVar);
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
    }

    public /* synthetic */ z(String str, String str2, n3 n3Var, r rVar, a aVar, Cif cif, wc wcVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, n3Var, rVar, aVar, cif, (i10 & 64) != 0 ? null : wcVar);
    }
}
