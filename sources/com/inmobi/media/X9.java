package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes9.dex */
public final class X9 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y9 f37992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f37993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f37995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f37996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X9(Y9 y92, long j10, String str, int i10, String str2, Continuation continuation) {
        super(1, continuation);
        this.f37992a = y92;
        this.f37993b = j10;
        this.f37994c = str;
        this.f37995d = i10;
        this.f37996e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new X9(this.f37992a, this.f37993b, this.f37994c, this.f37995d, this.f37996e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((X9) create((Continuation) obj)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC3978q9.f39363a;
        ArrayList arrayList2 = new ArrayList();
        V9 v92 = new V9();
        ArrayList arrayList3 = new ArrayList();
        eg.h.b(null, new U9(v92, arrayList3, null), 1, null);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C3627ca((W9) it.next()));
        }
        arrayList.addAll(arrayList2);
        Iterator it2 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next = it2.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Y9 y92 = this.f37992a;
            long j10 = this.f37993b;
            C3627ca c3627ca = (C3627ca) ((Z9) next);
            long j11 = c3627ca.f38334a.f37940c.f39368b;
            if (j10 >= j11 && j10 - j11 <= y92.f38036a) {
                String str = this.f37994c;
                int i10 = this.f37995d;
                c3627ca.a("Message - " + str + ", Reason - " + i10 + ", Timestamp - " + j10 + ", Data - " + this.f37996e);
                c3627ca.b(String.valueOf(i10));
                Throwable thG = Result.g(c3627ca.b());
                if (thG != null) {
                    try {
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        L2 l22 = new L2(thG);
                        ref$ObjectRef.f93280b = l22;
                        P9.a(l22);
                        Object objA = c3627ca.a();
                        Throwable thG2 = Result.g(objA);
                        if (thG2 != null) {
                            try {
                                L2 l23 = new L2(thG2);
                                ref$ObjectRef.f93280b = l23;
                                P9.a(l23);
                                objA = Result.b(Unit.f93236a);
                            } catch (Throwable th2) {
                                Result.Companion companion = Result.f93230c;
                                objA = Result.b(kotlin.d.a(th2));
                            }
                        }
                        Result.b(Result.a(objA));
                    } catch (Throwable th3) {
                        Result.Companion companion2 = Result.f93230c;
                        Result.b(kotlin.d.a(th3));
                    }
                }
            }
        }
        return Unit.f93236a;
    }
}
