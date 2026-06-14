package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa f117322a;

    public w53(xa xaVar) {
        this.f117322a = xaVar;
    }

    public final void a(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f117322a.a((String) it.next(), x53.f117714d);
            }
        }
    }
}
