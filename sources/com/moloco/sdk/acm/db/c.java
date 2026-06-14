package com.moloco.sdk.acm.db;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f53964b = new c("TIMER", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f53965c = new c("COUNT", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f53966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f53967e;

    static {
        c[] cVarArrD = d();
        f53966d = cVarArrD;
        f53967e = qf.a.a(cVarArrD);
    }

    public c(String str, int i10) {
    }

    public static final /* synthetic */ c[] d() {
        return new c[]{f53964b, f53965c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f53966d.clone();
    }
}
