package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f118983a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f118984b = new p2("kotlin.Boolean", e.a.f107978a);

    private i() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.B());
    }

    public void b(Encoder encoder, boolean z10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.m(z10);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f118984b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((Boolean) obj).booleanValue());
    }
}
