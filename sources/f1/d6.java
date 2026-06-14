package f1;

import android.content.Context;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class d6 extends v1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d1.e f69591o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g6 f69592p;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        public final void a() {
            d1.e eVar = (d1.e) d6.this.z();
            d6.this.v().s();
            eVar.b(new e1.h(null, d6.this.t(), 0));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class b implements d1.e {
        public b() {
        }

        @Override // d1.a
        public void a(e1.e event, e1.d dVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            d6.this.i(event, dVar);
        }

        @Override // d1.e
        public void b(e1.h event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ((d1.e) d6.this.z()).b(event);
        }

        @Override // d1.a
        public void c(e1.g event) {
            Intrinsics.checkNotNullParameter(event, "event");
            d6.this.j(event);
        }

        @Override // d1.a
        public void d(e1.j event) {
            Intrinsics.checkNotNullParameter(event, "event");
            d6.this.k(event);
        }

        @Override // d1.a
        public void e(e1.j event, e1.i iVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            d6.this.l(event, iVar);
        }

        @Override // d1.c
        public void f(e1.f event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ((d1.e) d6.this.z()).f(event);
        }

        @Override // d1.a
        public void g(e1.b event, e1.a aVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            d6.this.h(event, aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(k5 api, d1.e callback, c1.d rewarded, nc dependencyContainer) {
        super(rewarded, api, callback, dependencyContainer, new g5(sa.f71089d, null, 2, null));
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.f69591o = new b();
        this.f69592p = c((d1.c) z(), new a());
    }

    @Override // f1.v1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public d1.e x() {
        return this.f69591o;
    }

    @Override // f1.v1
    public Object o(Context context, Continuation continuation) {
        ((k5) w()).z((c1.d) t(), x());
        return Result.b(null);
    }

    @Override // f1.v1
    public g6 u() {
        return this.f69592p;
    }
}
