package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC3400nF extends InterfaceC17752s, CX, ET, C9Q {

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary Noop Implementation until we completely migrate")
    public static final InterfaceC3400nF A00 = new InterfaceC3400nF() { // from class: com.facebook.ads.redexgen.X.9S
        @Override // com.facebook.ads.redexgen.core.InterfaceC17752s
        public final /* synthetic */ void ACv(C3446o0 c3446o0) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC17752s
        public final /* synthetic */ void ACw(List list) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AD6(int i10, C3344mL c3344mL, CG cg2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADw(int i10, C3344mL c3344mL, CE ce2, CG cg2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADy(int i10, C3344mL c3344mL, CE ce2, CG cg2, Object obj, Object obj2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AE1(int i10, C3344mL c3344mL, CE ce2, CG cg2, IOException iOException, boolean z10) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC17752s
        public final /* synthetic */ void AEb(C3481ob c3481ob) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC17752s
        public final /* synthetic */ void AEd(C3483od c3483od) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC17752s
        public final /* synthetic */ void AEf(boolean z10, int i10) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC17752s
        public final /* synthetic */ void AFB() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC17752s
        public final /* synthetic */ void AFQ(Timeline timeline, int i10) {
            AbstractC17742r.A00(this, timeline, i10);
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC17752s
        public final /* synthetic */ void AFU(C3452o6 c3452o6) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC3400nF
        public final void AC5() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC3400nF
        public final void AIv(InterfaceC17822z interfaceC17822z, Looper looper) {
        }
    };

    void AC5();

    void AIv(InterfaceC17822z interfaceC17822z, Looper looper);
}
