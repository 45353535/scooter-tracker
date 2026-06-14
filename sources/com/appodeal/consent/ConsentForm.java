package com.appodeal.consent;

import android.app.Activity;
import androidx.annotation.UiThread;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4424m2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H'¨\u0006\b"}, d2 = {"Lcom/appodeal/consent/ConsentForm;", "", C4424m2.f43623v, "", "activity", "Landroid/app/Activity;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/appodeal/consent/OnConsentFormDismissedListener;", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConsentForm {
    @UiThread
    void show(@NotNull Activity activity, @Nullable OnConsentFormDismissedListener listener);
}
