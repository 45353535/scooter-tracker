package com.ironsource.adapters.admob.banner;

import com.ironsource.adapters.admob.R;
import com.ironsource.mediationsdk.ISBannerSize;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NB_TMP_BASIC' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
final class NativeTemplateType {
    private static final /* synthetic */ NativeTemplateType[] $VALUES;
    private static final String NATIVE_TEMPLATE_NAME = "nativeBannerTemplateName";
    public static final NativeTemplateType NB_TMP_BASIC;
    public static final NativeTemplateType NB_TMP_BASIC_LARGE;
    public static final NativeTemplateType NB_TMP_ICON_TEXT;
    public static final NativeTemplateType NB_TMP_RECT;
    public static final NativeTemplateType NB_TMP_TEXT_CTA;
    private final int mAdChoicesPlacement;
    private final boolean mHideCallToAction;
    private final boolean mHideVideoContent;
    private final int mLayoutId;
    private final int mMediaAspectRatio;

    private static /* synthetic */ NativeTemplateType[] $values() {
        return new NativeTemplateType[]{NB_TMP_BASIC, NB_TMP_BASIC_LARGE, NB_TMP_ICON_TEXT, NB_TMP_TEXT_CTA, NB_TMP_RECT};
    }

    static {
        int i10 = R.layout.ad_mob_native_banner_template_basic_layout;
        NB_TMP_BASIC = new NativeTemplateType("NB_TMP_BASIC", 0, i10, true, true, 1, 1);
        NB_TMP_BASIC_LARGE = new NativeTemplateType("NB_TMP_BASIC_LARGE", 1, i10, false, true, 1, 1);
        NB_TMP_ICON_TEXT = new NativeTemplateType("NB_TMP_ICON_TEXT", 2, R.layout.ad_mob_native_banner_template_icon_text_layout, true, true, 1, 1);
        NB_TMP_TEXT_CTA = new NativeTemplateType("NB_TMP_TEXT_CTA", 3, R.layout.ad_mob_native_banner_template_text_cta_layout, false, true, 3, 1);
        NB_TMP_RECT = new NativeTemplateType("NB_TMP_RECT", 4, R.layout.ad_mob_native_banner_template_rect_layout, false, false, 1, 1);
        $VALUES = $values();
    }

    private NativeTemplateType(String str, int i10, int i11, boolean z10, boolean z11, int i12, int i13) {
        this.mLayoutId = i11;
        this.mHideCallToAction = z10;
        this.mHideVideoContent = z11;
        this.mAdChoicesPlacement = i12;
        this.mMediaAspectRatio = i13;
    }

    public static NativeTemplateType createTemplateType(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        String description = iSBannerSize.getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
                return NB_TMP_RECT;
            case "LARGE":
                return NB_TMP_BASIC_LARGE;
            case "SMART":
            case "BANNER":
                try {
                    return valueOf(jSONObject.optString(NATIVE_TEMPLATE_NAME, NB_TMP_ICON_TEXT.toString()));
                } catch (IllegalArgumentException unused) {
                    return NB_TMP_ICON_TEXT;
                }
            default:
                return NB_TMP_BASIC;
        }
    }

    public static NativeTemplateType valueOf(String str) {
        return (NativeTemplateType) Enum.valueOf(NativeTemplateType.class, str);
    }

    public static NativeTemplateType[] values() {
        return (NativeTemplateType[]) $VALUES.clone();
    }

    public int getAdChoicesPlacement() {
        return this.mAdChoicesPlacement;
    }

    public int getLayoutId() {
        return this.mLayoutId;
    }

    public int getMediaAspectRatio() {
        return this.mMediaAspectRatio;
    }

    public boolean shouldHideCallToAction() {
        return this.mHideCallToAction;
    }

    public boolean shouldHideVideoContent() {
        return this.mHideVideoContent;
    }
}
