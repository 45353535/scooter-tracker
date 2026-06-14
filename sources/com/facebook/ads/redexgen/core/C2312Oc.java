package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2312Oc implements Parcelable.ClassLoaderCreator<AbsSavedState> {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{Ascii.ETB, Ascii.EM, Ascii.DC4, 9, Ascii.SYN, -9, Ascii.CAN, 5, Ascii.CAN, 9, -60, 17, Ascii.EM, Ascii.ETB, Ascii.CAN, -60, 6, 9, -60, Ascii.DC2, Ascii.EM, Ascii.DLE, Ascii.DLE};
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final AbsSavedState createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        Parcelable superState = parcel.readParcelable(classLoader);
        if (superState == null) {
            return AbsSavedState.A02;
        }
        throw new IllegalStateException(A02(0, 23, 86));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final AbsSavedState[] newArray(int i10) {
        return new AbsSavedState[i10];
    }
}
