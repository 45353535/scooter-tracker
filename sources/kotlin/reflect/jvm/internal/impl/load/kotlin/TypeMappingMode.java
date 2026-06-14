package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TypeMappingMode {

    @NotNull
    public static final TypeMappingMode CLASS_DECLARATION;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final TypeMappingMode DEFAULT;

    @NotNull
    public static final TypeMappingMode DEFAULT_UAST;

    @NotNull
    public static final TypeMappingMode GENERIC_ARGUMENT;

    @NotNull
    public static final TypeMappingMode GENERIC_ARGUMENT_UAST;

    @NotNull
    public static final TypeMappingMode RETURN_TYPE_BOXED;

    @NotNull
    public static final TypeMappingMode SUPER_TYPE;

    @NotNull
    public static final TypeMappingMode SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;

    @NotNull
    public static final TypeMappingMode VALUE_FOR_ANNOTATION;

    @Nullable
    private final TypeMappingMode genericArgumentMode;

    @Nullable
    private final TypeMappingMode genericContravariantArgumentMode;

    @Nullable
    private final TypeMappingMode genericInvariantArgumentMode;
    private final boolean isForAnnotationParameter;
    private final boolean kotlinCollectionsToJavaCollections;
    private final boolean mapTypeAliases;
    private final boolean needInlineClassWrapping;
    private final boolean needPrimitiveBoxing;
    private final boolean skipDeclarationSiteWildcards;
    private final boolean skipDeclarationSiteWildcardsIfPossible;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        TypeMappingMode typeMappingMode = new TypeMappingMode(z10, z11, z12, z13, z14, null, false, null, null, z15, 1023, null);
        GENERIC_ARGUMENT = typeMappingMode;
        TypeMappingMode typeMappingMode2 = new TypeMappingMode(false, false, z15, false, false, null, false, null, null, true, 511, null);
        GENERIC_ARGUMENT_UAST = typeMappingMode2;
        RETURN_TYPE_BOXED = new TypeMappingMode(false, true, false, false, false, null, false, null, null, false, 1021, null);
        DEFAULT = new TypeMappingMode(z10, z11, z12, z13, z14, typeMappingMode, false, null, null, z15, 988, null);
        DEFAULT_UAST = new TypeMappingMode(false, false, z15, false, false, typeMappingMode2, false, null, null, true, 476, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z16 = false;
        TypeMappingMode typeMappingMode3 = null;
        TypeMappingMode typeMappingMode4 = null;
        CLASS_DECLARATION = new TypeMappingMode(z10, true, z12, z13, z14, typeMappingMode, z16, typeMappingMode3, typeMappingMode4, z15, 988, defaultConstructorMarker);
        boolean z17 = false;
        boolean z18 = true;
        SUPER_TYPE = new TypeMappingMode(z10, z17, z12, z18, z14, typeMappingMode, z16, typeMappingMode3, typeMappingMode4, z15, 983, defaultConstructorMarker);
        SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new TypeMappingMode(z10, z17, z12, z18, z14, typeMappingMode, z16, typeMappingMode3, typeMappingMode4, z15, 919, defaultConstructorMarker);
        VALUE_FOR_ANNOTATION = new TypeMappingMode(z10, z17, true, false, z14, typeMappingMode, z16, typeMappingMode3, typeMappingMode4, z15, 984, defaultConstructorMarker);
    }

    public TypeMappingMode() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.kotlinCollectionsToJavaCollections;
    }

    public final boolean getMapTypeAliases() {
        return this.mapTypeAliases;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.needInlineClassWrapping;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.needPrimitiveBoxing;
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    @NotNull
    public final TypeMappingMode toGenericArgumentMode(@NotNull Variance effectiveVariance, boolean z10) {
        Intrinsics.checkNotNullParameter(effectiveVariance, "effectiveVariance");
        if (!z10 || !this.isForAnnotationParameter) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
            if (i10 == 1) {
                TypeMappingMode typeMappingMode = this.genericContravariantArgumentMode;
                if (typeMappingMode != null) {
                    return typeMappingMode;
                }
            } else if (i10 != 2) {
                TypeMappingMode typeMappingMode2 = this.genericArgumentMode;
                if (typeMappingMode2 != null) {
                    return typeMappingMode2;
                }
            } else {
                TypeMappingMode typeMappingMode3 = this.genericInvariantArgumentMode;
                if (typeMappingMode3 != null) {
                    return typeMappingMode3;
                }
            }
        }
        return this;
    }

    @NotNull
    public final TypeMappingMode wrapInlineClassesMode() {
        return new TypeMappingMode(this.needPrimitiveBoxing, true, this.isForAnnotationParameter, this.skipDeclarationSiteWildcards, this.skipDeclarationSiteWildcardsIfPossible, this.genericArgumentMode, this.kotlinCollectionsToJavaCollections, this.genericContravariantArgumentMode, this.genericInvariantArgumentMode, false, 512, null);
    }

    public TypeMappingMode(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, @Nullable TypeMappingMode typeMappingMode, boolean z15, @Nullable TypeMappingMode typeMappingMode2, @Nullable TypeMappingMode typeMappingMode3, boolean z16) {
        this.needPrimitiveBoxing = z10;
        this.needInlineClassWrapping = z11;
        this.isForAnnotationParameter = z12;
        this.skipDeclarationSiteWildcards = z13;
        this.skipDeclarationSiteWildcardsIfPossible = z14;
        this.genericArgumentMode = typeMappingMode;
        this.kotlinCollectionsToJavaCollections = z15;
        this.genericContravariantArgumentMode = typeMappingMode2;
        this.genericInvariantArgumentMode = typeMappingMode3;
        this.mapTypeAliases = z16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TypeMappingMode(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, TypeMappingMode typeMappingMode, boolean z15, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        z12 = (i10 & 4) != 0 ? false : z12;
        z13 = (i10 & 8) != 0 ? false : z13;
        z14 = (i10 & 16) != 0 ? false : z14;
        typeMappingMode = (i10 & 32) != 0 ? null : typeMappingMode;
        this(z10, z11, z12, z13, z14, typeMappingMode, (i10 & 64) != 0 ? true : z15, (i10 & 128) != 0 ? typeMappingMode : typeMappingMode2, (i10 & 256) != 0 ? typeMappingMode : typeMappingMode3, (i10 & 512) != 0 ? false : z16);
    }
}
