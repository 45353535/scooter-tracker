package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f119093a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f119094b = new p2("kotlin.Int", e.f.f107983a);

    private x0() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.v());
    }

    public void b(Encoder encoder, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.t(i10);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f119094b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((Number) obj).intValue());
    }
}
