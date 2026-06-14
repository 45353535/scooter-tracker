package io.bidmachine;

import android.content.Context;
import com.explorestack.protobuf.Struct;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.sdk.Configuration;
import io.bidmachine.protobuf.sdk.Monitor;
import io.bidmachine.protobuf.sdk.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
class w1 {
    w1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context) {
        try {
            BidMachineAnalytics.initialize(context);
        } catch (Throwable unused) {
        }
    }

    private List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Monitor.Configuration configuration = (Monitor.Configuration) it.next();
            arrayList.add(new MonitorConfig(configuration.getName().getValue(), configuration.getUrl().getValue(), configuration.getBatchSize().getValue(), configuration.getInterval().getValue(), configuration.hasShouldReport() ? configuration.getShouldReport().getValue() : false));
        }
        return arrayList;
    }

    private List d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reader.Configuration configuration = (Reader.Configuration) it.next();
            arrayList.add(new ReaderConfig(configuration.getName().getValue(), configuration.getUrl().getValue(), configuration.getUpdateInterval().getValue(), configuration.hasUniqueOnly() ? configuration.getUniqueOnly().getValue() : true, e(configuration.getRulesList())));
        }
        return arrayList;
    }

    private List e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reader.Rule rule = (Reader.Rule) it.next();
            if (rule.hasGeneralRule()) {
                Reader.Rule.GeneralRule generalRule = rule.getGeneralRule();
                arrayList.add(new ReaderConfig.Rule.GeneralRule(generalRule.getTag().getValue(), generalRule.getPath().getValue()));
            } else if (rule.hasPurRule()) {
                Reader.Rule.PurRule purRule = rule.getPurRule();
                arrayList.add(new ReaderConfig.Rule.PurRule(purRule.getTag().getValue(), purRule.getPath().getValue(), purRule.hasQuery() ? purRule.getQuery().getValue() : null, purRule.hasShouldReport() ? purRule.getShouldReport().getValue() : true));
            }
        }
        return arrayList;
    }

    void a(Context context, String str, InitResponse initResponse, String str2) {
        try {
            if (initResponse.hasSdkAnalyticConfigV2()) {
                Configuration sdkAnalyticConfigV2 = initResponse.getSdkAnalyticConfigV2();
                List listC = c(sdkAnalyticConfigV2.getMonitorsList());
                List listD = d(sdkAnalyticConfigV2.getReadersList());
                Struct struct = initResponse.getExtras().getPrivate();
                String value = sdkAnalyticConfigV2.getBpk().getValue();
                BidMachineAnalytics.configure(context, new AnalyticsConfig(str2, listC, listD, value, struct));
                if (str.equals(str2)) {
                    return;
                }
                BidMachineAnalytics.configure(context, new AnalyticsConfig(str, listC, listD, value, struct));
            }
        } catch (Throwable unused) {
        }
    }
}
