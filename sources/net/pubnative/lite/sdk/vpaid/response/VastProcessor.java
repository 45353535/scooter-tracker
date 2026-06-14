package net.pubnative.lite.sdk.vpaid.response;

import android.content.Context;
import android.text.TextUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.network.e;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.viewability.baseom.BaseVerificationScriptResource;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.enums.VastError;
import net.pubnative.lite.sdk.vpaid.helpers.ErrorLog;
import net.pubnative.lite.sdk.vpaid.models.vast.Ad;
import net.pubnative.lite.sdk.vpaid.models.vast.AdVerifications;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;
import net.pubnative.lite.sdk.vpaid.models.vast.CreativeExtension;
import net.pubnative.lite.sdk.vpaid.models.vast.Error;
import net.pubnative.lite.sdk.vpaid.models.vast.Extension;
import net.pubnative.lite.sdk.vpaid.models.vast.HTMLResource;
import net.pubnative.lite.sdk.vpaid.models.vast.IFrameResource;
import net.pubnative.lite.sdk.vpaid.models.vast.Icon;
import net.pubnative.lite.sdk.vpaid.models.vast.Impression;
import net.pubnative.lite.sdk.vpaid.models.vast.InLine;
import net.pubnative.lite.sdk.vpaid.models.vast.JavaScriptResource;
import net.pubnative.lite.sdk.vpaid.models.vast.Linear;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;
import net.pubnative.lite.sdk.vpaid.models.vast.Tracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Vast;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;
import net.pubnative.lite.sdk.vpaid.models.vast.Verification;
import net.pubnative.lite.sdk.vpaid.models.vast.VerveCTAButton;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;
import net.pubnative.lite.sdk.vpaid.models.vpaid.AdSpotDimensions;
import net.pubnative.lite.sdk.vpaid.utils.Utils;
import net.pubnative.lite.sdk.vpaid.xml.XmlParser;

/* JADX INFO: loaded from: classes3.dex */
public class VastProcessor {
    private static final String EXTENSION_TYPE_AD_VERIFICATION = "AdVerifications";
    private static final String LOG_TAG = "VastProcessor";
    private static final int UNWRAP_DEPTH = 5;
    private final Context mContext;
    private final AdSpotDimensions mParseParams;
    private final AdParams adParams = new AdParams();
    private int unwrapAttempt = 0;

    public interface Listener {
        void onParseError(PlayerInfo playerInfo);

        void onParseSuccess(AdParams adParams, String str);
    }

