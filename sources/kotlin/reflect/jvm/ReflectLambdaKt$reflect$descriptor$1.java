package kotlin.reflect.jvm;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends y implements Function2<MemberDeserializer, ProtoBuf.Function, SimpleFunctionDescriptor> {
    public static final ReflectLambdaKt$reflect$descriptor$1 INSTANCE = new ReflectLambdaKt$reflect$descriptor$1();

    ReflectLambdaKt$reflect$descriptor$1() {
        super(2, MemberDeserializer.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final SimpleFunctionDescriptor invoke(MemberDeserializer p02, ProtoBuf.Function p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return p02.loadFunction(p12);
    }
}
