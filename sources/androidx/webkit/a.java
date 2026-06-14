package androidx.webkit;

import androidx.webkit.internal.ProfileStoreImpl;
import androidx.webkit.internal.WebViewFeatureInternal;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static ProfileStore a() {
        if (WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return ProfileStoreImpl.getInstance();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
