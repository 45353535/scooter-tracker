package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public class DataTransportCrashlyticsReportSender {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final CrashlyticsReportJsonTransform f32671c = new CrashlyticsReportJsonTransform();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f32672d = b("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f32673e = b("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Transformer f32674f = new Transformer() { // from class: com.google.firebase.crashlytics.internal.send.a
        @Override // com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return DataTransportCrashlyticsReportSender.f32671c.reportToJson((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReportQueue f32675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Transformer f32676b;

    DataTransportCrashlyticsReportSender(ReportQueue reportQueue, Transformer transformer) {
        this.f32675a = reportQueue;
        this.f32676b = transformer;
    }

    private static String b(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public static DataTransportCrashlyticsReportSender create(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        TransportRuntime.initialize(context);
        TransportFactory transportFactoryNewFactory = TransportRuntime.getInstance().newFactory(new CCTDestination(f32672d, f32673e));
        Encoding encodingOf = Encoding.of("json");
        Transformer transformer = f32674f;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(transportFactoryNewFactory.getTransport("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, encodingOf, transformer), settingsProvider.getSettingsSync(), onDemandCounter), transformer);
    }

    @NonNull
    public Task<CrashlyticsReportWithSessionId> enqueueReport(@NonNull CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z10) {
        return this.f32675a.i(crashlyticsReportWithSessionId, z10).getTask();
    }
}
