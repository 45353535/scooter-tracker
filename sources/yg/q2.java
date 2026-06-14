package yg;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f119050a = c2.i();

    public static final SerialDescriptor a(String serialName, wg.e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        c(serialName);
        return new p2(serialName, kind);
    }

    public static final KSerializer b(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return (KSerializer) f119050a.get(kClass);
    }

    public static final void c(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        for (KSerializer kSerializer : f119050a.values()) {
            if (Intrinsics.areEqual(serialName, kSerializer.getDescriptor().h())) {
                throw new IllegalArgumentException(StringsKt.n("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + serialName + " there already exists " + kotlin.jvm.internal.v0.b(kSerializer.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
