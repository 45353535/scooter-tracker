package zg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends xg.b implements kotlinx.serialization.json.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f119415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kotlinx.serialization.json.b f119416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n1 f119417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kotlinx.serialization.json.s[] f119418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ah.b f119419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kotlinx.serialization.json.g f119420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f119421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f119422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f119423i;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[n1.values().length];
            try {
                iArr[n1.f119452e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n1.f119453f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n1.f119454g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e1(r composer, kotlinx.serialization.json.b json, n1 mode, kotlinx.serialization.json.s[] sVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f119415a = composer;
        this.f119416b = json;
        this.f119417c = mode;
        this.f119418d = sVarArr;
        this.f119419e = d().a();
        this.f119420f = d().e();
        int iOrdinal = mode.ordinal();
        if (sVarArr != null) {
            kotlinx.serialization.json.s sVar = sVarArr[iOrdinal];
            if (sVar == null && sVar == this) {
                return;
            }
            sVarArr[iOrdinal] = this;
        }
    }

    private final void K(String str, String str2) {
        this.f119415a.c();
        w(str);
        this.f119415a.f(':');
        this.f119415a.p();
        w(str2);
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void A(long j10) {
        if (this.f119421g) {
            w(String.valueOf(j10));
        } else {
            this.f119415a.j(j10);
        }
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void B() {
        this.f119415a.k("null");
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void D(char c10) {
        w(String.valueOf(c10));
    }

    @Override // xg.b
    public boolean H(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i11 = a.$EnumSwitchMapping$0[this.f119417c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f119415a.a()) {
                        this.f119415a.f(',');
                    }
                    this.f119415a.c();
                    w(k0.h(descriptor, d(), i10));
                    this.f119415a.f(':');
                    this.f119415a.p();
                } else {
                    if (i10 == 0) {
                        this.f119421g = true;
                    }
                    if (i10 == 1) {
                        this.f119415a.f(',');
                        this.f119415a.p();
                        this.f119421g = false;
                    }
                }
            } else if (this.f119415a.a()) {
                this.f119421g = true;
                this.f119415a.c();
            } else {
                if (i10 % 2 == 0) {
                    this.f119415a.f(',');
                    this.f119415a.c();
                    z10 = true;
                } else {
                    this.f119415a.f(':');
                    this.f119415a.p();
                }
                this.f119421g = z10;
            }
        } else {
            if (!this.f119415a.a()) {
                this.f119415a.f(',');
            }
            this.f119415a.c();
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public ah.b a() {
        return this.f119419e;
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public xg.f b(SerialDescriptor descriptor) {
        kotlinx.serialization.json.s sVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        n1 n1VarB = o1.b(d(), descriptor);
        char c10 = n1VarB.f119457b;
        if (c10 != 0) {
            this.f119415a.f(c10);
            this.f119415a.b();
        }
        String str = this.f119422h;
        if (str != null) {
            String strH = this.f119423i;
            if (strH == null) {
                strH = descriptor.h();
            }
            K(str, strH);
            this.f119422h = null;
            this.f119423i = null;
        }
        if (this.f119417c == n1VarB) {
            return this;
        }
        kotlinx.serialization.json.s[] sVarArr = this.f119418d;
        return (sVarArr == null || (sVar = sVarArr[n1VarB.ordinal()]) == null) ? new e1(this.f119415a, d(), n1VarB, this.f119418d) : sVar;
    }

    @Override // xg.b, xg.f
    public void c(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f119417c.f119458c != 0) {
            this.f119415a.q();
            this.f119415a.d();
            this.f119415a.f(this.f119417c.f119458c);
        }
    }

    @Override // kotlinx.serialization.json.s
    public kotlinx.serialization.json.b d() {
        return this.f119416b;
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void e(byte b10) {
        if (this.f119421g) {
            w(String.valueOf((int) b10));
        } else {
            this.f119415a.e(b10);
        }
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void f(SerialDescriptor enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        w(enumDescriptor.f(i10));
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public Encoder g(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (f1.b(descriptor)) {
            r vVar = this.f119415a;
            if (!(vVar instanceof v)) {
                vVar = new v(vVar.f119476a, this.f119421g);
            }
            return new e1(vVar, d(), this.f119417c, (kotlinx.serialization.json.s[]) null);
        }
        if (f1.a(descriptor)) {
            r sVar = this.f119415a;
            if (!(sVar instanceof s)) {
                sVar = new s(sVar.f119476a, this.f119421g);
            }
            return new e1(sVar, d(), this.f119417c, (kotlinx.serialization.json.s[]) null);
        }
        if (this.f119422h == null) {
            return super.g(descriptor);
        }
        this.f119423i = descriptor.h();
        return this;
    }

    @Override // xg.b, xg.f
    public void h(SerialDescriptor descriptor, int i10, ug.n serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f119420f.j()) {
            super.h(descriptor, i10, serializer, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(ug.n r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.e1.j(ug.n, java.lang.Object):void");
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void l(short s10) {
        if (this.f119421g) {
            w(String.valueOf((int) s10));
        } else {
            this.f119415a.l(s10);
        }
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void m(boolean z10) {
        if (this.f119421g) {
            w(String.valueOf(z10));
        } else {
            this.f119415a.m(z10);
        }
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void n(float f10) {
        if (this.f119421g) {
            w(String.valueOf(f10));
        } else {
            this.f119415a.h(f10);
        }
        if (!this.f119420f.b() && Math.abs(f10) > Float.MAX_VALUE) {
            throw i0.b(Float.valueOf(f10), this.f119415a.f119476a.toString());
        }
    }

    @Override // xg.b, xg.f
    public boolean r(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f119420f.i();
    }

    @Override // kotlinx.serialization.json.s
    public void s(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.f119422h == null || (element instanceof JsonObject)) {
            j(kotlinx.serialization.json.q.f93710a, element);
        } else {
            z0.d(this.f119423i, element);
            throw new lf.g();
        }
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void t(int i10) {
        if (this.f119421g) {
            w(String.valueOf(i10));
        } else {
            this.f119415a.i(i10);
        }
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void w(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f119415a.n(value);
    }

    @Override // xg.b, kotlinx.serialization.encoding.Encoder
    public void y(double d10) {
        if (this.f119421g) {
            w(String.valueOf(d10));
        } else {
            this.f119415a.g(d10);
        }
        if (!this.f119420f.b() && Math.abs(d10) > Double.MAX_VALUE) {
            throw i0.b(Double.valueOf(d10), this.f119415a.f119476a.toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e1(b0 output, kotlinx.serialization.json.b json, n1 mode, kotlinx.serialization.json.s[] modeReuseCache) {
        this(x.a(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }
}
