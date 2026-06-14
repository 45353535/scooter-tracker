package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2896ea implements InterfaceC2396Rj {
    public static byte[] A03;
    public static String[] A04 = {"1hpByTARN6eOnQ", "46DvCO0dFj9d90pc7Bl3Va1pW3afVu0G", "LtfSHnVMNf9jD1VPw2QJdb6akNXb3KRw", "UXeRQ2HNaneiXsHAoGvRBzblNiVPPyfq", "WcHPi3i27m6LdaHLnkH9ENRpFxyJu3g8", "FTcDokCppzFM6olvGfJVNXVubstDZ8VZ", "v3Z7C81p3UBYKX6nY0MAEeka3DNz7RKw", "vwYfKziuTy1RLYscQHjTEDI4uYjWuvBq"};
    public final InterfaceC2924f2 A01;
    public Set<InterfaceC2399Rm> A00 = new HashSet();
    public final List<InterfaceC2398Rl> A02 = new ArrayList();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{75, 75, 78, Ascii.CAN, 81, 75, 78, Ascii.CAN, 39, 53, 53, 35, 50, 53};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public synchronized void A03() {
        if (!this.A01.AAV()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC2399Rm> setA01 = A01(this.A01.A7a());
        if (!this.A00.equals(setA01) && setA01 != null) {
            this.A00 = setA01;
            Iterator<InterfaceC2398Rl> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A4B();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC2399Rm interfaceC2399Rm : this.A00) {
                String.format(Locale.US, A00(0, 8, 58), interfaceC2399Rm.A9G(), interfaceC2399Rm.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C2896ea(InterfaceC1990Bn interfaceC1990Bn) {
        this.A01 = interfaceC1990Bn.A5M(EnumC2925f3.A0B);
        this.A01.A3t(new C2943fM(this));
        A03();
    }

    public static Set<InterfaceC2399Rm> A01(JSONObject jSONObject) {
        C2889eT c2889eTA00;
        HashSet hashSet = new HashSet();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(8, 6, 23));
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            int i11 = jSONArrayOptJSONArray.length();
            if (A04[2].charAt(7) != 'M') {
                throw new RuntimeException();
            }
            A04[0] = "HjevAVNXdTQxpc55Yqf8Zim5Y";
            if (i10 < i11) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject == null || (c2889eTA00 = C2889eT.A00(jSONObjectOptJSONObject)) == null) {
                    return null;
                }
                hashSet.add(c2889eTA00);
                i10++;
            } else {
                return hashSet;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2396Rj
    public final void A3s(InterfaceC2398Rl interfaceC2398Rl) {
        this.A02.add(interfaceC2398Rl);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2396Rj
    public final synchronized Set<InterfaceC2399Rm> A6p() {
        return new HashSet(this.A00);
    }
}
