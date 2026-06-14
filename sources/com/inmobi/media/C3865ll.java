package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3865ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f38994b;

    public C3865ll(String clickThroughUrl, ArrayList vastClickTrackers) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(vastClickTrackers, "vastClickTrackers");
        this.f38993a = clickThroughUrl;
        this.f38994b = vastClickTrackers;
    }
}
