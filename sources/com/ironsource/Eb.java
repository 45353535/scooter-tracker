package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f40731d;

    public Eb(@NotNull JSONObject applicationLogger) {
        Intrinsics.checkNotNullParameter(applicationLogger, "applicationLogger");
        this.f40728a = applicationLogger.optInt(Fb.f40907a, 3);
        this.f40729b = applicationLogger.optInt(Fb.f40908b, 3);
        this.f40730c = applicationLogger.optInt("console", 3);
        this.f40731d = applicationLogger.optBoolean(Fb.f40910d, false);
    }

    public final int a() {
        return this.f40730c;
    }

    public final int b() {
        return this.f40729b;
    }

    public final int c() {
        return this.f40728a;
    }

    public final boolean d() {
        return this.f40731d;
    }
}
