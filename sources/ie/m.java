package ie;

import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {
    public static final c b(le.k engineFactory, Function1 block) {
        Intrinsics.checkNotNullParameter(engineFactory, "engineFactory");
        Intrinsics.checkNotNullParameter(block, "block");
        i iVar = new i();
        block.invoke(iVar);
        final le.b bVarA = engineFactory.a(iVar.g());
        c cVar = new c(bVarA, iVar, true);
        CoroutineContext.Element element = cVar.getCoroutineContext().get(Job.N8);
        Intrinsics.checkNotNull(element);
        ((Job) element).q(new Function1() { // from class: ie.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.c(bVarA, (Throwable) obj);
            }
        });
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(le.b bVar, Throwable th2) throws IOException {
        bVar.close();
        return Unit.f93236a;
    }
}
