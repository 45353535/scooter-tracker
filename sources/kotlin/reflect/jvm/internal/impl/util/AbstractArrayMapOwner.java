package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, a {

    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f93389id;

        public AbstractArrayMapAccessor(int i10) {
            this.f93389id = i10;
        }

        @Nullable
        protected final T extractValue(@NotNull AbstractArrayMapOwner<K, V> thisRef) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            return thisRef.getArrayMap().get(this.f93389id);
        }
    }

    @NotNull
    protected abstract ArrayMap<V> getArrayMap();

    @NotNull
    protected abstract TypeRegistry<K, V> getTypeRegistry();

    public final boolean isEmpty() {
        return getArrayMap().getSize() == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        return getArrayMap().iterator();
    }

    protected abstract void registerComponent(@NotNull String str, @NotNull V v10);

    protected final void registerComponent(@NotNull KClass<? extends K> tClass, @NotNull V value) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        Intrinsics.checkNotNullParameter(value, "value");
        String qualifiedName = tClass.getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName);
        registerComponent(qualifiedName, value);
    }
}
