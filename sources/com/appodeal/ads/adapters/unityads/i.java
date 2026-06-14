package com.appodeal.ads.adapters.unityads;

import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.RestrictedData;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.ads.metadata.MetaData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ RestrictedData f12570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f12571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f12572t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(RestrictedData restrictedData, Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.f12570r = restrictedData;
        this.f12571s = context;
        this.f12572t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f12570r, this.f12571s, this.f12572t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        if (this.f12570r.isUserInGdprScope()) {
            MetaData metaData = new MetaData(this.f12571s.getApplicationContext());
            metaData.set("gdpr.consent", kotlin.coroutines.jvm.internal.b.a(this.f12570r.isUserHasConsent()));
            metaData.commit();
        }
        if (this.f12570r.isUserInCcpaScope()) {
            MetaData metaData2 = new MetaData(this.f12571s.getApplicationContext());
            metaData2.set("privacy.consent", kotlin.coroutines.jvm.internal.b.a(this.f12570r.isUserHasConsent()));
            metaData2.commit();
        }
        MetaData metaData3 = new MetaData(this.f12571s.getApplicationContext());
        metaData3.set("privacy.useroveragelimit", kotlin.coroutines.jvm.internal.b.a(!this.f12570r.isUserAgeRestricted()));
        metaData3.commit();
        if (!TextUtils.isEmpty(this.f12572t)) {
            MediationMetaData mediationMetaData = new MediationMetaData(this.f12571s);
            mediationMetaData.setName(this.f12572t);
            mediationMetaData.setVersion(Appodeal.getVersion());
            mediationMetaData.commit();
        }
        return Unit.f93236a;
    }
}
