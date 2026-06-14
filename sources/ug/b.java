package ug;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.l;
import yg.d2;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KClass f105651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KSerializer f105652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f105653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SerialDescriptor f105654d;

    public b(KClass serializableClass, KSerializer kSerializer, KSerializer[] typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.f105651a = serializableClass;
        this.f105652b = kSerializer;
        this.f105653c = ArraysKt.asList(typeArgumentsSerializers);
        this.f105654d = wg.b.c(wg.k.d("kotlinx.serialization.ContextualSerializer", l.a.f108006a, new SerialDescriptor[0], new Function1() { // from class: ug.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.b(this.f105650b, (wg.a) obj);
            }
        }), serializableClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(b bVar, wg.a buildSerialDescriptor) {
        SerialDescriptor descriptor;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        KSerializer kSerializer = bVar.f105652b;
        List annotations = (kSerializer == null || (descriptor = kSerializer.getDescriptor()) == null) ? null : descriptor.getAnnotations();
        if (annotations == null) {
            annotations = CollectionsKt.emptyList();
        }
        buildSerialDescriptor.h(annotations);
        return Unit.f93236a;
    }

    private final KSerializer c(ah.b bVar) {
        KSerializer kSerializerB = bVar.b(this.f105651a, this.f105653c);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        KSerializer kSerializer = this.f105652b;
        if (kSerializer != null) {
            return kSerializer;
        }
        d2.f(this.f105651a);
        throw new lf.g();
    }

    @Override // ug.c
    public Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.k(c(decoder.a()));
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return this.f105654d;
    }

    @Override // ug.n
    public void serialize(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.j(c(encoder.a()), value);
    }
}
