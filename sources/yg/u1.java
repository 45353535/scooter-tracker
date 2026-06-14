package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KSerializer f119081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SerialDescriptor f119082b;

    public u1(KSerializer serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f119081a = serializer;
        this.f119082b = new s2(serializer.getDescriptor());
    }

    @Override // ug.c
    public Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.E() ? decoder.k(this.f119081a) : decoder.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && u1.class == obj.getClass() && Intrinsics.areEqual(this.f119081a, ((u1) obj).f119081a);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return this.f119082b;
    }

    public int hashCode() {
        return this.f119081a.hashCode();
    }

    @Override // ug.n
    public void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj == null) {
            encoder.B();
        } else {
            encoder.E();
            encoder.j(this.f119081a, obj);
        }
    }
}
