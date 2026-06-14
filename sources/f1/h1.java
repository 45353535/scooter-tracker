package f1;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import f1.z;
import h1.a;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class h1 implements z.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf f69979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f69980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cif f69981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1.a f69982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wc f69983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x1 f69984g;

    public h1(wf networkService, g2 requestBodyBuilder, Cif eventTracker, h1.a endpointRepository, wc session) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f69979b = networkService;
        this.f69980c = requestBodyBuilder;
        this.f69981d = eventTracker;
        this.f69982e = endpointRepository;
        this.f69983f = session;
    }

    public final void a(z zVar, a0 a0Var) {
        zVar.s("ad_id", a0Var.a());
        zVar.s(TypedValues.TransitionType.S_TO, a0Var.g());
        zVar.s("cgn", a0Var.b());
        zVar.s(Reporting.Key.CREATIVE, a0Var.c());
        zVar.s("location", a0Var.e());
        if (a0Var.d() == gd.f69943f) {
            zVar.s(Reporting.Key.CREATIVE, "");
        } else if (a0Var.i() != null && a0Var.h() != null) {
            float f10 = 1000;
            zVar.s("total_time", Float.valueOf(a0Var.h().floatValue() / f10));
            zVar.s("playback_time", Float.valueOf(a0Var.i().floatValue() / f10));
            eg.e("TotalDuration: " + a0Var.h() + " PlaybackTime: " + a0Var.i(), null, 2, null);
        }
        Boolean boolF = a0Var.f();
        if (boolF != null) {
            zVar.s("retarget_reinstall", boolF);
        }
    }

    @Override // f1.z.a
    public void b(z zVar, JSONObject jSONObject) {
        JSONObject jSONObjectB = bb.b(jSONObject, "response");
        x1 x1Var = this.f69984g;
        if (x1Var != null) {
            x1Var.a(jSONObjectB);
        }
    }

    @Override // f1.z.a
    public void c(z zVar, g1.a aVar) {
        String message;
        if (aVar == null || (message = aVar.getMessage()) == null) {
            message = "Click failure";
        }
        x1 x1Var = this.f69984g;
        if (x1Var != null) {
            x1Var.a(message);
        }
    }

    public final void d(x1 x1Var, a0 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f69984g = x1Var;
        URL urlA = this.f69982e.a(a.EnumC0890a.f72857l);
        String strB = h1.d.b(urlA);
        String path = urlA.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        z zVar = new z(strB, path, this.f69980c.a(), r.f70879e, this, this.f69981d, this.f69983f);
        zVar.f71691t = true;
        a(zVar, params);
        this.f69979b.b(zVar);
    }
}
