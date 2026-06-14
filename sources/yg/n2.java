package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f119036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(SerialDescriptor primitive) {
        super(primitive, null);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f119036c = primitive.h() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String h() {
        return this.f119036c;
    }
}
