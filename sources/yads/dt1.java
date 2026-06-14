package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class dt1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f110051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ es2 f110052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xz f110053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt1(Context context, es2 es2Var, xz xzVar) {
        super(0);
        this.f110051b = context;
        this.f110052c = es2Var;
        this.f110053d = xzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f110051b;
        es2 es2Var = this.f110052c;
        xz xzVar = this.f110053d;
        pr3 pr3Var = (pr3) es2Var;
        eg.i.d(kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.b()).plus(new k10(pr3Var.a()))), null, null, new et1(context, pr3Var, null), 3, null);
        xzVar.onInitializationCompleted();
        return Unit.f93236a;
    }
}
