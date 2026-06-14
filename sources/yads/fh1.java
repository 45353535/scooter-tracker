package yads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fh1 extends AbstractMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient l f110726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient eh1 f110727c;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        l lVar = this.f110726b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l((n) this);
        this.f110726b = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        eh1 eh1Var = this.f110727c;
        if (eh1Var != null) {
            return eh1Var;
        }
        eh1 eh1Var2 = new eh1(this);
        this.f110727c = eh1Var2;
        return eh1Var2;
    }
}
