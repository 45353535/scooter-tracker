package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4072u4 extends hh.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4086ui f39634a;

    public C4072u4(AbstractC4086ui abstractC4086ui) {
        this.f39634a = abstractC4086ui;
    }

    @Override // hh.a0
    public final hh.w contentType() {
        return hh.w.f(this.f39634a.a());
    }

    @Override // hh.a0
    public final void writeTo(vh.f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f39634a.a(sink);
    }
}
