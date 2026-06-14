package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4620xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4441n0 f45825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f45826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45827c;

    public AbstractC4620xa(@NotNull C4441n0 adTools) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.f45825a = adTools;
        this.f45826b = "";
    }

    @NotNull
    public final C4441n0 a() {
        return this.f45825a;
    }

    @NotNull
    public final String b() {
        return this.f45826b;
    }

    protected final boolean c() {
        return this.f45827c;
    }

    public abstract boolean d();

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f45826b = str;
    }

    public final void b(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f45825a.e(callback);
    }

    protected final void a(boolean z10) {
        this.f45827c = z10;
    }

    public final void a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f45825a.d(runnable);
    }

    public final void a(@NotNull C4304f0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f45825a.e().a(new B0(this.f45825a, adProperties, null, 4, null));
    }
}
