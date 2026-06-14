package xg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import ug.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Decoder, d {
    @Override // xg.d
    public final float A(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return z();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean B() {
        Object objJ = J();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objJ).booleanValue();
    }

    @Override // xg.d
    public final byte C(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return H();
    }

    @Override // xg.d
    public final boolean D(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return B();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean E() {
        return true;
    }

    @Override // xg.d
    public final short F(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return m();
    }

    @Override // xg.d
    public final double G(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return n();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte H();

    public Object I(ug.c deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return k(deserializer);
    }

    public Object J() {
        throw new m(v0.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public d b(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // xg.d
    public void c(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // xg.d
    public final long e(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return h();
    }

    @Override // xg.d
    public final int f(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return v();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Void g() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long h();

    @Override // xg.d
    public final String i(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return q();
    }

    @Override // xg.d
    public /* synthetic */ boolean j() {
        return c.b(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public /* synthetic */ Object k(ug.c cVar) {
        return g.a(this, cVar);
    }

    @Override // xg.d
    public Decoder l(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return y(descriptor.d(i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short m();

    @Override // kotlinx.serialization.encoding.Decoder
    public double n() {
        Object objJ = J();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objJ).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char o() {
        Object objJ = J();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objJ).charValue();
    }

    @Override // xg.d
    public final Object p(SerialDescriptor descriptor, int i10, ug.c deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (deserializer.getDescriptor().b() || E()) ? I(deserializer, obj) : g();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String q() {
        Object objJ = J();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlin.String");
        return (String) objJ;
    }

    @Override // xg.d
    public final char r(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return o();
    }

    @Override // xg.d
    public Object s(SerialDescriptor descriptor, int i10, ug.c deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return I(deserializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int t(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object objJ = J();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int v();

    @Override // xg.d
    public /* synthetic */ int w(SerialDescriptor serialDescriptor) {
        return c.a(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder y(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float z() {
        Object objJ = J();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objJ).floatValue();
    }
}
