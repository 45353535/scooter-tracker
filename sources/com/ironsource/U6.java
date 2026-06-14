package com.ironsource;

import android.os.Handler;
import com.ironsource.InterfaceC4439mf;
import com.ironsource.T6;
import com.ironsource.U6;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class U6 {
    @NotNull
    public static final T6.a a(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        return new a(handler);
    }

    public static final class a implements T6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f41838a;

        a(Handler handler) {
            this.f41838a = handler;
        }

        @Override // com.ironsource.T6.a
        @NotNull
        public T6.a.InterfaceC0440a a(@NotNull final Runnable runnable, long j10) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f41838a.postDelayed(runnable, j10);
            final Handler handler = this.f41838a;
            return new T6.a.InterfaceC0440a() { // from class: com.ironsource.cj
                @Override // com.ironsource.T6.a.InterfaceC0440a
                public final void cancel() {
                    U6.a.a(handler, runnable);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Handler this_asScheduler, Runnable runnable) {
            Intrinsics.checkNotNullParameter(this_asScheduler, "$this_asScheduler");
            Intrinsics.checkNotNullParameter(runnable, "$runnable");
            this_asScheduler.removeCallbacks(runnable);
        }
    }

    @NotNull
    public static final <T> InterfaceC4439mf.b a(T t10, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return InterfaceC4439mf.b.f44414b.a(t10, block);
    }
}
