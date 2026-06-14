package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3890ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f39050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f39051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f39052c;

    public C3890ml(ArrayList resources, ArrayList inlineTrackers, ArrayList wrapperTrackers) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(inlineTrackers, "inlineTrackers");
        Intrinsics.checkNotNullParameter(wrapperTrackers, "wrapperTrackers");
        this.f39050a = resources;
        this.f39051b = inlineTrackers;
        this.f39052c = wrapperTrackers;
    }
}
