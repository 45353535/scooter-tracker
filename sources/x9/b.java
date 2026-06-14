package x9;

import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f108156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f108157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f108158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Random f108159d;

    public b() {
        this(new Random());
    }

    private static void b(Object obj, long j10, Map map) {
        if (map.containsKey(obj)) {
            j10 = Math.max(j10, ((Long) o0.i((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j10));
    }

    private List c(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h(jElapsedRealtime, this.f108156a);
        h(jElapsedRealtime, this.f108157b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            y9.b bVar = (y9.b) list.get(i10);
            if (!this.f108156a.containsKey(bVar.f108402b) && !this.f108157b.containsKey(Integer.valueOf(bVar.f108403c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(y9.b bVar, y9.b bVar2) {
        int iCompare = Integer.compare(bVar.f108403c, bVar2.f108403c);
        return iCompare != 0 ? iCompare : bVar.f108402b.compareTo(bVar2.f108402b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(((y9.b) list.get(i10)).f108403c));
        }
        return hashSet.size();
    }

    private static void h(long j10, Map map) {
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

    private y9.b k(List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += ((y9.b) list.get(i11)).f108404d;
        }
        int iNextInt = this.f108159d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            y9.b bVar = (y9.b) list.get(i13);
            i12 += bVar.f108404d;
            if (iNextInt < i12) {
                return bVar;
            }
        }
        return (y9.b) Iterables.getLast(list);
    }

    public void e(y9.b bVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f108402b, jElapsedRealtime, this.f108156a);
        int i10 = bVar.f108403c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), jElapsedRealtime, this.f108157b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        List listC = c(list);
        for (int i10 = 0; i10 < listC.size(); i10++) {
            hashSet.add(Integer.valueOf(((y9.b) listC.get(i10)).f108403c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f108156a.clear();
        this.f108157b.clear();
        this.f108158c.clear();
    }

    public y9.b j(List list) {
        List listC = c(list);
        if (listC.size() < 2) {
            return (y9.b) Iterables.getFirst(listC, null);
        }
        Collections.sort(listC, new Comparator() { // from class: x9.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.d((y9.b) obj, (y9.b) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = ((y9.b) listC.get(0)).f108403c;
        int i11 = 0;
        while (true) {
            if (i11 >= listC.size()) {
                break;
            }
            y9.b bVar = (y9.b) listC.get(i11);
            if (i10 == bVar.f108403c) {
                arrayList.add(new Pair(bVar.f108402b, Integer.valueOf(bVar.f108404d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (y9.b) listC.get(0);
            }
        }
        y9.b bVar2 = (y9.b) this.f108158c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        y9.b bVarK = k(listC.subList(0, arrayList.size()));
        this.f108158c.put(arrayList, bVarK);
        return bVarK;
    }

    b(Random random) {
        this.f108158c = new HashMap();
        this.f108159d = random;
        this.f108156a = new HashMap();
        this.f108157b = new HashMap();
    }
}
