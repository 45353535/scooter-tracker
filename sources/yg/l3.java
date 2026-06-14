package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class l3 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3 f119026a = new l3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f119027b = u0.a("kotlin.UInt", vg.a.B(kotlin.jvm.internal.a0.f93281a));

    private l3() {
    }

    public int a(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return lf.t.c(decoder.y(getDescriptor()).v());
    }

    public void b(Encoder encoder, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.g(getDescriptor()).t(i10);
    }

    @Override // ug.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return lf.t.a(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f119027b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((lf.t) obj).g());
    }
}
