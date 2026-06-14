package gg;

import gg.k;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class n {

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f72830r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f72831s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ y f72832t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object f72833u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y yVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f72832t = yVar;
            this.f72833u = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f72832t, this.f72833u, continuation);
            aVar.f72831s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objG = pf.b.g();
            int i10 = this.f72830r;
            try {
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    y yVar = this.f72832t;
                    Object obj2 = this.f72833u;
                    Result.Companion companion = Result.f93230c;
                    this.f72830r = 1;
                    if (yVar.w(obj2, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                objB = Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            return k.b(Result.j(objB) ? k.f72824b.c(Unit.f93236a) : k.f72824b.a(Result.g(objB)));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final Object a(y yVar, Object obj) {
        Object objE = yVar.e(obj);
        if (objE instanceof k.c) {
            return ((k) eg.h.b(null, new a(yVar, obj, null), 1, null)).k();
        }
        return k.f72824b.c(Unit.f93236a);
    }
}
