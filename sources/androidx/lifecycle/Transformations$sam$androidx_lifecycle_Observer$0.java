package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, v {
    private final /* synthetic */ Function1 function;

    Transformations$sam$androidx_lifecycle_Observer$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof Observer) && (obj instanceof v)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((v) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.v
    @NotNull
    public final lf.e getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
