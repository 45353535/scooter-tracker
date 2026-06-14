package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class NameResolverUtilKt {
    @NotNull
    public static final ClassId getClassId(@NotNull NameResolver nameResolver, int i10) {
        Intrinsics.checkNotNullParameter(nameResolver, "<this>");
        return ClassId.Companion.fromString(nameResolver.getQualifiedClassName(i10), nameResolver.isLocalClassName(i10));
    }

    @NotNull
    public static final Name getName(@NotNull NameResolver nameResolver, int i10) {
        Intrinsics.checkNotNullParameter(nameResolver, "<this>");
        Name nameGuessByFirstCharacter = Name.guessByFirstCharacter(nameResolver.getString(i10));
        Intrinsics.checkNotNullExpressionValue(nameGuessByFirstCharacter, "guessByFirstCharacter(...)");
        return nameGuessByFirstCharacter;
    }
}
