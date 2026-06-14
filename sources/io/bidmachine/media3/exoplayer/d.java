package io.bidmachine.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;

/* JADX INFO: loaded from: classes12.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f80654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f80655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.q f80656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f80657d;

    /* JADX INFO: Access modifiers changed from: private */
    final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f80658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q9.q f80659b;

        public a(q9.q qVar, b bVar) {
            this.f80659b = qVar;
            this.f80658a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (d.this.f80657d) {
                this.f80658a.onAudioBecomingNoisy();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f80659b.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f80648b.b();
                    }
                });
            }
        }
    }

    public interface b {
        void onAudioBecomingNoisy();
    }

    public d(Context context, Looper looper, Looper looper2, b bVar, q9.h hVar) {
        this.f80654a = context.getApplicationContext();
        this.f80656c = hVar.createHandler(looper, null);
        this.f80655b = new a(hVar.createHandler(looper2, null), bVar);
    }

    public void d(boolean z10) {
        if (z10 == this.f80657d) {
            return;
        }
        if (z10) {
            this.f80656c.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.a
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar = this.f80633b;
                    dVar.f80654a.registerReceiver(dVar.f80655b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.f80657d = true;
        } else {
            this.f80656c.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.b
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar = this.f80640b;
                    dVar.f80654a.unregisterReceiver(dVar.f80655b);
                }
            });
            this.f80657d = false;
        }
    }
}
