package com.startapp.sdk.internal;

import android.os.OutcomeReceiver;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class fi implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gi f64514a;

    public fi(gi giVar) {
        this.f64514a = giVar;
    }

    public final void onError(Throwable th2) {
        Exception exc = (Exception) th2;
        if (this.f64514a.a(8)) {
            g9.a(exc);
        }
    }

    public final void onResult(Object obj) {
        androidx.privacysandbox.ads.adservices.topics.a.a(obj);
        try {
            new HashMap();
            throw null;
        } catch (Throwable th2) {
            if (this.f64514a.a(4)) {
                g9.a(th2);
            }
        }
    }
}
