package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InternalMolocoPrivacySettings f55493a;

    public w(InternalMolocoPrivacySettings internalMolocoPrivacySettings) {
        Intrinsics.checkNotNullParameter(internalMolocoPrivacySettings, "internalMolocoPrivacySettings");
        this.f55493a = internalMolocoPrivacySettings;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.x
    public MolocoPrivacy.PrivacySettings getPrivacy() {
        return this.f55493a.getUpdatedPrivacySettings(MolocoPrivacy.INSTANCE.getPrivacySettings());
    }
}
