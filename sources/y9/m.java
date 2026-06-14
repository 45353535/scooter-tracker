package y9;

/* JADX INFO: loaded from: classes12.dex */
final class m implements x9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f108491a;

    public m(i iVar) {
        this.f108491a = iVar;
    }

    @Override // x9.f
    public long getAvailableSegmentCount(long j10, long j11) {
        return 1L;
    }

    @Override // x9.f
    public long getFirstAvailableSegmentNum(long j10, long j11) {
        return 0L;
    }

    @Override // x9.f
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // x9.f
    public long getNextSegmentAvailableTimeUs(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // x9.f
    public long getSegmentCount(long j10) {
        return 1L;
    }

    @Override // x9.f
    public long getSegmentNum(long j10, long j11) {
        return 0L;
    }

    @Override // x9.f
    public i getSegmentUrl(long j10) {
        return this.f108491a;
    }

    @Override // x9.f
    public long getTimeUs(long j10) {
        return 0L;
    }

    @Override // x9.f
    public boolean isExplicit() {
        return true;
    }

    @Override // x9.f
    public long getDurationUs(long j10, long j11) {
        return j11;
    }
}
