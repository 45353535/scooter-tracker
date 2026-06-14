package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface Z7<T> {

    public static class a<ListenerType> implements Z7<ListenerType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private ListenerType f42247a;

        /* JADX INFO: renamed from: com.ironsource.Z7$a$a, reason: collision with other inner class name */
        public static final class C0442a extends AbstractRunnableC4232ae {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f42248b;

            C0442a(Runnable runnable) {
                this.f42248b = runnable;
            }

            @Override // com.ironsource.AbstractRunnableC4232ae
            public void a() {
                this.f42248b.run();
            }
        }

        @Nullable
        public final ListenerType a() {
            return this.f42247a;
        }

        public final void b(@Nullable ListenerType listenertype) {
            this.f42247a = listenertype;
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            aVar.a(runnable, z10);
        }

        public final void a(@NotNull Runnable runnable, boolean z10) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (z10) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0442a(runnable), 0L, 2, null);
            }
        }

        public final void a(@NotNull String instanceId, @NotNull String message) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }

        @Override // com.ironsource.Z7
        public void a(ListenerType listenertype) {
            this.f42247a = listenertype;
        }
    }

    void a(T t10);
}
