package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: loaded from: classes12.dex */
public final class X3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f76659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f76661e;

    public X3(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f76657a = str;
        this.f76658b = str2;
        this.f76659c = num;
        this.f76660d = str3;
        this.f76661e = counterConfigurationReporterType;
    }

    public static X3 a(P3 p32) {
        return new X3(p32.f76218b.getApiKey(), p32.f76217a.f75824a.getAsString("PROCESS_CFG_PACKAGE_NAME"), p32.f76217a.f75824a.getAsInteger("PROCESS_CFG_PROCESS_ID"), p32.f76217a.f75824a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), p32.f76218b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X3.class == obj.getClass()) {
            X3 x32 = (X3) obj;
            String str = this.f76657a;
            if (str == null ? x32.f76657a != null : !str.equals(x32.f76657a)) {
                return false;
            }
            if (!this.f76658b.equals(x32.f76658b)) {
                return false;
            }
            Integer num = this.f76659c;
            if (num == null ? x32.f76659c != null : !num.equals(x32.f76659c)) {
                return false;
            }
            String str2 = this.f76660d;
            if (str2 == null ? x32.f76660d != null : !str2.equals(x32.f76660d)) {
                return false;
            }
            if (this.f76661e == x32.f76661e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f76657a;
        int iHashCode = (this.f76658b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        Integer num = this.f76659c;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f76660d;
        return this.f76661e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f76657a + "', mPackageName='" + this.f76658b + "', mProcessID=" + this.f76659c + ", mProcessSessionID='" + this.f76660d + "', mReporterType=" + this.f76661e + '}';
    }
}
