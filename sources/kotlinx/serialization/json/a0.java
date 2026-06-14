package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f93656a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f93657b = wg.k.e("kotlinx.serialization.json.JsonNull", l.b.f108007a, new SerialDescriptor[0], null, 8, null);

    private a0() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonNull deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        r.g(decoder);
        if (decoder.E()) {
            throw new zg.e0("Expected 'null' literal");
        }
        decoder.g();
        return JsonNull.INSTANCE;
    }

    @Override // ug.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonNull value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        r.h(encoder);
        encoder.B();
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f93657b;
    }
}
