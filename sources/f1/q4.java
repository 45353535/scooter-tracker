package f1;

import f1.z;
import f1.z2;
import h1.a;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class q4 implements z.a, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf f70805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f70806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag f70807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1.a f70808e;

    public q4(wf networkService, g2 requestBodyBuilder, ag eventTracker, h1.a endpointRepository) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        this.f70805b = networkService;
        this.f70806c = requestBodyBuilder;
        this.f70807d = eventTracker;
        this.f70808e = endpointRepository;
    }

    public final void a() {
        URL urlA = this.f70808e.a(a.EnumC0890a.f72849d);
        String strB = h1.d.b(urlA);
        String path = urlA.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        z zVar = new z(strB, path, this.f70806c.a(), r.f70879e, this, this.f70807d, (wc) null, 64, (DefaultConstructorMarker) null);
        zVar.f71691t = true;
        this.f70805b.b(zVar);
    }

    @Override // f1.z.a
    public void c(z zVar, g1.a aVar) {
        String strD;
        if (aVar == null || (strD = aVar.d()) == null) {
            strD = "Install failure";
        }
        e((y0) new oc(z2.f.f71728f, strD, null, null, null, 28, null));
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70807d.e(y0Var);
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70807d.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f70807d.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f70807d.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70807d.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70807d.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f70807d.mo4436e(event);
    }

    @Override // f1.z.a
    public void b(z zVar, JSONObject jSONObject) {
    }
}
