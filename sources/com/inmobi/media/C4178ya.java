package com.inmobi.media;

import com.inmobi.media.C4178ya;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: com.inmobi.media.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4178ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f39985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f39986b;

    public C4178ya(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f39985a = coroutineScope;
        this.f39986b = DesugarCollections.synchronizedMap(new LinkedHashMap());
    }

    public final void a(final String id2, Function2 block) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(block, "block");
        final Job jobD = eg.i.d(this.f39985a, null, null, new C4153xa(block, null), 3, null);
        Map jobMap = this.f39986b;
        Intrinsics.checkNotNullExpressionValue(jobMap, "jobMap");
        Object objSynchronizedList = jobMap.get(id2);
        if (objSynchronizedList == null) {
            objSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
            jobMap.put(id2, objSynchronizedList);
        }
        ((List) objSynchronizedList).add(jobD);
        jobD.q(new Function1() { // from class: w3.id
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4178ya.a(this.f107106b, id2, jobD, (Throwable) obj);
            }
        });
    }

    public static final Unit a(C4178ya c4178ya, String str, Job job, Throwable th2) {
        List list = (List) c4178ya.f39986b.get(str);
        if (list != null) {
            list.remove(job);
        }
        return Unit.f93236a;
    }
}
