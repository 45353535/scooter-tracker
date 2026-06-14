package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class gt implements d23 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f111335b;

    public gt(List list) {
        this.f111335b = list;
    }

    @Override // yads.d23
    public final int a() {
        return 1;
    }

    @Override // yads.d23
    public final List b(long j10) {
        return j10 >= 0 ? this.f111335b : Collections.EMPTY_LIST;
    }

    @Override // yads.d23
    public final int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // yads.d23
    public final long a(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
