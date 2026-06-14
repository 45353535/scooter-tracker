package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4169y1 extends AbstractC4048t5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f39968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActivityManager f39971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ea f39972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4169y1(Context context, C4073u5 listener, long j10, int i10) {
        super(listener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f39968b = context;
        this.f39969c = j10;
        this.f39970d = i10;
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.f39971e = (ActivityManager) systemService;
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        this.f39972f = Da.a(context, "appClose");
    }

    @Override // com.inmobi.media.AbstractC4048t5
    public final void a() {
        AbstractC3790il.a(new C4144x1(this, null));
    }

    @Override // com.inmobi.media.AbstractC4048t5
    public final void b() {
    }
}
