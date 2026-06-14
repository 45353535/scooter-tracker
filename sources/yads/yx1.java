package yads;

import android.content.Context;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class yx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es2 f118427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4 f118428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5 f118429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f118430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f118431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ay1 f118432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f32 f118433g;

    public /* synthetic */ yx1(Context context, es2 es2Var, c4 c4Var, v5 v5Var, CoroutineScope coroutineScope) {
        Context applicationContext = context.getApplicationContext();
        rx1 rx1Var = new rx1(new u42(c4Var, es2Var, context, v5Var, coroutineScope));
        this(es2Var, c4Var, v5Var, coroutineScope, applicationContext, new ay1(c4Var, es2Var, rx1Var), new f32(context, es2Var, v5Var, rx1Var, coroutineScope));
    }

    public final void a() {
        f32 f32Var = this.f118433g;
        x22 x22Var = f32Var.f110591b;
        u42 u42Var = x22Var.f117691c;
        td0 td0Var = u42Var.f116490b;
        synchronized (td0Var.f116204d) {
            td0Var.f116202b.a();
            Unit unit = Unit.f93236a;
        }
        u42Var.f116491c.a();
        x22Var.f117689a.getClass();
        x22Var.f117690b.getClass();
        f32Var.f110592c.a();
        kotlinx.coroutines.i.f(f32Var.f110590a, null, 1, null);
    }

    public yx1(es2 es2Var, c4 c4Var, v5 v5Var, CoroutineScope coroutineScope, Context context, ay1 ay1Var, f32 f32Var) {
        this.f118427a = es2Var;
        this.f118428b = c4Var;
        this.f118429c = v5Var;
        this.f118430d = coroutineScope;
        this.f118431e = context;
        this.f118432f = ay1Var;
        this.f118433g = f32Var;
    }
}
