package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0096Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/services/core/domain/task/BaseTask;", "P", "Lcom/unity3d/services/core/domain/task/BaseParams;", "R", "Lcom/unity3d/services/core/di/IServiceComponent;", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/BaseParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "invoke-gIAlu-s", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BaseTask<P extends BaseParams, R> extends IServiceComponent {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static <P extends BaseParams, R> IServiceProvider getServiceProvider(@NotNull BaseTask<? super P, R> baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static <P extends com.unity3d.services.core.domain.task.BaseParams, R> java.lang.Object m7467invokegIAlus(@org.jetbrains.annotations.NotNull com.unity3d.services.core.domain.task.BaseTask<? super P, R> r4, @org.jetbrains.annotations.NotNull P r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
            /*
                boolean r0 = r6 instanceof com.unity3d.services.core.domain.task.BaseTask$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = (com.unity3d.services.core.domain.task.BaseTask$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = new com.unity3d.services.core.domain.task.BaseTask$invoke$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                kotlin.d.b(r6)
                kotlin.Result r6 = (kotlin.Result) r6
                java.lang.Object r4 = r6.l()
                return r4
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                kotlin.d.b(r6)
                r0.label = r3
                java.lang.Object r4 = r4.mo7465doWorkgIAlus(r5, r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.m7467invokegIAlus(com.unity3d.services.core.domain.task.BaseTask, com.unity3d.services.core.domain.task.BaseParams, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    Object mo7465doWorkgIAlus(@NotNull P p10, @NotNull Continuation continuation);

    @Nullable
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    Object mo7466invokegIAlus(@NotNull P p10, @NotNull Continuation continuation);
}
