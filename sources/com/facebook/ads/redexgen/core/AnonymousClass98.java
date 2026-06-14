package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass98 extends AbstractC3351mS implements InterfaceC2007Cg {
    public long A00;
    public C5H A01;
    public InterfaceC3173jM<InterfaceExecutorC2078Ez> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C2Q A07;
    public final C3488oi A08;
    public final InterfaceC18314w A09;
    public final C9U A0A;
    public final InterfaceC2001Ca A0B;
    public final InterfaceC2056Ed A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jM != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public AnonymousClass98(C3488oi c3488oi, InterfaceC18314w interfaceC18314w, InterfaceC2001Ca interfaceC2001Ca, C9U c9u, InterfaceC2056Ed interfaceC2056Ed, int i10, InterfaceC3173jM<InterfaceExecutorC2078Ez> interfaceC3173jM) {
        this.A07 = (C2Q) C3M.A01(c3488oi.A03);
        this.A08 = c3488oi;
        this.A09 = interfaceC18314w;
        this.A0B = interfaceC2001Ca;
        this.A0A = c9u == null ? C9U.A00 : c9u;
        this.A0C = interfaceC2056Ed;
        this.A06 = i10;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC3173jM;
    }

    private void A00() {
        final Timeline anonymousClass97 = new AnonymousClass97(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9C(anonymousClass97) { // from class: com.facebook.ads.redexgen.X.12
                @Override // com.facebook.ads.redexgen.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C3468oN A0I(int i10, C3468oN c3468oN, boolean z10) {
                    super.A0I(i10, c3468oN, z10);
                    c3468oN.A05 = true;
                    return c3468oN;
                }

                @Override // com.facebook.ads.redexgen.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C3466oL A0L(int i10, C3466oL c3466oL, long j10) {
                    super.A0L(i10, c3466oL, j10);
                    c3466oL.A0F = true;
                    return c3466oL;
                }
            };
            anonymousClass97 = timeline;
        }
        A05(anonymousClass97);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3351mS
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3351mS
    public final void A0A(C5H c5h) {
        this.A01 = c5h;
        this.A0A.AGK();
        this.A0A.AIu((Looper) C3M.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.CL
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC3345mM A5O(C3344mL c3344mL, EO eo, long j10) {
        InterfaceExecutorC2078Ez interfaceExecutorC2078Ez;
        InterfaceC3432nl interfaceC3432nlA5A = this.A09.A5A();
        if (this.A01 != null) {
            interfaceC3432nlA5A.A3v(this.A01);
        }
        Uri uri = this.A07.A00;
        InterfaceC2002Cb interfaceC2002CbA5P = this.A0B.A5P(C18997m.A03);
        C9U c9u = this.A0A;
        C9P c9pA01 = A01(c3344mL);
        InterfaceC2056Ed interfaceC2056Ed = this.A0C;
        CW cwA02 = A02(c3344mL);
        String str = this.A07.A04;
        int i10 = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC2078Ez = this.A02.get();
        } else {
            interfaceExecutorC2078Ez = null;
        }
        return new C9A(uri, interfaceC3432nlA5A, interfaceC2002CbA5P, c9u, c9pA01, interfaceC2056Ed, cwA02, this, eo, str, i10, interfaceExecutorC2078Ez);
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void ABu() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007Cg
    public final void AFH(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.A00;
        }
        if (!this.A04 && this.A00 == j10 && this.A05 == z10 && this.A03 == z11) {
            return;
        }
        this.A00 = j10;
        this.A05 = z10;
        this.A03 = z11;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void AH0(InterfaceC3345mM interfaceC3345mM) {
        ((C9A) interfaceC3345mM).A0a();
    }
}
