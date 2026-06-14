package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class ze extends ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MrecCallbacks f15323a;

    @Override // com.appodeal.ads.ka
    public final void b(te teVar, uc ucVar, Object obj) {
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f15323a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecClicked();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void c(te teVar, uc ucVar) {
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f15323a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecExpired();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void d(te teVar, uc ucVar, Object obj) {
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f15323a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecShowFailed();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void f(te teVar, uc ucVar, Object obj) {
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f15323a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecShown();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void g(te teVar, uc ucVar) {
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f15323a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecFailedToLoad();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void h(te teVar, uc ucVar) {
        b bVar = (b) ucVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_LOADED, "isPrecache: " + bVar.f14937c.f15228e, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f15323a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecLoaded(bVar.f14937c.f15228e);
        }
    }
}
