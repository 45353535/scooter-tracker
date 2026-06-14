package f1;

import android.content.Context;
import android.view.SurfaceView;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import f1.z2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 extends u3 implements n0 {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final b f70136f0 = new b(null);
    public final m P;
    public final q1 Q;
    public final String R;
    public final b1.e S;
    public final Function5 T;
    public final String U;
    public final zb V;
    public final da W;
    public final ag X;
    public final Function1 Y;
    public long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f70137a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f70138b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f70139c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public u9 f70140d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public x f70141e0;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70142f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l4 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new l4(it);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, String location, a6 mtype, String adUnitParameters, t6 uiPoster, m fileCache, w1 templateProxy, q1 videoRepository, String videoFilename, b1.e eVar, Function5 adsVideoPlayerFactory, wf networkService, String templateHtml, d4 openMeasurementImpressionCallback, u7 adUnitRendererImpressionCallback, zb impressionInterface, r1 webViewTimeoutInterface, da nativeBridgeCommand, ag eventTracker, Function1 cbWebViewFactory) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, networkService, templateProxy, eVar, templateHtml, openMeasurementImpressionCallback, adUnitRendererImpressionCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(adUnitParameters, "adUnitParameters");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(templateProxy, "templateProxy");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        Intrinsics.checkNotNullParameter(adsVideoPlayerFactory, "adsVideoPlayerFactory");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(templateHtml, "templateHtml");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        this.P = fileCache;
        this.Q = videoRepository;
        this.R = videoFilename;
        this.S = eVar;
        this.T = adsVideoPlayerFactory;
        this.U = templateHtml;
        this.V = impressionInterface;
        this.W = nativeBridgeCommand;
        this.X = eventTracker;
        this.Y = cbWebViewFactory;
    }

    @Override // f1.u3
    public v4 G(Context context) {
        int i10;
        u9 u9Var;
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        this.W.g(this.V);
        eg.e("createViewObject()", null, 2, null);
        try {
            SurfaceView surfaceView = new SurfaceView(context);
            try {
                i10 = 2;
            } catch (Exception e10) {
                e = e10;
                i10 = 2;
            }
            try {
                u9Var = new u9(context, this.U, Q(), this.V, this.W, O(), surfaceView, null, this.X, this.Y, 128, null);
            } catch (Exception e11) {
                e = e11;
                I("Can't instantiate VideoBase: " + e);
                u9Var = null;
            }
            this.f70140d0 = u9Var;
            int i11 = i10;
            x xVar = (x) this.T.invoke(context, surfaceView, this, Y(), this.P);
            c9 c9VarB = this.Q.b(this.R);
            if (c9VarB != null) {
                xVar.a(c9VarB);
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.j("Video asset not found in the repository", null, i11, null);
            }
            this.f70141e0 = xVar;
            return this.f70140d0;
        } catch (Exception e12) {
            I("Can't instantiate SurfaceView: " + e12);
            return null;
        }
    }

    @Override // f1.u3
    public void M() {
        eg.e("destroyView()", null, 2, null);
        i0();
        super.M();
    }

    @Override // f1.n0
    public void a(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        eg.e("onVideoDisplayError: " + error, null, 2, null);
        s0(false);
        w1 w1VarX = X();
        if (w1VarX != null) {
            w1VarX.j(k0(), S(), N());
        }
        i0();
        I(error);
    }

    @Override // f1.n0
    public void b() {
        eg.e("onVideoDisplayCompleted", null, 2, null);
        s0(true);
        m0();
        U().d();
    }

    @Override // f1.n0
    public void c() {
        U().a(true);
    }

    @Override // f1.n0
    public void d() {
        U().a(false);
    }

    @Override // f1.u3
    public void d0() {
        u9 u9Var = this.f70140d0;
        int width = u9Var != null ? u9Var.getWidth() : 0;
        u9 u9Var2 = this.f70140d0;
        int height = u9Var2 != null ? u9Var2.getHeight() : 0;
        x xVar = this.f70141e0;
        if (!androidx.activity.s.a(xVar)) {
            xVar = null;
        }
        if (xVar != null) {
            xVar.a(width, height);
        }
    }

    @Override // f1.u3
    public void f0() {
        eg.m("onPause()", null, 2, null);
        x xVar = this.f70141e0;
        if (xVar != null) {
            xVar.pause();
        }
        super.f0();
    }

    @Override // f1.u3
    public void g0() {
        eg.m("onResume()", null, 2, null);
        this.Q.a(null, 1, false);
        x xVar = this.f70141e0;
        if (xVar != null) {
            df dfVar = xVar instanceof df ? (df) xVar : null;
            if (dfVar != null) {
                dfVar.c();
            }
            xVar.play();
        }
        super.g0();
    }

    public final void h0() {
        i0();
    }

    public final void i0() {
        x xVar = this.f70141e0;
        if (xVar != null) {
            xVar.stop();
        }
        u9 u9Var = this.f70140d0;
        if (u9Var != null) {
            u9Var.b();
        }
        this.f70141e0 = null;
        this.f70140d0 = null;
    }

    public final int j0() {
        eg.e("getAssetDownloadStateNow()", null, 2, null);
        c9 c9VarB = this.Q.b(this.R);
        if (c9VarB != null) {
            return this.Q.a(c9VarB);
        }
        return 0;
    }

    public final l4 k0() {
        u9 u9Var = this.f70140d0;
        if (u9Var != null) {
            return u9Var.getWebView();
        }
        return null;
    }

    public final void l0() {
        x xVar = this.f70141e0;
        if (xVar != null) {
            xVar.f();
        }
        U().a(0.0f);
    }

    public final void m0() {
        w1 w1VarX = X();
        if (w1VarX != null) {
            w1VarX.i(k0(), S(), N());
        }
    }

    public final void n0() {
        eg.e("notifyTemplateVideoStarted() duration: " + this.Z, null, 2, null);
        w1 w1VarX = X();
        if (w1VarX != null) {
            w1VarX.f(k0(), this.Z / 1000.0f, S(), N());
        }
    }

    public final void o0() {
        eg.e("pauseVideo()", null, 2, null);
        U().a();
        x xVar = this.f70141e0;
        if (xVar != null) {
            xVar.pause();
        }
    }

    public final void p0() {
        eg.e("playVideo()", null, 2, null);
        q0();
        this.f70137a0 = o3.a();
        x xVar = this.f70141e0;
        if (xVar != null) {
            xVar.play();
        }
    }

    public final void q0() {
        U().b(PlayerState.FULLSCREEN);
        x xVar = this.f70141e0;
        if (xVar == null || xVar.h()) {
            U().e();
            return;
        }
        d4 d4VarU = U();
        float f10 = this.Z / 1000.0f;
        x xVar2 = this.f70141e0;
        d4VarU.a(f10, xVar2 != null ? xVar2.g() : 1.0f);
    }

    public final void r0() {
        x xVar = this.f70141e0;
        if (xVar != null) {
            xVar.b();
        }
        U().a(1.0f);
    }

    public final void s0(boolean z10) {
        String strValueOf = String.valueOf(this.f70139c0);
        if (z10) {
            u0(strValueOf);
        } else {
            t0(strValueOf);
        }
    }

    public final void t0(String str) {
        long jA;
        long jA2;
        oc ocVar = new oc(z2.j.f71764d, str, N(), S(), this.S);
        if (this.f70138b0 == 0) {
            jA = this.f70137a0;
            jA2 = o3.a();
        } else {
            jA = o3.a();
            jA2 = this.f70138b0;
        }
        ocVar.b(jA - jA2);
        ocVar.e(true);
        ocVar.g(false);
        e((y0) ocVar);
    }

    public final void u0(String str) {
        l1 l1Var = new l1(z2.j.f71763c, str, N(), S(), this.S, null, 32, null);
        l1Var.b(this.f70138b0 - this.f70137a0);
        l1Var.e(true);
        l1Var.g(false);
        e((y0) l1Var);
    }

    @Override // f1.n0
    public void b(long j10) {
        eg.e("onVideoDisplayPrepared ready to receive signal from template, duration: " + j10, null, 2, null);
        this.f70139c0 = j0();
        this.Z = j10;
        e0();
    }

    @Override // f1.n0
    public void a(long j10) {
        float f10 = j10 / 1000.0f;
        float f11 = this.Z / 1000.0f;
        if (h8.f70006a.g()) {
            eg.m("onVideoDisplayProgress: " + f10 + "/" + f11, null, 2, null);
        }
        w1 w1VarX = X();
        if (w1VarX != null) {
            w1VarX.a(k0(), f10, S(), N());
        }
        t(f11, f10);
    }

    public /* synthetic */ j0(Context context, String str, a6 a6Var, String str2, t6 t6Var, m mVar, w1 w1Var, q1 q1Var, String str3, b1.e eVar, Function5 function5, wf wfVar, String str4, d4 d4Var, u7 u7Var, zb zbVar, r1 r1Var, da daVar, ag agVar, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, a6Var, str2, t6Var, mVar, w1Var, q1Var, str3, eVar, function5, wfVar, str4, d4Var, u7Var, zbVar, r1Var, daVar, agVar, (i10 & 524288) != 0 ? a.f70142f : function1);
    }

    @Override // f1.n0
    public void a() {
        eg.e("onVideoDisplayStarted", null, 2, null);
        n0();
        this.f70138b0 = o3.a();
    }
}
