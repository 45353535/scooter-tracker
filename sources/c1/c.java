package c1;

import android.content.Context;
import b1.e;
import e1.a;
import eg.o0;
import f1.eg;
import f1.j;
import f1.l9;
import f1.n9;
import f1.o5;
import f1.rd;
import f1.v8;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import lf.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements c1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d1.d f6481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f6482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f6483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l9 f6484f;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final v8 invoke() {
            return o5.b(c.this.getMediation());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        public final void a() {
            c.this.f6481c.g(new e1.b(null, c.this), new e1.a(a.EnumC0857a.f68679g, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: c1.c$c, reason: collision with other inner class name */
    public static final class C0145c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f6487r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Context f6489t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0145c(Context context, Continuation continuation) {
            super(2, continuation);
            this.f6489t = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0145c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new C0145c(this.f6489t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f6487r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                l9 l9Var = c.this.f6484f;
                Context context = this.f6489t;
                this.f6487r = 1;
                if (l9Var.a(context, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                ((Result) obj).l();
            }
            return Unit.f93236a;
        }
    }

    public c(String location, d1.d callback, e eVar) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f6480b = location;
        this.f6481c = callback;
        this.f6482d = eVar;
        this.f6483e = i.a(new a());
        this.f6484f = new n9(e(), callback, this, rd.f70996b);
    }

    private final v8 e() {
        return (v8) this.f6483e.getValue();
    }

    private final void g() {
        try {
            rd.f70996b.d().c().b(new b());
        } catch (Exception e10) {
            eg.j("Interstitial ad cannot post session not started callback " + e10, null, 2, null);
        }
    }

    public void c() {
        if (b1.b.h()) {
            e().x(this, this.f6481c);
        } else {
            g();
        }
    }

    public void d() {
        this.f6484f.c();
    }

    public boolean f() {
        return this.f6484f.a();
    }

    @Override // c1.a
    public String getLocation() {
        return this.f6480b;
    }

    @Override // c1.a
    public e getMediation() {
        return this.f6482d;
    }

    public void h() {
        Context contextA = j.f70133a.a();
        if (contextA == null) {
            g();
        } else {
            eg.i.d(kotlinx.coroutines.i.a(o0.c()), null, null, new C0145c(contextA, null), 3, null);
        }
    }
}
