package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f21935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f21936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f21937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f21938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f21939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f21940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f21941o;

    public d(int i10, String str, long j10, long j11, boolean z10, int i11, int i12, int i13, long j12, boolean z11, boolean z12, c cVar, List list, List list2) {
        super(str);
        this.f21928b = i10;
        this.f21930d = j11;
        this.f21931e = z10;
        this.f21932f = i11;
        this.f21933g = i12;
        this.f21934h = i13;
        this.f21935i = j12;
        this.f21936j = z11;
        this.f21937k = z12;
        this.f21938l = cVar;
        this.f21939m = DesugarCollections.unmodifiableList(list);
        if (list.isEmpty()) {
            this.f21941o = 0L;
        } else {
            c cVar2 = (c) list.get(list.size() - 1);
            this.f21941o = cVar2.f21922d + cVar2.f21920b;
        }
        if (j10 == -9223372036854775807L) {
            j10 = -9223372036854775807L;
        } else if (j10 < 0) {
            j10 += this.f21941o;
        }
        this.f21929c = j10;
        this.f21940n = DesugarCollections.unmodifiableList(list2);
    }
}
