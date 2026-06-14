package ve;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f106683a = new k1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f106684b = wg.k.b("io.ktor.http.Url", e.i.f107986a);

    private k1() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f1 deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return w0.d(decoder.q());
    }

    @Override // ug.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, f1 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.w(value.getUrlString());
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f106684b;
    }
}
