package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import eg.c0;
import eg.m1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.i;
import kotlinx.coroutines.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;)V", "Leg/c0;", "coroutineExceptionHandler", "Leg/c0;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CleanUpWhenOpportunityExpires {

    @NotNull
    private final c0 coroutineExceptionHandler;

    @NotNull
    private final CoroutineScope coroutineScope;

    public CleanUpWhenOpportunityExpires(@NotNull CoroutineDispatcher defaultDispatcher) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 = new CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(c0.J8);
        this.coroutineExceptionHandler = cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineScope = i.a(m1.b(null, 1, null).plus(defaultDispatcher).plus(cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1));
    }

    public final void invoke(@NotNull AdObject adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        if (adObject.getAdPlayer() == null) {
            throw new IllegalArgumentException("AdObject does not have an adPlayer.");
        }
        final Job jobD = eg.i.d(this.coroutineScope, null, null, new CleanUpWhenOpportunityExpires$invoke$job$1(adObject, null), 3, null);
        z.o(adObject.getAdPlayer().getScope().getCoroutineContext()).q(new Function1<Throwable, Unit>() { // from class: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.invoke.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                Job.a.a(jobD, null, 1, null);
            }
        });
    }
}
