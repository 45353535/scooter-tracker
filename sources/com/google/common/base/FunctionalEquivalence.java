package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function f28883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Equivalence f28884c;

    FunctionalEquivalence(Function function, Equivalence equivalence) {
        this.f28883b = (Function) Preconditions.checkNotNull(function);
        this.f28884c = (Equivalence) Preconditions.checkNotNull(equivalence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.base.Equivalence
    protected boolean a(Object obj, Object obj2) {
        return this.f28884c.equivalent(this.f28883b.apply(obj), this.f28883b.apply(obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.base.Equivalence
    protected int b(Object obj) {
        return this.f28884c.hash(this.f28883b.apply(obj));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionalEquivalence) {
            FunctionalEquivalence functionalEquivalence = (FunctionalEquivalence) obj;
            if (this.f28883b.equals(functionalEquivalence.f28883b) && this.f28884c.equals(functionalEquivalence.f28884c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f28883b, this.f28884c);
    }

    public String toString() {
        return this.f28884c + ".onResultOf(" + this.f28883b + ")";
    }
}
