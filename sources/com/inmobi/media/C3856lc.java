package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: com.inmobi.media.lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3856lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3903n9 f38970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC3796j2 f38971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaView f38972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4149x6 f38973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableSharedFlow f38974e;

    public C3856lc(Context context, CoroutineScope coroutineScope, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f38970a = c3903n9;
        MutableSharedFlow mutableSharedFlowB = hg.c0.b(0, 0, null, 7, null);
        this.f38972c = new MediaView(context);
        this.f38973d = new C4149x6(context, coroutineScope, mutableSharedFlowB, c3903n9);
        this.f38974e = mutableSharedFlowB;
    }

    public final Object a(AbstractC4174y6 abstractC4174y6, kotlin.coroutines.jvm.internal.d dVar) {
        C3903n9 c3903n9 = this.f38970a;
        if (c3903n9 != null) {
            c3903n9.a("MediaViewManager", "load called - experienceModel: " + abstractC4174y6);
        }
        return this.f38971b != null ? this.f38972c : eg.g.g(eg.o0.b(), new C3831kc(this, abstractC4174y6, null), dVar);
    }
}
