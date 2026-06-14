package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface Sd extends Hb<Integer, Integer> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f41741a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41742b = 1201;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f41743c = 1202;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f41744d = 1005;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f41745e = 1206;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f41746f = 1006;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f41747g = 1203;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f41748h = 1507;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f41749i = 1010;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f41750j = 1210;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f41751k = 1211;

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f41752a = new b();

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f41753a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41754b = 1001;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f41755c = 1002;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f41756d = 1200;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f41757e = 1301;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f41758f = 1503;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f41759g = 1504;

        private c() {
        }
    }

    public static final class d implements Sd {
        @Override // com.ironsource.Hb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }

        @NotNull
        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = c.f41758f;
            } else if (i10 == 207) {
                i11 = c.f41759g;
            } else if (i10 != 401) {
                switch (i10) {
                    case 101:
                        i11 = e.f41761b;
                        break;
                    case 102:
                        i11 = e.f41762c;
                        break;
                    case 103:
                        i11 = e.f41763d;
                        break;
                    case 104:
                        i11 = e.f41764e;
                        break;
                    case 105:
                        i11 = e.f41765f;
                        break;
                    default:
                        switch (i10) {
                            case 109:
                                i11 = 88002;
                                break;
                            case 110:
                                i11 = e.f41767h;
                                break;
                            case 111:
                                i11 = e.f41768i;
                                break;
                            case 112:
                                i11 = e.f41769j;
                                break;
                            default:
                                switch (i10) {
                                    case 201:
                                        i11 = 1001;
                                        break;
                                    case 202:
                                        i11 = 1002;
                                        break;
                                    case 203:
                                        i11 = c.f41756d;
                                        break;
                                    case 204:
                                        i11 = c.f41757e;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 403:
                                                i11 = a.f41743c;
                                                break;
                                            case 404:
                                                i11 = 1005;
                                                break;
                                            case 405:
                                                i11 = a.f41745e;
                                                break;
                                            case 406:
                                                i11 = 1006;
                                                break;
                                            case 407:
                                                i11 = a.f41747g;
                                                break;
                                            case 408:
                                                i11 = a.f41748h;
                                                break;
                                            case 409:
                                                i11 = 1010;
                                                break;
                                            case 410:
                                                i11 = a.f41750j;
                                                break;
                                            case 411:
                                                i11 = a.f41751k;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Unknown event code: " + i10);
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                i11 = a.f41742b;
            }
            return Integer.valueOf(i11);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f41760a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41761b = 81500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f41762c = 81510;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f41763d = 81301;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f41764e = 81300;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f41765f = 81002;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f41766g = 88002;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f41767h = 83003;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f41768i = 81302;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f41769j = 81077;

        private e() {
        }
    }
}
