package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import com.ironsource.C4240b4;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "()V", C4240b4.i.f42621d0, "Ljava/util/concurrent/atomic/AtomicBoolean;", "ensureStarted", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GlobalSnapshotManager {

    @NotNull
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();

    @NotNull
    private static final AtomicBoolean started = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ gg.g $channel;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(gg.g gVar, Continuation continuation) {
            super(2, continuation);
            this.$channel = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$channel, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #1 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:13:0x0026), top: B:29:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:17:0x0038). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r4.L$1
                gg.i r1 = (gg.i) r1
                java.lang.Object r3 = r4.L$0
                gg.x r3 = (gg.x) r3
                kotlin.d.b(r5)     // Catch: java.lang.Throwable -> L17
                goto L38
            L17:
                r5 = move-exception
                goto L53
            L19:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L21:
                kotlin.d.b(r5)
                gg.g r3 = r4.$channel
                gg.i r5 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r5
            L2b:
                r4.L$0 = r3     // Catch: java.lang.Throwable -> L17
                r4.L$1 = r1     // Catch: java.lang.Throwable -> L17
                r4.label = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r5 = r1.a(r4)     // Catch: java.lang.Throwable -> L17
                if (r5 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L17
                boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r5 == 0) goto L4c
                java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L17
                kotlin.Unit r5 = (kotlin.Unit) r5     // Catch: java.lang.Throwable -> L17
                androidx.compose.runtime.snapshots.Snapshot$Companion r5 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L17
                r5.sendApplyNotifications()     // Catch: java.lang.Throwable -> L17
                goto L2b
            L4c:
                r5 = 0
                gg.m.a(r3, r5)
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            L53:
                throw r5     // Catch: java.lang.Throwable -> L54
            L54:
                r0 = move-exception
                gg.m.a(r3, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            final gg.g gVarB = gg.j.b(-1, null, null, 6, null);
            eg.i.d(kotlinx.coroutines.i.a(AndroidUiDispatcher.INSTANCE.getMain()), null, null, new AnonymousClass1(gVarB, null), 3, null);
            Snapshot.INSTANCE.registerGlobalWriteObserver(new Function1<Object, Unit>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    gVarB.e(Unit.f93236a);
                }
            });
        }
    }
}
