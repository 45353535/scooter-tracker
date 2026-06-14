package lb;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Ordering f94096d = Ordering.natural().onResultOf(new Function() { // from class: lb.f
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return Long.valueOf(g.c(((e) obj).f94093b));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableList f94097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f94098c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.g.<init>(java.util.List):void");
    }

    private static long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lb.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ImmutableList getCues(long j10) {
        int iH = o0.h(this.f94098c, j10, true, false);
        return iH == -1 ? ImmutableList.of() : (ImmutableList) this.f94097b.get(iH);
    }

    @Override // lb.k
    public long getEventTime(int i10) {
        q9.a.a(i10 < this.f94097b.size());
        return this.f94098c[i10];
    }

    @Override // lb.k
    public int getEventTimeCount() {
        return this.f94097b.size();
    }

    @Override // lb.k
    public int getNextEventTimeIndex(long j10) {
        int iD = o0.d(this.f94098c, j10, false, false);
        if (iD < this.f94097b.size()) {
            return iD;
        }
        return -1;
    }
}
