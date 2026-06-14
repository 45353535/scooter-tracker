package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class r3 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r3 f119058a = new r3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f119059b = u0.a("kotlin.UShort", vg.a.D(kotlin.jvm.internal.y0.f93336a));

    private r3() {
    }

    public short a(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return lf.y.c(decoder.y(getDescriptor()).m());
    }

    public void b(Encoder encoder, short s10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.g(getDescriptor()).l(s10);
    }

    @Override // ug.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return lf.y.a(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f119059b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((lf.y) obj).g());
    }
}
