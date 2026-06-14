package com.startapp.sdk.internal;

import android.text.TextUtils;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoTrackingLink[] f64888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VideoTrackingParams f64889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f64891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VASTErrorCodes f64892e;

    public lj(int i10, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        this.f64888a = videoTrackingLinkArr;
        this.f64889b = videoTrackingParams;
        this.f64890c = str;
        this.f64891d = i10;
    }

    public final kj a() {
        ArrayList arrayList;
        int i10;
        if (this.f64888a == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        VideoTrackingLink[] videoTrackingLinkArr = this.f64888a;
        int length = videoTrackingLinkArr.length;
        int i11 = 0;
        while (i11 < length) {
            VideoTrackingLink videoTrackingLink = videoTrackingLinkArr[i11];
            if (videoTrackingLink.c() == null || (this.f64889b.b() > 0 && !videoTrackingLink.f())) {
                arrayList = arrayList2;
                i10 = 1;
            } else {
                String strC = videoTrackingLink.c();
                String str = this.f64890c;
                String strReplace = strC.replace(com.taurusx.tax.n.z.f66397o, str != null ? TextUtils.htmlEncode(str) : "");
                int i12 = this.f64891d;
                long jConvert = TimeUnit.SECONDS.convert(i12, TimeUnit.MILLISECONDS);
                arrayList = arrayList2;
                i10 = 1;
                long j10 = i12 % 1000;
                Locale locale = Locale.US;
                String strReplace2 = strReplace.replace(com.taurusx.tax.n.z.f66399y, TextUtils.htmlEncode(String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(jConvert / 3600), Long.valueOf((jConvert % 3600) / 60), Long.valueOf(jConvert % 60), Long.valueOf(j10)))).replace(com.taurusx.tax.n.z.f66396c, TextUtils.htmlEncode(String.valueOf(new SecureRandom().nextInt(90000000) + 10000000)));
                String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).format(new Date());
                int length2 = str2.length() - 2;
                String strReplace3 = strReplace2.replace("[TIMESTAMP]", TextUtils.htmlEncode(str2.substring(0, length2) + StringUtils.PROCESS_POSTFIX_DELIMITER + str2.substring(length2)));
                VASTErrorCodes vASTErrorCodes = this.f64892e;
                if (vASTErrorCodes != null) {
                    strReplace3 = strReplace3.replace(com.taurusx.tax.n.z.f66398w, String.valueOf(vASTErrorCodes.a()));
                }
                StringBuilder sb2 = new StringBuilder(strReplace3);
                VideoTrackingLink.TrackingSource trackingSourceB = videoTrackingLink.b();
                if (trackingSourceB == null) {
                    trackingSourceB = vi.d(videoTrackingLink.c()) ? VideoTrackingLink.TrackingSource.STARTAPP : VideoTrackingLink.TrackingSource.EXTERNAL;
                }
                VideoTrackingParams videoTrackingParamsC = this.f64889b.b(trackingSourceB == VideoTrackingLink.TrackingSource.STARTAPP).c(videoTrackingLink.f()).c(videoTrackingLink.a());
                sb2.append(videoTrackingParamsC.e());
                if (videoTrackingParamsC.g()) {
                    sb2.append(g.a(g.c(h0.a(videoTrackingLink.c(), (String) null))));
                }
                arrayList.add(sb2.toString());
            }
            i11 += i10;
            arrayList2 = arrayList;
        }
        return new kj(arrayList2);
    }
}
