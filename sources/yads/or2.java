package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes4.dex */
public final class or2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Mutex f114397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pr2 f114398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z41 f114399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f114400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pr2 f114401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z41 f114402g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or2(pr2 pr2Var, z41 z41Var, Continuation continuation) {
        super(2, continuation);
        this.f114401f = pr2Var;
        this.f114402g = z41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new or2(this.f114401f, this.f114402g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new or2(this.f114401f, this.f114402g, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        pr2 pr2Var;
        z41 z41Var;
        Mutex mutex2;
        Throwable th2;
        Object objG = pf.b.g();
        int i10 = this.f114400e;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                this.f114401f.f114752a.a(u5.f116506j, null);
                mutex = pr2.f114751d;
                pr2Var = this.f114401f;
                z41Var = this.f114402g;
                this.f114397b = mutex;
                this.f114398c = pr2Var;
                this.f114399d = z41Var;
                this.f114400e = 1;
                if (mutex.lock(null, this) != objG) {
                }
                return objG;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = this.f114397b;
                try {
                    kotlin.d.b(obj);
                    cs2 cs2Var = (cs2) obj;
                    mutex2.unlock(null);
                    return cs2Var;
                } catch (Throwable th3) {
                    th2 = th3;
                    mutex2.unlock(null);
                    throw th2;
                }
            }
            z41Var = this.f114399d;
            pr2Var = this.f114398c;
            Mutex mutex3 = this.f114397b;
            kotlin.d.b(obj);
            mutex = mutex3;
            pr2Var.f114752a.a(u5.f116506j);
            this.f114397b = mutex;
            this.f114398c = pr2Var;
            this.f114399d = z41Var;
            this.f114400e = 2;
            kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(this), 1);
            eVar.I();
            eVar.v(new mr2(pr2Var));
            pr2Var.f114754c.a(pr2Var.f114753b, z41Var, new nr2(eVar));
            Object objC = eVar.C();
            if (objC == pf.b.g()) {
                kotlin.coroutines.jvm.internal.g.c(this);
            }
            if (objC != objG) {
                mutex2 = mutex;
                obj = objC;
                cs2 cs2Var2 = (cs2) obj;
                mutex2.unlock(null);
                return cs2Var2;
            }
            return objG;
        } catch (Throwable th4) {
            mutex2 = mutex;
            th2 = th4;
            mutex2.unlock(null);
            throw th2;
        }
    }
}
