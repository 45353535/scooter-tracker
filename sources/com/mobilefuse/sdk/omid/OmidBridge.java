package com.mobilefuse.sdk.omid;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public interface OmidBridge {
    void addFriendlyObstruction(View view, OmidFriendlyObstructionPurpose omidFriendlyObstructionPurpose, String str) throws Throwable;

    void finishAdSession() throws Throwable;

    String getPartnerName() throws Throwable;

    String getPartnerVersion() throws Throwable;

    void removeAllFriendlyObstructions() throws Throwable;

    void removeFriendlyObstruction(View view) throws Throwable;

    void signalAdImpressionEvent() throws Throwable;

    void startAdSession() throws Throwable;
}
