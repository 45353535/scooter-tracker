package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes9.dex */
public interface ConsentForm {

    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(@Nullable FormError formError);
    }

    void show(@RecentlyNonNull Activity activity, @RecentlyNonNull OnConsentFormDismissedListener onConsentFormDismissedListener);
}
