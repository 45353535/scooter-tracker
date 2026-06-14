package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;
import zg.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f93691a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f93692b = wg.k.e("kotlinx.serialization.json.JsonPrimitive", e.i.f107986a, new SerialDescriptor[0], null, 8, null);

    private e0() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonPrimitive deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementU = r.d(decoder).u();
        if (jsonElementU instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementU;
        }
        throw i0.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + v0.b(jsonElementU.getClass()), jsonElementU.toString());
    }

    @Override // ug.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonPrimitive value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        r.h(encoder);
        if (value instanceof JsonNull) {
            encoder.j(a0.f93656a, JsonNull.INSTANCE);
        } else {
            encoder.j(x.f93716a, (w) value);
        }
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f93692b;
    }
}
