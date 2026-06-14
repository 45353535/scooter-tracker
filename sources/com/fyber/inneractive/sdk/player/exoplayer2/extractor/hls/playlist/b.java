package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f21915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f21916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f21917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f21918f;

    public b(String str, List list, List list2, List list3, o oVar, List list4) {
        super(str);
        this.f21914b = DesugarCollections.unmodifiableList(list);
        this.f21915c = DesugarCollections.unmodifiableList(list2);
        this.f21916d = DesugarCollections.unmodifiableList(list3);
        this.f21917e = oVar;
        this.f21918f = list4 != null ? DesugarCollections.unmodifiableList(list4) : null;
    }
}
