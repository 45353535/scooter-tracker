package com.appodeal.ads.storage;

import android.content.SharedPreferences;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ JSONObject f14812s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a0 a0Var, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.f14811r = a0Var;
        this.f14812s = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f14811r, this.f14812s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new m(this.f14811r, this.f14812s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        SharedPreferences.Editor editorEdit = this.f14811r.c(d.f14791f).edit();
        editorEdit.clear();
        Iterator<String> itKeys = this.f14812s.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        JSONObject jSONObject = this.f14812s;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            editorEdit.putString(next, jSONObject.getString(next));
        }
        editorEdit.apply();
        return Unit.f93236a;
    }
}
