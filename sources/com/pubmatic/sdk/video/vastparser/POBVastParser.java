package com.pubmatic.sdk.video.vastparser;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.video.vastmodels.POBVast;
import com.pubmatic.sdk.video.vastmodels.POBVastAd;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLParser;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class POBVastParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final POBVastParserListener f63269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63270b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final POBNetworkHandler f63272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f63273e = 5000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f63271c = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63274a;

        a(String str) {
            this.f63274a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBVastParser pOBVastParser = POBVastParser.this;
            pOBVastParser.a(this.f63274a, pOBVastParser.f63270b, (POBVastAd) null);
        }
    }

    class b implements POBNetworkHandler.POBNetworkListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBVast f63276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f63277b;

        b(POBVast pOBVast, int i10) {
            this.f63276a = pOBVast;
            this.f63277b = i10;
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            if (str == null || this.f63276a.getAds() == null) {
                POBLog.debug("POBVastParser", "Network response is null", new Object[0]);
                POBVastParser.this.a(this.f63276a, 303, "Empty vast ad received.");
            } else if (POBVastParser.this.a(str, this.f63277b - 1, this.f63276a.getAds().get(0)) == null) {
                POBVastParser.this.a(this.f63276a, 100, "Failed to parse vast response.");
            }
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        public void onFailure(POBError pOBError) {
            POBVastParser pOBVastParser = POBVastParser.this;
            pOBVastParser.a(this.f63276a, pOBVastParser.a(pOBError), pOBError.getErrorMessage());
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBVast f63279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f63280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f63281c;

        c(POBVast pOBVast, int i10, String str) {
            this.f63279a = pOBVast;
            this.f63280b = i10;
            this.f63281c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBVastParser.this.f63269a != null) {
                POBVastParser.this.f63269a.onFailure(this.f63279a, new POBVastError(this.f63280b, this.f63281c));
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBVast f63283a;

        d(POBVast pOBVast) {
            this.f63283a = pOBVast;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBVastParser.this.f63269a != null) {
                POBVastParser.this.f63269a.onSuccess(this.f63283a);
            }
        }
    }

    public POBVastParser(@NonNull POBNetworkHandler pOBNetworkHandler, int i10, @Nullable POBVastParserListener pOBVastParserListener) {
        this.f63272d = pOBNetworkHandler;
        this.f63269a = pOBVastParserListener;
        this.f63270b = i10;
    }

    public void parse(@NonNull String str) {
        POBTaskHandler.getInstance().runOnBackgroundThread(new a(str));
    }

    public void setWrapperTimeout(int i10) {
        this.f63273e = i10;
    }

    private boolean b(POBVast pOBVast) {
        return (pOBVast == null || pOBVast.getAds() == null || pOBVast.getAds().isEmpty() || pOBVast.getAds().get(0).getAdType() != POBVastAd.POBVastAdType.INLINE) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public POBVast a(String str, int i10, POBVastAd pOBVastAd) {
        POBVast pOBVast = (POBVast) POBXMLParser.parse(str, POBVast.class);
        if (pOBVast != null) {
            if (pOBVast.getAds() != null && !pOBVast.getAds().isEmpty()) {
                pOBVast.getAds().get(0).setWrapper(pOBVastAd);
            }
            if (pOBVast.getVersion() != null && !a(pOBVast.getVersion())) {
                a(pOBVast, 102, "Received vast version is unsupported.");
                return pOBVast;
            }
            if (b(pOBVast)) {
                a(pOBVast);
                return pOBVast;
            }
            if (i10 == 0) {
                a(pOBVast, 302, "Maximum wrapper attempts reached.");
                return pOBVast;
            }
            List<POBVastAd> ads = pOBVast.getAds();
            if (ads != null && !ads.isEmpty() && ads.get(0).getAdType() != POBVastAd.POBVastAdType.NO_ADS) {
                String vASTAdTagURI = ads.get(0).getVASTAdTagURI();
                if (vASTAdTagURI != null && !vASTAdTagURI.isEmpty()) {
                    POBHttpRequest pOBHttpRequest = new POBHttpRequest();
                    pOBHttpRequest.setUrl(vASTAdTagURI);
                    pOBHttpRequest.setRequestTag("POBVastParser");
                    pOBHttpRequest.setTimeout(this.f63273e);
                    this.f63272d.sendRequest(pOBHttpRequest, new b(pOBVast, i10));
                    return pOBVast;
                }
                a(pOBVast, 101, "Ad tag URI is missing in wrapper vast response.");
                return pOBVast;
            }
            a(pOBVast, 303, "Empty vast ad received.");
            return pOBVast;
        }
        if (i10 == this.f63270b) {
            a((POBVast) null, 100, "Failed to parse vast response.");
        }
        return pOBVast;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBVast pOBVast, int i10, String str) {
        this.f63271c.post(new c(pOBVast, i10, str));
    }

    private void a(POBVast pOBVast) {
        this.f63271c.post(new d(pOBVast));
    }

    private boolean a(String str) {
        if (str != null) {
            try {
                if (Integer.parseInt(str.split("\\.")[0]) >= 2) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(POBError pOBError) {
        return (pOBError == null || pOBError.getErrorCode() != 1005) ? 300 : 301;
    }
}
