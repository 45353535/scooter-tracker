package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AbstractTypeChecker {

    @NotNull
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();
    public static boolean RUN_SLOW_ASSERTIONS;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private AbstractTypeChecker() {
    }

    private final Boolean checkSubtypeForIntegerLiteralType(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (!typeSystemContext.isIntegerLiteralType(rigidTypeMarker) && !typeSystemContext.isIntegerLiteralType(rigidTypeMarker2)) {
            return null;
        }
        if (checkSubtypeForIntegerLiteralType$lambda$7$isIntegerLiteralTypeOrCapturedOne(typeSystemContext, rigidTypeMarker) && checkSubtypeForIntegerLiteralType$lambda$7$isIntegerLiteralTypeOrCapturedOne(typeSystemContext, rigidTypeMarker2)) {
            return Boolean.TRUE;
        }
        if (typeSystemContext.isIntegerLiteralType(rigidTypeMarker)) {
            if (checkSubtypeForIntegerLiteralType$lambda$7$isTypeInIntegerLiteralType(typeSystemContext, typeCheckerState, rigidTypeMarker, rigidTypeMarker2, false)) {
                return Boolean.TRUE;
            }
        } else if (typeSystemContext.isIntegerLiteralType(rigidTypeMarker2) && (checkSubtypeForIntegerLiteralType$lambda$7$isIntegerLiteralTypeInIntersectionComponents(typeSystemContext, rigidTypeMarker) || checkSubtypeForIntegerLiteralType$lambda$7$isTypeInIntegerLiteralType(typeSystemContext, typeCheckerState, rigidTypeMarker2, rigidTypeMarker, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean checkSubtypeForIntegerLiteralType$lambda$7$isCapturedIntegerLiteralType(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        KotlinTypeMarker type;
        RigidTypeMarker rigidTypeMarkerUpperBoundIfFlexible;
        return (rigidTypeMarker instanceof CapturedTypeMarker) && (type = typeSystemContext.getType(typeSystemContext.projection(typeSystemContext.typeConstructor((CapturedTypeMarker) rigidTypeMarker)))) != null && (rigidTypeMarkerUpperBoundIfFlexible = typeSystemContext.upperBoundIfFlexible(type)) != null && typeSystemContext.isIntegerLiteralType(rigidTypeMarkerUpperBoundIfFlexible);
    }

    private static final boolean checkSubtypeForIntegerLiteralType$lambda$7$isIntegerLiteralTypeInIntersectionComponents(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(rigidTypeMarker);
        if (!(typeConstructorMarkerTypeConstructor instanceof IntersectionTypeConstructorMarker)) {
            return false;
        }
        Collection<KotlinTypeMarker> collectionSupertypes = typeSystemContext.supertypes(typeConstructorMarkerTypeConstructor);
        if ((collectionSupertypes instanceof Collection) && collectionSupertypes.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionSupertypes.iterator();
        while (it.hasNext()) {
            RigidTypeMarker rigidTypeMarkerAsRigidType = typeSystemContext.asRigidType((KotlinTypeMarker) it.next());
            if (rigidTypeMarkerAsRigidType != null && typeSystemContext.isIntegerLiteralType(rigidTypeMarkerAsRigidType)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean checkSubtypeForIntegerLiteralType$lambda$7$isIntegerLiteralTypeOrCapturedOne(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        return typeSystemContext.isIntegerLiteralType(rigidTypeMarker) || checkSubtypeForIntegerLiteralType$lambda$7$isCapturedIntegerLiteralType(typeSystemContext, rigidTypeMarker);
    }

    private static final boolean checkSubtypeForIntegerLiteralType$lambda$7$isTypeInIntegerLiteralType(TypeSystemContext typeSystemContext, TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2, boolean z10) {
        TypeCheckerState typeCheckerState2;
        RigidTypeMarker rigidTypeMarker3;
        Collection<KotlinTypeMarker> collectionPossibleIntegerTypes = typeSystemContext.possibleIntegerTypes(rigidTypeMarker);
        if ((collectionPossibleIntegerTypes instanceof Collection) && collectionPossibleIntegerTypes.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker kotlinTypeMarker : collectionPossibleIntegerTypes) {
            if (Intrinsics.areEqual(typeSystemContext.typeConstructor(kotlinTypeMarker), typeSystemContext.typeConstructor(rigidTypeMarker2))) {
                return true;
            }
            if (z10) {
                typeCheckerState2 = typeCheckerState;
                rigidTypeMarker3 = rigidTypeMarker2;
                if (isSubtypeOf$default(INSTANCE, typeCheckerState2, rigidTypeMarker3, kotlinTypeMarker, false, 8, null)) {
                    return true;
                }
            } else {
                typeCheckerState2 = typeCheckerState;
                rigidTypeMarker3 = rigidTypeMarker2;
            }
            typeCheckerState = typeCheckerState2;
            rigidTypeMarker2 = rigidTypeMarker3;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Boolean checkSubtypeForSpecialCases(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r13, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r14, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r15) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.checkSubtypeForSpecialCases(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker):java.lang.Boolean");
    }

    private final List<RigidTypeMarker> collectAllSupertypesWithGivenTypeConstructor(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicySubstitutionSupertypePolicy;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        List<SimpleTypeMarker> listFastCorrespondingSupertypes = typeSystemContext.fastCorrespondingSupertypes(rigidTypeMarker, typeConstructorMarker);
        if (listFastCorrespondingSupertypes != null) {
            return listFastCorrespondingSupertypes;
        }
        if (!typeSystemContext.isClassTypeConstructor(typeConstructorMarker) && typeSystemContext.isClassType(rigidTypeMarker)) {
            return CollectionsKt.emptyList();
        }
        if (typeSystemContext.isCommonFinalClassConstructor(typeConstructorMarker)) {
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarker), typeConstructorMarker)) {
                return CollectionsKt.emptyList();
            }
            RigidTypeMarker rigidTypeMarkerCaptureFromArguments = typeSystemContext.captureFromArguments(rigidTypeMarker, CaptureStatus.FOR_SUBTYPING);
            if (rigidTypeMarkerCaptureFromArguments != null) {
                rigidTypeMarker = rigidTypeMarkerCaptureFromArguments;
            }
            return CollectionsKt.listOf(rigidTypeMarker);
        }
        SmartList smartList = new SmartList();
        typeCheckerState.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(rigidTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                RigidTypeMarker rigidTypeMarkerCaptureFromArguments2 = typeSystemContext.captureFromArguments(rigidTypeMarkerPop, CaptureStatus.FOR_SUBTYPING);
                if (rigidTypeMarkerCaptureFromArguments2 == null) {
                    rigidTypeMarkerCaptureFromArguments2 = rigidTypeMarkerPop;
                }
                if (typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarkerCaptureFromArguments2), typeConstructorMarker)) {
                    smartList.add(rigidTypeMarkerCaptureFromArguments2);
                    supertypesPolicySubstitutionSupertypePolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicySubstitutionSupertypePolicy = typeSystemContext.argumentsCount(rigidTypeMarkerCaptureFromArguments2) == 0 ? TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE : typeCheckerState.getTypeSystemContext().substitutionSupertypePolicy(rigidTypeMarkerCaptureFromArguments2);
                }
                if (Intrinsics.areEqual(supertypesPolicySubstitutionSupertypePolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicySubstitutionSupertypePolicy = null;
                }
                if (supertypesPolicySubstitutionSupertypePolicy != null) {
                    TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(supertypesPolicySubstitutionSupertypePolicy.mo8667transformType(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.clear();
        return smartList;
    }

    private final List<RigidTypeMarker> collectAndFilter(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        return selectOnlyPureKotlinSupertypes(typeCheckerState, collectAllSupertypesWithGivenTypeConstructor(typeCheckerState, rigidTypeMarker, typeConstructorMarker));
    }

    private final boolean completeIsSubTypeOf(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z10) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        KotlinTypeMarker kotlinTypeMarkerPrepareType = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker));
        KotlinTypeMarker kotlinTypeMarkerPrepareType2 = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker2));
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        Boolean boolCheckSubtypeForSpecialCases = abstractTypeChecker.checkSubtypeForSpecialCases(typeCheckerState, typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType), typeSystemContext.upperBoundIfFlexible(kotlinTypeMarkerPrepareType2));
        if (boolCheckSubtypeForSpecialCases == null) {
            Boolean boolAddSubtypeConstraint = typeCheckerState.addSubtypeConstraint(kotlinTypeMarkerPrepareType, kotlinTypeMarkerPrepareType2, z10);
            return boolAddSubtypeConstraint != null ? boolAddSubtypeConstraint.booleanValue() : abstractTypeChecker.isSubtypeOfForSingleClassifierType(typeCheckerState, typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType), typeSystemContext.upperBoundIfFlexible(kotlinTypeMarkerPrepareType2));
        }
        boolean zBooleanValue = boolCheckSubtypeForSpecialCases.booleanValue();
        typeCheckerState.addSubtypeConstraint(kotlinTypeMarkerPrepareType, kotlinTypeMarkerPrepareType2, z10);
        return zBooleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        return r7.getParameter(r7.typeConstructor(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getTypeParameterForArgumentInBaseIfItEqualToTarget(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r7, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r8, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r9) {
        /*
            r6 = this;
            int r0 = r7.argumentsCount(r8)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L5e
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker r4 = r7.getArgument(r8, r2)
            boolean r5 = r7.isStarProjection(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L5b
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r3 = r7.getType(r3)
            if (r3 != 0) goto L1d
            goto L5b
        L1d:
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r4 = r7.lowerBoundIfFlexible(r3)
            boolean r4 = r7.isCapturedType(r4)
            if (r4 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r4 = r7.lowerBoundIfFlexible(r9)
            boolean r4 = r7.isCapturedType(r4)
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = r1
        L34:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r9)
            if (r5 != 0) goto L52
            if (r4 == 0) goto L4b
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r4 = r7.typeConstructor(r3)
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r5 = r7.typeConstructor(r9)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 == 0) goto L4b
            goto L52
        L4b:
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r3 = r6.getTypeParameterForArgumentInBaseIfItEqualToTarget(r7, r3, r9)
            if (r3 == 0) goto L5b
            return r3
        L52:
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r8 = r7.typeConstructor(r8)
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r7 = r7.getParameter(r8, r2)
            return r7
        L5b:
            int r2 = r2 + 1
            goto L6
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.getTypeParameterForArgumentInBaseIfItEqualToTarget(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker):kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker");
    }

    private final boolean hasNothingSupertype(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(rigidTypeMarker);
        if (typeSystemContext.isClassTypeConstructor(typeConstructorMarkerTypeConstructor)) {
            return typeSystemContext.isNothingConstructor(typeConstructorMarkerTypeConstructor);
        }
        if (typeSystemContext.isNothingConstructor(typeSystemContext.typeConstructor(rigidTypeMarker))) {
            return true;
        }
        typeCheckerState.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(rigidTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                TypeCheckerState.SupertypesPolicy supertypesPolicy = typeSystemContext.isClassType(rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                if (Intrinsics.areEqual(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo8667transformType = supertypesPolicy.mo8667transformType(typeCheckerState, it.next());
                        if (typeSystemContext.isNothingConstructor(typeSystemContext.typeConstructor(rigidTypeMarkerMo8667transformType))) {
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

    private final boolean isCommonDenotableType(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        return (!typeSystemContext.isDenotable(typeSystemContext.typeConstructor(kotlinTypeMarker)) || typeSystemContext.isDynamic(kotlinTypeMarker) || typeSystemContext.isDefinitelyNotNullType(kotlinTypeMarker) || typeSystemContext.isNotNullTypeParameter(kotlinTypeMarker) || typeSystemContext.isFlexibleWithDifferentTypeConstructors(kotlinTypeMarker)) ? false : true;
    }

    private final boolean isStubTypeSubtypeOfAnother(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (typeSystemContext.typeConstructor(rigidTypeMarker) != typeSystemContext.typeConstructor(rigidTypeMarker2)) {
            return false;
        }
        if (typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker) || !typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker2)) {
            return !typeSystemContext.isMarkedNullable(rigidTypeMarker) || typeSystemContext.isMarkedNullable(rigidTypeMarker2);
        }
        return false;
    }

    public static /* synthetic */ boolean isSubtypeOf$default(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return abstractTypeChecker.isSubtypeOf(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isSubtypeOfForSingleClassifierType(final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r18, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r19, final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r20) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.isSubtypeOfForSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isSubtypeOfForSingleClassifierType$lambda$21$lambda$20(Collection collection, final TypeCheckerState typeCheckerState, final TypeSystemContext typeSystemContext, final RigidTypeMarker rigidTypeMarker, TypeCheckerState.ForkPointContext runForkingPoint) {
        Intrinsics.checkNotNullParameter(runForkingPoint, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            final RigidTypeMarker rigidTypeMarker2 = (RigidTypeMarker) it.next();
            runForkingPoint.fork(new Function0(typeCheckerState, typeSystemContext, rigidTypeMarker2, rigidTypeMarker) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$$Lambda$1
                private final TypeCheckerState arg$0;
                private final TypeSystemContext arg$1;
                private final RigidTypeMarker arg$2;
                private final RigidTypeMarker arg$3;

                {
                    this.arg$0 = typeCheckerState;
                    this.arg$1 = typeSystemContext;
                    this.arg$2 = rigidTypeMarker2;
                    this.arg$3 = rigidTypeMarker;
                }

                @Override // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return Boolean.valueOf(AbstractTypeChecker.isSubtypeOfForSingleClassifierType$lambda$21$lambda$20$lambda$19(this.arg$0, this.arg$1, this.arg$2, this.arg$3));
                }
            });
        }
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSubtypeOfForSingleClassifierType$lambda$21$lambda$20$lambda$19(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        return INSTANCE.isSubtypeForSameConstructor(typeCheckerState, typeSystemContext.asArgumentList(rigidTypeMarker), rigidTypeMarker2);
    }

    private final boolean isTypeVariableAgainstStarProjectionForSelfType(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeParameterMarker typeParameter;
        RigidTypeMarker rigidTypeMarkerAsRigidType = typeSystemContext.asRigidType(kotlinTypeMarker);
        if (rigidTypeMarkerAsRigidType instanceof CapturedTypeMarker) {
            CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) rigidTypeMarkerAsRigidType;
            if (typeSystemContext.isOldCapturedType(capturedTypeMarker) || !typeSystemContext.isStarProjection(typeSystemContext.projection(typeSystemContext.typeConstructor(capturedTypeMarker))) || typeSystemContext.captureStatus(capturedTypeMarker) != CaptureStatus.FOR_SUBTYPING) {
                return false;
            }
            TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(kotlinTypeMarker2);
            TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker = typeConstructorMarkerTypeConstructor instanceof TypeVariableTypeConstructorMarker ? (TypeVariableTypeConstructorMarker) typeConstructorMarkerTypeConstructor : null;
            if (typeVariableTypeConstructorMarker != null && (typeParameter = typeSystemContext.getTypeParameter(typeVariableTypeConstructorMarker)) != null && typeSystemContext.hasRecursiveBounds(typeParameter, typeConstructorMarker)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<RigidTypeMarker> selectOnlyPureKotlinSupertypes(TypeCheckerState typeCheckerState, List<? extends RigidTypeMarker> list) {
        int i10;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                TypeArgumentListMarker typeArgumentListMarkerAsArgumentList = typeSystemContext.asArgumentList((RigidTypeMarker) obj);
                int size = typeSystemContext.size(typeArgumentListMarkerAsArgumentList);
                while (true) {
                    if (i10 >= size) {
                        arrayList.add(obj);
                        break;
                    }
                    KotlinTypeMarker type = typeSystemContext.getType(typeSystemContext.get(typeArgumentListMarkerAsArgumentList, i10));
                    i10 = (type != null ? typeSystemContext.asFlexibleType(type) : null) == null ? i10 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    @Nullable
    public final TypeVariance effectiveVariance(@NotNull TypeVariance declared, @NotNull TypeVariance useSite) {
        Intrinsics.checkNotNullParameter(declared, "declared");
        Intrinsics.checkNotNullParameter(useSite, "useSite");
        TypeVariance typeVariance = TypeVariance.INV;
        if (declared == typeVariance) {
            return useSite;
        }
        if (useSite == typeVariance || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean equalTypes(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker a10, @NotNull KotlinTypeMarker b10) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (a10 == b10) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        if (abstractTypeChecker.isCommonDenotableType(typeSystemContext, a10) && abstractTypeChecker.isCommonDenotableType(typeSystemContext, b10)) {
            KotlinTypeMarker kotlinTypeMarkerPrepareType = state.prepareType(state.refineType(a10));
            KotlinTypeMarker kotlinTypeMarkerPrepareType2 = state.prepareType(state.refineType(b10));
            RigidTypeMarker rigidTypeMarkerLowerBoundIfFlexible = typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType);
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(kotlinTypeMarkerPrepareType), typeSystemContext.typeConstructor(kotlinTypeMarkerPrepareType2))) {
                return false;
            }
            if (typeSystemContext.argumentsCount(rigidTypeMarkerLowerBoundIfFlexible) == 0) {
                return typeSystemContext.hasFlexibleNullability(kotlinTypeMarkerPrepareType) || typeSystemContext.hasFlexibleNullability(kotlinTypeMarkerPrepareType2) || typeSystemContext.isMarkedNullable(rigidTypeMarkerLowerBoundIfFlexible) == typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType2));
            }
        }
        return isSubtypeOf$default(abstractTypeChecker, state, a10, b10, false, 8, null) && isSubtypeOf$default(abstractTypeChecker, state, b10, a10, false, 8, null);
    }

    @NotNull
    public final List<RigidTypeMarker> findCorrespondingSupertypes(@NotNull TypeCheckerState state, @NotNull RigidTypeMarker subType, @NotNull TypeConstructorMarker superConstructor) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superConstructor, "superConstructor");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (typeSystemContext.isClassType(subType)) {
            return INSTANCE.collectAndFilter(state, subType, superConstructor);
        }
        if (!typeSystemContext.isClassTypeConstructor(superConstructor) && !typeSystemContext.isIntegerLiteralTypeConstructor(superConstructor)) {
            return INSTANCE.collectAllSupertypesWithGivenTypeConstructor(state, subType, superConstructor);
        }
        SmartList<RigidTypeMarker> smartList = new SmartList();
        state.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = state.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = state.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(subType);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                if (typeSystemContext.isClassType(rigidTypeMarkerPop)) {
                    smartList.add(rigidTypeMarkerPop);
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                }
                if (Intrinsics.areEqual(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    TypeSystemContext typeSystemContext2 = state.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(supertypesPolicy.mo8667transformType(state, it.next()));
                    }
                }
            }
        }
        state.clear();
        ArrayList arrayList = new ArrayList();
        for (RigidTypeMarker rigidTypeMarker : smartList) {
            AbstractTypeChecker abstractTypeChecker = INSTANCE;
            Intrinsics.checkNotNull(rigidTypeMarker);
            CollectionsKt.addAll(arrayList, abstractTypeChecker.collectAndFilter(state, rigidTypeMarker, superConstructor));
        }
        return arrayList;
    }

    public final boolean isSubtypeForSameConstructor(@NotNull TypeCheckerState typeCheckerState, @NotNull TypeArgumentListMarker capturedSubArguments, @NotNull RigidTypeMarker superType) {
        boolean zEqualTypes;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        Intrinsics.checkNotNullParameter(typeCheckerState2, "<this>");
        Intrinsics.checkNotNullParameter(capturedSubArguments, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(superType, "superType");
        TypeSystemContext typeSystemContext = typeCheckerState2.getTypeSystemContext();
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(superType);
        int size = typeSystemContext.size(capturedSubArguments);
        int iParametersCount = typeSystemContext.parametersCount(typeConstructorMarkerTypeConstructor);
        if (size != iParametersCount || size != typeSystemContext.argumentsCount(superType)) {
            return false;
        }
        for (int i10 = 0; i10 < iParametersCount; i10++) {
            TypeArgumentMarker argument = typeSystemContext.getArgument(superType, i10);
            KotlinTypeMarker type = typeSystemContext.getType(argument);
            if (type != null) {
                TypeArgumentMarker typeArgumentMarker = typeSystemContext.get(capturedSubArguments, i10);
                typeSystemContext.getVariance(typeArgumentMarker);
                TypeVariance typeVariance = TypeVariance.INV;
                KotlinTypeMarker type2 = typeSystemContext.getType(typeArgumentMarker);
                Intrinsics.checkNotNull(type2);
                AbstractTypeChecker abstractTypeChecker = INSTANCE;
                TypeVariance typeVarianceEffectiveVariance = abstractTypeChecker.effectiveVariance(typeSystemContext.getVariance(typeSystemContext.getParameter(typeConstructorMarkerTypeConstructor, i10)), typeSystemContext.getVariance(argument));
                if (typeVarianceEffectiveVariance == null) {
                    return typeCheckerState2.isErrorTypeEqualsToAnything();
                }
                if (typeVarianceEffectiveVariance != typeVariance || (!abstractTypeChecker.isTypeVariableAgainstStarProjectionForSelfType(typeSystemContext, type2, type, typeConstructorMarkerTypeConstructor) && !abstractTypeChecker.isTypeVariableAgainstStarProjectionForSelfType(typeSystemContext, type, type2, typeConstructorMarkerTypeConstructor))) {
                    if (typeCheckerState2.argumentsDepth > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + type2).toString());
                    }
                    typeCheckerState2.argumentsDepth++;
                    int i11 = WhenMappings.$EnumSwitchMapping$0[typeVarianceEffectiveVariance.ordinal()];
                    if (i11 == 1) {
                        zEqualTypes = abstractTypeChecker.equalTypes(typeCheckerState2, type2, type);
                    } else if (i11 == 2) {
                        typeCheckerState2 = typeCheckerState;
                        zEqualTypes = isSubtypeOf$default(abstractTypeChecker, typeCheckerState2, type2, type, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            throw new m();
                        }
                        zEqualTypes = isSubtypeOf$default(abstractTypeChecker, typeCheckerState2, type, type2, false, 8, null);
                        typeCheckerState2 = typeCheckerState;
                    }
                    typeCheckerState2.argumentsDepth--;
                    if (!zEqualTypes) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean isSubtypeOf(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker subType, @NotNull KotlinTypeMarker superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return isSubtypeOf$default(this, state, subType, superType, false, 8, null);
    }

    public final boolean isSubtypeOf(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker subType, @NotNull KotlinTypeMarker superType, boolean z10) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.customIsSubtypeOf(subType, superType)) {
            return completeIsSubTypeOf(state, subType, superType, z10);
        }
        return false;
    }
}
