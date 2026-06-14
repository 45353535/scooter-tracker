package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AbstractNullabilityChecker {

    @NotNull
    public static final AbstractNullabilityChecker INSTANCE = new AbstractNullabilityChecker();

    private AbstractNullabilityChecker() {
    }

    private final boolean isApplicableAsEndNode(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (typeSystemContext.isNothing(rigidTypeMarker)) {
            return true;
        }
        if (typeSystemContext.isMarkedNullable(rigidTypeMarker)) {
            return false;
        }
        if (typeCheckerState.isStubTypeEqualsToAnything() && typeSystemContext.isStubType(rigidTypeMarker)) {
            return true;
        }
        return typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarker), typeConstructorMarker);
    }

    private final boolean runIsPossibleSubtype(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (AbstractTypeChecker.RUN_SLOW_ASSERTIONS) {
            if (!typeSystemContext.isSingleClassifierType(rigidTypeMarker) && !typeSystemContext.isIntersection(typeSystemContext.typeConstructor(rigidTypeMarker))) {
                typeCheckerState.isAllowedTypeVariable(rigidTypeMarker);
            }
            if (!typeSystemContext.isSingleClassifierType(rigidTypeMarker2)) {
                typeCheckerState.isAllowedTypeVariable(rigidTypeMarker2);
            }
        }
        if (typeSystemContext.isMarkedNullable(rigidTypeMarker2) || typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker) || typeSystemContext.isNotNullTypeParameter(rigidTypeMarker)) {
            return true;
        }
        if ((rigidTypeMarker instanceof CapturedTypeMarker) && typeSystemContext.isProjectionNotNull((CapturedTypeMarker) rigidTypeMarker)) {
            return true;
        }
        AbstractNullabilityChecker abstractNullabilityChecker = INSTANCE;
        if (abstractNullabilityChecker.hasNotNullSupertype(typeCheckerState, rigidTypeMarker, TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE)) {
            return true;
        }
        if (typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker2) || abstractNullabilityChecker.hasNotNullSupertype(typeCheckerState, rigidTypeMarker2, TypeCheckerState.SupertypesPolicy.UpperIfFlexible.INSTANCE) || typeSystemContext.isClassType(rigidTypeMarker)) {
            return false;
        }
        return abstractNullabilityChecker.hasPathByNotMarkedNullableNodes(typeCheckerState, rigidTypeMarker, typeSystemContext.typeConstructor(rigidTypeMarker2));
    }

    public final boolean hasNotNullSupertype(@NotNull TypeCheckerState typeCheckerState, @NotNull RigidTypeMarker type, @NotNull TypeCheckerState.SupertypesPolicy supertypesPolicy) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(supertypesPolicy, "supertypesPolicy");
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if ((typeSystemContext.isClassType(type) && !typeSystemContext.isMarkedNullable(type)) || typeSystemContext.isDefinitelyNotNullType(type)) {
            return true;
        }
        typeCheckerState.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(type);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                TypeCheckerState.SupertypesPolicy supertypesPolicy2 = typeSystemContext.isMarkedNullable(rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : supertypesPolicy;
                if (Intrinsics.areEqual(supertypesPolicy2, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy2 = null;
                }
                if (supertypesPolicy2 == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo8667transformType = supertypesPolicy2.mo8667transformType(typeCheckerState, it.next());
                        if ((typeSystemContext.isClassType(rigidTypeMarkerMo8667transformType) && !typeSystemContext.isMarkedNullable(rigidTypeMarkerMo8667transformType)) || typeSystemContext.isDefinitelyNotNullType(rigidTypeMarkerMo8667transformType)) {
                            typeCheckerState.clear();
                            return true;
                        }
                        supertypesDeque.add(rigidTypeMarkerMo8667transformType);
                    }
                }
            }
        }
        typeCheckerState.clear();
        return false;
    }

    public final boolean hasPathByNotMarkedNullableNodes(@NotNull TypeCheckerState state, @NotNull RigidTypeMarker start, @NotNull TypeConstructorMarker end) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (INSTANCE.isApplicableAsEndNode(state, start, end)) {
            return true;
        }
        state.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = state.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = state.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(start);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                TypeCheckerState.SupertypesPolicy supertypesPolicy = typeSystemContext.isMarkedNullable(rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                if (Intrinsics.areEqual(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContext2 = state.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo8667transformType = supertypesPolicy.mo8667transformType(state, it.next());
                        if (INSTANCE.isApplicableAsEndNode(state, rigidTypeMarkerMo8667transformType, end)) {
                            state.clear();
                            return true;
                        }
                        supertypesDeque.add(rigidTypeMarkerMo8667transformType);
                    }
                }
            }
        }
        state.clear();
        return false;
    }

    public final boolean isPossibleSubtype(@NotNull TypeCheckerState state, @NotNull RigidTypeMarker subType, @NotNull RigidTypeMarker superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return runIsPossibleSubtype(state, subType, superType);
    }
}
