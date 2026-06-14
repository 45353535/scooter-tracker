package yads;

import android.webkit.WebView;
import com.adjust.sdk.purchase.ADJPConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j$.util.DesugarCollections;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ot3 f111922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d4 f111923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uj1 f111924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f111925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f111926f;

    public ia(String str) {
        a();
        this.f111921a = str;
        this.f111922b = new ot3(null);
    }

    public final void a(WebView webView) {
        this.f111922b = new ot3(webView);
    }

    public void b() {
        this.f111922b.clear();
    }

    public void c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, JSONObject jSONObject) {
        pu3.f114791a.a((WebView) this.f111922b.get(), "publishMediaEvent", str, jSONObject, this.f111921a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(fa faVar) {
        pu3 pu3Var = pu3.f114791a;
        WebView webView = (WebView) this.f111922b.get();
        String str = this.f111921a;
        JSONObject jSONObject = new JSONObject();
        st3.a(jSONObject, "impressionOwner", faVar.f110664a);
        st3.a(jSONObject, "mediaEventsOwner", faVar.f110665b);
        st3.a(jSONObject, "creativeType", faVar.f110667d);
        st3.a(jSONObject, "impressionType", faVar.f110668e);
        st3.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(faVar.f110666c));
        pu3Var.a(webView, "init", jSONObject, str);
    }

    public void a(dt3 dt3Var, ga gaVar) {
        a(dt3Var, gaVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(dt3 dt3Var, ga gaVar, JSONObject jSONObject) {
        String str = dt3Var.f110068h;
        JSONObject jSONObject2 = new JSONObject();
        st3.a(jSONObject2, ADJPConstants.KEY_ENVIRONMENT, "app");
        st3.a(jSONObject2, "adSessionType", gaVar.f111129h);
        st3.a(jSONObject2, "deviceInfo", lt3.a());
        st3.a(jSONObject2, "deviceCategory", of0.a(zs3.a()));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        st3.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        st3.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, gaVar.f111122a.f110272a);
        st3.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, gaVar.f111122a.f110273b);
        st3.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        st3.a(jSONObject4, "libraryVersion", "1.5.6-Yandex");
        st3.a(jSONObject4, RemoteConfigConstants.RequestFieldKey.APP_ID, mu3.f113613b.f113614a.getApplicationContext().getPackageName());
        st3.a(jSONObject2, "app", jSONObject4);
        String str2 = gaVar.f111128g;
        if (str2 != null) {
            st3.a(jSONObject2, "contentUrl", str2);
        }
        String str3 = gaVar.f111127f;
        if (str3 != null) {
            st3.a(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (ab3 ab3Var : DesugarCollections.unmodifiableList(gaVar.f111124c)) {
            st3.a(jSONObject5, ab3Var.f108619a, ab3Var.f108621c);
        }
        pu3.f114791a.a((WebView) this.f111922b.get(), "startSession", str, jSONObject2, jSONObject5, jSONObject);
    }

    public final void a() {
        this.f111926f = System.nanoTime();
        this.f111925e = 1;
    }
}
