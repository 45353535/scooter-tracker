package f1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.ironsource.C4240b4;
import e1.a;
import e1.c;
import e1.i;
import java.net.URL;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v1 implements l9 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f71328n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1.a f71329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f71330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1.a f71331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nc f71332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g5 f71333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f71334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f71335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f71336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f71337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f71338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CoroutineScope f71339k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Job f71340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public URL f71341m;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public class b implements g6 {
        public b() {
        }

        @Override // f1.g6
        public void a() {
            d1.a aVarZ = v1.this.z();
            v1.this.v().s();
            aVarZ.a(new e1.e(null, v1.this.t()), null);
        }

        @Override // f1.g6
        public void b() {
            eg.e("DefaultAdContainerListener: onAdClosed called. This is unexpected for the current ad type.", null, 2, null);
        }

        @Override // f1.g6
        public void d() {
            eg.e("DefaultAdContainerListener: onAdRewarded called. This is unexpected for the current ad type.", null, 2, null);
        }

        @Override // f1.g6
        public void e() {
            eg.e("DefaultAdContainerListener: onAdImpression called. This is unexpected for the current ad type.", null, 2, null);
        }

        @Override // f1.g6
        public void a(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.setFlags(268435456);
            ContextCompat.startActivity(v1.this.y().d().getContext(), intent, null);
        }

        @Override // f1.g6
        public void c() {
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final l8 invoke() {
            return new l8(v1.this.f71333e, v1.this.t().getMediation(), v1.this.u(), v1.this.y().c(), v1.this.y().b(), v1.this.y().a().q(), v1.this.y().a().c(), null, 128, null);
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d1.c f71346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f71347d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d1.c cVar, Function0 function0) {
            super();
            this.f71346c = cVar;
            this.f71347d = function0;
        }

        @Override // f1.v1.b, f1.g6
        public void b() {
            v1.this.s(false);
            d1.c cVar = this.f71346c;
            v1.this.v().s();
            cVar.f(new e1.f(null, v1.this.t()));
        }

        @Override // f1.v1.b, f1.g6
        public void d() {
            this.f71347d.invoke();
        }

        @Override // f1.v1.b, f1.g6
        public void e() {
            v1.this.v().s();
            this.f71346c.c(new e1.g(new e1.j(null, v1.this.t()).a(), v1.this.t()));
            v1.this.v().s();
            eg.p("Cannot track impression: currentAd is null for location " + v1.this.t().getLocation(), null, 2, null);
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f71349g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10) {
            super(0);
            this.f71349g = z10;
        }

        public final void a() {
            v1.this.p(this.f71349g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f71350r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f71351s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f71352t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f71354v;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f71352t = obj;
            this.f71354v |= Integer.MIN_VALUE;
            Object objE = v1.e(v1.this, null, this);
            return objE == pf.b.g() ? objE : Result.a(objE);
        }
    }

    public static final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f71355r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ e1.j f71357t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f71358u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e1.j jVar, Context context, Continuation continuation) {
            super(2, continuation);
            this.f71357t = jVar;
            this.f71358u = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return v1.this.new h(this.f71357t, this.f71358u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object objG = pf.b.g();
            int i10 = this.f71355r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                v1.this.x().d(this.f71357t);
                l8 l8VarV = v1.this.v();
                Context context = this.f71358u;
                this.f71355r = 1;
                objA = l8VarV.a(context, this);
                if (objA == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objA = ((Result) obj).l();
            }
            return Result.a(objA);
        }
    }

    public v1(c1.a ad2, c1 api, d1.a originalCallback, nc dependencyContainer, g5 adConfigInternal) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(originalCallback, "originalCallback");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        Intrinsics.checkNotNullParameter(adConfigInternal, "adConfigInternal");
        this.f71329a = ad2;
        this.f71330b = api;
        this.f71331c = originalCallback;
        this.f71332d = dependencyContainer;
        this.f71333e = adConfigInternal;
        this.f71334f = new y();
        this.f71337i = lf.i.a(new c());
        this.f71339k = kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.b()));
    }

    public static /* synthetic */ g6 d(v1 v1Var, d1.c cVar, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFullscreenAdContainerListener");
        }
        if ((i10 & 2) != 0) {
            function0 = d.f71344f;
        }
        return v1Var.c(cVar, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:43:0x00ca, B:45:0x00ce, B:47:0x00d8, B:51:0x00e2, B:53:0x00e6, B:40:0x00b5), top: B:65:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6 A[Catch: Exception -> 0x00df, TRY_LEAVE, TryCatch #0 {Exception -> 0x00df, blocks: (B:43:0x00ca, B:45:0x00ce, B:47:0x00d8, B:51:0x00e2, B:53:0x00e6, B:40:0x00b5), top: B:65:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object e(f1.v1 r7, android.content.Context r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.v1.e(f1.v1, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean A() {
        return this.f71330b.s();
    }

    public void B() {
        Job job = this.f71340l;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                eg.e("Stopping cache observer for " + this.f71329a.getLocation() + ", URL: " + this.f71341m, null, 2, null);
                Job.a.a(job, null, 1, null);
            }
        }
        this.f71340l = null;
        this.f71341m = null;
    }

    @Override // f1.l9
    public boolean a() {
        return this.f71336h ? this.f71338j : b1.b.h() ? A() : this.f71338j;
    }

    public final g6 c(d1.c callback, Function0 onReward) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(onReward, "onReward");
        return new e(callback, onReward);
    }

    public void f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void g(View view, e1.j showEvent) {
        Intrinsics.checkNotNullParameter(showEvent, "showEvent");
        this.f71331c.e(showEvent, null);
    }

    public final void h(e1.b event, e1.a aVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        q(aVar == null);
        this.f71331c.g(event, aVar);
    }

    public final void i(e1.e event, e1.d dVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f71331c.a(event, dVar);
    }

    public final void j(e1.g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f71331c.c(event);
    }

    public final void k(e1.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f71335g = true;
        this.f71331c.d(event);
    }

    public final void l(e1.j event, e1.i iVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f71335g = iVar == null;
        this.f71331c.e(event, iVar);
    }

    public void m(Throwable throwable, e1.j showEvent) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(showEvent, "showEvent");
        this.f71335g = false;
        e1.i iVarD = v9.d(throwable);
        v().s();
        eg.p("Cannot track show failure: currentAd is null for location " + this.f71329a.getLocation(), null, 2, null);
        this.f71331c.e(showEvent, iVarD);
    }

    public final void n(boolean z10) {
        try {
            rd.f70996b.d().c().b(new f(z10));
        } catch (Exception e10) {
            c.d.a aVar = new c.d.a("Failed to post session not started callback for " + this.f71333e.a(), e10);
            eg.i(C4240b4.j.f42672d + aVar.g() + "] " + aVar.h() + " - Cannot post session not started callback", aVar);
        }
    }

    public abstract Object o(Context context, Continuation continuation);

    public void p(boolean z10) {
        if (z10) {
            this.f71331c.g(new e1.b(null, this.f71329a), new e1.a(a.EnumC0857a.f68679g, null, 2, null));
        } else {
            this.f71331c.e(new e1.j(null, this.f71329a), new e1.i(i.a.f68754d, null, 2, null));
        }
    }

    public void q(boolean z10) {
        this.f71338j = z10;
    }

    public void r() {
        this.f71330b.g();
    }

    public final void s(boolean z10) {
        this.f71335g = z10;
    }

    public final c1.a t() {
        return this.f71329a;
    }

    public abstract g6 u();

    public final l8 v() {
        return (l8) this.f71337i.getValue();
    }

    public final c1 w() {
        return this.f71330b;
    }

    public abstract d1.a x();

    public final nc y() {
        return this.f71332d;
    }

    public final d1.a z() {
        return this.f71331c;
    }

    @Override // f1.l9
    public void b() {
        B();
        kotlinx.coroutines.i.e(this.f71339k, "Coordinator destroyed", null, 2, null);
        v().b();
    }

    @Override // f1.l9
    public void c() {
        if (!b1.b.h()) {
            eg.j("Chartboost is not initialized. Ignoring clearLoadedAd().", null, 2, null);
            return;
        }
        q(false);
        Job job = this.f71340l;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f71340l = null;
        this.f71341m = null;
        r();
        v().c();
    }

    @Override // f1.l9
    public Object a(Context context, Continuation continuation) {
        return e(this, context, continuation);
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f71344f = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }

        public final void a() {
        }
    }
}
