package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.o f20660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20661b;

    public h() {
        com.fyber.inneractive.sdk.config.o oVar = IAConfigManager.O.f20315u.f20484b;
        this.f20660a = oVar;
        this.f20661b = oVar.a("vast_endcard_x_delay", 5, 0);
    }

    public final void a(b bVar, boolean z10) {
        if (bVar == null) {
            IAlog.a("%sapplyVastCompanionEndCardTime was called with a null endcard", IAlog.a(this));
        } else {
            bVar.f20651f = bVar.k() ? z10 ? this.f20660a.b("d_e_pl_dl_pl", this.f20661b, 0) : this.f20660a.b("d_e_pl", this.f20661b, 0) : z10 ? this.f20660a.b("d_e_npl_dl_npl", this.f20661b, 0) : this.f20660a.b("d_e_npl", this.f20661b, 0);
        }
    }

    public final void a(b bVar, boolean z10, boolean z11) {
        int iB;
        if (bVar == null) {
            IAlog.a("%sapplyNonVastCompanionEndCardTime was called with a null endcard", IAlog.a(this));
            return;
        }
        if (!z10) {
            iB = this.f20660a.b("d_e_def", this.f20661b, 0);
        } else if (z11) {
            iB = this.f20660a.b("d_e_pl_dl_dl", this.f20661b, 0);
        } else {
            iB = this.f20660a.b("d_e_npl_dl_dl", this.f20661b, 0);
        }
        bVar.f20651f = iB;
    }
}
