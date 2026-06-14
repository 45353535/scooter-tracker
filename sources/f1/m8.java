package f1;

import f1.bd;
import f1.z;
import f1.z2;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class m8 implements z.a, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf f70470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f70471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag f70472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wc f70473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pf f70474f;

    public m8(wf networkService, g2 requestBodyBuilder, ag eventTracker, wc session) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f70470b = networkService;
        this.f70471c = requestBodyBuilder;
        this.f70472d = eventTracker;
        this.f70473e = session;
    }

    public final void a(z zVar, pf pfVar) {
        zVar.s("cached", "0");
        zVar.s("location", pfVar.c());
        int iE = pfVar.e();
        if (iE >= 0) {
            zVar.s("video_cached", Integer.valueOf(iE));
        }
        String strA = pfVar.a();
        if (strA == null || strA.length() == 0) {
            return;
        }
        zVar.s("ad_id", strA);
    }

    @Override // f1.z.a
    public void c(z zVar, g1.a aVar) {
        String message;
        z2.i iVar = z2.i.f71757m;
        if (aVar == null || (message = aVar.getMessage()) == null) {
            message = "Show failure";
        }
        String str = message;
        pf pfVar = this.f70474f;
        pf pfVar2 = null;
        if (pfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showParams");
            pfVar = null;
        }
        String strB = pfVar.b();
        pf pfVar3 = this.f70474f;
        if (pfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showParams");
            pfVar3 = null;
        }
        String strC = pfVar3.c();
        pf pfVar4 = this.f70474f;
        if (pfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showParams");
        } else {
            pfVar2 = pfVar4;
        }
        e((y0) new oc(iVar, str, strB, strC, pfVar2.d()));
    }

    public final void d(URL url, pf showParams) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(showParams, "showParams");
        this.f70474f = showParams;
        String strB = h1.d.b(url);
        String path = url.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        z zVar = new z(strB, path, this.f70471c.a(), r.f70879e, this, this.f70472d, this.f70473e);
        zVar.f69463j = bd.b.f69465c;
        a(zVar, showParams);
        this.f70470b.b(zVar);
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70472d.e(y0Var);
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70472d.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f70472d.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f70472d.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70472d.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70472d.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f70472d.mo4436e(event);
    }

    @Override // f1.z.a
    public void b(z zVar, JSONObject jSONObject) {
    }
}
