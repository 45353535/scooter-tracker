package tc;

import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pd.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements tc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineScope f105065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ic.j f105066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f105067c;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105068r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ic.f f105070t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f105071u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ id.f f105072v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ic.f fVar, boolean z10, id.f fVar2, Continuation continuation) {
            super(2, continuation);
            this.f105070t = fVar;
            this.f105071u = z10;
            this.f105072v = fVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l.this.new a(this.f105070t, this.f105071u, this.f105072v, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            if (r3.j(r4, r5, r6, r7, r9) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r9.f105068r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r10)
                goto L51
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                kotlin.d.b(r10)
                goto L2e
            L1e:
                kotlin.d.b(r10)
                tc.l r10 = tc.l.this
                ic.f r1 = r9.f105070t
                r9.f105068r = r3
                java.lang.Object r10 = tc.l.m(r10, r1, r9)
                if (r10 != r0) goto L2e
                goto L50
            L2e:
                r4 = r10
                android.view.View r4 = (android.view.View) r4
                if (r4 == 0) goto L51
                ic.f r10 = r9.f105070t
                boolean r1 = r9.f105071u
                tc.l r3 = tc.l.this
                id.f r6 = r9.f105072v
                id.a r5 = r10.h()
                tc.b r5 = tc.f.a(r5, r1)
                boolean r7 = r10.i()
                r9.f105068r = r2
                r8 = r9
                java.lang.Object r10 = r3.j(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L51
            L50:
                return r0
            L51:
                kotlin.Unit r10 = kotlin.Unit.f93236a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: tc.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105073r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ic.g f105075t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ id.f f105076u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ic.g gVar, id.f fVar, Continuation continuation) {
            super(2, continuation);
            this.f105075t = gVar;
            this.f105076u = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l.this.new b(this.f105075t, this.f105076u, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            if (r3.j(r4, r5, r6, true, r9) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r9.f105073r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r10)
                goto L4c
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                kotlin.d.b(r10)
                goto L2e
            L1e:
                kotlin.d.b(r10)
                tc.l r10 = tc.l.this
                ic.g r1 = r9.f105075t
                r9.f105073r = r3
                java.lang.Object r10 = tc.l.n(r10, r1, r9)
                if (r10 != r0) goto L2e
                goto L4b
            L2e:
                r4 = r10
                android.view.View r4 = (android.view.View) r4
                if (r4 == 0) goto L4c
                ic.g r10 = r9.f105075t
                tc.l r3 = tc.l.this
                id.f r6 = r9.f105076u
                id.d r10 = r10.e()
                tc.b r5 = tc.f.b(r10)
                r9.f105073r = r2
                r7 = 1
                r8 = r9
                java.lang.Object r10 = r3.j(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L4c
            L4b:
                return r0
            L4c:
                kotlin.Unit r10 = kotlin.Unit.f93236a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: tc.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f105077r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f105078s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f105079t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f105080u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f105082w;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f105080u = obj;
            this.f105082w |= Integer.MIN_VALUE;
            return l.this.j(null, null, null, false, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105083r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ic.f f105085t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ id.f f105086u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f105087v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Runnable f105088w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ Runnable f105089x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ic.f fVar, id.f fVar2, boolean z10, Runnable runnable, Runnable runnable2, Continuation continuation) {
            super(2, continuation);
            this.f105085t = fVar;
            this.f105086u = fVar2;
            this.f105087v = z10;
            this.f105088w = runnable;
            this.f105089x = runnable2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l.this.new d(this.f105085t, this.f105086u, this.f105087v, this.f105088w, this.f105089x, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r3.h(r4, r5, r6, r7, r8, r9, r11) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r11.f105083r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r12)
                goto L4d
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                kotlin.d.b(r12)
                goto L2e
            L1e:
                kotlin.d.b(r12)
                tc.l r12 = tc.l.this
                ic.f r1 = r11.f105085t
                r11.f105083r = r3
                java.lang.Object r12 = tc.l.m(r12, r1, r11)
                if (r12 != r0) goto L2e
                goto L4c
            L2e:
                r4 = r12
                android.view.View r4 = (android.view.View) r4
                if (r4 == 0) goto L4d
                tc.l r3 = tc.l.this
                id.f r5 = r11.f105086u
                boolean r6 = r11.f105087v
                ic.f r12 = r11.f105085t
                java.lang.Runnable r8 = r11.f105088w
                java.lang.Runnable r9 = r11.f105089x
                boolean r7 = r12.i()
                r11.f105083r = r2
                r10 = r11
                java.lang.Object r12 = r3.h(r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L4d
            L4c:
                return r0
            L4d:
                kotlin.Unit r12 = kotlin.Unit.f93236a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: tc.l.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105090r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ic.g f105092t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ id.f f105093u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f105094v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Runnable f105095w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ Runnable f105096x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ic.g gVar, id.f fVar, boolean z10, Runnable runnable, Runnable runnable2, Continuation continuation) {
            super(2, continuation);
            this.f105092t = gVar;
            this.f105093u = fVar;
            this.f105094v = z10;
            this.f105095w = runnable;
            this.f105096x = runnable2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l.this.new e(this.f105092t, this.f105093u, this.f105094v, this.f105095w, this.f105096x, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        
            if (r3.h(r4, r5, r6, true, r8, r9, r11) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r11.f105090r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r12)
                goto L48
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                kotlin.d.b(r12)
                goto L2e
            L1e:
                kotlin.d.b(r12)
                tc.l r12 = tc.l.this
                ic.g r1 = r11.f105092t
                r11.f105090r = r3
                java.lang.Object r12 = tc.l.n(r12, r1, r11)
                if (r12 != r0) goto L2e
                goto L47
            L2e:
                r4 = r12
                android.view.View r4 = (android.view.View) r4
                if (r4 == 0) goto L48
                tc.l r3 = tc.l.this
                id.f r5 = r11.f105093u
                boolean r6 = r11.f105094v
                java.lang.Runnable r8 = r11.f105095w
                java.lang.Runnable r9 = r11.f105096x
                r11.f105090r = r2
                r7 = 1
                r10 = r11
                java.lang.Object r12 = r3.h(r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L48
            L47:
                return r0
            L48:
                kotlin.Unit r12 = kotlin.Unit.f93236a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: tc.l.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f105097r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f105098s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f105099t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f105100u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f105101v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f105102w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f105103x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f105105z;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f105103x = obj;
            this.f105105z |= Integer.MIN_VALUE;
            return l.this.h(null, null, false, false, null, null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105106r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f105107s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(View view, Continuation continuation) {
            super(2, continuation);
            this.f105107s = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.f105107s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f105106r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            View view = this.f105107s;
            this.f105106r = 1;
            Object objE = k0.e(view, this);
            return objE == objG ? objG : objE;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105108r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ic.f f105109s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ic.f fVar, Continuation continuation) {
            super(2, continuation);
            this.f105109s = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f105109s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f105108r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return this.f105109s.j();
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105110r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ic.g f105111s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ic.g gVar, Continuation continuation) {
            super(2, continuation);
            this.f105111s = gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.f105111s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f105110r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return this.f105111s.f();
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105112r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ic.f f105114t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ id.f f105115u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f105116v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Runnable f105117w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ Runnable f105118x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ic.f fVar, id.f fVar2, boolean z10, Runnable runnable, Runnable runnable2, Continuation continuation) {
            super(2, continuation);
            this.f105114t = fVar;
            this.f105115u = fVar2;
            this.f105116v = z10;
            this.f105117w = runnable;
            this.f105118x = runnable2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l.this.new j(this.f105114t, this.f105115u, this.f105116v, this.f105117w, this.f105118x, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r3.p(r4, r5, r6, r7, r8, r9, r11) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r11.f105112r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r12)
                goto L4d
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                kotlin.d.b(r12)
                goto L2e
            L1e:
                kotlin.d.b(r12)
                tc.l r12 = tc.l.this
                ic.f r1 = r11.f105114t
                r11.f105112r = r3
                java.lang.Object r12 = tc.l.m(r12, r1, r11)
                if (r12 != r0) goto L2e
                goto L4c
            L2e:
                r4 = r12
                android.view.View r4 = (android.view.View) r4
                if (r4 == 0) goto L4d
                tc.l r3 = tc.l.this
                id.f r5 = r11.f105115u
                boolean r6 = r11.f105116v
                ic.f r12 = r11.f105114t
                java.lang.Runnable r8 = r11.f105117w
                java.lang.Runnable r9 = r11.f105118x
                boolean r7 = r12.i()
                r11.f105112r = r2
                r10 = r11
                java.lang.Object r12 = r3.p(r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L4d
            L4c:
                return r0
            L4d:
                kotlin.Unit r12 = kotlin.Unit.f93236a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: tc.l.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f105119r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f105120s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f105121t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f105122u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f105123v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f105124w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f105125x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f105127z;

        k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f105125x = obj;
            this.f105127z |= Integer.MIN_VALUE;
            return l.this.p(null, null, false, false, null, null, this);
        }
    }

    /* JADX INFO: renamed from: tc.l$l, reason: collision with other inner class name */
    static final class C1310l extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105128r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ic.f f105130t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1310l(ic.f fVar, Continuation continuation) {
            super(2, continuation);
            this.f105130t = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1310l) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l.this.new C1310l(this.f105130t, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if (r1.q(r5, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r4.f105128r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r5)
                goto L3d
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.d.b(r5)
                goto L2e
            L1e:
                kotlin.d.b(r5)
                tc.l r5 = tc.l.this
                ic.f r1 = r4.f105130t
                r4.f105128r = r3
                java.lang.Object r5 = tc.l.m(r5, r1, r4)
                if (r5 != r0) goto L2e
                goto L3c
            L2e:
                android.view.View r5 = (android.view.View) r5
                if (r5 == 0) goto L3d
                tc.l r1 = tc.l.this
                r4.f105128r = r2
                java.lang.Object r5 = r1.q(r5, r4)
                if (r5 != r0) goto L3d
            L3c:
                return r0
            L3d:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: tc.l.C1310l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105131r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ic.g f105133t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ic.g gVar, Continuation continuation) {
            super(2, continuation);
            this.f105133t = gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l.this.new m(this.f105133t, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if (r1.q(r5, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r4.f105131r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r5)
                goto L3d
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.d.b(r5)
                goto L2e
            L1e:
                kotlin.d.b(r5)
                tc.l r5 = tc.l.this
                ic.g r1 = r4.f105133t
                r4.f105131r = r3
                java.lang.Object r5 = tc.l.n(r5, r1, r4)
                if (r5 != r0) goto L2e
                goto L3c
            L2e:
                android.view.View r5 = (android.view.View) r5
                if (r5 == 0) goto L3d
                tc.l r1 = tc.l.this
                r4.f105131r = r2
                java.lang.Object r5 = r1.q(r5, r4)
                if (r5 != r0) goto L3d
            L3c:
                return r0
            L3d:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: tc.l.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105134r;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f105134r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            Iterator it = l.this.f105067c.entrySet().iterator();
            while (it.hasNext()) {
                ((tc.b) ((Map.Entry) it.next()).getValue()).b();
            }
            l.this.f105067c.clear();
            return Unit.f93236a;
        }
    }

    public l(CoroutineScope coroutineScope, ic.j coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f105065a = coroutineScope;
        this.f105066b = coroutineDispatchers;
        this.f105067c = new ConcurrentHashMap();
    }

    private final Object i(View view, Continuation continuation) {
        return eg.g.g(this.f105066b.i(), new g(view, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(ic.f fVar, Continuation continuation) {
        return eg.g.g(this.f105066b.i(), new h(fVar, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(ic.g gVar, Continuation continuation) {
        return eg.g.g(this.f105066b.i(), new i(gVar, null), continuation);
    }

    @Override // tc.d
    public boolean a(int i10) {
        tc.b bVar = (tc.b) this.f105067c.get(Integer.valueOf(i10));
        return bVar != null && bVar.g();
    }

    @Override // tc.d
    public void b(ic.g adPhase) {
        Intrinsics.checkNotNullParameter(adPhase, "adPhase");
        eg.i.d(this.f105065a, this.f105066b.h(), null, new m(adPhase, null), 2, null);
    }

    @Override // tc.d
    public void c(ic.f adElement) {
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        eg.i.d(this.f105065a, this.f105066b.h(), null, new C1310l(adElement, null), 2, null);
    }

    @Override // tc.d
    public void d(ic.g adPhase, id.f eventType) {
        Intrinsics.checkNotNullParameter(adPhase, "adPhase");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        eg.i.d(this.f105065a, this.f105066b.h(), null, new b(adPhase, eventType, null), 2, null);
    }

    @Override // tc.d
    public void e(ic.g adPhase, id.f eventType, boolean z10, Runnable runnable, Runnable runnable2) {
        Intrinsics.checkNotNullParameter(adPhase, "adPhase");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        eg.i.d(this.f105065a, this.f105066b.h(), null, new e(adPhase, eventType, z10, runnable, runnable2, null), 2, null);
    }

    @Override // tc.d
    public void f(ic.f adElement, id.f eventType, boolean z10, Runnable runnable, Runnable runnable2) {
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        eg.i.d(this.f105065a, this.f105066b.h(), null, new j(adElement, eventType, z10, runnable, runnable2, null), 2, null);
    }

    @Override // tc.d
    public void g(ic.f adElement, id.f eventType, boolean z10, Runnable runnable, Runnable runnable2) {
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        eg.i.d(this.f105065a, this.f105066b.h(), null, new d(adElement, eventType, z10, runnable, runnable2, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(android.view.View r9, id.f r10, boolean r11, boolean r12, java.lang.Runnable r13, java.lang.Runnable r14, kotlin.coroutines.Continuation r15) {
        /*
            r8 = this;
            boolean r0 = r15 instanceof tc.l.f
            if (r0 == 0) goto L13
            r0 = r15
            tc.l$f r0 = (tc.l.f) r0
            int r1 = r0.f105105z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f105105z = r1
            goto L18
        L13:
            tc.l$f r0 = new tc.l$f
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f105103x
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f105105z
            r3 = 1
            if (r2 == 0) goto L4f
            if (r2 != r3) goto L47
            boolean r11 = r0.f105102w
            java.lang.Object r9 = r0.f105101v
            tc.b r9 = (tc.b) r9
            java.lang.Object r10 = r0.f105100u
            r14 = r10
            java.lang.Runnable r14 = (java.lang.Runnable) r14
            java.lang.Object r10 = r0.f105099t
            r13 = r10
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            java.lang.Object r10 = r0.f105098s
            id.f r10 = (id.f) r10
            java.lang.Object r12 = r0.f105097r
            android.view.View r12 = (android.view.View) r12
            kotlin.d.b(r15)
            r2 = r9
            r3 = r12
        L42:
            r4 = r10
            r7 = r11
            r5 = r13
            r6 = r14
            goto L89
        L47:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4f:
            kotlin.d.b(r15)
            java.util.Map r15 = r8.f105067c
            int r2 = r9.getId()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.d(r2)
            java.lang.Object r15 = r15.get(r2)
            tc.b r15 = (tc.b) r15
            if (r15 != 0) goto L6f
            if (r13 == 0) goto L69
            r13.run()
        L69:
            if (r14 == 0) goto L8c
            r14.run()
            goto L8c
        L6f:
            if (r12 == 0) goto L86
            r0.f105097r = r9
            r0.f105098s = r10
            r0.f105099t = r13
            r0.f105100u = r14
            r0.f105101v = r15
            r0.f105102w = r11
            r0.f105105z = r3
            java.lang.Object r12 = r8.i(r9, r0)
            if (r12 != r1) goto L86
            return r1
        L86:
            r3 = r9
            r2 = r15
            goto L42
        L89:
            r2.d(r3, r4, r5, r6, r7)
        L8c:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.l.h(android.view.View, id.f, boolean, boolean, java.lang.Runnable, java.lang.Runnable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(android.view.View r5, tc.b r6, id.f r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof tc.l.c
            if (r0 == 0) goto L13
            r0 = r9
            tc.l$c r0 = (tc.l.c) r0
            int r1 = r0.f105082w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f105082w = r1
            goto L18
        L13:
            tc.l$c r0 = new tc.l$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f105080u
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f105082w
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f105079t
            r7 = r5
            id.f r7 = (id.f) r7
            java.lang.Object r5 = r0.f105078s
            r6 = r5
            tc.b r6 = (tc.b) r6
            java.lang.Object r5 = r0.f105077r
            android.view.View r5 = (android.view.View) r5
            kotlin.d.b(r9)
            goto L60
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.d.b(r9)
            java.util.Map r9 = r4.f105067c
            int r2 = r5.getId()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.d(r2)
            r9.put(r2, r6)
            if (r8 == 0) goto L60
            r0.f105077r = r5
            r0.f105078s = r6
            r0.f105079t = r7
            r0.f105082w = r3
            java.lang.Object r8 = r4.i(r5, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            r6.c(r5, r7)
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.l.j(android.view.View, tc.b, id.f, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(android.view.View r9, id.f r10, boolean r11, boolean r12, java.lang.Runnable r13, java.lang.Runnable r14, kotlin.coroutines.Continuation r15) {
        /*
            r8 = this;
            boolean r0 = r15 instanceof tc.l.k
            if (r0 == 0) goto L13
            r0 = r15
            tc.l$k r0 = (tc.l.k) r0
            int r1 = r0.f105127z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f105127z = r1
            goto L18
        L13:
            tc.l$k r0 = new tc.l$k
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f105125x
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f105127z
            r3 = 1
            if (r2 == 0) goto L4f
            if (r2 != r3) goto L47
            boolean r11 = r0.f105124w
            java.lang.Object r9 = r0.f105123v
            tc.b r9 = (tc.b) r9
            java.lang.Object r10 = r0.f105122u
            r14 = r10
            java.lang.Runnable r14 = (java.lang.Runnable) r14
            java.lang.Object r10 = r0.f105121t
            r13 = r10
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            java.lang.Object r10 = r0.f105120s
            id.f r10 = (id.f) r10
            java.lang.Object r12 = r0.f105119r
            android.view.View r12 = (android.view.View) r12
            kotlin.d.b(r15)
            r2 = r9
            r3 = r12
        L42:
            r4 = r10
            r7 = r11
            r5 = r13
            r6 = r14
            goto L89
        L47:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4f:
            kotlin.d.b(r15)
            java.util.Map r15 = r8.f105067c
            int r2 = r9.getId()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.d(r2)
            java.lang.Object r15 = r15.get(r2)
            tc.b r15 = (tc.b) r15
            if (r15 != 0) goto L6f
            if (r13 == 0) goto L69
            r13.run()
        L69:
            if (r14 == 0) goto L8f
            r14.run()
            goto L8f
        L6f:
            if (r12 == 0) goto L86
            r0.f105119r = r9
            r0.f105120s = r10
            r0.f105121t = r13
            r0.f105122u = r14
            r0.f105123v = r15
            r0.f105124w = r11
            r0.f105127z = r3
            java.lang.Object r12 = r8.i(r9, r0)
            if (r12 != r1) goto L86
            return r1
        L86:
            r3 = r9
            r2 = r15
            goto L42
        L89:
            r2.c(r3, r4)
            r2.d(r3, r4, r5, r6, r7)
        L8f:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.l.p(android.view.View, id.f, boolean, boolean, java.lang.Runnable, java.lang.Runnable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object q(View view, Continuation continuation) {
        tc.b bVar = (tc.b) this.f105067c.remove(kotlin.coroutines.jvm.internal.b.d(view.getId()));
        if (bVar != null) {
            bVar.b();
        }
        return Unit.f93236a;
    }

    @Override // tc.d
    public void a(ic.f adElement, boolean z10, id.f eventType) {
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        eg.i.d(this.f105065a, this.f105066b.h(), null, new a(adElement, z10, eventType, null), 2, null);
    }

    @Override // tc.d
    public void a() {
        eg.i.d(this.f105065a, this.f105066b.h(), null, new n(null), 2, null);
    }
}
