package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes11.dex */
public class ee extends cb {
    public ee(@NonNull Context context, @NonNull bb bbVar, @Nullable Bundle bundle) {
        super(context, bbVar, bundle);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            MetaData.c(this.context);
            MetaData.E().q0();
            if (!MetaData.E().l0()) {
                this.callback.a();
                return;
            }
            yh yhVar = (yh) com.startapp.sdk.components.a.a(this.context).f64180g.a();
            m8 m8Var = (m8) yhVar.f65611b.a();
            m8Var.f64912a.post(new sh(yhVar));
            g9 g9Var = new g9(h9.f64614i);
            g9Var.f64559j = true;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.U.f65426a;
                if (aVar != null) {
                    ((w9) aVar.f64190q.a()).a(g9Var);
                } else {
                    this.callback.a();
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