    public VastProcessor(Context context, AdSpotDimensions adSpotDimensions) {
        this.mContext = context;
        this.mParseParams = adSpotDimensions;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ int a(net.pubnative.lite.sdk.vpaid.models.vpaid.AdSpotDimensions r15, net.pubnative.lite.sdk.vpaid.models.vast.Companion r16, net.pubnative.lite.sdk.vpaid.models.vast.Companion r17) {
        /*
            r1 = 0
            java.lang.String r0 = r16.getWidth()     // Catch: java.lang.RuntimeException -> L2c
            double r3 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.RuntimeException -> L2c
            java.lang.String r0 = r16.getHeight()     // Catch: java.lang.RuntimeException -> L28
            double r5 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.RuntimeException -> L28
            java.lang.String r0 = r17.getWidth()     // Catch: java.lang.RuntimeException -> L25
            double r7 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.RuntimeException -> L25
            java.lang.String r0 = r17.getHeight()     // Catch: java.lang.RuntimeException -> L23
            double r1 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.RuntimeException -> L23
            goto L39
        L23:
            r0 = move-exception
            goto L30
        L25:
            r0 = move-exception
            r7 = r1
            goto L30
        L28:
            r0 = move-exception
            r5 = r1
        L2a:
            r7 = r5
            goto L30
        L2c:
            r0 = move-exception
            r3 = r1
            r5 = r3
            goto L2a
        L30:
            java.lang.String r9 = net.pubnative.lite.sdk.vpaid.response.VastProcessor.LOG_TAG
            java.lang.String r0 = r0.getMessage()
            net.pubnative.lite.sdk.utils.Logger.w(r9, r0)
        L39:
            double r9 = r3 / r5
            double r11 = r7 / r1
            int r0 = r15.getWidth()
            double r13 = (double) r0
            int r0 = r15.getHeight()
            r16 = r1
            double r0 = (double) r0
            double r13 = r13 / r0
            int r0 = r15.getWidth()
            double r0 = (double) r0
            double r0 = r0 / r3
            int r2 = r15.getHeight()
            double r2 = (double) r2
            double r2 = r2 / r5
            double r0 = java.lang.Math.min(r0, r2)
            int r2 = r15.getWidth()
            double r2 = (double) r2
            double r2 = r2 / r7
            int r15 = r15.getHeight()
            double r4 = (double) r15
            double r4 = r4 / r16
            double r2 = java.lang.Math.min(r2, r4)
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r15 > 0) goto L73
            r15 = r5
            goto L74
        L73:
            r15 = r4
        L74:
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 > 0) goto L79
            r4 = r5
        L79:
            if (r15 == 0) goto L7f
            if (r4 != 0) goto L7f
            r5 = -1
            goto L88
        L7f:
            if (r15 != 0) goto L84
            if (r4 == 0) goto L84
            goto L88
        L84:
            int r5 = java.lang.Double.compare(r2, r0)
        L88:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.vpaid.response.VastProcessor.a(net.pubnative.lite.sdk.vpaid.models.vpaid.AdSpotDimensions, net.pubnative.lite.sdk.vpaid.models.vast.Companion, net.pubnative.lite.sdk.vpaid.models.vast.Companion):int");
    }

    public static /* synthetic */ int b(AdSpotDimensions adSpotDimensions, MediaFile mediaFile, MediaFile mediaFile2) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        try {
            i11 = Integer.parseInt(mediaFile.getWidth());
            try {
                i10 = Integer.parseInt(mediaFile.getHeight());
                try {
                    i12 = Integer.parseInt(mediaFile2.getWidth());
                } catch (RuntimeException e10) {
                    e = e10;
                    i12 = 0;
                }
                try {
                    i13 = Integer.parseInt(mediaFile2.getHeight());
                } catch (RuntimeException e11) {
                    e = e11;
                    Logger.w(LOG_TAG, e.getMessage());
                }
            } catch (RuntimeException e12) {
                e = e12;
                i10 = 0;
                i12 = 0;
            }
        } catch (RuntimeException e13) {
            e = e13;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        return Integer.compare(Math.abs(adSpotDimensions.getWidth() - i11) + Math.abs(adSpotDimensions.getHeight() - i10), Math.abs(adSpotDimensions.getWidth() - i12) + Math.abs(adSpotDimensions.getHeight() - i13));
    }

    private Comparator<Companion> createCompanionComparator(final AdSpotDimensions adSpotDimensions) {
        return new Comparator() { // from class: net.pubnative.lite.sdk.vpaid.response.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return VastProcessor.a(adSpotDimensions, (Companion) obj, (Companion) obj2);
            }
        };
    }

    private Comparator<MediaFile> createComparator(final AdSpotDimensions adSpotDimensions) {
        return new Comparator() { // from class: net.pubnative.lite.sdk.vpaid.response.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return VastProcessor.b(adSpotDimensions, (MediaFile) obj, (MediaFile) obj2);
            }
        };
    }

