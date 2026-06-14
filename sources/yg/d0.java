package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f118945a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f118946b = new p2("kotlin.time.Duration", e.i.f107986a);

    private d0() {
    }

    public long a(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return kotlin.time.b.f93560c.d(decoder.q());
    }

    public void b(Encoder encoder, long j10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.w(kotlin.time.b.J(j10));
    }

    @Override // ug.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return kotlin.time.b.g(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f118946b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((kotlin.time.b) obj).N());
    }
}
