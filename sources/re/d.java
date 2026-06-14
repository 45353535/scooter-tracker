package re;

import eg.m1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import ve.f1;
import ve.m0;
import ve.o;
import ve.p;
import ve.w0;
import ve.x;
import ve.z;
import ze.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f99425g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f99426a = new m0(null, null, 0, null, null, null, null, null, false, 511, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z f99427b = z.f106771b.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f99428c = new p(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f99429d = te.b.f105166a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Job f99430e = m1.b(null, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ze.b f99431f = ze.d.a(true);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map m() {
        return new LinkedHashMap();
    }

    public final e b() {
        f1 f1VarB = this.f99426a.b();
        z zVar = this.f99427b;
        o oVarP = getHeaders().p();
        Object obj = this.f99429d;
        ye.c cVar = obj instanceof ye.c ? (ye.c) obj : null;
        if (cVar != null) {
            return new e(f1VarB, zVar, oVarP, cVar, this.f99430e, this.f99431f);
        }
        throw new IllegalStateException(("No request transformation found: " + this.f99429d).toString());
    }

    public final ze.b c() {
        return this.f99431f;
    }

    public final Object d() {
        return this.f99429d;
    }

    public final ff.a e() {
        return (ff.a) this.f99431f.a(j.a());
    }

    public final Object f(le.h key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f99431f.a(le.i.a());
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    public final Job g() {
        return this.f99430e;
    }

    @Override // ve.x
    public p getHeaders() {
        return this.f99428c;
    }

    public final z h() {
        return this.f99427b;
    }

    public final m0 i() {
        return this.f99426a;
    }

    public final void j(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f99429d = obj;
    }

    public final void k(ff.a aVar) {
        if (aVar != null) {
            this.f99431f.e(j.a(), aVar);
        } else {
            this.f99431f.f(j.a());
        }
    }

    public final void l(le.h key, Object capability) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(capability, "capability");
        ((Map) this.f99431f.d(le.i.a(), new Function0() { // from class: re.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.m();
            }
        })).put(key, capability);
    }

    public final void n(Job job) {
        Intrinsics.checkNotNullParameter(job, "<set-?>");
        this.f99430e = job;
    }

    public final void o(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<set-?>");
        this.f99427b = zVar;
    }

    public final d p(d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f99427b = builder.f99427b;
        this.f99429d = builder.f99429d;
        k(builder.e());
        w0.j(this.f99426a, builder.f99426a);
        m0 m0Var = this.f99426a;
        m0Var.v(m0Var.g());
        b0.c(getHeaders(), builder.getHeaders());
        ze.e.a(this.f99431f, builder.f99431f);
        return this;
    }

    public final d q(d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f99430e = builder.f99430e;
        return p(builder);
    }
}
