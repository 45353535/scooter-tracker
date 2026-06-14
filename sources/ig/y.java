package ig;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    public static final void b(final v vVar, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new Function2() { // from class: ig.x
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(y.c(vVar, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue() == vVar.f74826t) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + vVar.f74825s + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(v vVar, int i10, CoroutineContext.Element element) {
        CoroutineContext.b key = element.getKey();
        CoroutineContext.Element element2 = vVar.f74825s.get(key);
        if (key != Job.N8) {
            if (element != element2) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        Job job = (Job) element2;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        Job jobD = d((Job) element, job);
        if (jobD == job) {
            return job == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + jobD + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final Job d(Job job, Job job2) {
        while (job != null) {
            if (job == job2 || !(job instanceof jg.a0)) {
                return job;
            }
            job = ((jg.a0) job).j0();
        }
        return null;
    }
}
