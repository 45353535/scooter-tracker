package com.ironsource;

import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4473of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4473of f44574a = new C4473of();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Lazy f44575b = lf.i.a(a.f44576a);

    /* JADX INFO: renamed from: com.ironsource.of$a */
    static final class a extends Lambda implements Function0<C4250be> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f44576a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4250be invoke() {
            return new C4250be(16, null, null, 6, null);
        }
    }

    private C4473of() {
    }

    public final void a(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, null);
    }

    private final C4250be a() {
        return (C4250be) f44575b.getValue();
    }

    public static /* synthetic */ void a(C4473of c4473of, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4473of.a(runnable, j10);
    }

    public final void a(@NotNull Runnable action, long j10) {
        Intrinsics.checkNotNullParameter(action, "action");
        a().schedule(action, j10, TimeUnit.MILLISECONDS);
    }
}
