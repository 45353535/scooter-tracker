package w9;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import j$.util.Objects;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f107565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f107566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f107567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f107568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f107569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f107570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w9.a f107571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w9.c f107572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n9.c f107573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f107574j;

    /* JADX INFO: renamed from: w9.b$b, reason: collision with other inner class name */
    private static final class C1324b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            o9.d.c(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            o9.d.c(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    private final class c extends AudioDeviceCallback {
        private c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            b bVar = b.this;
            bVar.f(w9.a.f(bVar.f107565a, b.this.f107573i, b.this.f107572h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (o0.s(audioDeviceInfoArr, b.this.f107572h)) {
                b.this.f107572h = null;
            }
            b bVar = b.this;
            bVar.f(w9.a.f(bVar.f107565a, b.this.f107573i, b.this.f107572h));
        }
    }

    private final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f107576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f107577b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f107576a = contentResolver;
            this.f107577b = uri;
        }

        public void a() {
            this.f107576a.registerContentObserver(this.f107577b, false, this);
        }

        public void b() {
            this.f107576a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            b bVar = b.this;
            bVar.f(w9.a.f(bVar.f107565a, b.this.f107573i, b.this.f107572h));
        }
    }

    private final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            b bVar = b.this;
            bVar.f(w9.a.e(context, intent, bVar.f107573i, b.this.f107572h));
        }
    }

    public interface f {
        void a(w9.a aVar);
    }

    b(Context context, f fVar, n9.c cVar, w9.c cVar2) {
        Context applicationContext = context.getApplicationContext();
        this.f107565a = applicationContext;
        this.f107566b = (f) q9.a.e(fVar);
        this.f107573i = cVar;
        this.f107572h = cVar2;
        Handler handlerC = o0.C();
        this.f107567c = handlerC;
        byte b10 = 0;
        this.f107568d = o0.f98837a >= 23 ? new c() : null;
        this.f107569e = new e();
        Uri uriI = w9.a.i();
        this.f107570f = uriI != null ? new d(handlerC, applicationContext.getContentResolver(), uriI) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(w9.a aVar) {
        if (!this.f107574j || aVar.equals(this.f107571g)) {
            return;
        }
        this.f107571g = aVar;
        this.f107566b.a(aVar);
    }

    public w9.a g() {
        c cVar;
        if (this.f107574j) {
            return (w9.a) q9.a.e(this.f107571g);
        }
        this.f107574j = true;
        d dVar = this.f107570f;
        if (dVar != null) {
            dVar.a();
        }
        if (o0.f98837a >= 23 && (cVar = this.f107568d) != null) {
            C1324b.a(this.f107565a, cVar, this.f107567c);
        }
        w9.a aVarE = w9.a.e(this.f107565a, this.f107565a.registerReceiver(this.f107569e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f107567c), this.f107573i, this.f107572h);
        this.f107571g = aVarE;
        return aVarE;
    }

    public void h(n9.c cVar) {
        this.f107573i = cVar;
        f(w9.a.f(this.f107565a, cVar, this.f107572h));
    }

    public void i(AudioDeviceInfo audioDeviceInfo) {
        w9.c cVar = this.f107572h;
        if (Objects.equals(audioDeviceInfo, cVar == null ? null : cVar.f107664a)) {
            return;
        }
        w9.c cVar2 = audioDeviceInfo != null ? new w9.c(audioDeviceInfo) : null;
        this.f107572h = cVar2;
        f(w9.a.f(this.f107565a, this.f107573i, cVar2));
    }

    public void j() {
        c cVar;
        if (this.f107574j) {
            this.f107571g = null;
            if (o0.f98837a >= 23 && (cVar = this.f107568d) != null) {
                C1324b.b(this.f107565a, cVar);
            }
            this.f107565a.unregisterReceiver(this.f107569e);
            d dVar = this.f107570f;
            if (dVar != null) {
                dVar.b();
            }
            this.f107574j = false;
        }
    }
}
