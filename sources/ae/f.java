package ae;

import android.location.Location;
import android.text.TextUtils;
import android.util.Base64;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.EventType;
import com.explorestack.protobuf.adcom.LocationType;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFormat;
import io.bidmachine.BannerAdSize;
import io.bidmachine.MediaAssetType;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.sdk.AdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4266a;

        static {
            int[] iArr = new int[Value.KindCase.values().length];
            f4266a = iArr;
            try {
                iArr[Value.KindCase.NUMBER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4266a[Value.KindCase.STRING_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4266a[Value.KindCase.BOOL_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4266a[Value.KindCase.STRUCT_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4266a[Value.KindCase.LIST_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a(Map map, TrackEventType trackEventType, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List arrayList = (List) map.get(trackEventType);
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            map.put(trackEventType, arrayList);
        }
        arrayList.add(str);
    }

    public static AdFormat.Builder b(io.bidmachine.AdFormat adFormat) {
        AdFormat.Builder builderNewBuilder = AdFormat.newBuilder();
        if (adFormat instanceof AdFormat.Banner) {
            BannerAdSize bannerAdSize = ((AdFormat.Banner) adFormat).getBannerAdSize();
            builderNewBuilder.setBanner(AdFormat.Banner.newBuilder().setWidth(bannerAdSize.getWidth()).setHeight(bannerAdSize.getHeight()).setIsAdaptive(bannerAdSize.getIsAdaptive()));
            return builderNewBuilder;
        }
        if (adFormat instanceof AdFormat.Interstitial) {
            AdContentType adContentType = ((AdFormat.Interstitial) adFormat).getAdContentType();
            boolean z10 = adContentType == AdContentType.All;
            builderNewBuilder.setInterstitial(AdFormat.Interstitial.newBuilder().setHasBanner(z10 || adContentType == AdContentType.Static).setHasVideo(z10 || adContentType == AdContentType.Video));
            return builderNewBuilder;
        }
        if (adFormat instanceof AdFormat.Rewarded) {
            AdContentType adContentType2 = ((AdFormat.Rewarded) adFormat).getAdContentType();
            boolean z11 = adContentType2 == AdContentType.All;
            builderNewBuilder.setRewarded(AdFormat.Rewarded.newBuilder().setHasBanner(z11 || adContentType2 == AdContentType.Static).setHasVideo(z11 || adContentType2 == AdContentType.Video));
            return builderNewBuilder;
        }
        if (adFormat instanceof AdFormat.Native) {
            List<MediaAssetType> mediaAssetTypes = ((AdFormat.Native) adFormat).getMediaAssetTypes();
            boolean zIsAll = MediaAssetType.isAll(mediaAssetTypes);
            builderNewBuilder.setNative(AdFormat.Native.newBuilder().setHasVideo(zIsAll || mediaAssetTypes.contains(MediaAssetType.Video)).setHasIcon(zIsAll || mediaAssetTypes.contains(MediaAssetType.Icon)).setHasImage(zIsAll || mediaAssetTypes.contains(MediaAssetType.Image)));
        }
        return builderNewBuilder;
    }

    public static Context.Geo.Builder c(android.content.Context context, Location location, Location location2, boolean z10) {
        Context.Geo.Builder builderNewBuilder = Context.Geo.newBuilder();
        e(builderNewBuilder, io.bidmachine.core.h.u(context, location, location2), z10);
        return builderNewBuilder;
    }

    public static String d(MessageLite messageLite) {
        if (messageLite == null) {
            return null;
        }
        try {
            return Base64.encodeToString(messageLite.toByteArray(), 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void e(Context.Geo.Builder builder, Location location, boolean z10) {
        if (z10) {
            builder.setUtcoffset(io.bidmachine.core.h.C());
        }
        if (location != null) {
            builder.setType(h(location));
            builder.setLat((float) location.getLatitude());
            builder.setLon((float) location.getLongitude());
            builder.setAccur((int) location.getAccuracy());
            builder.setLastfix(location.getTime());
        }
    }

    public static void f(Struct.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String str = (String) entry.getKey();
                if (value.getClass() == String.class) {
                    builder.putFields(str, Value.newBuilder().setStringValue((String) value).build());
                } else if (value.getClass() == Boolean.class) {
                    builder.putFields(str, Value.newBuilder().setBoolValue(((Boolean) value).booleanValue()).build());
                } else if (value instanceof Number) {
                    builder.putFields(str, Value.newBuilder().setNumberValue(((Number) value).doubleValue()).build());
                }
            }
        }
    }

    public static AdExtension g(Ad ad2) {
        int extProtoCount = ad2.getExtProtoCount();
        if (extProtoCount <= 0) {
            return null;
        }
        for (int i10 = 0; i10 < extProtoCount; i10++) {
            try {
                Any extProto = ad2.getExtProto(i10);
                if (extProto.is(AdExtension.class)) {
                    return (AdExtension) extProto.unpack(AdExtension.class);
                }
                continue;
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
        return null;
    }

    public static LocationType h(Location location) {
        if (location != null) {
            if ("gps".equals(location.getProvider())) {
                return LocationType.LOCATION_TYPE_GPS;
            }
            if ("network".equals(location.getProvider()) || "passive".equals(location.getProvider())) {
                return LocationType.LOCATION_TYPE_IP;
            }
        }
        return LocationType.LOCATION_TYPE_INVALID;
    }

    public static boolean i(Placement placement, BannerAdSize bannerAdSize) {
        Placement.DisplayPlacement display = placement.getDisplay();
        if (display.getInstl()) {
            return false;
        }
        return bannerAdSize.isSuitable(display.getW(), display.getH());
    }

    public static boolean j(ListValue listValue) {
        return listValue == null || listValue.getValuesCount() <= 0;
    }

    public static boolean k(Struct struct) {
        return struct == null || struct.getFieldsCount() <= 0;
    }

    public static boolean l(Placement placement) {
        if (n(placement)) {
            return false;
        }
        Placement.DisplayPlacement display = placement.getDisplay();
        if (display == Placement.DisplayPlacement.getDefaultInstance() || !display.getInstl()) {
            return o(placement);
        }
        return true;
    }

    public static boolean m(Placement placement) {
        return placement.getDisplay().getNativefmt().getAssetCount() > 0;
    }

    public static boolean n(Placement placement) {
        return placement.getReward();
    }

    public static boolean o(Placement placement) {
        return placement.getVideo() != Placement.VideoPlacement.getDefaultInstance();
    }

    public static Timestamp p(long j10) {
        return Timestamp.newBuilder().setSeconds(j10 / 1000).setNanos(((int) (j10 % 1000)) * 1000000).build();
    }

    public static void q(Map map, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Ad.Event event = (Ad.Event) it.next();
            TrackEventType trackEventTypeFromNumber = event.getType() == EventType.EVENT_TYPE_IMPRESSION ? TrackEventType.Show : TrackEventType.fromNumber(event.getTypeValue());
            if (trackEventTypeFromNumber != null) {
                a(map, trackEventTypeFromNumber, event.getUrl());
            }
        }
    }

    public static Timestamp r(long j10) {
        return Timestamp.newBuilder().setSeconds(j10).setNanos(0).build();
    }

    public static List s(ListValue listValue) {
        if (j(listValue)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Value> it = listValue.getValuesList().iterator();
        while (it.hasNext()) {
            Object objV = v(it.next());
            if (objV != null) {
                arrayList.add(objV);
            }
        }
        return arrayList;
    }

    public static ListValue.Builder t(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Value.Builder builderX = x(it.next());
            if (builderX != null) {
                builderNewBuilder.addValues(builderX);
            }
        }
        return builderNewBuilder;
    }

    public static Map u(Struct struct) {
        Object objV;
        if (k(struct)) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, Value> entry : struct.getFieldsMap().entrySet()) {
            String key = entry.getKey();
            Value value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null && (objV = v(value)) != null) {
                map.put(key, objV);
            }
        }
        return map;
    }

    public static Object v(Value value) {
        if (value == null) {
            return null;
        }
        int i10 = a.f4266a[value.getKindCase().ordinal()];
        if (i10 == 1) {
            return Double.valueOf(value.getNumberValue());
        }
        if (i10 == 2) {
            return value.getStringValue();
        }
        if (i10 == 3) {
            return Boolean.valueOf(value.getBoolValue());
        }
        if (i10 == 4) {
            return u(value.getStructValue());
        }
        if (i10 != 5) {
            return null;
        }
        return s(value.getListValue());
    }

    public static Struct.Builder w(Map map) {
        Value.Builder builderX;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key != null) {
                String strValueOf = String.valueOf(key);
                if (!TextUtils.isEmpty(strValueOf) && (builderX = x(entry.getValue())) != null) {
                    builderNewBuilder.putFields(strValueOf, builderX.build());
                }
            }
        }
        return builderNewBuilder;
    }

    public static Value.Builder x(Object obj) {
        Struct.Builder builderW;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Value) {
            return ((Value) obj).toBuilder();
        }
        if (obj instanceof Value.Builder) {
            return (Value.Builder) obj;
        }
        if (obj instanceof String) {
            return Value.newBuilder().setStringValue((String) obj);
        }
        if (obj instanceof Number) {
            return Value.newBuilder().setNumberValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return Value.newBuilder().setBoolValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof List) {
            ListValue.Builder builderT = t((List) obj);
            if (builderT != null) {
                return Value.newBuilder().setListValue(builderT);
            }
        } else if ((obj instanceof Map) && (builderW = w((Map) obj)) != null) {
            return Value.newBuilder().setStructValue(builderW);
        }
        return null;
    }

    public static Value y(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Value) {
            return (Value) obj;
        }
        if (obj instanceof Value.Builder) {
            return ((Value.Builder) obj).build();
        }
        Value.Builder builderX = x(obj);
        if (builderX != null) {
            return builderX.build();
        }
        return null;
    }
}
