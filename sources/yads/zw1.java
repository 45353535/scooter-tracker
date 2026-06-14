package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zw1 implements y02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f118862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u02 f118863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f118864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yz1 f118865d;

    public zw1(List list, u02 u02Var) {
        this.f118862a = list;
        this.f118863b = u02Var;
    }

    public static final boolean a(zw1 zw1Var, yz1 yz1Var) {
        List list = zw1Var.f118862a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((gi) obj).f111218f) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hi hiVarA = yz1Var.a((gi) it.next());
            if (hiVarA != null && hiVarA.d()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(zw1 zw1Var, yz1 yz1Var) {
        Object next;
        hi hiVarA;
        Iterator it = zw1Var.f118862a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            gi giVar = (gi) next;
            if (giVar.f111218f && Intrinsics.areEqual(giVar.f111213a, "sponsored")) {
                break;
            }
        }
        gi giVar2 = (gi) next;
        return giVar2 == null || ((hiVarA = yz1Var.a(giVar2)) != null && hiVarA.d());
    }

    public static final boolean c(zw1 zw1Var, yz1 yz1Var) {
        Object next;
        List list = zw1Var.f118862a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((gi) obj).f111218f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            gi giVar = (gi) next;
            hi hiVarA = yz1Var.a(giVar);
            if (!androidx.activity.s.a(hiVarA)) {
                hiVarA = null;
            }
            if (hiVarA == null || !hiVarA.a(giVar.f111215c)) {
                break;
            }
        }
        gi giVar2 = (gi) next;
        zw1Var.f118864c = giVar2 != null ? giVar2.f111213a : null;
        return giVar2 == null;
    }

    public static final boolean d(zw1 zw1Var, yz1 yz1Var) {
        Object next;
        List list = zw1Var.f118862a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((gi) obj).f111218f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            hi hiVarA = yz1Var.a((gi) next);
            if (hiVarA == null || !hiVarA.e()) {
                break;
            }
        }
        gi giVar = (gi) next;
        zw1Var.f118864c = giVar != null ? giVar.f111213a : null;
        return giVar == null;
    }

    public final fn2 e() {
        return new fn2(this.f118864c, a(new x02() { // from class: yads.a81
            @Override // yads.x02
            public final boolean a(yz1 yz1Var) {
                return zw1.e(this.f108597a, yz1Var);
            }
        }));
    }

    public static final boolean e(zw1 zw1Var, yz1 yz1Var) {
        Object next;
        List list = zw1Var.f118862a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((gi) obj).f111218f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            hi hiVarA = yz1Var.a((gi) next);
            if (hiVarA == null || !hiVarA.b()) {
                break;
            }
        }
        gi giVar = (gi) next;
        zw1Var.f118864c = giVar != null ? giVar.f111213a : null;
        return giVar == null;
    }

    public final boolean b() {
        return !a(new x02() { // from class: yads.z71
            @Override // yads.x02
            public final boolean a(yz1 yz1Var) {
                return zw1.b(this.f118590a, yz1Var);
            }
        });
    }

    public final boolean a() {
        return !a(new x02() { // from class: yads.x71
            @Override // yads.x02
            public final boolean a(yz1 yz1Var) {
                return zw1.a(this.f117733a, yz1Var);
            }
        });
    }

    public final boolean a(x02 x02Var) {
        yz1 yz1Var = this.f118865d;
        if (yz1Var == null) {
            return false;
        }
        this.f118863b.getClass();
        return x02Var.a(yz1Var);
    }

    public final boolean d() {
        return !a(new x02() { // from class: yads.w71
            @Override // yads.x02
            public final boolean a(yz1 yz1Var) {
                return zw1.d(this.f117336a, yz1Var);
            }
        });
    }

    public final boolean c() {
        return !a(new x02() { // from class: yads.y71
            @Override // yads.x02
            public final boolean a(yz1 yz1Var) {
                return zw1.c(this.f118109a, yz1Var);
            }
        });
    }

    public final h93 a(boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (b() && !z10) {
            arrayList.add(g93.f111118d);
        }
        List list = this.f118862a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (((gi) it.next()).f111218f && (i10 = i10 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            if (i10 >= 2 && a() && !z10) {
                arrayList.add(g93.f111119e);
            }
        }
        if (c()) {
            arrayList.add(g93.f111117c);
        }
        if (d() && !z10) {
            return new e93(d93.f109848f, this.f118864c, null);
        }
        return new f93(arrayList);
    }
}
