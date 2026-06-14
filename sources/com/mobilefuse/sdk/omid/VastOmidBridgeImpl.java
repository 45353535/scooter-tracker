package com.mobilefuse.sdk.omid;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.mobilefuse.adsession.AdEvents;
import com.iab.omid.library.mobilefuse.adsession.AdSession;
import com.iab.omid.library.mobilefuse.adsession.VerificationScriptResource;
import com.iab.omid.library.mobilefuse.adsession.media.InteractionType;
import com.iab.omid.library.mobilefuse.adsession.media.MediaEvents;
import com.iab.omid.library.mobilefuse.adsession.media.PlayerState;
import com.iab.omid.library.mobilefuse.adsession.media.Position;
import com.iab.omid.library.mobilefuse.adsession.media.VastProperties;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes10.dex */
public class VastOmidBridgeImpl extends BaseOmidBridgeImpl implements VastOmidBridge {

    @Nullable
    private Runnable adSessionInitCompleteListener;

    @Nullable
    private Runnable completeListener;

    @Nullable
    private MediaEvents mediaEvents;
    private boolean videoCompleteSent;
    private boolean videoFirstQuartileSent;
    private boolean videoMiddleSent;
    private boolean videoPlaybackEnded;
    private boolean videoSkippedSent;
    private boolean videoStartSent;
    private boolean videoThirdQuartileSent;

    @Nullable
    private View videoView;
    private final List<VerificationScriptResource> verificationScripts = new ArrayList();
    private final Set<String> registeredVerificationVendors = new HashSet();

    VastOmidBridgeImpl() throws Throwable {
    }

