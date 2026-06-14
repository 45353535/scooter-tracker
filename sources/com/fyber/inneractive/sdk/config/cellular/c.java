package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f20333d;

    public c(Context context) {
        super(context);
        this.f20333d = new b(this.f20334a, this);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a(a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20336c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.add(aVar);
            } catch (Throwable th2) {
                IAlog.a("failed to add networkUpdateListener", th2, new Object[0]);
            }
        }
        this.f20333d.b();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a(h hVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20336c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.remove(hVar);
            } catch (Throwable th2) {
                IAlog.a("failed to remove networkUpdateListener", th2, new Object[0]);
            }
        }
        this.f20333d.c();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a() {
        this.f20333d.a();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20336c;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.f20336c = null;
        }
    }
}
