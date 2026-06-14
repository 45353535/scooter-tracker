package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class m72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp1 f113344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f113345b;

    public /* synthetic */ m72(jn1 jn1Var) {
        this(new hp1(jn1Var));
    }

    public final Object a(Context context, mx2 mx2Var, List list, Continuation continuation) {
        final ArrayList arrayList = new ArrayList(list.size());
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        wo woVar = new wo();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wo woVar2 = woVar;
            this.f113344a.a(context, mx2Var, (cp1) it.next(), woVar2, new fp1() { // from class: yads.kl
                @Override // yads.fp1
                public final void a(JSONObject jSONObject) {
                    m72.a(this.f112740a, countDownLatch, arrayList, jSONObject);
                }
            });
            woVar = woVar2;
        }
        return eg.g.g(eg.o0.b(), new l72(this, countDownLatch, arrayList, woVar, null), continuation);
    }

    public m72(hp1 hp1Var) {
        this.f113344a = hp1Var;
        this.f113345b = new Object();
    }

    public static final void a(m72 m72Var, CountDownLatch countDownLatch, ArrayList arrayList, JSONObject jSONObject) {
        if (jSONObject != null) {
            synchronized (m72Var.f113345b) {
                arrayList.add(jSONObject);
            }
        }
        countDownLatch.countDown();
    }
}
