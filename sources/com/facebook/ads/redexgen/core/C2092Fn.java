package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2092Fn {
    public final Handler A00;
    public final InterfaceC2093Fo A01;

    public C2092Fn(Handler handler, InterfaceC2093Fo interfaceC2093Fo) {
        this.A00 = interfaceC2093Fo != null ? (Handler) C3M.A01(handler) : null;
        this.A01 = interfaceC2093Fo;
    }

    public final void A00(final int i10, final long j10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fj
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A02(i10, j10);
                }
            });
        }
    }

    public final void A01(final int i10, final long j10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fa
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A03(i10, j10);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i10, long j10) {
        ((InterfaceC2093Fo) AbstractC18094a.A0f(this.A01)).ACr(i10, j10);
    }

    public final /* synthetic */ void A03(int i10, long j10) {
        ((InterfaceC2093Fo) AbstractC18094a.A0f(this.A01)).AD7(i10, j10);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A04(int i10, C3497or c3497or) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC2091Fm(this, i10, c3497or));
        }
    }

    public final void A05(final C3497or c3497or, final C18445j c18445j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fg
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A06(c3497or, c18445j);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C3497or c3497or, C18445j c18445j) {
        ((InterfaceC2093Fo) AbstractC18094a.A0f(this.A01)).AFk(c3497or);
        ((InterfaceC2093Fo) AbstractC18094a.A0f(this.A01)).AFl(c3497or, c18445j);
    }

    public final void A07(final C3450o4 c3450o4) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fi
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A08(c3450o4);
                }
            });
        }
    }

    public final /* synthetic */ void A08(C3450o4 c3450o4) {
        ((InterfaceC2093Fo) AbstractC18094a.A0f(this.A01)).AFr(c3450o4);
    }

    public final void A09(final C18415g c18415g) {
        c18415g.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fk
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0B(c18415g);
                }
            });
        }
    }

    public final void A0A(final C18415g c18415g) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fe
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0C(c18415g);
                }
            });
        }
    }

    public final /* synthetic */ void A0B(C18415g c18415g) {
        c18415g.A02();
        ((InterfaceC2093Fo) AbstractC18094a.A0f(this.A01)).AFe(c18415g);
    }

    public final /* synthetic */ void A0C(C18415g c18415g) {
        ((InterfaceC2093Fo) AbstractC18094a.A0f(this.A01)).AFf(c18415g);
    }

    public final void A0D(final Object obj) {
        if (this.A00 != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Ff
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0E(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Object obj, long j10) {
        ((InterfaceC2093Fo) AbstractC18094a.A0f(this.A01)).AEx(obj, j10);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fh
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j10, final long j11) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Fd
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j10, j11);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j10, long j11) {
        ((InterfaceC2093Fo) AbstractC18094a.A0f(this.A01)).AFd(str, j10, j11);
    }
}
