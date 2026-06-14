package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3788ij extends AbstractC3603bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f38770b;

    public C3788ij(String str, ArrayList trackers) {
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.f38769a = str;
        this.f38770b = trackers;
    }
}
