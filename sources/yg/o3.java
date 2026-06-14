package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class o3 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o3 f119040a = new o3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f119041b = u0.a("kotlin.ULong", vg.a.C(kotlin.jvm.internal.c0.f93287a));

    private o3() {
    }

    public long a(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return lf.v.c(decoder.y(getDescriptor()).h());
    }

    public void b(Encoder encoder, long j10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.g(getDescriptor()).A(j10);
    }

    @Override // ug.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return lf.v.a(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f119041b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((lf.v) obj).g());
    }
}
