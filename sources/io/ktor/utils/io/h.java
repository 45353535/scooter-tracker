package io.ktor.utils.io;

import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82107r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f82108s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f82109t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f82110u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f82111v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82110u = obj;
            this.f82111v |= Integer.MIN_VALUE;
            return h.b(null, null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82112r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f82113s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f82114t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        long f82115u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f82116v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f82117w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82116v = obj;
            this.f82117w |= Integer.MIN_VALUE;
            return h.c(null, null, 0L, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82118r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        long f82119s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f82120t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f82121u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f82122v;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82121u = obj;
            this.f82122v |= Integer.MIN_VALUE;
            return h.d(null, 0L, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82123r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f82124s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f82125t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f82126u;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82125t = obj;
            this.f82126u |= Integer.MIN_VALUE;
            return h.f(null, 0, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82127r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f82128s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f82129t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f82130u;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82129t = obj;
            this.f82130u |= Integer.MIN_VALUE;
            return h.g(null, this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82131r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f82132s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f82133t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f82134u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f82135v;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82134u = obj;
            this.f82135v |= Integer.MIN_VALUE;
            return h.h(null, 0, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82136r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f82137s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f82138t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f82139u;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82138t = obj;
            this.f82139u |= Integer.MIN_VALUE;
            return h.j(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.h$h, reason: collision with other inner class name */
    static final class C0991h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82140r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f82141s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f82142t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f82143u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f82144v;

        C0991h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82143u = obj;
            this.f82144v |= Integer.MIN_VALUE;
            return h.i(null, 0L, this);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82145r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f82146s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f82147t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f82148u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f82149v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f82150w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f82151x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f82152y;

        i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82151x = obj;
            this.f82152y |= Integer.MIN_VALUE;
            return h.k(null, null, 0, 0, this);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f82153r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Job f82154s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Job job, Continuation continuation) {
            super(1, continuation);
            this.f82154s = job;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return new j(this.f82154s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f82153r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Job job = this.f82154s;
                this.f82153r = 1;
                if (job.i0(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((j) create(continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82155r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f82156s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f82157t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function2 f82158u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.a f82159v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Function2 function2, io.ktor.utils.io.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f82158u = function2;
            this.f82159v = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            k kVar = new k(this.f82158u, this.f82159v, continuation);
            kVar.f82157t = obj;
            return kVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
        
            if (r1.i0(r11) == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
        
            if (r1.i0(r11) != r0) goto L32;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v6, types: [eg.s, kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r11.f82156s
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L39
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L26
                if (r1 == r3) goto L26
                if (r1 == r2) goto L1d
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                java.lang.Object r0 = r11.f82157t
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.d.b(r12)
                goto Lc3
            L26:
                kotlin.d.b(r12)
                goto Lb1
            L2b:
                java.lang.Object r1 = r11.f82155r
                eg.s r1 = (eg.s) r1
                java.lang.Object r5 = r11.f82157t
                kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                kotlin.d.b(r12)     // Catch: java.lang.Throwable -> L37
                goto L6b
            L37:
                r12 = move-exception
                goto L9a
            L39:
                kotlin.d.b(r12)
                java.lang.Object r12 = r11.f82157t
                kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
                kotlin.coroutines.CoroutineContext r1 = r12.getCoroutineContext()
                kotlinx.coroutines.Job r1 = kotlinx.coroutines.z.o(r1)
                eg.s r1 = kotlinx.coroutines.z.a(r1)
                kotlin.jvm.functions.Function2 r7 = r11.f82158u     // Catch: java.lang.Throwable -> L37
                io.ktor.utils.io.f0 r8 = new io.ktor.utils.io.f0     // Catch: java.lang.Throwable -> L37
                io.ktor.utils.io.a r9 = r11.f82159v     // Catch: java.lang.Throwable -> L37
                kotlin.coroutines.CoroutineContext r10 = r12.getCoroutineContext()     // Catch: java.lang.Throwable -> L37
                kotlin.coroutines.CoroutineContext r10 = r10.plus(r1)     // Catch: java.lang.Throwable -> L37
                r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L37
                r11.f82157t = r12     // Catch: java.lang.Throwable -> L37
                r11.f82155r = r1     // Catch: java.lang.Throwable -> L37
                r11.f82156s = r5     // Catch: java.lang.Throwable -> L37
                java.lang.Object r5 = r7.invoke(r8, r11)     // Catch: java.lang.Throwable -> L37
                if (r5 != r0) goto L6a
                goto Lc1
            L6a:
                r5 = r12
            L6b:
                r1.complete()     // Catch: java.lang.Throwable -> L37
                kotlin.coroutines.CoroutineContext r12 = r5.getCoroutineContext()     // Catch: java.lang.Throwable -> L37
                kotlinx.coroutines.Job r12 = kotlinx.coroutines.z.o(r12)     // Catch: java.lang.Throwable -> L37
                boolean r12 = r12.isCancelled()     // Catch: java.lang.Throwable -> L37
                if (r12 == 0) goto L8d
                io.ktor.utils.io.a r12 = r11.f82159v     // Catch: java.lang.Throwable -> L37
                kotlin.coroutines.CoroutineContext r5 = r5.getCoroutineContext()     // Catch: java.lang.Throwable -> L37
                kotlinx.coroutines.Job r5 = kotlinx.coroutines.z.o(r5)     // Catch: java.lang.Throwable -> L37
                java.util.concurrent.CancellationException r5 = r5.W()     // Catch: java.lang.Throwable -> L37
                r12.a(r5)     // Catch: java.lang.Throwable -> L37
            L8d:
                r11.f82157t = r6
                r11.f82155r = r6
                r11.f82156s = r4
                java.lang.Object r12 = r1.i0(r11)
                if (r12 != r0) goto Lb1
                goto Lc1
            L9a:
                java.lang.String r4 = "Exception thrown while reading from channel"
                kotlinx.coroutines.z.d(r1, r4, r12)     // Catch: java.lang.Throwable -> Lb4
                io.ktor.utils.io.a r4 = r11.f82159v     // Catch: java.lang.Throwable -> Lb4
                io.ktor.utils.io.n.b(r4, r12)     // Catch: java.lang.Throwable -> Lb4
                r11.f82157t = r6
                r11.f82155r = r6
                r11.f82156s = r3
                java.lang.Object r12 = r1.i0(r11)
                if (r12 != r0) goto Lb1
                goto Lc1
            Lb1:
                kotlin.Unit r12 = kotlin.Unit.f93236a
                return r12
            Lb4:
                r12 = move-exception
                r11.f82157t = r12
                r11.f82155r = r6
                r11.f82156s = r2
                java.lang.Object r1 = r1.i0(r11)
                if (r1 != r0) goto Lc2
            Lc1:
                return r0
            Lc2:
                r0 = r12
            Lc3:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f82160r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f82161s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f82162t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f82163u;

        l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82162t = obj;
            this.f82163u |= Integer.MIN_VALUE;
            return h.t(null, null, this);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f82164r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f82165s;

        m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f82164r = obj;
            this.f82165s |= Integer.MIN_VALUE;
            return h.u(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (r0 != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #1 {all -> 0x00a9, blocks: (B:27:0x0073, B:29:0x0079, B:38:0x00af, B:46:0x00ca), top: B:57:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x00a9, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a9, blocks: (B:27:0x0073, B:29:0x0079, B:38:0x00af, B:46:0x00ca), top: B:57:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r14v0, types: [io.ktor.utils.io.e] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [io.ktor.utils.io.k] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [io.ktor.utils.io.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [io.ktor.utils.io.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.e] */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a6 -> B:20:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(io.ktor.utils.io.e r14, io.ktor.utils.io.k r15, kotlin.coroutines.Continuation r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.b(io.ktor.utils.io.e, io.ktor.utils.io.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        if (io.ktor.utils.io.e.b.a(r1, 0, r13, r7, null) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
    
        if (r0 != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.k] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d9 -> B:20:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(io.ktor.utils.io.e r17, io.ktor.utils.io.k r18, long r19, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.c(io.ktor.utils.io.e, io.ktor.utils.io.k, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004d -> B:26:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0060 -> B:25:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(io.ktor.utils.io.e r10, long r11, kotlin.coroutines.Continuation r13) throws java.io.EOFException {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.h.c
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.h$c r0 = (io.ktor.utils.io.h.c) r0
            int r1 = r0.f82122v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82122v = r1
            goto L18
        L13:
            io.ktor.utils.io.h$c r0 = new io.ktor.utils.io.h$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f82121u
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f82122v
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            long r10 = r0.f82120t
            long r4 = r0.f82119s
            java.lang.Object r12 = r0.f82118r
            io.ktor.utils.io.e r12 = (io.ktor.utils.io.e) r12
            kotlin.d.b(r13)
            goto L63
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            kotlin.d.b(r13)
            r4 = r11
        L3d:
            r6 = 0
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 <= 0) goto L7b
            boolean r13 = r10.h()
            if (r13 != 0) goto L7b
            int r13 = e(r10)
            if (r13 != 0) goto L66
            r0.f82118r = r10
            r0.f82119s = r4
            r0.f82120t = r11
            r0.f82122v = r3
            r13 = 0
            r2 = 0
            java.lang.Object r13 = io.ktor.utils.io.e.b.a(r10, r13, r0, r3, r2)
            if (r13 != r1) goto L60
            return r1
        L60:
            r8 = r11
            r12 = r10
            r10 = r8
        L63:
            r8 = r10
            r10 = r12
            r11 = r8
        L66:
            pg.s r13 = r10.g()
            long r6 = hf.e.b(r13)
            long r6 = java.lang.Math.min(r11, r6)
            pg.s r13 = r10.g()
            hf.e.a(r13, r6)
            long r11 = r11 - r6
            goto L3d
        L7b:
            long r4 = r4 - r11
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.b.e(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.d(io.ktor.utils.io.e, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final int e(io.ktor.utils.io.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return (int) eVar.g().getBuffer().s();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(io.ktor.utils.io.e r5, int r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.h.d
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.h$d r0 = (io.ktor.utils.io.h.d) r0
            int r1 = r0.f82126u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82126u = r1
            goto L18
        L13:
            io.ktor.utils.io.h$d r0 = new io.ktor.utils.io.h$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f82125t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f82126u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r6 = r0.f82124s
            java.lang.Object r5 = r0.f82123r
            io.ktor.utils.io.e r5 = (io.ktor.utils.io.e) r5
            kotlin.d.b(r7)
            goto L4f
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.d.b(r7)
            boolean r7 = r5.h()
            if (r7 == 0) goto L42
            return r3
        L42:
            r0.f82123r = r5
            r0.f82124s = r6
            r0.f82126u = r4
            java.lang.Object r7 = r5.d(r6, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L58
            return r3
        L58:
            pg.s r5 = r5.g()
            pg.s r5 = r5.peek()
            qg.a r5 = pg.d.b(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.f(io.ktor.utils.io.e, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(io.ktor.utils.io.e r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.h.e
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.h$e r0 = (io.ktor.utils.io.h.e) r0
            int r1 = r0.f82130u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82130u = r1
            goto L18
        L13:
            io.ktor.utils.io.h$e r0 = new io.ktor.utils.io.h$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f82129t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f82130u
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f82128s
            pg.a r5 = (pg.a) r5
            java.lang.Object r2 = r0.f82127r
            io.ktor.utils.io.e r2 = (io.ktor.utils.io.e) r2
            kotlin.d.b(r6)
            r6 = r5
            r5 = r2
            goto L43
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.d.b(r6)
            pg.a r6 = new pg.a
            r6.<init>()
        L43:
            boolean r2 = r5.h()
            if (r2 != 0) goto L5f
            pg.s r2 = r5.g()
            r6.f0(r2)
            r0.f82127r = r5
            r0.f82128s = r6
            r0.f82130u = r3
            r2 = 0
            r4 = 0
            java.lang.Object r2 = io.ktor.utils.io.e.b.a(r5, r2, r0, r3, r4)
            if (r2 != r1) goto L43
            return r1
        L5f:
            java.lang.Throwable r5 = r5.b()
            if (r5 != 0) goto L66
            return r6
        L66:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.g(io.ktor.utils.io.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:24:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006a -> B:23:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(io.ktor.utils.io.e r11, int r12, kotlin.coroutines.Continuation r13) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.h(io.ktor.utils.io.e, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(io.ktor.utils.io.e r8, long r9, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof io.ktor.utils.io.h.C0991h
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.h$h r0 = (io.ktor.utils.io.h.C0991h) r0
            int r1 = r0.f82144v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82144v = r1
            goto L18
        L13:
            io.ktor.utils.io.h$h r0 = new io.ktor.utils.io.h$h
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f82143u
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f82144v
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            long r8 = r0.f82142t
            java.lang.Object r10 = r0.f82141s
            pg.r r10 = (pg.r) r10
            java.lang.Object r2 = r0.f82140r
            io.ktor.utils.io.e r2 = (io.ktor.utils.io.e) r2
            kotlin.d.b(r11)
            r11 = r10
            r9 = r8
            r8 = r2
            goto L45
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.d.b(r11)
            pg.r r11 = hf.c.a()
        L45:
            boolean r2 = r8.h()
            if (r2 != 0) goto L8d
            r4 = 0
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 <= 0) goto L8d
            pg.s r2 = r8.g()
            long r6 = hf.e.b(r2)
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 < 0) goto L73
            pg.s r2 = r8.g()
            long r4 = hf.e.b(r2)
            long r4 = r9 - r4
            pg.s r9 = r8.g()
            long r9 = r9.Q(r11)
            kotlin.coroutines.jvm.internal.b.e(r9)
            goto L7a
        L73:
            pg.s r2 = r8.g()
            r2.c0(r11, r9)
        L7a:
            r0.f82140r = r8
            r0.f82141s = r11
            r0.f82142t = r4
            r0.f82144v = r3
            r9 = 0
            r10 = 0
            java.lang.Object r9 = io.ktor.utils.io.e.b.a(r8, r9, r0, r3, r10)
            if (r9 != r1) goto L8b
            return r1
        L8b:
            r9 = r4
            goto L45
        L8d:
            pg.a r8 = r11.getBuffer()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.i(io.ktor.utils.io.e, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(io.ktor.utils.io.e r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.h.g
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.h$g r0 = (io.ktor.utils.io.h.g) r0
            int r1 = r0.f82139u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82139u = r1
            goto L18
        L13:
            io.ktor.utils.io.h$g r0 = new io.ktor.utils.io.h$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f82138t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f82139u
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f82137s
            pg.r r5 = (pg.r) r5
            java.lang.Object r2 = r0.f82136r
            io.ktor.utils.io.e r2 = (io.ktor.utils.io.e) r2
            kotlin.d.b(r6)
            r6 = r5
            r5 = r2
            goto L42
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.d.b(r6)
            pg.r r6 = hf.c.a()
        L42:
            boolean r2 = r5.h()
            if (r2 != 0) goto L5e
            pg.s r2 = r5.g()
            r6.f0(r2)
            r0.f82136r = r5
            r0.f82137s = r6
            r0.f82139u = r3
            r2 = 0
            r4 = 0
            java.lang.Object r2 = io.ktor.utils.io.e.b.a(r5, r2, r0, r3, r4)
            if (r2 != r1) goto L42
            return r1
        L5e:
            r(r5)
            pg.a r5 = r6.getBuffer()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.j(io.ktor.utils.io.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (io.ktor.utils.io.e.b.a(r20, 0, r2, 1, null) == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0171, code lost:
    
        if (r13.s() >= r4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0173, code lost:
    
        r2.f82145r = r8;
        r2.f82146s = r15;
        r2.f82147t = r14;
        r2.f82148u = r13;
        r2.f82149v = r4;
        r2.f82150w = r0;
        r2.f82152y = 3;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
    
        if (io.ktor.utils.io.e.b.a(r8, 0, r2, 1, null) != r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0188, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a8, code lost:
    
        throw new gf.d("Line exceeds limit of " + r4 + " characters");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01cb: INVOKE (r14 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: wf.a.a(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void throws java.lang.Exception (m)] (LINE:460), block:B:81:0x01cb */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb A[Catch: all -> 0x004f, LOOP:0: B:38:0x00cb->B:62:0x0161, LOOP_START, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x0047, B:36:0x00c5, B:38:0x00cb, B:40:0x00d5, B:42:0x00e1, B:44:0x00eb, B:49:0x0105, B:51:0x0115, B:53:0x0135, B:52:0x012c, B:58:0x0148, B:62:0x0161, B:63:0x0166, B:65:0x0173, B:69:0x018d, B:70:0x01a8, B:71:0x01a9, B:74:0x01b4, B:76:0x01be, B:21:0x006e), top: B:85:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115 A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x0047, B:36:0x00c5, B:38:0x00cb, B:40:0x00d5, B:42:0x00e1, B:44:0x00eb, B:49:0x0105, B:51:0x0115, B:53:0x0135, B:52:0x012c, B:58:0x0148, B:62:0x0161, B:63:0x0166, B:65:0x0173, B:69:0x018d, B:70:0x01a8, B:71:0x01a9, B:74:0x01b4, B:76:0x01be, B:21:0x006e), top: B:85:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012c A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x0047, B:36:0x00c5, B:38:0x00cb, B:40:0x00d5, B:42:0x00e1, B:44:0x00eb, B:49:0x0105, B:51:0x0115, B:53:0x0135, B:52:0x012c, B:58:0x0148, B:62:0x0161, B:63:0x0166, B:65:0x0173, B:69:0x018d, B:70:0x01a8, B:71:0x01a9, B:74:0x01b4, B:76:0x01be, B:21:0x006e), top: B:85:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a9 A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x0047, B:36:0x00c5, B:38:0x00cb, B:40:0x00d5, B:42:0x00e1, B:44:0x00eb, B:49:0x0105, B:51:0x0115, B:53:0x0135, B:52:0x012c, B:58:0x0148, B:62:0x0161, B:63:0x0166, B:65:0x0173, B:69:0x018d, B:70:0x01a8, B:71:0x01a9, B:74:0x01b4, B:76:0x01be, B:21:0x006e), top: B:85:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [pg.a] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, pg.a] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0186 -> B:68:0x0189). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(io.ktor.utils.io.e r20, java.lang.Appendable r21, int r22, int r23, kotlin.coroutines.Continuation r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.k(io.ktor.utils.io.e, java.lang.Appendable, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final void l(int i10, int i11) throws IOException {
        if (d0.f(i10, i11)) {
            return;
        }
        throw new IOException("Unexpected line ending " + ((Object) d0.k(i11)) + ", while expected " + ((Object) d0.k(i10)));
    }

    public static final Object m(io.ktor.utils.io.e eVar, qg.a aVar, io.ktor.utils.io.k kVar, long j10, boolean z10, Continuation continuation) {
        return new io.ktor.utils.io.c(eVar, aVar, kVar, j10).g(z10, continuation);
    }

    public static final e0 n(CoroutineScope coroutineScope, CoroutineContext coroutineContext, final io.ktor.utils.io.a channel, Function2 block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        Job jobD = eg.i.d(coroutineScope, coroutineContext, null, new k(block, channel, null), 2, null);
        jobD.q(new Function1() { // from class: io.ktor.utils.io.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.p(channel, (Throwable) obj);
            }
        });
        return new e0(q.a(channel, new j(jobD, null)), jobD);
    }

    public static final e0 o(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z10, Function2 block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return n(coroutineScope, coroutineContext, new io.ktor.utils.io.a(false, 1, null), block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(io.ktor.utils.io.a aVar, Throwable th2) {
        if (th2 != null && !aVar.h()) {
            aVar.a(th2);
        }
        return Unit.f93236a;
    }

    public static final void q(io.ktor.utils.io.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Throwable thB = aVar.b();
        if (thB != null) {
            throw thB;
        }
    }

    public static final void r(io.ktor.utils.io.e eVar) throws Throwable {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Throwable thB = eVar.b();
        if (thB != null) {
            throw thB;
        }
    }

    public static final void s(io.ktor.utils.io.k kVar) throws Throwable {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Throwable thB = kVar.b();
        if (thB != null) {
            throw thB;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (d(r5, r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object t(io.ktor.utils.io.e r5, qg.a r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.h.l
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.h$l r0 = (io.ktor.utils.io.h.l) r0
            int r1 = r0.f82163u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82163u = r1
            goto L18
        L13:
            io.ktor.utils.io.h$l r0 = new io.ktor.utils.io.h$l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f82162t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f82163u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r7)
            goto L6e
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f82161s
            r6 = r5
            qg.a r6 = (qg.a) r6
            java.lang.Object r5 = r0.f82160r
            io.ktor.utils.io.e r5 = (io.ktor.utils.io.e) r5
            kotlin.d.b(r7)
            goto L55
        L41:
            kotlin.d.b(r7)
            int r7 = r6.f()
            r0.f82160r = r5
            r0.f82161s = r6
            r0.f82163u = r4
            java.lang.Object r7 = f(r5, r7, r0)
            if (r7 != r1) goto L55
            goto L6d
        L55:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r6)
            if (r7 == 0) goto L73
            int r6 = r6.f()
            long r6 = (long) r6
            r2 = 0
            r0.f82160r = r2
            r0.f82161s = r2
            r0.f82163u = r3
            java.lang.Object r5 = d(r5, r6, r0)
            if (r5 != r1) goto L6e
        L6d:
            return r1
        L6e:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r5
        L73:
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.t(io.ktor.utils.io.e, qg.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object u(io.ktor.utils.io.e r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.h.m
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.h$m r0 = (io.ktor.utils.io.h.m) r0
            int r1 = r0.f82165s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82165s = r1
            goto L18
        L13:
            io.ktor.utils.io.h$m r0 = new io.ktor.utils.io.h$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f82164r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f82165s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.d.b(r5)
            r0.f82165s = r3
            java.lang.Object r5 = g(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            pg.a r5 = (pg.a) r5
            r4 = 0
            r0 = 0
            byte[] r4 = hf.b.b(r5, r4, r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.h.u(io.ktor.utils.io.e, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
