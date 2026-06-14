package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class cy implements ev2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ev2[] f109647b;

    public cy(ev2[] ev2VarArr) {
        this.f109647b = ev2VarArr;
    }

    @Override // yads.ev2
    public final boolean continueLoading(long j10) {
        boolean zContinueLoading;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z10;
            }
            zContinueLoading = false;
            for (ev2 ev2Var : this.f109647b) {
                long nextLoadPositionUs2 = ev2Var.getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j10;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zContinueLoading |= ev2Var.continueLoading(j10);
                }
            }
            z10 |= zContinueLoading;
        } while (zContinueLoading);
        return z10;
    }

    @Override // yads.ev2
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (ev2 ev2Var : this.f109647b) {
            long bufferedPositionUs = ev2Var.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // yads.ev2
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (ev2 ev2Var : this.f109647b) {
            long nextLoadPositionUs = ev2Var.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // yads.ev2
    public final boolean isLoading() {
        for (ev2 ev2Var : this.f109647b) {
            if (ev2Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.ev2
    public final void reevaluateBuffer(long j10) {
        for (ev2 ev2Var : this.f109647b) {
            ev2Var.reevaluateBuffer(j10);
        }
    }
}
