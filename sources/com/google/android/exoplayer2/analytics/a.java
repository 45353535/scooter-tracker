package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {
    public static void A(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void B(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void E(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void Y(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void h0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void i0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void y(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void z(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime) {
    }

    public static void A0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
    }

    public static void B0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, float f10) {
    }

    public static void C(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10) {
    }

    public static void D(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    public static void G(AnalyticsListener analyticsListener, Player player, AnalyticsListener.Events events) {
    }

    public static void H(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z10) {
    }

    public static void I(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z10) {
    }

    public static void N(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z10) {
    }

    public static void O(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, long j10) {
    }

    public static void Q(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    public static void R(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Metadata metadata) {
    }

    public static void T(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    public static void U(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10) {
    }

    public static void V(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10) {
    }

    public static void W(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
    }

    public static void X(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
    }

    public static void a(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
    }

    public static void a0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    public static void b(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    public static void b0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10) {
    }

    public static void e(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str) {
    }

    public static void e0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10) {
    }

    public static void f(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    public static void f0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, long j10) {
    }

    public static void g(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    public static void g0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, long j10) {
    }

    public static void h(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Format format) {
    }

    public static void j(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, long j10) {
    }

    public static void j0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z10) {
    }

    public static void k(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10) {
    }

    public static void k0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z10) {
    }

    public static void l(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    public static void m0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10) {
    }

    public static void n(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Player.Commands commands) {
    }

    public static void n0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
    }

    public static void o0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Tracks tracks) {
    }

    public static void p(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, CueGroup cueGroup) {
    }

    public static void p0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    public static void q(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, List list) {
    }

    public static void q0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    public static void t0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str) {
    }

    public static void u0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    public static void v(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DeviceInfo deviceInfo) {
    }

    public static void v0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    public static void x(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    public static void x0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Format format) {
    }

    public static void F(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10, long j10) {
    }

    public static void J(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public static void K(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public static void M(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public static void P(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i10) {
    }

    public static void S(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z10, int i10) {
    }

    public static void Z(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, boolean z10, int i10) {
    }

    public static void c(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str, long j10) {
    }

    public static void d0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Object obj, long j10) {
    }

    public static void i(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    public static void l0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10, int i11) {
    }

    public static void r(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10, DecoderCounters decoderCounters) {
    }

    public static void r0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str, long j10) {
    }

    public static void s(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10, DecoderCounters decoderCounters) {
    }

    public static void u(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10, Format format) {
    }

    public static void w(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10, boolean z10) {
    }

    public static void w0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, long j10, int i10) {
    }

    public static void y0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    public static void L(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
    }

    public static void z0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10, int i11, int i12, float f10) {
    }

    public static void c0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
    }

    public static void d(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str, long j10, long j11) {
    }

    public static void m(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10, long j10, long j11) {
    }

    public static void o(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10, long j10, long j11) {
    }

    public static void s0(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, String str, long j10, long j11) {
    }

    public static void t(AnalyticsListener analyticsListener, AnalyticsListener.EventTime eventTime, int i10, String str, long j10) {
    }
}
