package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import zg.m1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 implements KSerializer {

    @NotNull
    private final KSerializer tSerializer;

    public g0(KSerializer tSerializer) {
        Intrinsics.checkNotNullParameter(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // ug.c
    public final Object deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        h hVarD = r.d(decoder);
        return hVarD.d().d(this.tSerializer, transformDeserialize(hVarD.u()));
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // ug.n
    public final void serialize(@NotNull Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        s sVarE = r.e(encoder);
        sVarE.s(transformSerialize(m1.d(sVarE.d(), obj, this.tSerializer)));
    }

    protected abstract JsonElement transformDeserialize(JsonElement jsonElement);

    @NotNull
    protected JsonElement transformSerialize(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }
}
