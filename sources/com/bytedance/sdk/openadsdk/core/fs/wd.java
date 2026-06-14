package com.bytedance.sdk.openadsdk.core.fs;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class wd {
    protected String lnr;
    protected VastProperties mml;
    private final AdEvents mo;
    private final AdSession mzz;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private boolean f17252wd = false;
    protected boolean qdl = false;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected int f17251ud = 0;

    public wd(AdSession adSession, AdEvents adEvents, View view) {
        this.mzz = adSession;
        this.mo = adEvents;
        this.lnr = adSession.getAdSessionId();
        qdl(view);
    }

    void lnr() {
        qdl(4);
    }

    public void mml() {
        qdl(3);
    }

    void qdl(float f10, boolean z10) {
    }

    void ud(int i10) {
    }

    public void qdl(boolean z10) {
    }

    void ud() {
        qdl(1);
    }

    public void qdl(boolean z10, float f10) {
    }

    void qdl(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.mzz) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void qdl(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.mzz;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    boolean qdl() {
        return this.qdl;
    }

    public void qdl(int i10) {
        int i11;
        if (this.mzz == null || this.mo == null || !mzz.lnr()) {
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 || (i11 = this.f17251ud) == 0 || i11 == 4) {
                        return;
                    }
                    this.mzz.finish();
                    this.qdl = false;
                } else {
                    if (this.f17252wd) {
                        return;
                    }
                    int i12 = this.f17251ud;
                    if (i12 != 1 && i12 != 2) {
                        return;
                    }
                    this.mo.impressionOccurred();
                    this.f17252wd = true;
                }
            } else {
                if (this.f17251ud != 0) {
                    return;
                }
                this.mzz.start();
                if (this.mml == null) {
                    this.mml = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.mo.loaded(this.mml);
                this.qdl = true;
                this.mml = null;
            }
        } else {
            if (this.f17251ud != 0) {
                return;
            }
            this.mzz.start();
            this.mo.loaded();
            this.qdl = true;
        }
        this.f17251ud = i10;
    }

    public void qdl(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            qdl((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
