package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public final class p6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f65083b;

    public p6(Context context, j jVar) {
        this.f65082a = context;
        this.f65083b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new com.startapp.sdk.adsbase.cache.a(this, g7.d(this.f65082a, "startapp_ads".concat(File.separator).concat(UserMetadata.KEYDATA_FILENAME))));
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
