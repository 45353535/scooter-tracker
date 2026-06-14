package t2;

import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f104804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f104805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Currency f104806c;

    public a(String eventName, double d10, Currency currency) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f104804a = eventName;
        this.f104805b = d10;
        this.f104806c = currency;
    }

    public final double a() {
        return this.f104805b;
    }

    public final Currency b() {
        return this.f104806c;
    }

    public final String c() {
        return this.f104804a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f104804a, aVar.f104804a) && Double.compare(this.f104805b, aVar.f104805b) == 0 && Intrinsics.areEqual(this.f104806c, aVar.f104806c);
    }

    public int hashCode() {
        return (((this.f104804a.hashCode() * 31) + androidx.collection.a.a(this.f104805b)) * 31) + this.f104806c.hashCode();
    }

    public String toString() {
        return "InAppPurchase(eventName=" + this.f104804a + ", amount=" + this.f104805b + ", currency=" + this.f104806c + ')';
    }
}
