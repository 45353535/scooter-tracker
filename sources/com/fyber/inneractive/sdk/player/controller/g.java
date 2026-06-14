package com.fyber.inneractive.sdk.player.controller;

import android.media.AudioManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends z implements com.fyber.inneractive.sdk.flow.storepromo.loader.b {
    public boolean A;
    public final boolean B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f21510z;

    public g(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z10, boolean z11, String str) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        super(fVar, sVar, s0Var, rVar, z10, str);
        this.f21510z = false;
        this.A = false;
        com.fyber.inneractive.sdk.player.f fVar2 = this.f21547a;
        if (fVar2 != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar2).f23320v) != null) {
            bVar.f20877e = this;
        }
        this.f21510z = false;
        this.B = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final boolean A() {
        return !this.f21510z;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void E() {
        q qVar;
        super.E();
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar == null || (qVar = fVar.f23252a) == null || qVar.f21526e != com.fyber.inneractive.sdk.player.enums.b.Completed || !this.f21510z) {
            return;
        }
        this.f21550d.m();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a() {
        if (!this.f21554h) {
            f();
            return;
        }
        if (this.f21550d.b()) {
            return;
        }
        this.f21550d.a(false);
        Runnable runnable = this.f21556j;
        if (runnable != null) {
            this.f21550d.removeCallbacks(runnable);
            this.f21556j = null;
        }
        E();
        D();
        this.f21557k = false;
        this.f21554h = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void b(boolean z10) {
        super.b(z10);
        if (this.f21510z) {
            this.f21550d.m();
            this.f21550d.g(false);
            this.f21552f = 0;
        }
        C();
        this.f21550d.e(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void f() {
        int ringerMode;
        int streamVolume;
        super.f();
        com.fyber.inneractive.sdk.player.f fVar = this.f21547a;
        if (fVar != null && fVar.f23252a != null && !this.A) {
            try {
                AudioManager audioManager = (AudioManager) this.f21550d.getContext().getSystemService("audio");
                ringerMode = audioManager.getRingerMode();
                try {
                    streamVolume = audioManager.getStreamVolume(2);
                } catch (Throwable unused) {
                    streamVolume = 0;
                }
            } catch (Throwable unused2) {
                ringerMode = 0;
            }
            if ((!this.f21510z && ((r0) this.f21548b).f20438f.f20492d.booleanValue()) || this.B || p()) {
                f(false);
            } else if (streamVolume > 0 && ringerMode == 2) {
                IAlog.a("%s setting default volume. unmuting player", IAlog.a(this));
                i(false);
            }
            this.f21550d.setMuteButtonState(p());
            this.A = true;
        }
        h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int i() {
        return IAConfigManager.O.f20315u.f20484b.a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.fyber.inneractive.sdk.player.controller.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o() {
        /*
            r10 = this;
            com.fyber.inneractive.sdk.config.global.r r0 = r10.f21549c
            if (r0 == 0) goto L29
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.c> r1 = com.fyber.inneractive.sdk.config.global.features.c.class
            com.fyber.inneractive.sdk.config.global.features.h r0 = r0.a(r1)
            com.fyber.inneractive.sdk.config.global.features.c r0 = (com.fyber.inneractive.sdk.config.global.features.c) r0
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.HashMap r0 = r0.f20380c
            java.util.Collection r0 = r0.values()
            r2.<init>(r0)
            int r0 = r2.size()
            if (r0 <= 0) goto L29
            com.fyber.inneractive.sdk.config.global.r r0 = r10.f21549c
            com.fyber.inneractive.sdk.config.global.features.h r0 = r0.a(r1)
            com.fyber.inneractive.sdk.config.global.features.c r0 = (com.fyber.inneractive.sdk.config.global.features.c) r0
            goto L2a
        L29:
            r0 = 0
        L2a:
            r1 = 8
            r2 = 5
            r3 = -1
            if (r0 == 0) goto L45
            java.lang.String r4 = "skip_time_sec"
            java.lang.Integer r0 = r0.a(r4)
            if (r0 == 0) goto L3d
            int r0 = r0.intValue()
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 < 0) goto L43
            if (r0 > r1) goto L43
            goto L46
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            com.fyber.inneractive.sdk.config.IAConfigManager r4 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            com.fyber.inneractive.sdk.config.s r4 = r4.f20315u
            com.fyber.inneractive.sdk.config.o r4 = r4.f20484b
            com.fyber.inneractive.sdk.config.s0 r5 = r10.f21548b
            com.fyber.inneractive.sdk.config.enums.Skip r6 = r10.f21570x
            boolean r7 = com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()
            java.lang.String r8 = "vast_configuration"
            com.fyber.inneractive.sdk.config.l r4 = r4.a(r8)
            java.lang.String r8 = "skip_d"
            r4.getClass()
            java.util.HashMap r9 = r4.f20418a     // Catch: java.lang.Exception -> L74
            boolean r9 = r9.containsKey(r8)     // Catch: java.lang.Exception -> L74
            if (r9 == 0) goto L74
            java.util.HashMap r4 = r4.f20418a     // Catch: java.lang.Exception -> L74
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Exception -> L74
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L74
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L74
            goto L75
        L74:
            r4 = r3
        L75:
            int r4 = java.lang.Math.max(r4, r3)
            if (r6 != 0) goto L85
            if (r5 == 0) goto L85
            com.fyber.inneractive.sdk.config.r0 r5 = (com.fyber.inneractive.sdk.config.r0) r5
            com.fyber.inneractive.sdk.config.t0 r5 = r5.f20438f
            if (r5 == 0) goto L85
            com.fyber.inneractive.sdk.config.enums.Skip r6 = r5.f20496h
        L85:
            if (r7 == 0) goto La7
            if (r0 <= r3) goto L8d
            if (r0 > r1) goto L8d
            r2 = r0
            goto Lbd
        L8d:
            if (r4 <= r3) goto L92
            if (r4 > r1) goto L92
            goto Lab
        L92:
            java.lang.Integer r0 = r6.value()
            int r0 = r0.intValue()
            if (r0 <= r3) goto Lbd
            if (r0 > r1) goto Lbd
            java.lang.Integer r0 = r6.value()
            int r2 = r0.intValue()
            goto Lbd
        La7:
            if (r4 <= r3) goto Lad
            if (r4 > r2) goto Lad
        Lab:
            r2 = r4
            goto Lbd
        Lad:
            com.fyber.inneractive.sdk.config.enums.Skip r0 = com.fyber.inneractive.sdk.config.enums.Skip.DEFAULT
            if (r6 != r0) goto Lb5
            r2 = 99999(0x1869f, float:1.40128E-40)
            goto Lbd
        Lb5:
            java.lang.Integer r0 = r6.value()
            int r2 = r0.intValue()
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.g.o():int");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void r() {
        this.f21564r = true;
        IAlog.a("%s onBufferingTimeout reached. Skipping to end card", IAlog.a(this));
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void t() {
        g0 g0Var = this.f21553g;
        if (g0Var != null) {
            g0Var.j();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void v() {
        this.f21550d.g(true);
        C();
        h();
        f();
        h(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void x() {
        super.x();
        if (this.f21510z) {
            this.f21550d.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void b(g1 g1Var) {
        com.fyber.inneractive.sdk.player.ui.s sVar;
        TapAction tapAction = ((r0) this.f21548b).f20438f.f20497i;
        if (tapAction == TapAction.CTR) {
            a(false, VideoClickOrigin.VIDEO, g1Var);
            return;
        }
        if (tapAction != TapAction.FULLSCREEN && tapAction != TapAction.DO_NOTHING) {
            IAlog.a("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), tapAction);
            return;
        }
        if (((com.fyber.inneractive.sdk.config.global.features.u) this.f21549c.a(com.fyber.inneractive.sdk.config.global.features.u.class)).c().equals(com.fyber.inneractive.sdk.config.global.features.t.OPEN) || ((this.f21566t != com.fyber.inneractive.sdk.ignite.m.NONE && IAConfigManager.O.E.n()) || ((sVar = this.f21550d) != null && sVar.a()))) {
            a(false, VideoClickOrigin.VIDEO, g1Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a(boolean z10) {
        e(z10);
        super.a(z10);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.b
    public final void a(g1 g1Var) {
        a(11, g1Var);
    }
}
