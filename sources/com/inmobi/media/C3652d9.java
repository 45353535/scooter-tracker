package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3652d9 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentValues f38434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3652d9(String str, ContentValues contentValues, int i10, Continuation continuation) {
        super(2, continuation);
        this.f38433b = str;
        this.f38434c = contentValues;
        this.f38435d = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3652d9 c3652d9 = new C3652d9(this.f38433b, this.f38434c, this.f38435d, continuation);
        c3652d9.f38432a = obj;
        return c3652d9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3652d9) create((C3729g9) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C3729g9) this.f38432a).f38624c;
        if (sQLiteDatabase != null) {
            kotlin.coroutines.jvm.internal.b.e(sQLiteDatabase.insertWithOnConflict(this.f38433b, null, this.f38434c, this.f38435d));
        }
        return Unit.f93236a;
    }
}
