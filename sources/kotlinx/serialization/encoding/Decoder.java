package kotlinx.serialization.encoding;

import ah.b;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ug.c;
import xg.d;

/* JADX INFO: loaded from: classes3.dex */
public interface Decoder {
    boolean B();

    boolean E();

    byte H();

    b a();

    d b(SerialDescriptor serialDescriptor);

    Void g();

    long h();

    Object k(c cVar);

    short m();

    double n();

    char o();

    String q();

    int t(SerialDescriptor serialDescriptor);

    int v();

    Decoder y(SerialDescriptor serialDescriptor);

    float z();
}
