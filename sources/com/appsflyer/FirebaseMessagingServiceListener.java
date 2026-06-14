package com.appsflyer;

import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes6.dex */
public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(String str) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), str);
    }
}
