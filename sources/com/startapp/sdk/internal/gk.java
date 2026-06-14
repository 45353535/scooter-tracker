package com.startapp.sdk.internal;

import android.content.Context;
import android.content.pm.ActivityInfo;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.video.VideoUtil$VideoEligibility;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gk {
    public static void a(Context context, kj kjVar) {
        if (context == null || kjVar == null) {
            return;
        }
        for (String str : kjVar.f64834a) {
            if (str != null && str.length() > 0) {
                ji.a(context, str, null);
            }
        }
    }

    public static VideoUtil$VideoEligibility a(Context context) {
        VideoUtil$VideoEligibility videoUtil$VideoEligibility = VideoUtil$VideoEligibility.ELIGIBLE;
        if (AdsCommonMetaData.k().F().p() >= 0 && ((vf) com.startapp.sdk.components.a.a(context).G.a()).getInt("videoErrorsCount", 0) >= AdsCommonMetaData.k().F().p()) {
            videoUtil$VideoEligibility = VideoUtil$VideoEligibility.INELIGIBLE_ERRORS_THRESHOLD_REACHED;
        }
        WeakHashMap weakHashMap = vi.f65408a;
        try {
            for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                if (activityInfo.name.equals(OverlayActivity.class.getName())) {
                    break;
                }
            }
        } catch (Exception unused) {
        }
        videoUtil$VideoEligibility = VideoUtil$VideoEligibility.INELIGIBLE_MISSING_ACTIVITY;
        File filesDir = context.getFilesDir();
        WeakHashMap weakHashMap2 = vi.f65408a;
        long jA = q0.a(filesDir);
        return (jA >= 0 && jA / 1024 > AdsCommonMetaData.k().F().g() * 1024) ? videoUtil$VideoEligibility : VideoUtil$VideoEligibility.INELIGIBLE_NO_STORAGE;
    }

    public static String a(Context context, URL url, String str) throws Throwable {
        DataInputStream dataInputStream;
        FileOutputStream fileOutputStreamOpenFileOutput;
        InputStream inputStreamOpenStream;
        String str2;
        File file;
        byte[] bArr;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        str = null;
        String str3 = null;
        try {
            str2 = context.getFilesDir() + "/" + str;
            file = new File(str2);
        } catch (Exception unused) {
            inputStreamOpenStream = null;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = null;
            fileOutputStreamOpenFileOutput = null;
            inputStreamOpenStream = inputStream;
            try {
                inputStreamOpenStream.close();
                dataInputStream.close();
                fileOutputStreamOpenFileOutput.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
        try {
            try {
                if (!file.exists()) {
                    inputStreamOpenStream = url.openStream();
                    try {
                        dataInputStream = new DataInputStream(inputStreamOpenStream);
                        try {
                            bArr = new byte[4096];
                            fileOutputStreamOpenFileOutput = context.openFileOutput(str + ".temp", 0);
                        } catch (Exception unused3) {
                            fileOutputStreamOpenFileOutput = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Exception unused4) {
                        dataInputStream = null;
                        fileOutputStreamOpenFileOutput = null;
                    } catch (Throwable th4) {
                        th = th4;
                        dataInputStream = null;
                        fileOutputStreamOpenFileOutput = null;
                        inputStream = inputStreamOpenStream;
                        inputStreamOpenStream = inputStream;
                        inputStreamOpenStream.close();
                        dataInputStream.close();
                        fileOutputStreamOpenFileOutput.close();
                        throw th;
                    }
                    try {
                        try {
                            while (true) {
                                try {
                                    try {
                                        int i10 = dataInputStream.read(bArr);
                                        if (i10 <= 0) {
                                            break;
                                        }
                                        fileOutputStreamOpenFileOutput.write(bArr, 0, i10);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fileOutputStream = fileOutputStreamOpenFileOutput;
                                        fileOutputStreamOpenFileOutput = fileOutputStream;
                                        inputStreamOpenStream.close();
                                        dataInputStream.close();
                                        fileOutputStreamOpenFileOutput.close();
                                        throw th;
                                    }
                                } catch (Exception unused5) {
                                    new File(context.getFilesDir() + "/" + (str + ".temp")).delete();
                                    inputStreamOpenStream.close();
                                    dataInputStream.close();
                                }
                                fileOutputStreamOpenFileOutput.close();
                                return str3;
                            }
                            inputStreamOpenStream.close();
                            dataInputStream.close();
                            str3 = str2;
                            fileOutputStreamOpenFileOutput.close();
                            return str3;
                        } catch (Exception unused6) {
                            return str2;
                        }
                        new File(context.getFilesDir() + "/" + (str + ".temp")).renameTo(file);
                    } catch (Throwable th6) {
                        th = th6;
                        inputStreamOpenStream.close();
                        dataInputStream.close();
                        fileOutputStreamOpenFileOutput.close();
                        throw th;
                    }
                } else {
                    try {
                        throw null;
                    } catch (Exception unused7) {
                        return str2;
                    }
                }
                inputStreamOpenStream.close();
                dataInputStream.close();
                fileOutputStreamOpenFileOutput.close();
                return str3;
            } catch (Exception unused8) {
                return str3;
            }
            new File(context.getFilesDir() + "/" + (str + ".temp")).delete();
        } catch (Throwable th7) {
            th = th7;
            inputStream = inputStreamOpenStream;
            inputStreamOpenStream = inputStream;
            inputStreamOpenStream.close();
            dataInputStream.close();
            fileOutputStreamOpenFileOutput.close();
            throw th;
        }
        dataInputStream = null;
        fileOutputStreamOpenFileOutput = null;
    }
}
