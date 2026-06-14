package yads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ds1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f110046a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f110047b = new ArrayList();

    public final void a(b51 b51Var) {
        synchronized (this.f110046a) {
            this.f110047b.add(b51Var);
        }
    }
}
