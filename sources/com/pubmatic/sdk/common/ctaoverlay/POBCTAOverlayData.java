package com.pubmatic.sdk.common.ctaoverlay;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.taurusx.tax.f.y;
import com.vungle.ads.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u0000 H2\u00020\u0001:\u0001HB\u0099\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J¢\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\u001aJ\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0015J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b\u0005\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bA\u00105\u001a\u0004\bB\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u0010\u001aR\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010#¨\u0006I"}, d2 = {"Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayData;", "", "", POBCTAOverlayData.KEY_CTA_DELAY, "endcardDelay", "isDismissible", C4240b4.i.L, "", "ctaText", "ctaButtonBgColor", "ctaTextColor", "iconImageUrl", POBCTAOverlayData.KEY_CTA_HEADER, "title", "description", Constants.CLICK_URL, "", "clickTrackers", "<init>", "(IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()I", "component2", "component3", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/util/List;", MenuActionType.COPY, "(IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getDelay", "b", "getEndcardDelay", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", "getPosition", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/String;", "getCtaText", InneractiveMediationDefs.GENDER_FEMALE, "getCtaButtonBgColor", "g", "getCtaTextColor", "h", "getIconImageUrl", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "getHeader", "j", "getTitle", CampaignEx.JSON_KEY_AD_K, "getDescription", CmcdData.Factory.STREAM_TYPE_LIVE, "getClickUrl", "m", "Ljava/util/List;", "getClickTrackers", y.f66058y, "common_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class POBCTAOverlayData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEFAULT_CTA_BUTTON_BG_COLOR = "#ffa41d";

    @NotNull
    public static final String DEFAULT_CTA_TEXT = "Get";

    @NotNull
    public static final String DEFAULT_CTA_TEXT_COLOR = "#000000";
    public static final int DEFAULT_DELAY = 0;
    public static final int DEFAULT_ENDCARD_DELAY = 0;

    @NotNull
    public static final String DEFAULT_HEADER = "Play Store";
    public static final int DEFAULT_IS_DISMISSIBLE = 1;
    public static final int DEFAULT_POSITION = 0;

    @NotNull
    public static final String KEY_CTA_BUTTON_BG_COLOR = "ctabuttonbgcolor";

    @NotNull
    public static final String KEY_CTA_CLICKTRACKERS = "clicktrackers";

    @NotNull
    public static final String KEY_CTA_CLICKURL = "clickurl";

    @NotNull
    public static final String KEY_CTA_DELAY = "delay";

    @NotNull
    public static final String KEY_CTA_DESCRIPTION = "description";

    @NotNull
    public static final String KEY_CTA_DISMISSIBLE = "dismissible";

    @NotNull
    public static final String KEY_CTA_ENDCARD_DELAY = "endcarddelay";

    @NotNull
    public static final String KEY_CTA_HEADER = "header";

    @NotNull
    public static final String KEY_CTA_ICON_IMAGE_URL = "iconimageurl";

    @NotNull
    public static final String KEY_CTA_POS = "pos";

    @NotNull
    public static final String KEY_CTA_TEXT = "ctacopy";

    @NotNull
    public static final String KEY_CTA_TEXT_COLOR = "ctacopycolor";

    @NotNull
    public static final String KEY_CTA_TITLE = "title";
    public static final int NON_DISMISSIBLE = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int delay;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int endcardDelay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int isDismissible;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int position;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ctaText;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ctaButtonBgColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ctaTextColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String iconImageUrl;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String header;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clickUrl;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List clickTrackers;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0016\u0010\u001f\u001a\u00020\u001c*\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayData$Companion;", "", "()V", "DEFAULT_CTA_BUTTON_BG_COLOR", "", "DEFAULT_CTA_TEXT", "DEFAULT_CTA_TEXT_COLOR", "DEFAULT_DELAY", "", "DEFAULT_ENDCARD_DELAY", "DEFAULT_HEADER", "DEFAULT_IS_DISMISSIBLE", "DEFAULT_POSITION", "KEY_CTA_BUTTON_BG_COLOR", "KEY_CTA_CLICKTRACKERS", "KEY_CTA_CLICKURL", "KEY_CTA_DELAY", "KEY_CTA_DESCRIPTION", "KEY_CTA_DISMISSIBLE", "KEY_CTA_ENDCARD_DELAY", "KEY_CTA_HEADER", "KEY_CTA_ICON_IMAGE_URL", "KEY_CTA_POS", "KEY_CTA_TEXT", "KEY_CTA_TEXT_COLOR", "KEY_CTA_TITLE", "NON_DISMISSIBLE", "parse", "Lcom/pubmatic/sdk/common/ctaoverlay/POBCTAOverlayData;", "ctaOverlayJsonObject", "Lorg/json/JSONObject;", "copyClickUrl", Constants.CLICK_URL, "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final POBCTAOverlayData copyClickUrl(@NotNull POBCTAOverlayData pOBCTAOverlayData, @Nullable String str) {
            Intrinsics.checkNotNullParameter(pOBCTAOverlayData, "<this>");
            return new POBCTAOverlayData(pOBCTAOverlayData.getDelay(), pOBCTAOverlayData.getEndcardDelay(), pOBCTAOverlayData.isDismissible(), pOBCTAOverlayData.getPosition(), pOBCTAOverlayData.getCtaText(), pOBCTAOverlayData.getCtaButtonBgColor(), pOBCTAOverlayData.getCtaTextColor(), pOBCTAOverlayData.getIconImageUrl(), pOBCTAOverlayData.getHeader(), pOBCTAOverlayData.getTitle(), pOBCTAOverlayData.getDescription(), str, null, 4096, null);
        }

        @NotNull
        public final POBCTAOverlayData parse(@NotNull JSONObject ctaOverlayJsonObject) {
            Intrinsics.checkNotNullParameter(ctaOverlayJsonObject, "ctaOverlayJsonObject");
            int iOptInt = ctaOverlayJsonObject.optInt(POBCTAOverlayData.KEY_CTA_DELAY, 0);
            int iOptInt2 = ctaOverlayJsonObject.optInt(POBCTAOverlayData.KEY_CTA_ENDCARD_DELAY, 0);
            int iOptInt3 = ctaOverlayJsonObject.optInt(POBCTAOverlayData.KEY_CTA_DISMISSIBLE, 1);
            int iOptInt4 = ctaOverlayJsonObject.optInt(POBCTAOverlayData.KEY_CTA_POS, 0);
            String ctaText = ctaOverlayJsonObject.optString(POBCTAOverlayData.KEY_CTA_TEXT, "Get");
            String strOptString = ctaOverlayJsonObject.optString(POBCTAOverlayData.KEY_CTA_BUTTON_BG_COLOR);
            if (strOptString.length() == 0) {
                strOptString = POBCTAOverlayData.DEFAULT_CTA_BUTTON_BG_COLOR;
            }
            String ctaButtonBgColor = strOptString;
            String strOptString2 = ctaOverlayJsonObject.optString(POBCTAOverlayData.KEY_CTA_TEXT_COLOR);
            if (strOptString2.length() == 0) {
                strOptString2 = POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR;
            }
            String ctaTextColor = strOptString2;
            String strOptString3 = ctaOverlayJsonObject.optString(POBCTAOverlayData.KEY_CTA_ICON_IMAGE_URL);
            if (StringsKt.y0(strOptString3)) {
                strOptString3 = null;
            }
            String str = strOptString3;
            String strOptString4 = ctaOverlayJsonObject.optString(POBCTAOverlayData.KEY_CTA_HEADER);
            if (strOptString4.length() == 0) {
                strOptString4 = POBCTAOverlayData.DEFAULT_HEADER;
            }
            String header = strOptString4;
            String strOptString5 = ctaOverlayJsonObject.optString("title");
            String strOptString6 = ctaOverlayJsonObject.optString("description");
            String strOptString7 = ctaOverlayJsonObject.optString(POBCTAOverlayData.KEY_CTA_CLICKURL);
            List<String> listConvertStringJsonArrayToList = POBUtils.convertStringJsonArrayToList(ctaOverlayJsonObject.optJSONArray("clicktrackers"));
            Intrinsics.checkNotNullExpressionValue(ctaText, "ctaText");
            Intrinsics.checkNotNullExpressionValue(ctaButtonBgColor, "ctaButtonBgColor");
            Intrinsics.checkNotNullExpressionValue(ctaTextColor, "ctaTextColor");
            Intrinsics.checkNotNullExpressionValue(header, "header");
            return new POBCTAOverlayData(iOptInt, iOptInt2, iOptInt3, iOptInt4, ctaText, ctaButtonBgColor, ctaTextColor, str, header, strOptString5, strOptString6, strOptString7, listConvertStringJsonArrayToList);
        }

        private Companion() {
        }
    }

    public POBCTAOverlayData() {
        this(0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ POBCTAOverlayData copy$default(POBCTAOverlayData pOBCTAOverlayData, int i10, int i11, int i12, int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = pOBCTAOverlayData.delay;
        }
        return pOBCTAOverlayData.copy(i10, (i14 & 2) != 0 ? pOBCTAOverlayData.endcardDelay : i11, (i14 & 4) != 0 ? pOBCTAOverlayData.isDismissible : i12, (i14 & 8) != 0 ? pOBCTAOverlayData.position : i13, (i14 & 16) != 0 ? pOBCTAOverlayData.ctaText : str, (i14 & 32) != 0 ? pOBCTAOverlayData.ctaButtonBgColor : str2, (i14 & 64) != 0 ? pOBCTAOverlayData.ctaTextColor : str3, (i14 & 128) != 0 ? pOBCTAOverlayData.iconImageUrl : str4, (i14 & 256) != 0 ? pOBCTAOverlayData.header : str5, (i14 & 512) != 0 ? pOBCTAOverlayData.title : str6, (i14 & 1024) != 0 ? pOBCTAOverlayData.description : str7, (i14 & 2048) != 0 ? pOBCTAOverlayData.clickUrl : str8, (i14 & 4096) != 0 ? pOBCTAOverlayData.clickTrackers : list);
    }

    @NotNull
    public static final POBCTAOverlayData copyClickUrl(@NotNull POBCTAOverlayData pOBCTAOverlayData, @Nullable String str) {
        return INSTANCE.copyClickUrl(pOBCTAOverlayData, str);
    }

    @NotNull
    public static final POBCTAOverlayData parse(@NotNull JSONObject jSONObject) {
        return INSTANCE.parse(jSONObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getClickUrl() {
        return this.clickUrl;
    }

    @Nullable
    public final List<String> component13() {
        return this.clickTrackers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEndcardDelay() {
        return this.endcardDelay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIsDismissible() {
        return this.isDismissible;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCtaButtonBgColor() {
        return this.ctaButtonBgColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCtaTextColor() {
        return this.ctaTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIconImageUrl() {
        return this.iconImageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @NotNull
    public final POBCTAOverlayData copy(int delay, int endcardDelay, int isDismissible, int position, @NotNull String ctaText, @NotNull String ctaButtonBgColor, @NotNull String ctaTextColor, @Nullable String iconImageUrl, @NotNull String header, @Nullable String title, @Nullable String description, @Nullable String clickUrl, @Nullable List<String> clickTrackers) {
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(ctaButtonBgColor, "ctaButtonBgColor");
        Intrinsics.checkNotNullParameter(ctaTextColor, "ctaTextColor");
        Intrinsics.checkNotNullParameter(header, "header");
        return new POBCTAOverlayData(delay, endcardDelay, isDismissible, position, ctaText, ctaButtonBgColor, ctaTextColor, iconImageUrl, header, title, description, clickUrl, clickTrackers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof POBCTAOverlayData)) {
            return false;
        }
        POBCTAOverlayData pOBCTAOverlayData = (POBCTAOverlayData) other;
        return this.delay == pOBCTAOverlayData.delay && this.endcardDelay == pOBCTAOverlayData.endcardDelay && this.isDismissible == pOBCTAOverlayData.isDismissible && this.position == pOBCTAOverlayData.position && Intrinsics.areEqual(this.ctaText, pOBCTAOverlayData.ctaText) && Intrinsics.areEqual(this.ctaButtonBgColor, pOBCTAOverlayData.ctaButtonBgColor) && Intrinsics.areEqual(this.ctaTextColor, pOBCTAOverlayData.ctaTextColor) && Intrinsics.areEqual(this.iconImageUrl, pOBCTAOverlayData.iconImageUrl) && Intrinsics.areEqual(this.header, pOBCTAOverlayData.header) && Intrinsics.areEqual(this.title, pOBCTAOverlayData.title) && Intrinsics.areEqual(this.description, pOBCTAOverlayData.description) && Intrinsics.areEqual(this.clickUrl, pOBCTAOverlayData.clickUrl) && Intrinsics.areEqual(this.clickTrackers, pOBCTAOverlayData.clickTrackers);
    }

    @Nullable
    public final List<String> getClickTrackers() {
        return this.clickTrackers;
    }

    @Nullable
    public final String getClickUrl() {
        return this.clickUrl;
    }

    @NotNull
    public final String getCtaButtonBgColor() {
        return this.ctaButtonBgColor;
    }

    @NotNull
    public final String getCtaText() {
        return this.ctaText;
    }

    @NotNull
    public final String getCtaTextColor() {
        return this.ctaTextColor;
    }

    public final int getDelay() {
        return this.delay;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getEndcardDelay() {
        return this.endcardDelay;
    }

    @NotNull
    public final String getHeader() {
        return this.header;
    }

    @Nullable
    public final String getIconImageUrl() {
        return this.iconImageUrl;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.delay * 31) + this.endcardDelay) * 31) + this.isDismissible) * 31) + this.position) * 31) + this.ctaText.hashCode()) * 31) + this.ctaButtonBgColor.hashCode()) * 31) + this.ctaTextColor.hashCode()) * 31;
        String str = this.iconImageUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.header.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clickUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.clickTrackers;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final int isDismissible() {
        return this.isDismissible;
    }

    @NotNull
    public String toString() {
        return "POBCTAOverlayData(delay=" + this.delay + ", endcardDelay=" + this.endcardDelay + ", isDismissible=" + this.isDismissible + ", position=" + this.position + ", ctaText=" + this.ctaText + ", ctaButtonBgColor=" + this.ctaButtonBgColor + ", ctaTextColor=" + this.ctaTextColor + ", iconImageUrl=" + this.iconImageUrl + ", header=" + this.header + ", title=" + this.title + ", description=" + this.description + ", clickUrl=" + this.clickUrl + ", clickTrackers=" + this.clickTrackers + ')';
    }

    public POBCTAOverlayData(int i10, int i11, int i12, int i13, @NotNull String ctaText, @NotNull String ctaButtonBgColor, @NotNull String ctaTextColor, @Nullable String str, @NotNull String header, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(ctaButtonBgColor, "ctaButtonBgColor");
        Intrinsics.checkNotNullParameter(ctaTextColor, "ctaTextColor");
        Intrinsics.checkNotNullParameter(header, "header");
        this.delay = i10;
        this.endcardDelay = i11;
        this.isDismissible = i12;
        this.position = i13;
        this.ctaText = ctaText;
        this.ctaButtonBgColor = ctaButtonBgColor;
        this.ctaTextColor = ctaTextColor;
        this.iconImageUrl = str;
        this.header = header;
        this.title = str2;
        this.description = str3;
        this.clickUrl = str4;
        this.clickTrackers = list;
    }

    public /* synthetic */ POBCTAOverlayData(int i10, int i11, int i12, int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 1 : i12, (i14 & 8) == 0 ? i13 : 0, (i14 & 16) != 0 ? "Get" : str, (i14 & 32) != 0 ? DEFAULT_CTA_BUTTON_BG_COLOR : str2, (i14 & 64) != 0 ? DEFAULT_CTA_TEXT_COLOR : str3, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? DEFAULT_HEADER : str5, (i14 & 512) != 0 ? null : str6, (i14 & 1024) != 0 ? null : str7, (i14 & 2048) != 0 ? null : str8, (i14 & 4096) != 0 ? null : list);
    }
}
