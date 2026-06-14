package yads;

import android.content.Context;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class d32 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f109739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f32 f109740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4 f109741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f109742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dx1 f109743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hg2 f109744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m30 f109745i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d32(f32 f32Var, c4 c4Var, Context context, dx1 dx1Var, hg2 hg2Var, m30 m30Var, Continuation continuation) {
        super(2, continuation);
        this.f109740d = f32Var;
        this.f109741e = c4Var;
        this.f109742f = context;
        this.f109743g = dx1Var;
        this.f109744h = hg2Var;
        this.f109745i = m30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        d32 d32Var = new d32(this.f109740d, this.f109741e, this.f109742f, this.f109743g, this.f109744h, this.f109745i, continuation);
        d32Var.f109739c = obj;
        return d32Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d32) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objG = pf.b.g();
        int i10 = this.f109738b;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                f32 f32Var = this.f109740d;
                c4 c4Var = this.f109741e;
                Context context = this.f109742f;
                dx1 dx1Var = this.f109743g;
                hg2 hg2Var = this.f109744h;
                m30 m30Var = this.f109745i;
                Result.Companion companion = Result.f93230c;
                x22 x22Var = f32Var.f110591b;
                this.f109738b = 1;
                x22Var.getClass();
                obj = eg.g.g(eg.o0.b(), new w22(c4Var, x22Var, context, dx1Var, m30Var, hg2Var, null), this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            objB = Result.b((dx1) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            return null;
        }
        return objB;
    }
}
