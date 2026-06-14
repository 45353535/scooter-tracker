package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class ik extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk f112021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f112022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk f112023d;

    public ik(kk kkVar, Handler handler, sm0 sm0Var) {
        this.f112023d = kkVar;
        this.f112022c = handler;
        this.f112021b = sm0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f112022c.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f112023d.f112727c) {
            ((sm0) this.f112021b).f115875a.a(-1, 3, false);
        }
    }
}
