package yads;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class no {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f113988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f113989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f113990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f113991d;

    public no() {
        this(new Random());
    }

    public static int a(mo moVar, mo moVar2) {
        int iCompare = Integer.compare(moVar.f113564c, moVar2.f113564c);
        return iCompare != 0 ? iCompare : moVar.f113563b.compareTo(moVar2.f113563b);
    }

    public final mo b(y31 y31Var) {
        mo moVar;
        ArrayList arrayListA = a(y31Var);
        if (arrayListA.size() < 2) {
            Iterator it = arrayListA.iterator();
            return (mo) (it.hasNext() ? it.next() : null);
        }
        Collections.sort(arrayListA, new Comparator() { // from class: yads.ry
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return no.a((mo) obj, (mo) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((mo) arrayListA.get(0)).f113564c;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayListA.size()) {
                break;
            }
            mo moVar2 = (mo) arrayListA.get(i12);
            if (i11 == moVar2.f113564c) {
                arrayList.add(new Pair(moVar2.f113563b, Integer.valueOf(moVar2.f113565d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (mo) arrayListA.get(0);
            }
        }
        mo moVar3 = (mo) this.f113990c.get(arrayList);
        if (moVar3 != null) {
            return moVar3;
        }
        List listSubList = arrayListA.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < listSubList.size(); i14++) {
            i13 += ((mo) listSubList.get(i14)).f113565d;
        }
        int iNextInt = this.f113991d.nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= listSubList.size()) {
                moVar = (mo) gc1.a(listSubList);
                break;
            }
            moVar = (mo) listSubList.get(i10);
            i15 += moVar.f113565d;
            if (iNextInt < i15) {
                break;
            }
            i10++;
        }
        this.f113990c.put(arrayList, moVar);
        return moVar;
    }

    public no(Random random) {
        this.f113990c = new HashMap();
        this.f113991d = random;
        this.f113988a = new HashMap();
        this.f113989b = new HashMap();
    }

    public static void a(long j10, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    public final ArrayList a(y31 y31Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a(jElapsedRealtime, this.f113988a);
        a(jElapsedRealtime, this.f113989b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < y31Var.size(); i10++) {
            mo moVar = (mo) y31Var.get(i10);
            if (!this.f113988a.containsKey(moVar.f113563b) && !this.f113989b.containsKey(Integer.valueOf(moVar.f113564c))) {
                arrayList.add(moVar);
            }
        }
        return arrayList;
    }
}
