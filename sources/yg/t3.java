package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;

/* JADX INFO: loaded from: classes3.dex */
public final class t3 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t3 f119076a = new t3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f119077b = new p2("kotlin.uuid.Uuid", e.i.f107986a);

    private t3() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dg.a deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return dg.a.f68665d.c(decoder.q());
    }

    @Override // ug.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, dg.a value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.w(value.toString());
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f119077b;
    }
}
