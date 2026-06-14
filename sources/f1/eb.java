package f1;

import f1.z;
import h1.a;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class eb implements z.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf f69713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f69714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cif f69715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1.a f69716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wc f69717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public wb f69718g;

    public eb(wf networkService, g2 requestBodyBuilder, Cif eventTracker, h1.a endpointRepository, wc session) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f69713b = networkService;
        this.f69714c = requestBodyBuilder;
        this.f69715d = eventTracker;
        this.f69716e = endpointRepository;
        this.f69717f = session;
    }

    public final void a(z zVar, na naVar) {
        zVar.s("location", naVar.c());
        zVar.s("reward", Integer.valueOf(naVar.d()));
        zVar.s("currency-name", naVar.e());
        zVar.s("ad_id", naVar.a());
        zVar.s("force_close", Boolean.FALSE);
        zVar.s("cgn", naVar.b());
        if (naVar.g() == null || naVar.f() == null) {
            return;
        }
        float f10 = 1000;
        zVar.s("total_time", Float.valueOf(naVar.f().floatValue() / f10));
        zVar.s("playback_time", Float.valueOf(naVar.g().floatValue() / f10));
        eg.e("TotalDuration: " + naVar.f() + " PlaybackTime: " + naVar.g(), null, 2, null);
    }

    @Override // f1.z.a
    public void b(z zVar, JSONObject jSONObject) {
        JSONObject jSONObjectB = bb.b(jSONObject, "response");
        wb wbVar = this.f69718g;
        if (wbVar != null) {
            wbVar.a(jSONObjectB);
        }
    }

    @Override // f1.z.a
    public void c(z zVar, g1.a aVar) {
        String message;
        if (aVar == null || (message = aVar.getMessage()) == null) {
            message = "Click failure";
        }
        wb wbVar = this.f69718g;
        if (wbVar != null) {
            wbVar.a(message);
        }
    }

    public final void d(wb wbVar, na params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f69718g = wbVar;
        URL urlA = this.f69716e.a(a.EnumC0890a.f72858m);
        String strB = h1.d.b(urlA);
        String path = urlA.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        z zVar = new z(strB, path, this.f69714c.a(), r.f70879e, this, this.f69715d, this.f69717f);
        a(zVar, params);
        this.f69713b.b(zVar);
    }
}
