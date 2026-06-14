package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Function f29325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Ordering f29326c;

    ByFunctionOrdering(Function function, Ordering ordering) {
        this.f29325b = (Function) Preconditions.checkNotNull(function);
        this.f29326c = (Ordering) Preconditions.checkNotNull(ordering);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@ParametricNullness F f10, @ParametricNullness F f11) {
        return this.f29326c.compare(this.f29325b.apply(f10), this.f29325b.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByFunctionOrdering) {
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
            if (this.f29325b.equals(byFunctionOrdering.f29325b) && this.f29326c.equals(byFunctionOrdering.f29326c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f29325b, this.f29326c);
    }

    public String toString() {
        return this.f29326c + ".onResultOf(" + this.f29325b + ")";
    }
}
