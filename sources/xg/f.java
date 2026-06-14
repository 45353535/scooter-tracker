package xg;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import ug.n;

/* JADX INFO: loaded from: classes3.dex */
public interface f {
    void C(SerialDescriptor serialDescriptor, int i10, float f10);

    void F(SerialDescriptor serialDescriptor, int i10, n nVar, Object obj);

    void G(SerialDescriptor serialDescriptor, int i10, double d10);

    void c(SerialDescriptor serialDescriptor);

    void h(SerialDescriptor serialDescriptor, int i10, n nVar, Object obj);

    void i(SerialDescriptor serialDescriptor, int i10, char c10);

    void k(SerialDescriptor serialDescriptor, int i10, byte b10);

    void o(SerialDescriptor serialDescriptor, int i10, int i11);

    void p(SerialDescriptor serialDescriptor, int i10, boolean z10);

    void q(SerialDescriptor serialDescriptor, int i10, String str);

    boolean r(SerialDescriptor serialDescriptor, int i10);

    void u(SerialDescriptor serialDescriptor, int i10, short s10);

    void v(SerialDescriptor serialDescriptor, int i10, long j10);

    Encoder x(SerialDescriptor serialDescriptor, int i10);
}
