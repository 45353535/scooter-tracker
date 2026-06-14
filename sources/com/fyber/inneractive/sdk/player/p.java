package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements com.fyber.inneractive.sdk.player.controller.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.measurement.f f23323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23324b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23325c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23326d = false;

    public p(com.fyber.inneractive.sdk.measurement.f fVar) {
        this.f23323a = fVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z10) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("MeasurementHelper onPlayerStateChanged=%s mBuffering=%s mPrepared=%s", bVar, String.valueOf(this.f23324b), String.valueOf(this.f23326d));
        if (this.f23323a != null) {
            int i10 = o.f23322a[bVar.ordinal()];
            if (i10 == 1) {
                this.f23326d = true;
                return;
            }
            if (i10 == 2) {
                if (this.f23326d) {
                    com.fyber.inneractive.sdk.measurement.f fVar = this.f23323a;
                    if (fVar.f21106c != null) {
                        IAlog.a("%s bufferStart", "OMVideo");
                        try {
                            fVar.f21106c.bufferStart();
                        } catch (Throwable th2) {
                            fVar.a(th2);
                        }
                    }
                    this.f23324b = true;
                    return;
                }
                return;
            }
            if (i10 != 3) {
                if (i10 == 4) {
                    com.fyber.inneractive.sdk.measurement.f fVar2 = this.f23323a;
                    if (fVar2.f21106c != null) {
                        IAlog.a("%s pause", "OMVideo");
                        try {
                            fVar2.f21106c.pause();
                        } catch (Throwable th3) {
                            fVar2.a(th3);
                        }
                    }
                    this.f23325c = true;
                    return;
                }
                if (i10 != 5) {
                    return;
                }
                com.fyber.inneractive.sdk.measurement.f fVar3 = this.f23323a;
                if (fVar3.f21106c != null) {
                    IAlog.a("%s complete", "OMVideo");
                    try {
                        fVar3.f21106c.complete();
                        return;
                    } catch (Throwable th4) {
                        fVar3.a(th4);
                        return;
                    }
                }
                return;
            }
            if (this.f23324b) {
                this.f23324b = false;
                com.fyber.inneractive.sdk.measurement.f fVar4 = this.f23323a;
                if (fVar4.f21106c != null) {
                    IAlog.a("%s bufferEnd", "OMVideo");
                    try {
                        fVar4.f21106c.bufferFinish();
                        return;
                    } catch (Throwable th5) {
                        fVar4.a(th5);
                        return;
                    }
                }
                return;
            }
            if (this.f23325c) {
                com.fyber.inneractive.sdk.measurement.f fVar5 = this.f23323a;
                if (fVar5.f21106c != null) {
                    IAlog.a("%s resume", "OMVideo");
                    try {
                        fVar5.f21106c.resume();
                    } catch (Throwable th6) {
                        fVar5.a(th6);
                    }
                }
                this.f23325c = false;
            }
        }
    }
}
