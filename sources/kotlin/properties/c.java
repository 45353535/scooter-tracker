package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements e {
    private Object value;

    public c(Object obj) {
        this.value = obj;
    }

    protected void afterChange(@NotNull KProperty<?> property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    protected boolean beforeChange(@NotNull KProperty<?> property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // kotlin.properties.e, kotlin.properties.d
    public Object getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.e
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj3 = this.value;
        if (beforeChange(property, obj3, obj2)) {
            this.value = obj2;
            afterChange(property, obj3, obj2);
        }
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
