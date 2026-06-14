package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4091un {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4198z5 f39704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4198z5 f39705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Sg f39706e;

    public C4091un(boolean z10, boolean z11, C4198z5 iconMinDimension, C4198z5 mediaMinDimension, Sg nativeViewData) {
        Intrinsics.checkNotNullParameter(iconMinDimension, "iconMinDimension");
        Intrinsics.checkNotNullParameter(mediaMinDimension, "mediaMinDimension");
        Intrinsics.checkNotNullParameter(nativeViewData, "nativeViewData");
        this.f39702a = z10;
        this.f39703b = z11;
        this.f39704c = iconMinDimension;
        this.f39705d = mediaMinDimension;
        this.f39706e = nativeViewData;
    }
}
