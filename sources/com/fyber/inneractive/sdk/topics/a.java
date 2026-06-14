package com.fyber.inneractive.sdk.topics;

import android.os.OutcomeReceiver;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f23779a;

    public a(b bVar) {
        this.f23779a = bVar;
    }

    public final void onError(Throwable th2) {
        IAlog.a("%sTopic Experienced an error, and did not return successfully: %s", IAlog.a(b.class), ((Exception) th2).getMessage());
    }

    public final void onResult(Object obj) {
        androidx.privacysandbox.ads.adservices.topics.a.a(obj);
        b bVar = this.f23779a;
        b.b bVar2 = null;
        if (bVar.f23780a) {
            throw null;
        }
        if (bVar.f23781b && IAConfigManager.c()) {
            bVar2.getEncryptedTopics();
            throw null;
        }
    }
}
