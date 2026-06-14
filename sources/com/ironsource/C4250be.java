package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4250be extends ScheduledThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Throwable, Unit> f42771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f42772b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.ironsource.be$a */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42773a = new a();

        a() {
            super(1);
        }

        public final void a(@Nullable Throwable th2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f93236a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.ironsource.be$b */
    public static final class b extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f42774a = new b();

        b() {
            super(1);
        }

        public final void a(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f93236a;
        }
    }

    public C4250be() {
        this(0, null, null, 7, null);
    }

    private final String a(String str) {
        return C4250be.class.getName() + " RuntimeException caught: " + str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(@Nullable Runnable runnable, @Nullable Throwable th2) {
        super.afterExecute(runnable, th2);
        if (th2 != null) {
            this.f42772b.invoke(a(th2.toString()));
            this.f42771a.invoke(th2);
            return;
        }
        if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e10) {
                C4462o4.d().a(e10);
                this.f42772b.invoke(a(e10.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e11) {
                C4462o4.d().a(e11);
                this.f42772b.invoke(a(e11.toString()));
                this.f42771a.invoke(e11);
            } catch (ExecutionException e12) {
                C4462o4.d().a(e12);
                this.f42772b.invoke(a(e12.toString()));
                this.f42771a.invoke(e12.getCause());
            }
        }
    }

    public /* synthetic */ C4250be(int i10, Function1 function1, Function1 function12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C4267ce.f42825a : i10, (i11 & 2) != 0 ? a.f42773a : function1, (i11 & 4) != 0 ? b.f42774a : function12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4250be(int i10, @NotNull Function1<? super Throwable, Unit> report, @NotNull Function1<? super String, Unit> log) {
        super(i10, new ThreadFactoryC4314fa());
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(log, "log");
        this.f42771a = report;
        this.f42772b = log;
    }
}
