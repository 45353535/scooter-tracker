package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.C4240b4;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class InterstitialActivity extends ControllerActivity {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f44955s = "InterstitialActivity";

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f44955s, "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        Logger.i(f44955s, C4240b4.i.f42653t0);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Logger.i(f44955s, C4240b4.i.f42655u0);
    }
}
