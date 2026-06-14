package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class qf2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f114984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f114985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf2 f114986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f114987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qz f114988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mx2 f114989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f114990h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf2(long j10, Context context, qz qzVar, mx2 mx2Var, sf2 sf2Var, List list, Continuation continuation) {
        super(2, continuation);
        this.f114985c = list;
        this.f114986d = sf2Var;
        this.f114987e = context;
        this.f114988f = qzVar;
        this.f114989g = mx2Var;
        this.f114990h = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        List list = this.f114985c;
        sf2 sf2Var = this.f114986d;
        qf2 qf2Var = new qf2(this.f114990h, this.f114987e, this.f114988f, this.f114989g, sf2Var, list, continuation);
        qf2Var.f114984b = obj;
        return qf2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qf2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f114984b;
        List<oq1> list = this.f114985c;
        sf2 sf2Var = this.f114986d;
        Context context = this.f114987e;
        qz qzVar = this.f114988f;
        mx2 mx2Var = this.f114989g;
        long j10 = this.f114990h;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (oq1 oq1Var : list) {
            sf2Var.getClass();
            arrayList.add(eg.i.b(coroutineScope, null, null, new nf2(sf2Var, oq1Var, context, qzVar, j10, mx2Var, null), 3, null));
            sf2Var = sf2Var;
            context = context;
            qzVar = qzVar;
            mx2Var = mx2Var;
            j10 = j10;
        }
        return arrayList;
    }
}
