package com.inmobi.media;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class Y8 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3729g9 f38034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38035b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y8(C3729g9 c3729g9, String str, Continuation continuation) {
        super(1, continuation);
        this.f38034a = c3729g9;
        this.f38035b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Y8(this.f38034a, this.f38035b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Y8(this.f38034a, this.f38035b, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        SQLiteDatabase sQLiteDatabase = this.f38034a.f38625d;
        return sQLiteDatabase == null ? kotlin.coroutines.jvm.internal.b.d(0) : kotlin.coroutines.jvm.internal.b.d((int) DatabaseUtils.longForQuery(sQLiteDatabase, this.f38035b, null));
    }
}
