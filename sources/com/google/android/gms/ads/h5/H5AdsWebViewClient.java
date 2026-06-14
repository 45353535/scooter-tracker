package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpq;

/* JADX INFO: loaded from: classes7.dex */
@RequiresApi(api = 21)
public final class H5AdsWebViewClient extends zzbpd {
    private final zzbpq zza;

    public H5AdsWebViewClient(@NonNull Context context, @NonNull WebView webView) {
        this.zza = new zzbpq(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    @NonNull
    protected WebViewClient getDelegate() {
        return this.zza;
    }

    @Nullable
    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(@Nullable WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}
