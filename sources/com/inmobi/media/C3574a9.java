package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3574a9 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38175b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3574a9(String str, Continuation continuation) {
        super(2, continuation);
        this.f38175b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3574a9 c3574a9 = new C3574a9(this.f38175b, continuation);
        c3574a9.f38174a = obj;
        return c3574a9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3574a9 c3574a9 = new C3574a9(this.f38175b, (Continuation) obj2);
        c3574a9.f38174a = (C3729g9) obj;
        return c3574a9.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C3729g9) this.f38174a).f38624c;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(this.f38175b);
        }
        return Unit.f93236a;
    }
}
