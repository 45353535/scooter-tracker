package yads;

import com.yandex.mobile.ads.R$font;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class lv0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ lv0[] f113230f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f113232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f113233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f113234e;

    static {
        lv0[] lv0VarArr = {new lv0(R$font.monetization_ads_internal_font_light, R$font.monetization_ads_internal_font_regular, R$font.monetization_ads_internal_font_medium, R$font.monetization_ads_internal_font_bold)};
        f113230f = lv0VarArr;
        qf.a.a(lv0VarArr);
    }

    public lv0(int i10, int i11, int i12, int i13) {
        this.f113231b = i10;
        this.f113232c = i11;
        this.f113233d = i12;
        this.f113234e = i13;
    }

    public static lv0 valueOf(String str) {
        return (lv0) Enum.valueOf(lv0.class, str);
    }

    public static lv0[] values() {
        return (lv0[]) f113230f.clone();
    }
}
