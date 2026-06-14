package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.C4462o4;
import com.ironsource.S7;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes10.dex */
class t {

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f45245a;

        a(AudioManager audioManager) {
            this.f45245a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.f45245a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f45246a;

        b(AudioManager audioManager) {
            this.f45246a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.b(this.f45246a);
        }
    }

    t() {
    }

    public static void a(Activity activity) {
        S7.f41731a.b(new a((AudioManager) activity.getSystemService("audio")));
    }

    public static void b(Activity activity) {
        S7.f41731a.b(new b((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }
}
