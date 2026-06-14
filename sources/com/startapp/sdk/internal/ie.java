package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes11.dex */
public class ie extends cb {
    protected static final String LOG_TAG = "ie";

    public ie(@NonNull Context context, @NonNull bb bbVar, @Nullable Bundle bundle) {
        super(context, bbVar, bundle);
    }

    private void sendMetaDataRequest(Context context) {
        AdPreferences adPreferences = new AdPreferences();
        new he(this, context, com.startapp.sdk.components.a.a(context).K, adPreferences, context, adPreferences).b();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            yh yhVar = (yh) com.startapp.sdk.components.a.a(this.context).f64180g.a();
            m8 m8Var = (m8) yhVar.f65611b.a();
            m8Var.f64912a.post(new sh(yhVar));
            MetaData.c(this.context);
            if (MetaData.E().m0()) {
                sendMetaDataRequest(this.context);
            } else {
                this.callback.a();
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
