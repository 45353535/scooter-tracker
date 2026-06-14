package com.google.firebase.analytics;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzfb;

/* JADX INFO: loaded from: classes9.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        zzfb.zza(this, null).zze(getIntent());
        finish();
    }
}
