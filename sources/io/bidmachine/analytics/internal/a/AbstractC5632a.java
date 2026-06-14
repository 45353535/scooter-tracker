package io.bidmachine.analytics.internal.a;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.a.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5632a {

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.a.a$a, reason: collision with other inner class name */
    static final class C0946a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0946a f79504a = new C0946a();

        C0946a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return "?";
        }
    }

    public static final String a(List list, String str) {
        if (list == null) {
            return null;
        }
        return str + " (" + CollectionsKt.joinToString$default(list, StringUtils.COMMA, null, null, 0, null, C0946a.f79504a, 30, null) + ')';
    }

    public static /* synthetic */ void a(List list, SQLiteDatabase sQLiteDatabase, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 100;
        }
        a(list, sQLiteDatabase, i10, function1);
    }

    public static final void a(List list, SQLiteDatabase sQLiteDatabase, int i10, Function1 function1) {
        if (list == null) {
            function1.invoke(null);
            return;
        }
        sQLiteDatabase.beginTransaction();
        try {
            Iterator it = CollectionsKt.chunked(list, i10).iterator();
            while (it.hasNext()) {
                function1.invoke((List) it.next());
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            sQLiteDatabase.endTransaction();
            throw th2;
        }
    }

    public static final String[] a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
