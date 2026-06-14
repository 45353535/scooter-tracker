package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface W2 extends Hb<Integer, Integer> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f41917a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41918b = 3009;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f41919c = 3008;

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f41920a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41921b = 3002;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f41922c = 3005;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f41923d = 3300;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f41924e = 3503;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f41925f = 3504;

        private b() {
        }
    }

    public static final class c implements W2 {
        @Override // com.ironsource.Hb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }

        @NotNull
        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = b.f41924e;
            } else if (i10 == 207) {
                i11 = b.f41925f;
            } else if (i10 == 405) {
                i11 = 3009;
            } else if (i10 != 406) {
                switch (i10) {
                    case 101:
                        i11 = 83500;
                        break;
                    case 102:
                        i11 = 83510;
                        break;
                    case 103:
                        i11 = d.f41933h;
                        break;
                    case 104:
                        i11 = 83300;
                        break;
                    default:
                        switch (i10) {
                            case 109:
                                i11 = 88002;
                                break;
                            case 110:
                                i11 = 83004;
                                break;
                            case 111:
                                break;
                            case 112:
                                i11 = 3305;
                                break;
                            default:
                                switch (i10) {
                                    case 201:
                                        i11 = 3002;
                                        break;
                                    case 202:
                                        i11 = 3005;
                                        break;
                                    case 203:
                                        i11 = 3300;
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Unknown event code: " + i10);
                                }
                                break;
                        }
                    case 105:
                        i11 = 83302;
                        break;
                }
            } else {
                i11 = 3008;
            }
            return Integer.valueOf(i11);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f41926a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41927b = 83500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f41928c = 83510;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f41929d = 83300;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f41930e = 83302;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f41931f = 83004;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f41932g = 88002;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f41933h = 83301;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f41934i = 83302;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f41935j = 3305;

        private d() {
        }
    }
}
