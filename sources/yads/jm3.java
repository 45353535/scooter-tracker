package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class jm3 implements om2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final om2 f112389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final km3 f112390b;

    public jm3(mm3 mm3Var, km3 km3Var) {
        this.f112389a = mm3Var;
        this.f112390b = km3Var;
    }

    @Override // yads.om2
    public final void a(pb3 pb3Var) {
        this.f112389a.a(pb3Var);
    }

    @Override // yads.om2
    public final void a(Object obj) {
        char c10 = 1;
        List listTake = (List) obj;
        km3 km3Var = this.f112390b;
        om3 om3Var = km3Var.f112779a.f115092a.f111952m;
        if (om3Var != null) {
            if (!om3Var.f114375b) {
                km3Var.f112780b.getClass();
                listTake = de3.a(listTake).f109380a;
            }
            if (!om3Var.f114374a) {
                listTake = CollectionsKt.take(listTake, 1);
            }
            fm3 fm3Var = km3Var.f112781c;
            fm3Var.getClass();
            int i10 = 10;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
            Iterator it = listTake.iterator();
            while (it.hasNext()) {
                ib3 ib3Var = (ib3) it.next();
                dm3 dm3Var = fm3Var.f110796b;
                List list = dm3Var.f109981a.f111941b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    CollectionsKt.addAll(arrayList2, ((n10) it2.next()).f113681d);
                }
                List<n10> list2 = ib3Var.f111941b;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, i10));
                for (n10 n10Var : list2) {
                    dm3Var.f109982b.getClass();
                    List list3 = n10Var.f113680c;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, i10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((u01) it3.next()).f116429a);
                    }
                    Set mutableSet = CollectionsKt.toMutableSet(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        CollectionsKt.addAll(arrayList5, ((n10) it4.next()).f113680c);
                        c10 = c10;
                    }
                    char c11 = c10;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : arrayList5) {
                        if (mutableSet.add(((u01) obj2).f116429a)) {
                            arrayList6.add(obj2);
                        }
                    }
                    List list4 = n10Var.f113681d;
                    List listPlus = CollectionsKt.plus((Collection) n10Var.f113678a, (Iterable) n10Var.f113679b);
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it5 = it;
                    ArrayList arrayList9 = new ArrayList();
                    String str = n10Var.f113685h;
                    if (listPlus == null) {
                        listPlus = CollectionsKt.emptyList();
                    }
                    arrayList7.addAll(listPlus);
                    List listEmptyList = n10Var.f113680c;
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    arrayList8.addAll(listEmptyList);
                    arrayList9.addAll(arrayList2);
                    String str2 = n10Var.f113683f;
                    zx2 zx2Var = n10Var.f113684g;
                    int i11 = n10Var.f113686i;
                    arrayList8.addAll(arrayList6);
                    arrayList9.addAll(list4 == null ? CollectionsKt.emptyList() : list4);
                    String str3 = n10Var.f113687j;
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj3 : arrayList7) {
                        String str4 = str3;
                        ArrayList arrayList11 = arrayList9;
                        if (obj3 instanceof wj1) {
                            arrayList10.add(obj3);
                        }
                        arrayList9 = arrayList11;
                        str3 = str4;
                    }
                    String str5 = str3;
                    ArrayList arrayList12 = arrayList9;
                    ArrayList arrayList13 = new ArrayList();
                    Iterator it6 = arrayList7.iterator();
                    while (it6.hasNext()) {
                        Object next = it6.next();
                        Iterator it7 = it6;
                        if (next instanceof cb1) {
                            arrayList13.add(next);
                        }
                        it6 = it7;
                    }
                    arrayList3.add(new n10(arrayList10, arrayList13, arrayList8, arrayList12, null, str2, zx2Var, str, i11, str5));
                    it = it5;
                    c10 = c11;
                    i10 = 10;
                }
                char c12 = c10;
                Iterator it8 = it;
                em3 em3Var = fm3Var.f110797c;
                ib3 ib3Var2 = fm3Var.f110795a;
                em3Var.getClass();
                rb3 rb3Var = ib3Var.f111943d;
                rb3 rb3Var2 = ib3Var2.f111943d;
                rb3 rb3Var3 = new rb3(CollectionsKt.plus((Collection) rb3Var.f115396a, (Iterable) rb3Var2.f115396a), CollectionsKt.plus((Collection) rb3Var.f115397b, (Iterable) rb3Var2.f115397b));
                gm3 gm3Var = fm3Var.f110798d;
                ib3 ib3Var3 = fm3Var.f110795a;
                gm3Var.getClass();
                ib3[] ib3VarArr = new ib3[2];
                ib3VarArr[0] = ib3Var;
                ib3VarArr[c12] = ib3Var3;
                List listListOf = CollectionsKt.listOf((Object[]) ib3VarArr);
                ArrayList arrayList14 = new ArrayList();
                Iterator it9 = listListOf.iterator();
                while (it9.hasNext()) {
                    ui3 ui3Var = ((ib3) it9.next()).f111949j;
                    List listEmptyList2 = ui3Var != null ? ui3Var.f116669a : null;
                    if (listEmptyList2 == null) {
                        listEmptyList2 = CollectionsKt.emptyList();
                    }
                    CollectionsKt.addAll(arrayList14, listEmptyList2);
                }
                ui3 ui3Var2 = new ui3(arrayList14);
                Map map = ib3Var.f111942c;
                ib3 ib3Var4 = fm3Var.f110795a;
                Map map2 = ib3Var4.f111942c;
                List listPlus2 = CollectionsKt.plus((Collection) ib3Var.f111953n, (Iterable) ib3Var4.f111953n);
                hb3 hb3Var = new hb3(ib3Var.f111940a, new yd3(fm3Var.f110799e));
                hb3Var.f111547k = ib3Var.f111951l;
                hb3Var.f111548l.addAll(arrayList3);
                hb3 hb3VarA = hb3Var.a(map);
                hb3VarA.f111540d = ib3Var.f111944e;
                hb3VarA.f111541e = ib3Var.f111945f;
                hb3VarA.f111542f = ib3Var.f111946g;
                hb3VarA.f111543g = ib3Var.f111947h;
                hb3VarA.f111544h = ib3Var.f111948i;
                hb3VarA.f111551o = rb3Var3;
                hb3VarA.f111545i = ui3Var2;
                hb3VarA.f111539c = ib3Var.f111952m;
                hb3 hb3VarA2 = hb3VarA.a(map2);
                ArrayList arrayList15 = hb3VarA2.f111549m;
                if (listPlus2 == null) {
                    listPlus2 = CollectionsKt.emptyList();
                }
                arrayList15.addAll(listPlus2);
                arrayList.add(hb3VarA2.a());
                it = it8;
                c10 = c12;
                i10 = 10;
            }
            listTake = arrayList;
        }
        this.f112389a.a(listTake);
    }
}
