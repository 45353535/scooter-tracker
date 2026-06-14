package com.ironsource;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractRunnableC4232ae implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f42430a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.ae$a */
    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.ae$a$a, reason: collision with other inner class name */
        public static final class C0459a extends AbstractRunnableC4232ae {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f42431b;

            C0459a(Function0<Unit> function0) {
                this.f42431b = function0;
            }

            @Override // com.ironsource.AbstractRunnableC4232ae
            public void a() {
                this.f42431b.invoke();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AbstractRunnableC4232ae a(@NotNull Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new C0459a(block);
        }

        private a() {
        }
    }

    public abstract void a() throws Exception;

    public void a(@NotNull Throwable t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        C4456nf.a(t10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            try {
                a(th2);
            } catch (Throwable th3) {
                C4462o4.d().a(th3);
            }
        }
    }
}
