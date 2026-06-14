package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@AnyThread
public class ConfigStorageClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f33112c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33114b;

    private ConfigStorageClient(Context context, String str) {
        this.f33113a = context;
        this.f33114b = str;
    }

    @VisibleForTesting
    public static synchronized void clearInstancesForTest() {
        f33112c.clear();
    }

    public static synchronized ConfigStorageClient getInstance(Context context, String str) {
        Map map;
        try {
            map = f33112c;
            if (!map.containsKey(str)) {
                map.put(str, new ConfigStorageClient(context, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (ConfigStorageClient) map.get(str);
    }

    String a() {
        return this.f33114b;
    }

    public synchronized Void clear() {
        this.f33113a.deleteFile(this.f33114b);
        return null;
    }

    public synchronized ConfigContainer read() throws IOException {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        try {
            fileInputStreamOpenFileInput = this.f33113a.openFileInput(this.f33114b);
            try {
                int iAvailable = fileInputStreamOpenFileInput.available();
                byte[] bArr = new byte[iAvailable];
                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                ConfigContainer configContainerB = ConfigContainer.b(new JSONObject(new String(bArr, "UTF-8")));
                fileInputStreamOpenFileInput.close();
                return configContainerB;
            } catch (FileNotFoundException | JSONException unused) {
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                throw th2;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th4) {
            fileInputStreamOpenFileInput = null;
            th2 = th4;
        }
    }

    public synchronized Void write(ConfigContainer configContainer) throws IOException {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f33113a.openFileOutput(this.f33114b, 0);
        try {
            fileOutputStreamOpenFileOutput.write(configContainer.toString().getBytes("UTF-8"));
        } finally {
            fileOutputStreamOpenFileOutput.close();
        }
        return null;
    }
}
