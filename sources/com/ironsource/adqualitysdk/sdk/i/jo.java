package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes10.dex */
public final class jo {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private jm f2876;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2874 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Handler f2877 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jg f2875 = new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.3
        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            jo.m6990(jo.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            jo.m6990(jo.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            jo.m6987(jo.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            jo.m6991(jo.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            jo.m6990(jo.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            jo.m6990(jo.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            jo.m6990(jo.this);
        }
    };

    public jo(jm jmVar) {
        this.f2876 = jmVar;
        jj.m6964().m6967(this.f2875);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m6987(jo joVar, final Activity activity) {
        joVar.f2877.postDelayed(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                jo.m6988(jo.this);
                if (jo.this.f2876 != null) {
                    jo.this.f2876.mo4668(activity);
                }
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m6988(jo joVar) {
        joVar.f2874 = true;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m6990(jo joVar) {
        joVar.f2877.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6991(jo joVar, Activity activity) {
        if (joVar.f2874) {
            joVar.f2874 = false;
            jm jmVar = joVar.f2876;
            if (jmVar != null) {
                jmVar.mo4669(activity);
            }
        }
        joVar.f2877.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6992() {
        this.f2877.removeCallbacksAndMessages(null);
        if (this.f2875 != null) {
            jj.m6964().m6966(this.f2875);
            this.f2875 = null;
        }
    }
}
