package f1;

import android.view.ViewGroup;
import f1.bf;
import f1.z2;
import g1.a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t2 implements ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f71110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x5 f71111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yc f71112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o6 f71113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bf f71114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wf f71115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g2 f71116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b1.e f71117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r4 f71118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p7 f71119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d4 f71120l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Function2 f71121m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ag f71122n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h1.a f71123o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wc f71124p;

    public t2(m fileCache, x5 downloader, yc urlResolver, o6 intentResolver, bf adType, wf networkService, g2 requestBodyBuilder, b1.e eVar, r4 measurementManager, p7 sdkBiddingTemplateParser, d4 openMeasurementImpressionCallback, Function2 impressionFactory, ag eventTracker, h1.a endpointRepository, wc session) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        Intrinsics.checkNotNullParameter(intentResolver, "intentResolver");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(measurementManager, "measurementManager");
        Intrinsics.checkNotNullParameter(sdkBiddingTemplateParser, "sdkBiddingTemplateParser");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionFactory, "impressionFactory");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f71110b = fileCache;
        this.f71111c = downloader;
        this.f71112d = urlResolver;
        this.f71113e = intentResolver;
        this.f71114f = adType;
        this.f71115g = networkService;
        this.f71116h = requestBodyBuilder;
        this.f71117i = eVar;
        this.f71118j = measurementManager;
        this.f71119k = sdkBiddingTemplateParser;
        this.f71120l = openMeasurementImpressionCallback;
        this.f71121m = impressionFactory;
        this.f71122n = eventTracker;
        this.f71123o = endpointRepository;
        this.f71124p = session;
    }

    public final la a(i6 i6Var, dg dgVar, String str, String str2, u7 u7Var, ViewGroup viewGroup, pc pcVar, a4 a4Var, cg cgVar, zb zbVar, r1 r1Var, da daVar) {
        gd gdVarD = d(dgVar.u(), this.f71114f);
        h1 h1Var = new h1(this.f71115g, this.f71116h, this.f71122n, this.f71123o, this.f71124p);
        eb ebVar = new eb(this.f71115g, this.f71116h, this.f71122n, this.f71123o, this.f71124p);
        u3 u3VarA = cgVar.a(str, dgVar, this.f71114f.b(), str2, u7Var, zbVar, r1Var, daVar);
        return (la) this.f71121m.invoke(new u8(this.f71112d, this.f71113e, h1Var, xe.a(this.f71114f.b(), str, this.f71117i, this.f71122n), ebVar, gdVarD, this.f71120l, i6Var, this.f71111c, u3VarA, new b8(0, 0, 0, 0, 15, null), dgVar, this.f71114f, str, pcVar, a4Var, u7Var, this.f71122n), viewGroup);
    }

    public final hb b(i6 appRequest, u7 callback, ViewGroup viewGroup, pc impressionIntermediateCallback, a4 impressionClickCallback, cg viewProtocolBuilder, zb impressionInterface, r1 webViewTimeoutInterface, da nativeBridgeCommand, q7 templateLoader) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.checkNotNullParameter(impressionClickCallback, "impressionClickCallback");
        Intrinsics.checkNotNullParameter(viewProtocolBuilder, "viewProtocolBuilder");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(templateLoader, "templateLoader");
        try {
            File fileA = this.f71110b.a().a();
            dg dgVarA = appRequest.a();
            String strI = appRequest.i();
            if (dgVarA == null) {
                return new hb(null, a.b.B);
            }
            Intrinsics.checkNotNull(fileA);
            a.b bVarF = f(dgVarA, fileA, strI);
            if (bVarF != null) {
                return new hb(null, bVarF);
            }
            String strG = g(templateLoader, dgVarA, fileA, strI);
            return strG == null ? new hb(null, a.b.f72134v) : new hb(a(appRequest, dgVarA, strI, this.f71118j.d(strG), callback, viewGroup, impressionIntermediateCallback, impressionClickCallback, viewProtocolBuilder, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand), null);
        } catch (Exception e10) {
            eg.i("showReady exception:", e10);
            return new hb(null, a.b.f72114b);
        }
    }

    public final gd c(String str) {
        return Intrinsics.areEqual(str, "video") ? gd.f69941d : gd.f69940c;
    }

    public final gd d(String str, bf bfVar) {
        if (Intrinsics.areEqual(bfVar, bf.b.f69484g)) {
            return c(str);
        }
        if (Intrinsics.areEqual(bfVar, bf.c.f69485g)) {
            return gd.f69942e;
        }
        if (Intrinsics.areEqual(bfVar, bf.a.f69483g)) {
            return gd.f69943f;
        }
        throw new lf.m();
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f71122n.e(y0Var);
    }

    public final a.b f(dg dgVar, File file, String str) {
        Map mapI = dgVar.i();
        if (mapI.isEmpty()) {
            return null;
        }
        for (f9 f9Var : mapI.values()) {
            File fileA = f9Var.a(file);
            if (fileA == null || !fileA.exists()) {
                eg.j("Asset does not exist: " + f9Var.f69808b, null, 2, null);
                String str2 = f9Var.f69808b;
                if (str2 == null) {
                    str2 = "";
                } else {
                    Intrinsics.checkNotNull(str2);
                }
                h(str, str2);
                return a.b.D;
            }
        }
        return null;
    }

    public final String g(q7 q7Var, dg dgVar, File file, String str) {
        f9 f9VarK = dgVar.k();
        String strB = f9VarK.b();
        if (strB == null || strB.length() == 0) {
            eg.j("AdUnit does not have a template body", null, 2, null);
            return null;
        }
        File fileA = f9VarK.a(file);
        HashMap map = new HashMap(dgVar.x());
        if (dgVar.E().length() > 0 && dgVar.h().length() > 0) {
            p7 p7Var = this.f71119k;
            Intrinsics.checkNotNull(fileA);
            String strA = p7Var.a(fileA, dgVar.E(), dgVar.h());
            if (strA != null) {
                return strA;
            }
        }
        if (dgVar.c().length() == 0 || dgVar.b().length() == 0) {
            map.put("{% native_video_player %}", "false");
        } else {
            map.put("{% native_video_player %}", "true");
        }
        for (Map.Entry entry : dgVar.i().entrySet()) {
            map.put(entry.getKey(), ((f9) entry.getValue()).f69808b);
        }
        Intrinsics.checkNotNull(fileA);
        return q7Var.a(fileA, map, this.f71114f.b(), str);
    }

    public final void h(String str, String str2) {
        e((y0) new w3(z2.i.f71750f, str2, this.f71114f.b(), str, this.f71117i, null, 32, null));
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f71122n.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f71122n.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f71122n.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f71122n.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f71122n.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f71122n.mo4436e(event);
    }
}
