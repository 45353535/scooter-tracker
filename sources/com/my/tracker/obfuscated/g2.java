package com.my.tracker.obfuscated;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SparseArray f61531a = new SparseArray(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final SparseArray f61532b = new SparseArray(20);

    final d2 a(int i10) {
        d2 d2Var = (d2) this.f61532b.get(i10);
        if (d2Var != null) {
            return d2Var;
        }
        f2 f2Var = new f2(i10);
        this.f61532b.put(i10, f2Var);
        return f2Var;
    }

    public final boolean b(int i10) {
        return this.f61531a.get(i10) != null;
    }

    public final int b() {
        return this.f61531a.size();
    }

    final ArrayList a() {
        int size = this.f61532b.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add((e2) this.f61532b.valueAt(i10));
        }
        return arrayList;
    }

    final void a(long j10) {
        for (int i10 = 0; i10 < this.f61531a.size(); i10++) {
            ((u1) this.f61531a.valueAt(i10)).b(j10);
        }
    }

    final String a(boolean z10) {
        return z10 ? "[FOREGROUND] " : "[BACKGROUND] ";
    }
}
