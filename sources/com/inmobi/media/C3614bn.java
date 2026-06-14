package com.inmobi.media;

import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: com.inmobi.media.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3614bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f38294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f38295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fg f38296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableSharedFlow f38297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressBar f38298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Job f38299f;

    public C3614bn(CoroutineScope coroutineScope, RelativeLayout experienceLayout, Fg progressConfig, MutableSharedFlow mediaPlayerFlow) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(experienceLayout, "experienceLayout");
        Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        Intrinsics.checkNotNullParameter(mediaPlayerFlow, "mediaPlayerFlow");
        this.f38294a = coroutineScope;
        this.f38295b = experienceLayout;
        this.f38296c = progressConfig;
        this.f38297d = mediaPlayerFlow;
    }
}
