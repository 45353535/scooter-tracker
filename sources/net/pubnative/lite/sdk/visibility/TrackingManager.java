package net.pubnative.lite.sdk.visibility;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.TrackingUrlModel;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.network.e;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public class TrackingManager {
    private static final long ITEM_VALIDITY_TIME = 1800000;
    protected static final String SHARED_FAILED_LIST = "failed";
    protected static final String SHARED_PENDING_LIST = "pending";
    private static final String SHARED_PREFERENCES = "TrackingManager";
    private static final String TAG = "TrackingManager";
    private static boolean sIsTracking;

    protected static TrackingUrlModel dequeueItem(Context context, String str) {
        List<TrackingUrlModel> list = getList(context, str);
        if (list.isEmpty()) {
            return null;
        }
        TrackingUrlModel trackingUrlModel = list.get(0);
        list.remove(0);
        setList(context, str, list);
        return trackingUrlModel;
    }

    protected static void enqueueFailedList(Context context) {
        List<TrackingUrlModel> list = getList(context, "failed");
        List<TrackingUrlModel> list2 = getList(context, SHARED_PENDING_LIST);
        list2.addAll(list);
        setList(context, SHARED_PENDING_LIST, list2);
        list.clear();
        setList(context, "failed", list);
    }

    protected static void enqueueItem(Context context, String str, TrackingUrlModel trackingUrlModel) {
        List<TrackingUrlModel> list = getList(context, str);
        list.add(trackingUrlModel);
        setList(context, str, list);
    }

    protected static List<TrackingUrlModel> getList(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        String string = getSharedPreferences(context).getString(str, null);
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(new TrackingUrlModel(jSONArray.getJSONObject(i10)));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return arrayList;
    }

    protected static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCES, 0);
    }

    protected static void setList(Context context, String str, List<TrackingUrlModel> list) {
        SharedPreferences.Editor editorEdit = getSharedPreferences(context).edit();
        if (list == null) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<TrackingUrlModel> it = list.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(it.next().toJson());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
    }

    public static synchronized void track(Context context, String str) {
        if (context == null) {
            Log.w(TAG, "track - ERROR: Context parameter is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "track - ERROR: url parameter is null");
            return;
        }
        enqueueFailedList(context);
        TrackingUrlModel trackingUrlModel = new TrackingUrlModel();
        trackingUrlModel.url = str;
        trackingUrlModel.startTimestamp = System.currentTimeMillis();
        enqueueItem(context, SHARED_PENDING_LIST, trackingUrlModel);
        trackNextItem(context);
    }

    protected static synchronized void trackNextItem(final Context context) {
        if (sIsTracking) {
            Log.w(TAG, "trackNextItem - Currently tracking, dropping the call, will be resumed soon");
            return;
        }
        sIsTracking = true;
        final TrackingUrlModel trackingUrlModelDequeueItem = dequeueItem(context, SHARED_PENDING_LIST);
        if (trackingUrlModelDequeueItem == null) {
            sIsTracking = false;
            return;
        }
        if (trackingUrlModelDequeueItem.startTimestamp + ITEM_VALIDITY_TIME < System.currentTimeMillis()) {
            sIsTracking = false;
            trackNextItem(context);
            return;
        }
        HashMap map = new HashMap();
        String userAgent = HyBid.getDeviceInfo().getUserAgent();
        if (!TextUtils.isEmpty(userAgent)) {
            map.put("User-Agent", userAgent);
        }
        PNHttpClient.makeRequest(context, trackingUrlModelDequeueItem.url, map, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.visibility.TrackingManager.1
            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onFailure(Throwable th2) {
                TrackingManager.enqueueItem(context, "failed", trackingUrlModelDequeueItem);
                TrackingManager.sIsTracking = false;
                TrackingManager.trackNextItem(context);
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public /* synthetic */ void onFinally(String str, int i10) {
                e.a(this, str, i10);
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onSuccess(String str, Map<String, List<String>> map2) {
                TrackingManager.sIsTracking = false;
                TrackingManager.trackNextItem(context);
            }
        });
    }
}
