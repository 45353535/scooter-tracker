package o9;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AudioManager f96383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f96384b;

    public static /* synthetic */ void a(Context context, q9.k kVar) {
        f96383a = (AudioManager) context.getSystemService("audio");
        kVar.e();
    }

    public static int b(AudioManager audioManager, a aVar) {
        return o0.f98837a >= 26 ? audioManager.abandonAudioFocusRequest(aVar.c()) : audioManager.abandonAudioFocus(aVar.f());
    }

    public static synchronized AudioManager c(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (f96384b != applicationContext) {
                f96383a = null;
            }
            AudioManager audioManager = f96383a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final q9.k kVar = new q9.k();
                q9.b.a().execute(new Runnable() { // from class: o9.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a(applicationContext, kVar);
                    }
                });
                kVar.b();
                return (AudioManager) q9.a.e(f96383a);
            }
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
            f96383a = audioManager2;
            return (AudioManager) q9.a.e(audioManager2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int d(AudioManager audioManager, int i10) {
        return audioManager.getStreamMaxVolume(i10);
    }

    public static int e(AudioManager audioManager, int i10) {
        if (o0.f98837a >= 28) {
            return audioManager.getStreamMinVolume(i10);
        }
        return 0;
    }

    public static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            u.i("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public static boolean g(AudioManager audioManager, int i10) {
        return o0.f98837a >= 23 ? audioManager.isStreamMute(i10) : f(audioManager, i10) == 0;
    }

    public static int h(AudioManager audioManager, a aVar) {
        return o0.f98837a >= 26 ? audioManager.requestAudioFocus(aVar.c()) : audioManager.requestAudioFocus(aVar.f(), aVar.b().b(), aVar.e());
    }
}
