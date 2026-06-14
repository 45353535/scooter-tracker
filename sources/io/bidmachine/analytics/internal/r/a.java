package io.bidmachine.analytics.internal.r;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f79872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC0965a f79873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f79874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f79875d;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.r.a$a, reason: collision with other inner class name */
    public enum EnumC0965a {
        INAPP_CONSUMABLE,
        INAPP_NON_CONSUMABLE,
        SUBS_AUTO_RENEWABLE,
        SUBS_NON_AUTO_RENEWABLE
    }

    public a(String str, EnumC0965a enumC0965a, Date date, boolean z10) {
        this.f79872a = str;
        this.f79873b = enumC0965a;
        this.f79874c = date;
        this.f79875d = z10;
    }

    public final a a(String str, EnumC0965a enumC0965a, Date date, boolean z10) {
        return new a(str, enumC0965a, date, z10);
    }

    public final EnumC0965a b() {
        return this.f79873b;
    }

    public final boolean c() {
        return this.f79875d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f79872a, aVar.f79872a) && this.f79873b == aVar.f79873b && Intrinsics.areEqual(this.f79874c, aVar.f79874c) && this.f79875d == aVar.f79875d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.f79872a.hashCode() * 31) + this.f79873b.hashCode()) * 31) + this.f79874c.hashCode()) * 31;
        boolean z10 = this.f79875d;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ a a(a aVar, String str, EnumC0965a enumC0965a, Date date, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f79872a;
        }
        if ((i10 & 2) != 0) {
            enumC0965a = aVar.f79873b;
        }
        if ((i10 & 4) != 0) {
            date = aVar.f79874c;
        }
        if ((i10 & 8) != 0) {
            z10 = aVar.f79875d;
        }
        return aVar.a(str, enumC0965a, date, z10);
    }

    public final Date a() {
        return this.f79874c;
    }
}
