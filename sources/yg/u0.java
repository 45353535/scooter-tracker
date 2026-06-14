package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 {

    public static final class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ KSerializer f119080a;

        a(KSerializer kSerializer) {
            this.f119080a = kSerializer;
        }

        @Override // yg.o0
        public KSerializer[] childSerializers() {
            return new KSerializer[]{this.f119080a};
        }

        @Override // ug.c
        public Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public SerialDescriptor getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // ug.n
        public void serialize(Encoder encoder, Object obj) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    public static final SerialDescriptor a(String name, KSerializer primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new t0(name, new a(primitiveSerializer));
    }
}
