package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Qd implements NativeCrashHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f76310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f76311b = C5468ua.k().x().e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Td f76312c;

    public Qd(@NotNull Context context, @NotNull Xg xg2, @NotNull Function1<? super String, Unit> function1, @NotNull Yd yd2, @NotNull EnumC5168ib enumC5168ib, @NotNull String str) {
        this.f76310a = function1;
        this.f76312c = new Td(context, xg2, yd2, enumC5168ib);
    }

    public static final void a(Qd qd2, NativeCrash nativeCrash, File file) {
        qd2.f76310a.invoke(nativeCrash.getUuid());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(@NotNull final NativeCrash nativeCrash) {
        E0 e02;
        C5115ga c5115ga;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String uuid = nativeCrash.getUuid();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            F0 f0A = G0.a(nativeCrash.getMetadata());
            Intrinsics.checkNotNull(f0A);
            e02 = new E0(source, handlerVersion, uuid, dumpFile, creationTime, f0A);
        } catch (Throwable unused) {
            e02 = null;
        }
        if (e02 == null) {
            this.f76310a.invoke(nativeCrash.getUuid());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(e02.f75694f.f75748a).info("Detected native crash with uuid = " + e02.f75691c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f76311b;
        Td td2 = this.f76312c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.op
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Qd.a(this.f77932a, nativeCrash, (File) obj);
            }
        };
        td2.getClass();
        Md md2 = new Md(new Od(e02.f75689a, e02.f75690b), td2.f76507f);
        Jd jd2 = new Jd(td2.f76503b, e02.f75694f, new Sd(e02, td2.f76505d));
        C5141ha c5141ha = td2.f76506e;
        String str = e02.f75692d;
        c5141ha.getClass();
        File file = new File(str);
        Context context = td2.f76502a;
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
        C5115ga c5115ga2 = C5115ga.f77247c;
        if (c5115ga2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            c5115ga = null;
        } else {
            c5115ga = c5115ga2;
        }
        iHandlerExecutor.execute(new Yf(file, md2, consumer, jd2, c5115ga, td2.f76504c.a(e02)));
    }
}
