package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface F9 extends Hb<Integer, Integer> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f40877a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40878b = 2201;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f40879c = 2203;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f40880d = 2005;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f40881e = 2210;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f40882f = 2006;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f40883g = 2204;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f40884h = 2507;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f40885i = 2211;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f40886j = 2212;

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f40887a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40888b = 2002;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f40889c = 2003;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f40890d = 2200;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f40891e = 2503;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f40892f = 2504;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f40893g = 2300;

        private b() {
        }
    }

    public static final class c implements F9 {
        @Override // com.ironsource.Hb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }

        @NotNull
        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = b.f40891e;
            } else if (i10 == 207) {
                i11 = b.f40892f;
            } else if (i10 == 401) {
                i11 = 2201;
            } else if (i10 == 410) {
                i11 = a.f40885i;
            } else if (i10 != 411) {
                switch (i10) {
                    case 101:
                        i11 = d.f40895b;
                        break;
                    case 102:
                        i11 = d.f40896c;
                        break;
                    case 103:
                        i11 = d.f40901h;
                        break;
                    case 104:
                        i11 = d.f40897d;
                        break;
                    case 105:
                        i11 = d.f40898e;
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
                                i11 = d.f40902i;
                                break;
                            case 112:
                                i11 = d.f40903j;
                                break;
                            default:
                                switch (i10) {
                                    case 201:
                                        i11 = 2002;
                                        break;
                                    case 202:
                                        i11 = 2003;
                                        break;
                                    case 203:
                                        i11 = 2200;
                                        break;
                                    case 204:
                                        i11 = b.f40893g;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 403:
                                                i11 = 2203;
                                                break;
                                            case 404:
                                                i11 = 2005;
                                                break;
                                            case 405:
                                                i11 = a.f40881e;
                                                break;
                                            case 406:
                                                i11 = 2006;
                                                break;
                                            case 407:
                                                i11 = a.f40883g;
                                                break;
                                            case 408:
                                                i11 = a.f40884h;
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
                i11 = a.f40886j;
            }
            return Integer.valueOf(i11);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f40894a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40895b = 82500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f40896c = 82510;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f40897d = 82300;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f40898e = 82002;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f40899f = 83004;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f40900g = 88002;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f40901h = 82301;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f40902i = 82302;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f40903j = 82076;

        private d() {
        }
    }
}
