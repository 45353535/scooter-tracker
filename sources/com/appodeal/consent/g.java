package com.appodeal.consent;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends ConsentInformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.ump.ConsentInformation f15466b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.google.android.ump.ConsentInformation information) {
        super(CmpType.Ump, null);
        Intrinsics.checkNotNullParameter(information, "information");
        this.f15466b = information;
    }

    @Override // com.appodeal.consent.ConsentInformation
    public final ConsentStatus getStatus() {
        int consentStatus = this.f15466b.getConsentStatus();
        return consentStatus != 0 ? consentStatus != 1 ? consentStatus != 2 ? consentStatus != 3 ? ConsentStatus.Unknown : ConsentStatus.Obtained : ConsentStatus.Required : ConsentStatus.NotRequired : ConsentStatus.Unknown;
    }

    public final String toString() {
        return "UmpConsentInformation(status=" + getStatus() + ", type=" + getType() + ")";
    }
}
