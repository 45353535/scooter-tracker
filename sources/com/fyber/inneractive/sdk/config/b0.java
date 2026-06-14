package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.i1;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f20324a;

    public b0(IAConfigManager iAConfigManager) {
        this.f20324a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        int i10;
        h0 h0Var = (h0) obj;
        if (h0Var != null) {
            if (z10) {
                IAConfigManager iAConfigManager = this.f20324a;
                IAConfigManager iAConfigManager2 = IAConfigManager.O;
                iAConfigManager.getClass();
                iAConfigManager.f20299e = h0Var.f20403c;
                iAConfigManager.f20298d = h0Var.f20402b;
                iAConfigManager.f20295a = h0Var.f20404d;
                iAConfigManager.f20296b = h0Var.f20405e;
            } else {
                IAConfigManager.P = System.currentTimeMillis();
                IAConfigManager iAConfigManager3 = this.f20324a;
                iAConfigManager3.getClass();
                IAlog.a("Got new remote configuration from server:", new Object[0]);
                iAConfigManager3.f20299e = h0Var.f20403c;
                iAConfigManager3.f20298d = h0Var.f20402b;
                iAConfigManager3.f20295a = h0Var.f20404d;
                iAConfigManager3.f20296b = h0Var.f20405e;
            }
        } else if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            IAConfigManager.P = System.currentTimeMillis();
        }
        if (z10) {
            return;
        }
        IAConfigManager iAConfigManager4 = this.f20324a;
        IAConfigManager iAConfigManager5 = IAConfigManager.O;
        if (iAConfigManager5.f20299e != null) {
            iAConfigManager4.a(null);
        } else {
            iAConfigManager4.getClass();
            if ((exc instanceof InvalidAppIdException) || (exc instanceof FileNotFoundException) || (!(exc instanceof k1) ? !TextUtils.isEmpty(iAConfigManager4.f20297c.trim()) : (i10 = ((k1) exc).f21327a) < 400 || i10 >= 500)) {
                iAConfigManager4.a(new InvalidAppIdException());
            } else if (exc instanceof com.fyber.inneractive.sdk.network.b) {
                iAConfigManager4.a(exc);
            } else {
                iAConfigManager4.a(new i0());
            }
        }
        if (iAConfigManager5.f20299e != null) {
            IAConfigManager iAConfigManager6 = this.f20324a;
            if (iAConfigManager6.C == null) {
                iAConfigManager6.C = new com.fyber.inneractive.sdk.network.v0(new e0(iAConfigManager6), iAConfigManager6.f20300f, new com.fyber.inneractive.sdk.config.global.m());
            }
            i1 i1Var = iAConfigManager6.C.f21379f;
            if (i1Var == i1.RUNNING || i1Var == i1.QUEUED) {
                return;
            }
            iAConfigManager5.f20313s.a(iAConfigManager6.C);
        }
    }
}
