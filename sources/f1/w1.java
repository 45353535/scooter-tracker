package f1;

import f1.z2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class w1 implements ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ag f71431b;

    public w1(ag eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f71431b = eventTracker;
    }

    public final void a(l4 l4Var, float f10, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seconds", Float.valueOf(f10));
        String strH = ta.P.h();
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        d(strH, string, l4Var, location, adTypeName);
    }

    public final void b(l4 l4Var, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        h(ta.Q.h(), l4Var, location, adTypeName);
    }

    public final void c(String str, l4 l4Var, String str2, String str3) {
        try {
            if (l4Var == null) {
                e((y0) new w3(z2.i.f71754j, "Webview is null", str3, str2, null, null, 48, null));
                eg.j("Calling native to javascript webview is null", null, 2, null);
                return;
            }
            eg.e("Calling native to javascript: " + str, null, 2, null);
            l4Var.loadUrl(str);
        } catch (Exception e10) {
            e((y0) new w3(z2.i.f71755k, "Cannot open url: " + e10, str3, str2, null, null, 48, null));
            eg.i("Calling native to javascript. Cannot open url", e10);
        }
    }

    public final void d(String str, String str2, l4 l4Var, String str3, String str4) {
        c("javascript:Chartboost.EventHandler.handleNativeEvent(\"" + str + "\", " + str2 + ")", l4Var, str3, str4);
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f71431b.e(y0Var);
    }

    public final void f(l4 l4Var, float f10, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", Float.valueOf(f10));
        String strH = ta.M.h();
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        d(strH, string, l4Var, location, adTypeName);
    }

    public final void g(l4 l4Var, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        h(ta.R.h(), l4Var, location, adTypeName);
    }

    public final void h(String str, l4 l4Var, String str2, String str3) {
        c("javascript:Chartboost.EventHandler.handleNativeEvent(\"" + str + "\")", l4Var, str2, str3);
    }

    public final void i(l4 l4Var, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        h(ta.N.h(), l4Var, location, adTypeName);
    }

    public final void j(l4 l4Var, String location, String adTypeName) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        h(ta.O.h(), l4Var, location, adTypeName);
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f71431b.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f71431b.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f71431b.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f71431b.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f71431b.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f71431b.mo4436e(event);
    }
}
