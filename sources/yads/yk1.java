package yads;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class yk1 implements te, jc2 {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f118252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd0 f118253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f118254c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f118260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f118261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f118262k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public dc2 f118265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public xk1 f118266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public xk1 f118267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public xk1 f118268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public yv0 f118269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public yv0 f118270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public yv0 f118271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f118272u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f118273v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f118274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f118275x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f118276y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f118277z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e43 f118256e = new e43();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c43 f118257f = new c43();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f118259h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f118258g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f118255d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f118263l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f118264m = 0;

    public yk1(Context context, PlaybackSession playbackSession) {
        this.f118252a = context.getApplicationContext();
        this.f118254c = playbackSession;
        xd0 xd0Var = new xd0();
        this.f118253b = xd0Var;
        xd0Var.a(this);
    }

    public final boolean a(xk1 xk1Var) {
        String str;
        if (xk1Var == null) {
            return false;
        }
        String str2 = xk1Var.f117848c;
        xd0 xd0Var = this.f118253b;
        synchronized (xd0Var) {
            str = xd0Var.f117802g;
        }
        return str2.equals(str);
    }

    public final void b(re reVar, String str) {
        kl1 kl1Var = reVar.f115413d;
        if ((kl1Var == null || !kl1Var.a()) && str.equals(this.f118260i)) {
            a();
        }
        this.f118258g.remove(str);
        this.f118259h.remove(str);
    }

    public final void a() {
        PlaybackMetrics.Builder builder = this.f118261j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f118277z);
            this.f118261j.setVideoFramesDropped(this.f118275x);
            this.f118261j.setVideoFramesPlayed(this.f118276y);
            Long l10 = (Long) this.f118258g.get(this.f118260i);
            this.f118261j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f118259h.get(this.f118260i);
            this.f118261j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f118261j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f118254c.reportPlaybackMetrics(this.f118261j.build());
        }
        this.f118261j = null;
        this.f118260i = null;
        this.f118277z = 0;
        this.f118275x = 0;
        this.f118276y = 0;
        this.f118269r = null;
        this.f118270s = null;
        this.f118271t = null;
        this.A = false;
    }

    public final void a(f43 f43Var, kl1 kl1Var) {
        int iA;
        PlaybackMetrics.Builder builder = this.f118261j;
        if (kl1Var == null || (iA = f43Var.a(kl1Var.f109962a)) == -1) {
            return;
        }
        int i10 = 0;
        f43Var.a(iA, this.f118257f, false);
        f43Var.a(this.f118257f.f109216d, this.f118256e, 0L);
        mk1 mk1Var = this.f118256e.f110189d.f115475c;
        if (mk1Var != null) {
            int iA2 = w83.a(mk1Var.f113131a, mk1Var.f113132b);
            i10 = iA2 != 0 ? iA2 != 1 ? iA2 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        e43 e43Var = this.f118256e;
        if (e43Var.f110200o != -9223372036854775807L && !e43Var.f110198m && !e43Var.f110195j && !e43Var.a()) {
            builder.setMediaDurationMillis(w83.b(this.f118256e.f110200o));
        }
        builder.setPlaybackType(this.f118256e.a() ? 2 : 1);
        this.A = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.qc2 r25, yads.se r26) {
        /*
            Method dump skipped, instruction units count: 1802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yk1.a(yads.qc2, yads.se):void");
    }

    public final void a(re reVar, String str) {
        kl1 kl1Var = reVar.f115413d;
        if (kl1Var == null || !kl1Var.a()) {
            a();
            this.f118260i = str;
            this.f118261j = androidx.media3.exoplayer.analytics.o3.a().setPlayerName(ExoPlayerLibraryInfo.TAG).setPlayerVersion("2.18.1");
            a(reVar.f115411b, reVar.f115413d);
        }
    }

    public final void a(int i10, long j10, yv0 yv0Var, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = androidx.media3.exoplayer.analytics.l3.a(i10).setTimeSinceCreatedMillis(j10 - this.f118255d);
        if (yv0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    i12 = i11 != 3 ? 1 : 4;
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = yv0Var.f118397l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = yv0Var.f118398m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = yv0Var.f118395j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = yv0Var.f118394i;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = yv0Var.f118403r;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = yv0Var.f118404s;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = yv0Var.f118411z;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = yv0Var.A;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = yv0Var.f118389d;
            if (str4 != null) {
                int i18 = w83.f117341a;
                String[] strArrSplit = str4.split(TokenBuilder.TOKEN_DELIMITER, -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = yv0Var.f118405t;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f118254c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
