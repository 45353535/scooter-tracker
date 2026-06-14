package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4160xh extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f39934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bh f39935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f39936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RootConfig f39937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg.v f39938f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4160xh(List list, Bh bh2, String str, RootConfig rootConfig, gg.v vVar, Continuation continuation) {
        super(2, continuation);
        this.f39934b = list;
        this.f39935c = bh2;
        this.f39936d = str;
        this.f39937e = rootConfig;
        this.f39938f = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C4160xh c4160xh = new C4160xh(this.f39934b, this.f39935c, this.f39936d, this.f39937e, this.f39938f, continuation);
        c4160xh.f39933a = obj;
        return c4160xh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4160xh) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f39933a;
        List list = this.f39934b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String str = ((C3873m4) obj2).f39007a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        Bh bh2 = this.f39935c;
        String str2 = this.f39936d;
        RootConfig rootConfig = this.f39937e;
        gg.v vVar = this.f39938f;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            eg.i.d(coroutineScope, null, null, new C4135wh(bh2, (String) entry.getKey(), str2, rootConfig, (List) entry.getValue(), vVar, null), 3, null);
        }
        return Unit.f93236a;
    }
}
