package oe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yh.d f96772a = df.a.a("io.ktor.client.plugins.HttpRequestLifecycle");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final pe.b f96773b = pe.i.c("RequestLifecycle", new Function1() { // from class: oe.d0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return g0.d((pe.d) obj);
        }
    });

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96774r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f96775s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96776t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ pe.d f96777u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(pe.d dVar, Continuation continuation) {
            super(3, continuation);
            this.f96777u = dVar;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(re.d dVar, Function1 function1, Continuation continuation) {
            a aVar = new a(this.f96777u, continuation);
            aVar.f96775s = dVar;
            aVar.f96776t = function1;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            eg.s sVar;
            Object objG = pf.b.g();
            int i10 = this.f96774r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (eg.s) this.f96775s;
                try {
                    kotlin.d.b(obj);
                    sVar.complete();
                    return Unit.f93236a;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        sVar.d(th);
                        throw th;
                    } catch (Throwable th3) {
                        sVar.complete();
                        throw th3;
                    }
                }
            }
            kotlin.d.b(obj);
            re.d dVar = (re.d) this.f96775s;
            Function1 function1 = (Function1) this.f96776t;
            eg.s sVarA = eg.m1.a(dVar.g());
            CoroutineContext.Element element = this.f96777u.b().getCoroutineContext().get(Job.N8);
            Intrinsics.checkNotNull(element);
            g0.f(sVarA, (Job) element);
            try {
                dVar.n(sVarA);
                this.f96775s = sVarA;
                this.f96774r = 1;
                if (function1.invoke(this) == objG) {
                    return objG;
                }
                sVar = sVarA;
                sVar.complete();
                return Unit.f93236a;
            } catch (Throwable th4) {
                th = th4;
                sVar = sVarA;
                sVar.d(th);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(pe.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.f(k1.f96816a, new a(createClientPlugin, null));
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final eg.s sVar, Job job) {
        final eg.p0 p0VarQ = job.q(new Function1() { // from class: oe.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.g(sVar, (Throwable) obj);
            }
        });
        sVar.q(new Function1() { // from class: oe.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.h(p0VarQ, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(eg.s sVar, Throwable th2) {
        if (th2 != null) {
            f96772a.i("Cancelling request because engine Job failed with error: " + th2);
            kotlinx.coroutines.z.d(sVar, "Engine failed", th2);
        } else {
            f96772a.i("Cancelling request because engine Job completed");
            sVar.complete();
        }
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(eg.p0 p0Var, Throwable th2) {
        p0Var.dispose();
        return Unit.f93236a;
    }

    public static final pe.b i() {
        return f96773b;
    }
}
