package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Z8 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String[] f38105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z8(String str, String str2, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.f38103b = str;
        this.f38104c = str2;
        this.f38105d = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        Z8 z82 = new Z8(this.f38103b, this.f38104c, this.f38105d, continuation);
        z82.f38102a = obj;
        return z82;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Z8) create((C3729g9) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C3729g9) this.f38102a).f38624c;
        if (sQLiteDatabase != null) {
            kotlin.coroutines.jvm.internal.b.d(sQLiteDatabase.delete(this.f38103b, this.f38104c, this.f38105d));
        }
        return Unit.f93236a;
    }
}
