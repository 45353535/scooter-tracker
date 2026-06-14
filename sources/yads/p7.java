package yads;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class p7 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d8 f114574b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(d8 d8Var) {
        super(1);
        this.f114574b = d8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj;
        Iterator it = this.f114574b.f109828g.iterator();
        while (it.hasNext()) {
            kotlinx.serialization.json.i.a(cVar, (String) it.next());
        }
        return Unit.f93236a;
    }
}
