package net.pubnative.lite.sdk.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.db.OnDatabaseResetListener;
import net.pubnative.lite.sdk.db.SessionImpression;
import net.pubnative.lite.sdk.prefs.HyBidPreferences;
import net.pubnative.lite.sdk.utils.HyBidTimeUtils;
import net.pubnative.lite.sdk.utils.Logger;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class SessionImpressionPrefs {
    private static final String JSON_EXCEPTION = "JSONException";
    private static final String SESSION_IMPRESSION_LIST_KEY = "session_impression_key";
    private SharedPreferences.Editor editor;
    private Context mContext;
    private SharedPreferences sharedPreferences;

    public SessionImpressionPrefs(Context context) {
        if (context != null) {
            this.mContext = context;
            SharedPreferences sharedPreferences = context.getSharedPreferences("session_prefs_reporting", 0);
            this.sharedPreferences = sharedPreferences;
            if (sharedPreferences != null) {
                this.editor = sharedPreferences.edit();
            }
        }
    }

    private JSONArray convertListToJson(List<SessionImpression> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<SessionImpression> it = list.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().toJson());
            } catch (Exception e10) {
                Logger.e(JSON_EXCEPTION, e10.toString());
            }
        }
        return jSONArray;
    }

    private synchronized Long getAgeOfApp() {
        Context context = this.mContext;
        if (context == null) {
            return 0L;
        }
        return Long.valueOf(new HyBidPreferences(context).getSessionTimeStamp());
    }

    private synchronized void increment(SessionImpression sessionImpression) {
        try {
            if (this.editor != null) {
                String string = this.sharedPreferences.getString(SESSION_IMPRESSION_LIST_KEY, "");
                ArrayList arrayList = new ArrayList();
                if (string.isEmpty()) {
                    sessionImpression.setCount(1);
                    arrayList.add(sessionImpression);
                } else {
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            arrayList.add(new SessionImpression(jSONArray.getJSONObject(i10)));
                        }
                        incrementZoneId(arrayList, sessionImpression);
                    } catch (JSONException e10) {
                        Logger.e(JSON_EXCEPTION, e10.toString());
                    }
                }
                this.editor.putString(SESSION_IMPRESSION_LIST_KEY, convertListToJson(arrayList).toString());
                this.editor.apply();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void incrementZoneId(List<SessionImpression> list, SessionImpression sessionImpression) {
        if (list == null || sessionImpression == null) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            SessionImpression sessionImpression2 = list.get(i10);
            if (sessionImpression2 != null && !TextUtils.isEmpty(sessionImpression.getZoneId()) && !TextUtils.isEmpty(sessionImpression2.getZoneId()) && sessionImpression.getZoneId().equals(sessionImpression2.getZoneId())) {
                sessionImpression2.setCount(Integer.valueOf(sessionImpression2.getCount().intValue() + 1));
                return;
            }
        }
        sessionImpression.setCount(1);
        list.add(sessionImpression);
    }

    private synchronized void manageImpressionSession(Long l10) {
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        new HyBidPreferences(context).setSessionTimeStamp(l10.longValue(), new OnDatabaseResetListener() { // from class: dh.a
            @Override // net.pubnative.lite.sdk.db.OnDatabaseResetListener
            public final void onDatabaseReset() {
                this.f68672a.nukePrefs();
            }
        }, HyBidPreferences.TIMESTAMP.AD_REQUEST);
    }

    public Integer getImpressionDepth(String str) {
        SessionImpression sessionImpression;
        String string = this.sharedPreferences.getString(SESSION_IMPRESSION_LIST_KEY, "");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        if (!string.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList.add(new SessionImpression(jSONArray.getJSONObject(i11)));
                }
            } catch (JSONException e10) {
                Logger.e(JSON_EXCEPTION, e10.toString());
            }
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    sessionImpression = null;
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                sessionImpression = (SessionImpression) obj;
                if (!TextUtils.isEmpty(sessionImpression.getZoneId()) && !TextUtils.isEmpty(str) && sessionImpression.getZoneId().equals(str)) {
                    break;
                }
            }
            if (sessionImpression != null) {
                return sessionImpression.getCount();
            }
        }
        return 0;
    }

    public synchronized void insert(String str) {
        SessionImpression sessionImpression = new SessionImpression();
        sessionImpression.setTimestamp(Long.valueOf(System.currentTimeMillis()));
        sessionImpression.setZoneId(str);
        Long ageOfApp = getAgeOfApp();
        sessionImpression.setSessionDuration(new HyBidTimeUtils().calculateSessionDuration(sessionImpression.getTimestamp(), ageOfApp));
        sessionImpression.setAgeOfApp(ageOfApp);
        manageImpressionSession(sessionImpression.getTimestamp());
        increment(sessionImpression);
    }

    public synchronized void nukePrefs() {
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.putString(SESSION_IMPRESSION_LIST_KEY, "");
        }
    }
}
