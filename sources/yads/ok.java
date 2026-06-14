package yads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class ok implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f114341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qk f114342b;

    public ok(qk qkVar, Handler handler) {
        this.f114342b = qkVar;
        this.f114341a = handler;
    }

    public final void a(int i10) {
        hk hkVar;
        qk qkVar = this.f114342b;
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && ((hkVar = qkVar.f115039d) == null || hkVar.f111608b != 1)) {
                qkVar.b(3);
                return;
            } else {
                qkVar.a(0);
                qkVar.b(2);
                return;
            }
        }
        if (i10 == -1) {
            qkVar.a(-1);
            qkVar.a();
        } else if (i10 == 1) {
            qkVar.b(1);
            qkVar.a(1);
        } else {
            qkVar.getClass();
            uf1.d("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        this.f114341a.post(new Runnable() { // from class: yads.zz
            @Override // java.lang.Runnable
            public final void run() {
                this.f118877b.a(i10);
            }
        });
    }
}