    private void fillAdParams(Context context, VastAdSource vastAdSource, AdParams adParams, AdSpotDimensions adSpotDimensions, String str) {
        Linear linear;
        AdVerifications adVerifications;
        if (vastAdSource.getErrors() != null && !vastAdSource.getErrors().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Error error : vastAdSource.getErrors()) {
                if (!TextUtils.isEmpty(error.getText())) {
                    arrayList.add(error.getText().trim());
                }
            }
            ErrorLog.initErrorLog(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        if (vastAdSource.getImpressions() != null) {
            for (Impression impression : vastAdSource.getImpressions()) {
                if (!TextUtils.isEmpty(impression.getText())) {
                    arrayList2.add(impression.getText());
                }
            }
        }
        adParams.setImpressions(arrayList2);
        if (vastAdSource.getCategories() != null) {
            adParams.addAdCategories(vastAdSource.getCategories());
        }
        if (vastAdSource.getAdServingId() != null && !TextUtils.isEmpty(vastAdSource.getAdServingId().getText())) {
            adParams.addAdServingId(vastAdSource.getAdServingId());
        }
        ArrayList arrayList3 = new ArrayList();
        if (vastAdSource.getExtensions() != null && vastAdSource.getExtensions().getExtensions() != null) {
            for (Extension extension : vastAdSource.getExtensions().getExtensions()) {
                if (!TextUtils.isEmpty(extension.getType()) && extension.getType().equals("AdVerifications") && (adVerifications = extension.getAdVerifications()) != null && adVerifications.getVerificationList() != null) {
                    for (Verification verification : adVerifications.getVerificationList()) {
                        try {
                            if (verification.getJavaScriptResources() != null) {
                                for (JavaScriptResource javaScriptResource : verification.getJavaScriptResources()) {
                                    if (!TextUtils.isEmpty(javaScriptResource.getText())) {
                                        URL url = new URL(javaScriptResource.getText().trim());
                                        if (!TextUtils.isEmpty(verification.getVendor()) && verification.getVerificationParameters() != null && !TextUtils.isEmpty(verification.getVerificationParameters().getText())) {
                                            arrayList3.add(BaseVerificationScriptResource.createVerificationScriptResourceWithParameters(verification.getVendor(), url, verification.getVerificationParameters().getText()));
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            Logger.e(LOG_TAG, e10.getMessage());
                        }
                    }
                }
            }
        }
        AdVerifications adVerifications2 = vastAdSource.getAdVerifications();
        if (adVerifications2 != null && adVerifications2.getVerificationList() != null) {
            for (Verification verification2 : adVerifications2.getVerificationList()) {
                try {
                    if (verification2.getJavaScriptResources() != null) {
                        for (JavaScriptResource javaScriptResource2 : verification2.getJavaScriptResources()) {
                            if (!TextUtils.isEmpty(javaScriptResource2.getText())) {
                                URL url2 = new URL(javaScriptResource2.getText().trim());
                                if (!TextUtils.isEmpty(verification2.getVendor()) && verification2.getVerificationParameters() != null && !TextUtils.isEmpty(verification2.getVerificationParameters().getText())) {
                                    arrayList3.add(BaseVerificationScriptResource.createVerificationScriptResourceWithParameters(verification2.getVendor(), url2, verification2.getVerificationParameters().getText()));
                                }
                            }
                        }
                    }
                } catch (Exception e11) {
                    Logger.e(LOG_TAG, e11.getMessage());
                }
            }
        }
        adParams.addVerificationScriptResources(arrayList3);
        if (vastAdSource.getCreatives() == null || vastAdSource.getCreatives().getCreatives() == null) {
            return;
        }
        List<Creative> creatives = vastAdSource.getCreatives().getCreatives();
        Iterator<Creative> it = creatives.iterator();
        while (true) {
            if (!it.hasNext()) {
                linear = null;
                break;
            }
            Creative next = it.next();
            if (next.getLinear() != null) {
                linear = next.getLinear();
                break;
            }
        }
        try {
            List<Companion> sortedCompanions = getSortedCompanions(creatives, adSpotDimensions);
            ArrayList arrayList4 = new ArrayList();
            for (int i10 = 0; i10 < sortedCompanions.size() && arrayList4.isEmpty(); i10++) {
                Companion companion = sortedCompanions.get(i10);
                if (companion.getHtmlResources() != null && !companion.getHtmlResources().isEmpty()) {
                    for (HTMLResource hTMLResource : companion.getHtmlResources()) {
                        if (!TextUtils.isEmpty(hTMLResource.getText())) {
                            arrayList4.add(new EndCardData(EndCardData.Type.HTML_RESOURCE, hTMLResource.getText().trim()));
                        }
                    }
                }
                if (companion.getiFrameResources() != null && !companion.getiFrameResources().isEmpty()) {
                    for (IFrameResource iFrameResource : companion.getiFrameResources()) {
                        if (!TextUtils.isEmpty(iFrameResource.getText())) {
                            arrayList4.add(new EndCardData(EndCardData.Type.IFRAME_RESOURCE, iFrameResource.getText().trim()));
                        }
                    }
                }
                if (companion.getStaticResources() != null && !companion.getStaticResources().isEmpty()) {
                    for (StaticResource staticResource : companion.getStaticResources()) {
                        if (!TextUtils.isEmpty(staticResource.getText())) {
                            arrayList4.add(new EndCardData(EndCardData.Type.STATIC_RESOURCE, staticResource.getText().trim()));
                        }
                    }
                }
            }
            adParams.setEndCardList(arrayList4);
            if (!sortedCompanions.isEmpty()) {
                Companion companion2 = sortedCompanions.get(0);
                CompanionClickThrough companionClickThrough = companion2.getCompanionClickThrough();
                if (companionClickThrough != null && !TextUtils.isEmpty(companionClickThrough.getText())) {
                    adParams.setEndCardRedirectUrl(companionClickThrough.getText().trim());
                }
                if (companion2.getCompanionClickTrackingList() != null) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<CompanionClickTracking> it2 = companion2.getCompanionClickTrackingList().iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(it2.next().getText());
                    }
                    adParams.setEndCardClicks(arrayList5);
                }
                if (companion2.getTrackingEvents() != null && companion2.getTrackingEvents().getTrackingList() != null) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator<Tracking> it3 = companion2.getTrackingEvents().getTrackingList().iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(it3.next().getText());
                    }
                    adParams.setCompanionCreativeViewEvents(arrayList6);
                }
            }
        } catch (Exception e12) {
            Logger.e(LOG_TAG, e12.getMessage());
        }
        if (linear != null) {
            if (!TextUtils.isEmpty(linear.getSkipOffset())) {
                adParams.setSkipTime(linear.getSkipOffset());
            }
            if (linear.getTrackingEvents() != null) {
                adParams.addEvents(linear.getTrackingEvents().getTrackingList());
            }
            adParams.setDuration(Utils.parseDuration(linear.getDuration() != null ? linear.getDuration().getText() : "00:00:10"));
            if (linear.getAdParameters() != null && !TextUtils.isEmpty(linear.getAdParameters().getText())) {
                adParams.setAdParams(linear.getAdParameters().getText().trim());
            }
            if (linear.getVideoClicks() != null) {
                ClickThrough clickThrough = linear.getVideoClicks().getClickThrough();
                if (clickThrough != null) {
                    adParams.setVideoRedirectUrl(clickThrough.getText());
                }
                List<ClickTracking> clickTrackingList = linear.getVideoClicks().getClickTrackingList();
                ArrayList arrayList7 = new ArrayList();
                if (clickTrackingList != null) {
                    Iterator<ClickTracking> it4 = clickTrackingList.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(it4.next().getText());
                    }
                }
                adParams.setVideoClicks(arrayList7);
            }
            if (linear.getMediaFiles() != null && linear.getMediaFiles().getMediaFiles() != null && !linear.getMediaFiles().getMediaFiles().isEmpty()) {
                List<MediaFile> mediaFiles = linear.getMediaFiles().getMediaFiles();
                String vpaidJsUrl = getVpaidJsUrl(mediaFiles);
                List<MediaFile> listFilterNonVpaid = filterNonVpaid(mediaFiles);
                if (TextUtils.isEmpty(vpaidJsUrl) || !listFilterNonVpaid.isEmpty()) {
                    List<MediaFile> listSortedMediaFiles = sortedMediaFiles(listFilterNonVpaid, adSpotDimensions);
                    ArrayList arrayList8 = new ArrayList();
                    for (MediaFile mediaFile : listSortedMediaFiles) {
                        if (mediaFile.getText() != null) {
                            arrayList8.add(mediaFile.getText().trim());
                        }
                    }
                    adParams.setVideoFileUrlsList(arrayList8);
                    if (arrayList8.isEmpty()) {
                        ErrorLog.postError(context, VastError.MEDIA_FILE_NO_SUPPORTED_TYPE);
                    }
                } else {
                    adParams.setVpaid();
                    adParams.setVpaidJsUrl(vpaidJsUrl);
                }
            }
            if (linear.getIcons() != null && linear.getIcons().getIcons() != null && !linear.getIcons().getIcons().isEmpty()) {
                List<Icon> icons = linear.getIcons().getIcons();
                Icon icon = null;
                for (int i11 = 0; i11 < icons.size() && icon == null; i11++) {
                    Icon icon2 = icons.get(i11);
                    if (icon2 != null && !TextUtils.isEmpty(icon2.getProgram()) && icon2.getStaticResources() != null && !icon2.getStaticResources().isEmpty()) {
                        icon = icon2;
                    }
                }
                if (icon != null) {
                    adParams.setAdIcon(icon);
                }
            }
            CreativeExtension creativeExtension = null;
            for (int i12 = 0; i12 < creatives.size() && creativeExtension == null; i12++) {
                Creative creative = creatives.get(i12);
                if (creative != null && creative.getCreativeExtensions() != null && creative.getCreativeExtensions().getCreativeExtensions() != null && !creative.getCreativeExtensions().getCreativeExtensions().isEmpty()) {
                    List<CreativeExtension> creativeExtensions = creative.getCreativeExtensions().getCreativeExtensions();
                    int i13 = 0;
                    VerveCTAButton verveCTAButton = null;
                    while (i13 < creativeExtensions.size() && verveCTAButton == null) {
                        creativeExtension = creativeExtensions.get(i13);
                        if (creativeExtension == null || !creativeExtension.getType().equals("Verve") || creativeExtension.getVerveCTAButton() == null) {
                            i13++;
                        } else {
                            verveCTAButton = creativeExtension.getVerveCTAButton();
                        }
                    }
                    if (verveCTAButton != null) {
                        if (verveCTAButton.getHtmlResource() != null && !TextUtils.isEmpty(verveCTAButton.getHtmlResource().getText())) {
                            adParams.setCtaExtensionHtml(verveCTAButton.getHtmlResource().getText());
                        }
                        if (verveCTAButton.getTrackingEvents() != null && verveCTAButton.getTrackingEvents().getTrackingList() != null && !verveCTAButton.getTrackingEvents().getTrackingList().isEmpty()) {
                            ArrayList arrayList9 = new ArrayList();
                            for (Tracking tracking : verveCTAButton.getTrackingEvents().getTrackingList()) {
                                if (tracking != null && !TextUtils.isEmpty(tracking.getEvent()) && tracking.getEvent().equals("CTAClick") && !TextUtils.isEmpty(tracking.getText())) {
                                    arrayList9.add(tracking.getText());
                                }
                            }
                            adParams.setCtaExtensionClicks(arrayList9);
                        }
                    }
                }
            }
        }
    }

