package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class Co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f75640b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo f75641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yo f75642d;

    public Co(Context context) {
        this.f75639a = context;
        C5167ia c5167ia = new C5167ia(context, "appmetrica_vital.dat");
        this.f75641c = new yo(C5468ua.k().z(), c5167ia);
        this.f75642d = new yo(new C5068ef(C5112g7.a(context).d()), c5167ia);
    }

    public final yo a() {
        return this.f75641c;
    }

    public final yo b() {
        return this.f75642d;
    }
}
