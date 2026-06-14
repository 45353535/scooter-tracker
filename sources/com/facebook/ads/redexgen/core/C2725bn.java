package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2725bn implements InterfaceC2419Sh {
    public static byte[] A04;
    public Context A00;
    public final InterfaceC2418Sg A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C2416Se A01 = A00();

    static {
        A03();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{113, 101, 122, 106, 102, 112, 97, 97, 124, 123, 114, 102, 106, 126, 112, 108};
    }

    public C2725bn(Context context, InterfaceC2418Sg interfaceC2418Sg) {
        this.A00 = context;
        this.A02 = interfaceC2418Sg;
    }

    private C2416Se A00() {
        return C2416Se.A00(AbstractC2492Ve.A00(this.A00).getString(A01(0, 16, 100), null));
    }

    private void A02() {
        this.A02.ABw(new C2782ci(this));
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C2416Se c2416Se = new C2416Se(strArr, num, num2);
        C2416Se newSettings = this.A01;
        if (c2416Se.equals(newSettings)) {
            return;
        }
        this.A01 = c2416Se;
        this.A03.set(true);
        SharedPreferences.Editor editorEdit = AbstractC2492Ve.A00(this.A00).edit();
        C2416Se newSettings2 = this.A01;
        editorEdit.putString(A01(0, 16, 100), newSettings2.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2419Sh
    public final C2416Se A7c() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2419Sh
    public final boolean AAY() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> setA0a = U7.A0a(this.A00);
        String identifier = this.A01.A07();
        Iterator<String> it = setA0a.iterator();
        while (it.hasNext()) {
            if (identifier.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2419Sh
    public final boolean AJC() {
        A02();
        return this.A03.getAndSet(false);
    }
}
