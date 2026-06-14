package androidx.core.content;

import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4457a;

    @Override // androidx.core.util.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return androidx.core.util.i.a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public /* synthetic */ Predicate negate() {
        return androidx.core.util.i.b(this);
    }

    @Override // androidx.core.util.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return androidx.core.util.i.c(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        return this.f4457a.equals((String) obj);
    }
}
