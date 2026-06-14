package com.facebook.appevents;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f19654a = new HashMap();

    private final synchronized r0 e(a aVar) {
        Context contextM;
        com.facebook.internal.a aVarE;
        r0 r0Var = (r0) this.f19654a.get(aVar);
        if (r0Var == null && (aVarE = com.facebook.internal.a.f19837f.e((contextM = com.facebook.s.m()))) != null) {
            r0Var = new r0(aVarE, o.f19698b.b(contextM));
        }
        if (r0Var == null) {
            return null;
        }
        this.f19654a.put(aVar, r0Var);
        return r0Var;
    }

    public final synchronized void a(a accessTokenAppIdPair, d appEvent) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        Intrinsics.checkNotNullParameter(appEvent, "appEvent");
        r0 r0VarE = e(accessTokenAppIdPair);
        if (r0VarE != null) {
            r0VarE.a(appEvent);
        }
    }

    public final synchronized void b(q0 q0Var) {
        if (q0Var == null) {
            return;
        }
        for (Map.Entry entry : q0Var.d()) {
            r0 r0VarE = e((a) entry.getKey());
            if (r0VarE != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    r0VarE.a((d) it.next());
                }
            }
        }
    }

    public final synchronized r0 c(a accessTokenAppIdPair) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        return (r0) this.f19654a.get(accessTokenAppIdPair);
    }

    public final synchronized int d() {
        int iC;
        Iterator it = this.f19654a.values().iterator();
        iC = 0;
        while (it.hasNext()) {
            iC += ((r0) it.next()).c();
        }
        return iC;
    }

    public final synchronized Set f() {
        Set setKeySet;
        setKeySet = this.f19654a.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "stateMap.keys");
        return setKeySet;
    }
}
