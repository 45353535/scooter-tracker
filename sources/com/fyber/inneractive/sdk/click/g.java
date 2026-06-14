package com.fyber.inneractive.sdk.click;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.g0;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.v0;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v0 f20261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f20263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f20264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g f20265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20266f = false;

    public g(f fVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        this.f20263c = fVar;
        this.f20264d = g1Var;
        this.f20265e = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        v0 v0Var;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        if (rVar != null) {
            mVar = rVar.f20293l;
            this.f20262b = rVar.f20292k;
            this.f20261a = rVar.f20291j;
        } else {
            mVar = mVar2;
        }
        return mVar != mVar2 && IAConfigManager.O.E.n() && (v0Var = this.f20261a) != null && v0Var.f24061l;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void cancel() {
        this.f20266f = true;
        this.f20263c = null;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final b a(Context context, Uri uri, List list) {
        d0 d0Var;
        v0 v0Var = this.f20261a;
        if (v0Var != null) {
            boolean z10 = this.f20262b;
            if (v0Var.C) {
                g0 g0Var = g0.FAILED;
                IllegalStateException illegalStateException = new IllegalStateException("Store controller is already open");
                context.getClass();
                d0Var = new d0(g0Var, illegalStateException);
            } else {
                v0Var.C = true;
                try {
                    context.getClass();
                } catch (Throwable unused) {
                }
                v0Var.D = true;
                if (v0Var.f24059j.equals("invalid_task_id") && !v0Var.f24075z) {
                    v0Var.f24053d = z10 ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
                }
                v0Var.B = z10;
                if (v0Var.A) {
                    v0Var.d("onInstallationSuccess();");
                } else if (!v0Var.f24075z) {
                    String str = v0Var.f24052c;
                    PackageInfo packageInfo = !TextUtils.isEmpty(str) ? com.fyber.inneractive.sdk.util.o.f23888a.getPackageManager().getPackageInfo(str, 0) : null;
                    if (packageInfo != null) {
                        v0Var.d("onInstallationSuccess();");
                    } else if (z10) {
                        v0Var.f24051b.a(v0Var.f24052c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f24055f, v0Var.f24053d, v0Var.f24057h.f20988a));
                        v0Var.d("onShowInstallStarted();");
                    }
                }
                try {
                    InternalStoreWebpageActivity.startActivity(context, v0Var.f24054e);
                    d0Var = new d0(g0.OPENED_INTERNAL_STORE, null);
                } catch (ActivityNotFoundException e10) {
                    d0Var = new d0(g0.FAILED, e10);
                }
            }
            Throwable th2 = d0Var.f23862b;
            if (th2 == null) {
                IAConfigManager.O.f20313s.a(new h1(new e(this, list, uri), uri.toString()));
                return new b(uri.toString(), q.OPEN_INTERNAL_STORE, "IgniteGooglePlay", null);
            }
            if (list != null) {
                list.add(new j(this.f20261a.f24060k, false, q.OPEN_INTERNAL_STORE, th2.toString()));
            }
            return r.a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController.show has failed");
        }
        return r.a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController is null");
    }
}
