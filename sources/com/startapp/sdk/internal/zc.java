package com.startapp.sdk.internal;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f65694b;

    public zc(Context context) {
        Context contextA = x0.a(context);
        this.f65693a = contextA != null ? contextA : context;
        this.f65694b = new ArrayList();
    }
}
