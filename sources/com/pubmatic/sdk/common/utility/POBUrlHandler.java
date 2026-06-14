package com.pubmatic.sdk.common.utility;

import android.content.Context;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.browser.POBInternalBrowserActivity;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBDeepLinkURLModel;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class POBUrlHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UrlHandlerListener f62590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f62591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f62592c = false;

    public interface UrlHandlerListener {
        void onErrorOpenUrl(@NonNull String str);

        void onHandleTrackers(@NonNull String str, @NonNull List<String> list);

        void onInternalBrowserClose(@NonNull String str);

        void onInternalBrowserOpen(@NonNull String str);

        void onLeaveApp(@NonNull String str);
    }

    class a implements POBInternalBrowserActivity.InternalBrowserListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62593a;

        a(String str) {
            this.f62593a = str;
        }

        @Override // com.pubmatic.sdk.common.browser.POBInternalBrowserActivity.InternalBrowserListener
        public void onBrowserDismiss() {
            POBLog.debug("POBUrlHandler", "Dismissed device default browser. url :%s", this.f62593a);
            POBUrlHandler.this.f62590a.onInternalBrowserClose(this.f62593a);
            POBUrlHandler.this.f62592c = false;
        }

        @Override // com.pubmatic.sdk.common.browser.POBInternalBrowserActivity.InternalBrowserListener
        public void onBrowserStart() {
            POBUrlHandler.this.f62590a.onInternalBrowserOpen(this.f62593a);
        }

        @Override // com.pubmatic.sdk.common.browser.POBInternalBrowserActivity.InternalBrowserListener
        public void onExternalBrowserClick(String str) {
            POBLog.debug("POBUrlHandler", "Opening current page in device's default browser. url :%s", str);
            if (POBUtils.openExternalBrowser(POBUrlHandler.this.f62591b, str)) {
                POBUrlHandler.this.f62590a.onLeaveApp(str);
            } else {
                POBUrlHandler.this.f62590a.onErrorOpenUrl(str);
                POBLog.warn("POBUrlHandler", "Unable to open url in external browser from internal browser %s", str);
            }
        }
    }

    public POBUrlHandler(@NonNull Context context, @NonNull UrlHandlerListener urlHandlerListener) {
        this.f62591b = context;
        this.f62590a = urlHandlerListener;
    }

    private void c(String str) {
        POBLog.warn("POBUrlHandler", "Unable to handle URL: %s", str);
        this.f62590a.onErrorOpenUrl(str);
    }

    private void d(String str, String str2) {
        if (this.f62592c) {
            POBLog.warn("POBUrlHandler", "Internal browser already displayed", new Object[0]);
            return;
        }
        this.f62592c = true;
        POBInternalBrowserActivity.startNewActivity(this.f62591b, str, new a(str));
        b(str, str2);
    }

    public void open(@Nullable String str, @Nullable String str2) {
        if (!POBUtils.isStringValueNullOrEmpty(str)) {
            POBLog.debug("POBUrlHandler", "Opening landing page with url: %s", str);
            open(str);
            return;
        }
        if (!POBUtils.isStringValueNullOrEmpty(str2)) {
            POBLog.debug("POBUrlHandler", "Opening landing page with url: %s", str);
            open(str2);
            return;
        }
        POBLog.debug("POBUrlHandler", "Failed to open url: " + str, new Object[0]);
        UrlHandlerListener urlHandlerListener = this.f62590a;
        if (str == null) {
            str = "";
        }
        urlHandlerListener.onErrorOpenUrl(str);
    }

    private void b(String str, String str2) {
        if (POBUtils.isNullOrEmpty(str2)) {
            return;
        }
        this.f62590a.onHandleTrackers(str, Collections.singletonList(str2));
    }

    private void a(POBDeepLinkURLModel pOBDeepLinkURLModel) {
        boolean zTriggerDeepLink;
        if (!POBUtils.isNullOrEmpty(pOBDeepLinkURLModel.getPrimaryUrl())) {
            if (POBDeepLinkUtil.b(pOBDeepLinkURLModel.getPrimaryUrl())) {
                zTriggerDeepLink = POBDeepLinkUtil.a(this.f62591b, pOBDeepLinkURLModel.getPrimaryUrl());
            } else {
                zTriggerDeepLink = POBDeepLinkUtil.triggerDeepLink(this.f62591b, pOBDeepLinkURLModel.getPrimaryUrl(), false);
            }
            if (zTriggerDeepLink) {
                POBLog.debug("POBUrlHandler", "Deep link success", new Object[0]);
                b(pOBDeepLinkURLModel.getPrimaryUrl(), pOBDeepLinkURLModel.getPrimaryTrackingUrl());
                this.f62590a.onLeaveApp(pOBDeepLinkURLModel.getPrimaryUrl());
                return;
            }
        } else {
            POBLog.debug("POBUrlHandler", "Primary url is not available", new Object[0]);
        }
        if (!POBUtils.isNullOrEmpty(pOBDeepLinkURLModel.getFallbackUrl()) && URLUtil.isValidUrl(pOBDeepLinkURLModel.getFallbackUrl())) {
            a(pOBDeepLinkURLModel.getFallbackUrl(), pOBDeepLinkURLModel.getFallbackTrackingUrl());
        } else {
            POBLog.debug("POBUrlHandler", "Fallback url is not available", new Object[0]);
        }
    }

    private void c(String str, String str2) {
        if (POBUtils.openExternalBrowser(this.f62591b, str)) {
            POBLog.debug("POBUrlHandler", "Opened URL in external browser %s", str);
            b(str, str2);
            this.f62590a.onLeaveApp(str);
            return;
        }
        c(str);
    }

    private void b(String str) {
        if (POBDeepLinkUtil.a(this.f62591b, str)) {
            POBLog.debug("POBUrlHandler", "Deep link success", new Object[0]);
            this.f62590a.onLeaveApp(str);
        } else {
            c(str);
        }
    }

    public void open(@NonNull String str) {
        if (POBDeepLinkURLModel.isPubMaticDeepLink(str)) {
            a(POBDeepLinkURLModel.parseFromUrl(str));
            return;
        }
        if (POBDeepLinkUtil.b(str)) {
            b(str);
            return;
        }
        if (POBDeepLinkUtil.a(str)) {
            a(str);
        } else if (URLUtil.isValidUrl(str)) {
            a(str, (String) null);
        } else {
            c(str);
        }
    }

    private void a(String str, String str2) {
        if (POBInstanceProvider.getSdkConfig().isUseInternalBrowser()) {
            d(str, str2);
        } else {
            c(str, str2);
        }
    }

    private void a(String str) {
        if (POBDeepLinkUtil.triggerDeepLink(this.f62591b, str, false)) {
            POBLog.debug("POBUrlHandler", "Deep link success", new Object[0]);
            this.f62590a.onLeaveApp(str);
        } else {
            c(str);
        }
    }
}
