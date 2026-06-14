package com.appodeal.ads.adapters.unityads;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.utils.EventsTracker;
import com.unity3d.ads.metadata.MediationMetaData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f12569r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Continuation continuation) {
        super(2, continuation);
        this.f12569r = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f12569r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new h(this.f12569r, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        MediationMetaData mediationMetaData = new MediationMetaData(this.f12569r);
        mediationMetaData.setMissedImpressionOrdinal(EventsTracker.get().getEventCount(EventsTracker.EventType.Impression, AdType.Banner, AdType.Interstitial, AdType.Rewarded));
        mediationMetaData.commit();
        return Unit.f93236a;
    }
}
