package com.ironsource;

import com.ironsource.T6;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4439mf {

    /* JADX INFO: renamed from: com.ironsource.mf$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final T6.a.InterfaceC0440a f44412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f44413b;

        public a(@NotNull T6.a.InterfaceC0440a onCancel) {
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            this.f44412a = onCancel;
        }

        public final void a() {
            this.f44412a.cancel();
            this.f44413b = true;
        }

        public final boolean b() {
            return this.f44413b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mf$b */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f44414b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractRunnableC4232ae f44415a;

        /* JADX INFO: renamed from: com.ironsource.mf$b$a */
        public static final class a {

            /* JADX INFO: renamed from: com.ironsource.mf$b$a$a, reason: collision with other inner class name */
            public static final class C0472a extends AbstractRunnableC4232ae {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeakReference<T> f44416b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function1<T, Unit> f44417c;

                /* JADX WARN: Multi-variable type inference failed */
                C0472a(WeakReference<T> weakReference, Function1<? super T, Unit> function1) {
                    this.f44416b = weakReference;
                    this.f44417c = function1;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // com.ironsource.AbstractRunnableC4232ae
                public void a() {
                    Object obj = this.f44416b.get();
                    if (obj != null) {
                        this.f44417c.invoke((T) obj);
                    }
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final <T> b a(T t10, @NotNull Function1<? super T, Unit> block) {
                Intrinsics.checkNotNullParameter(block, "block");
                return new b(new C0472a(new WeakReference(t10), block), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(AbstractRunnableC4232ae abstractRunnableC4232ae, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractRunnableC4232ae);
        }

        @NotNull
        public final AbstractRunnableC4232ae a() {
            return this.f44415a;
        }

        private b(AbstractRunnableC4232ae abstractRunnableC4232ae) {
            this.f44415a = abstractRunnableC4232ae;
        }
    }

    @NotNull
    a a(@NotNull b bVar, long j10);

    @NotNull
    a a(@NotNull Runnable runnable, long j10);
}
