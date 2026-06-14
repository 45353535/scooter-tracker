package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class l72 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m72 f112993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f112994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f112995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo f112996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l72(m72 m72Var, CountDownLatch countDownLatch, ArrayList arrayList, wo woVar, Continuation continuation) {
        super(2, continuation);
        this.f112993b = m72Var;
        this.f112994c = countDownLatch;
        this.f112995d = arrayList;
        this.f112996e = woVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l72(this.f112993b, this.f112994c, this.f112995d, this.f112996e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l72) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        JSONArray jSONArray;
        pf.b.g();
        kotlin.d.b(obj);
        m72 m72Var = this.f112993b;
        CountDownLatch countDownLatch = this.f112994c;
        ArrayList arrayList = this.f112995d;
        wo woVar = this.f112996e;
        m72Var.getClass();
        try {
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                boolean z10 = lb1.f113032a;
            }
            woVar.f117524a.set(true);
            synchronized (m72Var.f113345b) {
                jSONArray = new JSONArray((Collection) arrayList);
            }
            return jSONArray;
        } catch (InterruptedException unused) {
            boolean z11 = lb1.f113032a;
            return null;
        }
    }
}
