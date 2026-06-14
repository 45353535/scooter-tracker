package kotlin.reflect.jvm.internal.impl.types;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class StarProjectionImpl extends TypeProjectionBase {

    @NotNull
    private final Lazy _type$delegate;

    @NotNull
    private final TypeParameterDescriptor typeParameter;

    public StarProjectionImpl(@NotNull TypeParameterDescriptor typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.typeParameter = typeParameter;
        this._type$delegate = i.b(l.f94210c, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl$$Lambda$0
            private final StarProjectionImpl arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return StarProjectionImpl._type_delegate$lambda$0(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType _type_delegate$lambda$0(StarProjectionImpl starProjectionImpl) {
        return StarProjectionImplKt.starProjectionType(starProjectionImpl.typeParameter);
    }

    private final KotlinType get_type() {
        return (KotlinType) this._type$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        return get_type();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public TypeProjection refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
