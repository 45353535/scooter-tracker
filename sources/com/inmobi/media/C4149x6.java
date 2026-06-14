package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: com.inmobi.media.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4149x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f39912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f39913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3903n9 f39914d;

    public C4149x6(Context context, CoroutineScope coroutineScope, MutableSharedFlow mediaEventFlow, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.f39911a = context;
        this.f39912b = coroutineScope;
        this.f39913c = mediaEventFlow;
        this.f39914d = c3903n9;
    }
}
