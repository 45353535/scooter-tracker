package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final LazyJavaResolverContext f93379c;

    @NotNull
    private final JavaTypeParameter javaTypeParameter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(@NotNull LazyJavaResolverContext c10, @NotNull JavaTypeParameter javaTypeParameter, int i10, @NotNull DeclarationDescriptor containingDeclaration) {
        super(c10.getStorageManager(), containingDeclaration, new LazyJavaAnnotations(c10, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.INVARIANT, false, i10, SourceElement.NO_SOURCE, c10.getComponents().getSupertypeLoopChecker());
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        this.f93379c = c10;
        this.javaTypeParameter = javaTypeParameter;
    }

    private final List<KotlinType> computeNotEnhancedBounds() {
        Collection<JavaClassifierType> upperBounds = this.javaTypeParameter.getUpperBounds();
        if (upperBounds.isEmpty()) {
            SimpleType anyType = this.f93379c.getModule().getBuiltIns().getAnyType();
            Intrinsics.checkNotNullExpressionValue(anyType, "getAnyType(...)");
            SimpleType nullableAnyType = this.f93379c.getModule().getBuiltIns().getNullableAnyType();
            Intrinsics.checkNotNullExpressionValue(nullableAnyType, "getNullableAnyType(...)");
            return CollectionsKt.listOf(KotlinTypeFactory.flexibleType(anyType, nullableAnyType));
        }
        Collection<JavaClassifierType> collection = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f93379c.getTypeResolver().transformJavaType((JavaClassifierType) it.next(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    protected List<KotlinType> processBoundsWithoutCycles(@NotNull List<? extends KotlinType> bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return this.f93379c.getComponents().getSignatureEnhancement().enhanceTypeParameterBounds(this, bounds, this.f93379c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: reportSupertypeLoopError */
    protected void mo8666reportSupertypeLoopError(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    protected List<KotlinType> resolveUpperBounds() {
        return computeNotEnhancedBounds();
    }
}
