package yg;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class s3 implements KSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s3 f119067b = new s3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ x1 f119068a = new x1("kotlin.Unit", Unit.f93236a);

    private s3() {
    }

    public void a(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f119068a.deserialize(decoder);
    }

    @Override // ug.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, Unit value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f119068a.serialize(encoder, value);
    }

    @Override // ug.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        a(decoder);
        return Unit.f93236a;
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return this.f119068a.getDescriptor();
    }
}
