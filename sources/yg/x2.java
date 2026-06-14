package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x2 f119098a = new x2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f119099b = new p2("kotlin.Short", e.h.f107985a);

    private x2() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.m());
    }

    public void b(Encoder encoder, short s10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.l(s10);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f119099b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((Number) obj).shortValue());
    }
}
