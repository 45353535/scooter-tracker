package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f119029a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f119030b = new p2("kotlin.Float", e.C1330e.f107982a);

    private m0() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.z());
    }

    public void b(Encoder encoder, float f10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.n(f10);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f119030b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((Number) obj).floatValue());
    }
}
