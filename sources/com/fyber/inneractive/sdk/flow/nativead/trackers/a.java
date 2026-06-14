package com.fyber.inneractive.sdk.flow.nativead.trackers;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.web.m;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0 f20840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f20841b;

    public a(w0 w0Var) {
        this.f20840a = w0Var;
    }

    public final void a(c cVar) {
        for (String str : this.f20840a.f21033w) {
            if (!TextUtils.isEmpty(str)) {
                IAlog.a("%sHitting URL: %s", IAlog.a(this), str);
                z0.b(str);
            }
        }
        b bVar = new b(this.f20840a.f21034x, cVar);
        this.f20841b = bVar;
        if (bVar.f20846d == null || bVar.f20845c == null) {
            IAlog.b("%sWas destroyed, create a new instance", b.f20842e);
        } else {
            bVar.a();
        }
    }

    public final void a() {
        b bVar = this.f20841b;
        if (bVar != null) {
            IAlog.a("%sDestroy called", b.f20842e);
            Handler handler = bVar.f20846d;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                bVar.f20846d = null;
            }
            m mVar = bVar.f20845c;
            if (mVar != null) {
                v.a(mVar);
                mVar.destroy();
                bVar.f20845c = null;
            }
            bVar.f20844b = null;
            this.f20841b = null;
        }
        this.f20840a = null;
    }
}
