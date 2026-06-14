package kotlinx.serialization.encoding;

import ah.b;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ug.n;
import xg.f;

/* JADX INFO: loaded from: classes3.dex */
public interface Encoder {
    void A(long j10);

    void B();

    void D(char c10);

    void E();

    b a();

    f b(SerialDescriptor serialDescriptor);

    void e(byte b10);

    void f(SerialDescriptor serialDescriptor, int i10);

    Encoder g(SerialDescriptor serialDescriptor);

    void j(n nVar, Object obj);

    void l(short s10);

    void m(boolean z10);

    void n(float f10);

    void t(int i10);

    void w(String str);

    void y(double d10);

    f z(SerialDescriptor serialDescriptor, int i10);
}
