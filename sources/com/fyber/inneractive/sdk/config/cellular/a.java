package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.z0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f20327a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f20329c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f20328b = z0.UNKNOWN;

    public a(Context context) {
        this.f20327a = e.a(context);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(z0 z0Var) {
        this.f20328b = z0Var;
        for (h hVar : this.f20329c) {
            if (hVar != null) {
                hVar.a(this.f20328b);
            }
        }
    }
}
