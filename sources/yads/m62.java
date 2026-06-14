package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class m62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f113329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9 f113330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f113331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k31 f113332d;

    public /* synthetic */ m62(c4 c4Var, t9 t9Var, List list) {
        this(c4Var, t9Var, list, new k31());
    }

    public final boolean a() {
        if (!this.f113329a.f109207n) {
            return false;
        }
        if (!this.f113330b.B) {
            return true;
        }
        Set setA = this.f113332d.a(this.f113331c);
        if (setA.isEmpty()) {
            return false;
        }
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            if (!((d31) it.next()).f109736f) {
                return true;
            }
        }
        return false;
    }

    public m62(c4 c4Var, t9 t9Var, List list, k31 k31Var) {
        this.f113329a = c4Var;
        this.f113330b = t9Var;
        this.f113331c = list;
        this.f113332d = k31Var;
    }
}
