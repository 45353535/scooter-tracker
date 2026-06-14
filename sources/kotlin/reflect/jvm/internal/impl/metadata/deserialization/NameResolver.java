package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface NameResolver {
    @NotNull
    String getQualifiedClassName(int i10);

    @NotNull
    String getString(int i10);

    boolean isLocalClassName(int i10);
}
