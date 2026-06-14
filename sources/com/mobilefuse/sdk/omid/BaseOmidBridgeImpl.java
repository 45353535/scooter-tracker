package com.mobilefuse.sdk.omid;

import android.util.Log;
import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mobilefuse.adsession.AdEvents;
import com.iab.omid.library.mobilefuse.adsession.AdSession;
import com.iab.omid.library.mobilefuse.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mobilefuse.adsession.Partner;

/* JADX INFO: loaded from: classes10.dex */
abstract class BaseOmidBridgeImpl implements OmidBridge {

    @Nullable
    protected AdEvents adEvents;
    private boolean adImpressionSent;
    protected boolean adLoadedSent;

    @Nullable
    protected AdSession adSession;
    private boolean sessionStarted;

    BaseOmidBridgeImpl() {
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    public void addFriendlyObstruction(View view, OmidFriendlyObstructionPurpose omidFriendlyObstructionPurpose, String str) throws Throwable {
        AdSession adSession = this.adSession;
        if (adSession == null) {
            return;
        }
        adSession.addFriendlyObstruction(view, convertFriendlyObstructionPurpose(omidFriendlyObstructionPurpose), str);
    }

    protected FriendlyObstructionPurpose convertFriendlyObstructionPurpose(OmidFriendlyObstructionPurpose omidFriendlyObstructionPurpose) throws Throwable {
        return FriendlyObstructionPurpose.valueOf(omidFriendlyObstructionPurpose.toString());
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    public void finishAdSession() throws Throwable {
        AdSession adSession = this.adSession;
        if (adSession == null) {
            return;
        }
        logDebug("finish");
        this.adEvents = null;
        adSession.finish();
        this.adSession = null;
    }

    protected abstract String getLogTagName();

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    @Nullable
    public final String getPartnerName() throws Throwable {
        Partner omidPartner = OmidService.getOmidPartner();
        if (omidPartner == null) {
            return null;
        }
        return omidPartner.getName();
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    @Nullable
    public final String getPartnerVersion() throws Throwable {
        Partner omidPartner = OmidService.getOmidPartner();
        if (omidPartner == null) {
            return null;
        }
        return omidPartner.getVersion();
    }

    protected void logDebug(String str) {
        Log.d(getLogTagName(), str);
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    public void removeAllFriendlyObstructions() throws Throwable {
        AdSession adSession = this.adSession;
        if (adSession == null) {
            return;
        }
        adSession.removeAllFriendlyObstructions();
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    public void removeFriendlyObstruction(View view) throws Throwable {
        AdSession adSession = this.adSession;
        if (adSession == null) {
            return;
        }
        adSession.removeFriendlyObstruction(view);
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    public void signalAdImpressionEvent() throws Throwable {
        AdEvents adEvents = this.adEvents;
        if (adEvents == null || this.adImpressionSent) {
            return;
        }
        this.adImpressionSent = true;
        logDebug("impression");
        adEvents.impressionOccurred();
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    public void startAdSession() throws Throwable {
        AdSession adSession = this.adSession;
        if (adSession == null || this.sessionStarted) {
            return;
        }
        this.sessionStarted = true;
        adSession.start();
    }
}
