package yads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yt1 implements d23 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f118379b;

    public yt1(ArrayList arrayList) {
        this.f118379b = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // yads.d23
    public final int a() {
        return 1;
    }

    @Override // yads.d23
    public final List b(long j10) {
        return j10 >= 0 ? this.f118379b : Collections.EMPTY_LIST;
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
