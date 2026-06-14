package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
class MetaDataStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f32178b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileStore f32179a;

    public MetaDataStore(FileStore fileStore) {
        this.f32179a = fileStore;
    }

    private static Map a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, j(jSONObject, next));
        }
        return map;
    }

    private static List b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(RolloutAssignment.a(string));
            } catch (Exception e10) {
                Logger.getLogger().w("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    private String c(String str) {
        return j(new JSONObject(str), "userId");
    }

    private static String d(Map map) {
        return new JSONObject(map).toString();
    }

    private static String f(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER.encode(list.get(i10))));
            } catch (JSONException e10) {
                Logger.getLogger().w("Exception parsing rollout assignment!", e10);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    private static void g(File file) {
        if (file.exists() && file.delete()) {
            Logger.getLogger().i("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static void h(File file, String str) {
        if (file.exists() && file.delete()) {
            Logger.getLogger().i(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    private static String i(String str) {
        return new JSONObject(str) { // from class: com.google.firebase.crashlytics.internal.metadata.MetaDataStore.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f32180a;

            {
                this.f32180a = str;
                put("userId", str);
            }
        }.toString();
    }

    private static String j(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    Map e(String str, boolean z10) throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e10;
        File internalKeysFileForSession = z10 ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        if (!internalKeysFileForSession.exists() || internalKeysFileForSession.length() == 0) {
            h(internalKeysFileForSession, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(internalKeysFileForSession);
            } catch (Exception e11) {
                fileInputStream = null;
                e10 = e11;
            } catch (Throwable th3) {
                ?? r12 = 0;
                th2 = th3;
                CommonUtils.closeOrLog(r12, "Failed to close user metadata file.");
                throw th2;
            }
            try {
                Map mapA = a(CommonUtils.streamToString(fileInputStream));
                CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return mapA;
            } catch (Exception e12) {
                e10 = e12;
                Logger.getLogger().w("Error deserializing user metadata.", e10);
                g(internalKeysFileForSession);
                CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return Collections.EMPTY_MAP;
            }
        } catch (Throwable th4) {
            th2 = th4;
            CommonUtils.closeOrLog(r12, "Failed to close user metadata file.");
            throw th2;
        }
    }

    @NonNull
    public File getInternalKeysFileForSession(String str) {
        return this.f32179a.getSessionFile(str, UserMetadata.INTERNAL_KEYDATA_FILENAME);
    }

    @NonNull
    public File getKeysFileForSession(String str) {
        return this.f32179a.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
    }

    @NonNull
    public File getRolloutsStateForSession(String str) {
        return this.f32179a.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
    }

    @NonNull
    public File getUserDataFileForSession(String str) {
        return this.f32179a.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
    }

    public Map<String, String> readKeyData(String str) {
        return e(str, false);
    }

    public List<RolloutAssignment> readRolloutsState(String str) throws Throwable {
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (!rolloutsStateForSession.exists() || rolloutsStateForSession.length() == 0) {
            h(rolloutsStateForSession, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(rolloutsStateForSession);
                try {
                    List<RolloutAssignment> listB = b(CommonUtils.streamToString(fileInputStream2));
                    Logger.getLogger().d("Loaded rollouts state:\n" + listB + "\nfor session " + str);
                    CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
                    return listB;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    Logger.getLogger().w("Error deserializing rollouts state.", e);
                    g(rolloutsStateForSession);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.EMPTY_LIST;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Nullable
    public String readUserId(String str) throws Throwable {
        FileInputStream fileInputStream;
        File userDataFileForSession = getUserDataFileForSession(str);
        FileInputStream fileInputStream2 = null;
        if (!userDataFileForSession.exists() || userDataFileForSession.length() == 0) {
            Logger.getLogger().d("No userId set for session " + str);
            g(userDataFileForSession);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(userDataFileForSession);
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String strC = c(CommonUtils.streamToString(fileInputStream));
                Logger.getLogger().d("Loaded userId " + strC + " for session " + str);
                CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return strC;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            Logger.getLogger().w("Error deserializing user metadata.", e);
            g(userDataFileForSession);
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    public void writeKeyData(String str, Map<String, String> map) throws Throwable {
        writeKeyData(str, map, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    public void writeRolloutState(String str, List<RolloutAssignment> list) throws Throwable {
        Throwable th2;
        BufferedWriter bufferedWriter;
        Exception e10;
        String strF;
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            h(rolloutsStateForSession, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                strF = f(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(rolloutsStateForSession), f32178b));
            } catch (Exception e11) {
                bufferedWriter = null;
                e10 = e11;
            } catch (Throwable th3) {
                IsEmpty = 0;
                th2 = th3;
                CommonUtils.closeOrLog(IsEmpty, "Failed to close rollouts state file.");
                throw th2;
            }
            try {
                bufferedWriter.write(strF);
                bufferedWriter.flush();
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
            } catch (Exception e12) {
                e10 = e12;
                Logger.getLogger().w("Error serializing rollouts state.", e10);
                g(rolloutsStateForSession);
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
            }
        } catch (Throwable th4) {
            th2 = th4;
            CommonUtils.closeOrLog(IsEmpty, "Failed to close rollouts state file.");
            throw th2;
        }
    }

    public void writeUserData(String str, String str2) throws Throwable {
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strI = i(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), f32178b));
                try {
                    bufferedWriter2.write(strI);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().w("Error serializing user metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void writeKeyData(String str, Map<String, String> map, boolean z10) throws Throwable {
        File internalKeysFileForSession = z10 ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strD = d(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(internalKeysFileForSession), f32178b));
                try {
                    bufferedWriter2.write(strD);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().w("Error serializing key/value metadata.", e);
                    g(internalKeysFileForSession);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
