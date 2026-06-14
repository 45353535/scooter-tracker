package f1;

import com.iab.omid.library.chartboost.adsession.Partner;
import f1.bd;
import f1.bf;
import f1.ya;
import f1.z;
import f1.z2;
import g1.a;
import io.bidmachine.ProtoExtConstants;
import java.net.URL;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ac implements ya, z.a, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bf f69384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f69385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2 f69386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wf f69387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i4 f69388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n7 f69389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r4 f69390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ag f69391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h1.a f69392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z6 f69393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n3 f69394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public yd f69395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function1 f69396n;

    public ac(bf adTraits, m fileCache, g2 requestBodyBuilder, wf networkService, i4 adUnitParser, n7 openRTBAdUnitParser, r4 openMeasurementManager, ag eventTracker, h1.a endpointRepository, z6 applicationComponent) {
        Intrinsics.checkNotNullParameter(adTraits, "adTraits");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(adUnitParser, "adUnitParser");
        Intrinsics.checkNotNullParameter(openRTBAdUnitParser, "openRTBAdUnitParser");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.f69384b = adTraits;
        this.f69385c = fileCache;
        this.f69386d = requestBodyBuilder;
        this.f69387e = networkService;
        this.f69388f = adUnitParser;
        this.f69389g = openRTBAdUnitParser;
        this.f69390h = openMeasurementManager;
        this.f69391i = eventTracker;
        this.f69392j = endpointRepository;
        this.f69393k = applicationComponent;
    }

    @Override // f1.ya
    public void a(yd params, Function1 callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f69395m = params;
        this.f69396n = callback;
        this.f69394l = this.f69386d.a();
        String strI = params.a().i();
        Integer numB = params.b();
        int iIntValue = numB != null ? numB.intValue() : 0;
        Integer numC = params.c();
        int iIntValue2 = numC != null ? numC.intValue() : 0;
        boolean zE = params.e();
        n3 n3Var = this.f69394l;
        if (n3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestBodyFields");
            n3Var = null;
        }
        z zVarD = d(strI, iIntValue, iIntValue2, zE, n3Var, this, this.f69390h, this.f69393k.k());
        zVarD.f69463j = bd.b.f69465c;
        this.f69387e.b(zVarD);
    }

    @Override // f1.z.a
    public void b(z zVar, JSONObject jSONObject) {
        if (zVar == null || jSONObject == null) {
            k("Unexpected response");
            return;
        }
        n3 n3Var = this.f69394l;
        Unit unit = null;
        if (n3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestBodyFields");
            n3Var = null;
        }
        yd ydVar = this.f69395m;
        if (ydVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
            ydVar = null;
        }
        JSONObject jSONObjectA = ydVar.d().a(jSONObject);
        yd ydVar2 = this.f69395m;
        if (ydVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
            ydVar2 = null;
        }
        dg dgVarH = h(n3Var, jSONObjectA, ydVar2.a().i());
        if (dgVarH != null) {
            j(dgVarH, zVar);
            unit = Unit.f93236a;
        }
        if (unit == null) {
            k("Error parsing response");
        }
    }

    @Override // f1.z.a
    public void c(z zVar, g1.a aVar) {
        Function1 function1 = this.f69396n;
        yd ydVar = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function1 = null;
        }
        yd ydVar2 = this.f69395m;
        if (ydVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        } else {
            ydVar = ydVar2;
        }
        i6 i6VarA = ydVar.a();
        if (aVar == null) {
            aVar = new g1.a(a.c.f72141d, "Error parsing response");
        }
        function1.invoke(new se(i6VarA, null, aVar, 0L, 0L, 26, null));
    }

    public final z d(String str, int i10, int i11, boolean z10, n3 n3Var, z.a aVar, r4 r4Var, wc wcVar) {
        bf bfVar = this.f69384b;
        int iE = Intrinsics.areEqual(bfVar, bf.c.f69485g) ? n3Var.k().e() : Intrinsics.areEqual(bfVar, bf.b.f69484g) ? n3Var.k().d() : n3Var.k().a();
        return Intrinsics.areEqual(this.f69384b, bf.a.f69483g) ? g(aVar, i10, i11, str, iE, n3Var, r4Var, wcVar) : f(aVar, str, iE, z10, n3Var, r4Var, wcVar);
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f69391i.e(y0Var);
    }

    public final z4 f(z.a aVar, String str, int i10, boolean z10, n3 n3Var, r4 r4Var, wc wcVar) {
        Partner partnerG;
        URL urlA = this.f69392j.a(this.f69384b.a());
        bd.c cVar = bd.c.f69469c;
        String strB = h1.d.b(urlA);
        String path = urlA.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        z4 z4Var = new z4(cVar, strB, path, n3Var, r.f70879e, null, aVar, this.f69391i, wcVar);
        JSONObject jSONObjectO = this.f69385c.o();
        Intrinsics.checkNotNullExpressionValue(jSONObjectO, "getWebViewCacheAssets(...)");
        z4Var.G("cache_assets", jSONObjectO);
        z4Var.G("location", str);
        z4Var.G(Reporting.Key.IMP_DEPTH, Integer.valueOf(i10));
        if (r4Var.k() && (partnerG = r4Var.g()) != null) {
            z4Var.H(ProtoExtConstants.Source.OMID_PN, partnerG.getName());
            z4Var.H(ProtoExtConstants.Source.OMID_PV, partnerG.getVersion());
        }
        z4Var.G(Reporting.EventType.CACHE, Boolean.valueOf(z10));
        z4Var.f71691t = true;
        return z4Var;
    }

    public final f8 g(z.a aVar, int i10, int i11, String str, int i12, n3 n3Var, r4 r4Var, wc wcVar) {
        URL urlA = this.f69392j.a(this.f69384b.a());
        return new f8(new ae(h1.d.b(urlA), urlA.getPath(), n3Var, r.f70879e, aVar), new re(this.f69384b, Integer.valueOf(i10), Integer.valueOf(i11), str, i12), r4Var, this.f69391i, wcVar);
    }

    public final dg h(n3 n3Var, JSONObject jSONObject, String str) {
        try {
            bf bfVar = this.f69384b;
            bf.a aVar = bf.a.f69483g;
            if (Intrinsics.areEqual(bfVar, aVar)) {
                return this.f69389g.f(aVar, jSONObject);
            }
            if (n3Var.a().b()) {
                return this.f69388f.a(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            z2.a aVar2 = z2.a.f71696g;
            JSONObject jSONObject2 = new JSONObject();
            String message = e10.getMessage();
            if (message == null) {
                message = "no message";
            }
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            e((y0) new w3(aVar2, i(jSONObject2, message, string), this.f69384b.b(), str, null, null, 48, null));
            return null;
        }
    }

    public String i(JSONObject jSONObject, String str, String str2) {
        return ya.a.a(this, jSONObject, str, str2);
    }

    public final void j(dg dgVar, z zVar) {
        Function1 function1 = this.f69396n;
        yd ydVar = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function1 = null;
        }
        yd ydVar2 = this.f69395m;
        if (ydVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        } else {
            ydVar = ydVar2;
        }
        function1.invoke(new se(ydVar.a(), dgVar, null, zVar.f69462i, zVar.f69461h));
    }

    public final void k(String str) {
        Function1 function1 = this.f69396n;
        yd ydVar = null;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function1 = null;
        }
        yd ydVar2 = this.f69395m;
        if (ydVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        } else {
            ydVar = ydVar2;
        }
        function1.invoke(new se(ydVar.a(), null, new g1.a(a.c.f72142e, str), 0L, 0L, 26, null));
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f69391i.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f69391i.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f69391i.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f69391i.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f69391i.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f69391i.mo4436e(event);
    }

    public /* synthetic */ ac(bf bfVar, m mVar, g2 g2Var, wf wfVar, i4 i4Var, n7 n7Var, r4 r4Var, ag agVar, h1.a aVar, z6 z6Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bfVar, mVar, g2Var, wfVar, i4Var, n7Var, r4Var, agVar, aVar, (i10 & 512) != 0 ? rd.f70996b.a() : z6Var);
    }
}
