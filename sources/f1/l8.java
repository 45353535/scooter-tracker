package f1;

import android.content.Context;
import android.view.View;
import com.appodeal.ads.modules.common.internal.LogConstants;
import e1.c;
import f1.g6;
import f1.oe;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes6.dex */
public final class l8 implements l9 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f70340n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Map f70341o = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5 f70342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1.e f70343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n5 f70344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kd f70345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l5 f70346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final be f70347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f70348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f70349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Mutex f70350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f70351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f70352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Job f70353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f70354m;

    public static final class a {
        public a() {
        }

        public final Map a() {
            return l8.f70341o;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f70355a = new a();

            public a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1722768625;
            }

            public String toString() {
                return "AdClosed";
            }
        }

        /* JADX INFO: renamed from: f1.l8$b$b, reason: collision with other inner class name */
        public static final class C0873b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final gb f70356a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0873b(gb reason) {
                super(null);
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.f70356a = reason;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0873b) && this.f70356a == ((C0873b) obj).f70356a;
            }

            public int hashCode() {
                return this.f70356a.hashCode();
            }

            public String toString() {
                return "AdExpired(reason=" + this.f70356a + ")";
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f70357a = new c();

            public c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 104302499;
            }

            public String toString() {
                return "ClearRequested";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f70358a = new d();

            public d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -812566506;
            }

            public String toString() {
                return "DestroyRequested";
            }
        }

        public static final class e extends b {
            public abstract Throwable a();
        }

        public static final class f extends b {
            public abstract mf a();
        }

        public static final class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f70359a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Throwable exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f70359a = exception;
            }

            public final Throwable a() {
                return this.f70359a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && Intrinsics.areEqual(this.f70359a, ((g) obj).f70359a);
            }

            public int hashCode() {
                return this.f70359a.hashCode();
            }

            public String toString() {
                return "ShowFailed(exception=" + this.f70359a + ")";
            }
        }

        public static final class h extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f70360a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final eg.p f70361b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Context context, eg.p completion) {
                super(null);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(completion, "completion");
                this.f70360a = context;
                this.f70361b = completion;
            }

            public final eg.p a() {
                return this.f70361b;
            }

            public final Context b() {
                return this.f70360a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return Intrinsics.areEqual(this.f70360a, hVar.f70360a) && Intrinsics.areEqual(this.f70361b, hVar.f70361b);
            }

            public int hashCode() {
                return (this.f70360a.hashCode() * 31) + this.f70361b.hashCode();
            }

            public String toString() {
                return "ShowRequested(context=" + this.f70360a + ", completion=" + this.f70361b + ")";
            }
        }

        public static final class i extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final View f70362a;

            public i(View view) {
                super(null);
                this.f70362a = view;
            }

            public final View a() {
                return this.f70362a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && Intrinsics.areEqual(this.f70362a, ((i) obj).f70362a);
            }

            public int hashCode() {
                View view = this.f70362a;
                if (view == null) {
                    return 0;
                }
                return view.hashCode();
            }

            public String toString() {
                return "ShowSucceeded(view=" + this.f70362a + ")";
            }
        }

        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f70363a = new a();

            public a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1843455502;
            }

            public String toString() {
                return LogConstants.EVENT_DESTROYED;
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f70364a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f70364a = exception;
            }

            public final Throwable a() {
                return this.f70364a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f70364a, ((b) obj).f70364a);
            }

            public int hashCode() {
                return this.f70364a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f70364a + ")";
            }
        }

        /* JADX INFO: renamed from: f1.l8$c$c, reason: collision with other inner class name */
        public static final class C0874c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0874c f70365a = new C0874c();

            public C0874c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0874c);
            }

            public int hashCode() {
                return 1837959871;
            }

            public String toString() {
                return "Idle";
            }
        }

        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final mf f70366a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(mf loadedAd) {
                super(null);
                Intrinsics.checkNotNullParameter(loadedAd, "loadedAd");
                this.f70366a = loadedAd;
            }

            public final mf a() {
                return this.f70366a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f70366a, ((d) obj).f70366a);
            }

            public int hashCode() {
                return this.f70366a.hashCode();
            }

            public String toString() {
                return "Loaded(loadedAd=" + this.f70366a + ")";
            }
        }

        public static final class e extends c {
            public abstract eg.p a();
        }

        public static final class f extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final mf f70367a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final eg.p f70368b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(mf adBeingShown, eg.p completion) {
                super(null);
                Intrinsics.checkNotNullParameter(adBeingShown, "adBeingShown");
                Intrinsics.checkNotNullParameter(completion, "completion");
                this.f70367a = adBeingShown;
                this.f70368b = completion;
            }

            public final mf a() {
                return this.f70367a;
            }

            public final eg.p b() {
                return this.f70368b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.f70367a, fVar.f70367a) && Intrinsics.areEqual(this.f70368b, fVar.f70368b);
            }

            public int hashCode() {
                return (this.f70367a.hashCode() * 31) + this.f70368b.hashCode();
            }

            public String toString() {
                return "Showing(adBeingShown=" + this.f70367a + ", completion=" + this.f70368b + ")";
            }
        }

        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class d implements g6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g6 f70369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l8 f70370b;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f70371r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ l8 f70372s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l8 l8Var, Continuation continuation) {
                super(2, continuation);
                this.f70372s = l8Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f70372s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f70371r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    l8 l8Var = this.f70372s;
                    b.a aVar = b.a.f70355a;
                    this.f70371r = 1;
                    if (l8Var.c(aVar, this) == objG) {
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

        public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f70373r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ l8 f70374s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ mf f70375t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l8 l8Var, mf mfVar, Continuation continuation) {
                super(2, continuation);
                this.f70374s = l8Var;
                this.f70375t = mfVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f70374s, this.f70375t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f70373r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                this.f70374s.l(this.f70375t, false);
                return Unit.f93236a;
            }
        }

        public d(g6 g6Var, l8 l8Var) {
            this.f70369a = g6Var;
            this.f70370b = l8Var;
        }

        @Override // f1.g6
        public void a() {
            this.f70369a.a();
        }

        @Override // f1.g6
        public void b() {
            eg.i.d(this.f70370b.f70349h, null, null, new a(this.f70370b, null), 3, null);
            this.f70369a.b();
        }

        @Override // f1.g6
        public void c() {
            g6.a.a(this);
        }

        @Override // f1.g6
        public void d() {
            if (this.f70370b.f70352k) {
                return;
            }
            this.f70369a.d();
            this.f70370b.f70352k = true;
            c cVarT = this.f70370b.t();
            c.f fVar = cVarT instanceof c.f ? (c.f) cVarT : null;
            if (fVar != null) {
                fVar.a();
            }
        }

        @Override // f1.g6
        public void e() {
            this.f70369a.e();
        }

        @Override // f1.g6
        public void a(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f70369a.a(url);
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70376r;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l8.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f70376r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                l8 l8Var = l8.this;
                b.c cVar = b.c.f70357a;
                this.f70376r = 1;
                if (l8Var.c(cVar, this) == objG) {
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

    public static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70378r;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l8.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f70378r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                l8 l8Var = l8.this;
                b.d dVar = b.d.f70358a;
                this.f70378r = 1;
                if (l8Var.c(dVar, this) == objG) {
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

    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f70380r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f70381s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f70382t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f70383u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f70385w;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f70383u = obj;
            this.f70385w |= Integer.MIN_VALUE;
            return l8.this.c(null, this);
        }
    }

    public static final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70386r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f70388t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c f70389u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar, c cVar, Continuation continuation) {
            super(2, continuation);
            this.f70388t = bVar;
            this.f70389u = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l8.this.new h(this.f70388t, this.f70389u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f70386r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                l8 l8Var = l8.this;
                Context contextB = ((b.h) this.f70388t).b();
                mf mfVarA = ((c.d) this.f70389u).a();
                this.f70386r = 1;
                if (l8Var.b(contextB, mfVarA, this) == objG) {
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

    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f70390r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f70391s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f70392t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f70394v;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f70392t = obj;
            this.f70394v |= Integer.MIN_VALUE;
            return l8.this.b(null, null, this);
        }
    }

    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f70395r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f70396s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f70398u;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f70396s = obj;
            this.f70398u |= Integer.MIN_VALUE;
            Object objA = l8.this.a(null, this);
            return objA == pf.b.g() ? objA : Result.a(objA);
        }
    }

    public static final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70399r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f70400s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ l8 f70401t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i10, l8 l8Var, Continuation continuation) {
            super(2, continuation);
            this.f70400s = i10;
            this.f70401t = l8Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.f70400s, this.f70401t, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r9.c(r1, r8) == r0) goto L15;
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
                int r1 = r8.f70399r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r9)
                goto L42
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                kotlin.d.b(r9)
                goto L30
            L1e:
                kotlin.d.b(r9)
                int r9 = r8.f70400s
                long r4 = (long) r9
                r6 = 1000(0x3e8, double:4.94E-321)
                long r4 = r4 * r6
                r8.f70399r = r3
                java.lang.Object r9 = eg.k0.a(r4, r8)
                if (r9 != r0) goto L30
                goto L41
            L30:
                f1.l8 r9 = r8.f70401t
                f1.l8$b$b r1 = new f1.l8$b$b
                f1.gb r3 = f1.gb.f69925b
                r1.<init>(r3)
                r8.f70399r = r2
                java.lang.Object r9 = r9.c(r1, r8)
                if (r9 != r0) goto L42
            L41:
                return r0
            L42:
                kotlin.Unit r9 = kotlin.Unit.f93236a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.l8.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l8(g5 adConfig, b1.e eVar, g6 externalAdContainerListener, n5 viewabilityComponent, kd trackerComponent, l5 telemetryManager, be renderableFactory, y base64Wrapper) {
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(externalAdContainerListener, "externalAdContainerListener");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(renderableFactory, "renderableFactory");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f70342a = adConfig;
        this.f70343b = eVar;
        this.f70344c = viewabilityComponent;
        this.f70345d = trackerComponent;
        this.f70346e = telemetryManager;
        this.f70347f = renderableFactory;
        this.f70348g = base64Wrapper;
        this.f70349h = kotlinx.coroutines.i.a(eg.o0.c().w().plus(eg.m1.b(null, 1, null)));
        this.f70350i = ng.f.b(false, 1, null);
        this.f70351j = c.C0874c.f70365a;
        this.f70354m = new d(externalAdContainerListener, this);
    }

    @Override // f1.l9
    public boolean a() {
        return this.f70351j instanceof c.d;
    }

    @Override // f1.l9
    public void b() {
        eg.i.d(this.f70349h, null, null, new f(null), 3, null);
    }

    @Override // f1.l9
    public void c() {
        eg.i.d(this.f70349h, null, null, new e(null), 3, null);
    }

    public final void f(int i10) {
        Job job = this.f70353l;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f70353l = eg.i.d(this.f70349h, null, null, new k(i10, this, null), 3, null);
    }

    public final void g(c cVar, y2 y2Var) {
        if (this.f70351j instanceof c.a) {
            return;
        }
        if (!(cVar instanceof c.e)) {
            if (cVar instanceof c.d) {
                ((c.d) cVar).a().c().b(y2Var);
            } else if (cVar instanceof c.f) {
                ((c.f) cVar).a().c().b(y2Var);
            }
        }
        Job job = this.f70353l;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        kotlinx.coroutines.i.e(this.f70349h, "AdController Destroyed with reason: " + y2Var, null, 2, null);
        this.f70351j = c.a.f70363a;
    }

    public final void j(mf mfVar) {
        l5 l5Var = this.f70346e;
        u5 u5Var = new u5(mfVar.b(), CollectionsKt.emptyList(), null, null, null, null, this.f70343b, 60, null);
        List listC = mfVar.a().c();
        ArrayList<oe> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (Intrinsics.areEqual(((oe) obj).d(), oe.a.f70740f.g())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (oe oeVar : arrayList) {
            arrayList2.add(new de(oeVar.e(), oeVar.c(), oeVar.a(), oeVar.b()));
        }
        l5Var.h(u5Var, arrayList2);
    }

    public final void k(mf ad2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        c.e eVar = throwable instanceof c.e ? (c.e) throwable : null;
        l5 l5Var = this.f70346e;
        we weVar = new we(ad2.b(), CollectionsKt.emptyList(), throwable.getMessage(), eVar != null ? eVar.g() : null, eVar != null ? eVar.d() : null, eVar != null ? eVar.h() : null, this.f70343b);
        List listC = ad2.a().c();
        ArrayList<oe> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (Intrinsics.areEqual(((oe) obj).d(), oe.a.f70745k.g())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (oe oeVar : arrayList) {
            arrayList2.add(new de(oeVar.e(), oeVar.c(), oeVar.a(), oeVar.b()));
        }
        l5Var.h(weVar, arrayList2);
    }

    public final void l(mf mfVar, boolean z10) {
        l5 l5Var = this.f70346e;
        s4 s4Var = new s4(mfVar.b(), CollectionsKt.emptyList(), z10, null, null, null, null, this.f70343b, 120, null);
        List listC = mfVar.a().c();
        ArrayList<oe> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (Intrinsics.areEqual(((oe) obj).d(), oe.a.f70744j.g())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (oe oeVar : arrayList) {
            arrayList2.add(new de(oeVar.e(), oeVar.c(), oeVar.a(), oeVar.b()));
        }
        l5Var.h(s4Var, arrayList2);
    }

    public final void m(mf mfVar) {
        l5 l5Var = this.f70346e;
        qa qaVar = new qa(mfVar.b(), CollectionsKt.emptyList(), null, null, null, null, this.f70343b, 60, null);
        List listC = mfVar.a().c();
        ArrayList<oe> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (Intrinsics.areEqual(((oe) obj).d(), oe.a.f70741g.g())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (oe oeVar : arrayList) {
            arrayList2.add(new de(oeVar.e(), oeVar.c(), oeVar.a(), oeVar.b()));
        }
        l5Var.h(qaVar, arrayList2);
    }

    public final void o(mf ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        l5 l5Var = this.f70346e;
        ra raVar = new ra(ad2.b(), CollectionsKt.emptyList(), null, null, null, null, this.f70343b, 60, null);
        List listC = ad2.a().c();
        ArrayList<oe> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (Intrinsics.areEqual(((oe) obj).d(), oe.a.f70742h.g())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (oe oeVar : arrayList) {
            arrayList2.add(new de(oeVar.e(), oeVar.c(), oeVar.a(), oeVar.b()));
        }
        l5Var.h(raVar, arrayList2);
        s();
    }

    public final void q(mf mfVar) {
        l5 l5Var = this.f70346e;
        we weVar = new we(mfVar.b(), CollectionsKt.emptyList(), null, null, null, null, this.f70343b, 56, null);
        List listC = mfVar.a().c();
        ArrayList<oe> arrayList = new ArrayList();
        for (Object obj : listC) {
            if (Intrinsics.areEqual(((oe) obj).d(), oe.a.f70745k.g())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (oe oeVar : arrayList) {
            arrayList2.add(new de(oeVar.e(), oeVar.c(), oeVar.a(), oeVar.b()));
        }
        l5Var.h(weVar, arrayList2);
    }

    public final void r() {
        Job job = this.f70353l;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
    }

    public final mf s() {
        c cVar = this.f70351j;
        if (cVar instanceof c.d) {
            return ((c.d) cVar).a();
        }
        if (cVar instanceof c.f) {
            return ((c.f) cVar).a();
        }
        return null;
    }

    public final c t() {
        return this.f70351j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // f1.l9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(android.content.Context r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof f1.l8.j
            if (r0 == 0) goto L13
            r0 = r8
            f1.l8$j r0 = (f1.l8.j) r0
            int r1 = r0.f70398u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70398u = r1
            goto L18
        L13:
            f1.l8$j r0 = new f1.l8$j
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f70396s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f70398u
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            kotlin.d.b(r8)
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f70395r
            eg.p r7 = (eg.p) r7
            kotlin.d.b(r8)
            goto L55
        L3d:
            kotlin.d.b(r8)
            eg.p r8 = eg.r.c(r4, r5, r4)
            f1.l8$b$h r2 = new f1.l8$b$h
            r2.<init>(r7, r8)
            r0.f70395r = r8
            r0.f70398u = r5
            java.lang.Object r7 = r6.c(r2, r0)
            if (r7 != r1) goto L54
            goto L5f
        L54:
            r7 = r8
        L55:
            r0.f70395r = r4
            r0.f70398u = r3
            java.lang.Object r8 = r7.await(r0)
            if (r8 != r1) goto L60
        L5f:
            return r1
        L60:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.l()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.l8.a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
    
        if (c(r0, r12) == r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a2, code lost:
    
        if (r3.c(r2, r12) == r13) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r17, f1.mf r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.l8.b(android.content.Context, f1.mf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(f1.l8.b r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.l8.c(f1.l8$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ l8(g5 g5Var, b1.e eVar, g6 g6Var, n5 n5Var, kd kdVar, l5 l5Var, be beVar, y yVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(g5Var, eVar, g6Var, n5Var, kdVar, l5Var, beVar, (i10 & 128) != 0 ? new y() : yVar);
    }
}
