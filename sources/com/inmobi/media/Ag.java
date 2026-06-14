package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ag f36572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ag f36573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Ag[] f36574c;

    static {
        Ag ag2 = new Ag("HIGHEST", 0);
        f36572a = ag2;
        Ag ag3 = new Ag("REGULAR", 1);
        f36573b = ag3;
        Ag[] agArr = {ag2, ag3};
        f36574c = agArr;
        qf.a.a(agArr);
    }

    public Ag(String str, int i10) {
    }

    public static Ag valueOf(String str) {
        return (Ag) Enum.valueOf(Ag.class, str);
    }

    public static Ag[] values() {
        return (Ag[]) f36574c.clone();
    }
}
