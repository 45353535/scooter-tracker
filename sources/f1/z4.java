package f1;

import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.ironsource.N6;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import f1.bd;
import f1.z;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class z4 extends z {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final JSONObject f71769v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final JSONObject f71770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final JSONObject f71771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final JSONObject f71772y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final JSONObject f71773z;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71774a;

        static {
            int[] iArr = new int[f6.values().length];
            try {
                iArr[f6.f69803e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f6.f69802d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f71774a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(bd.c method, String host, String path, n3 requestBodyFields, r priority, String str, z.a aVar, Cif eventTracker, wc session) {
        super(method, host, path, requestBodyFields, priority, str, aVar, eventTracker, session);
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBodyFields, "requestBodyFields");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f71769v = new JSONObject();
        this.f71770w = new JSONObject();
        this.f71771x = new JSONObject();
        this.f71772y = new JSONObject();
        this.f71773z = new JSONObject();
    }

    public final void F(v0 v0Var) {
        String strH = v0Var.h();
        if (strH != null) {
            bb.d(this.f71771x, C4240b4.j.f42669b0, strH);
        }
        bb.d(this.f71771x, "pidatauseconsent", v0Var.f());
        JSONObject jSONObjectG = v0Var.g();
        if (jSONObjectG != null) {
            try {
                jSONObjectG.put(EidRequestBuilder.REQUEST_FIELD_GPP, v0Var.b());
                jSONObjectG.put("gpp_sid", v0Var.a());
            } catch (JSONException e10) {
                eg.i("Failed to add GPP and/or GPP SID to request body", e10);
            }
            bb.d(this.f71771x, "privacy", jSONObjectG);
        }
    }

    public final void G(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        bb.d(this.f71772y, key, obj);
        s("ad", this.f71772y);
    }

    public final void H(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        bb.d(this.f71769v, key, obj);
        s("sdk", this.f71769v);
    }

    public final void I() {
        JSONObject jSONObject = this.f71772y;
        n3 n3VarD = D();
        bb.d(jSONObject, com.taurusx.tax.g.b.f66095s, n3VarD != null ? Integer.valueOf(n3VarD.l()) : null);
        if (this.f71772y.isNull(Reporting.EventType.CACHE)) {
            bb.d(this.f71772y, Reporting.EventType.CACHE, Boolean.FALSE);
        }
        if (this.f71772y.isNull("amount")) {
            bb.d(this.f71772y, "amount", 0);
        }
        if (this.f71772y.isNull("retry_count")) {
            bb.d(this.f71772y, "retry_count", 0);
        }
        if (this.f71772y.isNull("location")) {
            bb.d(this.f71772y, "location", "");
        }
        s("ad", this.f71772y);
    }

    public final void J() {
        JSONObject jSONObject = this.f71770w;
        n3 n3VarD = D();
        bb.d(jSONObject, "app", n3VarD != null ? n3VarD.f70522h : null);
        JSONObject jSONObject2 = this.f71770w;
        n3 n3VarD2 = D();
        bb.d(jSONObject2, "bundle", n3VarD2 != null ? n3VarD2.f70519e : null);
        JSONObject jSONObject3 = this.f71770w;
        n3 n3VarD3 = D();
        bb.d(jSONObject3, "bundle_id", n3VarD3 != null ? n3VarD3.f70520f : null);
        bb.d(this.f71770w, "session_id", "");
        bb.d(this.f71770w, "ui", -1);
        bb.d(this.f71770w, "test_mode", Boolean.FALSE);
        s("app", this.f71770w);
    }

    public final void K() {
        bb.d(this.f71773z, "app", bb.c(bb.a(POBCoreNativeConstants.NATIVE_VERSION, yb.f71635a.d())));
        s("bidrequest", this.f71773z);
    }

    public final void L() {
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
        n3 n3VarD = D();
        JSONObject jSONObject = n3VarD != null ? n3VarD.f70527m : null;
        bb.d(this.f71771x, N6.Q0, bb.c(bb.a("carrier_name", jSONObject != null ? jSONObject.optString("carrier-name") : null), bb.a("mobile_country_code", jSONObject != null ? jSONObject.optString("mobile-country-code") : null), bb.a("mobile_network_code", jSONObject != null ? jSONObject.optString("mobile-network-code") : null), bb.a("iso_country_code", jSONObject != null ? jSONObject.optString("iso-country-code") : null), bb.a("phone_type", jSONObject != null ? Integer.valueOf(jSONObject.optInt("phone-type")) : null)));
        JSONObject jSONObject2 = this.f71771x;
        n3 n3VarD2 = D();
        bb.d(jSONObject2, "model", n3VarD2 != null ? n3VarD2.f70515a : null);
        JSONObject jSONObject3 = this.f71771x;
        n3 n3VarD3 = D();
        bb.d(jSONObject3, N6.f41422t, n3VarD3 != null ? n3VarD3.f70525k : null);
        JSONObject jSONObject4 = this.f71771x;
        n3 n3VarD4 = D();
        bb.d(jSONObject4, CommonUrlParts.DEVICE_TYPE, n3VarD4 != null ? n3VarD4.f70524j : null);
        JSONObject jSONObject5 = this.f71771x;
        n3 n3VarD5 = D();
        bb.d(jSONObject5, "actual_device_type", n3VarD5 != null ? n3VarD5.f70526l : null);
        JSONObject jSONObject6 = this.f71771x;
        n3 n3VarD6 = D();
        bb.d(jSONObject6, "os", n3VarD6 != null ? n3VarD6.f70516b : null);
        JSONObject jSONObject7 = this.f71771x;
        n3 n3VarD7 = D();
        bb.d(jSONObject7, "country", n3VarD7 != null ? n3VarD7.f70517c : null);
        JSONObject jSONObject8 = this.f71771x;
        n3 n3VarD8 = D();
        bb.d(jSONObject8, "language", n3VarD8 != null ? n3VarD8.f70518d : null);
        n3 n3VarD9 = D();
        bb.d(this.f71771x, "timestamp", (n3VarD9 == null || (b9VarM = n3VarD9.m()) == null) ? null : String.valueOf(TimeUnit.MILLISECONDS.toSeconds(b9VarM.a())));
        JSONObject jSONObject9 = this.f71771x;
        n3 n3VarD10 = D();
        bb.d(jSONObject9, "reachability", (n3VarD10 == null || (z8VarJ2 = n3VarD10.j()) == null) ? null : z8VarJ2.b());
        JSONObject jSONObject10 = this.f71771x;
        n3 n3VarD11 = D();
        bb.d(jSONObject10, "is_portrait", (n3VarD11 == null || (neVarD7 = n3VarD11.d()) == null) ? null : Boolean.valueOf(neVarD7.k()));
        JSONObject jSONObject11 = this.f71771x;
        n3 n3VarD12 = D();
        bb.d(jSONObject11, "scale", (n3VarD12 == null || (neVarD6 = n3VarD12.d()) == null) ? null : Float.valueOf(neVarD6.h()));
        JSONObject jSONObject12 = this.f71771x;
        n3 n3VarD13 = D();
        bb.d(jSONObject12, "timezone", n3VarD13 != null ? n3VarD13.f70529o : null);
        JSONObject jSONObject13 = this.f71771x;
        n3 n3VarD14 = D();
        bb.d(jSONObject13, D5.f40558e, (n3VarD14 == null || (z8VarJ = n3VarD14.j()) == null || (fgVarD = z8VarJ.d()) == null) ? null : Integer.valueOf(fgVarD.h()));
        JSONObject jSONObject14 = this.f71771x;
        n3 n3VarD15 = D();
        bb.d(jSONObject14, "dw", (n3VarD15 == null || (neVarD5 = n3VarD15.d()) == null) ? null : Integer.valueOf(neVarD5.c()));
        JSONObject jSONObject15 = this.f71771x;
        n3 n3VarD16 = D();
        bb.d(jSONObject15, "dh", (n3VarD16 == null || (neVarD4 = n3VarD16.d()) == null) ? null : Integer.valueOf(neVarD4.a()));
        JSONObject jSONObject16 = this.f71771x;
        n3 n3VarD17 = D();
        bb.d(jSONObject16, "dpi", (n3VarD17 == null || (neVarD3 = n3VarD17.d()) == null) ? null : neVarD3.d());
        JSONObject jSONObject17 = this.f71771x;
        n3 n3VarD18 = D();
        bb.d(jSONObject17, POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, (n3VarD18 == null || (neVarD2 = n3VarD18.d()) == null) ? null : Integer.valueOf(neVarD2.j()));
        JSONObject jSONObject18 = this.f71771x;
        n3 n3VarD19 = D();
        bb.d(jSONObject18, "h", (n3VarD19 == null || (neVarD = n3VarD19.d()) == null) ? null : Integer.valueOf(neVarD.e()));
        bb.d(this.f71771x, "user_agent", ld.f70416c.a());
        bb.d(this.f71771x, "device_family", "");
        bb.d(this.f71771x, "retina", Boolean.FALSE);
        M();
        n3 n3VarD20 = D();
        v0 v0Var = n3VarD20 != null ? n3VarD20.f70532r : null;
        if (v0Var != null) {
            F(v0Var);
        }
        s(C4240b4.i.G, this.f71771x);
    }

    public final void M() {
        n3 n3VarD = D();
        kf kfVarF = n3VarD != null ? n3VarD.f() : null;
        if (kfVarF == null) {
            eg.i("Missing identity in the CB SDK. This will affect ads performance.", null);
            return;
        }
        bb.d(this.f71771x, "identity", kfVarF.b());
        int i10 = a.f71774a[kfVarF.f().ordinal()];
        if (i10 == 1) {
            bb.d(this.f71771x, CommonUrlParts.LIMIT_AD_TRACKING, Boolean.TRUE);
        } else if (i10 == 2) {
            bb.d(this.f71771x, CommonUrlParts.LIMIT_AD_TRACKING, Boolean.FALSE);
        }
        Integer numE = kfVarF.e();
        if (numE != null) {
            bb.d(this.f71771x, "appsetidscope", Integer.valueOf(numE.intValue()));
        }
    }

    public final void N() {
        me meVarA;
        l7 l7VarG;
        JSONObject jSONObject = this.f71769v;
        n3 n3VarD = D();
        String strA = null;
        bb.d(jSONObject, "sdk", n3VarD != null ? n3VarD.f70521g : null);
        n3 n3VarD2 = D();
        if (n3VarD2 != null && (l7VarG = n3VarD2.g()) != null) {
            bb.d(this.f71769v, "mediation", l7VarG.c());
            bb.d(this.f71769v, "mediation_version", l7VarG.b());
            bb.d(this.f71769v, "adapter_version", l7VarG.a());
        }
        bb.d(this.f71769v, "commit_hash", "09decf9845eb8f00ac06b030676751feddd00887");
        n3 n3VarD3 = D();
        if (n3VarD3 != null && (meVarA = n3VarD3.a()) != null) {
            strA = meVarA.a();
        }
        if (!s3.d().c(strA)) {
            bb.d(this.f71769v, "config_variant", strA);
        }
        s("sdk", this.f71769v);
    }

    @Override // f1.z
    public void z() {
        J();
        K();
        L();
        N();
        I();
    }
}