    private void playerStateChange(PlayerState playerState) throws Throwable {
        MediaEvents mediaEvents = this.mediaEvents;
        if (mediaEvents == null) {
            return;
        }
        logDebug("playerStateChange with state:" + playerState);
        mediaEvents.playerStateChange(playerState);
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void adUserInteractionClick() throws Throwable {
        MediaEvents mediaEvents = this.mediaEvents;
        if (mediaEvents == null) {
            return;
        }
        logDebug("onClick");
        mediaEvents.adUserInteraction(InteractionType.CLICK);
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl, com.mobilefuse.sdk.omid.OmidBridge
    public /* bridge */ /* synthetic */ void addFriendlyObstruction(View view, OmidFriendlyObstructionPurpose omidFriendlyObstructionPurpose, String str) throws Throwable {
        super.addFriendlyObstruction(view, omidFriendlyObstructionPurpose, str);
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void complete() throws Throwable {
        MediaEvents mediaEvents = this.mediaEvents;
        if (mediaEvents == null || this.videoCompleteSent) {
            return;
        }
        this.videoCompleteSent = true;
        logDebug("complete");
        this.videoPlaybackEnded = true;
        mediaEvents.complete();
        Runnable runnable = this.completeListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl, com.mobilefuse.sdk.omid.OmidBridge
    public void finishAdSession() throws Throwable {
        this.adSessionInitCompleteListener = null;
        this.completeListener = null;
        this.videoView = null;
        this.mediaEvents = null;
        super.finishAdSession();
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void firstQuartile() throws Throwable {
        MediaEvents mediaEvents = this.mediaEvents;
        if (mediaEvents == null || this.videoFirstQuartileSent) {
            return;
        }
        this.videoFirstQuartileSent = true;
        logDebug("firstQuartile");
        mediaEvents.firstQuartile();
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl
    protected String getLogTagName() {
        return "omid:vast";
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public Set<String> getRegisteredVerificationVendors() throws Throwable {
        return this.registeredVerificationVendors;
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    @Nullable
    public View getVideoView() {
        return this.videoView;
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void initAdSession(Context context, View view) throws Throwable {
        if (this.adSession != null) {
            return;
        }
        logDebug("initSession");
        this.videoView = view;
        AdSession nativeVideoAdSession = OmidService.getNativeVideoAdSession(context, view, this.verificationScripts, null);
        this.adSession = nativeVideoAdSession;
        if (nativeVideoAdSession == null) {
            return;
        }
        this.adEvents = AdEvents.createAdEvents(nativeVideoAdSession);
        this.mediaEvents = MediaEvents.createMediaEvents(nativeVideoAdSession);
        Runnable runnable = this.adSessionInitCompleteListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void midpoint() throws Throwable {
        MediaEvents mediaEvents = this.mediaEvents;
        if (mediaEvents == null || this.videoMiddleSent) {
            return;
        }
        this.videoMiddleSent = true;
        logDebug("midpoint");
        mediaEvents.midpoint();
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void mute() throws Throwable {
        MediaEvents mediaEvents = this.mediaEvents;
        if (mediaEvents == null) {
            return;
        }
        logDebug("mute");
        mediaEvents.volumeChange(0.0f);
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void onPlayerStateNormal() throws Throwable {
        playerStateChange(PlayerState.NORMAL);
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void pause() throws Throwable {
        MediaEvents mediaEvents = this.mediaEvents;
        if (mediaEvents == null || this.videoPlaybackEnded) {
            return;
        }
        logDebug("pause");
        mediaEvents.pause();
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void registerVerificationScript(@Nullable String str, @NonNull String str2, @Nullable String str3) throws Throwable {
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        try {
            verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(str2)) : VerificationScriptResource.createVerificationScriptResourceWithParameters(str, new URL(str2), str3);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = null;
        }
        if (verificationScriptResourceCreateVerificationScriptResourceWithoutParameters == null) {
            return;
        }
        HttpRequestTracker.logHttpRequest(str2);
        this.registeredVerificationVendors.add(str);
        this.verificationScripts.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl, com.mobilefuse.sdk.omid.OmidBridge
    public /* bridge */ /* synthetic */ void removeAllFriendlyObstructions() throws Throwable {
        super.removeAllFriendlyObstructions();
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl, com.mobilefuse.sdk.omid.OmidBridge
    public /* bridge */ /* synthetic */ void removeFriendlyObstruction(View view) throws Throwable {
        super.removeFriendlyObstruction(view);
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void resume() throws Throwable {
        MediaEvents mediaEvents = this.mediaEvents;
        if (mediaEvents == null || this.videoPlaybackEnded) {
            return;
        }
        logDebug("resume");
        mediaEvents.resume();
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void setAdSessionInitCompleteListener(@NonNull Runnable runnable) throws Throwable {
        this.adSessionInitCompleteListener = runnable;
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void setCompleteListener(@NonNull Runnable runnable) {
        this.completeListener = runnable;
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl, com.mobilefuse.sdk.omid.OmidBridge
    public /* bridge */ /* synthetic */ void signalAdImpressionEvent() throws Throwable {
        super.signalAdImpressionEvent();
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void signalAdLoadedEvent(boolean z10, float f10, boolean z11) throws Throwable {
        AdEvents adEvents = this.adEvents;
        if (adEvents == null || this.adLoadedSent) {
            return;
        }
        this.adLoadedSent = true;
        logDebug(C4240b4.i.f42648r);
        adEvents.loaded(z10 ? VastProperties.createVastPropertiesForSkippableMedia(f10, z11, Position.STANDALONE) : VastProperties.createVastPropertiesForNonSkippableMedia(z11, Position.STANDALONE));
        onPlayerStateNormal();
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void skipped() throws Throwable {
        MediaEvents mediaEvents = this.mediaEvents;
        if (mediaEvents == null || this.videoSkippedSent) {
            return;
        }
        this.videoSkippedSent = true;
        logDebug(Reporting.EventType.VIDEO_AD_SKIPPED);
        this.videoPlaybackEnded = true;
        mediaEvents.skipped();
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void start(float f10, float f11) throws Throwable {
        MediaEvents mediaEvents = this.mediaEvents;
        if (mediaEvents == null || this.videoStartSent) {
            return;
        }
        this.videoStartSent = true;
        logDebug("start");
        mediaEvents.start(f10, f11);
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl, com.mobilefuse.sdk.omid.OmidBridge
    public /* bridge */ /* synthetic */ void startAdSession() throws Throwable {
        super.startAdSession();
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void thirdQuartile() throws Throwable {
        MediaEvents mediaEvents = this.mediaEvents;
        if (mediaEvents == null || this.videoThirdQuartileSent) {
            return;
        }
        this.videoThirdQuartileSent = true;
        logDebug("thirdQuartile");
        mediaEvents.thirdQuartile();
    }

    @Override // com.mobilefuse.sdk.omid.VastOmidBridge
    public void unmute() throws Throwable {
        MediaEvents mediaEvents = this.mediaEvents;
        if (mediaEvents == null) {
            return;
        }
        logDebug("unmute");
        mediaEvents.volumeChange(1.0f);
    }
}
