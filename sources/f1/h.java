package f1;

import android.content.Context;
import android.view.View;
import e1.c;
import f1.nd;
import f1.v1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends v1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public nd f69974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d1.b f69975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g6 f69976q;

    public static final class a implements d1.b {
        public a() {
        }

        @Override // d1.a
        public void a(e1.e event, e1.d dVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            h.this.i(event, dVar);
        }

        @Override // d1.a
        public void c(e1.g event) {
            Intrinsics.checkNotNullParameter(event, "event");
            h.this.j(event);
        }

        @Override // d1.a
        public void d(e1.j event) {
            Intrinsics.checkNotNullParameter(event, "event");
            h.this.k(event);
        }

        @Override // d1.a
        public void e(e1.j event, e1.i iVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            h.this.l(event, iVar);
        }

        @Override // d1.a
        public void g(e1.b event, e1.a aVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            h.this.h(event, aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(vf api, d1.b callback, c1.b banner, nc dependencyContainer) {
        super(banner, api, callback, dependencyContainer, new g5(sa.f71087b, null, 2, null));
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.f69975p = new a();
        this.f69976q = new v1.b();
    }

    public static final void C(h this$0, e1.j showEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(showEvent, "$showEvent");
        ((d1.b) this$0.z()).c(new e1.g(showEvent.a(), this$0.t()));
        this$0.v().s();
        eg.p("Cannot track impression: currentAd is null for location " + ((c1.b) this$0.t()).getLocation(), null, 2, null);
    }

    @Override // f1.v1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public d1.b x() {
        return this.f69975p;
    }

    @Override // f1.v1, f1.l9
    public void b() {
        nd ndVar = this.f69974o;
        if (ndVar != null) {
            ndVar.h();
        }
        this.f69974o = null;
        ((vf) w()).C();
        super.b();
    }

    @Override // f1.v1
    public void f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ((vf) w()).y((c1.b) t());
    }

    @Override // f1.v1
    public void g(View view, final e1.j showEvent) {
        Intrinsics.checkNotNullParameter(showEvent, "showEvent");
        Unit unit = null;
        if (view != null) {
            ((d1.b) z()).e(showEvent, null);
            nd ndVar = this.f69974o;
            if (ndVar != null) {
                ndVar.h();
            }
            Context context = ((c1.b) t()).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View viewA = nd.f70659r.a(((c1.b) t()).getContext(), view);
            if (viewA == null) {
                viewA = view.getRootView();
            }
            View view2 = viewA;
            Intrinsics.checkNotNull(view2);
            nd ndVar2 = new nd(context, view, view2, 1, 0, 100L, 25, false, 128, null);
            this.f69974o = ndVar2;
            ndVar2.d(new nd.b() { // from class: f1.g
                @Override // f1.nd.b
                public final void a() {
                    h.C(this.f69879a, showEvent);
                }
            });
            nd ndVar3 = this.f69974o;
            if (ndVar3 != null) {
                ndVar3.w();
            }
            ((c1.b) t()).removeAllViews();
            ((c1.b) t()).addView(view);
            unit = Unit.f93236a;
        }
        if (unit == null) {
            m(c.e.b.f68727h, showEvent);
        }
    }

    @Override // f1.v1
    public Object o(Context context, Continuation continuation) {
        ((vf) w()).B((c1.b) t(), x());
        Result.Companion companion = Result.f93230c;
        return Result.b(t());
    }

    @Override // f1.v1
    public g6 u() {
        return this.f69976q;
    }
}
