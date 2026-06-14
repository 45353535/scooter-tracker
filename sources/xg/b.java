package xg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import ug.m;
import ug.n;
import yg.r1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements Encoder, f {
    @Override // kotlinx.serialization.encoding.Encoder
    public void A(long j10) {
        J(Long.valueOf(j10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void B() {
        throw new m("'null' is not supported by default");
    }

    @Override // xg.f
    public final void C(SerialDescriptor descriptor, int i10, float f10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            n(f10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void D(char c10) {
        J(Character.valueOf(c10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public /* synthetic */ void E() {
        h.b(this);
    }

    @Override // xg.f
    public void F(SerialDescriptor descriptor, int i10, n serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (H(descriptor, i10)) {
            j(serializer, obj);
        }
    }

    @Override // xg.f
    public final void G(SerialDescriptor descriptor, int i10, double d10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            y(d10);
        }
    }

    public boolean H(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    public /* synthetic */ void I(n nVar, Object obj) {
        h.c(this, nVar, obj);
    }

    public void J(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new m("Non-serializable " + v0.b(value.getClass()) + " is not supported by " + v0.b(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public f b(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // xg.f
    public void c(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void e(byte b10) {
        J(Byte.valueOf(b10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void f(SerialDescriptor enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        J(Integer.valueOf(i10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder g(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // xg.f
    public void h(SerialDescriptor descriptor, int i10, n serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (H(descriptor, i10)) {
            I(serializer, obj);
        }
    }

    @Override // xg.f
    public final void i(SerialDescriptor descriptor, int i10, char c10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            D(c10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public /* synthetic */ void j(n nVar, Object obj) {
        h.d(this, nVar, obj);
    }

    @Override // xg.f
    public final void k(SerialDescriptor descriptor, int i10, byte b10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            e(b10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void l(short s10) {
        J(Short.valueOf(s10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void m(boolean z10) {
        J(Boolean.valueOf(z10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void n(float f10) {
        J(Float.valueOf(f10));
    }

    @Override // xg.f
    public final void o(SerialDescriptor descriptor, int i10, int i11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            t(i11);
        }
    }

    @Override // xg.f
    public final void p(SerialDescriptor descriptor, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            m(z10);
        }
    }

    @Override // xg.f
    public final void q(SerialDescriptor descriptor, int i10, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (H(descriptor, i10)) {
            w(value);
        }
    }

    @Override // xg.f
    public /* synthetic */ boolean r(SerialDescriptor serialDescriptor, int i10) {
        return e.a(this, serialDescriptor, i10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void t(int i10) {
        J(Integer.valueOf(i10));
    }

    @Override // xg.f
    public final void u(SerialDescriptor descriptor, int i10, short s10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            l(s10);
        }
    }

    @Override // xg.f
    public final void v(SerialDescriptor descriptor, int i10, long j10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (H(descriptor, i10)) {
            A(j10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void w(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        J(value);
    }

    @Override // xg.f
    public final Encoder x(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return H(descriptor, i10) ? g(descriptor.d(i10)) : r1.f119054a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void y(double d10) {
        J(Double.valueOf(d10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public /* synthetic */ f z(SerialDescriptor serialDescriptor, int i10) {
        return h.a(this, serialDescriptor, i10);
    }
}
