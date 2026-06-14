package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f21519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f21520b;

    public m(q qVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.f21520b = qVar;
        this.f21519a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar;
        com.fyber.inneractive.sdk.player.enums.b bVar;
        try {
            try {
                Iterator it = this.f21520b.f21523b.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a(this.f21519a);
                }
                bVar = this.f21519a;
            } catch (Exception e10) {
                if (IAlog.f23840a <= 3) {
                    q qVar2 = this.f21520b;
                    qVar2.getClass();
                    IAlog.a("%sonPlayerStateChanged callback threw an exception!", e10, IAlog.a(qVar2));
                }
                com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f21519a;
                if (bVar2 != com.fyber.inneractive.sdk.player.enums.b.Idle && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    return;
                }
                com.fyber.inneractive.sdk.util.v.a(this.f21520b.f21531j);
                qVar = this.f21520b;
                qVar.f21531j = null;
            }
            if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Error) {
                com.fyber.inneractive.sdk.util.v.a(this.f21520b.f21531j);
                qVar = this.f21520b;
                qVar.f21531j = null;
                qVar.f21532k = null;
            }
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.player.enums.b bVar3 = this.f21519a;
            if (bVar3 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar3 == com.fyber.inneractive.sdk.player.enums.b.Error) {
                com.fyber.inneractive.sdk.util.v.a(this.f21520b.f21531j);
                q qVar3 = this.f21520b;
                qVar3.f21531j = null;
                qVar3.f21532k = null;
            }
            throw th2;
        }
    }
}
