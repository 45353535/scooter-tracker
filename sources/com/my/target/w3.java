package com.my.target;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class w3 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f60994d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f60995e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f60996f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f60997g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f60998h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f60999i = -1;

    public w3(String str) {
        this.f60993c = str;
        str.getClass();
        switch (str) {
            case "preroll":
                this.f60992b = 1;
                break;
            case "postroll":
                this.f60992b = 3;
                break;
            case "pauseroll":
                this.f60992b = 4;
                break;
            case "midroll":
                this.f60992b = 2;
                break;
            default:
                this.f60992b = 0;
                break;
        }
    }

    public static w3 a(String str) {
        return new w3(str);
    }

    public static w3 b(String str) {
        return a(str);
    }

    public void c() {
        this.f60997g.clear();
    }

    public List d() {
        return DesugarCollections.unmodifiableList(this.f60994d);
    }

    public int e() {
        return this.f60998h;
    }

    public int f() {
        return this.f60999i;
    }

    public List g() {
        return DesugarCollections.unmodifiableList(this.f60996f);
    }

    public String h() {
        return this.f60993c;
    }

    public boolean i() {
        return (this.f60996f.isEmpty() && this.f60995e.isEmpty()) ? false : true;
    }

    public u j() {
        if (this.f60995e.size() > 0) {
            return (u) this.f60995e.remove(0);
        }
        return null;
    }

    public void a(int i10) {
        this.f60998h = i10;
    }

    public void b(int i10) {
        this.f60999i = i10;
    }

    public void a(k0 k0Var) {
        k0Var.e(this.f60992b);
        this.f60994d.add(k0Var);
    }

    public void a(k0 k0Var, int i10) {
        int size = this.f60994d.size();
        if (i10 >= 0 && i10 <= size) {
            k0Var.e(this.f60992b);
            this.f60994d.add(i10, k0Var);
            ArrayList arrayList = this.f60997g;
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
            return;
        }
        gb.a("InstreamVideoAdSection: can't add banner, wrong position");
    }

    @Override // com.my.target.t
    public int a() {
        return this.f60994d.size();
    }

    public ArrayList a(float f10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f60996f;
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
            this.f60996f.removeAll(arrayList);
        }
        return arrayList;
    }

    public void a(u uVar) {
        if (uVar.H()) {
            this.f60996f.add(uVar);
        } else if (uVar.F()) {
            this.f60995e.add(uVar);
        } else {
            this.f60997g.add(uVar);
        }
    }

    public void a(w3 w3Var) {
        ArrayList arrayList = w3Var.f60994d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a((k0) obj);
        }
        this.f60995e.addAll(w3Var.f60995e);
        this.f60996f.addAll(w3Var.f60996f);
    }
}
