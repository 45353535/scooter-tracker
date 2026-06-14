package com.airbnb.lottie;

import android.os.Build;
import d0.u;
import java.util.HashSet;

/* JADX INFO: loaded from: classes5.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f7350a = new HashSet();

    p() {
    }

    public boolean a(u uVar, boolean z10) {
        if (!z10) {
            return this.f7350a.remove(uVar);
        }
        if (Build.VERSION.SDK_INT >= uVar.f68387b) {
            return this.f7350a.add(uVar);
        }
        q0.g.c(String.format("%s is not supported pre SDK %d", uVar.name(), Integer.valueOf(uVar.f68387b)));
        return false;
    }

    public boolean b(u uVar) {
        return this.f7350a.contains(uVar);
    }
}
