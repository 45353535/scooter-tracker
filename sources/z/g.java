package z;

import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import z.l;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f119128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f119129c;

    public g(View view, boolean z10) {
        this.f119128b = view;
        this.f119129c = z10;
    }

    @Override // z.l
    public boolean a() {
        return this.f119129c;
    }

    @Override // z.j
    public Object b(Continuation continuation) {
        return l.a.h(this, continuation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(getView(), gVar.getView()) && a() == gVar.a();
    }

    @Override // z.l
    public View getView() {
        return this.f119128b;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + androidx.compose.foundation.c.a(a());
    }
}
