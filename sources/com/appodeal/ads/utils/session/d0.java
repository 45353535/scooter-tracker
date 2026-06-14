package com.appodeal.ads.utils.session;

import android.os.SystemClock;
import com.appodeal.ads.ext.LogExtKt;
import eg.e0;
import eg.o0;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f15063a;

    public d0(z sessionStorage) {
        Intrinsics.checkNotNullParameter(sessionStorage, "sessionStorage");
        this.f15063a = sessionStorage;
    }

    public final f a(int i10) {
        List listEmptyList;
        b bVarA = this.f15063a.a();
        b bVarB = b.b(bVarA, bVarA.a() + 1, 0L, 0L, 14);
        LogExtKt.logInternal$default("SessionsInteractor", "Initial " + bVarB, null, 4, null);
        e eVarG = this.f15063a.g();
        if (eVarG == null || (listEmptyList = CollectionsKt.listOf(eVarG)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List listTake = CollectionsKt.take(CollectionsKt.plus((Collection) listEmptyList, (Iterable) this.f15063a.h()), i10);
        long jB = a.b();
        long jA = a.a();
        int iA = bVarB.a();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        f fVar = new f(bVarB, new e(iA, string, jB, jA, 0L, 0L, jB, jA, 0L), listTake);
        eg.i.d(kotlinx.coroutines.i.a(o0.b().plus(new e0("ApdSessionsInteractor"))), null, null, new b0(this, fVar, null), 3, null);
        return fVar;
    }

    public final f b(f currentSessionInfo, int i10) {
        Intrinsics.checkNotNullParameter(currentSessionInfo, "currentSessionInfo");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = currentSessionInfo.f15073a.f15052a + 1;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        e activeSession = new e(i11, string, jCurrentTimeMillis, jElapsedRealtime, 0L, 0L, jCurrentTimeMillis, jElapsedRealtime, 0L);
        b bVar = currentSessionInfo.f15073a;
        b appTimes = b.b(bVar, bVar.f15052a + 1, 0L, 0L, 14);
        List previousSessions = CollectionsKt.take(CollectionsKt.plus((Collection) CollectionsKt.listOf(currentSessionInfo.f15074b), (Iterable) currentSessionInfo.f15075c), i10);
        Intrinsics.checkNotNullParameter(appTimes, "appTimes");
        Intrinsics.checkNotNullParameter(activeSession, "activeSession");
        Intrinsics.checkNotNullParameter(previousSessions, "previousSessions");
        f fVar = new f(appTimes, activeSession, previousSessions);
        eg.i.d(kotlinx.coroutines.i.a(o0.b().plus(new e0("ApdSessionsInteractor"))), null, null, new b0(this, fVar, null), 3, null);
        return fVar;
    }
}
