package com.inmobi.ads;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3829ka;
import com.inmobi.media.C3854la;
import com.inmobi.media.Jg;
import com.inmobi.media.Kb;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements PreloadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3829ka f36521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiInterstitial f36522b;

    public e(InMobiInterstitial inMobiInterstitial) {
        this.f36522b = inMobiInterstitial;
        this.f36521a = new C3829ka(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            this.f36522b.getMAdManager$media_release().i();
        } catch (IllegalStateException e10) {
            String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
            Intrinsics.checkNotNullExpressionValue(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            Kb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
            this.f36522b.getMPubListener$media_release().a(this.f36522b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f36522b.f36505b = true;
        Jg jg2 = this.f36522b.f36507d;
        jg2.getClass();
        Intrinsics.checkNotNullParameter("Preload", "<set-?>");
        jg2.f37147g = "Preload";
        C3854la mAdManager$media_release = this.f36522b.getMAdManager$media_release();
        Jg jg3 = this.f36522b.f36507d;
        Context context = this.f36522b.f36504a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        mAdManager$media_release.a(jg3, context, true, "intHtml");
        this.f36522b.getMAdManager$media_release().b(this.f36521a);
    }
}
