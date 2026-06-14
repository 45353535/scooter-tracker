package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f6 f70270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f70273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f70274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f70275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f70276g;

    public kf(f6 trackingState, String str, String str2, String str3, String str4, Integer num, String str5) {
        Intrinsics.checkNotNullParameter(trackingState, "trackingState");
        this.f70270a = trackingState;
        this.f70271b = str;
        this.f70272c = str2;
        this.f70273d = str3;
        this.f70274e = str4;
        this.f70275f = num;
        this.f70276g = str5;
    }

    public final String a() {
        return this.f70273d;
    }

    public final String b() {
        return this.f70271b;
    }

    public final String c() {
        return this.f70276g;
    }

    public final String d() {
        return this.f70274e;
    }

    public final Integer e() {
        return this.f70275f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf)) {
            return false;
        }
        kf kfVar = (kf) obj;
        return this.f70270a == kfVar.f70270a && Intrinsics.areEqual(this.f70271b, kfVar.f70271b) && Intrinsics.areEqual(this.f70272c, kfVar.f70272c) && Intrinsics.areEqual(this.f70273d, kfVar.f70273d) && Intrinsics.areEqual(this.f70274e, kfVar.f70274e) && Intrinsics.areEqual(this.f70275f, kfVar.f70275f) && Intrinsics.areEqual(this.f70276g, kfVar.f70276g);
    }

    public final f6 f() {
        return this.f70270a;
    }

    public final String g() {
        return this.f70272c;
    }

    public int hashCode() {
        int iHashCode = this.f70270a.hashCode() * 31;
        String str = this.f70271b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f70272c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70273d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f70274e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f70275f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f70276g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "IdentityBodyFields(trackingState=" + this.f70270a + ", identifiers=" + this.f70271b + ", uuid=" + this.f70272c + ", gaid=" + this.f70273d + ", setId=" + this.f70274e + ", setIdScope=" + this.f70275f + ", instanceId=" + this.f70276g + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ kf(f1.f6 r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.Integer r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            f1.f6 r2 = f1.f6.f69801c
        L6:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r4 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r5 = r0
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r6 = r0
        L1b:
            r10 = r9 & 32
            if (r10 == 0) goto L20
            r7 = r0
        L20:
            r9 = r9 & 64
            if (r9 == 0) goto L2d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L35
        L2d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.kf.<init>(f1.f6, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
