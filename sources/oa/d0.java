package oa;

import oa.m0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f96503a;

    public d0(m0 m0Var) {
        this.f96503a = m0Var;
    }

    @Override // oa.m0
    public long getDurationUs() {
        return this.f96503a.getDurationUs();
    }

    @Override // oa.m0
    public m0.a getSeekPoints(long j10) {
        return this.f96503a.getSeekPoints(j10);
    }

    @Override // oa.m0
    public boolean isSeekable() {
        return this.f96503a.isSeekable();
    }
}
