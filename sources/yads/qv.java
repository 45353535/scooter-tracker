package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pv f115174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115175b;

    public qv(pv pvVar, String str) {
        this.f115174a = pvVar;
        this.f115175b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv)) {
            return false;
        }
        qv qvVar = (qv) obj;
        return this.f115174a == qvVar.f115174a && Intrinsics.areEqual(this.f115175b, qvVar.f115175b);
    }

    public final int hashCode() {
        int iHashCode = this.f115174a.hashCode() * 31;
        String str = this.f115175b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CloseButtonValue(type=" + this.f115174a + ", text=" + this.f115175b + ")";
    }
}
