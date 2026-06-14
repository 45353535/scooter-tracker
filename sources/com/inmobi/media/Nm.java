package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class Nm extends Vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableSharedFlow f37464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37465b;

    public Nm(MutableSharedFlow mediaEventFlow, long j10) {
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.f37464a = mediaEventFlow;
        this.f37465b = j10;
    }
}
