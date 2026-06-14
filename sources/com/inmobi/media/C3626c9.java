package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3626c9 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3729g9 f38332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3626c9(C3729g9 c3729g9, String str, Continuation continuation) {
        super(1, continuation);
        this.f38332a = c3729g9;
        this.f38333b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C3626c9(this.f38332a, this.f38333b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3626c9(this.f38332a, this.f38333b, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        SQLiteDatabase sQLiteDatabase = this.f38332a.f38625d;
        if (sQLiteDatabase == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(this.f38333b, null);
            try {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    } while (cursorRawQuery.moveToNext());
                }
                Unit unit = Unit.f93236a;
                uf.c.a(cursorRawQuery, null);
                return arrayList;
            } finally {
            }
        } catch (Exception unused) {
            return arrayList;
        }
    }
}
