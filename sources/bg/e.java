package bg;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends LongIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f6416e;

    public e(long j10, long j11, long j12) {
        this.f6413b = j12;
        this.f6414c = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f6415d = z10;
        this.f6416e = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6415d;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        long j10 = this.f6416e;
        if (j10 != this.f6414c) {
            this.f6416e = this.f6413b + j10;
            return j10;
        }
        if (!this.f6415d) {
            throw new NoSuchElementException();
        }
        this.f6415d = false;
        return j10;
    }
}
