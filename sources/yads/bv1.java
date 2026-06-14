package yads;

import android.content.Context;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class bv1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f109127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ai1 f109128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f109129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cv1 f109130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t9 f109131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f109132h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv1(Context context, ai1 ai1Var, String str, cv1 cv1Var, t9 t9Var, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f109127c = context;
        this.f109128d = ai1Var;
        this.f109129e = str;
        this.f109130f = cv1Var;
        this.f109131g = t9Var;
        this.f109132h = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new bv1(this.f109127c, this.f109128d, this.f109129e, this.f109130f, this.f109131g, this.f109132h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bv1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        bl3 bl3Var;
        su1 su1Var;
        Object objG = pf.b.g();
        int i10 = this.f109126b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            ev1 ev1VarA = ev1.f110476c.a(this.f109127c);
            if (ev1VarA.f110479b.size() != ev1VarA.f110478a) {
                if (!ev1VarA.f110479b.containsKey(this.f109128d) && this.f109129e != null) {
                    aq2 aq2Var = this.f109130f.f109614a;
                    Context context = this.f109127c;
                    String str = this.f109131g.G;
                    if (str != null) {
                        bl3.f109041c.getClass();
                        bl3Var = (bl3) bl3.f109042d.get(str);
                        if (bl3Var == null) {
                            bl3Var = bl3.f109043e;
                        }
                    } else {
                        bl3Var = bl3.f109043e;
                    }
                    zk3 zk3Var = new zk3(bl3Var);
                    aq2Var.getClass();
                    try {
                        su1Var = new su1(context, zk3Var, 4);
                    } catch (Throwable unused) {
                        su1Var = null;
                    }
                    if (su1Var == null) {
                        return Unit.f93236a;
                    }
                    ai1 ai1Var = this.f109128d;
                    String str2 = this.f109129e;
                    boolean z10 = this.f109132h;
                    this.f109126b = 1;
                    kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(this), 1);
                    eVar.I();
                    zu1 zu1Var = new zu1(ev1VarA, ai1Var, new av1(z10, eVar));
                    if (ev1VarA.f110479b.size() < ev1VarA.f110478a) {
                        ev1VarA.f110479b.put(ai1Var, su1Var);
                    }
                    su1Var.a(str2, zu1Var);
                    if (!z10 && eVar.isActive()) {
                        Result.Companion companion = Result.f93230c;
                        eVar.resumeWith(Result.b(Unit.f93236a));
                    }
                    Object objC = eVar.C();
                    if (objC == pf.b.g()) {
                        kotlin.coroutines.jvm.internal.g.c(this);
                    }
                    if (objC == objG) {
                        return objG;
                    }
                }
            }
            return Unit.f93236a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.d.b(obj);
        return Unit.f93236a;
    }
}
