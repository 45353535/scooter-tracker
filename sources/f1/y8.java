package f1;

import android.os.Build;
import com.iab.omid.library.chartboost.adsession.Partner;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.ironsource.Fb;
import com.ironsource.N6;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import f1.bf;
import io.bidmachine.ProtoExtConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class y8 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Integer f71624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f71625k = Build.VERSION.RELEASE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f71626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f71627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONArray f71628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f71629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f71630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONObject f71631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n3 f71632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final re f71633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r4 f71634i;

    public y8(n3 n3Var, re reVar, r4 r4Var) {
        f71624j = n3Var.h();
        this.f71632g = n3Var;
        this.f71633h = reVar;
        this.f71634i = r4Var;
        this.f71627b = new JSONObject();
        this.f71628c = new JSONArray();
        this.f71629d = new JSONObject();
        this.f71630e = new JSONObject();
        this.f71631f = new JSONObject();
        this.f71626a = new JSONObject();
        r();
        o();
        p();
        n();
        q();
        s();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Object obj = JSONObject.NULL;
        bb.d(jSONObject, N6.f41419s, obj);
        bb.d(jSONObject, "lon", obj);
        bb.d(jSONObject, "country", this.f71632g.f70517c);
        bb.d(jSONObject, "type", 2);
        return jSONObject;
    }

    public final JSONObject b(kf kfVar, r4 r4Var) {
        JSONObject jSONObject = new JSONObject();
        if (kfVar.d() != null) {
            bb.d(jSONObject, "appsetid", kfVar.d());
        }
        if (kfVar.e() != null) {
            bb.d(jSONObject, "appsetidscope", kfVar.e());
        }
        Partner partnerG = r4Var.g();
        if (r4Var.k() && partnerG != null) {
            bb.d(jSONObject, ProtoExtConstants.Source.OMID_PN, partnerG.getName());
            bb.d(jSONObject, ProtoExtConstants.Source.OMID_PV, partnerG.getVersion());
        }
        return jSONObject;
    }

    public final Integer c() {
        n3 n3Var = this.f71632g;
        if (n3Var != null) {
            return n3Var.i().d();
        }
        return null;
    }

    public final int d() {
        n3 n3Var = this.f71632g;
        if (n3Var == null || n3Var.i().c() == null) {
            return 0;
        }
        return this.f71632g.i().c().intValue();
    }

    public final Collection e() {
        n3 n3Var = this.f71632g;
        return n3Var != null ? n3Var.i().i() : new ArrayList();
    }

    public final int f() {
        n3 n3Var = this.f71632g;
        if (n3Var == null || n3Var.i().e() == null) {
            return 0;
        }
        return this.f71632g.i().e().intValue();
    }

    public final String g() {
        n3 n3Var = this.f71632g;
        if (n3Var != null) {
            return n3Var.i().a();
        }
        return null;
    }

    public final String h() {
        n3 n3Var = this.f71632g;
        if (n3Var != null) {
            return n3Var.i().b();
        }
        return null;
    }

    public JSONObject i() {
        return this.f71626a;
    }

    public final int j() {
        return this.f71632g.j().d().h();
    }

    public final String k() {
        if (this.f71633h.a() == bf.b.f69484g) {
            eg.i("INTERSTITIAL NOT COMPATIBLE WITH OPENRTB", null);
        } else if (this.f71633h.a() == bf.c.f69485g) {
            eg.i("REWARDED_VIDEO NOT COMPATIBLE WITH OPENRTB", null);
        }
        return this.f71633h.a().b().toLowerCase(Locale.ROOT);
    }

    public final String l() {
        n3 n3Var = this.f71632g;
        if (n3Var != null) {
            return n3Var.i().h();
        }
        return null;
    }

    public final Integer m() {
        return Integer.valueOf(this.f71633h.a().e() ? 1 : 0);
    }

    public final void n() {
        bb.d(this.f71629d, "id", this.f71632g.f70522h);
        JSONObject jSONObject = this.f71629d;
        Object obj = JSONObject.NULL;
        bb.d(jSONObject, "name", obj);
        bb.d(this.f71629d, "bundle", this.f71632g.f70520f);
        bb.d(this.f71629d, "storeurl", obj);
        JSONObject jSONObject2 = new JSONObject();
        bb.d(jSONObject2, "id", obj);
        bb.d(jSONObject2, "name", obj);
        bb.d(this.f71629d, Fb.f40908b, jSONObject2);
        bb.d(this.f71629d, "cat", obj);
        bb.d(this.f71626a, "app", this.f71629d);
    }

    public final void o() {
        kf kfVarF = this.f71632g.f();
        bb.d(this.f71627b, "devicetype", f71624j);
        bb.d(this.f71627b, POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, Integer.valueOf(this.f71632g.d().c()));
        bb.d(this.f71627b, "h", Integer.valueOf(this.f71632g.d().a()));
        bb.d(this.f71627b, EidRequestBuilder.REQUEST_FIELD_IFA, kfVarF.a());
        bb.d(this.f71627b, N6.G, f71625k);
        bb.d(this.f71627b, EidRequestBuilder.REQUEST_FIELD_LMT, Integer.valueOf(kfVarF.f().g()));
        bb.d(this.f71627b, D5.f40558e, Integer.valueOf(j()));
        bb.d(this.f71627b, "os", "Android");
        bb.d(this.f71627b, "geo", a());
        bb.d(this.f71627b, "ip", JSONObject.NULL);
        bb.d(this.f71627b, "language", this.f71632g.f70518d);
        bb.d(this.f71627b, N6.f41375d0, ld.f70416c.a());
        bb.d(this.f71627b, N6.f41422t, this.f71632g.f70525k);
        bb.d(this.f71627b, "model", this.f71632g.f70515a);
        bb.d(this.f71627b, N6.Q0, this.f71632g.f70528n);
        bb.d(this.f71627b, "ext", b(kfVarF, this.f71634i));
        bb.d(this.f71626a, C4240b4.i.G, this.f71627b);
    }

    public final void p() {
        JSONObject jSONObject = new JSONObject();
        Object obj = JSONObject.NULL;
        bb.d(jSONObject, "id", obj);
        JSONObject jSONObject2 = new JSONObject();
        bb.d(jSONObject2, POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, this.f71633h.e());
        bb.d(jSONObject2, "h", this.f71633h.b());
        bb.d(jSONObject2, "btype", obj);
        bb.d(jSONObject2, "battr", obj);
        bb.d(jSONObject2, POBCTAOverlayData.KEY_CTA_POS, obj);
        bb.d(jSONObject2, "topframe", obj);
        bb.d(jSONObject2, "api", obj);
        JSONObject jSONObject3 = new JSONObject();
        bb.d(jSONObject3, "placementtype", k());
        bb.d(jSONObject3, "playableonly", obj);
        bb.d(jSONObject3, "allowscustomclosebutton", obj);
        bb.d(jSONObject2, "ext", jSONObject3);
        bb.d(jSONObject, "banner", jSONObject2);
        bb.d(jSONObject, "instl", m());
        bb.d(jSONObject, "tagid", this.f71633h.d());
        bb.d(jSONObject, "displaymanager", "Chartboost-Android-SDK");
        bb.d(jSONObject, "displaymanagerver", this.f71632g.f70521g);
        bb.d(jSONObject, "bidfloor", obj);
        bb.d(jSONObject, "bidfloorcur", "USD");
        bb.d(jSONObject, "secure", 1);
        this.f71628c.put(jSONObject);
        bb.d(this.f71626a, "imp", this.f71628c);
    }

    public final void q() {
        Integer numC = c();
        if (numC != null) {
            bb.d(this.f71630e, "coppa", numC);
        }
        JSONObject jSONObject = new JSONObject();
        bb.d(jSONObject, "gdpr", Integer.valueOf(f()));
        bb.d(jSONObject, EidRequestBuilder.REQUEST_FIELD_GPP, h());
        bb.d(jSONObject, "gpp_sid", g());
        for (j1.d dVar : e()) {
            if (!dVar.a().equals("coppa")) {
                bb.d(jSONObject, dVar.a(), dVar.getConsent());
            }
        }
        bb.d(this.f71630e, "ext", jSONObject);
        bb.d(this.f71626a, "regs", this.f71630e);
    }

    public final void r() {
        JSONObject jSONObject = this.f71626a;
        Object obj = JSONObject.NULL;
        bb.d(jSONObject, "id", obj);
        bb.d(this.f71626a, "test", obj);
        bb.d(this.f71626a, BidResponsed.KEY_CUR, new JSONArray().put("USD"));
        bb.d(this.f71626a, "at", 2);
    }

    public final void s() {
        bb.d(this.f71631f, "id", JSONObject.NULL);
        bb.d(this.f71631f, "geo", a());
        String strL = l();
        if (strL != null) {
            bb.d(this.f71631f, C4240b4.j.f42669b0, strL);
        }
        JSONObject jSONObject = new JSONObject();
        bb.d(jSONObject, C4240b4.j.f42669b0, Integer.valueOf(d()));
        bb.d(jSONObject, "impdepth", Integer.valueOf(this.f71633h.c()));
        bb.d(this.f71631f, "ext", jSONObject);
        bb.d(this.f71626a, "user", this.f71631f);
    }
}
