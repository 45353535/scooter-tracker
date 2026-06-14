package com.inmobi.media;

import com.inmobi.media.AbstractC3649d6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3649d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3729g9 f38427b;

    public AbstractC3649d6(String tableName, C3729g9 databaseHelper) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f38426a = tableName;
        this.f38427b = databaseHelper;
    }

    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        String str = "SELECT COUNT(*) FROM " + this.f38426a;
        C3729g9 c3729g9 = this.f38427b;
        c3729g9.getClass();
        return c3729g9.a(new Y8(c3729g9, str, null), dVar);
    }

    public abstract Object b(int i10, kotlin.coroutines.jvm.internal.d dVar);

    public final Object a(ArrayList arrayList, kotlin.coroutines.jvm.internal.k kVar) {
        if (arrayList.isEmpty()) {
            return Unit.f93236a;
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, new Function1() { // from class: w3.u6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC3649d6.a(((Integer) obj).intValue());
            }
        }, 30, null);
        Object objA = C3729g9.a(this.f38427b, this.f38426a, "id IN (" + strJoinToString$default + ")", kVar, 4);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public static final CharSequence a(int i10) {
        return String.valueOf(i10);
    }

    public final Object a(long j10, kotlin.coroutines.jvm.internal.d dVar) {
        Object objA = C3729g9.a(this.f38427b, this.f38426a, "ts < " + j10, dVar, 4);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public final Object a(int i10, kotlin.coroutines.jvm.internal.d dVar) {
        String str = this.f38426a;
        Object objA = this.f38427b.a("DELETE FROM " + str + " WHERE id IN (SELECT id FROM " + str + " ORDER BY ts ASC LIMIT " + i10 + ")", dVar);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }
}
