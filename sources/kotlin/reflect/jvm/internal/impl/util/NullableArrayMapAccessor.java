package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.d;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements d {
    public NullableArrayMapAccessor(int i10) {
        super(i10);
    }

    @Override // kotlin.properties.d
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((AbstractArrayMapOwner) obj, (KProperty<?>) kProperty);
    }

    @Nullable
    public T getValue(@NotNull AbstractArrayMapOwner<K, V> thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return extractValue(thisRef);
    }
}
