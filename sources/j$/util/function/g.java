package j$.util.function;

import j$.time.format.r;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f84932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Predicate f84933c;

    public /* synthetic */ g(Predicate predicate, Predicate predicate2, int i10) {
        this.f84931a = i10;
        this.f84932b = predicate;
        this.f84933c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f84931a) {
        }
        return j$.com.android.tools.r8.a.b(this, predicate);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f84931a) {
        }
        return j$.com.android.tools.r8.a.m(this, predicate);
    }

    public final Predicate negate() {
        switch (this.f84931a) {
        }
        return new r(3, this);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f84931a) {
            case 0:
                return this.f84932b.test(obj) && this.f84933c.test(obj);
            default:
                return this.f84932b.test(obj) || this.f84933c.test(obj);
        }
    }
}
