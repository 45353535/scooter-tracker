package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[] f22621b;

    public x(List list) {
        this.f22620a = list;
        this.f22621b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[list.size()];
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        for (int i10 = 0; i10 < this.f22621b.length; i10++) {
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f22453d, 3);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = (com.fyber.inneractive.sdk.player.exoplayer2.o) this.f22620a.get(i10);
            String str = oVar.f22793f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = oVar.f22788a;
            if (str2 == null) {
                e0Var.b();
                str2 = e0Var.f22454e;
            }
            gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str2, str, oVar.f22811x, oVar.f22812y, oVar.f22813z, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
            this.f22621b[i10] = gVarA;
        }
    }
}
