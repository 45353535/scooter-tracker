package com.moloco.sdk.internal.error.crash;

import com.moloco.sdk.internal.error.crash.c;
import eg.g;
import java.lang.Thread;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements com.moloco.sdk.internal.error.crash.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f54221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f54222b;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54223r;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        public static final void c(c cVar, Thread thread, Throwable th2) {
            d dVar = cVar.f54221a;
            Intrinsics.checkNotNull(th2);
            dVar.a(th2);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = cVar.f54222b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            } else {
                System.exit(2);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54223r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            if (c.this.f54222b == null) {
                c.this.f54222b = Thread.getDefaultUncaughtExceptionHandler();
                final c cVar = c.this;
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.moloco.sdk.internal.error.crash.b
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th2) {
                        c.a.c(cVar, thread, th2);
                    }
                });
            }
            return Unit.f93236a;
        }
    }

    public c(d crashHandler) {
        Intrinsics.checkNotNullParameter(crashHandler, "crashHandler");
        this.f54221a = crashHandler;
    }

    @Override // com.moloco.sdk.internal.error.crash.a
    public Object a(Continuation continuation) {
        Object objG = g.g(com.moloco.sdk.internal.scheduling.c.a().getMain(), new a(null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }
}
