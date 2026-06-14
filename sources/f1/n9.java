package f1;

import android.content.Context;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n9 extends v1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d1.d f70648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g6 f70649p;

    public static final class a implements d1.d {
        public a() {
        }

        @Override // d1.a
        public void a(e1.e event, e1.d dVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            n9.this.i(event, dVar);
        }

        @Override // d1.a
        public void c(e1.g event) {
            Intrinsics.checkNotNullParameter(event, "event");
            n9.this.j(event);
        }

        @Override // d1.a
        public void d(e1.j event) {
            Intrinsics.checkNotNullParameter(event, "event");
            n9.this.k(event);
        }

        @Override // d1.a
        public void e(e1.j event, e1.i iVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            n9.this.l(event, iVar);
        }

        @Override // d1.c
        public void f(e1.f event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ((d1.d) n9.this.z()).f(event);
        }

        @Override // d1.a
        public void g(e1.b event, e1.a aVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            n9.this.h(event, aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(v8 api, d1.d callback, c1.c interstitial, nc dependencyContainer) {
        super(interstitial, api, callback, dependencyContainer, new g5(sa.f71088c, null, 2, null));
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.f70648o = new a();
        this.f70649p = v1.d(this, (d1.c) z(), null, 2, null);
    }

    @Override // f1.v1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public d1.d x() {
        return this.f70648o;
    }

    @Override // f1.v1
    public Object o(Context context, Continuation continuation) {
        ((v8) w()).z((c1.c) t(), x());
        return Result.b(null);
    }

    @Override // f1.v1
    public g6 u() {
        return this.f70649p;
    }
}
