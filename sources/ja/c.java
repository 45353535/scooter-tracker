package ja;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import n9.f0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final f0 f85578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f85579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f85580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f85581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.bidmachine.media3.common.a[] f85582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f85583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f85584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f85585h;

    public c(f0 f0Var, int... iArr) {
        this(f0Var, iArr, 0);
    }

    public static /* synthetic */ int d(io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a aVar2) {
        return aVar2.f80556j - aVar.f80556j;
    }

    @Override // ja.u
    public final int a(io.bidmachine.media3.common.a aVar) {
        for (int i10 = 0; i10 < this.f85579b; i10++) {
            if (this.f85582e[i10] == aVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // ja.r
    public /* synthetic */ boolean c(long j10, ha.e eVar, List list) {
        return q.c(this, j10, eVar, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f85578a.equals(cVar.f85578a) && Arrays.equals(this.f85580c, cVar.f85580c)) {
                return true;
            }
        }
        return false;
    }

    @Override // ja.r
    public int evaluateQueueSize(long j10, List list) {
        return list.size();
    }

    @Override // ja.r
    public boolean excludeTrack(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsTrackExcluded = isTrackExcluded(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f85579b && !zIsTrackExcluded) {
            zIsTrackExcluded = (i11 == i10 || isTrackExcluded(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zIsTrackExcluded) {
            return false;
        }
        long[] jArr = this.f85583f;
        jArr[i10] = Math.max(jArr[i10], o0.c(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // ja.u
    public final io.bidmachine.media3.common.a getFormat(int i10) {
        return this.f85582e[i10];
    }

    @Override // ja.u
    public final int getIndexInTrackGroup(int i10) {
        return this.f85580c[i10];
    }

    @Override // ja.r
    public final io.bidmachine.media3.common.a getSelectedFormat() {
        return this.f85582e[getSelectedIndex()];
    }

    @Override // ja.r
    public final int getSelectedIndexInTrackGroup() {
        return this.f85580c[getSelectedIndex()];
    }

    @Override // ja.u
    public final f0 getTrackGroup() {
        return this.f85578a;
    }

    public int hashCode() {
        if (this.f85584g == 0) {
            this.f85584g = (System.identityHashCode(this.f85578a) * 31) + Arrays.hashCode(this.f85580c);
        }
        return this.f85584g;
    }

    @Override // ja.u
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f85579b; i11++) {
            if (this.f85580c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // ja.r
    public boolean isTrackExcluded(int i10, long j10) {
        return this.f85583f[i10] > j10;
    }

    @Override // ja.u
    public final int length() {
        return this.f85580c.length;
    }

    @Override // ja.r
    public /* synthetic */ void onDiscontinuity() {
        q.a(this);
    }

    @Override // ja.r
    public void onPlayWhenReadyChanged(boolean z10) {
        this.f85585h = z10;
    }

    @Override // ja.r
    public /* synthetic */ void onRebuffer() {
        q.b(this);
    }

    public c(f0 f0Var, int[] iArr, int i10) {
        q9.a.g(iArr.length > 0);
        this.f85581d = i10;
        this.f85578a = (f0) q9.a.e(f0Var);
        int length = iArr.length;
        this.f85579b = length;
        this.f85582e = new io.bidmachine.media3.common.a[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f85582e[i11] = f0Var.a(iArr[i11]);
        }
        Arrays.sort(this.f85582e, new Comparator() { // from class: ja.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.d((io.bidmachine.media3.common.a) obj, (io.bidmachine.media3.common.a) obj2);
            }
        });
        this.f85580c = new int[this.f85579b];
        int i12 = 0;
        while (true) {
            int i13 = this.f85579b;
            if (i12 >= i13) {
                this.f85583f = new long[i13];
                this.f85585h = false;
                return;
            } else {
                this.f85580c[i12] = f0Var.b(this.f85582e[i12]);
                i12++;
            }
        }
    }

    @Override // ja.r
    public void disable() {
    }

    @Override // ja.r
    public void enable() {
    }

    @Override // ja.r
    public void onPlaybackSpeed(float f10) {
    }
}
