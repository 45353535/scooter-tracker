package com.taurusx.tax.o;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.ironsource.C4240b4;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.mraid.MraidVideoPlayerActivity;
import com.taurusx.tax.o.g0;
import com.taurusx.tax.o.i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;

/* JADX INFO: loaded from: classes11.dex */
public class q extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f66477b = 31;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f66478h = 50;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f66479j = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f66480r = "MraidDisplayController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f66481a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.n f66482c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f66483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f66484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f66485g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f66486i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f66487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FrameLayout f66488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f66489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f66490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g0 f66491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f66492p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewGroup f66493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f66494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g0 f66495u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f66496v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g0.p f66497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.taurusx.tax.o.a f66498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g0.c f66499y;

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Context f66500w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f66502z;

        public a() {
        }

        private boolean z() {
            return this.f66500w != null;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iG;
            if (z() && intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED") && (iG = q.this.g()) != this.f66502z) {
                this.f66502z = iG;
                q.this.y(iG);
            }
        }

        public void w() {
            this.f66500w.unregisterReceiver(this);
            this.f66500w = null;
        }

        public void z(Context context) {
            this.f66500w = context;
            context.registerReceiver(this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f66504z;

        public c(String str) {
            this.f66504z = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            q.this.z(this.f66504z);
        }
    }

    public class o implements View.OnTouchListener {
        public o() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q.this.w();
        }
    }

    public class w implements Runnable {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f66508z;

        public w(String str) {
            this.f66508z = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(q.this.a(), this.f66508z, 0).show();
        }
    }

    public class y implements Runnable {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ File f66510w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f66511y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public MediaScannerConnection f66512z;

        public y(File file, String str) {
            this.f66510w = file;
            this.f66511y = str;
        }

        private Bitmap z(String str) {
            Bitmap bitmapDecodeStream = null;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                inputStream.close();
                return bitmapDecodeStream;
            } catch (Exception e10) {
                e10.printStackTrace();
                return bitmapDecodeStream;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(this.f66510w, System.currentTimeMillis() + ".jpg");
            Bitmap bitmapZ = z(this.f66511y);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmapZ.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri uriFromFile = Uri.fromFile(file);
                q.this.o("Download image Success...");
                q.this.a().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uriFromFile));
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public class z extends g0.y {
        public z() {
        }

        @Override // com.taurusx.tax.o.g0.y, com.taurusx.tax.o.g0.o
        public void z(g0 g0Var, g0.p pVar) {
            q.this.w();
        }
    }

    public q(g0 g0Var, g0.c cVar, g0.n nVar) {
        super(g0Var);
        this.f66497w = g0.p.HIDDEN;
        this.f66481a = new Handler();
        this.f66494t = new a();
        this.f66492p = -1;
        this.f66486i = -1;
        this.f66498x = new com.taurusx.tax.o.a();
        this.f66495u = g0Var;
        this.f66499y = cVar;
        this.f66482c = nVar;
        Context contextA = a();
        this.f66490n = contextA instanceof Activity ? ((Activity) contextA).getRequestedOrientation() : -1;
        this.f66483e = y();
        this.f66487k = c();
        this.f66488l = o();
        i();
    }

    private String a(String str) throws IllegalArgumentException {
        StringBuilder sb2 = new StringBuilder();
        boolean[] zArr = new boolean[63];
        String[] strArrSplit = str.split(StringUtils.COMMA);
        for (String str2 : strArrSplit) {
            int i10 = Integer.parseInt(str2);
            int i11 = i10 + 31;
            if (!zArr[i11]) {
                sb2.append(z(i10) + StringUtils.COMMA);
                zArr[i11] = true;
            }
        }
        if (strArrSplit.length == 0) {
            throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g() {
        return ((WindowManager) a().getSystemService("window")).getDefaultDisplay().getOrientation();
    }

    private void i() {
        this.f66497w = g0.p.LOADING;
        l();
        this.f66494t.z(a());
    }

    private void l() {
        int i10;
        int top;
        Context contextA = a();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) contextA.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f66489m = displayMetrics.density;
        if (contextA instanceof Activity) {
            Window window = ((Activity) contextA).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i10 = rect.top;
            top = window.findViewById(R.id.content).getTop() - i10;
        } else {
            i10 = 0;
            top = 0;
        }
        int i11 = displayMetrics.widthPixels;
        int i12 = (displayMetrics.heightPixels - i10) - top;
        double d10 = 160.0d / ((double) displayMetrics.densityDpi);
        this.f66492p = (int) (((double) i11) * d10);
        this.f66486i = (int) (((double) i12) * d10);
    }

    private File m() {
        return new File(Environment.getExternalStorageDirectory(), "Pictures");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        this.f66481a.post(new w(str));
    }

    private void r() {
        ViewGroup viewGroup = (ViewGroup) z().getParent();
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        int i10 = 0;
        while (i10 < childCount && viewGroup.getChildAt(i10) != z()) {
            i10++;
        }
        this.f66496v = i10;
        viewGroup.addView(this.f66488l, i10, new ViewGroup.LayoutParams(z().getWidth(), z().getHeight()));
        viewGroup.removeView(z());
    }

    private void u() {
        z(false);
        this.f66483e.removeAllViewsInLayout();
        this.f66487k.removeAllViewsInLayout();
        this.f66493s.removeView(this.f66487k);
        z().requestLayout();
        ViewGroup viewGroup = (ViewGroup) this.f66488l.getParent();
        viewGroup.addView(z(), this.f66496v);
        viewGroup.removeView(this.f66488l);
        viewGroup.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(int i10) {
        l();
        z().z(c0.z(this.f66492p, this.f66486i));
    }

    public void c(String str) {
        Context contextA = a();
        if (!i0.c(contextA)) {
            z().z(i.w.STORE_PICTURE, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
            LogUtil.d(f66480r, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
        } else if (contextA instanceof Activity) {
            y(str);
        } else {
            o("Downloading image to Picture gallery...");
            z(str);
        }
    }

    public void e() {
        Context contextA = a();
        z().z(new e0().o(i0.o(contextA)).y(i0.y(contextA)).z(i0.z(contextA)).w(i0.w(contextA)).c(i0.c(contextA)));
    }

    public void f() {
        z().z(i.w.GET_MAX_SIZE, "Unsupported action getMaxSize");
    }

    public boolean k() {
        return this.f66497w == g0.p.EXPANDED;
    }

    public void n() {
        z().z(i.w.GET_CURRENT_POSITION, "Unsupported action getCurrentPosition");
    }

    public void p() {
        z().z(i.w.GET_SCREEN_SIZE, "Unsupported action getScreenSize");
    }

    public void s() {
        try {
            this.f66494t.w();
        } catch (IllegalArgumentException e10) {
            if (!e10.getMessage().contains("Receiver not registered")) {
                throw e10;
            }
        }
    }

    public void t() {
        z().z(i.w.GET_DEFAULT_POSITION, "Unsupported action getDefaultPosition");
    }

    public void v() {
        ArrayList<b0> arrayList = new ArrayList<>();
        arrayList.add(c0.z(this.f66492p, this.f66486i));
        arrayList.add(h0.z(z().getIsVisible()));
        z().z(arrayList);
        this.f66497w = g0.p.DEFAULT;
        z().z(d0.z(this.f66497w));
        e();
    }

    public void x() {
        ViewGroup viewGroup = (ViewGroup) this.f66495u.getParent();
        this.f66495u.w(viewGroup, this.f66498x);
        this.f66495u.z(viewGroup, this.f66498x);
        this.f66497w = g0.p.RESIZED;
        z().z(d0.z(this.f66497w));
    }

    private String n(String str) throws IllegalArgumentException {
        StringBuilder sb2 = new StringBuilder();
        boolean[] zArr = new boolean[7];
        String[] strArrSplit = str.split(StringUtils.COMMA);
        for (String str2 : strArrSplit) {
            int i10 = Integer.parseInt(str2);
            if (i10 == 7) {
                i10 = 0;
            }
            if (!zArr[i10]) {
                sb2.append(w(i10) + StringUtils.COMMA);
                zArr[i10] = true;
            }
        }
        if (strArrSplit.length == 0) {
            throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    public FrameLayout o() {
        return new FrameLayout(a());
    }

    public void w() {
        g0.p pVar = this.f66497w;
        if (pVar == g0.p.EXPANDED) {
            u();
            w(false);
            this.f66497w = g0.p.DEFAULT;
            z().z(d0.z(this.f66497w));
        } else if (pVar == g0.p.RESIZED) {
            ViewGroup viewGroup = (ViewGroup) this.f66495u.getParent();
            z().g();
            z().z(viewGroup);
            w(false);
            this.f66497w = g0.p.DEFAULT;
            z().z(d0.z(this.f66497w));
        } else if (pVar == g0.p.DEFAULT) {
            z().setVisibility(4);
            this.f66497w = g0.p.HIDDEN;
            z().z(d0.z(this.f66497w));
        }
        if (z().getMraidListener() != null) {
            z().getMraidListener().z(z(), this.f66497w);
        }
    }

    public void s(String str) {
        MraidVideoPlayerActivity.w(a(), str);
    }

    public void z(String str, int i10, int i11, boolean z10, boolean z11) {
        g0.c cVar = this.f66499y;
        g0.c cVar2 = g0.c.DISABLED;
        if (cVar == cVar2) {
            return;
        }
        if (str != null && !URLUtil.isValidUrl(str)) {
            z().z(i.w.EXPAND, "URL passed to expand() was invalid.");
            return;
        }
        this.f66493s = (ViewGroup) z().getRootView().findViewById(R.id.content);
        y(z10);
        w(z11);
        r();
        g0 g0VarZ = z();
        if (str != null) {
            g0 g0Var = new g0(a(), cVar2, g0.n.AD_CONTROLLED, g0.f.INLINE);
            this.f66491o = g0Var;
            g0Var.setMraidListener(new z());
            this.f66491o.loadUrl(str);
            g0VarZ = this.f66491o;
        }
        float f10 = i10;
        float f11 = this.f66489m;
        z(g0VarZ, (int) (f10 * f11), (int) (i11 * f11));
        this.f66493s.addView(this.f66487k, new RelativeLayout.LayoutParams(-1, -1));
        g0.n nVar = this.f66482c;
        if (nVar == g0.n.ALWAYS_VISIBLE || (!this.f66484f && nVar != g0.n.ALWAYS_HIDDEN)) {
            z(true);
        }
        this.f66497w = g0.p.EXPANDED;
        z().z(d0.z(this.f66497w));
        if (z().getMraidListener() != null) {
            z().getMraidListener().z(z());
        }
    }

    private void y(String str) {
        new AlertDialog.Builder(a()).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new c(str)).setCancelable(true).show();
    }

    private Map<String, Object> c(Map<String, String> map) throws Exception {
        HashMap map2 = new HashMap();
        if (map.containsKey("description") && map.containsKey("start")) {
            map2.put("title", map.get("description"));
            if (map.containsKey("start") && map.get("start") != null) {
                Date dateW = w(map.get("start"));
                if (dateW != null) {
                    map2.put(MRAIDNativeFeatureProvider.EXTRA_EVENT_BEGIN_TIME, Long.valueOf(dateW.getTime()));
                    if (map.containsKey("end") && map.get("end") != null) {
                        Date dateW2 = w(map.get("end"));
                        if (dateW2 != null) {
                            map2.put(MRAIDNativeFeatureProvider.EXTRA_EVENT_END_TIME, Long.valueOf(dateW2.getTime()));
                        } else {
                            throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                        }
                    }
                    if (map.containsKey("location")) {
                        map2.put(MRAIDNativeFeatureProvider.EVENT_LOCATION, map.get("location"));
                    }
                    if (map.containsKey("summary")) {
                        map2.put("description", map.get("summary"));
                    }
                    if (map.containsKey("transparency")) {
                        map2.put("availability", Integer.valueOf(map.get("transparency").equals(C4240b4.i.T) ? 1 : 0));
                    }
                    map2.put("rrule", w(map));
                    return map2;
                }
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        throw new IllegalArgumentException("Missing start and description fields");
    }

    public void y(boolean z10) {
        this.f66484f = z10;
        g0 g0VarZ = z();
        boolean z11 = !z10;
        if (g0VarZ.getOnCloseButtonStateChangeListener() != null) {
            g0VarZ.getOnCloseButtonStateChangeListener().z(g0VarZ, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context a() {
        return z().getContext();
    }

    public FrameLayout y() {
        return new FrameLayout(a());
    }

    public void y(Map<String, String> map) {
        int i10 = Integer.parseInt(map.get("width"));
        int i11 = Integer.parseInt(map.get("height"));
        int i12 = Integer.parseInt(map.get("offsetX"));
        int i13 = Integer.parseInt(map.get("offsetY"));
        String str = map.get("customClosePosition");
        boolean z10 = Boolean.parseBoolean(map.get("allowOffscreen"));
        com.taurusx.tax.o.a aVar = this.f66498x;
        aVar.f66413z = i10;
        aVar.f66411w = i11;
        aVar.f66412y = i12;
        aVar.f66408c = i13;
        aVar.f66409o = com.taurusx.tax.o.a.z(str);
        this.f66498x.f66410s = z10;
    }

    private Date w(String str) {
        Date date = null;
        int i10 = 0;
        while (true) {
            String[] strArr = f66479j;
            if (i10 >= strArr.length) {
                break;
            }
            try {
                date = new SimpleDateFormat(strArr[i10]).parse(str);
            } catch (ParseException unused) {
            }
            if (date != null) {
                break;
            }
            i10++;
        }
        return date;
    }

    private String w(Map<String, String> map) throws IllegalArgumentException {
        StringBuilder sb2 = new StringBuilder();
        if (map.containsKey("frequency")) {
            String str = map.get("frequency");
            int i10 = map.containsKey("interval") ? Integer.parseInt(map.get("interval")) : -1;
            if ("daily".equals(str)) {
                sb2.append("FREQ=DAILY;");
                if (i10 != -1) {
                    sb2.append("INTERVAL=" + i10 + ";");
                }
            } else if ("weekly".equals(str)) {
                sb2.append("FREQ=WEEKLY;");
                if (i10 != -1) {
                    sb2.append("INTERVAL=" + i10 + ";");
                }
                if (map.containsKey("daysInWeek")) {
                    String strN = n(map.get("daysInWeek"));
                    if (strN != null) {
                        sb2.append("BYDAY=" + strN + ";");
                    } else {
                        throw new IllegalArgumentException("invalid ");
                    }
                }
            } else if ("monthly".equals(str)) {
                sb2.append("FREQ=MONTHLY;");
                if (i10 != -1) {
                    sb2.append("INTERVAL=" + i10 + ";");
                }
                if (map.containsKey("daysInMonth")) {
                    String strA = a(map.get("daysInMonth"));
                    if (strA != null) {
                        sb2.append("BYMONTHDAY=" + strA + ";");
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            } else {
                throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        File fileM = m();
        fileM.mkdirs();
        new Thread(new y(fileM, str)).start();
    }

    public void z(Map<String, String> map) {
        Context context = z().getContext();
        if (i0.z(context)) {
            try {
                Map<String, Object> mapC = c(map);
                Intent type = new Intent("android.intent.action.INSERT").setType(i0.f66467z);
                for (String str : mapC.keySet()) {
                    Object obj = mapC.get(str);
                    if (obj instanceof Long) {
                        type.putExtra(str, ((Long) obj).longValue());
                    } else if (obj instanceof Integer) {
                        type.putExtra(str, ((Integer) obj).intValue());
                    } else {
                        type.putExtra(str, (String) obj);
                    }
                }
                type.setFlags(268435456);
                context.startActivity(type);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.d(f66480r, "no calendar app installed");
                z().z(i.w.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
                return;
            } catch (IllegalArgumentException e10) {
                LogUtil.d(f66480r, "create calendar: invalid parameters " + e10.getMessage());
                z().z(i.w.CREATE_CALENDAR_EVENT, e10.getMessage());
                return;
            } catch (Exception unused2) {
                LogUtil.d(f66480r, "could not create calendar event");
                z().z(i.w.CREATE_CALENDAR_EVENT, "could not create calendar event");
                return;
            }
        }
        LogUtil.d(f66480r, "unsupported action createCalendarEvent for devices pre-ICS");
        z().z(i.w.CREATE_CALENDAR_EVENT, "Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
    }

    public RelativeLayout c() {
        return new RelativeLayout(a());
    }

    private String w(int i10) throws IllegalArgumentException {
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
                throw new IllegalArgumentException("invalid day of week " + i10);
        }
    }

    private void w(boolean z10) {
        int i10;
        try {
            Activity activity = (Activity) a();
            if (z10) {
                i10 = activity.getResources().getConfiguration().orientation;
            } else {
                i10 = this.f66490n;
            }
            activity.setRequestedOrientation(i10);
        } catch (ClassCastException unused) {
            LogUtil.d(f66480r, "Unable to modify device orientation.");
        }
    }

    private String z(int i10) throws IllegalArgumentException {
        if (i10 != 0 && i10 >= -31 && i10 <= 31) {
            return "" + i10;
        }
        throw new IllegalArgumentException("invalid day of month " + i10);
    }

    private void z(View view, int i10, int i11) {
        int i12 = (int) ((this.f66489m * 50.0f) + 0.5f);
        if (i10 < i12) {
            i10 = i12;
        }
        if (i11 < i12) {
            i11 = i12;
        }
        View view2 = new View(a());
        view2.setBackgroundColor(0);
        view2.setOnTouchListener(new o());
        this.f66487k.addView(view2, new RelativeLayout.LayoutParams(-1, -1));
        this.f66483e.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i11);
        layoutParams.addRule(13);
        this.f66487k.addView(this.f66483e, layoutParams);
    }

    public void z(boolean z10) {
        if (this.f66493s == null) {
            return;
        }
        if (z10) {
            if (this.f66485g == null) {
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{-16842919}, com.taurusx.tax.o.s.INTERSTITIAL_CLOSE_BUTTON_NORMAL.decodeImage(this.f66493s.getContext()));
                stateListDrawable.addState(new int[]{R.attr.state_pressed}, com.taurusx.tax.o.s.INTERSTITIAL_CLOSE_BUTTON_PRESSED.decodeImage(this.f66493s.getContext()));
                ImageButton imageButton = new ImageButton(a());
                this.f66485g = imageButton;
                imageButton.setImageDrawable(stateListDrawable);
                this.f66485g.setBackgroundDrawable(null);
                this.f66485g.setOnClickListener(new s());
            }
            int i10 = (int) ((this.f66489m * 50.0f) + 0.5f);
            this.f66483e.addView(this.f66485g, new FrameLayout.LayoutParams(i10, i10, 5));
        } else {
            this.f66483e.removeView(this.f66485g);
        }
        g0 g0VarZ = z();
        if (g0VarZ.getOnCloseButtonStateChangeListener() != null) {
            g0VarZ.getOnCloseButtonStateChangeListener().z(g0VarZ, z10);
        }
    }
}
