package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f21925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f21926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f21927i;

    public c(String str, long j10, int i10, long j11, boolean z10, String str2, String str3, long j12, long j13) {
        this.f21919a = str;
        this.f21920b = j10;
        this.f21921c = i10;
        this.f21922d = j11;
        this.f21923e = z10;
        this.f21924f = str2;
        this.f21925g = str3;
        this.f21926h = j12;
        this.f21927i = j13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        if (this.f21922d > l10.longValue()) {
            return 1;
        }
        return this.f21922d < l10.longValue() ? -1 : 0;
    }
}