    private List<MediaFile> filterNonVpaid(List<MediaFile> list) {
        ArrayList arrayList = new ArrayList(list);
        for (MediaFile mediaFile : list) {
            if (mediaFile.getApiFramework() != null && mediaFile.getApiFramework().equalsIgnoreCase("VPAID")) {
                arrayList.remove(mediaFile);
            }
        }
        return arrayList;
    }

    private List<Companion> getSortedCompanions(List<Creative> list, AdSpotDimensions adSpotDimensions) {
        for (Creative creative : list) {
            if (creative.getCompanionAds() != null && creative.getCompanionAds().getCompanions() != null) {
                ArrayList arrayList = new ArrayList(creative.getCompanionAds().getCompanions());
                Collections.sort(arrayList, createCompanionComparator(adSpotDimensions));
                return arrayList;
            }
        }
        return new ArrayList();
    }

    private String getVpaidJsUrl(List<MediaFile> list) {
        for (MediaFile mediaFile : list) {
            if (mediaFile.getText() != null && mediaFile.getApiFramework() != null && mediaFile.getApiFramework().equalsIgnoreCase("VPAID")) {
                return mediaFile.getText().trim();
            }
        }
        return null;
    }

    private String parseAdParameters(Linear linear) {
        try {
            return linear.getAdParameters().getText().trim();
        } catch (Exception unused) {
            return "";
        }
    }

