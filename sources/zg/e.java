package zg;

import com.ironsource.C4240b4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import wg.l;
import wg.m;
import yg.q1;

/* JADX INFO: loaded from: classes3.dex */
abstract class e extends q1 implements kotlinx.serialization.json.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kotlinx.serialization.json.b f119404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f119405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final kotlinx.serialization.json.g f119406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f119407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f119408f;

    public static final class a extends xg.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f119410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f119411c;

        a(String str, SerialDescriptor serialDescriptor) {
            this.f119410b = str;
            this.f119411c = serialDescriptor;
        }

        @Override // kotlinx.serialization.encoding.Encoder
        public ah.b a() {
            return e.this.d().a();
        }

        @Override // xg.b, kotlinx.serialization.encoding.Encoder
        public void w(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            e.this.w0(this.f119410b, new kotlinx.serialization.json.w(value, false, this.f119411c));
        }
    }

    public static final class b extends xg.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ah.b f119412a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f119414c;

        b(String str) {
            this.f119414c = str;
            this.f119412a = e.this.d().a();
        }

        @Override // xg.b, kotlinx.serialization.encoding.Encoder
        public void A(long j10) {
            K(g.a(lf.v.c(j10), 10));
        }

        public final void K(String s10) {
            Intrinsics.checkNotNullParameter(s10, "s");
            e.this.w0(this.f119414c, new kotlinx.serialization.json.w(s10, false, null, 4, null));
        }

        @Override // kotlinx.serialization.encoding.Encoder
        public ah.b a() {
            return this.f119412a;
        }

        @Override // xg.b, kotlinx.serialization.encoding.Encoder
        public void e(byte b10) {
            K(lf.r.f(lf.r.c(b10)));
        }

        @Override // xg.b, kotlinx.serialization.encoding.Encoder
        public void l(short s10) {
            K(lf.y.f(lf.y.c(s10)));
        }

        @Override // xg.b, kotlinx.serialization.encoding.Encoder
        public void t(int i10) {
            K(Long.toString(((long) lf.t.c(i10)) & 4294967295L, 10));
        }
    }

    public /* synthetic */ e(kotlinx.serialization.json.b bVar, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(e eVar, JsonElement node) {
        Intrinsics.checkNotNullParameter(node, "node");
        eVar.w0((String) eVar.V(), node);
        return Unit.f93236a;
    }

    private final a u0(String str, SerialDescriptor serialDescriptor) {
        return new a(str, serialDescriptor);
    }

    private final b v0(String str) {
        return new b(str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void B() {
        String str = (String) W();
        if (str == null) {
            this.f119405c.invoke(JsonNull.INSTANCE);
        } else {
            p0(str);
        }
    }

    @Override // yg.c3
    protected void U(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f119405c.invoke(s0());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final ah.b a() {
        return this.f119404b.a();
    }

    @Override // yg.q1
    protected String a0(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public xg.f b(SerialDescriptor descriptor) {
        e v0Var;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Function1 function1 = W() == null ? this.f119405c : new Function1() { // from class: zg.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.f0(this.f119392b, (JsonElement) obj);
            }
        };
        wg.l kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, m.b.f108009a) || (kind instanceof wg.d)) {
            v0Var = new v0(this.f119404b, function1);
        } else if (Intrinsics.areEqual(kind, m.c.f108010a)) {
            kotlinx.serialization.json.b bVar = this.f119404b;
            SerialDescriptor serialDescriptorA = o1.a(descriptor.d(0), bVar.a());
            wg.l kind2 = serialDescriptorA.getKind();
            if ((kind2 instanceof wg.e) || Intrinsics.areEqual(kind2, l.b.f108007a)) {
                v0Var = new x0(this.f119404b, function1);
            } else {
                if (!bVar.e().c()) {
                    throw i0.d(serialDescriptorA);
                }
                v0Var = new v0(this.f119404b, function1);
            }
        } else {
            v0Var = new t0(this.f119404b, function1);
        }
        String str = this.f119407e;
        if (str != null) {
            if (v0Var instanceof x0) {
                x0 x0Var = (x0) v0Var;
                x0Var.w0(C4240b4.i.W, kotlinx.serialization.json.j.c(str));
                String strH = this.f119408f;
                if (strH == null) {
                    strH = descriptor.h();
                }
                x0Var.w0("value", kotlinx.serialization.json.j.c(strH));
            } else {
                String strH2 = this.f119408f;
                if (strH2 == null) {
                    strH2 = descriptor.h();
                }
                v0Var.w0(str, kotlinx.serialization.json.j.c(strH2));
            }
            this.f119407e = null;
            this.f119408f = null;
        }
        return v0Var;
    }

    @Override // yg.q1
    protected String b0(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return k0.h(descriptor, this.f119404b, i10);
    }

    @Override // kotlinx.serialization.json.s
    public final kotlinx.serialization.json.b d() {
        return this.f119404b;
    }

    @Override // yg.c3, kotlinx.serialization.encoding.Encoder
    public Encoder g(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (W() == null) {
            return new n0(this.f119404b, this.f119405c).g(descriptor);
        }
        if (this.f119407e != null) {
            this.f119408f = descriptor.h();
        }
        return super.g(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.c3
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void J(String tag, boolean z10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, kotlinx.serialization.json.j.a(Boolean.valueOf(z10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.c3
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void K(String tag, byte b10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, kotlinx.serialization.json.j.b(Byte.valueOf(b10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.c3
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void L(String tag, char c10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, kotlinx.serialization.json.j.c(String.valueOf(c10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    @Override // yg.c3, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(ug.n r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.e.j(ug.n, java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.c3
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void M(String tag, double d10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, kotlinx.serialization.json.j.b(Double.valueOf(d10)));
        if (!this.f119406d.b() && Math.abs(d10) > Double.MAX_VALUE) {
            throw i0.c(Double.valueOf(d10), tag, s0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.c3
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void N(String tag, SerialDescriptor enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        w0(tag, kotlinx.serialization.json.j.c(enumDescriptor.f(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.c3
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void O(String tag, float f10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, kotlinx.serialization.json.j.b(Float.valueOf(f10)));
        if (!this.f119406d.b() && Math.abs(f10) > Float.MAX_VALUE) {
            throw i0.c(Float.valueOf(f10), tag, s0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.c3
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public Encoder P(String tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return f1.b(inlineDescriptor) ? v0(tag) : f1.a(inlineDescriptor) ? u0(tag, inlineDescriptor) : super.P(tag, inlineDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.c3
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void Q(String tag, int i10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, kotlinx.serialization.json.j.b(Integer.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.c3
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void R(String tag, long j10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, kotlinx.serialization.json.j.b(Long.valueOf(j10)));
    }

    protected void p0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, JsonNull.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.c3
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void S(String tag, short s10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        w0(tag, kotlinx.serialization.json.j.b(Short.valueOf(s10)));
    }

    @Override // xg.f
    public boolean r(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f119406d.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.c3
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void T(String tag, String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        w0(tag, kotlinx.serialization.json.j.c(value));
    }

    @Override // kotlinx.serialization.json.s
    public void s(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.f119407e == null || (element instanceof JsonObject)) {
            j(kotlinx.serialization.json.q.f93710a, element);
        } else {
            z0.d(this.f119408f, element);
            throw new lf.g();
        }
    }

    public abstract JsonElement s0();

    protected final Function1 t0() {
        return this.f119405c;
    }

    public abstract void w0(String str, JsonElement jsonElement);

    private e(kotlinx.serialization.json.b bVar, Function1 function1) {
        this.f119404b = bVar;
        this.f119405c = function1;
        this.f119406d = bVar.e();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void E() {
    }
}
