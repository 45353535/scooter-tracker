package yads;

import androidx.core.net.MailTo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class o83 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n83 f114219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o83 f114220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o83 f114221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o83 f114222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o83 f114223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ o83[] f114224h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114225b;

    static {
        o83 o83Var = new o83(0, "SMS_SCHEME", "sms:");
        o83 o83Var2 = new o83(1, "MAIL_SCHEME", MailTo.MAILTO_SCHEME);
        o83 o83Var3 = new o83(2, "VOICE_MAIL_SCHEME", "voicemail:");
        o83 o83Var4 = new o83(3, "TEL_SCHEME", "tel:");
        o83 o83Var5 = new o83(4, "CALLTO", "callto:");
        o83 o83Var6 = new o83(5, "FAX", "fax:");
        o83 o83Var7 = new o83(6, "GEO_SCHEME", "geo:");
        o83 o83Var8 = new o83(7, "MAP_SCHEME", "map:");
        o83 o83Var9 = new o83(8, "MAPS_SCHEME", "maps:");
        o83 o83Var10 = new o83(9, "GOOGLE_MARKET_SCHEME", "market:");
        f114220d = o83Var10;
        o83 o83Var11 = new o83(10, "GOOGLE_PLAY_SCHEME", "play:");
        f114221e = o83Var11;
        o83 o83Var12 = new o83(11, "GOOGLE_STREET_VIEW_SCHEME", "google.streetview:");
        o83 o83Var13 = new o83(12, "GOOGLE_MARKET_HOST", "market.android");
        f114222f = o83Var13;
        o83 o83Var14 = new o83(13, "GOOGLE_PLAY_HOST", "play.google");
        f114223g = o83Var14;
        o83[] o83VarArr = {o83Var, o83Var2, o83Var3, o83Var4, o83Var5, o83Var6, o83Var7, o83Var8, o83Var9, o83Var10, o83Var11, o83Var12, o83Var13, o83Var14, new o83(14, "MAP_HOST", "map"), new o83(15, "MAPS_HOST", "maps"), new o83(16, "MOBMAPS", "mobile.maps"), new o83(17, "SHORTMOBMAPS", "m.maps"), new o83(18, "MESSAGE", "message:"), new o83(19, "SIP", "sip:"), new o83(20, "SKYPE", "skype:"), new o83(21, "SMS", "sms:"), new o83(22, "GTALK", "gtalk:"), new o83(23, "SPOTIFY", "spotify:"), new o83(24, "LASTFM", "lastfm:")};
        f114224h = o83VarArr;
        qf.a.a(o83VarArr);
        f114219c = new n83();
    }

    public o83(int i10, String str, String str2) {
        this.f114225b = str2;
    }

    public static o83 valueOf(String str) {
        return (o83) Enum.valueOf(o83.class, str);
    }

    public static o83[] values() {
        return (o83[]) f114224h.clone();
    }
}
