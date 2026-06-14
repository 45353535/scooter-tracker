package f1;

import android.os.Build;
import f1.ya;
import f1.z2;
import g1.a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lb implements ya, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bf f70408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x5 f70409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7 f70410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f70411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function0 f70412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ag f70413g;

    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f70414b = new a();

        public a() {
            super(1, JSONObject.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke(String str) {
            return new JSONObject(str);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f70415f = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public lb(bf adType, x5 downloader, n7 openRTBAdUnitParser, Function1 jsonFactory, Function0 androidVersion, ag eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(openRTBAdUnitParser, "openRTBAdUnitParser");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f70408b = adType;
        this.f70409c = downloader;
        this.f70410d = openRTBAdUnitParser;
        this.f70411e = jsonFactory;
        this.f70412f = androidVersion;
        this.f70413g = eventTracker;
    }

    public static final void f(lb this$0, Function1 callback, yd loaderParams, dg openRTBAdUnit, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(loaderParams, "$loaderParams");
        Intrinsics.checkNotNullParameter(openRTBAdUnit, "$openRTBAdUnit");
        if (z10) {
            this$0.i(callback, loaderParams, openRTBAdUnit);
        } else {
            this$0.h(callback, loaderParams);
        }
    }

    @Override // f1.ya
    public void a(yd params, Function1 callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (((Number) this.f70412f.invoke()).intValue() < 21) {
            q(callback, params);
            return;
        }
        if (!k(params)) {
            o(callback, params);
            return;
        }
        try {
            String strH = params.a().h();
            g(params, this.f70410d.f(this.f70408b, strH != null ? (JSONObject) this.f70411e.invoke(strH) : null), callback);
        } catch (JSONException e10) {
            j(callback, params, e10);
        }
    }

    public String b(JSONObject jSONObject, String str, String str2) {
        return ya.a.a(this, jSONObject, str, str2);
    }

    public final void c(z2 z2Var, String str, String str2, String str3) {
        e((y0) new w3(z2Var, b(new JSONObject(), str3, str2), this.f70408b.b(), str, null, null, 48, null));
    }

    public final void d(x5 x5Var, dg dgVar, w9 w9Var) {
        Map mapI = dgVar.i();
        AtomicInteger atomicInteger = new AtomicInteger();
        x5Var.g();
        x5Var.c(r.f70878d, mapI, atomicInteger, w9Var, this.f70408b.b());
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70413g.e(y0Var);
    }

    public final void g(final yd ydVar, final dg dgVar, final Function1 function1) {
        d(this.f70409c, dgVar, new w9() { // from class: f1.kb
            @Override // f1.w9
            public final void a(boolean z10) {
                lb.f(this.f70263a, function1, ydVar, dgVar, z10);
            }
        });
    }

    public final void h(Function1 function1, yd ydVar) {
        z2.a aVar = z2.a.f71698i;
        String strI = ydVar.a().i();
        String strH = ydVar.a().h();
        if (strH == null) {
            strH = "";
        }
        c(aVar, strI, strH, "ASSETS_DOWNLOAD_FAILURE");
        function1.invoke(new se(ydVar.a(), null, new g1.a(a.c.f72141d, "Error parsing response"), 0L, 0L, 26, null));
    }

    public final void i(Function1 function1, yd ydVar, dg dgVar) {
        function1.invoke(new se(ydVar.a(), dgVar, null, 0L, 0L, 24, null));
    }

    public final void j(Function1 function1, yd ydVar, Exception exc) {
        z2.a aVar = z2.a.f71697h;
        String strI = ydVar.a().i();
        String strH = ydVar.a().h();
        if (strH == null) {
            strH = "";
        }
        c(aVar, strI, strH, exc.toString());
        function1.invoke(new se(ydVar.a(), null, new g1.a(a.c.f72141d, "Error parsing response"), 0L, 0L, 26, null));
    }

    public final boolean k(yd ydVar) {
        String strH;
        return ydVar.a().i().length() > 0 && (strH = ydVar.a().h()) != null && strH.length() > 0;
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70413g.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f70413g.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f70413g.n(uVar);
    }

    public final void o(Function1 function1, yd ydVar) {
        z2.a aVar = z2.a.f71697h;
        String strI = ydVar.a().i();
        String strH = ydVar.a().h();
        if (strH == null) {
            strH = "";
        }
        c(aVar, strI, strH, "Invalid bid response");
        function1.invoke(new se(ydVar.a(), null, new g1.a(a.c.f72142e, "Error parsing response"), 0L, 0L, 26, null));
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70413g.p(y0Var);
    }

    public final void q(Function1 function1, yd ydVar) {
        function1.invoke(new se(ydVar.a(), null, new g1.a(a.c.f72146i, "Unsupported Android version " + Build.VERSION.SDK_INT), 0L, 0L, 26, null));
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70413g.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f70413g.mo4436e(event);
    }

    public /* synthetic */ lb(bf bfVar, x5 x5Var, n7 n7Var, Function1 function1, Function0 function0, ag agVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bfVar, x5Var, n7Var, (i10 & 8) != 0 ? a.f70414b : function1, (i10 & 16) != 0 ? b.f70415f : function0, agVar);
    }
}
