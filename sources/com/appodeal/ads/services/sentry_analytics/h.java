package com.appodeal.ads.services.sentry_analytics;

import io.sentry.protocol.b0;
import io.sentry.protocol.c0;
import io.sentry.protocol.k0;
import io.sentry.protocol.s;
import io.sentry.w6;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f14754a = new DecimalFormat("#.##");

    public static final boolean a(w6 w6Var, g gVar) {
        List<b0> listD;
        List<s> listR0 = w6Var.r0();
        if (listR0 == null || listR0.isEmpty()) {
            return false;
        }
        for (s sVar : listR0) {
            Intrinsics.checkNotNull(sVar);
            if (b(sVar.h(), gVar)) {
                return true;
            }
            c0 c0VarI = sVar.i();
            if (c0VarI != null && (listD = c0VarI.d()) != null && !listD.isEmpty()) {
                for (b0 b0Var : listD) {
                    Intrinsics.checkNotNull(b0Var);
                    if (b(b0Var.v(), gVar) || b(b0Var.w(), gVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean b(String str, g gVar) {
        return str != null && StringsKt.e0(str, gVar.f14753b, true);
    }

    public static final boolean c(List list, g gVar, int i10) {
        String strM;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k0 k0Var = (k0) it.next();
                if (Intrinsics.areEqual(k0Var.n(), "visible") && (strM = k0Var.m()) != null && StringsKt.g0(strM, gVar.f14753b, false, 2, null)) {
                    return true;
                }
                if (i10 > 0 && c(k0Var.l(), gVar, i10 - 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
