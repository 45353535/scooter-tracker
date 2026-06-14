package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeConstructorSubstitution extends TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ TypeConstructorSubstitution createByConstructorsMap$default(Companion companion, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.createByConstructorsMap(map, z10);
        }

        @NotNull
        public final TypeSubstitution create(@NotNull KotlinType kotlinType) {
            Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
            return create(kotlinType.getConstructor(), kotlinType.getArguments());
        }

        @NotNull
        public final TypeConstructorSubstitution createByConstructorsMap(@NotNull Map<TypeConstructor, ? extends TypeProjection> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            return createByConstructorsMap$default(this, map, false, 2, null);
        }

        private Companion() {
        }

        @NotNull
        public final TypeSubstitution create(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> arguments) {
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.lastOrNull((List) parameters);
            if (typeParameterDescriptor == null || !typeParameterDescriptor.isCapturedFromOuterDeclaration()) {
                return new IndexedParametersSubstitution(parameters, arguments);
            }
            List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
            List<TypeParameterDescriptor> list = parameters2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).getTypeConstructor());
            }
            return createByConstructorsMap$default(this, MapsKt.toMap(CollectionsKt.zip(arrayList, arguments)), false, 2, null);
        }

        @NotNull
        public final TypeConstructorSubstitution createByConstructorsMap(@NotNull final Map<TypeConstructor, ? extends TypeProjection> map, final boolean z10) {
            Intrinsics.checkNotNullParameter(map, "map");
            return new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateCapturedTypes() {
                    return z10;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                public TypeProjection get(TypeConstructor key) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    return map.get(key);
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean isEmpty() {
                    return map.isEmpty();
                }
            };
        }
    }

    @NotNull
    public static final TypeSubstitution create(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list) {
        return Companion.create(typeConstructor, list);
    }

    @NotNull
    public static final TypeConstructorSubstitution createByConstructorsMap(@NotNull Map<TypeConstructor, ? extends TypeProjection> map) {
        return Companion.createByConstructorsMap(map);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: get */
    public TypeProjection mo8668get(@NotNull KotlinType key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return get(key.getConstructor());
    }

    @Nullable
    public abstract TypeProjection get(@NotNull TypeConstructor typeConstructor);
}
