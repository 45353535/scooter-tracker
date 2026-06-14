package yads;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class rc0 implements gc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f115400a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mc0 f115401b;

    public final void a(Exception exc, boolean z10) {
        this.f115401b = null;
        y31 y31VarA = y31.a((Collection) this.f115400a);
        this.f115400a.clear();
        v31 v31VarListIterator = y31VarA.listIterator(0);
        while (v31VarListIterator.hasNext()) {
            mc0 mc0Var = (mc0) v31VarListIterator.next();
            mc0Var.getClass();
            mc0Var.a(z10 ? 1 : 3, exc);
        }
    }
}
