package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.bidtoken.x f55462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MolocoPrivacy.PrivacySettings f55464d;

    public w(com.moloco.sdk.internal.services.bidtoken.x privacyProvider) {
        Intrinsics.checkNotNullParameter(privacyProvider, "privacyProvider");
        this.f55462b = privacyProvider;
        this.f55463c = "PrivacyStateSignalProvider";
        this.f55464d = privacyProvider.getPrivacy();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f55464d = this.f55462b.getPrivacy();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean zAreEqual = Intrinsics.areEqual(this.f55464d, this.f55462b.getPrivacy());
        boolean z10 = !zAreEqual;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f55463c, !zAreEqual ? "[CBT] privacy updated" : "[CBT] privacy didn't change", false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return this.f55463c;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MolocoPrivacy.PrivacySettings d() {
        return this.f55464d;
    }
}
