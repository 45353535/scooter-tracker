package com.vungle.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.g.n;
import com.vungle.ads.internal.ui.VungleWebClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/util/RingerModeReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "webClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "getWebClient", "()Lcom/vungle/ads/internal/ui/VungleWebClient;", "setWebClient", "(Lcom/vungle/ads/internal/ui/VungleWebClient;)V", "onReceive", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", n.f66171o, "Landroid/content/Intent;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RingerModeReceiver extends BroadcastReceiver {

    @Nullable
    private VungleWebClient webClient;

    @Nullable
    public final VungleWebClient getWebClient() {
        return this.webClient;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String action;
        VungleWebClient vungleWebClient;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception e10) {
                String localizedMessage = e10.getLocalizedMessage();
                if (localizedMessage != null) {
                    Logger.INSTANCE.e("RingerModeReceiver", localizedMessage);
                    return;
                }
                return;
            }
        } else {
            action = null;
        }
        if (Intrinsics.areEqual(action, "android.media.RINGER_MODE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
            Logger.INSTANCE.d("RingerModeReceiver", "receive ringermode: " + intExtra);
            if (intExtra == 0) {
                VungleWebClient vungleWebClient2 = this.webClient;
                if (vungleWebClient2 != null) {
                    vungleWebClient2.notifySilentModeChange(true);
                    return;
                }
                return;
            }
            if (intExtra != 1) {
                if (intExtra == 2 && (vungleWebClient = this.webClient) != null) {
                    vungleWebClient.notifySilentModeChange(false);
                    return;
                }
                return;
            }
            VungleWebClient vungleWebClient3 = this.webClient;
            if (vungleWebClient3 != null) {
                vungleWebClient3.notifySilentModeChange(true);
            }
        }
    }

    public final void setWebClient(@Nullable VungleWebClient vungleWebClient) {
        this.webClient = vungleWebClient;
    }
}
