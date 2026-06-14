package com.appodeal.consent.cache;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f15376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f15377s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, i iVar, Continuation continuation) {
        super(2, continuation);
        this.f15376r = pVar;
        this.f15377s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f15376r, this.f15377s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.f15376r, this.f15377s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        com.appodeal.consent.logger.a.b("[PrivacyPreferences] - clearIabPreferences: " + this.f15376r.a(), null);
        String strB = this.f15376r.b();
        if (strB == null) {
            return Unit.f93236a;
        }
        SharedPreferences sharedPreferences = this.f15377s.f15392b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iabPreferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        SharedPreferences sharedPreferences2 = this.f15377s.f15392b;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iabPreferences");
            sharedPreferences2 = null;
        }
        Map<String, ?> all = sharedPreferences2.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNull(key);
            if (StringsKt.a0(key, strB, false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            editorEdit.putString((String) ((Map.Entry) it.next()).getKey(), null);
        }
        editorEdit.apply();
        return Unit.f93236a;
    }
}
