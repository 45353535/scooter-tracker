package com.taurusx.tax.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.C4240b4;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.c.y;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.fid.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f66139c = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f66140o = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f66141w = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f66142y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66143z = "SHA256";

    public static String a(String str) {
        try {
            return w(new FileInputStream(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean c(com.taurusx.tax.w.c.y yVar) {
        y.w wVarC;
        y.w.z zVarZ;
        if (yVar == null || (wVarC = yVar.c()) == null || (zVarZ = wVarC.z()) == null) {
            return true;
        }
        return zVarZ.z() == 0 && zVarZ.w() == 0;
    }

    public static boolean o(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean s(String str) {
        try {
            Long.valueOf(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String w(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bArr, 0, bArr.length);
            for (byte b10 : messageDigest.digest()) {
                sb2.append(String.format("%02X", Byte.valueOf(b10)));
            }
            return sb2.toString().toLowerCase(Locale.US);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int y(com.taurusx.tax.w.c.y yVar) {
        y.w wVarC;
        y.w.z zVarZ;
        if (yVar == null || (wVarC = yVar.c()) == null || (zVarZ = wVarC.z()) == null) {
            return 0;
        }
        return zVarZ.y();
    }

    public static String z(int i10) {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 < i10) {
            int iNextInt = random.nextInt(10);
            String string = Integer.toString(iNextInt);
            if (sb2.length() != 0) {
                sb2.append(string);
            } else if (iNextInt > 0) {
                sb2.append(string);
            }
            i11++;
        }
        return sb2.toString();
    }

    public static String o() {
        try {
            String str = (String) Class.forName("com.tradplus.ads.taurusx.BuildConfig").getField("VERSION_NAME").get(null);
            LogUtil.d("taurusx", "getTradplusAdapterVersion: " + str);
            return str;
        } catch (Throwable th2) {
            LogUtil.d("taurusx", "getTradplusAdapterVersion exception " + th2.getMessage());
            return "";
        }
    }

    public static boolean y(String str) {
        try {
            Float.valueOf(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strH = com.taurusx.tax.w.o.w.H();
        if (strH.startsWith("^")) {
            return str != null && str.matches(strH);
        }
        return str.startsWith(strH);
    }

    public static String y() {
        try {
            Class<?> cls = Class.forName("com.bytedance.sdk.openadsdk.mediation.adapter.taurusx.TaurusXMediationAdapter");
            String str = (String) cls.getMethod("getAdapterVersion", null).invoke(cls.getConstructor(null).newInstance(null), null);
            LogUtil.d("taurusx", "getPangleAdapterVersion: " + str);
            return str;
        } catch (Throwable th2) {
            LogUtil.d("taurusx", "getPangleAdapterVersion exception " + th2.getMessage());
            return "";
        }
    }

    public static String w(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 > 0) {
                    sb2.append(new String(bArr, 0, i10));
                } else {
                    inputStream.close();
                    return sb2.toString();
                }
            }
        } catch (Exception e10) {
            LogUtil.e("taurusx", "error : " + e10);
            return null;
        }
    }

    public static float z(float f10, Context context) {
        return TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static String c() {
        try {
            String str = (String) Class.forName("com.thinkup.network.taurusx.BuildConfig").getField("SDK_VERSION_NAME").get(null);
            LogUtil.d("taurusx", "getToponAdapterVersion: " + str);
            return str;
        } catch (Throwable th2) {
            LogUtil.d("taurusx", "getToponAdapterVersion exception " + th2.getMessage());
            return "";
        }
    }

    public static String z(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        byte[] bArr = new byte[4096];
        int i10 = 0;
        while (i10 != -1) {
            sb2.append(new String(bArr, 0, i10));
            i10 = inputStream.read(bArr);
        }
        inputStream.close();
        return sb2.toString();
    }

    public static boolean w(Context context) {
        return ((AudioManager) context.getSystemService("audio")).getRingerMode() == 0;
    }

    public static int w(float f10, Context context) {
        return (int) (z(f10, context) + 0.5f);
    }

    public static void z(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream != null && outputStream != null) {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i10);
                }
            }
        } else {
            throw new IOException("Unable to copy from or to a null stream.");
        }
    }

    public static String w(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            return z(messageDigest.digest());
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return "";
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static void z(InputStream inputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        int i10 = 0;
        do {
            int i11 = inputStream.read(bArr, i10, length);
            if (i11 == -1) {
                return;
            }
            i10 += i11;
            length -= i11;
        } while (length > 0);
    }

    public static int w(com.taurusx.tax.w.c.y yVar) {
        y.w wVarC;
        y.w.z zVarZ;
        if (yVar == null || (wVarC = yVar.c()) == null || (zVarZ = wVarC.z()) == null) {
            return 0;
        }
        return zVarZ.w();
    }

    public static void z(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static String z(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static boolean w(String str, String str2) throws IOException {
        ZipInputStream zipInputStream;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                zipInputStream = new ZipInputStream(fileInputStream);
            } finally {
            }
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        File file2 = new File(file, nextEntry.getName());
                        String canonicalPath = file.getCanonicalPath();
                        if (!file2.getCanonicalPath().startsWith(canonicalPath + File.separator)) {
                            zipInputStream.close();
                            fileInputStream.close();
                            return false;
                        }
                        if (nextEntry.isDirectory()) {
                            file2.mkdirs();
                        } else {
                            File parentFile = file2.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i10 = zipInputStream.read(bArr);
                                    if (i10 <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                }
                                fileOutputStream.close();
                            } finally {
                            }
                        }
                        zipInputStream.closeEntry();
                    } else {
                        zipInputStream.close();
                        fileInputStream.close();
                        return true;
                    }
                } finally {
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static Bitmap z(Context context, Bitmap bitmap) {
        try {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCopy = config == config2 ? bitmap : bitmap.copy(config2, true);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCopy.getWidth() / 3, bitmap.getHeight() / 3, config2);
            RenderScript renderScriptCreate = RenderScript.create(context);
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCopy);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(25.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            new Canvas(bitmapCreateBitmap).drawColor(855638016);
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static ViewGroup.LayoutParams z(ViewGroup viewGroup, int i10, int i11, int i12) {
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
            z(layoutParams, i12);
            return layoutParams;
        }
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i11);
            z(layoutParams2, i12);
            return layoutParams2;
        }
        if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i10, i11);
            if (i12 == 1) {
                layoutParams3.gravity = 53;
                return layoutParams3;
            }
            if (i12 == 2) {
                layoutParams3.gravity = 51;
                return layoutParams3;
            }
            if (i12 == 3) {
                layoutParams3.gravity = 85;
                return layoutParams3;
            }
            if (i12 != 4) {
                return layoutParams3;
            }
            layoutParams3.gravity = 83;
            return layoutParams3;
        }
        return new ViewGroup.LayoutParams(i10, i11);
    }

    public static String w(Context context, int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i10, options);
        if (bitmapDecodeResource == null) {
            return "";
        }
        String str = options.outMimeType;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return "data:" + str + ";base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static String w() {
        try {
            Class<?> cls = Class.forName("com.ironsource.adapters.custom.taurusx.TaurusXCustomAdapter");
            String str = (String) cls.getMethod("getAdapterVersion", null).invoke(cls.getConstructor(null).newInstance(null), null);
            LogUtil.d("taurusx", "getIronSourceAdapterVersion: " + str);
            return str;
        } catch (Throwable th2) {
            LogUtil.d("taurusx", "getIronSourceAdapterVersion exception " + th2.getMessage());
            return "";
        }
    }

    public static void z(FrameLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 1) {
            layoutParams.gravity = 53;
            return;
        }
        if (i10 == 2) {
            layoutParams.gravity = 51;
        } else if (i10 == 3) {
            layoutParams.gravity = 85;
        } else {
            if (i10 != 4) {
                return;
            }
            layoutParams.gravity = 83;
        }
    }

    public static void z(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            return;
        }
        if (i10 == 2) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else {
            if (i10 != 4) {
                return;
            }
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public static int z(Context context, int i10) {
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int z(Context context, double d10) {
        return (int) ((d10 * ((double) context.getResources().getDisplayMetrics().density)) + 0.5d);
    }

    public static int z(com.taurusx.tax.w.c.y yVar) {
        y.w wVarC;
        y.w.z zVarZ;
        if (yVar == null || (wVarC = yVar.c()) == null || (zVarZ = wVarC.z()) == null) {
            return 0;
        }
        return zVarZ.z();
    }

    public static boolean z(View view, com.taurusx.tax.w.c.y yVar, int i10, int i11) {
        Drawable background;
        try {
            LogUtil.v("taurusx", "w = " + i10 + " h = " + i11);
            int iZ = z(yVar);
            if (iZ != 0) {
                Rect rect = new Rect();
                boolean z10 = view.getGlobalVisibleRect(rect) && (((rect.bottom - rect.top) * (rect.right - rect.left)) * 100 >= (i10 * i11) * iZ);
                LogUtil.v("taurusx", "totalViewVisible: " + z10);
                if (!z10) {
                    return true;
                }
                View view2 = view;
                while (view2.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    if (viewGroup.getVisibility() != 0) {
                        return true;
                    }
                    for (int iZ2 = z(view2, viewGroup) + 1; iZ2 < viewGroup.getChildCount(); iZ2++) {
                        Rect rect2 = new Rect();
                        view.getGlobalVisibleRect(rect2);
                        View childAt = viewGroup.getChildAt(iZ2);
                        if (childAt != null && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && (!(background instanceof ColorDrawable) || ((ColorDrawable) background).getAlpha() != 0)) {
                            Rect rect3 = new Rect();
                            if (!childAt.getGlobalVisibleRect(rect3)) {
                                LogUtil.v("taurusx", "otherViewRectResult is not exactly! Continue!!!");
                            } else if (Rect.intersects(rect2, rect3) && (Math.min(rect2.right, rect3.right) - Math.max(rect2.left, rect3.left)) * (Math.min(rect2.bottom, rect3.bottom) - Math.max(rect2.top, rect3.top)) * 100 >= view.getMeasuredHeight() * view.getMeasuredWidth() * iZ) {
                                return true;
                            }
                        }
                    }
                    view2 = viewGroup;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    public static int z(View view, ViewGroup viewGroup) {
        int i10 = 0;
        while (i10 < viewGroup.getChildCount() && viewGroup.getChildAt(i10) != view) {
            i10++;
        }
        return i10;
    }

    public static void z(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static boolean z(com.taurusx.tax.w.c.y yVar, com.taurusx.tax.w.s.z zVar) {
        if (yVar != null) {
            try {
                if (yVar.c() != null && yVar.c().w() != null && yVar.c().w().F() > 0) {
                    int iF = yVar.c().w().F();
                    return Math.abs(Integer.valueOf(zVar.o()).intValue() - Integer.valueOf(zVar.w()).intValue()) <= iF && Math.abs(Integer.valueOf(zVar.s()).intValue() - Integer.valueOf(zVar.y()).intValue()) <= iF;
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public static String z(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        return (lastPathSegment == null || !lastPathSegment.contains(".")) ? lastPathSegment : lastPathSegment.substring(0, lastPathSegment.lastIndexOf("."));
    }

    public static String z(String str, Context context) {
        String strEncode;
        JSONObject jSONObjectZ;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            jSONObjectZ = com.taurusx.tax.w.z.t().a().z(context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (jSONObjectZ != null) {
            strEncode = URLEncoder.encode(jSONObjectZ.toString(), "UTF-8");
        } else {
            strEncode = "";
        }
        if (TextUtils.isEmpty(strEncode)) {
            return str;
        }
        return ((str + (str.contains("?") ? C4240b4.j.f42670c : "?")) + "device_info=") + strEncode;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String z(java.lang.String r5, java.lang.String r6) throws java.lang.Throwable {
        /*
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r1 = 0
            r0.setDataSource(r5)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            r2 = 0
            r5 = 2
            android.graphics.Bitmap r5 = r0.getFrameAtTime(r2, r5)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            if (r5 == 0) goto L41
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            boolean r6 = r2.exists()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            if (r6 != 0) goto L29
            java.io.File r6 = r2.getParentFile()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            r6.mkdirs()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            goto L29
        L25:
            r5 = move-exception
            goto L61
        L27:
            r5 = move-exception
            goto L4f
        L29:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r4 = 100
            r5.compress(r3, r4, r6)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.lang.String r1 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r5 = r1
            r1 = r6
            goto L42
        L3c:
            r5 = move-exception
            r1 = r6
            goto L61
        L3f:
            r5 = move-exception
            goto L50
        L41:
            r5 = r1
        L42:
            r0.release()
            if (r1 == 0) goto L4e
            r1.close()     // Catch: java.io.IOException -> L4b
            return r5
        L4b:
            r6 = move-exception
            r1 = r5
            goto L5d
        L4e:
            return r5
        L4f:
            r6 = r1
        L50:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L3c
            r0.release()
            if (r6 == 0) goto L60
            r6.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r6 = move-exception
        L5d:
            r6.printStackTrace()
        L60:
            return r1
        L61:
            r0.release()
            if (r1 == 0) goto L6e
            r1.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L6a:
            r6 = move-exception
            r6.printStackTrace()
        L6e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.g.j0.z(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String z(Bitmap bitmap) {
        if (bitmap == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        return "data:" + options.outMimeType + ";base64," + Base64.encodeToString(byteArray, 2);
    }

    public static String z(Context context) {
        try {
            Class<?> cls = Class.forName("com.applovin.mediation.adapters.TaurusXMediationAdapter");
            String str = AppLovinSdk.VERSION;
            Object objInvoke = AppLovinSdk.class.getMethod(Constants.GET_INSTANCE, Context.class).invoke(null, context);
            Method declaredMethod = AppLovinSdk.class.getDeclaredMethod("getVersion", null);
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, null);
            LogUtil.d("taurusx", "appLovinSdkVersion: " + str2);
            String str3 = (String) cls.getMethod("getAdapterVersion", null).invoke(cls.getConstructor(AppLovinSdk.class).newInstance(objInvoke), null);
            LogUtil.d("taurusx", "getMaxAdapterVersion: " + str3);
            return str2 + StringUtils.COMMA + str3;
        } catch (Throwable th2) {
            LogUtil.d("taurusx", "getMaxAdapterVersion exception " + th2.getMessage());
            return "";
        }
    }

    public static String z() {
        try {
            String str = (String) Class.forName("com.google.ads.mediation.taurusx.BuildConfig").getField("VERSION_NAME").get(null);
            LogUtil.d("taurusx", "getAdmobAdapterVersion: " + str);
            return str;
        } catch (Throwable th2) {
            LogUtil.d("taurusx", "getAdmobAdapterVersion exception " + th2.getMessage());
            return "";
        }
    }
}
