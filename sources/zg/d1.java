package zg;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import wg.l;

/* JADX INFO: loaded from: classes3.dex */
public class d1 extends xg.a implements kotlinx.serialization.json.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kotlinx.serialization.json.b f119395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n1 f119396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zg.a f119397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ah.b f119398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f119399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f119400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final kotlinx.serialization.json.g f119401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f0 f119402i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f119403a;

        public a(String str) {
            this.f119403a = str;
        }
    }

    public /* synthetic */ class b {
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
            try {
                iArr[n1.f119451d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d1(kotlinx.serialization.json.b json, n1 mode, zg.a lexer, SerialDescriptor descriptor, a aVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f119395b = json;
        this.f119396c = mode;
        this.f119397d = lexer;
        this.f119398e = json.a();
        this.f119399f = -1;
        this.f119400g = aVar;
        kotlinx.serialization.json.g gVarE = json.e();
        this.f119401h = gVarE;
        this.f119402i = gVarE.j() ? null : new f0(descriptor);
    }

    private final void K() {
        if (this.f119397d.G() != 4) {
            return;
        }
        zg.a.z(this.f119397d, "Unexpected leading comma", 0, null, 6, null);
        throw new lf.g();
    }

    private final boolean L(SerialDescriptor serialDescriptor, int i10) {
        String strH;
        kotlinx.serialization.json.b bVar = this.f119395b;
        boolean zI = serialDescriptor.i(i10);
        SerialDescriptor serialDescriptorD = serialDescriptor.d(i10);
        if (zI && !serialDescriptorD.b() && this.f119397d.O(true)) {
            return true;
        }
        if (!Intrinsics.areEqual(serialDescriptorD.getKind(), l.b.f108007a) || ((serialDescriptorD.b() && this.f119397d.O(false)) || (strH = this.f119397d.H(this.f119401h.q())) == null)) {
            return false;
        }
        int i11 = k0.i(serialDescriptorD, bVar, strH);
        boolean z10 = !bVar.e().j() && serialDescriptorD.b();
        if (i11 == -3 && (zI || z10)) {
            this.f119397d.q();
            return true;
        }
        return false;
    }

    private final int M() {
        boolean zN = this.f119397d.N();
        if (!this.f119397d.f()) {
            if (!zN || this.f119395b.e().d()) {
                return -1;
            }
            i0.g(this.f119397d, "array");
            throw new lf.g();
        }
        int i10 = this.f119399f;
        if (i10 != -1 && !zN) {
            zg.a.z(this.f119397d, "Expected end of the array or comma", 0, null, 6, null);
            throw new lf.g();
        }
        int i11 = i10 + 1;
        this.f119399f = i11;
        return i11;
    }

    private final int N() {
        int i10 = this.f119399f;
        boolean zN = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.f119397d.m(':');
        } else if (i10 != -1) {
            zN = this.f119397d.N();
        }
        if (!this.f119397d.f()) {
            if (!zN || this.f119395b.e().d()) {
                return -1;
            }
            i0.h(this.f119397d, null, 1, null);
            throw new lf.g();
        }
        if (z10) {
            if (this.f119399f == -1) {
                zg.a aVar = this.f119397d;
                int i11 = aVar.f119378a;
                if (zN) {
                    zg.a.z(aVar, "Unexpected leading comma", i11, null, 4, null);
                    throw new lf.g();
                }
            } else {
                zg.a aVar2 = this.f119397d;
                boolean z11 = zN;
                int i12 = aVar2.f119378a;
                if (!z11) {
                    zg.a.z(aVar2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new lf.g();
                }
            }
        }
        int i13 = this.f119399f + 1;
        this.f119399f = i13;
        return i13;
    }

    private final int O(SerialDescriptor serialDescriptor) {
        int i10;
        boolean zN;
        boolean zN2 = this.f119397d.N();
        while (true) {
            boolean z10 = true;
            if (!this.f119397d.f()) {
                if (zN2 && !this.f119395b.e().d()) {
                    i0.h(this.f119397d, null, 1, null);
                    throw new lf.g();
                }
                f0 f0Var = this.f119402i;
                if (f0Var != null) {
                    return f0Var.d();
                }
                return -1;
            }
            String strP = P();
            this.f119397d.m(':');
            i10 = k0.i(serialDescriptor, this.f119395b, strP);
            if (i10 == -3) {
                zN = false;
            } else {
                if (!this.f119401h.g() || !L(serialDescriptor, i10)) {
                    break;
                }
                zN = this.f119397d.N();
                z10 = false;
            }
            zN2 = z10 ? Q(serialDescriptor, strP) : zN;
        }
        f0 f0Var2 = this.f119402i;
        if (f0Var2 != null) {
            f0Var2.c(i10);
        }
        return i10;
    }

    private final String P() {
        return this.f119401h.q() ? this.f119397d.t() : this.f119397d.j();
    }

    private final boolean Q(SerialDescriptor serialDescriptor, String str) {
        if (k0.m(serialDescriptor, this.f119395b) || S(this.f119400g, str)) {
            this.f119397d.J(this.f119401h.q());
        } else {
            this.f119397d.f119379b.b();
            this.f119397d.A(str);
        }
        return this.f119397d.N();
    }

    private final void R(SerialDescriptor serialDescriptor) {
        while (x(serialDescriptor) != -1) {
        }
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !Intrinsics.areEqual(aVar.f119403a, str)) {
            return false;
        }
        aVar.f119403a = null;
        return true;
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public boolean B() {
        return this.f119397d.h();
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public boolean E() {
        f0 f0Var = this.f119402i;
        return ((f0Var != null ? f0Var.b() : false) || zg.a.P(this.f119397d, false, 1, null)) ? false : true;
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public byte H() {
        long jN = this.f119397d.n();
        byte b10 = (byte) jN;
        if (jN == b10) {
            return b10;
        }
        zg.a.z(this.f119397d, "Failed to parse byte for input '" + jN + '\'', 0, null, 6, null);
        throw new lf.g();
    }

    @Override // kotlinx.serialization.encoding.Decoder, xg.d
    public ah.b a() {
        return this.f119398e;
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public xg.d b(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        n1 n1VarB = o1.b(this.f119395b, descriptor);
        this.f119397d.f119379b.c(descriptor);
        this.f119397d.m(n1VarB.f119457b);
        K();
        int i10 = b.$EnumSwitchMapping$0[n1VarB.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new d1(this.f119395b, n1VarB, this.f119397d, descriptor, this.f119400g) : (this.f119396c == n1VarB && this.f119395b.e().j()) ? this : new d1(this.f119395b, n1VarB, this.f119397d, descriptor, this.f119400g);
    }

    @Override // xg.a, xg.d
    public void c(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor.e() == 0 && k0.m(descriptor, this.f119395b)) {
            R(descriptor);
        }
        if (this.f119397d.N() && !this.f119395b.e().d()) {
            i0.g(this.f119397d, "");
            throw new lf.g();
        }
        this.f119397d.m(this.f119396c.f119458c);
        this.f119397d.f119379b.b();
    }

    @Override // kotlinx.serialization.json.h
    public final kotlinx.serialization.json.b d() {
        return this.f119395b;
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public Void g() {
        return null;
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public long h() {
        return this.f119397d.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015f  */
    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(ug.c r12) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.d1.k(ug.c):java.lang.Object");
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public short m() {
        long jN = this.f119397d.n();
        short s10 = (short) jN;
        if (jN == s10) {
            return s10;
        }
        zg.a.z(this.f119397d, "Failed to parse short for input '" + jN + '\'', 0, null, 6, null);
        throw new lf.g();
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public double n() {
        zg.a aVar = this.f119397d;
        String strS = aVar.s();
        try {
            double d10 = Double.parseDouble(strS);
            if (this.f119395b.e().b() || Math.abs(d10) <= Double.MAX_VALUE) {
                return d10;
            }
            i0.k(this.f119397d, Double.valueOf(d10));
            throw new lf.g();
        } catch (IllegalArgumentException unused) {
            zg.a.z(aVar, "Failed to parse type 'double' for input '" + strS + '\'', 0, null, 6, null);
            throw new lf.g();
        }
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public char o() {
        String strS = this.f119397d.s();
        if (strS.length() == 1) {
            return strS.charAt(0);
        }
        zg.a.z(this.f119397d, "Expected single char, but got '" + strS + '\'', 0, null, 6, null);
        throw new lf.g();
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public String q() {
        return this.f119401h.q() ? this.f119397d.t() : this.f119397d.q();
    }

    @Override // xg.a, xg.d
    public Object s(SerialDescriptor descriptor, int i10, ug.c deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z10 = this.f119396c == n1.f119453f && (i10 & 1) == 0;
        if (z10) {
            this.f119397d.f119379b.d();
        }
        Object objS = super.s(descriptor, i10, deserializer, obj);
        if (z10) {
            this.f119397d.f119379b.f(objS);
        }
        return objS;
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public int t(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return k0.j(enumDescriptor, this.f119395b, q(), " at path " + this.f119397d.f119379b.a());
    }

    @Override // kotlinx.serialization.json.h
    public JsonElement u() {
        return new y0(this.f119395b.e(), this.f119397d).e();
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public int v() {
        long jN = this.f119397d.n();
        int i10 = (int) jN;
        if (jN == i10) {
            return i10;
        }
        zg.a.z(this.f119397d, "Failed to parse int for input '" + jN + '\'', 0, null, 6, null);
        throw new lf.g();
    }

    @Override // xg.d
    public int x(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = b.$EnumSwitchMapping$0[this.f119396c.ordinal()];
        int iM = i10 != 2 ? i10 != 4 ? M() : O(descriptor) : N();
        if (this.f119396c != n1.f119453f) {
            this.f119397d.f119379b.g(iM);
        }
        return iM;
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public Decoder y(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return f1.b(descriptor) ? new d0(this.f119397d, this.f119395b) : super.y(descriptor);
    }

    @Override // xg.a, kotlinx.serialization.encoding.Decoder
    public float z() {
        zg.a aVar = this.f119397d;
        String strS = aVar.s();
        try {
            float f10 = Float.parseFloat(strS);
            if (this.f119395b.e().b() || Math.abs(f10) <= Float.MAX_VALUE) {
                return f10;
            }
            i0.k(this.f119397d, Float.valueOf(f10));
            throw new lf.g();
        } catch (IllegalArgumentException unused) {
            zg.a.z(aVar, "Failed to parse type '" + TypedValues.Custom.S_FLOAT + "' for input '" + strS + '\'', 0, null, 6, null);
            throw new lf.g();
        }
    }
}
