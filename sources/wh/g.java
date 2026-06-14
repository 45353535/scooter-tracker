package wh;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import vh.l0;
import vh.o;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f108022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f108023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f108024d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l0 delegate, long j10, boolean z10) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f108022b = j10;
        this.f108023c = z10;
    }

    private final void c(vh.e eVar, long j10) throws EOFException {
        vh.e eVar2 = new vh.e();
        eVar2.i(eVar);
        eVar.H(eVar2, j10);
        eVar2.n();
    }

    @Override // vh.o, vh.l0
    public long read(vh.e sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j11 = this.f108024d;
        long j12 = this.f108022b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f108023c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long j14 = super.read(sink, j10);
        if (j14 != -1) {
            this.f108024d += j14;
        }
        long j15 = this.f108024d;
        long j16 = this.f108022b;
        if ((j15 >= j16 || j14 != -1) && j15 <= j16) {
            return j14;
        }
        if (j14 > 0 && j15 > j16) {
            c(sink, sink.e0() - (this.f108024d - this.f108022b));
        }
        throw new IOException("expected " + this.f108022b + " bytes but got " + this.f108024d);
    }
}
