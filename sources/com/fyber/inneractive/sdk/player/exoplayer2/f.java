package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f22642a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Looper looper) {
        super(looper);
        this.f22642a = gVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        g gVar = this.f22642a;
        gVar.getClass();
        switch (message.what) {
            case 0:
                gVar.f22654l--;
                return;
            case 1:
                gVar.f22652j = message.arg1;
                Iterator it = gVar.f22647e.iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).a(gVar.f22652j, gVar.f22651i);
                }
                return;
            case 2:
                Iterator it2 = gVar.f22647e.iterator();
                while (it2.hasNext()) {
                    ((b0) it2.next()).getClass();
                }
                return;
            case 3:
                if (gVar.f22654l == 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j) message.obj;
                    gVar.f22650h = true;
                    z zVar = jVar.f22937a;
                    gVar.f22657o = jVar.f22938b;
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i iVar = gVar.f22643a;
                    Object obj = jVar.f22939c;
                    ((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g) iVar).getClass();
                    Iterator it3 = gVar.f22647e.iterator();
                    while (it3.hasNext()) {
                        ((b0) it3.next()).getClass();
                    }
                    return;
                }
                return;
            case 4:
                int i10 = gVar.f22653k - 1;
                gVar.f22653k = i10;
                if (i10 == 0) {
                    gVar.f22659q = (i) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = gVar.f22647e.iterator();
                        while (it4.hasNext()) {
                            ((b0) it4.next()).getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (gVar.f22653k == 0) {
                    gVar.f22659q = (i) message.obj;
                    Iterator it5 = gVar.f22647e.iterator();
                    while (it5.hasNext()) {
                        ((b0) it5.next()).getClass();
                    }
                    return;
                }
                return;
            case 6:
                k kVar = (k) message.obj;
                gVar.f22653k -= kVar.f22690d;
                if (gVar.f22654l == 0) {
                    gVar.f22655m = kVar.f22687a;
                    gVar.f22656n = kVar.f22688b;
                    gVar.f22659q = kVar.f22689c;
                    Iterator it6 = gVar.f22647e.iterator();
                    while (it6.hasNext()) {
                        ((b0) it6.next()).getClass();
                    }
                    return;
                }
                return;
            case 7:
                s sVar = (s) message.obj;
                if (gVar.f22658p.equals(sVar)) {
                    return;
                }
                gVar.f22658p = sVar;
                Iterator it7 = gVar.f22647e.iterator();
                while (it7.hasNext()) {
                    ((b0) it7.next()).getClass();
                }
                return;
            case 8:
                d dVar = (d) message.obj;
                for (b0 b0Var : gVar.f22647e) {
                    com.fyber.inneractive.sdk.player.controller.f fVar = (com.fyber.inneractive.sdk.player.controller.f) b0Var.f21485a.get();
                    if (fVar != null && (dVar.getCause() instanceof com.fyber.inneractive.sdk.player.exoplayer2.audio.n) && (b0Var.f21486b || (fVar.D && fVar.A))) {
                        fVar.f21503v = true;
                        g gVar2 = fVar.f21500s;
                        if (gVar2 != null) {
                            gVar2.f22646d.d();
                            gVar2.f22645c.removeCallbacksAndMessages(null);
                            fVar.f21500s = null;
                        }
                        fVar.a(false);
                        fVar.a(fVar.C);
                        fVar.f21530i.post(new com.fyber.inneractive.sdk.player.controller.k(fVar, false));
                    } else if (fVar == null || !fVar.A || b0Var.f21486b || !com.fyber.inneractive.sdk.player.cache.n.f21474f.f21477c || !com.fyber.inneractive.sdk.util.s.a() || fVar.E >= fVar.f21497p) {
                        com.fyber.inneractive.sdk.player.mediaplayer.o oVar = new com.fyber.inneractive.sdk.player.mediaplayer.o(dVar, dVar.getCause() == null ? "empty" : dVar.getCause().getMessage());
                        IAlog.a("%sonPlayerError called with %s for sendErrorState", b0Var.a(), oVar);
                        com.fyber.inneractive.sdk.player.controller.f fVar2 = (com.fyber.inneractive.sdk.player.controller.f) com.fyber.inneractive.sdk.util.v.a(b0Var.f21485a);
                        if (fVar2 != null) {
                            fVar2.a(com.fyber.inneractive.sdk.player.enums.b.Error);
                            IAlog.a("%sonPlayerError called with: %s for onPlayerError", IAlog.a(fVar2), oVar);
                            fVar2.f21530i.post(new com.fyber.inneractive.sdk.player.controller.j(fVar2, oVar));
                            fVar2.k();
                        }
                    } else {
                        g gVar3 = fVar.f21500s;
                        if (gVar3 != null) {
                            gVar3.f22646d.d();
                            gVar3.f22645c.removeCallbacksAndMessages(null);
                            fVar.f21500s = null;
                        }
                        fVar.a(true);
                        fVar.a(fVar.C);
                        fVar.E++;
                        fVar.f21530i.post(new com.fyber.inneractive.sdk.player.controller.k(fVar, true));
                    }
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
