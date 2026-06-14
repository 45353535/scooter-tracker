package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean declaresDefaultValue;
    private final int index;
    private final boolean isCrossinline;
    private final boolean isNoinline;

    @NotNull
    private final ValueParameterDescriptor original;

    @Nullable
    private final KotlinType varargElementType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ValueParameterDescriptorImpl createWithDestructuringDeclarations(@NotNull CallableDescriptor containingDeclaration, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i10, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType outType, boolean z10, boolean z11, boolean z12, @Nullable KotlinType kotlinType, @NotNull SourceElement source, @Nullable Function0<? extends List<? extends VariableDescriptor>> function0) {
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(outType, "outType");
            Intrinsics.checkNotNullParameter(source, "source");
            return function0 == null ? new ValueParameterDescriptorImpl(containingDeclaration, valueParameterDescriptor, i10, annotations, name, outType, z10, z11, z12, kotlinType, source) : new WithDestructuringDeclaration(containingDeclaration, valueParameterDescriptor, i10, annotations, name, outType, z10, z11, z12, kotlinType, source, function0);
        }

        private Companion() {
        }
    }

    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {

        @NotNull
        private final Lazy destructuringVariables$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(@NotNull CallableDescriptor containingDeclaration, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i10, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType outType, boolean z10, boolean z11, boolean z12, @Nullable KotlinType kotlinType, @NotNull SourceElement source, @NotNull Function0<? extends List<? extends VariableDescriptor>> destructuringVariables) {
            super(containingDeclaration, valueParameterDescriptor, i10, annotations, name, outType, z10, z11, z12, kotlinType, source);
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(outType, "outType");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(destructuringVariables, "destructuringVariables");
            this.destructuringVariables$delegate = i.a(destructuringVariables);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
        @NotNull
        public ValueParameterDescriptor copy(@NotNull CallableDescriptor newOwner, @NotNull Name newName, int i10) {
            Intrinsics.checkNotNullParameter(newOwner, "newOwner");
            Intrinsics.checkNotNullParameter(newName, "newName");
            Annotations annotations = getAnnotations();
            Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
            KotlinType type = getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            boolean zDeclaresDefaultValue = declaresDefaultValue();
            boolean zIsCrossinline = isCrossinline();
            boolean zIsNoinline = isNoinline();
            KotlinType varargElementType = getVarargElementType();
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            return new WithDestructuringDeclaration(newOwner, null, i10, annotations, newName, type, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, varargElementType, NO_SOURCE, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$WithDestructuringDeclaration$$Lambda$0
                private final ValueParameterDescriptorImpl.WithDestructuringDeclaration arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.arg$0.getDestructuringVariables();
                }
            });
        }

        @NotNull
        public final List<VariableDescriptor> getDestructuringVariables() {
            return (List) this.destructuringVariables$delegate.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(@NotNull CallableDescriptor containingDeclaration, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i10, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType outType, boolean z10, boolean z11, boolean z12, @Nullable KotlinType kotlinType, @NotNull SourceElement source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outType, "outType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.index = i10;
        this.declaresDefaultValue = z10;
        this.isCrossinline = z11;
        this.isNoinline = z12;
        this.varargElementType = kotlinType;
        this.original = valueParameterDescriptor == null ? this : valueParameterDescriptor;
    }

    @NotNull
    public static final ValueParameterDescriptorImpl createWithDestructuringDeclarations(@NotNull CallableDescriptor callableDescriptor, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i10, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType kotlinType, boolean z10, boolean z11, boolean z12, @Nullable KotlinType kotlinType2, @NotNull SourceElement sourceElement, @Nullable Function0<? extends List<? extends VariableDescriptor>> function0) {
        return Companion.createWithDestructuringDeclarations(callableDescriptor, valueParameterDescriptor, i10, annotations, name, kotlinType, z10, z11, z12, kotlinType2, sourceElement, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> visitor, D d10) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.visitValueParameterDescriptor(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @NotNull
    public ValueParameterDescriptor copy(@NotNull CallableDescriptor newOwner, @NotNull Name newName, int i10) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newName, "newName");
        Annotations annotations = getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        KotlinType type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        boolean zDeclaresDefaultValue = declaresDefaultValue();
        boolean zIsCrossinline = isCrossinline();
        boolean zIsNoinline = isNoinline();
        KotlinType varargElementType = getVarargElementType();
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return new ValueParameterDescriptorImpl(newOwner, null, i10, annotations, newName, type, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, varargElementType, NO_SOURCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean declaresDefaultValue() {
        if (!this.declaresDefaultValue) {
            return false;
        }
        CallableDescriptor containingDeclaration = getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        return ((CallableMemberDescriptor) containingDeclaration).getKind().isReal();
    }

    @Nullable
    public Void getCompileTimeInitializer() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public Collection<ValueParameterDescriptor> getOverriddenDescriptors() {
        Collection<? extends CallableDescriptor> overriddenDescriptors = getContainingDeclaration().getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends CallableDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallableDescriptor) it.next()).getValueParameters().get(getIndex()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @Nullable
    public KotlinType getVarargElementType() {
        return this.varargElementType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility LOCAL = DescriptorVisibilities.LOCAL;
        Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean isCrossinline() {
        return this.isCrossinline;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return ValueParameterDescriptor.DefaultImpls.isLateInit(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean isNoinline() {
        return this.isNoinline;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: getCompileTimeInitializer, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ConstantValue mo8659getCompileTimeInitializer() {
        return (ConstantValue) getCompileTimeInitializer();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public CallableDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = super.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (CallableDescriptor) containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    public ValueParameterDescriptor substitute(@NotNull TypeSubstitutor substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.isEmpty()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public ValueParameterDescriptor getOriginal() {
        ValueParameterDescriptor valueParameterDescriptor = this.original;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.getOriginal();
    }
}