    private List<MediaFile> sortedMediaFiles(List<MediaFile> list, AdSpotDimensions adSpotDimensions) {
        ArrayList arrayList = new ArrayList();
        for (MediaFile mediaFile : list) {
            if (new HashSet(Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/3gpp2", "video/x-m4v")).contains(mediaFile.getType())) {
                arrayList.add(mediaFile);
            }
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList, createComparator(adSpotDimensions));
        }
        return arrayList;
    }

    public void parseResponse(String str, final Listener listener) {
        VastProcessor vastProcessor;
        Exception exc;
        try {
            Vast vast = (Vast) XmlParser.parse(str, Vast.class);
            if (vast.getErrors() != null) {
                try {
                    if (!vast.getErrors().isEmpty() && vast.getAds() != null && !vast.getAds().isEmpty()) {
                        if (vast.getErrors() != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Error error : vast.getErrors()) {
                                if (!TextUtils.isEmpty(error.getText())) {
                                    arrayList.add(error.getText().trim());
                                }
                            }
                            ErrorLog.initErrorLog(arrayList);
                            ErrorLog.postError(this.mContext, VastError.XML_PARSING);
                        }
                        if (listener != null) {
                            PlayerInfo playerInfo = new PlayerInfo("No ads found - An error has been detected on the root of the VAST response");
                            playerInfo.setNoAdsFound();
                            listener.onParseError(playerInfo);
                            return;
                        }
                        return;
                    }
                } catch (Exception e10) {
                    exc = e10;
                    vastProcessor = this;
                }
            }
            try {
                if (vast.getAds() == null || vast.getAds().isEmpty() || !(vast.getErrors() == null || vast.getErrors().isEmpty())) {
                    if (vast.getErrors() != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Error error2 : vast.getErrors()) {
                            if (!TextUtils.isEmpty(error2.getText())) {
                                arrayList2.add(error2.getText().trim());
                            }
                        }
                        ErrorLog.initErrorLog(arrayList2);
                        ErrorLog.postError(this.mContext, VastError.XML_PARSING);
                    }
                    if (listener != null) {
                        PlayerInfo playerInfo2 = new PlayerInfo("No ads found");
                        playerInfo2.setNoAdsFound();
                        listener.onParseError(playerInfo2);
                        return;
                    }
                    return;
                }
                Ad ad2 = vast.getAds().get(0);
                this.adParams.setId(ad2.getId());
                InLine inLine = ad2.getInLine();
                Wrapper wrapper = ad2.getWrapper();
                if (inLine != null) {
                    fillAdParams(this.mContext, inLine, this.adParams, this.mParseParams, str);
                    if (listener != null) {
                        if (this.adParams.isVpaid()) {
                            PlayerInfo playerInfo3 = new PlayerInfo("No ads found - Unsupported ad format");
                            playerInfo3.setNoAdsFound();
                            listener.onParseError(playerInfo3);
                            return;
                        }
                        if (this.adParams.getVideoFileUrlsList() != null && !this.adParams.getVideoFileUrlsList().isEmpty()) {
                            listener.onParseSuccess(this.adParams, str);
                            return;
                        }
                        ErrorLog.postError(this.mContext, VastError.XML_PARSING);
                        PlayerInfo playerInfo4 = new PlayerInfo("No video file found");
                        playerInfo4.setNoAdsFound();
                        listener.onParseError(playerInfo4);
                        return;
                    }
                    return;
                }
                if (wrapper == null) {
                    ErrorLog.postError(this.mContext, VastError.XML_PARSING);
                    Logger.e(LOG_TAG, "Parse VAST failed: No ad source was received");
                    if (listener != null) {
                        listener.onParseError(new PlayerInfo("No VAST ad source was received"));
                        return;
                    }
                    return;
                }
                try {
                    fillAdParams(this.mContext, wrapper, this.adParams, this.mParseParams, str);
                    if (this.adParams.isVpaid()) {
                        if (listener != null) {
                            PlayerInfo playerInfo5 = new PlayerInfo("No ads found - Unsupported ad format");
                            playerInfo5.setNoAdsFound();
                            listener.onParseError(playerInfo5);
                            return;
                        }
                        return;
                    }
                    if (this.unwrapAttempt >= 5) {
                        ErrorLog.postError(this.mContext, VastError.WRAPPER_LIMIT);
                        Logger.e(LOG_TAG, "Parse VAST failed: Vast processor reached wrapper limit (5)");
                        if (listener != null) {
                            listener.onParseError(new PlayerInfo("Vast processor reached wrapper limit (5)"));
                            return;
                        }
                        return;
                    }
                    String text = wrapper.getVastAdTagURI().getText();
                    HashMap map = new HashMap();
                    String userAgent = HyBid.getDeviceInfo().getUserAgent();
                    if (!TextUtils.isEmpty(userAgent)) {
                        map.put("User-Agent", userAgent);
                    }
                    PNHttpClient.makeRequest(this.mContext, text, map, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.vpaid.response.VastProcessor.1
                        @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                        public void onFailure(Throwable th2) {
                            ErrorLog.postError(VastProcessor.this.mContext, VastError.WRAPPER);
                            Logger.e(VastProcessor.LOG_TAG, "Parse VAST failed: ", th2);
                            if (listener != null) {
                                listener.onParseError(new PlayerInfo("Parse VAST response failed " + th2.getMessage()));
                            }
                        }

                        @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                        public /* synthetic */ void onFinally(String str2, int i10) {
                            e.a(this, str2, i10);
                        }

                        @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                        public void onSuccess(String str2, Map<String, List<String>> map2) {
                            VastProcessor.this.parseResponse(str2, listener);
                        }
                    });
                    this.unwrapAttempt++;
                    return;
                } catch (Exception e11) {
                    e = e11;
                    vastProcessor = this;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            vastProcessor = this;
        }
        exc = e;
        ErrorLog.postError(vastProcessor.mContext, VastError.XML_PARSING);
        Logger.e(LOG_TAG, "Parse VAST failed: ", exc);
        if (listener != null) {
            listener.onParseError(new PlayerInfo("Parse VAST response failed" + exc.getMessage()));
        }
    }
}
