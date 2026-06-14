package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class CachedSettingsIo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f32697a;

    public CachedSettingsIo(FileStore fileStore) {
        this.f32697a = fileStore.getCommonFile("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f32697a;
    }

    public JSONObject readCachedSettings() throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Logger.getLogger().d("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new FileInputStream(fileA);
                    try {
                        jSONObject = new JSONObject(CommonUtils.streamToString(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Logger.getLogger().e("Failed to fetch cached settings", e);
                        CommonUtils.closeOrLog(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    Logger.getLogger().v("Settings file does not exist.");
                    jSONObject = null;
                }
                CommonUtils.closeOrLog(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th3) {
                th2 = th3;
                CommonUtils.closeOrLog(null, "Error while closing settings cache file.");
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            CommonUtils.closeOrLog(null, "Error while closing settings cache file.");
            throw th2;
        }
    }

    public void writeCachedSettings(long j10, JSONObject jSONObject) throws Throwable {
        Logger.getLogger().v("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j10);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    CommonUtils.closeOrLog(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    Logger.getLogger().e("Failed to cache settings", e);
                    CommonUtils.closeOrLog(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    CommonUtils.closeOrLog(fileWriter, "Failed to close settings writer.");
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
