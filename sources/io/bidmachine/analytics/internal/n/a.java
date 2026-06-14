package io.bidmachine.analytics.internal.n;

import android.content.Context;
import eg.m1;
import io.bidmachine.analytics.ReaderConfig;
import java.util.List;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import lf.i;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends io.bidmachine.analytics.internal.h.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f79670d = i.a(d.f79688a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Job f79671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0956a f79672f;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.n.a$a, reason: collision with other inner class name */
    public static final class C0956a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f79673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f79674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.bidmachine.analytics.internal.h.c f79675c;

        public C0956a(long j10, List list, io.bidmachine.analytics.internal.h.c cVar) {
            this.f79673a = j10;
            this.f79674b = list;
            this.f79675c = cVar;
        }

        public final io.bidmachine.analytics.internal.h.c a() {
            return this.f79675c;
        }

        public final long b() {
            return this.f79673a;
        }

        public final List c() {
            return this.f79674b;
        }
    }

    static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f79676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f79677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f79678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f79679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f79680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ C0956a f79681f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a f79682g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0956a c0956a, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f79681f = c0956a;
            this.f79682g = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f79681f, this.f79682g, continuation);
            bVar.f79680e = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
        
            r11 = r7;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b8 -> B:11:0x0041). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r10.f79679d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L39
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r10.f79680e
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.d.b(r11)
                goto L41
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                java.lang.Object r1 = r10.f79678c
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r10.f79677b
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Object r6 = r10.f79676a
                io.bidmachine.analytics.internal.n.a r6 = (io.bidmachine.analytics.internal.n.a) r6
                java.lang.Object r7 = r10.f79680e
                kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
                kotlin.d.b(r11)
                kotlin.Result r11 = (kotlin.Result) r11
                java.lang.Object r11 = r11.l()
                goto L7e
            L39:
                kotlin.d.b(r11)
                java.lang.Object r11 = r10.f79680e
                r1 = r11
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            L41:
                boolean r11 = kotlinx.coroutines.i.i(r1)
                if (r11 == 0) goto Lba
                io.bidmachine.analytics.internal.n.a$a r11 = r10.f79681f
                java.util.List r11 = r11.c()
                io.bidmachine.analytics.internal.n.a r5 = r10.f79682g
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r11 = r11.iterator()
                r9 = r1
                r1 = r11
                r11 = r9
                r9 = r6
                r6 = r5
                r5 = r9
            L5e:
                boolean r7 = r1.hasNext()
                if (r7 == 0) goto L8e
                java.lang.Object r7 = r1.next()
                io.bidmachine.analytics.ReaderConfig$Rule r7 = (io.bidmachine.analytics.ReaderConfig.Rule) r7
                r10.f79680e = r11
                r10.f79676a = r6
                r10.f79677b = r5
                r10.f79678c = r1
                r10.f79679d = r3
                java.lang.Object r7 = io.bidmachine.analytics.internal.n.a.a(r6, r7, r10)
                if (r7 != r0) goto L7b
                goto Lb7
            L7b:
                r9 = r7
                r7 = r11
                r11 = r9
            L7e:
                boolean r8 = kotlin.Result.i(r11)
                if (r8 == 0) goto L85
                r11 = r4
            L85:
                io.bidmachine.analytics.internal.h.c$a r11 = (io.bidmachine.analytics.internal.h.c.a) r11
                if (r11 == 0) goto L8c
                r5.add(r11)
            L8c:
                r11 = r7
                goto L5e
            L8e:
                java.util.List r5 = (java.util.List) r5
                io.bidmachine.analytics.internal.n.a r1 = r10.f79682g
                boolean r1 = r1.c()
                if (r1 == 0) goto La1
                io.bidmachine.analytics.internal.n.a$a r1 = r10.f79681f
                io.bidmachine.analytics.internal.h.c r1 = r1.a()
                r1.a(r5)
            La1:
                io.bidmachine.analytics.internal.n.a$a r1 = r10.f79681f
                long r5 = r1.b()
                r10.f79680e = r11
                r10.f79676a = r4
                r10.f79677b = r4
                r10.f79678c = r4
                r10.f79679d = r2
                java.lang.Object r1 = eg.k0.a(r5, r10)
                if (r1 != r0) goto Lb8
            Lb7:
                return r0
            Lb8:
                r1 = r11
                goto L41
            Lba:
                kotlin.Unit r11 = kotlin.Unit.f93236a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.n.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f79683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f79684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f79685c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79687e;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f79685c = obj;
            this.f79687e |= Integer.MIN_VALUE;
            Object objB = a.this.b(null, this);
            return objB == pf.b.g() ? objB : Result.a(objB);
        }
    }

    static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f79688a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope invoke() {
            return kotlinx.coroutines.i.a(m1.b(null, 1, null).plus(io.bidmachine.analytics.internal.a.d.f79505g.a().c()));
        }
    }

    public abstract Object a(ReaderConfig.Rule rule, Continuation continuation);

    public boolean c() {
        return true;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void e(Context context) {
        Job job = this.f79671e;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        Job job = this.f79671e;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        C0956a c0956a = this.f79672f;
        if (c0956a == null) {
            return;
        }
        this.f79671e = eg.i.d(b(), null, null, new b(c0956a, this, null), 3, null);
    }

    @Override // io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(C0956a c0956a) {
        this.f79672f = c0956a;
    }

    public final CoroutineScope b() {
        return (CoroutineScope) this.f79670d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(io.bidmachine.analytics.ReaderConfig.Rule r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.bidmachine.analytics.internal.n.a.c
            if (r0 == 0) goto L13
            r0 = r10
            io.bidmachine.analytics.internal.n.a$c r0 = (io.bidmachine.analytics.internal.n.a.c) r0
            int r1 = r0.f79687e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79687e = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.n.a$c r0 = new io.bidmachine.analytics.internal.n.a$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f79685c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f79687e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.f79684b
            io.bidmachine.analytics.ReaderConfig$Rule r9 = (io.bidmachine.analytics.ReaderConfig.Rule) r9
            java.lang.Object r0 = r0.f79683a
            r1 = r0
            io.bidmachine.analytics.internal.n.a r1 = (io.bidmachine.analytics.internal.n.a) r1
            kotlin.d.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L50
        L32:
            r0 = move-exception
            r10 = r0
            goto L5b
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            kotlin.d.b(r10)
            kotlin.Result$Companion r10 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L58
            r0.f79683a = r8     // Catch: java.lang.Throwable -> L58
            r0.f79684b = r9     // Catch: java.lang.Throwable -> L58
            r0.f79687e = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r10 = r8.a(r9, r0)     // Catch: java.lang.Throwable -> L58
            if (r10 != r1) goto L4f
            return r1
        L4f:
            r1 = r8
        L50:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L32
            java.lang.Object r10 = kotlin.Result.b(r10)     // Catch: java.lang.Throwable -> L32
        L56:
            r3 = r9
            goto L66
        L58:
            r0 = move-exception
            r10 = r0
            r1 = r8
        L5b:
            kotlin.Result$Companion r0 = kotlin.Result.f93230c
            java.lang.Object r10 = kotlin.d.a(r10)
            java.lang.Object r10 = kotlin.Result.b(r10)
            goto L56
        L66:
            boolean r9 = kotlin.Result.i(r10)
            if (r9 == 0) goto L6e
            r9 = 0
            goto L6f
        L6e:
            r9 = r10
        L6f:
            r4 = r9
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L81
            io.bidmachine.analytics.internal.h.c$a r2 = new io.bidmachine.analytics.internal.h.c$a
            r6 = 4
            r7 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r9 = kotlin.Result.b(r2)
            goto Lbf
        L81:
            java.lang.Throwable r9 = kotlin.Result.g(r10)
            boolean r10 = r9 instanceof java.util.concurrent.CancellationException
            if (r10 != 0) goto Lc0
            boolean r10 = r9 instanceof java.io.FileNotFoundException
            if (r10 == 0) goto L90
            io.bidmachine.analytics.internal.g.e$a r10 = io.bidmachine.analytics.internal.g.e.a.READER_NO_CONTENT
            goto La0
        L90:
            boolean r10 = r9 instanceof java.lang.SecurityException
            if (r10 == 0) goto L97
            io.bidmachine.analytics.internal.g.e$a r10 = io.bidmachine.analytics.internal.g.e.a.READER_NO_ACCESS
            goto La0
        L97:
            boolean r10 = r9 instanceof java.lang.IllegalStateException
            if (r10 == 0) goto L9e
            io.bidmachine.analytics.internal.g.e$a r10 = io.bidmachine.analytics.internal.g.e.a.READER_BAD_CONTENT
            goto La0
        L9e:
            io.bidmachine.analytics.internal.g.e$a r10 = io.bidmachine.analytics.internal.g.e.a.READER_INVALID
        La0:
            if (r9 == 0) goto La8
            java.lang.String r9 = io.bidmachine.analytics.internal.a.e.a(r9)
            if (r9 != 0) goto Laa
        La8:
            java.lang.String r9 = ""
        Laa:
            io.bidmachine.analytics.internal.h.c$a r2 = new io.bidmachine.analytics.internal.h.c$a
            io.bidmachine.analytics.internal.g.e r5 = new io.bidmachine.analytics.internal.g.e
            java.lang.String r0 = r1.a()
            r5.<init>(r0, r10, r9)
            r6 = 2
            r7 = 0
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r9 = kotlin.Result.b(r2)
        Lbf:
            return r9
        Lc0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.n.a.b(io.bidmachine.analytics.ReaderConfig$Rule, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
