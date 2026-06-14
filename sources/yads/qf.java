package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qf {
    public static void a(Context context, mr1 mr1Var) {
        of ofVar;
        CoroutineDispatcher coroutineDispatcherB = eg.o0.b();
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.b()).plus(new k10(mr1Var)));
        cf cfVar = new cf(coroutineDispatcherB, new Handler(Looper.getMainLooper()));
        Cif cif = new Cif(mr1Var);
        p33 p33Var = new p33();
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA == null || !hr2VarA.f111726f0) {
            return;
        }
        Long l10 = hr2VarA.f111728g0;
        long jLongValue = l10 != null ? l10.longValue() : 1000L;
        Long l11 = hr2VarA.f111730h0;
        long jLongValue2 = l11 != null ? l11.longValue() : 6000L;
        Set setEmptySet = hr2VarA.f111742n0;
        if (setEmptySet == null) {
            setEmptySet = SetsKt.emptySet();
        }
        Set set = setEmptySet;
        Object obj2 = of.f114286j;
        of ofVar2 = of.f114287k;
        if (ofVar2 == null) {
            synchronized (of.f114286j) {
                ofVar = of.f114287k;
                if (ofVar == null) {
                    of ofVar3 = new of(jLongValue, jLongValue2, set, coroutineScopeA, cfVar, cif, p33Var);
                    of.f114287k = ofVar3;
                    ofVar = ofVar3;
                }
            }
            ofVar2 = ofVar;
        }
        if (ofVar2.f114296i.getAndSet(true)) {
            return;
        }
        eg.i.d(ofVar2.f114291d, ofVar2.f114295h, null, new mf(ofVar2, null), 2, null).q(new nf(ofVar2));
    }
}
