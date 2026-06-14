package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f118941a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f118942b = new p2("kotlin.Double", e.d.f107981a);

    private c0() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.n());
    }

    public void b(Encoder encoder, double d10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.y(d10);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f118942b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((Number) obj).doubleValue());
    }
}
