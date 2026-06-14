package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import j$.util.Objects;
import o9.a;

/* JADX INFO: loaded from: classes12.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Supplier f80848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f80849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f80850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n9.c f80851d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f80853f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o9.a f80855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f80856i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f80854g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f80852e = 0;

    public interface a {
        void executePlayerCommand(int i10);

        void setVolumeMultiplier(float f10);
    }

    public g(final Context context, Looper looper, a aVar) {
        this.f80848a = Suppliers.memoize(new Supplier() { // from class: io.bidmachine.media3.exoplayer.f
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return o9.d.c(context);
            }
        });
        this.f80850c = aVar;
        this.f80849b = new Handler(looper);
    }

    private void c() {
        int i10 = this.f80852e;
        if (i10 == 1 || i10 == 0 || this.f80855h == null) {
            return;
        }
        o9.d.b((AudioManager) this.f80848a.get(), this.f80855h);
    }

    private static int d(n9.c cVar) {
        if (cVar == null) {
            return 0;
        }
        switch (cVar.f95232c) {
            case 0:
                q9.u.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (cVar.f95230a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                q9.u.h("AudioFocusManager", "Unidentified audio usage: " + cVar.f95232c);
                return 0;
            case 16:
                return 4;
        }
    }

    private void e(int i10) {
        a aVar = this.f80850c;
        if (aVar != null) {
            aVar.executePlayerCommand(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !o()) {
                l(4);
                return;
            } else {
                e(0);
                l(3);
                return;
            }
        }
        if (i10 == -1) {
            e(-1);
            c();
            l(1);
        } else if (i10 == 1) {
            l(2);
            e(1);
        } else {
            q9.u.h("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private int i() {
        if (this.f80852e == 2) {
            return 1;
        }
        if (j() == 1) {
            l(2);
            return 1;
        }
        l(1);
        return -1;
    }

    private int j() {
        o9.a aVar = this.f80855h;
        if (aVar == null || this.f80856i) {
            this.f80855h = (aVar == null ? new a.b(this.f80853f) : aVar.a()).b((n9.c) q9.a.e(this.f80851d)).d(o()).c(new AudioManager.OnAudioFocusChangeListener() { // from class: io.bidmachine.media3.exoplayer.e
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i10) {
                    this.f80798b.g(i10);
                }
            }, this.f80849b).a();
            this.f80856i = false;
        }
        return o9.d.h((AudioManager) this.f80848a.get(), this.f80855h);
    }

    private void l(int i10) {
        if (this.f80852e == i10) {
            return;
        }
        this.f80852e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f80854g == f10) {
            return;
        }
        this.f80854g = f10;
        a aVar = this.f80850c;
        if (aVar != null) {
            aVar.setVolumeMultiplier(f10);
        }
    }

    private boolean m(int i10) {
        return i10 != 1 && this.f80853f == 1;
    }

    private boolean o() {
        n9.c cVar = this.f80851d;
        return cVar != null && cVar.f95230a == 1;
    }

    public float f() {
        return this.f80854g;
    }

    public void h() {
        this.f80850c = null;
        c();
        l(0);
    }

    public void k(n9.c cVar) {
        if (Objects.equals(this.f80851d, cVar)) {
            return;
        }
        this.f80851d = cVar;
        int iD = d(cVar);
        this.f80853f = iD;
        boolean z10 = true;
        if (iD != 1 && iD != 0) {
            z10 = false;
        }
        q9.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int n(boolean z10, int i10) {
        if (!m(i10)) {
            c();
            l(0);
            return 1;
        }
        if (z10) {
            return i();
        }
        int i11 = this.f80852e;
        if (i11 != 1) {
            return i11 != 3 ? 1 : 0;
        }
        return -1;
    }
}
