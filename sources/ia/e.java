package ia;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
final class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Ordering f73973b = Ordering.natural().onResultOf(new Function() { // from class: ia.c
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return Long.valueOf(((lb.e) obj).f94093b);
        }
    }).compound(Ordering.natural().reverse().onResultOf(new Function() { // from class: ia.d
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return Long.valueOf(((lb.e) obj).f94094c);
        }
    }));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f73974a = new ArrayList();

    @Override // ia.a
    public boolean a(lb.e eVar, long j10) {
        q9.a.a(eVar.f94093b != -9223372036854775807L);
        q9.a.a(eVar.f94094c != -9223372036854775807L);
        boolean z10 = eVar.f94093b <= j10 && j10 < eVar.f94095d;
        for (int size = this.f73974a.size() - 1; size >= 0; size--) {
            if (eVar.f94093b >= ((lb.e) this.f73974a.get(size)).f94093b) {
                this.f73974a.add(size + 1, eVar);
                return z10;
            }
        }
        this.f73974a.add(0, eVar);
        return z10;
    }

    @Override // ia.a
    public void clear() {
        this.f73974a.clear();
    }

    @Override // ia.a
    public void discardCuesBeforeTimeUs(long j10) {
        int i10 = 0;
        while (i10 < this.f73974a.size()) {
            long j11 = ((lb.e) this.f73974a.get(i10)).f94093b;
            if (j10 > j11 && j10 > ((lb.e) this.f73974a.get(i10)).f94095d) {
                this.f73974a.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ia.a
    public ImmutableList getCuesAtTimeUs(long j10) {
        if (!this.f73974a.isEmpty()) {
            if (j10 >= ((lb.e) this.f73974a.get(0)).f94093b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f73974a.size(); i10++) {
                    lb.e eVar = (lb.e) this.f73974a.get(i10);
                    if (j10 >= eVar.f94093b && j10 < eVar.f94095d) {
                        arrayList.add(eVar);
                    }
                    if (j10 < eVar.f94093b) {
                        break;
                    }
                }
                ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(f73973b, arrayList);
                ImmutableList.Builder builder = ImmutableList.builder();
                for (int i11 = 0; i11 < immutableListSortedCopyOf.size(); i11++) {
                    builder.addAll((Iterable) ((lb.e) immutableListSortedCopyOf.get(i11)).f94092a);
                }
                return builder.build();
            }
        }
        return ImmutableList.of();
    }

    @Override // ia.a
    public long getNextCueChangeTimeUs(long j10) {
        int i10 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i10 >= this.f73974a.size()) {
                break;
            }
            long j11 = ((lb.e) this.f73974a.get(i10)).f94093b;
            long j12 = ((lb.e) this.f73974a.get(i10)).f94095d;
            if (j10 < j11) {
                jMin = jMin == -9223372036854775807L ? j11 : Math.min(jMin, j11);
            } else {
                if (j10 < j12) {
                    jMin = jMin == -9223372036854775807L ? j12 : Math.min(jMin, j12);
                }
                i10++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // ia.a
    public long getPreviousCueChangeTimeUs(long j10) {
        if (this.f73974a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < ((lb.e) this.f73974a.get(0)).f94093b) {
            return -9223372036854775807L;
        }
        long jMax = ((lb.e) this.f73974a.get(0)).f94093b;
        for (int i10 = 0; i10 < this.f73974a.size(); i10++) {
            long j11 = ((lb.e) this.f73974a.get(i10)).f94093b;
            long j12 = ((lb.e) this.f73974a.get(i10)).f94095d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }
}
