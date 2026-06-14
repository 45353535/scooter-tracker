package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2732bu {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C2731bt>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C2731bt>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C2731bt A01(C2820dL c2820dL, AbstractC3095hy abstractC3095hy, int i10, InterfaceC2729br interfaceC2729br) {
        C2731bt c2731bt = new C2731bt(c2820dL, abstractC3095hy, c2820dL.A02().A0A(), i10);
        c2731bt.A0b(interfaceC2729br);
        c2731bt.A0X();
        A01.put(abstractC3095hy.A17(), new WeakReference<>(c2731bt));
        return c2731bt;
    }

    public static C2731bt A02(String str) {
        WeakReference<C2731bt> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC3095hy abstractC3095hy, C2731bt c2731bt) {
        A01.put(abstractC3095hy.A17(), new WeakReference<>(c2731bt));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
