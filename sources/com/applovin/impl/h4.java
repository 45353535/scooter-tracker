package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes6.dex */
public class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f8980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f8981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8982c;

    public h4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f8980a = view;
        this.f8981b = friendlyObstructionPurpose;
        this.f8982c = str;
    }

    public String a() {
        return this.f8982c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f8981b;
    }

    public View c() {
        return this.f8980a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h4 h4Var = (h4) obj;
            View view = this.f8980a;
            if (view == null ? h4Var.f8980a != null : !view.equals(h4Var.f8980a)) {
                return false;
            }
            if (this.f8981b != h4Var.f8981b) {
                return false;
            }
            String str = this.f8982c;
            String str2 = h4Var.f8982c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        View view = this.f8980a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f8981b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f8982c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
