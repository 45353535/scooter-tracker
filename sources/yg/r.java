package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f119052a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f119053b = new p2("kotlin.Char", e.c.f107980a);

    private r() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.o());
    }

    public void b(Encoder encoder, char c10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.D(c10);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f119053b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((Character) obj).charValue());
    }
}
