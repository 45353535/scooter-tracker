package sg.bigo.ads.controller.a;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.N6;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f103299a;

    static {
        HashMap map = new HashMap();
        f103299a = map;
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, "asia");
        map.put(CampaignEx.JSON_KEY_AD_AL, "asia");
        map.put("az", "asia");
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT, "asia");
        map.put("bh", "asia");
        map.put("bd", "asia");
        map.put("bt", "asia");
        map.put(ScarConstants.BN_SIGNAL_KEY, "asia");
        map.put("cn", "asia");
        map.put("cy", "asia");
        map.put("hk", "asia");
        map.put(ScarConstants.IN_SIGNAL_KEY, "asia");
        map.put("id", "asia");
        map.put("ir", "asia");
        map.put("iq", "asia");
        map.put("il", "asia");
        map.put("jp", "asia");
        map.put("jo", "asia");
        map.put("kz", "asia");
        map.put("kp", "asia");
        map.put("kr", "asia");
        map.put("kh", "asia");
        map.put("kw", "asia");
        map.put("la", "asia");
        map.put("lb", "asia");
        map.put("lu", "asia");
        map.put("mo", "asia");
        map.put("my", "asia");
        map.put("mv", "asia");
        map.put("mn", "asia");
        map.put("np", "asia");
        map.put("om", "asia");
        map.put("pk", "asia");
        map.put("ph", "asia");
        map.put("qa", "asia");
        map.put("sa", "asia");
        map.put(N6.f41394j1, "asia");
        map.put("sy", "asia");
        map.put("tw", "asia");
        map.put("tj", "asia");
        map.put("th", "asia");
        map.put("tm", "asia");
        map.put("va", "asia");
        map.put("vn", "asia");
        map.put("ye", "asia");
        map.put("au", "asia");
        map.put("ck", "asia");
        map.put("fj", "asia");
        map.put("gu", "asia");
        map.put("nz", "asia");
        map.put("pg", "asia");
        map.put(TypedValues.TransitionType.S_TO, "asia");
        map.put("at", "europe");
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_BIDEVENT, "europe");
        map.put("bg", "europe");
        map.put("ch", "europe");
        map.put("cz", "europe");
        map.put(com.taurusx.tax.g.a.f66072a, "europe");
        map.put(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "europe");
        map.put("es", "europe");
        map.put("ee", "europe");
        map.put("fi", "europe");
        map.put("fr", "europe");
        map.put("gr", "europe");
        map.put("gb", "europe");
        map.put("hr", "europe");
        map.put("hu", "europe");
        map.put("is", "europe");
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "europe");
        map.put("it", "europe");
        map.put("lv", "europe");
        map.put("lt", "europe");
        map.put(N6.f41367a1, "europe");
        map.put("md", "europe");
        map.put("mc", "europe");
        map.put("nl", "europe");
        map.put(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO, "europe");
        map.put("pl", "europe");
        map.put("pt", "europe");
        map.put("ro", "europe");
        map.put("ru", "europe");
        map.put("sm", "europe");
        map.put("sk", "europe");
        map.put("se", "europe");
        map.put(N6.f41375d0, "europe");
        map.put("uk", "europe");
        map.put("yu", "europe");
        map.put(CmcdConfiguration.KEY_BUFFER_STARVATION, "america");
        map.put("bm", "america");
        map.put(DownloadCommon.DOWNLOAD_REPORT_CANCEL, "america");
        map.put("cr", "america");
        map.put("cu", "america");
        map.put("gd", "america");
        map.put("gt", "america");
        map.put(DownloadCommon.DOWNLOAD_REPORT_HOST, "america");
        map.put("hn", "america");
        map.put("jm", "america");
        map.put("mx", "america");
        map.put("ni", "america");
        map.put("pa", "america");
        map.put("us", "america");
        map.put("ve", "america");
        map.put("ar", "america");
        map.put("bo", "america");
        map.put("br", "america");
        map.put("cl", "america");
        map.put("co", "america");
        map.put("ec", "america");
        map.put("gy", "america");
        map.put("py", "america");
        map.put("pe", "america");
        map.put("uy", "america");
    }

    @NonNull
    public static String a(String str) {
        String str2;
        return (q.a((CharSequence) str) || (str2 = f103299a.get(str.toLowerCase())) == null) ? "" : str2;
    }
}
