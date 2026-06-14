package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class hy {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private a f2445;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ia f2446;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hm f2447;

    static class a {

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private Object f2450;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Class f2457;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Class f2458;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private List<String> f2459;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private Class f2460;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private int f2461;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private int f2453 = -1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private int f2456 = -1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private int f2452 = -1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private int f2454 = -1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private int f2455 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private int f2449 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private int f2451 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private boolean f2448 = true;

        a() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f2461 != aVar.f2461 || this.f2453 != aVar.f2453 || this.f2456 != aVar.f2456 || this.f2452 != aVar.f2452 || this.f2454 != aVar.f2454 || this.f2455 != aVar.f2455 || this.f2449 != aVar.f2449 || this.f2451 != aVar.f2451 || this.f2448 != aVar.f2448) {
                    return false;
                }
                Class cls = this.f2458;
                if (cls == null ? aVar.f2458 != null : !cls.equals(aVar.f2458)) {
                    return false;
                }
                Class cls2 = this.f2460;
                if (cls2 == null ? aVar.f2460 != null : !cls2.equals(aVar.f2460)) {
                    return false;
                }
                Class cls3 = this.f2457;
                if (cls3 == null ? aVar.f2457 != null : !cls3.equals(aVar.f2457)) {
                    return false;
                }
                List<String> list = this.f2459;
                if (list == null ? aVar.f2459 != null : !list.equals(aVar.f2459)) {
                    return false;
                }
                Object obj2 = this.f2450;
                Object obj3 = aVar.f2450;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                if (obj3 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Class cls = this.f2458;
            int iHashCode = (cls != null ? cls.hashCode() : 0) * 31;
            Class cls2 = this.f2460;
            int iHashCode2 = (iHashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
            Class cls3 = this.f2457;
            int iHashCode3 = (iHashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
            List<String> list = this.f2459;
            int iHashCode4 = (((((((((((((((((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f2461) * 31) + this.f2453) * 31) + this.f2456) * 31) + this.f2452) * 31) + this.f2454) * 31) + this.f2455) * 31) + this.f2449) * 31) + this.f2451) * 31) + (this.f2448 ? 1 : 0)) * 31;
            Object obj = this.f2450;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private hy f2462 = new hy(0);

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public final c m6702(int i10) {
            this.f2462.f2445.f2455 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public final c m6703(int i10) {
            this.f2462.f2445.f2451 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final c m6705(int i10) {
            this.f2462.f2445.f2452 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final c m6709(int i10) {
            this.f2462.f2445.f2454 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final c m6711(int i10) {
            this.f2462.f2445.f2453 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final c m6714(int i10) {
            this.f2462.f2445.f2449 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final c m6716(int i10) {
            this.f2462.f2445.f2456 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public final c m6704(boolean z10) {
            this.f2462.f2445.f2448 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final c m6706(Object obj) {
            this.f2462.f2445.f2450 = obj;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final c m6710(boolean z10) {
            this.f2462.f2445.f2451 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final hy m6713(ia iaVar, List<String> list, int i10) {
            return m6708(iaVar, null, list, i10);
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final c m6715(boolean z10) {
            this.f2462.f2445.f2454 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final c m6717(boolean z10) {
            this.f2462.f2445.f2449 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final hy m6708(ia iaVar, hm hmVar, List<String> list, int i10) {
            this.f2462.f2446 = iaVar;
            this.f2462.f2447 = hmVar;
            this.f2462.f2445.f2459 = list;
            this.f2462.f2445.f2461 = i10;
            this.f2462.f2445.f2460 = iaVar.getClass();
            this.f2462.f2445.f2457 = hmVar != null ? hmVar.getClass() : null;
            return this.f2462;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final c m6712(boolean z10) {
            this.f2462.f2445.f2455 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final c m6707(boolean z10) {
            this.f2462.f2445.f2456 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }
    }

    /* synthetic */ hy(byte b10) {
        this();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m6664(int i10, int i11) {
        return i10 >= i11;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m6666(int i10) {
        return m6664(i10, this.f2445.f2455);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ia m6667() {
        return this.f2446;
    }

    private hy() {
        this.f2445 = new a();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m6668(int i10) {
        return m6664(i10, this.f2445.f2449);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m6669(int i10) {
        if (m6664(i10, this.f2445.f2456)) {
            return this.f2445.f2452;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m6671() {
        return this.f2445.f2459;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m6673() {
        return this.f2445.f2461;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final hm m6676() {
        return this.f2447;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m6672(int i10) {
        return m6664(i10, this.f2445.f2451);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m6675(int i10) {
        return m6664(i10, this.f2445.f2453);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m6677(int i10) {
        return m6664(i10, this.f2445.f2454);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m6670() {
        return this.f2445.f2448;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final a m6674(Class cls) {
        this.f2445.f2458 = cls;
        return this.f2445;
    }
}
