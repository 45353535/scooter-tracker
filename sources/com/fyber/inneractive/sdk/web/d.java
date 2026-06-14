package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f23942a;

    public d(i1 i1Var) {
        this.f23942a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f23942a;
        if (iVar.f23980k) {
            IAlog.a("No user web action detected for : %s blocking.", iVar.f23981l);
            i iVar2 = this.f23942a;
            String strC = iVar2.f23981l.c();
            String strA = this.f23942a.f23981l.a();
            j1 j1Var = iVar2.f23976g;
            if (j1Var != null) {
                j1Var.a(strC, strA);
            }
            this.f23942a.f23981l.b();
            this.f23942a.i();
        } else {
            IAlog.a("User web action detected for: %s", iVar.f23981l);
            this.f23942a.f23981l.d();
        }
        this.f23942a.f23981l = null;
    }
}
