package pf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    public static final class a extends i {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f98309r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function1 f98310s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, Function1 function1) {
            super(continuation);
            this.f98310s = function1;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f98309r;
            if (i10 == 0) {
                this.f98309r = 1;
                kotlin.d.b(obj);
                Intrinsics.checkNotNull(this.f98310s, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function1) b1.g(this.f98310s, 1)).invoke(this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f98309r = 2;
            kotlin.d.b(obj);
            return obj;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f98311r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function1 f98312s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, CoroutineContext coroutineContext, Function1 function1) {
            super(continuation, coroutineContext);
            this.f98312s = function1;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f98311r;
            if (i10 == 0) {
                this.f98311r = 1;
                kotlin.d.b(obj);
                Intrinsics.checkNotNull(this.f98312s, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function1) b1.g(this.f98312s, 1)).invoke(this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f98311r = 2;
            kotlin.d.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: pf.c$c, reason: collision with other inner class name */
    public static final class C1162c extends i {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f98313r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function2 f98314s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f98315t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1162c(Continuation continuation, Function2 function2, Object obj) {
            super(continuation);
            this.f98314s = function2;
            this.f98315t = obj;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f98313r;
            if (i10 == 0) {
                this.f98313r = 1;
                kotlin.d.b(obj);
                Intrinsics.checkNotNull(this.f98314s, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) b1.g(this.f98314s, 2)).invoke(this.f98315t, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f98313r = 2;
            kotlin.d.b(obj);
            return obj;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f98316r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function2 f98317s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f98318t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Continuation continuation, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(continuation, coroutineContext);
            this.f98317s = function2;
            this.f98318t = obj;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f98316r;
            if (i10 == 0) {
                this.f98316r = 1;
                kotlin.d.b(obj);
                Intrinsics.checkNotNull(this.f98317s, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) b1.g(this.f98317s, 2)).invoke(this.f98318t, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f98316r = 2;
            kotlin.d.b(obj);
            return obj;
        }
    }

    public static final class e extends i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Continuation continuation) {
            super(continuation);
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            kotlin.d.b(obj);
            return obj;
        }
    }

    public static final class f extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Continuation continuation, CoroutineContext coroutineContext) {
            super(continuation, coroutineContext);
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            kotlin.d.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation a(Function1 function1, Continuation completion) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation continuationA = g.a(completion);
        if (function1 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function1).create(continuationA);
        }
        CoroutineContext context = continuationA.getContext();
        return context == kotlin.coroutines.e.f93267b ? new a(continuationA, function1) : new b(continuationA, context, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation b(Function2 function2, Object obj, Continuation completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation continuationA = g.a(completion);
        if (function2 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function2).create(obj, continuationA);
        }
        CoroutineContext context = continuationA.getContext();
        return context == kotlin.coroutines.e.f93267b ? new C1162c(continuationA, function2, obj) : new d(continuationA, context, function2, obj);
    }

    private static final Continuation c(Continuation continuation) {
        CoroutineContext context = continuation.getContext();
        return context == kotlin.coroutines.e.f93267b ? new e(continuation) : new f(continuation, context);
    }

    public static Continuation d(Continuation continuation) {
        Continuation continuationIntercepted;
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        kotlin.coroutines.jvm.internal.d dVar = continuation instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) continuation : null;
        return (dVar == null || (continuationIntercepted = dVar.intercepted()) == null) ? continuation : continuationIntercepted;
    }

    public static Object e(Function2 function2, Object obj, Continuation completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function2) b1.g(function2, 2)).invoke(obj, c(g.a(completion)));
    }

    public static Object f(Function3 function3, Object obj, Object obj2, Continuation completion) {
        Intrinsics.checkNotNullParameter(function3, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function3) b1.g(function3, 3)).invoke(obj, obj2, c(g.a(completion)));
    }
}
