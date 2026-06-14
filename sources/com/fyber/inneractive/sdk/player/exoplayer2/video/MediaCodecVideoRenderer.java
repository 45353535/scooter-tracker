package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(16)
public class MediaCodecVideoRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int[] f23175q0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, DtbConstants.DEFAULT_PLAYER_HEIGHT};
    public final h P;
    public final VideoRendererEventListener.EventDispatcher Q;
    public final long R;
    public final int S;
    public final boolean T;
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] U;
    public e V;
    public Surface W;
    public int X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f23176a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f23177b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f23178c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f23179d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f23180e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f23181f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f23182g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f23183h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f23184i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f23185j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f23186k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f23187l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f23188m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f23189n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f23190o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public f f23191p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecVideoRenderer(Handler handler, VideoRendererEventListener videoRendererEventListener) {
        super(2, false);
        boolean z10 = false;
        this.R = 5000L;
        this.S = -1;
        this.P = new h();
        this.Q = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        if (z.f23162a <= 22 && "foster".equals(z.f23163b) && "NVIDIA".equals(z.f23164c)) {
            z10 = true;
        }
        this.T = z10;
        this.Z = -9223372036854775807L;
        this.f23181f0 = -1;
        this.f23182g0 = -1;
        this.f23184i0 = -1.0f;
        this.f23180e0 = -1.0f;
        this.X = 1;
        this.f23185j0 = -1;
        this.f23186k0 = -1;
        this.f23188m0 = -1.0f;
        this.f23187l0 = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr) {
        this.U = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final int b(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z10;
        int i10;
        int i11;
        String str = oVar.f22793f;
        if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
            return 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar2 = oVar.f22796i;
        if (dVar2 != null) {
            z10 = false;
            for (int i12 = 0; i12 < dVar2.f21731c; i12++) {
                z10 |= dVar2.f21729a[i12].f21728e;
            }
        } else {
            z10 = false;
        }
        dVar.getClass();
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(z10, str);
        if (aVarA == null) {
            return 1;
        }
        boolean zA = aVarA.a(oVar.f22790c);
        if (zA && (i10 = oVar.f22797j) > 0 && (i11 = oVar.f22798k) > 0) {
            if (z.f23162a >= 21) {
                zA = aVarA.a(i10, i11, oVar.f22799l);
            } else {
                boolean z11 = i10 * i11 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a();
                if (!z11) {
                    Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + oVar.f22797j + "x" + oVar.f22798k + "] [" + z.f23166e + C4240b4.j.f42674e);
                }
                zA = z11;
            }
        }
        return (zA ? 3 : 2) | (aVarA.f22718b ? 8 : 4) | (aVarA.f22719c ? 16 : 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean f() {
        if ((this.Y || super.q()) && super.f()) {
            this.Z = -9223372036854775807L;
            return true;
        }
        if (this.Z == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Z) {
            return true;
        }
        this.Z = -9223372036854775807L;
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void g() {
        this.f23181f0 = -1;
        this.f23182g0 = -1;
        this.f23184i0 = -1.0f;
        this.f23180e0 = -1.0f;
        this.f23185j0 = -1;
        this.f23186k0 = -1;
        this.f23188m0 = -1.0f;
        this.f23187l0 = -1;
        r();
        h hVar = this.P;
        if (hVar.f23214b) {
            hVar.f23213a.f23210b.sendEmptyMessage(2);
        }
        this.f23191p0 = null;
        try {
            this.f22728n = null;
            o();
        } finally {
            this.N.ensureUpdated();
            this.Q.disabled(this.N);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void h() {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.N = decoderCounters;
        int i10 = this.f21574b.f22921a;
        this.f23190o0 = i10;
        this.f23189n0 = i10 != 0;
        this.Q.enabled(decoderCounters);
        h hVar = this.P;
        hVar.f23220h = false;
        if (hVar.f23214b) {
            hVar.f23213a.f23210b.sendEmptyMessage(1);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void i() {
        this.f23177b0 = 0;
        this.f23176a0 = SystemClock.elapsedRealtime();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void j() {
        this.Z = -9223372036854775807L;
        if (this.f23177b0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.Q.droppedFrames(this.f23177b0, jElapsedRealtime - this.f23176a0);
            this.f23177b0 = 0;
            this.f23176a0 = jElapsedRealtime;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void m() {
        if (z.f23162a >= 23 || !this.f23189n0 || this.Y) {
            return;
        }
        this.Y = true;
        this.Q.renderedFirstFrame(this.W);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean q() {
        Surface surface;
        return super.q() && (surface = this.W) != null && surface.isValid();
    }

    public final void r() {
        MediaCodec mediaCodec;
        this.Y = false;
        if (z.f23162a < 23 || !this.f23189n0 || (mediaCodec = this.f22729o) == null) {
            return;
        }
        this.f23191p0 = new f(this, mediaCodec);
    }

    public final void s() {
        int i10 = this.f23181f0;
        if (i10 == -1 && this.f23182g0 == -1) {
            return;
        }
        if (this.f23185j0 == i10 && this.f23186k0 == this.f23182g0 && this.f23187l0 == this.f23183h0 && this.f23188m0 == this.f23184i0) {
            return;
        }
        this.Q.videoSizeChanged(i10, this.f23182g0, this.f23183h0, this.f23184i0);
        this.f23185j0 = this.f23181f0;
        this.f23186k0 = this.f23182g0;
        this.f23187l0 = this.f23183h0;
        this.f23188m0 = this.f23184i0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(boolean z10, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(z10, j10);
        r();
        this.f23178c0 = 0;
        if (z10) {
            this.Z = this.R > 0 ? SystemClock.elapsedRealtime() + this.R : -9223372036854775807L;
        } else {
            this.Z = -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(int i10, Object obj) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (i10 != 1) {
            if (i10 == 4) {
                int iIntValue = ((Integer) obj).intValue();
                this.X = iIntValue;
                MediaCodec mediaCodec = this.f22729o;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        Surface surface = (Surface) obj;
        if (this.W == surface) {
            if (surface != null) {
                int i11 = this.f23185j0;
                if (i11 != -1 || this.f23186k0 != -1) {
                    this.Q.videoSizeChanged(i11, this.f23186k0, this.f23187l0, this.f23188m0);
                }
                if (this.Y) {
                    this.Q.renderedFirstFrame(this.W);
                    return;
                }
                return;
            }
            return;
        }
        this.W = surface;
        int i12 = this.f21575c;
        if (i12 == 1 || i12 == 2) {
            MediaCodec mediaCodec2 = this.f22729o;
            if (z.f23162a >= 23 && mediaCodec2 != null && surface != null) {
                mediaCodec2.setOutputSurface(surface);
            } else {
                o();
                l();
            }
        }
        if (surface != null) {
            int i13 = this.f23185j0;
            if (i13 != -1 || this.f23186k0 != -1) {
                this.Q.videoSizeChanged(i13, this.f23186k0, this.f23187l0, this.f23188m0);
            }
            r();
            if (i12 == 2) {
                this.Z = this.R > 0 ? SystemClock.elapsedRealtime() + this.R : -9223372036854775807L;
                return;
            }
            return;
        }
        this.f23185j0 = -1;
        this.f23186k0 = -1;
        this.f23188m0 = -1.0f;
        this.f23187l0 = -1;
        r();
    }

    public static boolean b(boolean z10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (oVar.f22793f.equals(oVar2.f22793f)) {
            int i10 = oVar.f22800m;
            if (i10 == -1) {
                i10 = 0;
            }
            int i11 = oVar2.f22800m;
            if (i11 == -1) {
                i11 = 0;
            }
            if (i10 == i11) {
                if (z10) {
                    return true;
                }
                if (oVar.f22797j == oVar2.f22797j && oVar.f22798k == oVar2.f22798k) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        e eVar;
        Point point;
        float f10;
        boolean z10;
        int i10;
        int i11;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.U;
        int iMax = oVar.f22797j;
        int iMax2 = oVar.f22798k;
        int iMax3 = oVar.f22794g;
        if (iMax3 == -1) {
            iMax3 = a(oVar.f22793f, iMax, iMax2);
        }
        if (oVarArr.length == 1) {
            eVar = new e(iMax, iMax2, iMax3);
        } else {
            boolean z11 = false;
            for (com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 : oVarArr) {
                if (b(aVar.f22718b, oVar, oVar2)) {
                    int i12 = oVar2.f22797j;
                    z11 |= i12 == -1 || oVar2.f22798k == -1;
                    iMax = Math.max(iMax, i12);
                    iMax2 = Math.max(iMax2, oVar2.f22798k);
                    int iA = oVar2.f22794g;
                    if (iA == -1) {
                        iA = a(oVar2.f22793f, oVar2.f22797j, oVar2.f22798k);
                    }
                    iMax3 = Math.max(iMax3, iA);
                }
            }
            if (z11) {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i13 = oVar.f22798k;
                int i14 = oVar.f22797j;
                boolean z12 = i13 > i14;
                int i15 = z12 ? i13 : i14;
                if (z12) {
                    i13 = i14;
                }
                float f11 = i13 / i15;
                int[] iArr = f23175q0;
                int i16 = 0;
                while (i16 < 9) {
                    int i17 = iArr[i16];
                    int i18 = i16;
                    int i19 = (int) (i17 * f11);
                    if (i17 <= i15 || i19 <= i13) {
                        break;
                    }
                    int i20 = i13;
                    if (z.f23162a >= 21) {
                        point = aVar.a(z12 ? i19 : i17, z12 ? i17 : i19);
                        f10 = f11;
                        z10 = z12;
                        i10 = i15;
                        if (aVar.a(point.x, point.y, oVar.f22799l)) {
                            break;
                        }
                        i16 = i18 + 1;
                        i13 = i20;
                        f11 = f10;
                        z12 = z10;
                        i15 = i10;
                    } else {
                        f10 = f11;
                        z10 = z12;
                        i10 = i15;
                        int i21 = ((i17 + 15) / 16) * 16;
                        int i22 = ((i19 + 15) / 16) * 16;
                        if (i21 * i22 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a()) {
                            int i23 = z10 ? i22 : i21;
                            if (!z10) {
                                i21 = i22;
                            }
                            point = new Point(i23, i21);
                        } else {
                            i16 = i18 + 1;
                            i13 = i20;
                            f11 = f10;
                            z12 = z10;
                            i15 = i10;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iMax3 = Math.max(iMax3, a(oVar.f22793f, iMax, iMax2));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
            eVar = new e(iMax, iMax2, iMax3);
        }
        this.V = eVar;
        boolean z13 = this.T;
        int i24 = this.f23190o0;
        MediaFormat mediaFormatA = oVar.a();
        mediaFormatA.setInteger("max-width", eVar.f23204a);
        mediaFormatA.setInteger("max-height", eVar.f23205b);
        int i25 = eVar.f23206c;
        if (i25 != -1) {
            mediaFormatA.setInteger("max-input-size", i25);
        }
        if (z13) {
            i11 = 0;
            mediaFormatA.setInteger("auto-frc", 0);
        } else {
            i11 = 0;
        }
        if (i24 != 0) {
            mediaFormatA.setFeatureEnabled("tunneled-playback", true);
            mediaFormatA.setInteger("audio-session-id", i24);
        }
        mediaCodec.configure(mediaFormatA, this.W, (MediaCrypto) null, i11);
        if (z.f23162a < 23 || !this.f23189n0) {
            return;
        }
        this.f23191p0 = new f(this, mediaCodec);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(String str, long j10, long j11) {
        this.Q.decoderInitialized(str, j10, j11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(oVar);
        this.Q.inputFormatChanged(oVar);
        float f10 = oVar.f22801n;
        if (f10 == -1.0f) {
            f10 = 1.0f;
        }
        this.f23180e0 = f10;
        int i10 = oVar.f22800m;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f23179d0 = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f23181f0 = integer;
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f23182g0 = integer2;
        float f10 = this.f23180e0;
        this.f23184i0 = f10;
        if (z.f23162a >= 21) {
            int i10 = this.f23179d0;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f23181f0;
                this.f23181f0 = integer2;
                this.f23182g0 = i11;
                this.f23184i0 = 1.0f / f10;
            }
        } else {
            this.f23183h0 = this.f23179d0;
        }
        mediaCodec.setVideoScalingMode(this.X);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(boolean z10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (!b(z10, oVar, oVar2)) {
            return false;
        }
        int i10 = oVar2.f22797j;
        e eVar = this.V;
        return i10 <= eVar.f23204a && oVar2.f22798k <= eVar.f23205b && oVar2.f22794g <= eVar.f23206c;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(long r24, long r26, android.media.MediaCodec r28, java.nio.ByteBuffer r29, int r30, long r31, boolean r33) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, long, boolean):boolean");
    }

    public static int a(String str, int i10, int i11) {
        int i12;
        int i13 = 4;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                i12 = i11 * i10;
                i13 = 2;
                break;
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                i12 = i11 * i10;
                break;
            case "video/avc":
                if (!"BRAVIA 4K 2015".equals(z.f23165d)) {
                    i12 = ((i11 + 15) / 16) * ((i10 + 15) / 16) * 256;
                    i13 = 2;
                    break;
                }
                break;
        }
        return -1;
    }
}
