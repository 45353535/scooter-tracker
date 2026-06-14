package com.adjust.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class PreinstallUtil {
    private static final long ALL_LOCATION_BITMASK = 255;
    private static final long CONTENT_PROVIDER_BITMASK = 16;
    private static final long CONTENT_PROVIDER_INTENT_ACTION_BITMASK = 32;
    private static final long CONTENT_PROVIDER_NO_PERMISSION_BITMASK = 128;
    private static final long FILE_SYSTEM_BITMASK = 64;
    private static final long SYSTEM_PROPERTY_BITMASK = 1;
    private static final long SYSTEM_PROPERTY_PATH_BITMASK = 4;
    private static final long SYSTEM_PROPERTY_PATH_REFLECTION_BITMASK = 8;
    private static final long SYSTEM_PROPERTY_REFLECTION_BITMASK = 2;

    public static String getPayloadFromContentProviderDefault(Context context, String str, ILogger iLogger) {
        if (Util.resolveContentProvider(context, Constants.ADJUST_PREINSTALL_CONTENT_URI_AUTHORITY)) {
            return readContentProvider(context, Util.formatString("content://%s/%s", Constants.ADJUST_PREINSTALL_CONTENT_URI_AUTHORITY, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH), str, iLogger);
        }
        return null;
    }

    public static String getPayloadFromFileSystem(String str, String str2, ILogger iLogger) {
        String fileContent = readFileContent(Constants.ADJUST_PREINSTALL_FILE_SYSTEM_PATH, iLogger);
        if (fileContent == null || fileContent.isEmpty()) {
            if (str2 != null && !str2.isEmpty()) {
                fileContent = readFileContent(str2, iLogger);
            }
            if (fileContent == null || fileContent.isEmpty()) {
                return null;
            }
        }
        return readPayloadFromJsonString(fileContent, str, iLogger);
    }

    public static String getPayloadFromSystemProperty(String str, ILogger iLogger) {
        return readSystemProperty(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PREFIX + str, iLogger);
    }

    public static String getPayloadFromSystemPropertyFilePath(String str, ILogger iLogger) {
        String fileContent;
        String systemProperty = readSystemProperty(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PATH, iLogger);
        if (systemProperty == null || systemProperty.isEmpty() || (fileContent = readFileContent(systemProperty, iLogger)) == null || fileContent.isEmpty()) {
            return null;
        }
        return readPayloadFromJsonString(fileContent, str, iLogger);
    }

    public static String getPayloadFromSystemPropertyFilePathReflection(String str, ILogger iLogger) {
        String fileContent;
        String systemPropertyReflection = readSystemPropertyReflection(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PATH, iLogger);
        if (systemPropertyReflection == null || systemPropertyReflection.isEmpty() || (fileContent = readFileContent(systemPropertyReflection, iLogger)) == null || fileContent.isEmpty()) {
            return null;
        }
        return readPayloadFromJsonString(fileContent, str, iLogger);
    }

    public static String getPayloadFromSystemPropertyReflection(String str, ILogger iLogger) {
        return readSystemPropertyReflection(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PREFIX + str, iLogger);
    }

    public static List<String> getPayloadsFromContentProviderIntentAction(Context context, String str, ILogger iLogger) {
        return readContentProviderIntentAction(context, str, "android.permission.INSTALL_PACKAGES", iLogger);
    }

    public static List<String> getPayloadsFromContentProviderNoPermission(Context context, String str, ILogger iLogger) {
        return readContentProviderIntentAction(context, str, null, iLogger);
    }

    public static boolean hasAllLocationsBeenRead(long j10) {
        return (j10 & 255) == 255;
    }

    public static boolean hasNotBeenRead(String str, long j10) {
        str.getClass();
        switch (str) {
            case "content_provider_intent_action":
                return (j10 & 32) != 32;
            case "system_properties_path_reflection":
                return (j10 & 8) != 8;
            case "content_provider":
                return (j10 & 16) != 16;
            case "system_properties_path":
                return (j10 & 4) != 4;
            case "system_properties_reflection":
                return (j10 & 2) != 2;
            case "system_properties":
                return (j10 & 1) != 1;
            case "file_system":
                return (j10 & 64) != 64;
            case "content_provider_no_permission":
                return (j10 & 128) != 128;
            default:
                return false;
        }
    }

    public static long markAsRead(String str, long j10) {
        long j11;
        str.getClass();
        switch (str) {
            case "content_provider_intent_action":
                j11 = 32;
                break;
            case "system_properties_path_reflection":
                j11 = 8;
                break;
            case "content_provider":
                j11 = 16;
                break;
            case "system_properties_path":
                j11 = 4;
                break;
            case "system_properties_reflection":
                j11 = 2;
                break;
            case "system_properties":
                j11 = 1;
                break;
            case "file_system":
                j11 = 64;
                break;
            case "content_provider_no_permission":
                j11 = 128;
                break;
            default:
                return j10;
        }
        return j10 | j11;
    }

    private static String readContentProvider(Context context, String str, String str2, ILogger iLogger) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse(str), new String[]{"encrypted_data"}, "package_name=?", new String[]{str2}, null);
            if (cursorQuery == null) {
                iLogger.debug("Read content provider cursor null content uri [%s]", str);
                return null;
            }
            if (cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(0);
                cursorQuery.close();
                return string;
            }
            iLogger.debug("Read content provider cursor empty content uri [%s]", str);
            cursorQuery.close();
            return null;
        } catch (Exception e10) {
            iLogger.error("Exception read content provider uri [%s] error [%s]", str, e10.getMessage());
            return null;
        }
    }

    private static List<String> readContentProviderIntentAction(Context context, String str, String str2, ILogger iLogger) {
        String contentProvider;
        List<ResolveInfo> listQueryIntentContentProviders = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentContentProviders(new Intent(Constants.ADJUST_PREINSTALL_CONTENT_PROVIDER_INTENT_ACTION), PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryIntentContentProviders(new Intent(Constants.ADJUST_PREINSTALL_CONTENT_PROVIDER_INTENT_ACTION), 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentContentProviders) {
            if (str2 == null || context.getPackageManager().checkPermission(str2, resolveInfo.providerInfo.packageName) == 0) {
                String str3 = resolveInfo.providerInfo.authority;
                if (str3 != null && !str3.isEmpty() && (contentProvider = readContentProvider(context, Util.formatString("content://%s/%s", str3, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH), str, iLogger)) != null && !contentProvider.isEmpty()) {
                    arrayList.add(contentProvider);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static String readFileContent(String str, ILogger iLogger) {
        File file = new File(str);
        if (file.exists() && file.isFile() && file.canRead()) {
            try {
                int length = (int) file.length();
                if (length <= 0) {
                    iLogger.debug("Read file content empty file", new Object[0]);
                    return null;
                }
                byte[] bArr = new byte[length];
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                        return new String(bArr);
                    } finally {
                        fileInputStream.close();
                    }
                } catch (Exception e10) {
                    iLogger.error("Exception read file input stream error [%s]", e10.getMessage());
                    return null;
                }
            } catch (Exception e11) {
                iLogger.error("Exception read file content error [%s]", e11.getMessage());
            }
        }
        return null;
    }

    private static String readPayloadFromJsonString(String str, String str2, ILogger iLogger) {
        try {
            return new JSONObject(str.trim()).optString(str2);
        } catch (Exception e10) {
            iLogger.error("Exception read payload from json string error [%s]", e10.getMessage());
            return null;
        }
    }

    private static String readSystemProperty(String str, ILogger iLogger) {
        try {
            return System.getProperty(str);
        } catch (Exception e10) {
            iLogger.error("Exception read system property key [%s] error [%s]", str, e10.getMessage());
            return null;
        }
    }

    private static String readSystemPropertyReflection(String str, ILogger iLogger) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            iLogger.error("Exception read system property using reflection key [%s] error [%s]", str, e10.getMessage());
            return null;
        }
    }
}
