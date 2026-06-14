package yads;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class qk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f115036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ok f115037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pk f115038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hk f115039d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f115041f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f115043h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f115042g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f115040e = 0;

    public qk(Context context, Handler handler, sm0 sm0Var) {
        this.f115036a = (AudioManager) fi.a(context.getApplicationContext().getSystemService("audio"));
        this.f115038c = sm0Var;
        this.f115037b = new ok(this, handler);
    }

    public final void a() {
        if (this.f115040e == 0) {
            return;
        }
        if (w83.f117341a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f115043h;
            if (audioFocusRequest != null) {
                this.f115036a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f115036a.abandonAudioFocus(this.f115037b);
        }
        b(0);
    }

    public final void b() {
        if (w83.a(this.f115039d, (Object) null)) {
            return;
        }
        this.f115039d = null;
        this.f115041f = 0;
    }

    public final void b(int i10) {
        if (this.f115040e == i10) {
            return;
        }
        this.f115040e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f115042g == f10) {
            return;
        }
        this.f115042g = f10;
        pk pkVar = this.f115038c;
        if (pkVar != null) {
            vm0 vm0Var = ((sm0) pkVar).f115875a;
            vm0Var.a(1, 2, Float.valueOf(vm0Var.T * vm0Var.f117115v.f115042g));
        }
    }

    public final void a(int i10) {
        pk pkVar = this.f115038c;
        if (pkVar != null) {
            sm0 sm0Var = (sm0) pkVar;
            vm0 vm0Var = sm0Var.f115875a;
            vm0Var.u();
            boolean z10 = vm0Var.Z.f110321l;
            vm0 vm0Var2 = sm0Var.f115875a;
            int i11 = 1;
            if (z10 && i10 != 1) {
                i11 = 2;
            }
            vm0Var2.a(i10, i11, z10);
        }
    }

    public final int a(boolean z10, int i10) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderA;
        if (i10 == 1 || this.f115041f != 1) {
            a();
            return z10 ? 1 : -1;
        }
        if (z10) {
            if (this.f115040e == 1) {
                return 1;
            }
            if (w83.f117341a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f115043h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        androidx.media3.exoplayer.i.a();
                        builderA = androidx.media3.exoplayer.g.a(this.f115041f);
                    } else {
                        androidx.media3.exoplayer.i.a();
                        builderA = androidx.media3.exoplayer.h.a(this.f115043h);
                    }
                    hk hkVar = this.f115039d;
                    boolean z11 = hkVar != null && hkVar.f111608b == 1;
                    hkVar.getClass();
                    if (hkVar.f111613g == null) {
                        hkVar.f111613g = new gk(hkVar);
                    }
                    this.f115043h = builderA.setAudioAttributes(hkVar.f111613g.f111232a).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(this.f115037b).build();
                }
                iRequestAudioFocus = this.f115036a.requestAudioFocus(this.f115043h);
            } else {
                AudioManager audioManager = this.f115036a;
                ok okVar = this.f115037b;
                hk hkVar2 = this.f115039d;
                hkVar2.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(okVar, w83.c(hkVar2.f111610d), this.f115041f);
            }
            if (iRequestAudioFocus == 1) {
                b(1);
                return 1;
            }
            b(0);
        }
        return -1;
    }
}
