package f1;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes6.dex */
public final class q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f70815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8 f70816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f70817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x7 f70818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c7 f70819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CoroutineDispatcher f70820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f70821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f70822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function0 f70823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f70824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicLong f70825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f70826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Mutex f70827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f70828n;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70829r;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return q8.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f70829r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                q8 q8Var = q8.this;
                this.f70829r = 1;
                if (q8Var.b(this) == objG) {
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
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f70831r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f70832s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f70833t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f70835v;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f70833t = obj;
            this.f70835v |= Integer.MIN_VALUE;
            return q8.this.b(this);
        }
    }

    public q8(CoroutineScope cacheScope, p8 storage, t0 downloader, x7 policyManager, c7 notifier, CoroutineDispatcher ioDispatcher, Function0 cacheSizeBytesProvider, long j10, Function0 ttlMillisProvider) {
        Intrinsics.checkNotNullParameter(cacheScope, "cacheScope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(policyManager, "policyManager");
        Intrinsics.checkNotNullParameter(notifier, "notifier");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(cacheSizeBytesProvider, "cacheSizeBytesProvider");
        Intrinsics.checkNotNullParameter(ttlMillisProvider, "ttlMillisProvider");
        this.f70815a = cacheScope;
        this.f70816b = storage;
        this.f70817c = downloader;
        this.f70818d = policyManager;
        this.f70819e = notifier;
        this.f70820f = ioDispatcher;
        this.f70821g = cacheSizeBytesProvider;
        this.f70822h = j10;
        this.f70823i = ttlMillisProvider;
        this.f70824j = new ConcurrentHashMap();
        this.f70825k = new AtomicLong(0L);
        this.f70826l = new AtomicBoolean(false);
        this.f70827m = ng.f.b(false, 1, null);
        this.f70828n = new ConcurrentHashMap();
        eg.i.d(cacheScope, ioDispatcher, null, new a(null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.q8.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
