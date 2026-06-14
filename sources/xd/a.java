package xd;

import eg.f0;
import eg.i;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public class a extends wd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineScope f108170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f108171b;

    /* JADX INFO: renamed from: xd.a$a, reason: collision with other inner class name */
    static final class C1333a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f108172r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f108173s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f108174t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Runnable f108175u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ a f108176v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1333a(long j10, Runnable runnable, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f108174t = j10;
            this.f108175u = runnable;
            this.f108176v = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C1333a c1333a = new C1333a(this.f108174t, this.f108175u, this.f108176v, continuation);
            c1333a.f108173s = obj;
            return c1333a;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:42|(1:(1:(8:6|7|29|30|44|31|32|33)(2:9|10))(2:11|12))(8:16|17|(3:19|(1:21)|27)|30|44|31|32|33)|22|23|(1:25)(1:28)|29|30|44|31|32|33) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        
            if (((wd.c) r9).d(r3, r8) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r8.f108172r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r8.f108173s
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L5f
                goto L5d
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r1 = r8.f108173s
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L26
                goto L43
            L26:
                r9 = move-exception
                goto L6b
            L28:
                kotlin.d.b(r9)
                java.lang.Object r9 = r8.f108173s
                r1 = r9
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                long r4 = r8.f108174t     // Catch: java.lang.Throwable -> L26
                r6 = 0
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 <= 0) goto L43
                r8.f108173s = r1     // Catch: java.lang.Throwable -> L26
                r8.f108172r = r3     // Catch: java.lang.Throwable -> L26
                java.lang.Object r9 = eg.k0.a(r4, r8)     // Catch: java.lang.Throwable -> L26
                if (r9 != r0) goto L43
                goto L59
            L43:
                java.lang.Runnable r9 = r8.f108175u     // Catch: java.lang.Throwable -> L26
                boolean r3 = r9 instanceof wd.c     // Catch: java.lang.Throwable -> L5f
                if (r3 == 0) goto L5a
                wd.c r9 = (wd.c) r9     // Catch: java.lang.Throwable -> L5f
                kotlin.coroutines.CoroutineContext r3 = r1.getCoroutineContext()     // Catch: java.lang.Throwable -> L5f
                r8.f108173s = r1     // Catch: java.lang.Throwable -> L5f
                r8.f108172r = r2     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r9 = r9.d(r3, r8)     // Catch: java.lang.Throwable -> L5f
                if (r9 != r0) goto L5d
            L59:
                return r0
            L5a:
                r9.run()     // Catch: java.lang.Throwable -> L5f
            L5d:
                kotlin.Unit r9 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L5f
            L5f:
                xd.a r9 = r8.f108176v
                java.lang.Runnable r0 = r8.f108175u
                r9.d(r0)     // Catch: java.lang.Throwable -> L68
                kotlin.Unit r9 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L68
            L68:
                kotlin.Unit r9 = kotlin.Unit.f93236a
                return r9
            L6b:
                xd.a r0 = r8.f108176v
                java.lang.Runnable r1 = r8.f108175u
                r0.d(r1)     // Catch: java.lang.Throwable -> L74
                kotlin.Unit r0 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L74
            L74:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: xd.a.C1333a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1333a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public a(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f108170a = coroutineScope;
        this.f108171b = new ConcurrentHashMap();
    }

    @Override // wd.a
    protected void d(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Job job = (Job) this.f108171b.remove(task);
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
    }

    @Override // wd.a
    protected void e(Runnable task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        Job jobD = i.d(this.f108170a, null, f0.f69147c, new C1333a(j10, task, this, null), 1, null);
        this.f108171b.put(task, jobD);
        jobD.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(CoroutineContext coroutineContext) {
        this(kotlinx.coroutines.i.a(coroutineContext));
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
    }
}
