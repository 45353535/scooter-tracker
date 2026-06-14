package mb;

import java.util.Collections;
import java.util.List;
import lb.k;

/* JADX INFO: loaded from: classes12.dex */
final class f implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f94838b;

    public f(List list) {
        this.f94838b = list;
    }

    @Override // lb.k
    public List getCues(long j10) {
        return j10 >= 0 ? this.f94838b : Collections.EMPTY_LIST;
    }

    @Override // lb.k
    public long getEventTime(int i10) {
        q9.a.a(i10 == 0);
        return 0L;
    }

    @Override // lb.k
    public int getEventTimeCount() {
        return 1;
    }

    @Override // lb.k
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
