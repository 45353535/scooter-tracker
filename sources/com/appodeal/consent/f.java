package com.appodeal.consent;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends ConsentInformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentStatus f15404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ConsentStatus status) {
        super(CmpType.None, null);
        Intrinsics.checkNotNullParameter(status, "status");
        this.f15404b = status;
    }

    @Override // com.appodeal.consent.ConsentInformation
    public final ConsentStatus getStatus() {
        return this.f15404b;
    }

    public final String toString() {
        return "NoneConsentInformation(status=" + this.f15404b + ", type=" + getType() + ")";
    }
}
