package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class i3 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i3 f119002a = new i3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f119003b = u0.a("kotlin.UByte", vg.a.x(kotlin.jvm.internal.n.f93317a));

    private i3() {
    }

    public byte a(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return lf.r.c(decoder.y(getDescriptor()).H());
    }

    public void b(Encoder encoder, byte b10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.g(getDescriptor()).e(b10);
    }

    @Override // ug.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return lf.r.a(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f119003b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((lf.r) obj).g());
    }
}
