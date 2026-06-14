package yads;

import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class f82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f110638a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f110639b = new WeakHashMap();

    public final boolean a() {
        boolean z10;
        synchronized (this.f110638a) {
            z10 = !this.f110639b.isEmpty();
        }
        return z10;
    }

    public final void b() {
        ArrayList<za3> arrayList;
        synchronized (this.f110638a) {
            arrayList = new ArrayList(this.f110639b.keySet());
            this.f110639b.clear();
            Unit unit = Unit.f93236a;
        }
        for (za3 za3Var : arrayList) {
            if (za3Var != null) {
                za3Var.a();
            }
        }
    }

    public final void a(za3 za3Var) {
        synchronized (this.f110638a) {
            this.f110639b.put(za3Var, null);
            Unit unit = Unit.f93236a;
        }
    }

    public final void b(za3 za3Var) {
        synchronized (this.f110638a) {
            this.f110639b.remove(za3Var);
        }
    }
}
