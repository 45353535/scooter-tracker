package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f119018a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f119019b = new p2("kotlin.Byte", e.b.f107979a);

    private l() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.H());
    }

    public void b(Encoder encoder, byte b10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.e(b10);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f119019b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((Number) obj).byteValue());
    }
}
