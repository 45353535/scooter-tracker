package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends q {
    public final boolean A;
    public final CopyOnWriteArrayList B;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u C;
    public boolean D;
    public int E;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f21497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f21498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f21499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.g f21500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21502u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21503v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.a[] f21504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Handler f21505x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b0 f21506y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f21507z;

    public f(Context context, boolean z10, com.fyber.inneractive.sdk.config.global.r rVar) {
        Integer numA;
        super(context);
        this.f21501t = 0;
        this.f21502u = 0;
        this.f21503v = false;
        this.f21507z = false;
        this.B = new CopyOnWriteArrayList();
        this.C = null;
        this.E = 0;
        this.A = z10;
        this.f21498q = rVar;
        this.f21499r = IAConfigManager.O.f20315u.f20484b.a("extractor_source_retry_count", 6, 3);
        com.fyber.inneractive.sdk.config.global.features.u uVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class) : null;
        this.f21497p = (uVar == null || (numA = uVar.a("max_tries")) == null) ? 0 : numA.intValue();
        IAlog.a("Creating IAExoPlayer2Controller", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a() {
        if (this.f21500s != null) {
            if (!this.f21507z) {
                this.f21507z = true;
                com.fyber.inneractive.sdk.util.r.f23895a.execute(new e(this));
            }
            b0 b0Var = this.f21506y;
            if (b0Var != null) {
                b0Var.f21485a.clear();
            }
            this.f21506y = null;
        }
        Iterator it = this.B.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.B.clear();
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void b(boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        this.f21535n = z10;
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f21504w;
        if (aVarArr == null || (gVar = this.f21500s) == null || this.f21507z || aVarArr.length < 2) {
            return;
        }
        gVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[1], 2, Float.valueOf(0.0f)));
        this.f21503v = true;
        c(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int c() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f21500s;
        if (gVar == null || this.f21507z) {
            return 0;
        }
        return (int) (gVar.f22655m.c() ? -9223372036854775807L : com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f22655m.a(gVar.a(), gVar.f22648f).f23249f));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void d(boolean z10) {
        this.f21535n = z10;
        if (this.f21500s == null || this.f21507z) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f21522a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f10 = streamVolume / streamMaxVolume;
        IAlog.a(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f10));
        if (streamVolume == 0) {
            IAlog.a("Avoided unmute - Device is muted", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f21504w;
        if (aVarArr != null && aVarArr.length >= 2) {
            this.f21500s.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[1], 2, Float.valueOf(f10)));
        }
        this.f21503v = false;
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int e() {
        return this.f21502u;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int f() {
        return this.f21501t;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean g() {
        return this.f21503v;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean h() {
        return (this.f21500s == null || this.f21507z || this.f21526e != com.fyber.inneractive.sdk.player.enums.b.Playing) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void i() {
        com.fyber.inneractive.sdk.player.enums.b bVar;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f21526e;
        if (bVar2 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar2 == (bVar = com.fyber.inneractive.sdk.player.enums.b.Paused) || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            IAlog.a("%s paused called when player is in mState: %s ignoring", IAlog.a(this), bVar2);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f21500s;
        if (gVar != null && !this.f21507z) {
            gVar.a(false);
        }
        k();
        a(bVar);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void j() {
        IAlog.a("%sstart called", IAlog.a(this));
        if (h()) {
            return;
        }
        a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
        this.f21500s.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int b() {
        long jA;
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f21500s;
        if (gVar == null || this.f21507z) {
            return 0;
        }
        if (!gVar.f22655m.c() && gVar.f22653k <= 0) {
            gVar.f22655m.a(gVar.f22659q.f22681a, gVar.f22649g, false);
            jA = com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f22659q.f22683c) + com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f22649g.f23174e);
        } else {
            jA = gVar.f22661s;
        }
        return (int) jA;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final String d() {
        return this.A ? "exo_c" : "exo";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i10, boolean z10) {
        IAlog.a("%sseekTo called with %d playAfterSeek = %s", IAlog.a(this), Integer.valueOf(i10), Boolean.valueOf(z10));
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f21500s;
        if (gVar == null || this.f21507z) {
            return;
        }
        gVar.a(z10);
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.f21500s;
        gVar2.a(gVar2.a(), i10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(Surface surface) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        IAlog.a("%ssetSurface called with %s", IAlog.a(this), surface);
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f21504w;
        if (aVarArr == null || (gVar = this.f21500s) == null || this.f21507z) {
            return;
        }
        gVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[0], 1, surface));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(boolean z10) {
        if (this.f21500s != null || this.f21507z) {
            return;
        }
        this.D = z10;
        IAlog.a("%sMediaPlayerController: creating media player", IAlog.a(this));
        b0 b0Var = this.f21506y;
        if (b0Var != null) {
            b0Var.f21485a.clear();
        }
        this.f21506y = new b0(this);
        this.f21505x = new Handler(Looper.getMainLooper());
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.a[z10 ? 2 : 1];
        this.f21504w = aVarArr;
        aVarArr[0] = new MediaCodecVideoRenderer(this.f21505x, this.f21506y);
        if (z10) {
            this.f21504w[1] = new MediaCodecAudioRenderer();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.g(this.f21504w, new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d(), new com.fyber.inneractive.sdk.player.exoplayer2.c());
        this.f21500s = gVar;
        gVar.f22647e.add(this.f21506y);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    @Override // com.fyber.inneractive.sdk.player.controller.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r13, int r14) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.f.a(java.lang.String, int):void");
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f21500s;
        if (gVar == null || uVar == null) {
            return;
        }
        if (!gVar.f22655m.c() || gVar.f22656n != null) {
            gVar.f22655m = com.fyber.inneractive.sdk.player.exoplayer2.x.f23251a;
            gVar.f22656n = null;
            Iterator it = gVar.f22647e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).getClass();
            }
        }
        if (gVar.f22650h) {
            gVar.f22650h = false;
            int i10 = com.fyber.inneractive.sdk.player.exoplayer2.source.z.f22916d;
            gVar.f22657o = gVar.f22644b;
            ((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g) gVar.f22643a).getClass();
            Iterator it2 = gVar.f22647e.iterator();
            while (it2.hasNext()) {
                ((b0) it2.next()).getClass();
            }
        }
        gVar.f22654l++;
        gVar.f22646d.f22696f.obtainMessage(0, 1, 0, uVar).sendToTarget();
        a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
    }
}
