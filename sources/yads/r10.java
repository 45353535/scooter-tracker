package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class r10 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f115262e = "yandex_tracking_events";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f115263f = "yandex_linear_creative_info";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f115264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd1 f115265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p10 f115266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vm3 f115267d;

    public /* synthetic */ r10(Context context, dm2 dm2Var) {
        this(new xm3(), new pd1(context, dm2Var, new dj(context, dm2Var, null, 12)));
    }

    public static p10 a() {
        return new p10(new up0(new xm3()), new xm3());
    }

    public static vm3 b() {
        return new vm3(new l53(), "CreativeExtension", "Tracking");
    }

    public r10(xm3 xm3Var, pd1 pd1Var) {
        this.f115264a = xm3Var;
        this.f115265b = pd1Var;
        this.f115266c = a();
        this.f115267d = b();
    }
}
