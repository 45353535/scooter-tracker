package net.pubnative.lite.sdk;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.analytics.ReportingController;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.vpaid.helpers.EventTracker;

/* JADX INFO: loaded from: classes3.dex */
public class BaseViewModel {
    protected final ReportingController mReportingController = HyBid.getReportingController();

    protected void invokeOnContentInfoClick(IntegrationType integrationType, Ad ad2, String str) {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(Reporting.EventType.CONTENT_INFO_CLICK);
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat(str);
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(integrationType));
        if (ad2 != null) {
            reportingEvent.setImpId(ad2.getSessionId());
            reportingEvent.setCampaignId(ad2.getCampaignId());
            reportingEvent.setConfigId(ad2.getConfigId());
        }
        this.mReportingController.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void invokeOnCustomCTAClick(String str, Ad ad2, String str2) {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(str);
        reportingEvent.setAdFormat(str2);
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(IntegrationType.STANDALONE));
        if (ad2 != null) {
            reportingEvent.setImpId(ad2.getSessionId());
            reportingEvent.setCampaignId(ad2.getCampaignId());
            reportingEvent.setConfigId(ad2.getConfigId());
        }
        reportingEvent.setTimestamp(System.currentTimeMillis());
        this.mReportingController.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void invokeOnCustomCTAShow(Ad ad2, String str) {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("custom_cta_show");
        reportingEvent.setAdFormat(str);
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(IntegrationType.STANDALONE));
        if (ad2 != null) {
            reportingEvent.setImpId(ad2.getSessionId());
            reportingEvent.setCampaignId(ad2.getCampaignId());
            reportingEvent.setConfigId(ad2.getConfigId());
        }
        reportingEvent.setTimestamp(System.currentTimeMillis());
        this.mReportingController.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void invokeOnEndCardClosed(Boolean bool) {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setTimestamp(System.currentTimeMillis());
        if (bool.booleanValue()) {
            reportingEvent.setEventType(Reporting.EventType.DEFAULT_ENDCARD_CLOSE);
            reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "default");
        } else {
            reportingEvent.setEventType(Reporting.EventType.CUSTOM_ENDCARD_CLOSE);
            reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "custom");
        }
        this.mReportingController.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void invokeOnEndCardSkipped(Boolean bool) {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setTimestamp(System.currentTimeMillis());
        if (bool.booleanValue()) {
            reportingEvent.setEventType(Reporting.EventType.DEFAULT_ENDCARD_SKIP);
            reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "default");
        }
        this.mReportingController.reportEvent(reportingEvent);
    }

    protected void postTrackerEvents(Context context, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            EventTracker.post(context, it.next(), null, true);
        }
    }
}
