package xg;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes3.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f108200a = a.f108201a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f108201a = new a();

        private a() {
        }
    }

    float A(SerialDescriptor serialDescriptor, int i10);

    byte C(SerialDescriptor serialDescriptor, int i10);

    boolean D(SerialDescriptor serialDescriptor, int i10);

    short F(SerialDescriptor serialDescriptor, int i10);

    double G(SerialDescriptor serialDescriptor, int i10);

    ah.b a();

    void c(SerialDescriptor serialDescriptor);

    long e(SerialDescriptor serialDescriptor, int i10);

    int f(SerialDescriptor serialDescriptor, int i10);

    String i(SerialDescriptor serialDescriptor, int i10);

    boolean j();

    Decoder l(SerialDescriptor serialDescriptor, int i10);

    Object p(SerialDescriptor serialDescriptor, int i10, ug.c cVar, Object obj);

    char r(SerialDescriptor serialDescriptor, int i10);

    Object s(SerialDescriptor serialDescriptor, int i10, ug.c cVar, Object obj);

    int w(SerialDescriptor serialDescriptor);

    int x(SerialDescriptor serialDescriptor);
}
