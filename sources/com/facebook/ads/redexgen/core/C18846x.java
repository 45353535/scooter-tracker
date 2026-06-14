package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C18846x {
    public static final C3344mL A0E = new C3344mL(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C3344mL A04;
    public final C3344mL A05;
    public final C3334mA A06;
    public final EL A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC3073hX A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C18846x(Timeline timeline, long j10, C3334mA c3334mA, EL el) {
        this(timeline, A0E, j10, -9223372036854775807L, 1, false, c3334mA, el, A0E, j10, j10, j10, EnumC3073hX.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C18846x(Timeline timeline, C3344mL c3344mL, long j10, long j11, int i10, boolean z10, C3334mA c3334mA, EL el, C3344mL c3344mL2, long j12, long j13, long j14) {
        this(timeline, c3344mL, j10, j11, i10, z10, c3334mA, el, c3344mL2, j12, j13, j14, EnumC3073hX.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C18846x(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C3344mL c3344mL, long j10, long j11, int i10, boolean z10, C3334mA c3334mA, EL el, C3344mL c3344mL2, long j12, long j13, long j14, EnumC3073hX enumC3073hX, boolean z11) {
        this.A03 = timeline;
        this.A05 = c3344mL;
        this.A02 = j10;
        this.A01 = j11;
        this.A0C = j10;
        this.A00 = i10;
        this.A0A = z10;
        this.A06 = c3334mA;
        this.A07 = el;
        this.A04 = c3344mL2;
        this.A0B = j12;
        this.A0D = j13;
        this.A0C = j14;
        this.A08 = enumC3073hX;
        this.A09 = z11;
    }

    public static void A00(C18846x c18846x, C18846x c18846x2) {
        c18846x2.A0C = c18846x.A0C;
        c18846x2.A0B = c18846x.A0B;
        c18846x2.A0D = c18846x.A0D;
    }

    public final C18846x A01(int i10) {
        C18846x c18846x = new C18846x(this.A03, this.A05, this.A02, this.A01, i10, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c18846x);
        return c18846x;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final C18846x A02(int i10, EnumC3073hX enumC3073hX, boolean z10) {
        C18846x c18846x = new C18846x(this.A03, this.A05, this.A02, this.A01, i10, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC3073hX, z10);
        A00(this, c18846x);
        return c18846x;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C18846x A03(int i10, boolean z10) {
        C18846x c18846x = new C18846x(this.A03, this.A05, this.A02, this.A01, i10, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z10);
        A00(this, c18846x);
        return c18846x;
    }

    public final C18846x A04(Timeline timeline) {
        C18846x c18846x = new C18846x(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c18846x);
        return c18846x;
    }

    public final C18846x A05(C3344mL c3344mL) {
        return new C18846x(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c3344mL, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C18846x A06(C3344mL c3344mL, long j10, long j11, long j12) {
        long j13 = j11;
        Timeline timeline = this.A03;
        if (!c3344mL.A00()) {
            j13 = -9223372036854775807L;
        }
        return new C18846x(timeline, c3344mL, j10, j13, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j12, j10);
    }

    public final C18846x A07(C3334mA c3334mA, EL el) {
        C18846x c18846x = new C18846x(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c3334mA, el, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c18846x);
        return c18846x;
    }

    public final C18846x A08(boolean z10) {
        C18846x c18846x = new C18846x(this.A03, this.A05, this.A02, this.A01, this.A00, z10, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c18846x);
        return c18846x;
    }
}
