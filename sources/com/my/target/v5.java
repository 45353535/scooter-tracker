package com.my.target;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class v5 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f60949d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f60950e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f60951f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f60952g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f60953h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f60954i = -1;

    public v5(String str) {
        this.f60948c = str;
        str.getClass();
        switch (str) {
            case "preroll":
                this.f60947b = 1;
                break;
            case "postroll":
                this.f60947b = 3;
                break;
            case "pauseroll":
                this.f60947b = 4;
                break;
            case "midroll":
                this.f60947b = 2;
                break;
            default:
                this.f60947b = 0;
                break;
        }
    }

    public static v5 a(String str) {
        return b(str);
    }

    public static v5 b(String str) {
        return new v5(str);
    }

    public void c() {
        this.f60952g.clear();
    }

    public List d() {
        return new ArrayList(this.f60949d);
    }

    public int e() {
        return this.f60953h;
    }

    public int f() {
        return this.f60954i;
    }

    public ArrayList g() {
        return new ArrayList(this.f60951f);
    }

    public String h() {
        return this.f60948c;
    }

    public boolean i() {
        return (this.f60951f.isEmpty() && this.f60950e.isEmpty()) ? false : true;
    }

    public u j() {
        if (this.f60950e.size() > 0) {
            return (u) this.f60950e.remove(0);
        }
        return null;
    }

    public void a(int i10) {
        this.f60953h = i10;
    }

    public void b(int i10) {
        this.f60954i = i10;
    }

    public void a(s5 s5Var) {
        s5Var.e(this.f60947b);
        this.f60949d.add(s5Var);
    }

    public void a(s5 s5Var, int i10) {
        int size = this.f60949d.size();
        if (i10 < 0 || i10 > size) {
            return;
        }
        s5Var.e(this.f60947b);
        this.f60949d.add(i10, s5Var);
        ArrayList arrayList = this.f60952g;
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            u uVar = (u) obj;
            int iA = uVar.A();
            if (iA >= i10) {
                uVar.d(iA + 1);
            }
        }
    }

    @Override // com.my.target.t
    public int a() {
        return this.f60949d.size();
    }

    public ArrayList a(float f10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f60951f;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.y() == f10) {
                arrayList.add(uVar);
            }
        }
        if (arrayList.size() > 0) {
            this.f60951f.removeAll(arrayList);
        }
        return arrayList;
    }

    public void a(u uVar) {
        if (uVar.H()) {
            this.f60951f.add(uVar);
        } else if (uVar.F()) {
            this.f60950e.add(uVar);
        } else {
            this.f60952g.add(uVar);
        }
    }

    public void a(v5 v5Var) {
        ArrayList arrayList = v5Var.f60949d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a((s5) obj);
        }
        this.f60950e.addAll(v5Var.f60950e);
        this.f60951f.addAll(v5Var.f60951f);
    }
}
