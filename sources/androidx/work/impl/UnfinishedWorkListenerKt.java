package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.ProcessUtils;
import eg.k0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", "appContext", "Landroidx/work/Configuration;", "configuration", "Landroidx/work/impl/WorkDatabase;", "db", "", "maybeLaunchUnfinishedWorkListener", "(Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/WorkDatabase;)V", "", "TAG", "Ljava/lang/String;", "", "DELAY_MS", "I", "", "MAX_DELAY_MS", "J", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UnfinishedWorkListenerKt {
    private static final int DELAY_MS = 30000;
    private static final long MAX_DELAY_MS;

    @NotNull
    private static final String TAG;

    /* JADX INFO: renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "throwable", "", "attempt", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function4<FlowCollector, Throwable, Long, Continuation, Object> {
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector flowCollector, Throwable th2, Long l10, Continuation continuation) {
            return invoke(flowCollector, th2, l10.longValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Throwable th2 = (Throwable) this.L$0;
                long j10 = this.J$0;
                Logger.get().error(UnfinishedWorkListenerKt.TAG, "Cannot check for unfinished work", th2);
                long jMin = Math.min(j10 * ((long) 30000), UnfinishedWorkListenerKt.MAX_DELAY_MS);
                this.label = 1;
                if (k0.a(jMin, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(true);
        }

        public final Object invoke(FlowCollector flowCollector, Throwable th2, long j10, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = th2;
            anonymousClass1.J$0 = j10;
            return anonymousClass1.invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "hasUnfinishedWork", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.k implements Function2<Boolean, Continuation, Object> {
        final /* synthetic */ Context $appContext;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, Continuation continuation) {
            super(2, continuation);
            this.$appContext = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$appContext, continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            PackageManagerHelper.setComponentEnabled(this.$appContext, RescheduleReceiver.class, this.Z$0);
            return Unit.f93236a;
        }

        public final Object invoke(boolean z10, Continuation continuation) {
            return ((AnonymousClass2) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("UnfinishedWorkListener");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
        MAX_DELAY_MS = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void maybeLaunchUnfinishedWorkListener(@NotNull CoroutineScope coroutineScope, @NotNull Context appContext, @NotNull Configuration configuration, @NotNull WorkDatabase db2) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(db2, "db");
        if (ProcessUtils.isDefaultProcess(appContext, configuration)) {
            hg.i.F(hg.i.K(hg.i.p(hg.i.n(hg.i.O(db2.workSpecDao().hasUnfinishedWorkFlow(), new AnonymousClass1(null)))), new AnonymousClass2(appContext, null)), coroutineScope);
        }
    }
}
