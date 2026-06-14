package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l73 implements d23 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l73 f112997c = new l73();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f112998b;

    public l73() {
        this.f112998b = Collections.EMPTY_LIST;
    }

    @Override // yads.d23
    public final int a() {
        return 1;
    }

    @Override // yads.d23
    public final List b(long j10) {
        return j10 >= 0 ? this.f112998b : Collections.EMPTY_LIST;
    }

    @Override // yads.d23
    public final int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public l73(a20 a20Var) {
        this.f112998b = Collections.singletonList(a20Var);
    }

    @Override // yads.d23
    public final long a(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
