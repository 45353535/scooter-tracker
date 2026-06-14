package com.mobilefuse.sdk.omid;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.mobilefuse.ScriptInjector;
import com.iab.omid.library.mobilefuse.adsession.AdEvents;
import com.iab.omid.library.mobilefuse.adsession.AdSession;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes10.dex */
public class MraidOmidBridgeImpl extends BaseOmidBridgeImpl implements MraidOmidBridge {
    MraidOmidBridgeImpl() throws Throwable {
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl, com.mobilefuse.sdk.omid.OmidBridge
    public /* bridge */ /* synthetic */ void addFriendlyObstruction(View view, OmidFriendlyObstructionPurpose omidFriendlyObstructionPurpose, String str) throws Throwable {
        super.addFriendlyObstruction(view, omidFriendlyObstructionPurpose, str);
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl, com.mobilefuse.sdk.omid.OmidBridge
    public /* bridge */ /* synthetic */ void finishAdSession() throws Throwable {
        super.finishAdSession();
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl
    protected String getLogTagName() {
        return "omid:mraid";
    }

    @Override // com.mobilefuse.sdk.omid.MraidOmidBridge
    public void initAdSession(Context context, WebView webView) throws Throwable {
        logDebug("initSession");
        AdSession htmlAdSession = OmidService.getHtmlAdSession(context, webView, null);
        this.adSession = htmlAdSession;
        if (htmlAdSession == null) {
            return;
        }
        this.adEvents = AdEvents.createAdEvents(htmlAdSession);
    }

    @Override // com.mobilefuse.sdk.omid.MraidOmidBridge
    public String injectOmidScriptContentIntoAdm(String str) throws Throwable {
        if (str.trim().indexOf("<html>") != 0) {
            str = "<html>" + str + "</html>";
        }
        return ScriptInjector.injectScriptContentIntoHtml(OmidService.getOmidJsContent(), str);
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl, com.mobilefuse.sdk.omid.OmidBridge
    public /* bridge */ /* synthetic */ void removeAllFriendlyObstructions() throws Throwable {
        super.removeAllFriendlyObstructions();
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl, com.mobilefuse.sdk.omid.OmidBridge
    public /* bridge */ /* synthetic */ void removeFriendlyObstruction(View view) throws Throwable {
        super.removeFriendlyObstruction(view);
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl, com.mobilefuse.sdk.omid.OmidBridge
    public /* bridge */ /* synthetic */ void signalAdImpressionEvent() throws Throwable {
        super.signalAdImpressionEvent();
    }

    @Override // com.mobilefuse.sdk.omid.MraidOmidBridge
    public void signalAdLoadedEvent() throws Throwable {
        logDebug(C4240b4.i.f42648r);
        AdEvents adEvents = this.adEvents;
        if (adEvents == null || this.adLoadedSent) {
            return;
        }
        this.adLoadedSent = true;
        adEvents.loaded();
    }

    @Override // com.mobilefuse.sdk.omid.BaseOmidBridgeImpl, com.mobilefuse.sdk.omid.OmidBridge
    public /* bridge */ /* synthetic */ void startAdSession() throws Throwable {
        super.startAdSession();
    }
}
