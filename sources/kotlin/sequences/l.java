package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    public static final class a implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f93437a;

        public a(Function2 function2) {
            this.f93437a = function2;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return l.a(this.f93437a);
        }
    }

    public static Iterator a(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        i iVar = new i();
        iVar.g(pf.b.b(block, iVar, iVar));
        return iVar;
    }

    public static Sequence b(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new a(block);
    }
}
