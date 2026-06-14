package com.inmobi.ads;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C3619c2;
import com.inmobi.media.C3670e2;
import com.inmobi.media.Kb;
import com.inmobi.media.Y1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements PreloadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3619c2 f36519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f36520b;

    public d(InMobiBanner inMobiBanner) {
        this.f36520b = inMobiBanner;
        this.f36519a = new C3619c2(inMobiBanner);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            C3670e2 mAdManager = this.f36520b.getMAdManager();
            if (mAdManager != null) {
                mAdManager.o();
            }
        } catch (IllegalStateException e10) {
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            Intrinsics.checkNotNullExpressionValue(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            Kb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
            Y1 mPubListener = this.f36520b.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(this.f36520b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f36520b.setEnableAutoRefresh(false);
        this.f36520b.a((PublisherCallbacks) this.f36519a, "Preload", false);
    }
}
