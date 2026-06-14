package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f22311a;

    public a(b bVar) {
        this.f22311a = bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        b bVar = this.f22311a;
        return (bVar.f22317f * 1000000) / ((long) bVar.f22315d.f22358i);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        if (j10 == 0) {
            return this.f22311a.f22313b;
        }
        b bVar = this.f22311a;
        long j11 = (((long) bVar.f22315d.f22358i) * j10) / 1000000;
        long j12 = bVar.f22313b;
        long j13 = bVar.f22314c;
        long j14 = ((((j13 - j12) * j11) / bVar.f22317f) - 30000) + j12;
        if (j14 >= j12) {
            j12 = j14;
        }
        return j12 >= j13 ? j13 - 1 : j12;
    }
}
