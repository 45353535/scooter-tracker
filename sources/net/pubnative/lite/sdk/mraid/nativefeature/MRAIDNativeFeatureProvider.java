package net.pubnative.lite.sdk.mraid.nativefeature;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.taurusx.tax.o.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.pubnative.lite.sdk.mraid.internal.MRAIDLog;
import net.pubnative.lite.sdk.mraid.internal.MRAIDNativeFeatureManager;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class MRAIDNativeFeatureProvider {
    public static final String ACTION_HANDLE_CUSTOM_EVENT = "android.provider.calendar.action.HANDLE_CUSTOM_EVENT";
    public static final String AUTHORITY = "com.android.calendar";
    public static final String DESCRIPTION = "description";
    public static final String DISPLAY_COLOR = "displayColor";
    public static final String EVENT_COLOR = "eventColor";
    public static final String EVENT_COLOR_KEY = "eventColor_index";
    public static final String EVENT_LOCATION = "eventLocation";
    public static final String EXTRA_CUSTOM_APP_URI = "customAppUri";
    public static final String EXTRA_EVENT_ALL_DAY = "allDay";
    public static final String EXTRA_EVENT_BEGIN_TIME = "beginTime";
    public static final String EXTRA_EVENT_END_TIME = "endTime";
    public static final String STATUS = "eventStatus";
    private static final String TAG = "MRAIDNativeFeatureProvider";
    public static final String TITLE = "title";
    private final Context context;
    private final MRAIDNativeFeatureManager nativeFeatureManager;

    public MRAIDNativeFeatureProvider(Context context, MRAIDNativeFeatureManager mRAIDNativeFeatureManager) {
        this.context = context;
        this.nativeFeatureManager = mRAIDNativeFeatureManager;
    }

    public static /* synthetic */ void b(MRAIDNativeFeatureProvider mRAIDNativeFeatureProvider, String str) {
        mRAIDNativeFeatureProvider.getClass();
        try {
            mRAIDNativeFeatureProvider.storePictureInGallery(str);
        } catch (Exception e10) {
            MRAIDLog.e(TAG, e10.getLocalizedMessage());
        }
    }

    private void copyStream(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr, 0, 1024);
                if (i10 == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i10);
                }
            }
        } catch (Exception e10) {
            MRAIDLog.i(TAG, "Error saving picture: " + e10.getLocalizedMessage());
        }
    }

    private File getAlbumDir() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            MRAIDLog.i(TAG, "External storage is not mounted READ/WRITE.");
            return null;
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Image");
        if (file.mkdirs() || file.exists()) {
            return file;
        }
        MRAIDLog.i(TAG, "Failed to create camera directory");
        return null;
    }

    @SuppressLint({"SimpleDateFormat"})
    private void storePictureInGallery(String str) {
        String str2 = getAlbumDir() + "/img" + new SimpleDateFormat("yyyy-MM-dd-HHmmss").format(new Date()) + ".png";
        String str3 = TAG;
        MRAIDLog.i(str3, "Saving image into: " + str2);
        File file = new File(str2);
        try {
            copyStream(new URL(str).openStream(), new FileOutputStream(file));
            MediaScannerConnection.scanFile(this.context, new String[]{file.getAbsolutePath()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: ch.b
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str4, Uri uri) {
                    MRAIDLog.d("File saves successfully to " + str4);
                }
            });
            MRAIDLog.i(str3, "Saved image successfully");
        } catch (MalformedURLException e10) {
            MRAIDLog.e(TAG, "Not able to save image due to invalid URL: " + e10.getLocalizedMessage());
        } catch (IOException e11) {
            MRAIDLog.e(TAG, "Unable to save image: " + e11.getLocalizedMessage());
        }
    }

    public final void callTel(String str) {
        if (this.nativeFeatureManager.isTelSupported()) {
            this.context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
        }
    }

    public void createCalendarEvent(String str) {
        long j10;
        if (this.nativeFeatureManager.isCalendarSupported()) {
            try {
                JSONObject jSONObject = new JSONObject(str.replace("\\", "").replace("\"{", "{").replace("}\"", "}"));
                String strOptString = jSONObject.optString("description", "Untitled");
                String strOptString2 = jSONObject.optString("location", "unknown");
                String strOptString3 = jSONObject.optString("summary");
                String[] strArr = {"yyyy-MM-dd'T'HH:mmZ", "yyyy-MM-dd'T'HH:mm:ssZ"};
                int i10 = 2;
                String[] strArr2 = new String[2];
                strArr2[0] = jSONObject.getString("start");
                strArr2[1] = jSONObject.optString("end");
                int i11 = 0;
                long time = 0;
                long time2 = 0;
                long j11 = 0;
                while (i11 < i10) {
                    if (TextUtils.isEmpty(strArr2[i11])) {
                        j10 = j11;
                    } else {
                        j10 = j11;
                        strArr2[i11] = strArr2[i11].replaceAll("([+-]\\d\\d):(\\d\\d)$", "$1$2");
                        int i12 = 0;
                        while (true) {
                            if (i12 < i10) {
                                try {
                                    Date date = new SimpleDateFormat(strArr[i12], Locale.US).parse(strArr2[i11]);
                                    if (date != null) {
                                        if (i11 == 0) {
                                            time2 = date.getTime();
                                        } else {
                                            time = date.getTime();
                                        }
                                    }
                                } catch (ParseException unused) {
                                    i12++;
                                    i10 = 2;
                                }
                            }
                        }
                    }
                    i11++;
                    j11 = j10;
                    i10 = 2;
                }
                long j12 = j11;
                Intent type = new Intent("android.intent.action.INSERT").setType(i0.f66467z);
                type.putExtra("title", strOptString);
                type.putExtra("description", strOptString3);
                type.putExtra(EVENT_LOCATION, strOptString2);
                if (time2 > j12) {
                    type.putExtra(EXTRA_EVENT_BEGIN_TIME, time2);
                }
                if (time > j12) {
                    type.putExtra(EXTRA_EVENT_END_TIME, time);
                }
                this.context.startActivity(type);
            } catch (JSONException e10) {
                MRAIDLog.e(TAG, "Error parsing JSON: " + e10.getLocalizedMessage());
            }
        }
    }

    public void openBrowser(String str) {
        if (str.startsWith("market:")) {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } else if (str.startsWith("http:") || str.startsWith("https:")) {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    public void playVideo(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(str), "video/*");
        this.context.startActivity(intent);
    }

    public void sendSms(String str) {
        if (this.nativeFeatureManager.isSmsSupported()) {
            this.context.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(str)));
        }
    }

    public void storePicture(final String str) {
        if (this.nativeFeatureManager.isStorePictureSupported()) {
            new Thread(new Runnable() { // from class: ch.a
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDNativeFeatureProvider.b(this.f6848b, str);
                }
            }).start();
        }
    }
}
