package com.my.target;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f61039a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61040b = 60;

    public static final x5 c() {
        return new x5();
    }

    public int a() {
        return this.f61040b;
    }

    public boolean b() {
        return !this.f61039a.isEmpty();
    }

    public y5 d() {
        if (this.f61039a.isEmpty()) {
            return null;
        }
        return (y5) this.f61039a.remove(0);
    }

    public void a(int i10) {
        this.f61040b = i10;
    }

    public void a(y5 y5Var) {
        int size = this.f61039a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (y5Var.f() > ((y5) this.f61039a.get(i10)).f()) {
                this.f61039a.add(i10, y5Var);
                return;
            }
        }
        this.f61039a.add(y5Var);
    }

    public void a(l1 l1Var) {
        ArrayList arrayList = this.f61039a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l1Var.a((y5) obj);
        }
    }
}
