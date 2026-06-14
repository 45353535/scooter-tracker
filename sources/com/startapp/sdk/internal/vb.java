package com.startapp.sdk.internal;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f65393a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f65394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f65395c;

    public vb(lb lbVar, lb lbVar2) {
        this.f65394b = lbVar;
        this.f65395c = lbVar2;
    }

    public final ub a(String str) {
        if (this.f65393a.containsKey(str)) {
            return (ub) this.f65393a.get(str);
        }
        ub ubVar = new ub(new d9(this.f65394b, this.f65395c));
        this.f65393a.put(str, ubVar);
        return ubVar;
    }
}
