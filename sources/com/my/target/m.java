package com.my.target;

import com.my.target.common.models.IAdLoadingError;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements IAdLoadingError {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f60098c = new m(1000);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f60099d = new m(1002);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f60100e = new m(1003);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f60101f = new m(IAdLoadingError.LoadErrorType.FORBIDDEN);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f60102g = new m(IAdLoadingError.LoadErrorType.NOT_FOUND);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f60103h = new m(1500);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f60104i = new m(2000);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m f60105j = new m(2001);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m f60106k = new m(2002);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m f60107l = new m(2003);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m f60108m = new m(2004);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m f60109n = new m(2005);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m f60110o = new m(3000);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m f60111p = new m(3001);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m f60112q = new m(3002);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m f60113r = new m(3003);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m f60114s = new m(3004);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m f60115t = new m(4001);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m f60116u = new m(5000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60118b;

    public m(int i10) {
        this.f60117a = i10;
        this.f60118b = a(i10);
    }

    public static m a(int i10, String str) {
        return new m(i10, str);
    }

    @Override // com.my.target.common.models.IAdLoadingError
    public int getCode() {
        return this.f60117a;
    }

    @Override // com.my.target.common.models.IAdLoadingError
    public String getMessage() {
        return this.f60118b;
    }

    public String toString() {
        return "AdLoadingError{code=" + this.f60117a + ", message='" + this.f60118b + "'}";
    }

    public static String a(int i10) {
        if (i10 == 1403) {
            return "request forbidden error";
        }
        if (i10 == 1404) {
            return "request not found error";
        }
        if (i10 == 1500) {
            return "internal error";
        }
        if (i10 == 4001) {
            return "reloading not allowed error";
        }
        if (i10 == 5000) {
            return "undefined mediation error";
        }
        if (i10 == 5001) {
            return "ad not loaded from mediation network";
        }
        switch (i10) {
            case 1000:
                return "undefined network error";
            case 1001:
                return "invalid url error";
            case 1002:
                return "hasn't network connection error";
            case 1003:
                return "request timeout error";
            default:
                switch (i10) {
                    case 2000:
                        return "undefined parse error";
                    case 2001:
                        return "empty response error";
                    case 2002:
                        return "invalid json error";
                    case 2003:
                        return "invalid xml error";
                    case 2004:
                        return "invalid ad type error";
                    case 2005:
                        return "required field missed";
                    default:
                        switch (i10) {
                            case 3000:
                                return "undefined data error";
                            case 3001:
                                return "hasn't images error";
                            case 3002:
                                return "hasn't html source error";
                            case 3003:
                                return "hasn't banners error";
                            case 3004:
                                return "invalid banner type error";
                            default:
                                return "undefined error";
                        }
                }
        }
    }

    public m(int i10, String str) {
        this.f60117a = i10;
        this.f60118b = str;
    }
}
