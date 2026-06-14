package kotlin.reflect.jvm.internal.impl.types;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import org.jetbrains.annotations.NotNull;
import yf.a;

/* JADX INFO: loaded from: classes3.dex */
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> implements Iterable<TypeAttribute<?>>, a {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final TypeAttributes Empty = new TypeAttributes((List<? extends TypeAttribute<?>>) CollectionsKt.emptyList());

    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TypeAttributes create(@NotNull List<? extends TypeAttribute<?>> attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return attributes.isEmpty() ? getEmpty() : new TypeAttributes(attributes, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public int customComputeIfAbsent(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String key, @NotNull Function1<? super String, Integer> compute) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(compute, "compute");
            Integer num = concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Integer numInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(numInvoke.intValue()));
                        iIntValue = numInvoke.intValue();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iIntValue;
        }

        @NotNull
        public final TypeAttributes getEmpty() {
            return TypeAttributes.Empty;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TypeAttributes(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<? extends TypeAttribute<?>>) list);
    }

    @NotNull
    public final TypeAttributes add(@NotNull TypeAttributes other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = getArrayMap().get(iIntValue);
            TypeAttribute<?> typeAttribute2 = other.getArrayMap().get(iIntValue);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.add(typeAttribute) : null : typeAttribute.add(typeAttribute2));
        }
        return Companion.create(arrayList);
    }

    public final boolean contains(@NotNull TypeAttribute<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        return getArrayMap().get(Companion.getId((KClass) attribute.getKey())) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    protected TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> getTypeRegistry() {
        return Companion;
    }

    @NotNull
    public final TypeAttributes intersect(@NotNull TypeAttributes other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = getArrayMap().get(iIntValue);
            TypeAttribute<?> typeAttribute2 = other.getArrayMap().get(iIntValue);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.intersect(typeAttribute) : null : typeAttribute.intersect(typeAttribute2));
        }
        return Companion.create(arrayList);
    }

    @NotNull
    public final TypeAttributes plus(@NotNull TypeAttribute<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (contains(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new TypeAttributes(attribute);
        }
        return Companion.create(CollectionsKt.plus((Collection<? extends TypeAttribute<?>>) CollectionsKt.toList(this), attribute));
    }

    @NotNull
    public final TypeAttributes remove(@NotNull TypeAttribute<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (!isEmpty()) {
            ArrayMap<TypeAttribute<?>> arrayMap = getArrayMap();
            ArrayList arrayList = new ArrayList();
            for (TypeAttribute<?> typeAttribute : arrayMap) {
                if (!Intrinsics.areEqual(typeAttribute, attribute)) {
                    arrayList.add(typeAttribute);
                }
            }
            if (arrayList.size() != getArrayMap().getSize()) {
                return Companion.create(arrayList);
            }
        }
        return this;
    }

    private TypeAttributes(List<? extends TypeAttribute<?>> list) {
        for (TypeAttribute<?> typeAttribute : list) {
            registerComponent((KClass) typeAttribute.getKey(), typeAttribute);
        }
    }

    private TypeAttributes(TypeAttribute<?> typeAttribute) {
        this((List<? extends TypeAttribute<?>>) CollectionsKt.listOf(typeAttribute));
    }
}
