package wa;

import oa.c0;
import oa.s;

/* JADX INFO: loaded from: classes12.dex */
final class d extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f107828b;

    public d(s sVar, long j10) {
        super(sVar);
        q9.a.a(sVar.getPosition() >= j10);
        this.f107828b = j10;
    }

    @Override // oa.c0, oa.s
    public long getLength() {
        return super.getLength() - this.f107828b;
    }

    @Override // oa.c0, oa.s
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f107828b;
    }

    @Override // oa.c0, oa.s
    public long getPosition() {
        return super.getPosition() - this.f107828b;
    }
}
