package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface CustomTypeParameter {
    boolean isTypeParameter();

    @NotNull
    KotlinType substitutionResult(@NotNull KotlinType kotlinType);
}
