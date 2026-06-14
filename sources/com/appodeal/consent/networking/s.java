package com.appodeal.consent.networking;

import com.appodeal.consent.CmpType;
import com.appodeal.consent.ConsentStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentStatus f15536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CmpType f15537b;

    public s(ConsentStatus status, CmpType type) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f15536a = status;
        this.f15537b = type;
    }

    public final ConsentStatus a() {
        return this.f15536a;
    }

    public final CmpType b() {
        return this.f15537b;
    }

    public final String toString() {
        return "InfoUpdateResponse(status=" + this.f15536a + ", type=" + this.f15537b + ")";
    }
}
