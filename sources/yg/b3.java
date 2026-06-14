package yg;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b3 implements Decoder, xg.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f118939b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f118940c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(b3 b3Var, ug.c cVar, Object obj) {
        return (cVar.getDescriptor().b() || b3Var.E()) ? b3Var.M(cVar, obj) : b3Var.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object L(b3 b3Var, ug.c cVar, Object obj) {
        return b3Var.M(cVar, obj);
    }

    private final Object d0(Object obj, Function0 function0) {
        c0(obj);
        Object objInvoke = function0.invoke();
        if (!this.f118940c) {
            b0();
        }
        this.f118940c = false;
        return objInvoke;
    }

    @Override // xg.d
    public final float A(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return S(Z(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean B() {
        return N(b0());
    }

    @Override // xg.d
    public final byte C(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return O(Z(descriptor, i10));
    }

    @Override // xg.d
    public final boolean D(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return N(Z(descriptor, i10));
    }

    @Override // xg.d
    public final short F(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return W(Z(descriptor, i10));
    }

    @Override // xg.d
    public final double G(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Q(Z(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte H() {
        return O(b0());
    }

    protected Object M(ug.c deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return k(deserializer);
    }

    protected abstract boolean N(Object obj);

    protected abstract byte O(Object obj);

    protected abstract char P(Object obj);

    protected abstract double Q(Object obj);

    protected abstract int R(Object obj, SerialDescriptor serialDescriptor);

    protected abstract float S(Object obj);

    protected Decoder T(Object obj, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        c0(obj);
        return this;
    }

    protected abstract int U(Object obj);

    protected abstract long V(Object obj);

    protected abstract short W(Object obj);

    protected abstract String X(Object obj);

    protected final Object Y() {
        return CollectionsKt.lastOrNull((List) this.f118939b);
    }

    protected abstract Object Z(SerialDescriptor serialDescriptor, int i10);

    public final ArrayList a0() {
        return this.f118939b;
    }

    protected final Object b0() {
        ArrayList arrayList = this.f118939b;
        Object objRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.f118940c = true;
        return objRemove;
    }

    protected final void c0(Object obj) {
        this.f118939b.add(obj);
    }

    @Override // xg.d
    public final long e(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return V(Z(descriptor, i10));
    }

    @Override // xg.d
    public final int f(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return U(Z(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Void g() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long h() {
        return V(b0());
    }

    @Override // xg.d
    public final String i(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return X(Z(descriptor, i10));
    }

    @Override // xg.d
    public /* synthetic */ boolean j() {
        return xg.c.b(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract /* synthetic */ Object k(ug.c cVar);

    @Override // xg.d
    public final Decoder l(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return T(Z(descriptor, i10), descriptor.d(i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short m() {
        return W(b0());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double n() {
        return Q(b0());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char o() {
        return P(b0());
    }

    @Override // xg.d
    public final Object p(SerialDescriptor descriptor, int i10, final ug.c deserializer, final Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return d0(Z(descriptor, i10), new Function0() { // from class: yg.a3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b3.K(this.f118935b, deserializer, obj);
            }
        });
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String q() {
        return X(b0());
    }

    @Override // xg.d
    public final char r(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return P(Z(descriptor, i10));
    }

    @Override // xg.d
    public final Object s(SerialDescriptor descriptor, int i10, final ug.c deserializer, final Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return d0(Z(descriptor, i10), new Function0() { // from class: yg.z2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b3.L(this.f119110b, deserializer, obj);
            }
        });
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int t(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return R(b0(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int v() {
        return U(b0());
    }

    @Override // xg.d
    public /* synthetic */ int w(SerialDescriptor serialDescriptor) {
        return xg.c.a(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder y(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return T(b0(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float z() {
        return S(b0());
    }
}
