package com.appodeal.ads;

import android.os.Handler;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l2 extends ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NativeCallbacks f13588a;

    @Override // com.appodeal.ads.ka
    public final void b(te teVar, uc ucVar, Object obj) {
        com.appodeal.ads.nativead.e eVar = (com.appodeal.ads.nativead.e) obj;
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = this.f13588a;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeClicked(eVar);
        }
    }

    @Override // com.appodeal.ads.ka
    public final void c(te teVar, uc ucVar) {
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = this.f13588a;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeExpired();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void d(te teVar, uc ucVar, Object obj) {
        com.appodeal.ads.nativead.e eVar = (com.appodeal.ads.nativead.e) obj;
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = this.f13588a;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeShowFailed(eVar);
        }
    }

    @Override // com.appodeal.ads.ka
    public final void f(te teVar, uc ucVar, Object obj) {
        com.appodeal.ads.nativead.e eVar = (com.appodeal.ads.nativead.e) obj;
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = this.f13588a;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeShown(eVar);
        }
    }

    @Override // com.appodeal.ads.ka
    public final void g(te teVar, uc ucVar) {
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = this.f13588a;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeFailedToLoad();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void h(te teVar, uc ucVar) {
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_LOADED, "isPrecache: " + ((d3) ucVar).f14937c.f15228e, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = this.f13588a;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeLoaded();
        }
    }

    public final void i() {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdNotifyNativeAdLoaded", "name");
        Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_NOTIFY_LOADED, Log.LogLevel.verbose);
        NativeCallbacks nativeCallbacks = this.f13588a;
        if (nativeCallbacks != null) {
            nativeCallbacks.onNativeLoaded();
        }
    }

    public final void j() {
        Runnable task = new Runnable() { // from class: com.appodeal.ads.k2
            @Override // java.lang.Runnable
            public final void run() {
                this.f13534b.i();
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }
}
