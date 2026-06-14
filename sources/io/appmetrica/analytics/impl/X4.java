package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* JADX INFO: loaded from: classes12.dex */
public class X4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76663b;

    public X4(String str, String str2) {
        this.f76662a = str;
        this.f76663b = str2;
    }

    @NonNull
    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f76663b);
    }

    @Nullable
    public final String b() {
        return this.f76663b;
    }

    public final String c() {
        return this.f76662a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f76662a + "_" + ApiKeyUtils.createPartialApiKey(this.f76663b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            X4 x42 = (X4) obj;
            String str = this.f76662a;
            if (str == null ? x42.f76662a != null : !str.equals(x42.f76662a)) {
                return false;
            }
            String str2 = this.f76663b;
            String str3 = x42.f76663b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f76662a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f76663b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f76662a + "_" + this.f76663b;
    }
}
