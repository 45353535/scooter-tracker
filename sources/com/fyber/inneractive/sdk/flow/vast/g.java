package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.t;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21014c;

    public g(int i10, int i11, int i12) {
        this.f21012a = i10;
        this.f21013b = i11;
        this.f21014c = i12;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        int i10 = -1;
        if (!TextUtils.equals("VPAID", rVar2.f21231f)) {
            if (!TextUtils.equals("VPAID", rVar.f21231f)) {
                Integer num = rVar.f21230e;
                int iIntValue = num == null ? 0 : num.intValue();
                Integer num2 = rVar2.f21230e;
                int iIntValue2 = num2 == null ? 0 : num2.intValue();
                int i11 = this.f21012a;
                if (iIntValue2 <= i11 || iIntValue > i11) {
                    if (iIntValue <= i11 || iIntValue2 > i11) {
                        t tVarA = t.a(rVar2.f21229d);
                        t tVar = t.MEDIA_TYPE_MP4;
                        Integer num3 = tVarA == tVar ? 3 : tVarA == t.MEDIA_TYPE_3GPP ? 2 : tVarA == t.MEDIA_TYPE_WEBM ? 1 : -1;
                        t tVarA2 = t.a(rVar.f21229d);
                        if (tVarA2 == tVar) {
                            i10 = 3;
                        } else if (tVarA2 == t.MEDIA_TYPE_3GPP) {
                            i10 = 2;
                        } else if (tVarA2 == t.MEDIA_TYPE_WEBM) {
                            i10 = 1;
                        }
                        int iCompareTo = num3.compareTo(i10);
                        if (iCompareTo != 0) {
                            return iCompareTo;
                        }
                        if (iIntValue >= iIntValue2) {
                            if (iIntValue <= iIntValue2) {
                                Integer num4 = rVar.f21227b;
                                int iIntValue3 = num4 == null ? 0 : num4.intValue();
                                Integer num5 = rVar.f21228c;
                                int iIntValue4 = num5 == null ? 0 : num5.intValue();
                                Integer num6 = rVar2.f21227b;
                                int iIntValue5 = num6 == null ? 0 : num6.intValue();
                                Integer num7 = rVar2.f21228c;
                                int i12 = iIntValue3 * iIntValue4;
                                int iIntValue6 = iIntValue5 * (num7 == null ? 0 : num7.intValue());
                                int i13 = this.f21013b * this.f21014c;
                                int iAbs = Math.abs(i12 - i13);
                                int iAbs2 = Math.abs(iIntValue6 - i13);
                                if (iAbs >= iAbs2) {
                                    if (iAbs <= iAbs2) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
