package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class InlineClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {

    @NotNull
    private final Name underlyingPropertyName;

    @NotNull
    private final Type underlyingType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassRepresentation(@NotNull Name underlyingPropertyName, @NotNull Type underlyingType) {
        super(null);
        Intrinsics.checkNotNullParameter(underlyingPropertyName, "underlyingPropertyName");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.underlyingPropertyName = underlyingPropertyName;
        this.underlyingType = underlyingType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public boolean containsPropertyWithName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.areEqual(this.underlyingPropertyName, name);
    }

    @NotNull
    public final Name getUnderlyingPropertyName() {
        return this.underlyingPropertyName;
    }

    @NotNull
    public final Type getUnderlyingType() {
        return this.underlyingType;
    }

    @NotNull
    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.underlyingPropertyName + ", underlyingType=" + this.underlyingType + ')';
    }
}
