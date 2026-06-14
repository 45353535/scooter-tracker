package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends l1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(SerialDescriptor keyDesc, SerialDescriptor valueDesc) {
        super("kotlin.collections.LinkedHashMap", keyDesc, valueDesc, null);
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
    }
}
