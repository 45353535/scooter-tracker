package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;

/* JADX INFO: loaded from: classes6.dex */
public class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f9124b;

    public j3(String str, MaxAdFormat maxAdFormat) {
        this.f9123a = str;
        this.f9124b = maxAdFormat;
    }

    protected boolean a(Object obj) {
        return obj instanceof j3;
    }

    public String b() {
        return this.f9123a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        if (!j3Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = j3Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = j3Var.a();
        return maxAdFormatA != null ? maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 == null;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        MaxAdFormat maxAdFormatA = a();
        return ((iHashCode + 59) * 59) + (maxAdFormatA != null ? maxAdFormatA.hashCode() : 43);
    }

    public String toString() {
        return this.f9123a + TokenBuilder.TOKEN_DELIMITER + this.f9124b.getLabel();
    }

    public MaxAdFormat a() {
        return this.f9124b;
    }

    public static j3 a(String str) {
        String[] strArrSplit = str.split(TokenBuilder.TOKEN_DELIMITER);
        return new j3(strArrSplit[0], MaxAdFormat.formatFromString(strArrSplit[1]));
    }
}
