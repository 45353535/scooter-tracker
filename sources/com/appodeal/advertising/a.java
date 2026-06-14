package com.appodeal.advertising;

import android.content.Context;
import com.appodeal.advertising.AdvertisingInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f15331r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Continuation continuation) {
        super(2, continuation);
        this.f15331r = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f15331r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.f15331r, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        e eVar;
        pf.b.g();
        kotlin.d.b(obj);
        AdvertisingInfo.f15325b.setValue(f.f15337a);
        MutableStateFlow mutableStateFlow = AdvertisingInfo.f15325b;
        List list = AdvertisingInfo.f15324a;
        Context context = this.f15331r;
        Iterator it = list.iterator();
        do {
            eVar = null;
            if (!it.hasNext()) {
                break;
            }
            AdvertisingInfo.AdvertisingProfile advertisingProfile = (AdvertisingInfo.AdvertisingProfile) it.next();
            try {
                if (advertisingProfile.isEnabled$advertising_release(context)) {
                    advertisingProfile.extractParams$advertising_release(context);
                    eVar = new e(advertisingProfile);
                }
            } catch (Throwable unused) {
            }
        } while (eVar == null);
        if (eVar == null) {
            eVar = new e(AdvertisingInfo.access$getDefaultProfile(AdvertisingInfo.INSTANCE, this.f15331r));
        }
        mutableStateFlow.setValue(eVar);
        return Unit.f93236a;
    }
}
