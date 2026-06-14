package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2512Vy {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C2512Vy> A02 = new ThreadLocal<>();
    public final C2495Vh A00 = new C2495Vh();

    public static C2495Vh A00() {
        return A02().A00;
    }

    public static C2495Vh A01(C2511Vx c2511Vx) {
        C2495Vh currentStackTraces = new C2495Vh(A00());
        currentStackTraces.add(c2511Vx);
        return currentStackTraces;
    }

    public static C2512Vy A02() {
        C2512Vy c2512Vy = A02.get();
        if (c2512Vy == null) {
            C2512Vy c2512Vy2 = new C2512Vy();
            A02.set(c2512Vy2);
            return c2512Vy2;
        }
        return c2512Vy;
    }

    public static void A03(AbstractRunnableC2507Vt abstractRunnableC2507Vt) {
        C2495Vh c2495VhA06 = abstractRunnableC2507Vt.A06();
        if (c2495VhA06 != null) {
            C2495Vh createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(c2495VhA06);
        }
    }

    public static void A04(AbstractRunnableC2507Vt abstractRunnableC2507Vt) {
        C2495Vh c2495VhA06 = abstractRunnableC2507Vt.A06();
        if (c2495VhA06 != null) {
            C2495Vh c2495Vh = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            c2495Vh.removeAll(c2495VhA06);
        }
    }
}
