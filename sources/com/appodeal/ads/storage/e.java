package com.appodeal.ads.storage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f14798s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a0 a0Var, long j10, Continuation continuation) {
        super(2, continuation);
        this.f14797r = a0Var;
        this.f14798s = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f14797r, this.f14798s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new e(this.f14797r, this.f14798s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Map<String, ?> all = this.f14797r.c(d.f14792g).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Pair pair = (value instanceof Long ? (Long) value : null) != null ? TuplesKt.to(key, value) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map map = MapsKt.toMap(arrayList);
        SharedPreferences.Editor editorEdit = this.f14797r.c(d.f14792g).edit();
        long j10 = this.f14798s - 259200000;
        for (Map.Entry entry2 : map.entrySet()) {
            String str = (String) entry2.getKey();
            if (((Number) entry2.getValue()).longValue() < j10) {
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return Unit.f93236a;
    }
}
