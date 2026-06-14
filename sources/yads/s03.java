package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s03 implements d23 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f115664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f115665c;

    public s03(ArrayList arrayList, ArrayList arrayList2) {
        this.f115664b = arrayList;
        this.f115665c = arrayList2;
    }

    @Override // yads.d23
    public final long a(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 < this.f115665c.size()) {
            return ((Long) this.f115665c.get(i10)).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.d23
    public final List b(long j10) {
        int iA = w83.a(this.f115665c, Long.valueOf(j10), false);
        return iA == -1 ? Collections.EMPTY_LIST : (List) this.f115664b.get(iA);
    }

    @Override // yads.d23
    public final int a() {
        return this.f115665c.size();
    }

    @Override // yads.d23
    public final int a(long j10) {
        int i10;
        List list = this.f115665c;
        Long lValueOf = Long.valueOf(j10);
        int i11 = w83.f117341a;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i10 = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) list.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i10 = iBinarySearch;
        }
        if (i10 < this.f115665c.size()) {
            return i10;
        }
        return -1;
    }
}
