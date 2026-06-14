package le;

import eg.e0;
import eg.s;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.z;
import ve.u;
import ve.x0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f94194a = new e0("call-context");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ze.a f94195b;

    static {
        KType kTypeP;
        KClass kClassB = v0.b(ie.i.class);
        try {
            kTypeP = v0.p(ie.i.class, KTypeProjection.INSTANCE.getSTAR());
        } catch (Throwable unused) {
            kTypeP = null;
        }
        f94195b = new ze.a("client-config", new ff.a(kClassB, kTypeP));
    }

    public static final Object b(b bVar, Job job, Continuation continuation) {
        s sVarA = z.a(job);
        CoroutineContext coroutineContextPlus = bVar.getCoroutineContext().plus(sVarA).plus(f94194a);
        Job job2 = (Job) continuation.getContext().get(Job.N8);
        if (job2 == null) {
            return coroutineContextPlus;
        }
        sVarA.q(new p(Job.a.d(job2, true, false, new q(sVarA), 2, null)));
        return coroutineContextPlus;
    }

    public static final ze.a c() {
        return f94195b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(re.e eVar) {
        Set setNames = eVar.e().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setNames) {
            if (u.f106718a.w().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new x0(arrayList.toString());
        }
    }
}
