package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5135h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f77288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77289c;

    public C5135h4(String str, Integer num, String str2) {
        this.f77287a = str;
        this.f77288b = num;
        this.f77289c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5135h4.class == obj.getClass()) {
            C5135h4 c5135h4 = (C5135h4) obj;
            if (!this.f77287a.equals(c5135h4.f77287a)) {
                return false;
            }
            Integer num = this.f77288b;
            if (num == null ? c5135h4.f77288b != null : !num.equals(c5135h4.f77288b)) {
                return false;
            }
            String str = this.f77289c;
            String str2 = c5135h4.f77289c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f77287a.hashCode() * 31;
        Integer num = this.f77288b;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f77289c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
