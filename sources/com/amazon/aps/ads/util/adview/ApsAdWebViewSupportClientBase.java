package com.amazon.aps.ads.util.adview;

import android.webkit.WebViewClient;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsAdWebViewSupportClientBase;", "Landroid/webkit/WebViewClient;", "<init>", "()V", "value", "", "isCrashed", "()Z", "setCrashed", "(Z)V", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ApsAdWebViewSupportClientBase extends WebViewClient {
    private boolean isCrashed;

    /* JADX INFO: renamed from: isCrashed, reason: from getter */
    public final boolean getIsCrashed() {
        return this.isCrashed;
    }

    protected final void setCrashed(boolean z10) {
        this.isCrashed = z10;
    }
}
