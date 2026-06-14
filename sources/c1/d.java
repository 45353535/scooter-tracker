package c1;

import android.content.Context;
import d1.e;
import e1.a;
import eg.o0;
import f1.d6;
import f1.eg;
import f1.j;
import f1.k5;
import f1.l9;
import f1.o5;
import f1.rd;
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
public final class d implements c1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f6491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b1.e f6492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f6493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l9 f6494f;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final k5 invoke() {
            return o5.c(d.this.getMediation());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        public final void a() {
            d.this.f6491c.g(new e1.b(null, d.this), new e1.a(a.EnumC0857a.f68679g, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f6497r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Context f6499t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, Continuation continuation) {
            super(2, continuation);
            this.f6499t = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new c(this.f6499t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f6497r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                l9 l9Var = d.this.f6494f;
                Context context = this.f6499t;
                this.f6497r = 1;
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

    public d(String location, e callback, b1.e eVar) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f6490b = location;
        this.f6491c = callback;
        this.f6492d = eVar;
        this.f6493e = i.a(new a());
        this.f6494f = new d6(e(), callback, this, rd.f70996b);
    }

    private final k5 e() {
        return (k5) this.f6493e.getValue();
    }

    private final void g() {
        try {
            rd.f70996b.d().c().b(new b());
        } catch (Exception e10) {
            eg.j("Rewarded ad cannot post session not started callback " + e10, null, 2, null);
        }
    }

    public void c() {
        if (b1.b.h()) {
            e().x(this, this.f6491c);
        } else {
            g();
        }
    }

    public void d() {
        this.f6494f.c();
    }

    public boolean f() {
        return this.f6494f.a();
    }

    @Override // c1.a
    public String getLocation() {
        return this.f6490b;
    }

    @Override // c1.a
    public b1.e getMediation() {
        return this.f6492d;
    }

    public void h() {
        Context contextA = j.f70133a.a();
        if (contextA == null) {
            g();
        } else {
            eg.i.d(kotlinx.coroutines.i.a(o0.c()), null, null, new c(contextA, null), 3, null);
        }
    }
}
