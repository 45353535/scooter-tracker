package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class nf2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cp1 f113859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediatedAdapterPrefetcher f113860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2 f113862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oq1 f113863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f113864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qz f113865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f113866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ mx2 f113867j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf2(sf2 sf2Var, oq1 oq1Var, Context context, qz qzVar, long j10, mx2 mx2Var, Continuation continuation) {
        super(2, continuation);
        this.f113862e = sf2Var;
        this.f113863f = oq1Var;
        this.f113864g = context;
        this.f113865h = qzVar;
        this.f113866i = j10;
        this.f113867j = mx2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new nf2(this.f113862e, this.f113863f, this.f113864g, this.f113865h, this.f113866i, this.f113867j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nf2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        int i10 = this.f113861d;
        if (i10 == 0) {
            kotlin.d.b(obj);
            if2 if2Var = this.f113862e.f115788e;
            oq1 oq1Var = this.f113863f;
            if2Var.getClass();
            String str = oq1Var.f114390b;
            cp1 cp1Var = new cp1(str, oq1Var.f114391c, null, null, null, null, null);
            try {
                sf2.a(this.f113862e, cp1Var);
                this.f113862e.f115786c.a(this.f113864g, cp1Var, com.monetization.ads.mediation.base.a.class);
                df2 df2VarA = vo1.a(str);
                this.f113862e.f115784a.a(this.f113864g, this.f113865h, df2VarA, null);
                return df2VarA;
            } catch (IllegalArgumentException e10) {
                return vo1.a(cp1Var.f109504b, e10);
            }
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher = this.f113860c;
        cp1 cp1Var2 = this.f113859b;
        try {
            try {
                kotlin.d.b(obj);
                df2 df2Var = (df2) obj;
                wu wuVar = this.f113862e.f115785b;
                wuVar.f117590a.a(wuVar.f117592c, wuVar.f117591b, null);
                Long lA = this.f113862e.f115785b.a();
                if (df2Var != null) {
                    sf2 sf2Var = this.f113862e;
                    sf2Var.f115784a.a(this.f113864g, this.f113865h, df2Var, lA);
                }
                mediatedAdapterPrefetcher.onInvalidate();
                return df2Var;
            } catch (Throwable th2) {
                mediatedAdapterPrefetcher.onInvalidate();
                throw th2;
            }
        } catch (Exception e11) {
            wu wuVar2 = this.f113862e.f115785b;
            wuVar2.f117590a.a(wuVar2.f117592c, wuVar2.f117591b, null);
            Long lA2 = this.f113862e.f115785b.a();
            df2 df2VarA2 = vo1.a(cp1Var2.f109504b, e11);
            this.f113862e.f115784a.a(this.f113864g, this.f113865h, df2VarA2, lA2);
            mediatedAdapterPrefetcher.onInvalidate();
            return df2VarA2;
        }
    }
}
