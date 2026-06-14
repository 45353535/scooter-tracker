package yg;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c3 implements Encoder, xg.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f118944a = new ArrayList();

    private final boolean H(SerialDescriptor serialDescriptor, int i10) {
        Z(X(serialDescriptor, i10));
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void A(long j10) {
        R(Y(), j10);
    }

    @Override // xg.f
    public final void C(SerialDescriptor descriptor, int i10, float f10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        O(X(descriptor, i10), f10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void D(char c10) {
        L(Y(), c10);
    }

    @Override // xg.f
    public void F(SerialDescriptor descriptor, int i10, ug.n serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (H(descriptor, i10)) {
            j(serializer, obj);
        }
    }

    @Override // xg.f
    public final void G(SerialDescriptor descriptor, int i10, double d10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        M(X(descriptor, i10), d10);
    }

    public /* synthetic */ void I(ug.n nVar, Object obj) {
        xg.h.c(this, nVar, obj);
    }

    protected abstract void J(Object obj, boolean z10);

    protected abstract void K(Object obj, byte b10);

    protected abstract void L(Object obj, char c10);

    protected abstract void M(Object obj, double d10);

    protected abstract void N(Object obj, SerialDescriptor serialDescriptor, int i10);

    protected abstract void O(Object obj, float f10);

    protected Encoder P(Object obj, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        Z(obj);
        return this;
    }

    protected abstract void Q(Object obj, int i10);

    protected abstract void R(Object obj, long j10);

    protected abstract void S(Object obj, short s10);

    protected abstract void T(Object obj, String str);

    protected abstract void U(SerialDescriptor serialDescriptor);

    protected final Object V() {
        return CollectionsKt.last((List) this.f118944a);
    }

    protected final Object W() {
        return CollectionsKt.lastOrNull((List) this.f118944a);
    }

    protected abstract Object X(SerialDescriptor serialDescriptor, int i10);

    protected final Object Y() {
        if (this.f118944a.isEmpty()) {
            throw new ug.m("No tag in stack for requested element");
        }
        ArrayList arrayList = this.f118944a;
        return arrayList.remove(CollectionsKt.getLastIndex(arrayList));
    }

    protected final void Z(Object obj) {
        this.f118944a.add(obj);
    }

    @Override // xg.f
    public final void c(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.f118944a.isEmpty()) {
            Y();
        }
        U(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void e(byte b10) {
        K(Y(), b10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void f(SerialDescriptor enumDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        N(Y(), enumDescriptor, i10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder g(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return P(Y(), descriptor);
    }

    @Override // xg.f
    public void h(SerialDescriptor descriptor, int i10, ug.n serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (H(descriptor, i10)) {
            I(serializer, obj);
        }
    }

    @Override // xg.f
    public final void i(SerialDescriptor descriptor, int i10, char c10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        L(X(descriptor, i10), c10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract /* synthetic */ void j(ug.n nVar, Object obj);

    @Override // xg.f
    public final void k(SerialDescriptor descriptor, int i10, byte b10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        K(X(descriptor, i10), b10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void l(short s10) {
        S(Y(), s10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void m(boolean z10) {
        J(Y(), z10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void n(float f10) {
        O(Y(), f10);
    }

    @Override // xg.f
    public final void o(SerialDescriptor descriptor, int i10, int i11) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Q(X(descriptor, i10), i11);
    }

    @Override // xg.f
    public final void p(SerialDescriptor descriptor, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        J(X(descriptor, i10), z10);
    }

    @Override // xg.f
    public final void q(SerialDescriptor descriptor, int i10, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        T(X(descriptor, i10), value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void t(int i10) {
        Q(Y(), i10);
    }

    @Override // xg.f
    public final void u(SerialDescriptor descriptor, int i10, short s10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        S(X(descriptor, i10), s10);
    }

    @Override // xg.f
    public final void v(SerialDescriptor descriptor, int i10, long j10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        R(X(descriptor, i10), j10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void w(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        T(Y(), value);
    }

    @Override // xg.f
    public final Encoder x(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return P(X(descriptor, i10), descriptor.d(i10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void y(double d10) {
        M(Y(), d10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public /* synthetic */ xg.f z(SerialDescriptor serialDescriptor, int i10) {
        return xg.h.a(this, serialDescriptor, i10);
    }
}
