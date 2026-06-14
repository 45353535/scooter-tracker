package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SerialDescriptor elementDesc) {
        super(elementDesc, null);
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String h() {
        return "kotlin.collections.ArrayList";
    }
}
