package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5290n6 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f77808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Zg f77809b;

    public C5290n6(@NotNull Context context, @NotNull InterfaceC5214k6 interfaceC5214k6, @NotNull EnumC5168ib enumC5168ib, @NotNull InterfaceC5074el interfaceC5074el, @NotNull Executor executor, @NotNull String str) {
        this.f77808a = executor;
        this.f77809b = new Zg(context, interfaceC5214k6, enumC5168ib, interfaceC5074el);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@Nullable File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f77808a;
        Zg zg2 = this.f77809b;
        C5469ub c5469ub = zg2.f76756c;
        Consumer consumer = zg2.f76758e;
        Context context = zg2.f76754a;
        if (C5115ga.f77247c == null) {
            synchronized (kotlin.jvm.internal.v0.b(C5115ga.class)) {
                try {
                    if (C5115ga.f77247c == null) {
                        C5115ga.f77247c = new C5115ga(context);
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C5115ga c5115ga = C5115ga.f77247c;
        if (c5115ga == null) {
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            c5115ga = null;
        }
        executor.execute(new Yf(file, c5469ub, c5469ub, consumer, c5115ga, zg2.f76755b));
    }
}
