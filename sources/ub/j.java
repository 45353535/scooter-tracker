package ub;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lb.k;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class j implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f105416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f105417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f105418d;

    public j(List list) {
        this.f105416b = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f105417c = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = (d) list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f105417c;
            jArr[i11] = dVar.f105387b;
            jArr[i11 + 1] = dVar.f105388c;
        }
        long[] jArr2 = this.f105417c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f105418d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // lb.k
    public List getCues(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f105416b.size(); i10++) {
            long[] jArr = this.f105417c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = (d) this.f105416b.get(i10);
                p9.a aVar = dVar.f105386a;
                if (aVar.f98081e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: ub.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((d) obj).f105387b, ((d) obj2).f105387b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f105386a.a().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // lb.k
    public long getEventTime(int i10) {
        q9.a.a(i10 >= 0);
        q9.a.a(i10 < this.f105418d.length);
        return this.f105418d[i10];
    }

    @Override // lb.k
    public int getEventTimeCount() {
        return this.f105418d.length;
    }

    @Override // lb.k
    public int getNextEventTimeIndex(long j10) {
        int iD = o0.d(this.f105418d, j10, false, false);
        if (iD < this.f105418d.length) {
            return iD;
        }
        return -1;
    }
}
