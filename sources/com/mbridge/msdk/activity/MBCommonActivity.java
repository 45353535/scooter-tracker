package com.mbridge.msdk.activity;

import android.os.Build;
import android.os.Bundle;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;

/* JADX INFO: loaded from: classes10.dex */
public class MBCommonActivity extends DomainMBCommonActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f46221e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f46222d = false;

    @Override // android.app.Activity
    public void finish() {
        BrowserView browserView = this.browserView;
        if (browserView != null) {
            browserView.setListener(null);
            this.browserView.destroy();
        }
        BrowserView browserViewRemove = b.f49164a.remove(this.f46210a);
        if (browserViewRemove != null) {
            browserViewRemove.setListener(null);
            browserViewRemove.destroy();
        }
        this.f46222d = true;
        super.finish();
    }

    @Override // com.mbridge.msdk.activity.DomainMBCommonActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f46222d) {
            return;
        }
        BrowserView browserView = this.browserView;
        if (browserView != null) {
            browserView.setListener(null);
            this.browserView.destroy();
        }
        BrowserView browserViewRemove = b.f49164a.remove(this.f46210a);
        if (browserViewRemove != null) {
            browserViewRemove.setListener(null);
            browserViewRemove.destroy();
        }
    }
}
