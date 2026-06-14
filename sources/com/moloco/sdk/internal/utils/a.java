package com.moloco.sdk.internal.utils;

import eg.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.moloco.sdk.internal.utils.a$a, reason: collision with other inner class name */
    public static final class C0684a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55772r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55773s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f55774t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Mutex f55775u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1 f55776v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0684a(Mutex mutex, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f55775u = mutex;
            this.f55776v = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0684a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0684a(this.f55775u, this.f55776v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            Function1 function1;
            Mutex mutex2;
            Throwable th2;
            Object objG = pf.b.g();
            int i10 = this.f55774t;
            try {
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    mutex = this.f55775u;
                    function1 = this.f55776v;
                    this.f55772r = mutex;
                    this.f55773s = function1;
                    this.f55774t = 1;
                    if (mutex.lock(null, this) != objG) {
                    }
                    return objG;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.f55772r;
                    try {
                        kotlin.d.b(obj);
                        mutex2.unlock(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        mutex2.unlock(null);
                        throw th2;
                    }
                }
                function1 = (Function1) this.f55773s;
                Mutex mutex3 = (Mutex) this.f55772r;
                kotlin.d.b(obj);
                mutex = mutex3;
                this.f55772r = mutex;
                this.f55773s = null;
                this.f55774t = 2;
                Object objInvoke = function1.invoke(this);
                if (objInvoke != objG) {
                    mutex2 = mutex;
                    obj = objInvoke;
                    mutex2.unlock(null);
                    return obj;
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

    public static final Object a(Mutex mutex, Function1 function1, Continuation continuation) {
        f fVar = new f(mutex);
        return continuation.getContext().get(fVar) != null ? function1.invoke(continuation) : g.g(new e(fVar), new C0684a(mutex, function1, null), continuation);
    }
}
