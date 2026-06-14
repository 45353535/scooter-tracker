package io.bidmachine.analytics.internal.D;

import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import lf.i;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements io.bidmachine.analytics.internal.D.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteOpenHelper f79498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f79499b = i.a(new a());

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.B.a invoke() {
            return new io.bidmachine.analytics.internal.B.a(b.this.f79498a);
        }
    }

    public b(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f79498a = sQLiteOpenHelper;
    }

    @Override // io.bidmachine.analytics.internal.D.a
    public Object b(List list) {
        io.bidmachine.analytics.internal.B.a aVarA = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.b.a((io.bidmachine.analytics.internal.g.b) it.next()));
        }
        return aVarA.a(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.D.a
    public Object c(List list) {
        io.bidmachine.analytics.internal.B.a aVarA = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.b.a((io.bidmachine.analytics.internal.g.b) it.next()));
        }
        return aVarA.b(arrayList);
    }

    private final io.bidmachine.analytics.internal.B.a a() {
        return (io.bidmachine.analytics.internal.B.a) this.f79499b.getValue();
    }

    @Override // io.bidmachine.analytics.internal.D.a
    public Object a(io.bidmachine.analytics.internal.g.b bVar) {
        return a().a(io.bidmachine.analytics.internal.C.b.a(bVar));
    }

    @Override // io.bidmachine.analytics.internal.D.a
    public Object a(String str, String str2) {
        return a(a().a(str, str2));
    }

    @Override // io.bidmachine.analytics.internal.D.a
    public Object a(String str, String str2, int i10) {
        return a(a().a(str, str2, Integer.valueOf(i10)));
    }

    public final Object b() {
        return a().a();
    }

    @Override // io.bidmachine.analytics.internal.D.a
    public Object a(List list) {
        io.bidmachine.analytics.internal.B.a aVarA = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.b.a((io.bidmachine.analytics.internal.g.b) it.next()));
        }
        return aVarA.c(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.D.a
    public Object a(String str, List list) {
        return a().a(str, list);
    }

    private final Object a(Object obj) {
        try {
            Result.Companion companion = Result.f93230c;
            kotlin.d.b(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(io.bidmachine.analytics.internal.C.b.a((io.bidmachine.analytics.internal.C.a) it.next()));
            }
            return Result.b(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }
}
