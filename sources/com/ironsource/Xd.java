package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes8.dex */
public class Xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f42067a = new a(2001, a("initsdk"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f42068b = new a(2026, a("sdkrecoverstart"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f42069c = new a(2002, a("createcontrollerweb"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f42070d = new a(2003, a("createcontrollernative"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f42071e = new a(2004, a("controllerstageready"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f42072f = new a(2005, a("loadad"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static a f42073g = new a(2006, a("loadadfailed"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f42074h = new a(2007, a("initproduct"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static a f42075i = new a(2008, a("initproductfailed"));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static a f42076j = new a(2009, a("loadproduct"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static a f42077k = new a(2010, a("parseadmfailed"));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static a f42078l = new a(2011, a("loadadsuccess"));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static a f42079m = new a(2027, a("destroyproduct"));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static a f42080n = new a(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, a("registerad"));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static a f42081o = new a(2013, a("controllerfailed"));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static a f42082p = new a(2015, a("appendnativefeaturesdatafailed"));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static a f42083q = new a(2016, a("adunitcouldnotloadtowebview"));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static a f42084r = new a(2017, a("webviewcleanupfailed"));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static a f42085s = new a(2018, a("removewebviewfailed"));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static a f42086t = new a(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, a("banneralreadydestroyed"));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static a f42087u = new a(2021, a("fialedregactlifecycle"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static a f42088v = new a(2022, a("loadcontrollerhtml"));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static a f42089w = new a(2023, a("controllerhtmlsuccess"));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static a f42090x = new a(2024, a("controllerhtmlfailed"));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static a f42091y = new a(2025, a("webviewcrashrpg"));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static a f42092z = new a(2031, a("getorientationcalled"));
    public static a A = new a(2032, a("webviewunavailable"));
    public static final a B = new a(2033, a("controller_init_delayed"));

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f42093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f42094b;

        a(int i10, String str) {
            this.f42094b = i10;
            this.f42093a = str;
        }
    }

    static String a(String str) {
        return D5.f40556c + str;
    }
}
