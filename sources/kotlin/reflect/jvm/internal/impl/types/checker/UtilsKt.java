package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilsKt {
    private static final KotlinType approximate(KotlinType kotlinType) {
        return CapturedTypeApproximationKt.approximateCapturedTypes(kotlinType).getUpper();
    }

    private static final String debugInfo(TypeConstructor typeConstructor) {
        StringBuilder sb2 = new StringBuilder();
        debugInfo$lambda$1$unaryPlus("type: " + typeConstructor, sb2);
        debugInfo$lambda$1$unaryPlus("hashCode: " + typeConstructor.hashCode(), sb2);
        debugInfo$lambda$1$unaryPlus("javaClass: " + typeConstructor.getClass().getCanonicalName(), sb2);
        for (DeclarationDescriptor declarationDescriptorMo8663getDeclarationDescriptor = typeConstructor.mo8663getDeclarationDescriptor(); declarationDescriptorMo8663getDeclarationDescriptor != null; declarationDescriptorMo8663getDeclarationDescriptor = declarationDescriptorMo8663getDeclarationDescriptor.getContainingDeclaration()) {
            debugInfo$lambda$1$unaryPlus("fqName: " + DescriptorRenderer.FQ_NAMES_IN_TYPES.render(declarationDescriptorMo8663getDeclarationDescriptor), sb2);
            debugInfo$lambda$1$unaryPlus("javaClass: " + declarationDescriptorMo8663getDeclarationDescriptor.getClass().getCanonicalName(), sb2);
        }
        return sb2.toString();
    }

    private static final StringBuilder debugInfo$lambda$1$unaryPlus(String str, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
        return sb2;
    }

    @Nullable
    public static final KotlinType findCorrespondingSupertype(@NotNull KotlinType subtype, @NotNull KotlinType supertype, @NotNull TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new SubtypePathNode(subtype, null));
        TypeConstructor constructor = supertype.getConstructor();
        while (!arrayDeque.isEmpty()) {
            SubtypePathNode subtypePathNode = (SubtypePathNode) arrayDeque.poll();
            KotlinType type = subtypePathNode.getType();
            TypeConstructor constructor2 = type.getConstructor();
            if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor2, constructor)) {
                boolean zIsMarkedNullable = type.isMarkedNullable();
                for (SubtypePathNode previous = subtypePathNode.getPrevious(); previous != null; previous = previous.getPrevious()) {
                    KotlinType type2 = previous.getType();
                    List<TypeProjection> arguments = type2.getArguments();
                    if ((arguments instanceof Collection) && arguments.isEmpty()) {
                        type = TypeConstructorSubstitution.Companion.create(type2).buildSubstitutor().safeSubstitute(type, Variance.INVARIANT);
                        Intrinsics.checkNotNull(type);
                    } else {
                        Iterator<T> it = arguments.iterator();
                        while (it.hasNext()) {
                            Variance projectionKind = ((TypeProjection) it.next()).getProjectionKind();
                            Variance variance = Variance.INVARIANT;
                            if (projectionKind != variance) {
                                KotlinType kotlinTypeSafeSubstitute = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(TypeConstructorSubstitution.Companion.create(type2), false, 1, null).buildSubstitutor().safeSubstitute(type, variance);
                                Intrinsics.checkNotNullExpressionValue(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
                                type = approximate(kotlinTypeSafeSubstitute);
                                break;
                            }
                        }
                        type = TypeConstructorSubstitution.Companion.create(type2).buildSubstitutor().safeSubstitute(type, Variance.INVARIANT);
                        Intrinsics.checkNotNull(type);
                    }
                    zIsMarkedNullable = zIsMarkedNullable || type2.isMarkedNullable();
                }
                TypeConstructor constructor3 = type.getConstructor();
                if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor)) {
                    return TypeUtils.makeNullableAsSpecified(type, zIsMarkedNullable);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + debugInfo(constructor3) + ", \n\nsupertype: " + debugInfo(constructor) + " \n" + typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor));
            }
            for (KotlinType kotlinType : constructor2.mo8664getSupertypes()) {
                Intrinsics.checkNotNull(kotlinType);
                arrayDeque.add(new SubtypePathNode(kotlinType, subtypePathNode));
            }
        }
        return null;
    }
}
