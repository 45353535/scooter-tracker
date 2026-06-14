package com.appodeal.ads.regulator;

import com.appodeal.consent.ConsentForm;
import com.ironsource.C4240b4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentForm f14352a;

    public d(ConsentForm consentForm) {
        Intrinsics.checkNotNullParameter(consentForm, "consentForm");
        this.f14352a = consentForm;
    }

    public final String toString() {
        return "OnFormLoaded [consentForm: " + this.f14352a + C4240b4.j.f42674e;
    }
}
