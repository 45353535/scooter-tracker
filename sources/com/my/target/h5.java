package com.my.target;

import com.my.target.a9;
import com.my.target.k5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class h5 implements k5, a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9 f59806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5.a f59807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f59808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f59809d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f59810e;

    public h5(a9 a9Var, List list, k5.a aVar) {
        this.f59806a = a9Var;
        this.f59807b = aVar;
        this.f59810e = new ArrayList(list);
        this.f59808c = new boolean[list.size()];
        a9Var.setListener(this);
    }

    public static k5 a(a9 a9Var, List list, k5.a aVar) {
        return new h5(a9Var, list, aVar);
    }

    @Override // com.my.target.c5.a
    public void a(b bVar, boolean z10, int i10, int i11) {
        if (!this.f59806a.a(i10)) {
            this.f59806a.b(i10);
        } else if (z10) {
            this.f59807b.a(bVar, i11);
        }
    }

    @Override // com.my.target.c5.a
    public void a(b bVar) {
        if (this.f59809d.contains(bVar)) {
            return;
        }
        this.f59807b.b(bVar);
        this.f59809d.add(bVar);
    }

    @Override // com.my.target.a9.a
    public void a(int[] iArr) {
        for (int i10 : iArr) {
            if (i10 >= 0) {
                boolean[] zArr = this.f59808c;
                if (i10 < zArr.length && !zArr[i10]) {
                    zArr[i10] = true;
                    this.f59807b.a((b) this.f59810e.get(i10));
                }
            }
        }
    }
}
