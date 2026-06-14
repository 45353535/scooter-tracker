package pe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f98281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f98282b;

    public j(a hook, Object obj) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        this.f98281a = hook;
        this.f98282b = obj;
    }

    public final void a(ie.c client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f98281a.a(client, this.f98282b);
    }
}
