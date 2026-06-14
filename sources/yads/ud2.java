package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ud2 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ud2 f116619b = new ud2();

    public ud2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        Iterator<E> it = td2.f116211d.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List list = ((td2) next).f116212b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        Class.forName((String) it2.next());
                        break loop0;
                    } catch (ClassNotFoundException unused) {
                    } catch (Throwable unused2) {
                        boolean z10 = lb1.f113032a;
                    }
                }
            }
        }
        return (td2) next;
    }
}
