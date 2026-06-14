package o;

import android.content.Context;
import c0.h;
import c0.n;
import c0.r;
import coil.memory.MemoryCache;
import hh.x;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import lf.i;
import o.c;

/* JADX INFO: loaded from: classes5.dex */
public interface e {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f96194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y.b f96195b = h.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Lazy f96196c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Lazy f96197d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Lazy f96198e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c.d f96199f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private o.b f96200g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private n f96201h = new n(false, false, false, 0, null, 31, null);

        /* JADX INFO: renamed from: o.e$a$a, reason: collision with other inner class name */
        static final class C1102a extends Lambda implements Function0 {
            C1102a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final MemoryCache invoke() {
                return new MemoryCache.a(a.this.f96194a).a();
            }
        }

        static final class b extends Lambda implements Function0 {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final r.a invoke() {
                return r.f6454a.a(a.this.f96194a);
            }
        }

        static final class c extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final c f96204f = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final x invoke() {
                return new x();
            }
        }

        public a(Context context) {
            this.f96194a = context.getApplicationContext();
        }

        public final e b() {
            Context context = this.f96194a;
            y.b bVar = this.f96195b;
            Lazy lazyA = this.f96196c;
            if (lazyA == null) {
                lazyA = i.a(new C1102a());
            }
            Lazy lazyA2 = this.f96197d;
            if (lazyA2 == null) {
                lazyA2 = i.a(new b());
            }
            Lazy lazyA3 = this.f96198e;
            if (lazyA3 == null) {
                lazyA3 = i.a(c.f96204f);
            }
            c.d dVar = this.f96199f;
            if (dVar == null) {
                dVar = c.d.f96192b;
            }
            o.b bVar2 = this.f96200g;
            if (bVar2 == null) {
                bVar2 = new o.b();
            }
            return new g(context, bVar, lazyA, lazyA2, lazyA3, dVar, bVar2, this.f96201h, null);
        }
    }

    Object a(y.h hVar, Continuation continuation);

    y.d b(y.h hVar);

    y.b c();

    MemoryCache d();

    b getComponents();
}
