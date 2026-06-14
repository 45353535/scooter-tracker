package com.pubmatic.sdk.webrendering.mraid;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBMRAIDUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f63303a = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ", "yyyy-MM-dd'T'HH:mmZ", "yyyy-MM-dd'T'HH:mmXXX"};

    static boolean a(Context context, Bitmap bitmap, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        Uri uriFromFile;
        OutputStream outputStreamOpenOutputStream = null;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("title", str);
                    contentValues.put("_display_name", str);
                    contentValues.put("mime_type", "image/jpeg");
                    contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                    ContentResolver contentResolver = context.getContentResolver();
                    uriFromFile = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (uriFromFile != null) {
                        outputStreamOpenOutputStream = contentResolver.openOutputStream(uriFromFile);
                    }
                } else {
                    File file = new File(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)), str);
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        uriFromFile = Uri.fromFile(file);
                        outputStreamOpenOutputStream = fileOutputStream;
                    } catch (Exception e10) {
                        e = e10;
                        outputStreamOpenOutputStream = fileOutputStream;
                        POBLog.debug("POBMRAIDUtil", "Not able to store image : " + e.getLocalizedMessage(), new Object[0]);
                        if (outputStreamOpenOutputStream != null) {
                            try {
                                outputStreamOpenOutputStream.flush();
                                outputStreamOpenOutputStream.close();
                            } catch (IOException unused) {
                                POBLog.debug("POBMRAIDUtil", "Unable to close the outputStream.", new Object[0]);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                                POBLog.debug("POBMRAIDUtil", "Unable to close the outputStream.", new Object[0]);
                            }
                        }
                        throw th;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
            if (outputStreamOpenOutputStream == null) {
                POBLog.debug("POBMRAIDUtil", "Not able to store image.", new Object[0]);
                if (outputStreamOpenOutputStream != null) {
                    try {
                        outputStreamOpenOutputStream.flush();
                        outputStreamOpenOutputStream.close();
                    } catch (IOException unused3) {
                        POBLog.debug("POBMRAIDUtil", "Unable to close the outputStream.", new Object[0]);
                    }
                }
                return false;
            }
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.flush();
            outputStreamOpenOutputStream.close();
            POBLog.debug("POBMRAIDUtil", "Image stored at :" + uriFromFile, new Object[0]);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(uriFromFile);
            context.sendBroadcast(intent);
            try {
                outputStreamOpenOutputStream.flush();
                outputStreamOpenOutputStream.close();
                return true;
            } catch (IOException unused4) {
                POBLog.debug("POBMRAIDUtil", "Unable to close the outputStream.", new Object[0]);
                return true;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5 A[Catch: JSONException -> 0x00ea, TryCatch #0 {JSONException -> 0x00ea, blocks: (B:3:0x000f, B:5:0x0015, B:7:0x0020, B:9:0x002a, B:30:0x0069, B:32:0x0070, B:33:0x0079, B:35:0x007f, B:37:0x0089, B:38:0x0095, B:39:0x009a, B:40:0x009b, B:41:0x00a0, B:42:0x00a1, B:44:0x00a8, B:45:0x00b1, B:47:0x00b7, B:49:0x00c1, B:50:0x00cd, B:51:0x00d4, B:52:0x00d5, B:54:0x00dc, B:16:0x0040, B:19:0x004a, B:22:0x0054), top: B:59:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String b(org.json.JSONObject r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubmatic.sdk.webrendering.mraid.POBMRAIDUtil.b(org.json.JSONObject):java.lang.String");
    }

    @NonNull
    protected static JSONObject getHeightWidthJson(int i10, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", i10);
            jSONObject.put("height", i11);
            return jSONObject;
        } catch (JSONException unused) {
            POBLog.error("POBMRAIDUtil", "JSON Exception, Not able to generate JSON for given width :" + i10 + " and height " + i11 + " !", new Object[0]);
            return jSONObject;
        }
    }

    @NonNull
    protected static String getMRAIDEnvironment(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", "3.0");
            jSONObject.put("sdk", "PubMatic_OpenWrap_SDK");
            jSONObject.put("sdkVersion", "4.10.0");
            if (str != null) {
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, str);
            }
            if (str2 != null) {
                jSONObject.put(EidRequestBuilder.REQUEST_FIELD_IFA, str2);
            }
            if (bool != null) {
                jSONObject.put("limitAdTracking", bool);
            }
            if (bool2 != null) {
                jSONObject.put("coppa", bool2);
            }
        } catch (JSONException unused) {
            POBLog.error("POBMRAIDUtil", "JSON Exception, not able to generate MRAID environment.", new Object[0]);
        }
        return "<script> window.MRAID_ENV = " + jSONObject + "</script>";
    }

    @NonNull
    protected static JSONObject getRectJson(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", i12);
            jSONObject.put("height", i13);
            jSONObject.put("x", i10);
            jSONObject.put("y", i11);
            return jSONObject;
        } catch (JSONException unused) {
            POBLog.error("POBMRAIDUtil", "JSON Exception, Not able to generate JSON for x:" + i10 + " ,y:" + i11 + " ,width:" + i12 + " ,height:" + i13 + " !", new Object[0]);
            return jSONObject;
        }
    }

    @NonNull
    protected static POBViewRect getResizeValues(int i10, int i11, int i12, int i13, boolean z10, @NonNull POBViewRect pOBViewRect, int i14, int i15) {
        int i16;
        int screenWidth = POBUtils.getScreenWidth();
        int screenHeight = POBUtils.getScreenHeight();
        int i17 = i10 + pOBViewRect.getxPosition();
        int i18 = i11 + pOBViewRect.getyPosition();
        int i19 = 0;
        if (i12 >= screenWidth && i13 >= screenHeight) {
            return new POBViewRect(false, "Size must be smaller than the max size.");
        }
        if (i12 < 50 || i13 < 50) {
            return new POBViewRect(false, "Size must be greater than the 50x50 size.");
        }
        if (z10) {
            int i20 = i17 + i12;
            if (i20 < i14 || i20 > screenWidth || i18 < 0 || i18 > screenHeight - i15) {
                return new POBViewRect(false, "Not able to show Close Button! No Space for close Button.");
            }
        } else {
            if (i12 > screenWidth) {
                i12 = screenWidth;
            }
            if (i13 > screenHeight) {
                i13 = screenHeight;
            }
            if (i17 < 0) {
                i16 = 0;
            } else {
                int i21 = i17 + i12;
                if (i21 > screenWidth) {
                    i16 = (int) (((double) i17) - ((double) (i21 - screenWidth)));
                } else {
                    i16 = i17;
                }
            }
            if (i18 >= 0) {
                int i22 = i18 + i13;
                if (i22 > screenHeight) {
                    i19 = (int) (((double) i18) - ((double) (i22 - screenHeight)));
                } else {
                    i19 = i18;
                }
            }
            i17 = (int) (((double) i17) - ((double) (i17 - i16)));
            i18 = (int) (((double) i18) - ((double) (i18 - i19)));
        }
        return new POBViewRect(POBUtils.convertDpToPixel(i17), POBUtils.convertDpToPixel(i18), POBUtils.convertDpToPixel(i13), POBUtils.convertDpToPixel(i12), true, "Ok");
    }

    private static String b(JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            POBLog.error("POBMRAIDUtil", "Must have at least 1 day of the week if specifying repeating weekly.", new Object[0]);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean[] zArr = new boolean[7];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            int iOptInt = jSONArray.optInt(i10);
            if (iOptInt == 7) {
                iOptInt = 0;
            }
            if (!zArr[iOptInt]) {
                sb2.append(b(iOptInt));
                sb2.append(StringUtils.COMMA);
                zArr[iOptInt] = true;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    static Map a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject.has("description")) {
            map.put("title", jSONObject.getString("description"));
            if (jSONObject.has("start") && jSONObject.getString("start") != null) {
                Date dateA = a(jSONObject.getString("start"));
                if (dateA != null) {
                    map.put(MRAIDNativeFeatureProvider.EXTRA_EVENT_BEGIN_TIME, Long.valueOf(dateA.getTime()));
                    if (jSONObject.has("end") && jSONObject.getString("end") != null) {
                        Date dateA2 = a(jSONObject.getString("end"));
                        if (dateA2 != null) {
                            map.put(MRAIDNativeFeatureProvider.EXTRA_EVENT_END_TIME, Long.valueOf(dateA2.getTime()));
                        } else {
                            POBLog.error("POBMRAIDUtil", "Invalid end format. end must be(yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx)", new Object[0]);
                        }
                        if (jSONObject.has("location")) {
                            map.put(MRAIDNativeFeatureProvider.EVENT_LOCATION, jSONObject.getString("location"));
                        }
                        if (jSONObject.has("summary")) {
                            map.put("description", jSONObject.getString("summary"));
                        }
                        if (jSONObject.has("transparency")) {
                            map.put("availability", Integer.valueOf(jSONObject.getString("transparency").equals(C4240b4.i.T) ? 1 : 0));
                        }
                        if (jSONObject.has("recurrence")) {
                            map.put("rrule", b(jSONObject.getJSONObject("recurrence")));
                        }
                        return map;
                    }
                    throw new IllegalArgumentException("Invalid end.end can't be null.");
                }
                POBLog.error("POBMRAIDUtil", "Invalid start format. start must be(yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx)", new Object[0]);
                throw new IllegalArgumentException("Invalid start format. start must be(yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx)");
            }
            throw new IllegalArgumentException("Invalid start. start can't be null.");
        }
        throw new IllegalArgumentException("Invalid description. Description can't be null.");
    }

    private static String b(int i10) {
        switch (i10) {
            case 0:
                return "SU";
            case 1:
                return "MO";
            case 2:
                return "TU";
            case 3:
                return "WE";
            case 4:
                return "TH";
            case 5:
                return "FR";
            case 6:
                return "SA";
            default:
                POBLog.error("POBMRAIDUtil", "invalid day of week %s", Integer.valueOf(i10));
                return null;
        }
    }

    private static Date a(String str) {
        Date date = null;
        for (String str2 : f63303a) {
            try {
                date = new SimpleDateFormat(str2, Locale.US).parse(str);
            } catch (ParseException e10) {
                POBLog.error("POBMRAIDUtil", "Not able to parse date. %s", e10.getLocalizedMessage());
            }
            if (date != null) {
                break;
            }
        }
        return date;
    }

    private static String a(JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            POBLog.error("POBMRAIDUtil", "must have at least 1 day of the month if specifying repeating weekly", new Object[0]);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean[] zArr = new boolean[63];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            int iOptInt = jSONArray.optInt(i10);
            int i11 = iOptInt + 31;
            if (!zArr[i11]) {
                sb2.append(a(iOptInt));
                sb2.append(StringUtils.COMMA);
                zArr[i11] = true;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    private static String a(int i10) {
        if (i10 != 0 && i10 >= -31 && i10 <= 31) {
            return "" + i10;
        }
        POBLog.error("POBMRAIDUtil", "invalid day of month " + i10, new Object[0]);
        return null;
    }

    static boolean a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return false;
            }
            return telephonyManager.getSimState() != 1;
        } catch (Exception e10) {
            POBLog.warn("POBMRAIDUtil", "Not able to get TelephonyManager. Error: %s", e10.getMessage());
            return false;
        }
    }
}
