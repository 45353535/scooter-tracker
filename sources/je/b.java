package je;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class b implements CoroutineScope {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f85825f = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f85826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ze.a f85827h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ie.c f85828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected re.b f85829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected se.c f85830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f85831e;

    @NotNull
    private volatile /* synthetic */ int received;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: je.b$b, reason: collision with other inner class name */
    static final class C1025b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f85832r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f85833s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f85835u;

        C1025b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f85833s = obj;
            this.f85835u |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    static {
        KType kTypeO = null;
        KClass kClassB = v0.b(Object.class);
        try {
            kTypeO = v0.o(Object.class);
        } catch (Throwable unused) {
        }
        f85827h = new ze.a("CustomResponse", new ff.a(kClassB, kTypeO));
        f85826g = AtomicIntegerFieldUpdater.newUpdater(b.class, "received");
    }

    public b(ie.c client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f85828b = client;
        this.received = 0;
    }

    static /* synthetic */ Object h(b bVar, Continuation continuation) {
        return bVar.e().a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (r7 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ff.a r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.b.a(ff.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    protected boolean b() {
        return this.f85831e;
    }

    public final ie.c c() {
        return this.f85828b;
    }

    public final re.b d() {
        re.b bVar = this.f85829c;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    public final se.c e() {
        se.c cVar = this.f85830d;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("response");
        return null;
    }

    protected Object f(Continuation continuation) {
        return h(this, continuation);
    }

    public final ze.b getAttributes() {
        return d().getAttributes();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return e().getCoroutineContext();
    }

    protected final void i(re.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f85829c = bVar;
    }

    protected final void j(se.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f85830d = cVar;
    }

    public final void k(se.c response) {
        Intrinsics.checkNotNullParameter(response, "response");
        j(response);
    }

    public String toString() {
        return "HttpClientCall[" + d().getUrl() + ", " + e().d() + ']';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(ie.c client, re.e requestData, re.h responseData) {
        this(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        i(new re.a(this, requestData));
        j(new se.a(this, responseData));
        ze.b attributes = getAttributes();
        ze.a aVar = f85827h;
        attributes.f(aVar);
        if (responseData.a() instanceof io.ktor.utils.io.e) {
            return;
        }
        getAttributes().e(aVar, responseData.a());
    }
}
