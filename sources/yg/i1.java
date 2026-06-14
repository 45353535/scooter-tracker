package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f118988a = new i1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f118989b = new p2("kotlin.Long", e.g.f107984a);

    private i1() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.h());
    }

    public void b(Encoder encoder, long j10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.A(j10);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f118989b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((Number) obj).longValue());
    }
}
