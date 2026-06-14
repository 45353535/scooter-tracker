package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1 f119074a = new t1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SerialDescriptor f119075b = s1.f119061a;

    private t1() {
    }

    @Override // ug.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new ug.m("'kotlin.Nothing' does not have instances");
    }

    @Override // ug.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, Void value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new ug.m("'kotlin.Nothing' cannot be serialized");
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f119075b;
    }
}
