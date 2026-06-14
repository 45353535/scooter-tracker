package com.appodeal.consent.form;

import androidx.annotation.Keep;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import com.taurusx.tax.y.z.w.s;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/appodeal/consent/form/ConsentFormBridge;", "", "onUpdateConsent", "", "tcf", "", C4240b4.j.f42669b0, "onConsentFormDismissed", "result", "", "onLog", s.z.f67720z, PglCryptUtils.KEY_MESSAGE, "onException", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConsentFormBridge {
    void onConsentFormDismissed(boolean result);

    void onException(@NotNull String message);

    void onLog(@NotNull String tag, @NotNull String message);

    void onUpdateConsent(@NotNull String tcf, @NotNull String consent);
}
