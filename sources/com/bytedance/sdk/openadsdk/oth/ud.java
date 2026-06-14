package com.bytedance.sdk.openadsdk.oth;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private final String lnr;
    private SharedPreferences qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Context f17787ud;

    public ud(Context context, String str) {
        this.f17787ud = context;
        this.lnr = str;
    }

    private SharedPreferences ud() {
        Context context;
        SharedPreferences sharedPreferences = this.qdl;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.lnr) || (context = this.f17787ud) == null) {
            return null;
        }
        try {
            this.qdl = context.getSharedPreferences(this.lnr, 0);
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
        return this.qdl;
    }

    public void qdl(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesUd = ud();
            if (sharedPreferencesUd != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesUd.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                Double d10 = (Double) obj;
                                d10.doubleValue();
                                editorEdit.putFloat(next, d10.floatValue());
                            }
                        }
                    } catch (Throwable th2) {
                        Log.e("SPUnit", th2.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th3) {
            Log.e("SPUnit", th3.getMessage());
        }
    }

    public long ud(String str, long j10) {
        try {
            SharedPreferences sharedPreferencesUd = ud();
            if (sharedPreferencesUd != null && sharedPreferencesUd.contains(str)) {
                return sharedPreferencesUd.getLong(str, j10);
            }
            return j10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.lnr + th2.getMessage());
            return j10;
        }
    }

    public void qdl(String str, long j10) {
        try {
            SharedPreferences sharedPreferencesUd = ud();
            if (sharedPreferencesUd != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesUd.edit();
                editorEdit.putLong(str, j10);
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public int qdl(String str, int i10) {
        try {
            SharedPreferences sharedPreferencesUd = ud();
            if (sharedPreferencesUd != null && sharedPreferencesUd.contains(str)) {
                return sharedPreferencesUd.getInt(str, i10);
            }
            return i10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.lnr + th2.getMessage());
            return i10;
        }
    }

    public String qdl(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesUd = ud();
            if (sharedPreferencesUd != null && sharedPreferencesUd.contains(str)) {
                return sharedPreferencesUd.getString(str, str2);
            }
            return str2;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.lnr + th2.getMessage());
            return str2;
        }
    }

    public boolean qdl(String str, boolean z10) {
        try {
            SharedPreferences sharedPreferencesUd = ud();
            if (sharedPreferencesUd != null && sharedPreferencesUd.contains(str)) {
                return sharedPreferencesUd.getBoolean(str, z10);
            }
            return z10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.lnr + th2.getMessage());
            return z10;
        }
    }

    public void qdl() {
        SharedPreferences sharedPreferencesUd = ud();
        if (sharedPreferencesUd != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesUd.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
