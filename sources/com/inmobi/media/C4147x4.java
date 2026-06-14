package com.inmobi.media;

import hh.x;
import hh.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4147x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh.v[] f39890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.x f39891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39892c;

    public C4147x4(hh.v[] vVarArr, hh.v[] vVarArr2, hh.p dispatcher, C3964pk timeoutConfig) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.f39890a = vVarArr2;
        this.f39892c = timeoutConfig.f39297c;
        x.a aVar = new x.a();
        if (vVarArr != null) {
            for (hh.v vVar : vVarArr) {
                aVar.a(vVar);
            }
        }
        hh.v[] vVarArr3 = this.f39890a;
        if (vVarArr3 != null) {
            for (hh.v vVar2 : vVarArr3) {
                aVar.b(vVar2);
            }
        }
        aVar.a(new C4211zi());
        aVar.b(new Xb());
        aVar.M(CollectionsKt.mutableListOf(hh.y.HTTP_2, hh.y.HTTP_1_1));
        aVar.P(false);
        aVar.f(dispatcher);
        long j10 = timeoutConfig.f39295a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.e(j10, timeUnit);
        aVar.O(timeoutConfig.f39296b, timeUnit);
        hh.x xVarC = aVar.c();
        Intrinsics.checkNotNullExpressionValue(xVarC, "build(...)");
        this.f39891b = xVarC;
    }

    public static Pair a(Me me2) {
        hh.a0 c4072u4;
        z.a aVarN = new z.a().n(me2.c());
        Map mapA = me2.a();
        if (mapA != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                aVarN.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Ai aiB = me2.b();
        if (aiB != null) {
            aVarN.l(aiB);
        }
        if (me2 instanceof Je) {
            aVarN.d();
        } else if (me2 instanceof Le) {
            try {
                AbstractC4086ui abstractC4086ui = ((Le) me2).f37291d;
                if (abstractC4086ui == null) {
                    c4072u4 = hh.a0.create((hh.w) null, new byte[0]);
                    Intrinsics.checkNotNull(c4072u4);
                } else {
                    c4072u4 = new C4072u4(abstractC4086ui);
                }
                aVarN.i(c4072u4);
            } catch (FileNotFoundException e10) {
                e10.getStackTrace();
                return new Pair(aVarN.b(), new C3597b6(((Le) me2).f37288a, EnumC3571a6.f38163m));
            } catch (IOException e11) {
                e11.getStackTrace();
                return new Pair(aVarN.b(), new C3597b6(((Le) me2).f37288a, EnumC3571a6.f38155e));
            } catch (Exception e12) {
                e12.getStackTrace();
                return new Pair(aVarN.b(), new C3597b6(((Le) me2).f37288a, EnumC3571a6.f38154d));
            }
        } else {
            if (!(me2 instanceof Ke)) {
                throw new lf.m();
            }
            aVarN.e();
        }
        return new Pair(aVarN.b(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(hh.x r19, hh.z r20, java.lang.String r21, kotlin.coroutines.jvm.internal.d r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4147x4.a(hh.x, hh.z, java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final Object a(Me me2, kotlin.coroutines.jvm.internal.d dVar) {
        hh.x xVar = this.f39891b;
        Pair pairA = a(me2);
        hh.z zVar = (hh.z) pairA.component1();
        C3597b6 c3597b6 = (C3597b6) pairA.component2();
        return c3597b6 != null ? c3597b6 : a(xVar, zVar, me2.c(), dVar);
    }
}
