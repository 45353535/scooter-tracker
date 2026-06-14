package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.view.ScrollingView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjc;
import com.google.android.gms.internal.ads.zzcks;
import com.google.android.gms.internal.ads.zzcln;
import com.google.android.gms.internal.ads.zzduy;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfiu;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgrr;
import com.google.android.gms.internal.ads.zzgrt;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.android.gms.internal.ads.zzikw;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.MobileFuseNativeAdKt;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zzs {
    public static final zzfyn zza = new zzf(Looper.getMainLooper());

    @GuardedBy("userAgentLock")
    private String zzh;
    private volatile String zzi;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private final AtomicReference zzd = new AtomicReference(new Bundle());
    private final AtomicBoolean zze = new AtomicBoolean();
    private boolean zzf = true;
    private final Object zzg = new Object();
    private boolean zzj = false;
    private boolean zzk = false;
    private final Executor zzl = Executors.newSingleThreadExecutor();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzA(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final WebResourceResponse zzB(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbl(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not fetch MRAID JS.", e10);
        }
        return null;
    }

    public static final int zzC(@Nullable View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ScrollView) {
                return 1;
            }
            if (parent instanceof AbsListView) {
                return 2;
            }
            if (parent instanceof HorizontalScrollView) {
                return 3;
            }
            if (parent instanceof ScrollingView) {
                return 4;
            }
        }
        return 0;
    }

    public static final String zzD() {
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        return resourcesZzf != null ? resourcesZzf.getString(R.string.f25291s7) : "Test Ad";
    }

    @Nullable
    public static final zzbo zzE(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof zzbo ? (zzbo) iInterfaceQueryLocalInterface : new zzbm(iBinder);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzF(Context context, String str) {
        Context contextZza = zzcae.zza(context);
        return Wrappers.packageManager(contextZza).checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean zzG(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzH(String str) {
        if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgf)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgh);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgg);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzI(Context context) {
        KeyguardManager keyguardManagerZzaf;
        return (context == null || (keyguardManagerZzaf = zzaf(context)) == null || !keyguardManagerZzaf.isKeyguardLocked()) ? false : true;
    }

    public static final boolean zzJ(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th2) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error loading class.", th2);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzK() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzL(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzM(Context context) {
        try {
            Bundle bundleZzai = zzai(context);
            String string = bundleZzai.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(zzah(bundleZzai))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean zzN(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzO(View view, int i10, MotionEvent motionEvent) {
        String strZza;
        int i11;
        int iHeight;
        int iWidth;
        char c10;
        char c11;
        String str;
        zzfir zzfirVarZzC;
        zzfiu zzfiuVarZzaC;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof zzduy) {
                childAt = ((zzduy) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzh) || (childAt instanceof NativeAdView)) {
                strZza = MobileFuseNativeAdKt.AD_TYPE;
                i11 = 1;
            } else {
                strZza = "UNKNOWN";
                i11 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            long jZzA = zzA(childAt);
            childAt.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof zzcks) || (zzfiuVarZzaC = ((zzcks) childAt).zzaC()) == null) {
                c10 = 1;
                c11 = 0;
                str = "none";
            } else {
                str = zzfiuVarZzaC.zzb;
                c10 = 1;
                int iHashCode = childAt.hashCode();
                c11 = 0;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iHashCode).length());
                sb2.append(str);
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(iHashCode);
                childAt.setContentDescription(sb2.toString());
            }
            if ((childAt instanceof zzcjc) && (zzfirVarZzC = ((zzcjc) childAt).zzC()) != null) {
                strZza = zzfir.zza(zzfirVarZzC.zzb);
                i11 = zzfirVarZzC.zze;
                str2 = zzfirVarZzC.zzE;
            }
            Locale locale = Locale.US;
            Integer numValueOf = Integer.valueOf(childAt.hashCode());
            Integer numValueOf2 = Integer.valueOf(i11);
            String name = childAt.getClass().getName();
            Integer numValueOf3 = Integer.valueOf(i12);
            Integer numValueOf4 = Integer.valueOf(i13);
            Integer numValueOf5 = Integer.valueOf(childAt.getWidth());
            Integer numValueOf6 = Integer.valueOf(childAt.getHeight());
            Integer numValueOf7 = Integer.valueOf(iWidth);
            Integer numValueOf8 = Integer.valueOf(iHeight);
            Long lValueOf = Long.valueOf(jZzA);
            String string = Integer.toString(i10, 2);
            Object[] objArr = new Object[15];
            objArr[c11] = numValueOf;
            objArr[c10] = packageName;
            objArr[2] = str2;
            objArr[3] = str;
            objArr[4] = strZza;
            objArr[5] = numValueOf2;
            objArr[6] = name;
            objArr[7] = numValueOf3;
            objArr[8] = numValueOf4;
            objArr[9] = numValueOf5;
            objArr[10] = numValueOf6;
            objArr[11] = numValueOf7;
            objArr[12] = numValueOf8;
            objArr[13] = lValueOf;
            objArr[14] = string;
            String str3 = String.format(locale, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", objArr);
            int i14 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(str3);
        } catch (Exception e10) {
            int i15 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failure getting view location.", e10);
        }
    }

    public static final AlertDialog.Builder zzP(Context context) {
        com.google.android.gms.ads.internal.zzt.zzf();
        return new AlertDialog.Builder(context, android.R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzQ(Context context, String str, String str2) {
        new zzbt(context, str, str2, null, null).zzb();
    }

    public static final void zzR(Context context, Throwable th2) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) zzbjn.zzb.zze()).booleanValue()) {
                CrashUtils.addDynamiteErrorToDropBox(context, th2);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final void zzS(Context context, zzfir zzfirVar, zzdxz zzdxzVar) {
        zzdxy zzdxyVarZza = zzdxzVar.zza();
        zzdxyVarZza.zzc("action", "can_show");
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdxyVarZza.zzc("foreground", true != zzL(context) ? "1" : "0");
        zzdxyVarZza.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
        if (zzfirVar != null) {
            List list = zzfirVar.zzt;
            if (!list.isEmpty()) {
                zzdxyVarZza.zzc("ancn", (String) list.get(0));
            }
            zzdxyVarZza.zzc("ad_format", zzfir.zza(zzfirVar.zzb));
        }
        zzdxyVarZza.zzd();
    }

    public static final boolean zzT(@Nullable zzfir zzfirVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoX)).booleanValue() && zzfirVar != null && zzfirVar.zze == 4;
    }

    public static final int zzU(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            String strConcat = "Could not parse value:".concat(e10.toString());
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            return 0;
        }
    }

    @Nullable
    public static final Map zzV(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzt)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i10 = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i10);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i10);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i10, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i10 = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] zzX(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? zzy() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzY(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrZzy = (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? zzy() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzbb.zza().zza(activity, iArrZzy[0]), com.google.android.gms.ads.internal.client.zzbb.zza().zza(activity, iArrZzy[1])};
    }

    public static final boolean zzZ(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10 = com.google.android.gms.ads.internal.zzt.zzc().zzf || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzq(view);
        long jZzA = zzA(view);
        if (view.getVisibility() != 0 || !view.isShown() || ((powerManager != null && !powerManager.isScreenOn()) || !z10)) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbS)).booleanValue() && !view.getLocalVisibleRect(new Rect()) && !view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzma)).booleanValue()) {
            if (jZzA < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmc)).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static int zza(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return 60000;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 86);
        sb2.append("HTTP timeout too low: ");
        sb2.append(i10);
        sb2.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        String string = sb2.toString();
        int i11 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
        return 60000;
    }

    public static final void zzaa(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmx)).booleanValue()) {
            zzal(context, intent);
            return;
        }
        try {
            zzal(context, intent);
        } catch (SecurityException e10) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void zzab(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzs(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 26);
            sb2.append("Opening ");
            sb2.append(string);
            sb2.append(" in a new browser.");
            String string2 = sb2.toString();
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string2);
        } catch (ActivityNotFoundException e10) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("No browser is found.", e10);
        }
    }

    public static final int[] zzac(Activity activity) {
        int[] iArrZzX = zzX(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzbb.zza().zza(activity, iArrZzX[0]), com.google.android.gms.ads.internal.client.zzbb.zza().zza(activity, iArrZzX[1])};
    }

    public static final boolean zzad(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzZ(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzaf(context));
    }

    public static final void zzae(Context context, Intent intent, @Nullable zzdxz zzdxzVar, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoC)).booleanValue() || !(context instanceof zzcln)) {
            zzaa(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoE))) {
                    ((zzcln) context).zza(intent, 236);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoD)).booleanValue() || zzdxzVar == null) {
                        return;
                    }
                    zzdxy zzdxyVarZza = zzdxzVar.zza();
                    zzdxyVarZza.zzc("action", "hila");
                    zzdxyVarZza.zzc("gqi", zzgrt.zza(str));
                    zzdxyVarZza.zzf();
                    return;
                }
            }
            zzaa(context, intent);
        } catch (ActivityNotFoundException e10) {
            e = e10;
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.startActivityForResult");
            zzaa(context, intent);
        } catch (SecurityException e11) {
            e = e11;
            int i102 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.startActivityForResult");
            zzaa(context, intent);
        } catch (Exception e12) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e12);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e12, "AdUtil.startActivityForResult");
            zzaa(context, intent);
        }
    }

    @Nullable
    private static KeyguardManager zzaf(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static boolean zzag(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static String zzah(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    @Nullable
    private static Bundle zzai(Context context) throws RemoteException {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            zze.zzb("Error getting metadata", e10);
            return null;
        }
    }

    private static final void zzaj(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzak(CustomTabsIntent.Builder builder, Bundle bundle) {
        if (bundle.isEmpty()) {
            return;
        }
        int i10 = bundle.getInt("h", -1);
        if (i10 >= 0) {
            builder.setInitialActivityHeightPx(i10);
        }
        int i11 = bundle.getInt("cbp", -1);
        if (i11 < 0 || i11 > 2) {
            return;
        }
        builder.setCloseButtonPosition(i11);
    }

    private static final void zzal(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String zzam(final Context context, String str) {
        String strZzu;
        String str2;
        if (str == null) {
            return zzu();
        }
        try {
            zzce zzceVarZza = zzce.zza();
            if (TextUtils.isEmpty(zzceVarZza.zza)) {
                if (ClientLibraryUtils.isPackageSide()) {
                    str2 = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcc
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                zze.zza("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                    str2 = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = remoteContext;
                            Context context3 = context;
                            boolean z10 = false;
                            if (context2 != null) {
                                zze.zza("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                zze.zza("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z10 = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                return string;
                            }
                            zze.zza("Reading user agent from WebSettings");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                            if (z10) {
                                sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                                zze.zza("Persisting user agent.");
                            }
                            return defaultUserAgent;
                        }
                    });
                }
                zzceVarZza.zza = str2;
            }
            strZzu = zzceVarZza.zza;
        } catch (Exception unused) {
            strZzu = null;
        }
        if (TextUtils.isEmpty(strZzu)) {
            strZzu = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strZzu)) {
            strZzu = zzu();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZzu).length() + 10 + str.length());
        sb2.append(strZzu);
        sb2.append(" (Mobile; ");
        sb2.append(str);
        String string = sb2.toString();
        try {
            if (Wrappers.packageManager(context).isCallerInstantApp()) {
                StringBuilder sb3 = new StringBuilder(string.length() + 4);
                sb3.append(string);
                sb3.append(";aia");
                string = sb3.toString();
            }
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdUtil.getUserAgent");
        }
        return string.concat(")");
    }

    public static void zzh(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzcei.zza.execute(runnable);
        }
    }

    public static List zzk() {
        zzbgv zzbgvVar = zzbhe.zza;
        List listZzf = com.google.android.gms.ads.internal.client.zzbd.zzb().zzf();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzf.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzgrr.zza(zzgqq.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static String zzl(String str, String str2) {
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            charArray[i10] = (char) (charArray[i10] ^ str2.charAt(i10 % str2.length()));
        }
        return new String(charArray);
    }

    public static zzq zzm(Context context) {
        zzq zzqVar = new zzq(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 >= 24) {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                return new zzq(locale.getLanguage(), locale.getCountry());
            }
            Locale locale2 = context.getResources().getConfiguration().locale;
            return new zzq(locale2.getLanguage(), locale2.getCountry());
        }
        LocaleManager localeManagerA = b.a(context.getSystemService(a.a()));
        if (localeManagerA == null || localeManagerA.getSystemLocales().isEmpty()) {
            return zzqVar;
        }
        Locale locale3 = localeManagerA.getSystemLocales().get(0);
        return new zzq(locale3.getLanguage(), locale3.getCountry());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzq(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzq(android.view.View):boolean");
    }

    public static final boolean zzr(final Context context, final WebSettings webSettings) {
        zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfyn zzfynVar = zzs.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings2 = webSettings;
                webSettings2.setDatabasePath(absolutePath);
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbr)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    public static final void zzs(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzt(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzah(zzai(context));
    }

    static final String zzu() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String zzv() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
        return sb2.toString();
    }

    @Nullable
    public static final Integer zzw(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzx(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzy() {
        return new int[]{0, 0};
    }

    public static final Map zzz(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i10);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    public final void zzb(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i10) {
        int iZza = zza(i10);
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
        sb2.append("HTTP timeout: ");
        sb2.append(iZza);
        sb2.append(" milliseconds.");
        String string = sb2.toString();
        int i11 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zze(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzc(Context context) {
        if (this.zzj) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbhe.zza(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter, 4);
        }
        this.zzj = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzd(Context context) {
        if (this.zzk) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbhe.zza(context);
        byte[] bArr = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, bArr), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, bArr), intentFilter, 4);
        }
        this.zzk = true;
        return true;
    }

    public final String zze(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmJ)).booleanValue()) {
            if (this.zzi != null) {
                return this.zzi;
            }
            this.zzi = zzam(context, str);
            return this.zzi;
        }
        synchronized (this.zzg) {
            try {
                String str2 = this.zzh;
                if (str2 != null) {
                    return str2;
                }
                String strZzam = zzam(context, str);
                this.zzh = strZzam;
                return strZzam;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ListenableFuture zzf(final Uri uri) {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzo
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfyn zzfynVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                return zzs.zzV(uri);
            }
        }, this.zzl);
    }

    public final void zzg(final Context context, @Nullable final String str, String str2, Bundle bundle, boolean z10) {
        com.google.android.gms.ads.internal.zzt.zzc();
        bundle.putString(C4240b4.i.G, zzv());
        zzbgv zzbgvVar = zzbhe.zza;
        bundle.putString("eids", TextUtils.join(StringUtils.COMMA, com.google.android.gms.ads.internal.client.zzbd.zzb().zze()));
        if (bundle.isEmpty()) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlY);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(zzac.zzc(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.zza.zzn(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.zzd.get());
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        com.google.android.gms.ads.internal.util.client.zzf.zzB(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zza(String str4) {
                zzfyn zzfynVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                zzs.zzQ(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }

    public final boolean zzi(String str) {
        return zzag(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaM));
    }

    public final boolean zzj(String str) {
        return zzag(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaN));
    }

    final /* synthetic */ void zzn(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.zzd.set(zzac.zzb(context, str));
    }

    final /* synthetic */ void zzo(boolean z10) {
        this.zzf = z10;
    }

    public final int zzp(Context context, Uri uri, Bundle bundle) {
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zzaj(context, uri);
            return 2;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfz)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfx)).booleanValue()) {
                zzaj(context, uri);
                return 9;
            }
            zzbif zzbifVar = new zzbif();
            zzbifVar.zzd(new zzk(this, zzbifVar, bundle, context, uri));
            zzbifVar.zze((Activity) context);
            return 5;
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(com.google.android.gms.ads.internal.zzt.zzn().zzb());
        zzak(builder, bundle);
        CustomTabsIntent customTabsIntentBuild = builder.build();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfM)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zza();
            if (com.google.android.gms.ads.internal.util.client.zzf.zzw()) {
                return 5;
            }
        }
        customTabsIntentBuild.intent.setPackage(zzikw.zza(context));
        customTabsIntentBuild.launchUrl(context, uri);
        return 5;
    }
}
