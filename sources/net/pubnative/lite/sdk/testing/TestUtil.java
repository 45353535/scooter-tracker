package net.pubnative.lite.sdk.testing;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.pubnative.lite.sdk.db.SessionImpression;
import net.pubnative.lite.sdk.models.APIAsset;
import net.pubnative.lite.sdk.models.APIMeta;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;
import net.pubnative.lite.sdk.models.AdRequest;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.PNAdRequest;
import net.pubnative.lite.sdk.models.Protocol;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TestUtil {
    public static Ad createHeaderBiddingTestAd(int i10, Integer num) {
        Ad ad2 = new Ad();
        ad2.assetgroupid = i10;
        ad2.assets = createMockAssets();
        try {
            ad2.meta = createMockHeaderBiddingMeta(num);
        } catch (JSONException unused) {
            ad2.meta = null;
        }
        ad2.beacons = createMockBeacons();
        return ad2;
    }

    private static List<AdData> createMockAssets() {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        adData.type = APIAsset.HTML_BANNER;
        HashMap map = new HashMap(3);
        adData.data = map;
        map.put(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, 320);
        adData.data.put("h", 50);
        adData.data.put("html", "<a href=\"https://ads.com/click/112770_1386565997\"><img src=\"https://cdn.pubnative.net/widget/v3/assets/320x50.jpg\" width=\"320\" height=\"50\" border=\"0\" alt=\"Advertisement\" /></a>");
        arrayList.add(adData);
        return arrayList;
    }

    private static List<AdData> createMockBeacons() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(createMockImpressionBeacons());
        arrayList.addAll(createMockClickBeacons());
        return arrayList;
    }

    public static List<AdData> createMockClickBeacons() {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        adData.type = "click";
        HashMap map = new HashMap(1);
        adData.data = map;
        map.put("url", "https://got.pubnative.net/click/rtb?aid=1036637");
        arrayList.add(adData);
        return arrayList;
    }

    public static List<AdData> createMockCompanionAdEventsBeacons() {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        adData.type = Ad.Beacon.COMPANION_AD_EVENT;
        HashMap map = new HashMap(1);
        adData.data = map;
        map.put("url", "https://got.pubnative.net/companionadevent/rtb?eventtype=[EVENTTYPE]&error=[ERRORCODE]");
        arrayList.add(adData);
        return arrayList;
    }

    public static List<AdData> createMockCustomEndcardBeacons() {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        adData.type = Ad.Beacon.CUSTOM_ENDCARD_EVENT;
        HashMap map = new HashMap(1);
        adData.data = map;
        map.put("url", "https://got.pubnative.net/customendcardevent/rtb?eventtype=[EVENTTYPE]&error=[ERRORCODE]");
        arrayList.add(adData);
        return arrayList;
    }

    public static List<AdData> createMockHeaderBiddingMeta(Integer num) {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        createPointsMetaData(adData);
        HashMap map = new HashMap(1);
        adData.data = map;
        map.put("number", num);
        arrayList.add(adData);
        return arrayList;
    }

    public static List<AdData> createMockImpressionBeacons() {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        adData.type = "impression";
        HashMap map = new HashMap(1);
        adData.data = map;
        map.put("url", "https://mock-dsp.pubnative.net/tracker/nurl?app_id=1036637&p=0.01");
        arrayList.add(adData);
        return arrayList;
    }

    public static List<AdData> createMockLoadEventBeacons() {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        adData.type = "load_event";
        HashMap map = new HashMap(1);
        adData.data = map;
        map.put("url", "https://got.pubnative.net/loadevent/rtb?eventtype=[EVENT_TYPE]&error=[ERRORCODE]");
        arrayList.add(adData);
        return arrayList;
    }

    private static List<AdData> createMockMeta() throws JSONException {
        ArrayList arrayList = new ArrayList(3);
        AdData adData = new AdData();
        createPointsMetaData(adData);
        HashMap map = new HashMap(1);
        adData.data = map;
        map.put("number", 9);
        AdData adData2 = new AdData();
        adData2.type = APIMeta.REVENUE_MODEL;
        HashMap map2 = new HashMap(1);
        adData2.data = map2;
        map2.put("text", "cpm");
        AdData adData3 = new AdData();
        adData3.type = APIMeta.CONTENT_INFO;
        HashMap map3 = new HashMap(3);
        adData3.data = map3;
        map3.put(POBCoreNativeConstants.NATIVE_LINK, Ad.CONTENT_INFO_LINK_URL);
        adData3.data.put("icon", Ad.CONTENT_INFO_ICON_URL);
        adData3.data.put("text", Ad.CONTENT_INFO_TEXT);
        AdData adData4 = new AdData();
        adData4.type = APIMeta.REMOTE_CONFIGS;
        adData4.data = new HashMap(1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("audiostate", "on");
        jSONObject.put("close_inter_after_finished", false);
        jSONObject.put("creative_autostorekit", true);
        jSONObject.put("endcard_close_delay", 2);
        jSONObject.put("endcardenabled", true);
        jSONObject.put("fullscreen_clickability", true);
        jSONObject.put("html_skip_offset", 5);
        jSONObject.put("rewarded_html_skip_offset", 30);
        jSONObject.put("rewarded_video_skip_offset", 30);
        jSONObject.put("video_skip_offset", 5);
        jSONObject.put("playable_skip_offset", 4);
        jSONObject.put("bc_learn_more_size", "medium");
        jSONObject.put("bc_learn_more_location", "bottom_up");
        adData4.data.put("jsondata", jSONObject);
        arrayList.add(adData);
        arrayList.add(adData2);
        arrayList.add(adData3);
        arrayList.add(adData4);
        return arrayList;
    }

    private static List<AdData> createMockMetaForAtomAdSession() {
        ArrayList arrayList = new ArrayList(4);
        AdData adData = new AdData();
        createPointsMetaData(adData);
        HashMap map = new HashMap(1);
        adData.data = map;
        map.put("number", 9);
        AdData adData2 = new AdData();
        adData2.type = APIMeta.CREATIVE_ID;
        HashMap map2 = new HashMap(1);
        adData2.data = map2;
        map2.put("text", "creative_test_123");
        AdData adData3 = new AdData();
        adData3.type = APIMeta.CAMPAIGN_ID;
        HashMap map3 = new HashMap(1);
        adData3.data = map3;
        map3.put("text", "campaign_test_123");
        AdData adData4 = new AdData();
        adData4.type = APIMeta.REVENUE_MODEL;
        HashMap map4 = new HashMap(1);
        adData4.data = map4;
        map4.put("text", "cpm");
        arrayList.add(adData);
        arrayList.add(adData2);
        arrayList.add(adData3);
        arrayList.add(adData4);
        return arrayList;
    }

    private static void createPointsMetaData(AdData adData) {
        adData.type = APIMeta.POINTS;
    }

    public static Ad createTestAd(int i10) {
        Ad ad2 = new Ad();
        ad2.setLink("https://ads.com/click/112770_1386565997");
        ad2.assetgroupid = i10;
        ad2.assets = createMockAssets();
        try {
            ad2.meta = createMockMeta();
        } catch (JSONException unused) {
            ad2.meta = null;
        }
        ad2.beacons = createMockBeacons();
        return ad2;
    }

    public static Ad createTestAdForAtomAdSession() {
        return createTestAdForAtomAdSession(10);
    }

    public static AdRequest createTestAdRequest() {
        PNAdRequest pNAdRequest = new PNAdRequest();
        pNAdRequest.appToken = "dde3c298b47648459f8ada4a982fa92d";
        pNAdRequest.os = "android";
        pNAdRequest.osver = "8.1.0";
        pNAdRequest.dnt = "0";
        pNAdRequest.f95870mf = "points,revenuemodel,contentinfo";
        pNAdRequest.al = "s";
        pNAdRequest.gid = "d98374d3-3b69-4a4b-a2c1-9dcb4c588849";
        pNAdRequest.zoneId = "2";
        pNAdRequest.bundleid = "net.pubnative.lite.demo";
        pNAdRequest.testMode = "0";
        pNAdRequest.locale = "en";
        pNAdRequest.gidmd5 = "e74483c4b5e6dc78e088d9fb0243ae66";
        pNAdRequest.gidsha1 = "96e380195959b8e7e05d6c6029154dc99e7fe954";
        return pNAdRequest;
    }

    public static AdResponse createTestAdResponse() {
        AdResponse adResponse = new AdResponse();
        ArrayList arrayList = new ArrayList(1);
        adResponse.ads = arrayList;
        arrayList.add(createTestBannerAd());
        adResponse.status = "ok";
        return adResponse;
    }

    public static Ad createTestBannerAd() {
        return createTestAd(10);
    }

    public static Ad createTestInterstitialAd() {
        return createTestAd(21);
    }

    public static Ad createTestLeaderboardAd() {
        return createTestAd(24);
    }

    public static Ad createTestMRectAd() {
        return createTestAd(8);
    }

    public static SessionImpression createTestSessionImpression() {
        SessionImpression sessionImpression = new SessionImpression();
        sessionImpression.setZoneId(Protocol.VAST_1_0_WRAPPER);
        sessionImpression.setSessionDuration(Long.valueOf(System.currentTimeMillis() - SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US));
        sessionImpression.setAgeOfApp(21323243L);
        return sessionImpression;
    }

    public static Ad createTestVideoInterstitialAd() {
        return createTestAd(15);
    }

    public static Ad createTestVideoMRectAd() {
        return createTestAd(4);
    }

    public static Ad createTestAdForAtomAdSession(int i10) {
        Ad ad2 = new Ad();
        ad2.assetgroupid = i10;
        ad2.assets = createMockAssets();
        ad2.meta = createMockMetaForAtomAdSession();
        ad2.beacons = createMockBeacons();
        return ad2;
    }
}
