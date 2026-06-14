package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer[] f21247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21248b;

    public z(String str) throws y {
        this.f21247a = new Integer[0];
        if (TextUtils.isEmpty(str) || !str.matches("^[0-9.]+$")) {
            throw new y();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split("\\.")) {
            arrayList.add(Integer.valueOf(com.fyber.inneractive.sdk.util.v.a(str2, 0)));
        }
        this.f21247a = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
        this.f21248b = str;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(z zVar) {
        if (zVar == null) {
            return 1;
        }
        int iMax = Math.max(this.f21247a.length, zVar.f21247a.length);
        int i10 = 0;
        while (i10 < iMax) {
            Integer[] numArr = this.f21247a;
            int iIntValue = numArr.length > i10 ? numArr[i10].intValue() : 0;
            Integer[] numArr2 = zVar.f21247a;
            int iIntValue2 = numArr2.length > i10 ? numArr2[i10].intValue() : 0;
            if (iIntValue > iIntValue2) {
                return 1;
            }
            if (iIntValue2 > iIntValue) {
                return -1;
            }
            i10++;
        }
        return 0;
    }

    public final String toString() {
        return this.f21248b;
    }
}
