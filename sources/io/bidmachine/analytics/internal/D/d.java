package io.bidmachine.analytics.internal.D;

import android.database.sqlite.SQLiteOpenHelper;
import io.bidmachine.analytics.internal.g.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import lf.i;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteOpenHelper f79501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f79502b = i.a(new a());

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.B.b invoke() {
            return new io.bidmachine.analytics.internal.B.b(d.this.f79501a);
        }
    }

    public d(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f79501a = sQLiteOpenHelper;
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object b(io.bidmachine.analytics.internal.g.c cVar) {
        return a().c(io.bidmachine.analytics.internal.C.d.a(cVar));
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object c(List list) {
        io.bidmachine.analytics.internal.B.b bVarA = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.d.a((io.bidmachine.analytics.internal.g.c) it.next()));
        }
        return bVarA.d(arrayList);
    }

    private final io.bidmachine.analytics.internal.B.b a() {
        return (io.bidmachine.analytics.internal.B.b) this.f79502b.getValue();
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object b(List list) {
        io.bidmachine.analytics.internal.B.b bVarA = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.d.a((io.bidmachine.analytics.internal.g.c) it.next()));
        }
        return bVarA.a(arrayList);
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object a(io.bidmachine.analytics.internal.g.c cVar) {
        return a().a(io.bidmachine.analytics.internal.C.d.a(cVar));
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object a(String str, c.a aVar) {
        Object objA = a().a(str, io.bidmachine.analytics.internal.C.d.a(aVar).toString());
        try {
            Result.Companion companion = Result.f93230c;
            kotlin.d.b(objA);
            io.bidmachine.analytics.internal.C.c cVar = (io.bidmachine.analytics.internal.C.c) objA;
            return Result.b(cVar != null ? io.bidmachine.analytics.internal.C.d.a(cVar) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object a(String str) {
        return a(a().a(str));
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object a(List list) {
        io.bidmachine.analytics.internal.B.b bVarA = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.d.a((io.bidmachine.analytics.internal.g.c) it.next()));
        }
        return bVarA.e(arrayList);
    }

    public final Object b() {
        return a().b();
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object a(String str, List list) {
        io.bidmachine.analytics.internal.B.b bVarA = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.d.a((c.a) it.next()).toString());
        }
        return bVarA.a(str, arrayList);
    }

    @Override // io.bidmachine.analytics.internal.D.c
    public Object a(List list, List list2) {
        a().b(list);
        io.bidmachine.analytics.internal.B.b bVarA = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(io.bidmachine.analytics.internal.C.d.a((c.a) it.next()).toString());
        }
        bVarA.c(arrayList);
        Result.Companion companion = Result.f93230c;
        return Result.b(Unit.f93236a);
    }

    private final Object a(Object obj) {
        try {
            Result.Companion companion = Result.f93230c;
            kotlin.d.b(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(io.bidmachine.analytics.internal.C.d.a((io.bidmachine.analytics.internal.C.c) it.next()));
            }
            return Result.b(arrayList);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }
}
