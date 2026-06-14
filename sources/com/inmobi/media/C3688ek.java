package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3688ek extends AbstractC3772i2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3688ek(String eventType, String str, String eventSource) {
        super(eventType, str);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventSource, "eventSource");
        this.f38529e = eventSource;
    }

    public final String toString() {
        return this.f38734a + " ";
    }
}
