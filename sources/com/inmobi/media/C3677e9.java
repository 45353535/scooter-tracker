package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3677e9 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentValues f38511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String[] f38513e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3677e9(String str, ContentValues contentValues, String str2, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.f38510b = str;
        this.f38511c = contentValues;
        this.f38512d = str2;
        this.f38513e = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3677e9 c3677e9 = new C3677e9(this.f38510b, this.f38511c, this.f38512d, this.f38513e, continuation);
        c3677e9.f38509a = obj;
        return c3677e9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3677e9) create((C3729g9) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C3729g9) this.f38509a).f38624c;
        if (sQLiteDatabase != null) {
            kotlin.coroutines.jvm.internal.b.d(sQLiteDatabase.updateWithOnConflict(this.f38510b, this.f38511c, this.f38512d, this.f38513e, 4));
        }
        return Unit.f93236a;
    }
}
