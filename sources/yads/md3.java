package yads;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class md3 implements qd3, bd3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f113434k = {kotlin.jvm.internal.v0.f(new kotlin.jvm.internal.g0(md3.class, "adParameterManager", "getAdParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$ResponseReportParameterManager;", 0)), kotlin.jvm.internal.v0.f(new kotlin.jvm.internal.g0(md3.class, "requestParameterManager", "getRequestParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$RequestReportParameterManager;", 0))};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f113435l = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f113436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eh3 f113437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ja2 f113438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sd3 f113439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dd3 f113440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pd3 f113441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tf3 f113442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f113443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kd3 f113444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ld3 f113445j;

    public /* synthetic */ md3(Context context, es2 es2Var, t9 t9Var, xb3 xb3Var, v5 v5Var, xd3 xd3Var, kh3 kh3Var, jg3 jg3Var, fh3 fh3Var) {
        this(context, es2Var, t9Var, xb3Var, v5Var, xd3Var, kh3Var, jg3Var, fh3Var, ia2.a(false));
    }

    public final void a(xc3 xc3Var) {
        b();
        if (this.f113443h) {
            return;
        }
        this.f113443h = true;
        String lowerCase = xc3Var.f117790a.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String message = xc3Var.f117791b.getMessage();
        if (message == null) {
            message = "";
        }
        pd3 pd3Var = this.f113441f;
        pd3Var.getClass();
        pd3Var.a(MapsKt.mutableMapOf(TuplesKt.to("status", "error"), TuplesKt.to("failure_reason", lowerCase), TuplesKt.to("error_message", message)));
    }

    public final void b() {
        sd3 sd3Var = this.f113439d;
        sd3Var.f115765c.removeCallbacksAndMessages(null);
        sd3Var.f115767e = false;
        dd3 dd3Var = this.f113440e;
        dd3Var.f109891c.removeCallbacksAndMessages(null);
        dd3Var.f109893e = false;
        ((ma2) this.f113438c).a();
    }

    public md3(Context context, es2 es2Var, t9 t9Var, xb3 xb3Var, v5 v5Var, xd3 xd3Var, kh3 kh3Var, jg3 jg3Var, fh3 fh3Var, ja2 ja2Var) {
        this.f113436a = v5Var;
        this.f113437b = fh3Var;
        this.f113438c = ja2Var;
        this.f113439d = new sd3(jg3Var, this);
        this.f113440e = new dd3(xd3Var, this);
        this.f113441f = new pd3(context, es2Var, t9Var, v5Var);
        this.f113442g = new tf3(xb3Var, kh3Var);
        kotlin.properties.a aVar = kotlin.properties.a.f93338a;
        this.f113444i = new kd3(this);
        this.f113445j = new ld3(this);
    }

    public final void a() {
        sd3 sd3Var = this.f113439d;
        sd3Var.f115765c.removeCallbacksAndMessages(null);
        sd3Var.f115767e = false;
        this.f113436a.a(u5.f116517u, null);
        this.f113437b.i();
        dd3 dd3Var = this.f113440e;
        if (!dd3Var.f109893e && !dd3Var.f109892d) {
            dd3Var.f109893e = true;
            dd3Var.f109891c.post(new cd3(dd3Var));
        }
        ((ma2) this.f113438c).a(f113435l, new na2() { // from class: yads.ym
            @Override // yads.na2
            public final void a() {
                md3.a(this.f118291a);
            }
        });
    }

    public static final void a(md3 md3Var) {
        ue0 ue0Var = new ue0();
        wc3 wc3Var = wc3.f117404i;
        md3Var.b();
        if (md3Var.f113443h) {
            return;
        }
        md3Var.f113443h = true;
        String lowerCase = wc3Var.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String message = ue0Var.getMessage();
        if (message == null) {
            message = "";
        }
        pd3 pd3Var = md3Var.f113441f;
        pd3Var.getClass();
        pd3Var.a(MapsKt.mutableMapOf(TuplesKt.to("status", "error"), TuplesKt.to("failure_reason", lowerCase), TuplesKt.to("error_message", message)));
    }
}
