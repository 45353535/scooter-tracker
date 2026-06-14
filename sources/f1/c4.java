package f1;

import f1.bd;
import f1.z;
import f1.z2;
import h1.a;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c4 implements z.a, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf f69508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f69509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag f69510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1.a f69511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sd f69512f;

    public c4(wf networkService, g2 requestBodyBuilder, ag eventTracker, h1.a endpointRepository) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        this.f69508b = networkService;
        this.f69509c = requestBodyBuilder;
        this.f69510d = eventTracker;
        this.f69511e = endpointRepository;
    }

    public final void a(sd callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f69512f = callback;
        URL urlA = this.f69511e.a(a.EnumC0890a.f72848c);
        String strB = h1.d.b(urlA);
        String path = urlA.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        z zVar = new z(strB, path, this.f69509c.a(), r.f70878d, this, this.f69510d, (wc) null, 64, (DefaultConstructorMarker) null);
        zVar.f69463j = bd.b.f69465c;
        zVar.f71691t = true;
        this.f69508b.b(zVar);
    }

    @Override // f1.z.a
    public void b(z zVar, JSONObject jSONObject) {
        JSONObject jSONObjectB = bb.b(jSONObject, "response");
        sd sdVar = this.f69512f;
        if (sdVar != null) {
            Intrinsics.checkNotNull(jSONObjectB);
            sdVar.a(jSONObjectB);
        }
    }

    @Override // f1.z.a
    public void c(z zVar, g1.a aVar) {
        String strD;
        if (aVar == null || (strD = aVar.d()) == null) {
            strD = "Config failure";
        }
        String str = strD;
        e((y0) new oc(z2.f.f71727e, str, null, null, null, 28, null));
        sd sdVar = this.f69512f;
        if (sdVar != null) {
            sdVar.a(str);
        }
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f69510d.e(y0Var);
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f69510d.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f69510d.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f69510d.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f69510d.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f69510d.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f69510d.mo4436e(event);
    }
}
