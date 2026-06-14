package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class JavaTypeAttributesKt {
    @NotNull
    public static final JavaTypeAttributes toAttributes(@NotNull TypeUsage typeUsage, boolean z10, boolean z11, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.checkNotNullParameter(typeUsage, "<this>");
        return new JavaTypeAttributes(typeUsage, null, z11, z10, typeParameterDescriptor != null ? SetsKt.setOf(typeParameterDescriptor) : null, null, 34, null);
    }

    public static /* synthetic */ JavaTypeAttributes toAttributes$default(TypeUsage typeUsage, boolean z10, boolean z11, TypeParameterDescriptor typeParameterDescriptor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            typeParameterDescriptor = null;
        }
        return toAttributes(typeUsage, z10, z11, typeParameterDescriptor);
    }
}
