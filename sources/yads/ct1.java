package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ct1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f109568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ es2 f109569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xz f109570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct1(Context context, es2 es2Var, xz xzVar) {
        super(0);
        this.f109568b = context;
        this.f109569c = es2Var;
        this.f109570d = xzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f109568b;
        es2 es2Var = this.f109569c;
        xz xzVar = this.f109570d;
        if (!new jl().a()) {
            pr3 pr3Var = (pr3) es2Var;
            eg.i.d(kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.b()).plus(new k10(pr3Var.a()))), null, null, new et1(context, pr3Var, null), 3, null);
            new el3(new xg2()).a();
            Context applicationContext = context.getApplicationContext();
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            if (sb.a(applicationContext) && !p33.a() && !atomicBoolean.getAndSet(true)) {
                wa1.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
            }
            Object obj = gs1.f111327f;
            es1.a(es2Var).a(context, xzVar);
        }
        return Unit.f93236a;
    }
}
