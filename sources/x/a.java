package x;

import hh.b0;
import hh.t;
import hh.w;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import lf.i;
import lf.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f108052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f108053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f108054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f108055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f108056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f108057f;

    /* JADX INFO: renamed from: x.a$a, reason: collision with other inner class name */
    static final class C1331a extends Lambda implements Function0 {
        C1331a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final hh.d invoke() {
            return hh.d.f73576n.b(a.this.d());
        }
    }

    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            String strA = a.this.d().a("Content-Type");
            if (strA != null) {
                return w.f73770e.b(strA);
            }
            return null;
        }
    }

    public a(vh.g gVar) {
        l lVar = l.f94211d;
        this.f108052a = i.b(lVar, new C1331a());
        this.f108053b = i.b(lVar, new b());
        this.f108054c = Long.parseLong(gVar.readUtf8LineStrict());
        this.f108055d = Long.parseLong(gVar.readUtf8LineStrict());
        this.f108056e = Integer.parseInt(gVar.readUtf8LineStrict()) > 0;
        int i10 = Integer.parseInt(gVar.readUtf8LineStrict());
        t.a aVar = new t.a();
        for (int i11 = 0; i11 < i10; i11++) {
            c0.i.b(aVar, gVar.readUtf8LineStrict());
        }
        this.f108057f = aVar.e();
    }

    public final hh.d a() {
        return (hh.d) this.f108052a.getValue();
    }

    public final w b() {
        return (w) this.f108053b.getValue();
    }

    public final long c() {
        return this.f108055d;
    }

    public final t d() {
        return this.f108057f;
    }

    public final long e() {
        return this.f108054c;
    }

    public final boolean f() {
        return this.f108056e;
    }

    public final void g(vh.f fVar) {
        fVar.writeDecimalLong(this.f108054c).writeByte(10);
        fVar.writeDecimalLong(this.f108055d).writeByte(10);
        fVar.writeDecimalLong(this.f108056e ? 1L : 0L).writeByte(10);
        fVar.writeDecimalLong(this.f108057f.size()).writeByte(10);
        int size = this.f108057f.size();
        for (int i10 = 0; i10 < size; i10++) {
            fVar.writeUtf8(this.f108057f.e(i10)).writeUtf8(": ").writeUtf8(this.f108057f.i(i10)).writeByte(10);
        }
    }

    public a(b0 b0Var) {
        l lVar = l.f94211d;
        this.f108052a = i.b(lVar, new C1331a());
        this.f108053b = i.b(lVar, new b());
        this.f108054c = b0Var.s0();
        this.f108055d = b0Var.n0();
        this.f108056e = b0Var.w() != null;
        this.f108057f = b0Var.R();
    }
}
