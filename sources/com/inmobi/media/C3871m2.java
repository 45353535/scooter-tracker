package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.inmobi.media.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3871m2 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4020s2 f39002a;

    public C3871m2(CoroutineScope coroutineScope, AbstractC4020s2 abstractC4020s2) {
        this.f39002a = abstractC4020s2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.f39002a.getClass();
        this.f39002a.f39499e.set(zBooleanValue);
        AbstractC4020s2 abstractC4020s2 = this.f39002a;
        if (abstractC4020s2.f39499e.get()) {
            C4134wg c4134wg = abstractC4020s2.c().f36641a;
            c4134wg.f39857f.set(false);
            c4134wg.a();
        } else {
            C4134wg c4134wg2 = abstractC4020s2.c().f36641a;
            c4134wg2.f39853b.setValue(Mn.f37387a);
            c4134wg2.f39857f.set(true);
            H6.a(c4134wg2.f39856e);
            c4134wg2.f39856e = null;
        }
        AbstractC4020s2 abstractC4020s22 = this.f39002a;
        if (abstractC4020s22.f39499e.get()) {
            abstractC4020s22.f39501g.a();
        } else {
            abstractC4020s22.f39501g.b();
        }
        return Unit.f93236a;
    }
}
