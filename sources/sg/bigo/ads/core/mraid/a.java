package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f104367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f104368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1294a f104369c;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.a$a, reason: collision with other inner class name */
    public interface InterfaceC1294a {
        void a(float f10);
    }

    a(Handler handler, Context context, InterfaceC1294a interfaceC1294a) {
        super(handler);
        this.f104367a = -1.0f;
        this.f104368b = context.getApplicationContext();
        this.f104369c = interfaceC1294a;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float streamVolume = ((AudioManager) this.f104368b.getSystemService("audio")) != null ? 100.0f * (r5.getStreamVolume(3) / r5.getStreamMaxVolume(3)) : 100.0f;
        if (streamVolume != this.f104367a) {
            this.f104367a = streamVolume;
            sg.bigo.ads.common.t.a.a(0, 3, "AudioVolumeContentObserver", String.format("Volume change, current value: %s", Float.valueOf(streamVolume)));
            InterfaceC1294a interfaceC1294a = this.f104369c;
            if (interfaceC1294a != null) {
                interfaceC1294a.a(this.f104367a);
            }
        }
    }
}
