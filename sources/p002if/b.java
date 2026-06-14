package p002if;

import eg.e0;
import eg.s;
import io.ktor.utils.io.e;
import io.ktor.utils.io.r;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.z;
import pg.j;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f74728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext f74729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f74730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pg.a f74731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f74732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CoroutineContext f74733g;

    static final class a extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74734r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f74735s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f74737u;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f74735s = obj;
            this.f74737u |= Integer.MIN_VALUE;
            return b.this.d(0, this);
        }
    }

    /* JADX INFO: renamed from: if.b$b, reason: collision with other inner class name */
    static final class C0925b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74738r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f74740t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0925b(int i10, Continuation continuation) {
            super(2, continuation);
            this.f74740t = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new C0925b(this.f74740t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f74738r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            long jL = 0;
            while (hf.e.b(b.this.f74731e) < this.f74740t && jL >= 0) {
                try {
                    jL = b.this.f74728b.L(b.this.f74731e, Long.MAX_VALUE);
                } catch (EOFException unused) {
                    jL = -1;
                }
            }
            if (jL == -1) {
                b.this.f74728b.close();
                b.this.i().complete();
                b.this.f74730d = new r(null);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0925b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public b(j source, CoroutineContext parent) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f74728b = source;
        this.f74729c = parent;
        this.f74731e = new pg.a();
        s sVarA = z.a((Job) parent.get(Job.N8));
        this.f74732f = sVarA;
        this.f74733g = parent.plus(sVarA).plus(new e0("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.e
    public void a(Throwable th2) {
        String message;
        String message2;
        if (this.f74730d != null) {
            return;
        }
        s sVar = this.f74732f;
        String str = "Channel was cancelled";
        if (th2 == null || (message = th2.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        z.d(sVar, message, th2);
        this.f74728b.close();
        if (th2 != null && (message2 = th2.getMessage()) != null) {
            str = message2;
        }
        this.f74730d = new r(new IOException(str, th2));
    }

    @Override // io.ktor.utils.io.e
    public Throwable b() {
        r rVar = this.f74730d;
        if (rVar != null) {
            return r.c(rVar, null, 1, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(int r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof if.b.a
            if (r0 == 0) goto L13
            r0 = r7
            if.b$a r0 = (if.b.a) r0
            int r1 = r0.f74737u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74737u = r1
            goto L18
        L13:
            if.b$a r0 = new if.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f74735s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f74737u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r6 = r0.f74734r
            kotlin.d.b(r7)
            goto L52
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.d.b(r7)
            io.ktor.utils.io.r r7 = r5.f74730d
            if (r7 == 0) goto L3f
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r6
        L3f:
            kotlin.coroutines.CoroutineContext r7 = r5.f74733g
            if.b$b r2 = new if.b$b
            r4 = 0
            r2.<init>(r6, r4)
            r0.f74734r = r6
            r0.f74737u = r3
            java.lang.Object r7 = eg.g.g(r7, r2, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            pg.a r7 = r5.f74731e
            long r0 = hf.e.b(r7)
            long r6 = (long) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L5e
            goto L5f
        L5e:
            r3 = 0
        L5f:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p002if.b.d(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io.ktor.utils.io.e
    public pg.s g() {
        return this.f74731e;
    }

    @Override // io.ktor.utils.io.e
    public boolean h() {
        return this.f74730d != null && this.f74731e.exhausted();
    }

    public final s i() {
        return this.f74732f;
    }
}
