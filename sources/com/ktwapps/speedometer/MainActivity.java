package com.ktwapps.speedometer;

import a5.h;
import a5.m;
import a5.n;
import a5.p;
import a5.q;
import a5.s;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.view.GravityCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.android.billingclient.api.ProductDetails;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.BannerCallbacks;
import com.appodeal.ads.InterstitialCallbacks;
import com.appodeal.ads.RewardedVideoCallbacks;
import com.appodeal.ads.initializing.ApdInitializationCallback;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.ktwapps.speedometer.LocationService;
import com.ktwapps.speedometer.MainActivity;
import com.ktwapps.speedometer.Widget.RotateImageView;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import net.pubnative.lite.sdk.models.Protocol;
import x4.j;
import x4.k;
import x4.o;
import x4.u;
import x4.x;
import x4.y;
import y4.l;

/* JADX INFO: loaded from: classes10.dex */
public class MainActivity extends AppCompatActivity implements View.OnClickListener, PopupMenu.OnMenuItemClickListener, j.b, o.a, OnMapReadyCallback, u.d, GoogleMap.OnCameraMoveStartedListener, LocationService.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a5.e f46043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    l f46044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    m f46045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    s f46046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    LocationService f46047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    u f46048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    j f46049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    o f46050j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List f46051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    GoogleMap f46052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Marker f46053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    w4.a f46054n = new w4.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    BroadcastReceiver f46055o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    BroadcastReceiver f46056p = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ServiceConnection f46057q = new c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ActivityResultLauncher f46058r = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: s4.w2
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            this.f99738a.o1((ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ActivityResultLauncher f46059s = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: s4.b3
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            this.f99573a.p1((ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ActivityResultLauncher f46060t = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: s4.c3
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            this.f99583a.q1((ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    ActivityResultLauncher f46061u = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: s4.d3
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            this.f99594a.r1((ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ActivityResultLauncher f46062v = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: s4.e3
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            this.f99602a.s1((ActivityResult) obj);
        }
    });

    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f46063a = 0;

        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f46063a < 1000) {
                return;
            }
            this.f46063a = jCurrentTimeMillis;
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity.f46048h.f(mainActivity) && MainActivity.this.f46048h.h()) {
                MainActivity mainActivity2 = MainActivity.this;
                mainActivity2.f46048h.j(mainActivity2, 1000L);
            }
            if (MainActivity.this.f46048h.h()) {
                return;
            }
            MainActivity.this.o2(0);
            MainActivity.this.V0();
            MainActivity.this.h2();
            s sVar = MainActivity.this.f46046f;
            if (sVar != null) {
                sVar.f4042f.setImageResource(x4.l.r(0));
                MainActivity.this.f46046f.f4043g.setText(R.string.inactive);
                MainActivity.this.f46046f.f4043g.setTextColor(Color.parseColor("#E74C3C"));
                MainActivity.this.f46046f.f4050n.setText("–");
                MainActivity.this.f46046f.f4052p.setText("–");
                MainActivity.this.f46046f.f4046j.setText("–");
                MainActivity.this.f46046f.f4048l.setText("–");
                MainActivity.this.f46046f.f4039c.setText("–");
                MainActivity.this.f46046f.f4038b.setText("–");
                MainActivity.this.f46046f.f4038b.setVisibility(8);
            }
        }
    }

    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            List list;
            MainActivity.this.V0();
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity.f46048h.f(mainActivity) && MainActivity.this.f46048h.h()) {
                MainActivity.this.f46043c.X0.setText("–");
                MainActivity.this.f46043c.f3897i0.setText("–");
                MainActivity.this.f46043c.K.setText("–");
                MainActivity.this.f46043c.f3894h.setText("–");
                MainActivity mainActivity2 = MainActivity.this;
                if (mainActivity2.f46052l != null && (list = mainActivity2.f46051k) != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Polyline) it.next()).remove();
                    }
                    MainActivity.this.f46051k = null;
                }
                MainActivity mainActivity3 = MainActivity.this;
                String strD = mainActivity3.f46054n.d(mainActivity3);
                MainActivity.this.f46043c.f3880a0.setText(strD);
                MainActivity.this.f46043c.E0.setText(strD);
                MainActivity.this.f46043c.B.setText(strD);
                MainActivity.this.f46043c.f3908o.setText(strD);
                MainActivity.this.f46043c.f3922v.setText(strD);
                MainActivity mainActivity4 = MainActivity.this;
                mainActivity4.f46043c.f3931z0.d(x4.l.w(mainActivity4.f46044d.e(), MainActivity.this.f46054n.m(), MainActivity.this.f46044d.d()));
                MainActivity mainActivity5 = MainActivity.this;
                mainActivity5.f46044d.l(mainActivity5.f46054n.r(mainActivity5));
                int iL = MainActivity.this.f46054n.l();
                String str = "(" + MainActivity.this.f46054n.k() + ")";
                String string = MainActivity.this.getResources().getString(R.string.gps_unavailble);
                if (iL == 1) {
                    string = MainActivity.this.getResources().getString(R.string.gps_weak);
                } else if (iL == 2) {
                    string = MainActivity.this.getResources().getString(R.string.gps_moderate);
                } else if (iL == 3) {
                    string = MainActivity.this.getResources().getString(R.string.gps_strong);
                }
                SpannableString spannableString = new SpannableString(string + " " + str);
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), string.length() + 1, spannableString.length(), 33);
                MainActivity.this.f46043c.Q.setText(spannableString);
                MainActivity.this.f46043c.P.setImageResource(x4.l.r(iL));
            } else {
                MainActivity.this.h2();
            }
            MainActivity.this.f46043c.B0.setVisibility(8);
            MainActivity.this.f46043c.f3929y0.setVisibility(8);
            MainActivity.this.f46043c.V0.setVisibility(8);
            MainActivity.this.f46043c.Q0.setVisibility(0);
        }
    }

    class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MainActivity.this.f46047g = ((LocationService.b) iBinder).a();
            MainActivity mainActivity = MainActivity.this;
            mainActivity.f46047g.n(mainActivity);
            MainActivity mainActivity2 = MainActivity.this;
            if (mainActivity2.f46052l != null && mainActivity2.f46047g != null) {
                mainActivity2.X0();
                if (MainActivity.this.f46047g.d().u() != null) {
                    Location locationU = MainActivity.this.f46047g.d().u();
                    MainActivity.this.W0(locationU);
                    if (System.currentTimeMillis() - MainActivity.this.f46054n.e() >= 30000) {
                        MainActivity.this.f46052l.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(locationU.getLatitude(), locationU.getLongitude()), 17.0f));
                    }
                }
            }
            if (MainActivity.this.f46054n.t()) {
                MainActivity.this.a2();
                MainActivity.this.f46054n.D(false);
            }
            if (MainActivity.this.f46054n.s()) {
                MainActivity.this.a1();
                MainActivity.this.f46054n.C(false);
            }
            MainActivity mainActivity3 = MainActivity.this;
            mainActivity3.f46043c.f3927x0.setImageResource(mainActivity3.f46047g.f() ? R.drawable.ic_play : R.drawable.ic_pause);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MainActivity.this.f46047g = null;
        }
    }

    class d implements BannerCallbacks {
        d() {
        }

        @Override // com.appodeal.ads.BannerCallbacks
        public void onBannerClicked() {
        }

        @Override // com.appodeal.ads.BannerCallbacks
        public void onBannerExpired() {
        }

        @Override // com.appodeal.ads.BannerCallbacks
        public void onBannerFailedToLoad() {
        }

        @Override // com.appodeal.ads.BannerCallbacks
        public void onBannerLoaded(int i10, boolean z10) {
            if (!Appodeal.canShow(4) || x.E(MainActivity.this) == 1) {
                return;
            }
            Appodeal.show(MainActivity.this, 64);
        }

        @Override // com.appodeal.ads.BannerCallbacks
        public void onBannerShowFailed() {
        }

        @Override // com.appodeal.ads.BannerCallbacks
        public void onBannerShown() {
        }
    }

    class e implements InterstitialCallbacks {
        e() {
        }

        @Override // com.appodeal.ads.InterstitialCallbacks
        public void onInterstitialClicked() {
        }

        @Override // com.appodeal.ads.InterstitialCallbacks
        public void onInterstitialClosed() {
            x.J(MainActivity.this, 0);
            x.S(MainActivity.this, System.currentTimeMillis());
        }

        @Override // com.appodeal.ads.InterstitialCallbacks
        public void onInterstitialExpired() {
        }

        @Override // com.appodeal.ads.InterstitialCallbacks
        public void onInterstitialFailedToLoad() {
        }

        @Override // com.appodeal.ads.InterstitialCallbacks
        public void onInterstitialLoaded(boolean z10) {
        }

        @Override // com.appodeal.ads.InterstitialCallbacks
        public void onInterstitialShowFailed() {
        }

        @Override // com.appodeal.ads.InterstitialCallbacks
        public void onInterstitialShown() {
        }
    }

    class f implements RewardedVideoCallbacks {
        f() {
        }

        @Override // com.appodeal.ads.RewardedVideoCallbacks
        public void onRewardedVideoClicked() {
        }

        @Override // com.appodeal.ads.RewardedVideoCallbacks
        public void onRewardedVideoClosed(boolean z10) {
        }

        @Override // com.appodeal.ads.RewardedVideoCallbacks
        public void onRewardedVideoExpired() {
        }

        @Override // com.appodeal.ads.RewardedVideoCallbacks
        public void onRewardedVideoFailedToLoad() {
        }

        @Override // com.appodeal.ads.RewardedVideoCallbacks
        public void onRewardedVideoFinished(double d10, String str) {
            x.c0(MainActivity.this.getApplicationContext(), new Date().getTime());
        }

        @Override // com.appodeal.ads.RewardedVideoCallbacks
        public void onRewardedVideoLoaded(boolean z10) {
        }

        @Override // com.appodeal.ads.RewardedVideoCallbacks
        public void onRewardedVideoShowFailed() {
        }

        @Override // com.appodeal.ads.RewardedVideoCallbacks
        public void onRewardedVideoShown() {
        }
    }

    class g implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AlertDialog f46070b;

        g(AlertDialog alertDialog) {
            this.f46070b = alertDialog;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            this.f46070b.getButton(-1).setAlpha(zIsEmpty ? 0.35f : 1.0f);
            this.f46070b.getButton(-1).setEnabled(!zIsEmpty);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public static /* synthetic */ void A0(y yVar, Dialog dialog, View view) {
        yVar.a();
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsetsCompat A1(View view, WindowInsetsCompat windowInsetsCompat) {
        int iDisplayCutout = WindowInsetsCompat.Type.displayCutout();
        if (x.E(this) == 1) {
            iDisplayCutout |= WindowInsetsCompat.Type.navigationBars();
        }
        Insets insets = windowInsetsCompat.getInsets(iDisplayCutout);
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B1(String str) {
        if (str != null) {
            int iIntValue = ((Integer) k.b(this).get(str)).intValue();
            this.f46043c.f3911p0.setBackgroundTintList(ColorStateList.valueOf(iIntValue));
            RotateImageView rotateImageView = this.f46043c.f3931z0;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            rotateImageView.setColorFilter(iIntValue, mode);
            this.f46043c.Q0.setBackgroundTintList(ColorStateList.valueOf(iIntValue));
            this.f46043c.S0.setColorFilter(iIntValue, mode);
            this.f46043c.T0.setTextColor(iIntValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C1(Integer num) {
        if (num != null) {
            this.f46043c.f3883b0.setText(x4.l.z(this, num.intValue()));
            this.f46043c.H0.setText(x4.l.z(this, num.intValue()));
            this.f46043c.F.setText(x4.l.z(this, num.intValue()));
            this.f46043c.f3930z.setText(x4.l.z(this, num.intValue()));
            this.f46043c.f3916s.setText(x4.l.z(this, num.intValue()));
        }
    }

    public static /* synthetic */ void D0(y yVar, Dialog dialog, View view) {
        yVar.c();
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D1(Pair pair) {
        if (pair != null) {
            int iIntValue = ((Integer) pair.first).intValue();
            boolean zBooleanValue = ((Boolean) pair.second).booleanValue();
            int color = zBooleanValue ? Color.parseColor("#FF454A") : ContextCompat.getColor(this, R.color.colorPrimaryText);
            this.f46043c.M0.setImageResource(x4.l.v(iIntValue, zBooleanValue));
            this.f46043c.f3880a0.setTextColor(color);
            this.f46043c.E0.setTextColor(color);
            this.f46043c.f3908o.setTextColor(color);
            this.f46043c.B.setTextColor(color);
            this.f46043c.f3922v.setTextColor(color);
            this.f46043c.f3914r.setVisibility(zBooleanValue ? 0 : 8);
            this.f46043c.E.setVisibility(zBooleanValue ? 0 : 8);
            this.f46043c.f3928y.setVisibility(zBooleanValue ? 0 : 8);
            this.f46043c.L0.setVisibility(zBooleanValue ? 0 : 8);
            this.f46043c.f3891f0.setVisibility(zBooleanValue ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E1(Integer num) {
        this.f46043c.f3920u.setVisibility(num.intValue() == 2 ? 0 : 8);
        this.f46043c.f3904m.setVisibility(num.intValue() == 2 ? 8 : 0);
        this.f46043c.f3890f.setVisibility(4);
        this.f46043c.G.setVisibility(4);
        this.f46043c.A.setVisibility(4);
        this.f46043c.f3893g0.setVisibility(8);
        if (num.intValue() == 0) {
            this.f46043c.H.setImageResource(R.drawable.ic_digital);
            this.f46043c.f3890f.setVisibility(0);
        } else if (num.intValue() == 1) {
            this.f46043c.H.setImageResource(R.drawable.ic_digital_font);
            this.f46043c.G.setVisibility(0);
        } else if (num.intValue() == 2) {
            this.f46043c.H.setImageResource(R.drawable.ic_map);
            this.f46043c.A.setVisibility(0);
        } else {
            this.f46043c.H.setImageResource(R.drawable.ic_analog);
            this.f46043c.f3893g0.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F1(Boolean bool) {
        this.f46043c.f3906n.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G1(Integer num) {
        if (num != null) {
            String string = num.toString();
            this.f46043c.K0.setText(string);
            this.f46043c.f3889e0.setText(string);
            this.f46043c.f3912q.setText(string);
            this.f46043c.D.setText(string);
            this.f46043c.f3926x.setText(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H1(AlertDialog alertDialog, int i10, View view) {
        alertDialog.dismiss();
        if (i10 == 1) {
            this.f46060t.launch(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            return;
        }
        if (i10 == 2) {
            this.f46061u.launch(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } else if (i10 != 3) {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } else {
            this.f46062v.launch(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I1(Dialog dialog, View view) {
        if (x.E(getApplicationContext()) == 0) {
            this.f46049i.s(this);
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J1(Dialog dialog, View view) {
        if (Appodeal.canShow(128) && Appodeal.isLoaded(128) && x.E(this) != 1) {
            Appodeal.show(this, 128);
        } else {
            Toast.makeText(this, R.string.reward_not_ready, 1).show();
        }
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K1(Dialog dialog, View view) {
        dialog.dismiss();
        this.f46059s.launch(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L1(Dialog dialog, View view) {
        dialog.dismiss();
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M1(y yVar, Dialog dialog, RatingBar ratingBar, float f10, boolean z10) {
        if (z10) {
            yVar.a();
            dialog.dismiss();
            if (f10 < 4.0f) {
                Toast.makeText(this, R.string.rating_feedback, 0).show();
                return;
            }
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
            } catch (ActivityNotFoundException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N1(boolean z10, DialogInterface dialogInterface) {
        if (z10) {
            finishAffinity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O1(AlertDialog alertDialog, View view) {
        i2(alertDialog, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P1(AlertDialog alertDialog, View view) {
        i2(alertDialog, 30);
    }

    private void Q0(TextView textView, String str) {
        String string = textView.getText().toString();
        if (string.length() < 3) {
            if (string.equals("0") || string.isEmpty()) {
                textView.setText(str);
                return;
            }
            textView.setText(string + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q1(AlertDialog alertDialog, View view) {
        i2(alertDialog, 40);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsetsCompat.Type.statusBars());
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setStatusBarContrastEnforced(false);
            getWindow().setNavigationBarContrastEnforced(false);
        }
        if (x.E(this) == 1) {
            insetsController.show(WindowInsetsCompat.Type.navigationBars());
        } else {
            insetsController.hide(WindowInsetsCompat.Type.navigationBars());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R1(AlertDialog alertDialog, View view) {
        i2(alertDialog, 50);
    }

    public static /* synthetic */ void S(a5.g gVar, View view) {
        String string = gVar.f3957p.getText().toString();
        if (string.isEmpty()) {
            return;
        }
        gVar.f3957p.setText(string.substring(0, string.length() - 1));
    }

    private void S0() {
        if (x.E(this) == 1) {
            this.f46043c.f3888e.setVisibility(8);
            x.c0(this, 0L);
        } else {
            this.f46043c.f3888e.setVisibility(0);
            b1();
        }
        R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S1(AlertDialog alertDialog, View view) {
        i2(alertDialog, 60);
    }

    private void T0() {
        final a5.g gVarC = a5.g.c(getLayoutInflater());
        gVarC.f3957p.setText("");
        gVarC.f3943b.setOnClickListener(new View.OnClickListener() { // from class: s4.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gVarC.f3957p.setText("");
            }
        });
        gVarC.f3949h.setOnClickListener(new View.OnClickListener() { // from class: s4.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99728b.c1(gVarC, view);
            }
        });
        gVarC.f3953l.setOnClickListener(new View.OnClickListener() { // from class: s4.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99736b.d1(gVarC, view);
            }
        });
        gVarC.f3952k.setOnClickListener(new View.OnClickListener() { // from class: s4.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99744b.e1(gVarC, view);
            }
        });
        gVarC.f3947f.setOnClickListener(new View.OnClickListener() { // from class: s4.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99753b.f1(gVarC, view);
            }
        });
        gVarC.f3946e.setOnClickListener(new View.OnClickListener() { // from class: s4.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99763b.g1(gVarC, view);
            }
        });
        gVarC.f3951j.setOnClickListener(new View.OnClickListener() { // from class: s4.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99571b.h1(gVarC, view);
            }
        });
        gVarC.f3950i.setOnClickListener(new View.OnClickListener() { // from class: s4.c2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99581b.i1(gVarC, view);
            }
        });
        gVarC.f3944c.setOnClickListener(new View.OnClickListener() { // from class: s4.d2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99592b.j1(gVarC, view);
            }
        });
        gVarC.f3948g.setOnClickListener(new View.OnClickListener() { // from class: s4.e2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99600b.k1(gVarC, view);
            }
        });
        gVarC.f3954m.setOnClickListener(new View.OnClickListener() { // from class: s4.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99711b.l1(gVarC, view);
            }
        });
        gVarC.f3945d.setOnClickListener(new View.OnClickListener() { // from class: s4.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.S(gVarC, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(gVarC.getRoot());
        builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() { // from class: s4.u1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f99720b.m1(gVarC, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-1).setTextColor(this.f46044d.b(this));
        alertDialogCreate.getButton(-2).setTextColor(this.f46044d.b(this));
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T1(AlertDialog alertDialog, View view) {
        i2(alertDialog, 70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U1(AlertDialog alertDialog, View view) {
        i2(alertDialog, 80);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V1(AlertDialog alertDialog, View view) {
        i2(alertDialog, 90);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0(Location location) {
        GoogleMap googleMap;
        Marker marker = this.f46053m;
        if (marker != null) {
            marker.setPosition(new LatLng(location.getLatitude(), location.getLongitude()));
            return;
        }
        BitmapDescriptor bitmapDescriptorA = x4.l.a(this, R.drawable.my_location);
        if (bitmapDescriptorA == null || (googleMap = this.f46052l) == null) {
            return;
        }
        this.f46053m = googleMap.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).position(new LatLng(location.getLatitude(), location.getLongitude())).icon(bitmapDescriptorA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W1(AlertDialog alertDialog, View view) {
        i2(alertDialog, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0() {
        LocationService locationService = this.f46047g;
        if (locationService == null || this.f46052l == null) {
            return;
        }
        List<List<LatLng>> listX = locationService.d().x();
        if (listX == null || listX.isEmpty()) {
            List list = this.f46051k;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Polyline) it.next()).remove();
                }
                this.f46051k = null;
                return;
            }
            return;
        }
        int size = listX.size();
        List list2 = this.f46051k;
        if (list2 != null && list2.size() == size) {
            Polyline polyline = (Polyline) this.f46051k.get(r0.size() - 1);
            List listT = this.f46047g.d().t();
            if (listT == null || listT.isEmpty()) {
                return;
            }
            polyline.setPoints(listT);
            return;
        }
        List list3 = this.f46051k;
        if (list3 != null) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                ((Polyline) it2.next()).remove();
            }
        }
        this.f46051k = new ArrayList(size);
        for (List<LatLng> list4 : listX) {
            Polyline polylineAddPolyline = this.f46052l.addPolyline(new PolylineOptions().startCap(new RoundCap()).endCap(new RoundCap()).width(12.0f).color(Color.parseColor("#0A7FFF")).jointType(2));
            if (list4 != null && !list4.isEmpty()) {
                polylineAddPolyline.setPoints(list4);
            }
            this.f46051k.add(polylineAddPolyline);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X1(AlertDialog alertDialog, View view) {
        i2(alertDialog, 110);
    }

    private void Y0() {
        if (this.f46047g == null) {
            s2(true);
        } else {
            finishAffinity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y1(AlertDialog alertDialog, View view) {
        i2(alertDialog, 120);
    }

    private void Z0() {
        if (x.E(this) == 1) {
            startActivity(new Intent(this, (Class<?>) History.class));
            return;
        }
        Intent intent = new Intent(this, (Class<?>) History.class);
        if (this.f46047g != null) {
            startActivity(intent);
        } else {
            this.f46058r.launch(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z1(AlertDialog alertDialog, View view) {
        alertDialog.dismiss();
        T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1() {
        if (!this.f46048h.f(this)) {
            this.f46048h.k(this, 5);
            return;
        }
        if (!this.f46048h.h()) {
            o2(1);
            return;
        }
        if (w4.e.d(this)) {
            LocationService locationService = this.f46047g;
            if (locationService != null && locationService.f()) {
                this.f46047g.o(false);
                this.f46043c.f3927x0.setImageResource(R.drawable.ic_pause);
            }
            startActivity(new Intent(this, (Class<?>) HUD.class));
            return;
        }
        Intent intent = new Intent(this, (Class<?>) LocationService.class);
        intent.putExtra("location", this.f46054n.h());
        intent.putExtra("numberOfSatellites", this.f46054n.j());
        intent.putExtra("numberOfFixedSatellites", this.f46054n.i());
        intent.putExtra("lastSatellitesUpdate", this.f46054n.f());
        intent.putExtra("lastLocationUpdate", this.f46054n.g());
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
        U0();
        this.f46054n.C(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a2() {
        if (x.E(this) != 1 && x.t(this) == 0) {
            p2();
            return;
        }
        if (!Settings.canDrawOverlays(this)) {
            this.f46059s.launch(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())));
            return;
        }
        if (!this.f46048h.f(this)) {
            this.f46048h.k(this, 4);
            return;
        }
        if (!this.f46048h.h()) {
            o2(2);
            return;
        }
        if (w4.e.d(this)) {
            LocationService locationService = this.f46047g;
            if (locationService != null && locationService.f()) {
                this.f46047g.o(false);
                this.f46043c.f3927x0.setImageResource(R.drawable.ic_pause);
            }
            this.f46047g.f46034d.c();
            moveTaskToBack(true);
            return;
        }
        Intent intent = new Intent(this, (Class<?>) LocationService.class);
        intent.putExtra("location", this.f46054n.h());
        intent.putExtra("numberOfSatellites", this.f46054n.j());
        intent.putExtra("numberOfFixedSatellites", this.f46054n.i());
        intent.putExtra("lastSatellitesUpdate", this.f46054n.f());
        intent.putExtra("lastLocationUpdate", this.f46054n.g());
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
        U0();
        this.f46054n.D(true);
    }

    private void b1() {
        if (x.E(this) == 1 || this.f46054n.n()) {
            return;
        }
        Appodeal.disableNetwork("yandex");
        this.f46054n.v(true);
        Appodeal.setBannerViewId(R.id.adView);
        Appodeal.initialize(this, getResources().getString(R.string.appodeal_app_key), 135, new ApdInitializationCallback() { // from class: s4.u2
            @Override // com.appodeal.ads.initializing.ApdInitializationCallback
            public final void onInitializationFinished(List list) {
                this.f99722a.n1(list);
            }
        });
        Appodeal.setBannerCallbacks(new d());
        Appodeal.setInterstitialCallbacks(new e());
        Appodeal.setRewardedVideoCallbacks(new f());
    }

    private void b2() {
        PopupMenu popupMenu = new PopupMenu(this, this.f46043c.f3917s0, GravityCompat.END);
        popupMenu.inflate(R.menu.menu_main);
        try {
            Field[] declaredFields = PopupMenu.class.getDeclaredFields();
            int length = declaredFields.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                Field field = declaredFields[i10];
                if ("mPopup".equals(field.getName())) {
                    field.setAccessible(true);
                    Object obj = field.get(popupMenu);
                    if (obj != null) {
                        Class.forName(obj.getClass().getName()).getMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
                    }
                } else {
                    i10++;
                }
            }
            for (int i11 = 0; i11 < popupMenu.getMenu().size(); i11++) {
                Drawable icon = popupMenu.getMenu().getItem(i11).getIcon();
                if (icon != null) {
                    icon.mutate();
                    icon.setColorFilter(ContextCompat.getColor(this, R.color.colorPrimaryText), PorterDuff.Mode.SRC_ATOP);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c1(a5.g gVar, View view) {
        Q0(gVar.f3957p, "1");
    }

    private void c2() {
        if (!this.f46048h.f(this)) {
            if (this.f46048h.g(this)) {
                r2();
                return;
            } else {
                this.f46048h.k(this, 1);
                return;
            }
        }
        Location locationH = this.f46054n.h();
        LocationService locationService = this.f46047g;
        if (locationService != null) {
            locationH = locationService.d().u();
        }
        if (locationH != null) {
            this.f46054n.y(0L);
            this.f46054n.x(locationH);
            W0(locationH);
            if (this.f46052l == null) {
                return;
            }
            this.f46052l.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(locationH.getLatitude(), locationH.getLongitude()), 17.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d1(a5.g gVar, View view) {
        Q0(gVar.f3957p, "2");
    }

    private void d2() {
        m mVarC = m.c(LayoutInflater.from(this));
        this.f46045e = mVarC;
        mVarC.f4001h.setText(x4.l.k(this));
        this.f46045e.f3997d.setText(x4.l.s(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(this.f46045e.getRoot());
        builder.setPositiveButton(R.string.done, (DialogInterface.OnClickListener) null);
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-1).setTextColor(this.f46044d.b(this));
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
        this.f46045e.f3999f.setOnClickListener(new View.OnClickListener() { // from class: s4.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99734b.u1(alertDialogCreate, view);
            }
        });
        this.f46045e.f3996c.setOnClickListener(new View.OnClickListener() { // from class: s4.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99742b.w1(alertDialogCreate, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e1(a5.g gVar, View view) {
        Q0(gVar.f3957p, "3");
    }

    private void e2() {
        LocationService locationService = this.f46047g;
        if (locationService != null) {
            locationService.o(!locationService.f());
            if (this.f46047g.f()) {
                this.f46044d.l(false);
                this.f46043c.f3880a0.setText(TokenBuilder.TOKEN_DELIMITER);
                this.f46043c.E0.setText("–");
                this.f46043c.B.setText("–");
                this.f46043c.f3908o.setText("–");
                this.f46043c.f3922v.setText(TokenBuilder.TOKEN_DELIMITER);
                this.f46043c.f3931z0.d(0.0f);
            }
            this.f46043c.f3927x0.setImageResource(this.f46047g.f() ? R.drawable.ic_play : R.drawable.ic_pause);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f1(a5.g gVar, View view) {
        Q0(gVar.f3957p, Protocol.VAST_1_0_WRAPPER);
    }

    private void f2() {
        if (this.f46047g != null) {
            x.H(this);
            this.f46047g.d().N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g1(a5.g gVar, View view) {
        Q0(gVar.f3957p, "5");
    }

    private void g2() {
        if (this.f46054n.p()) {
            setRequestedOrientation(6);
            this.f46054n.B(false);
        } else {
            setRequestedOrientation(1);
            this.f46054n.B(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1(a5.g gVar, View view) {
        Q0(gVar.f3957p, "6");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h2() {
        List list;
        this.f46043c.R.setVisibility(8);
        this.f46043c.Q.setText(R.string.gps_inactive);
        this.f46043c.P.setImageResource(x4.l.r(0));
        this.f46043c.f3931z0.d(0.0f);
        this.f46043c.E0.setText("–");
        this.f46043c.B.setText("–");
        this.f46043c.f3908o.setText("–");
        this.f46043c.f3922v.setText(TokenBuilder.TOKEN_DELIMITER);
        this.f46043c.f3880a0.setText("–");
        this.f46043c.X0.setText("–");
        this.f46043c.f3897i0.setText("–");
        this.f46043c.K.setText("–");
        this.f46043c.f3894h.setText("–");
        this.f46044d.l(false);
        if (this.f46052l == null || (list = this.f46051k) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Polyline) it.next()).remove();
        }
        this.f46051k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i1(a5.g gVar, View view) {
        Q0(gVar.f3957p, "7");
    }

    private void i2(Dialog dialog, int i10) {
        dialog.dismiss();
        x.b0(getApplicationContext(), i10);
        this.f46044d.k(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j1(a5.g gVar, View view) {
        Q0(gVar.f3957p, "8");
    }

    private void j2() {
        if (x.E(this) == 1) {
            startActivity(new Intent(this, (Class<?>) Setting.class));
            return;
        }
        Intent intent = new Intent(this, (Class<?>) Setting.class);
        if (this.f46047g != null) {
            startActivity(intent);
        } else {
            this.f46058r.launch(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k1(a5.g gVar, View view) {
        Q0(gVar.f3957p, "9");
    }

    private void k2(boolean z10) {
        this.f46048h = new u(this);
        this.f46049i = new j(this);
        this.f46050j = new o(Looper.getMainLooper());
        this.f46048h.m(this);
        this.f46049i.v(this);
        this.f46050j.a(this);
        this.f46049i.w();
        if (this.f46048h.f(this)) {
            if (!this.f46048h.d(this)) {
                this.f46048h.l(this);
            }
            if (this.f46048h.h()) {
                this.f46048h.e(this, new u.c() { // from class: s4.h2
                    @Override // x4.u.c
                    public final void a(Location location) {
                        this.f99627a.x1(location);
                    }
                });
            }
        } else {
            this.f46048h.k(this, 3);
        }
        if (getResources().getConfiguration().orientation == 2) {
            setRequestedOrientation(6);
        } else {
            setRequestedOrientation(1);
            this.f46054n.B(true);
        }
        if (!z10) {
            try {
                if (!w4.e.d(this)) {
                    this.f46044d.f(this);
                }
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l1(a5.g gVar, View view) {
        Q0(gVar.f3957p, "0");
    }

    private void l2() {
        this.f46043c.f3919t0.setOnClickListener(this);
        this.f46043c.I.setOnClickListener(this);
        this.f46043c.f3913q0.setOnClickListener(this);
        this.f46043c.V.setOnClickListener(this);
        this.f46043c.G0.setOnClickListener(this);
        this.f46043c.D0.setOnClickListener(this);
        this.f46043c.f3917s0.setOnClickListener(this);
        this.f46043c.S.setOnClickListener(this);
        this.f46043c.Q0.setOnClickListener(this);
        this.f46043c.V0.setOnClickListener(this);
        this.f46043c.B0.setOnClickListener(this);
        this.f46043c.f3929y0.setOnClickListener(this);
        this.f46043c.M0.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: s4.r2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f99706b.y1();
            }
        });
        this.f46043c.f3902l.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: s4.s2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f99713b.z1();
            }
        });
        h2();
        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapFragment);
        if (supportMapFragment != null) {
            supportMapFragment.getMapAsync(this);
        }
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        ViewCompat.setOnApplyWindowInsetsListener(this.f46043c.getRoot(), new OnApplyWindowInsetsListener() { // from class: s4.t2
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f99718b.A1(view, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m1(a5.g gVar, DialogInterface dialogInterface, int i10) {
        int i11;
        try {
            i11 = Integer.parseInt(gVar.f3957p.getText().toString().trim());
        } catch (NumberFormatException unused) {
            i11 = 0;
        }
        x.b0(getApplicationContext(), i11);
        this.f46044d.k(i11);
    }

    private void m2() {
        l lVar = (l) new ViewModelProvider(this).get(l.class);
        this.f46044d = lVar;
        lVar.f108377h.observe(this, new Observer() { // from class: s4.i2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f99636b.C1((Integer) obj);
            }
        });
        this.f46044d.f108379j.observe(this, new Observer() { // from class: s4.j2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f99646b.D1((Pair) obj);
            }
        });
        this.f46044d.f108378i.observe(this, new Observer() { // from class: s4.k2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f99658b.E1((Integer) obj);
            }
        });
        this.f46044d.f108380k.observe(this, new Observer() { // from class: s4.m2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f99674b.F1((Boolean) obj);
            }
        });
        this.f46044d.f108381l.observe(this, new Observer() { // from class: s4.n2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f99679b.G1((Integer) obj);
            }
        });
        this.f46044d.f108382m.observe(this, new Observer() { // from class: s4.o2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f99686b.B1((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n1(List list) {
        if (Appodeal.canShow(4) && Appodeal.isLoaded(4) && x.E(this) != 1) {
            Appodeal.show(this, 64);
        }
    }

    private void n2() {
        this.f46046f = s.c(LayoutInflater.from(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(this.f46046f.getRoot());
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-2).setTextColor(this.f46044d.b(this));
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o1(ActivityResult activityResult) {
        if (activityResult.getResultCode() != -1 || x.E(this) == 1) {
            return;
        }
        int iB = x.b(this);
        long jCurrentTimeMillis = System.currentTimeMillis() - x.k(this);
        boolean z10 = (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 1800000) && iB >= 4;
        if (Appodeal.isLoaded(3) && Appodeal.canShow(3) && z10) {
            Appodeal.show(this, 3);
        } else {
            x.J(this, iB + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o2(final int i10) {
        a5.l lVarC = a5.l.c(LayoutInflater.from(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(lVarC.getRoot());
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        lVarC.f3992e.setBackgroundTintList(ColorStateList.valueOf(this.f46044d.b(this)));
        lVarC.f3992e.setOnClickListener(new View.OnClickListener() { // from class: s4.f2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99608b.H1(alertDialogCreate, i10, view);
            }
        });
        lVarC.f3990c.setOnClickListener(new View.OnClickListener() { // from class: s4.g2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreate.dismiss();
            }
        });
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p1(ActivityResult activityResult) {
        if (Settings.canDrawOverlays(this)) {
            return;
        }
        q2();
    }

    private void p2() {
        h hVarC = h.c(LayoutInflater.from(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(hVarC.getRoot());
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        if (x.E(this) == 2) {
            hVarC.f3970h.setText(R.string.pending);
            hVarC.f3970h.setEnabled(false);
        }
        hVarC.f3972j.setBackgroundColor(this.f46044d.b(this));
        hVarC.f3970h.setBackgroundTintList(ColorStateList.valueOf(this.f46044d.b(this)));
        hVarC.f3970h.setOnClickListener(new View.OnClickListener() { // from class: s4.y2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99755b.I1(alertDialogCreate, view);
            }
        });
        hVarC.f3964b.setOnClickListener(new View.OnClickListener() { // from class: s4.z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99765b.J1(alertDialogCreate, view);
            }
        });
        hVarC.f3968f.setOnClickListener(new View.OnClickListener() { // from class: s4.a3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreate.dismiss();
            }
        });
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q1(ActivityResult activityResult) {
        if (this.f46048h.h()) {
            a1();
        }
    }

    private void q2() {
        p pVarC = p.c(LayoutInflater.from(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(pVarC.getRoot());
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        pVarC.f4015d.setBackgroundTintList(ColorStateList.valueOf(this.f46044d.b(this)));
        pVarC.f4015d.setOnClickListener(new View.OnClickListener() { // from class: s4.p2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99692b.K1(alertDialogCreate, view);
            }
        });
        pVarC.f4014c.setOnClickListener(new View.OnClickListener() { // from class: s4.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreate.dismiss();
            }
        });
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r1(ActivityResult activityResult) {
        if (this.f46048h.h()) {
            a2();
        }
    }

    private void r2() {
        a5.k kVarC = a5.k.c(LayoutInflater.from(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(kVarC.getRoot());
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            kVarC.f3983b.setText(R.string.dialog_location_permission_API_31_hint);
        } else if (i10 >= 29) {
            kVarC.f3983b.setText(R.string.dialog_location_permission_API_29_hint);
        } else {
            kVarC.f3983b.setText(R.string.dialog_location_permission_hint);
        }
        kVarC.f3986e.setBackgroundTintList(ColorStateList.valueOf(this.f46044d.b(this)));
        kVarC.f3986e.setOnClickListener(new View.OnClickListener() { // from class: s4.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99690b.L1(alertDialogCreate, view);
            }
        });
        kVarC.f3984c.setOnClickListener(new View.OnClickListener() { // from class: s4.a2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreate.dismiss();
            }
        });
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s1(ActivityResult activityResult) {
        if (this.f46048h.h()) {
            u2();
        }
    }

    private void s2(final boolean z10) {
        final y yVar = new y(this);
        if (!yVar.f()) {
            yVar.c();
            if (z10) {
                finishAffinity();
                return;
            }
            return;
        }
        yVar.d();
        q qVarC = q.c(LayoutInflater.from(new ContextThemeWrapper(this, R.style.RatingDialogTheme)));
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.RatingDialogTheme));
        builder.setView(qVarC.getRoot());
        final AlertDialog alertDialogShow = builder.show();
        qVarC.f4023g.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: s4.k1
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f10, boolean z11) {
                this.f99655a.M1(yVar, alertDialogShow, ratingBar, f10, z11);
            }
        });
        qVarC.f4021e.setOnClickListener(new View.OnClickListener() { // from class: s4.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.A0(yVar, alertDialogShow, view);
            }
        });
        qVarC.f4025i.setOnClickListener(new View.OnClickListener() { // from class: s4.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.D0(yVar, alertDialogShow, view);
            }
        });
        alertDialogShow.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: s4.n1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f99677b.N1(z10, dialogInterface);
            }
        });
        if (alertDialogShow.getWindow() != null) {
            alertDialogShow.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t1(AlertDialog alertDialog, DialogInterface dialogInterface, int i10) {
        x.U(getApplicationContext(), 0.0f);
        this.f46045e.f3997d.setText(x4.l.s(this));
        alertDialog.show();
    }

    private void t2() {
        int i10;
        int color;
        a5.u uVarC = a5.u.c(getLayoutInflater());
        String str = x.s(getApplicationContext()) + "";
        uVarC.f4082r.setText(x4.l.z(this, x.u(this)));
        uVarC.f4079o.setText(str);
        uVarC.f4077m.setText("30");
        uVarC.f4076l.setText("40");
        uVarC.f4070f.setText("50");
        uVarC.f4069e.setText("60");
        uVarC.f4074j.setText("70");
        uVarC.f4073i.setText("80");
        uVarC.f4067c.setText("90");
        uVarC.f4071g.setText("100");
        uVarC.f4075k.setText("110");
        uVarC.f4068d.setText("120");
        uVarC.f4072h.setBackgroundTintList(ColorStateList.valueOf(str.equals("0") ? this.f46044d.b(this) : ContextCompat.getColor(this, R.color.colorDialogButtonBackground)));
        Button button = uVarC.f4077m;
        if (str.equals("30")) {
            color = this.f46044d.b(this);
            i10 = R.color.colorDialogButtonBackground;
        } else {
            i10 = R.color.colorDialogButtonBackground;
            color = ContextCompat.getColor(this, R.color.colorDialogButtonBackground);
        }
        button.setBackgroundTintList(ColorStateList.valueOf(color));
        uVarC.f4076l.setBackgroundTintList(ColorStateList.valueOf(str.equals("40") ? this.f46044d.b(this) : ContextCompat.getColor(this, i10)));
        uVarC.f4070f.setBackgroundTintList(ColorStateList.valueOf(str.equals("50") ? this.f46044d.b(this) : ContextCompat.getColor(this, i10)));
        uVarC.f4069e.setBackgroundTintList(ColorStateList.valueOf(str.equals("60") ? this.f46044d.b(this) : ContextCompat.getColor(this, i10)));
        uVarC.f4074j.setBackgroundTintList(ColorStateList.valueOf(str.equals("70") ? this.f46044d.b(this) : ContextCompat.getColor(this, i10)));
        uVarC.f4073i.setBackgroundTintList(ColorStateList.valueOf(str.equals("80") ? this.f46044d.b(this) : ContextCompat.getColor(this, i10)));
        uVarC.f4067c.setBackgroundTintList(ColorStateList.valueOf(str.equals("90") ? this.f46044d.b(this) : ContextCompat.getColor(this, i10)));
        uVarC.f4071g.setBackgroundTintList(ColorStateList.valueOf(str.equals("100") ? this.f46044d.b(this) : ContextCompat.getColor(this, i10)));
        uVarC.f4075k.setBackgroundTintList(ColorStateList.valueOf(str.equals("110") ? this.f46044d.b(this) : ContextCompat.getColor(this, i10)));
        uVarC.f4068d.setBackgroundTintList(ColorStateList.valueOf(str.equals("120") ? this.f46044d.b(this) : ContextCompat.getColor(this, i10)));
        uVarC.f4080p.setVisibility(str.equals("0") ? 8 : 0);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(uVarC.getRoot());
        builder.setPositiveButton(R.string.done, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-1).setTextColor(this.f46044d.b(this));
        alertDialogCreate.getButton(-2).setTextColor(this.f46044d.b(this));
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
        uVarC.f4072h.setOnClickListener(new View.OnClickListener() { // from class: s4.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99751b.O1(alertDialogCreate, view);
            }
        });
        uVarC.f4077m.setOnClickListener(new View.OnClickListener() { // from class: s4.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99569b.P1(alertDialogCreate, view);
            }
        });
        uVarC.f4076l.setOnClickListener(new View.OnClickListener() { // from class: s4.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99579b.Q1(alertDialogCreate, view);
            }
        });
        uVarC.f4070f.setOnClickListener(new View.OnClickListener() { // from class: s4.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99590b.R1(alertDialogCreate, view);
            }
        });
        uVarC.f4069e.setOnClickListener(new View.OnClickListener() { // from class: s4.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99598b.S1(alertDialogCreate, view);
            }
        });
        uVarC.f4074j.setOnClickListener(new View.OnClickListener() { // from class: s4.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99606b.T1(alertDialogCreate, view);
            }
        });
        uVarC.f4073i.setOnClickListener(new View.OnClickListener() { // from class: s4.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99615b.U1(alertDialogCreate, view);
            }
        });
        uVarC.f4067c.setOnClickListener(new View.OnClickListener() { // from class: s4.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99625b.V1(alertDialogCreate, view);
            }
        });
        uVarC.f4071g.setOnClickListener(new View.OnClickListener() { // from class: s4.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99634b.W1(alertDialogCreate, view);
            }
        });
        uVarC.f4075k.setOnClickListener(new View.OnClickListener() { // from class: s4.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99644b.X1(alertDialogCreate, view);
            }
        });
        uVarC.f4068d.setOnClickListener(new View.OnClickListener() { // from class: s4.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99761b.Y1(alertDialogCreate, view);
            }
        });
        uVarC.f4066b.setOnClickListener(new View.OnClickListener() { // from class: s4.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99559b.Z1(alertDialogCreate, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u1(final AlertDialog alertDialog, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.reset_odometer);
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: s4.v2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                alertDialog.show();
            }
        });
        builder.setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: s4.x2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f99746b.t1(alertDialog, dialogInterface, i10);
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        alertDialog.dismiss();
        alertDialogCreate.getButton(-1).setTextColor(this.f46044d.b(this));
        alertDialogCreate.getButton(-2).setTextColor(this.f46044d.b(this));
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    private void u2() {
        if (!this.f46048h.f(this)) {
            this.f46048h.k(this, 1);
            return;
        }
        if (!this.f46048h.h()) {
            o2(3);
            return;
        }
        if (!this.f46048h.d(this)) {
            this.f46048h.l(this);
        }
        Intent intent = new Intent(this, (Class<?>) LocationService.class);
        intent.putExtra("location", this.f46054n.h());
        intent.putExtra("numberOfSatellites", this.f46054n.j());
        intent.putExtra("numberOfFixedSatellites", this.f46054n.i());
        intent.putExtra("lastSatellitesUpdate", this.f46054n.f());
        intent.putExtra("lastLocationUpdate", this.f46054n.g());
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
        U0();
        this.f46043c.f3927x0.setImageResource(R.drawable.ic_pause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v1(n nVar, AlertDialog alertDialog, DialogInterface dialogInterface, int i10) {
        try {
            x.V(this, Float.parseFloat(nVar.f4003b.getText().toString().trim()), x.n(this));
            this.f46045e.f3997d.setText(x4.l.s(this));
        } catch (Exception unused) {
        }
        alertDialog.show();
    }

    private void v2() {
        List list;
        LocationService locationService = this.f46047g;
        if (locationService != null) {
            locationService.p();
        }
        V0();
        if (this.f46048h.f(this) && this.f46048h.h()) {
            this.f46043c.X0.setText("–");
            this.f46043c.f3897i0.setText("–");
            this.f46043c.K.setText("–");
            this.f46043c.f3894h.setText("–");
            if (this.f46052l != null && (list = this.f46051k) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Polyline) it.next()).remove();
                }
                this.f46051k = null;
            }
            String strD = this.f46054n.d(this);
            this.f46043c.f3880a0.setText(strD);
            this.f46043c.E0.setText(strD);
            this.f46043c.B.setText(strD);
            this.f46043c.f3908o.setText(strD);
            this.f46043c.f3922v.setText(strD);
            this.f46043c.f3931z0.d(x4.l.w(this.f46044d.e(), this.f46054n.m(), this.f46044d.d()));
            this.f46044d.l(this.f46054n.r(this));
            int iL = this.f46054n.l();
            String str = "(" + this.f46054n.k() + ")";
            String string = getResources().getString(R.string.gps_unavailble);
            if (iL == 1) {
                string = getResources().getString(R.string.gps_weak);
            } else if (iL == 2) {
                string = getResources().getString(R.string.gps_moderate);
            } else if (iL == 3) {
                string = getResources().getString(R.string.gps_strong);
            }
            SpannableString spannableString = new SpannableString(string + " " + str);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), string.length() + 1, spannableString.length(), 33);
            this.f46043c.Q.setText(spannableString);
            this.f46043c.P.setImageResource(x4.l.r(iL));
        } else {
            h2();
        }
        this.f46043c.B0.setVisibility(8);
        this.f46043c.f3929y0.setVisibility(8);
        this.f46043c.V0.setVisibility(8);
        this.f46043c.Q0.setVisibility(0);
    }

    public static /* synthetic */ boolean w0(Marker marker) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w1(final AlertDialog alertDialog, View view) {
        final n nVarC = n.c(LayoutInflater.from(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        nVarC.f4003b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        builder.setView(nVarC.getRoot());
        builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() { // from class: s4.o1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f99683b.v1(nVarC, alertDialog, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: s4.q1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                alertDialog.show();
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        alertDialog.dismiss();
        alertDialogCreate.getButton(-1).setTextColor(this.f46044d.b(this));
        alertDialogCreate.getButton(-2).setTextColor(this.f46044d.b(this));
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
        nVarC.f4003b.setText(x4.l.g(this));
        nVarC.f4003b.addTextChangedListener(new g(alertDialogCreate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x1(Location location) {
        if (location == null || this.f46054n.h() != null) {
            return;
        }
        this.f46054n.w(location);
        if (this.f46052l != null) {
            W0(location);
            this.f46052l.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 17.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y1() {
        if (this.f46043c.M0.getWidth() <= 0 || this.f46043c.M0.getHeight() <= 0) {
            return;
        }
        int width = this.f46043c.M0.getWidth() / 6;
        int iA = width / 5;
        if (iA > k.a(this, 21.0f)) {
            iA = k.a(this, 21.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.f46043c.J0.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = width;
        this.f46043c.J0.setLayoutParams(layoutParams);
        this.f46043c.K0.setTextSize(0, (int) (r2 / 2.5f));
        this.f46043c.E0.setTextSize(0, width);
        this.f46043c.H0.setTextSize(0, iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z1() {
        int height = this.f46043c.f3902l.getHeight();
        int width = this.f46043c.f3902l.getWidth();
        if (height <= 0 || width <= 0) {
            return;
        }
        int width2 = (int) (this.f46043c.f3902l.getWidth() * 0.8f);
        int width3 = (int) (this.f46043c.f3902l.getWidth() * 0.9f);
        float f10 = height;
        int i10 = (int) (f10 / 3.0f);
        int i11 = i10 / 6;
        int iA = (int) (f10 / 2.75f);
        int iA2 = iA / 6;
        int iA3 = height / 3;
        int iA4 = iA3 / 6;
        if (getResources().getConfiguration().orientation == 2) {
            width3 = (int) (this.f46043c.f3902l.getWidth() * 0.475f);
            i10 = (int) (f10 / 2.5f);
            i11 = i10 / 6;
            iA = (int) (f10 / 2.0f);
            iA2 = iA / 6;
            iA3 = (int) (f10 / 2.25f);
            iA4 = iA3 / 6;
        }
        Paint paint = new Paint(this.f46043c.B.getPaint());
        float f11 = iA3;
        paint.setTextSize(f11);
        int iMeasureText = (int) paint.measureText("888");
        if (iMeasureText > width2) {
            iA3 = (int) (f11 * (width2 / iMeasureText));
        }
        Paint paint2 = new Paint(this.f46043c.f3922v.getPaint());
        float f12 = iA;
        paint2.setTextSize(f12);
        int iMeasureText2 = (int) paint2.measureText("888");
        if (iMeasureText2 > width2) {
            iA = (int) (f12 * (width2 / iMeasureText2));
        }
        Paint paint3 = new Paint(this.f46043c.f3908o.getPaint());
        float f13 = i10;
        paint3.setTextSize(f13);
        int iMeasureText3 = (int) paint3.measureText("888");
        if (iMeasureText3 > width3) {
            i10 = (int) (f13 * (width3 / iMeasureText3));
            iMeasureText3 = k.a(this, 8.0f) + width3;
        }
        if (iA > k.a(this, 240.0f)) {
            iA = k.a(this, 240.0f);
            iA2 = iA3 / 6;
        }
        if (iA3 > k.a(this, 200.0f)) {
            iA3 = k.a(this, 200.0f);
            iA4 = iA3 / 6;
        }
        if (iA2 > k.a(this, 24.0f)) {
            iA2 = k.a(this, 24.0f);
        }
        if (iA4 > k.a(this, 21.0f)) {
            iA4 = k.a(this, 21.0f);
        }
        float f14 = i10;
        int iA5 = (int) (f14 / 2.5f);
        int iA6 = (int) (iA5 / 2.5f);
        if (iA5 > k.a(this, 60.0f)) {
            iA5 = k.a(this, 60.0f);
            iA6 = k.a(this, 24.0f);
        }
        float f15 = iA3;
        int iA7 = (int) (f15 / 2.5f);
        int iA8 = (int) (iA7 / 2.5f);
        if (iA7 > k.a(this, 75.0f)) {
            iA7 = k.a(this, 75.0f);
            iA8 = k.a(this, 30.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.f46043c.f3910p.getLayoutParams();
        layoutParams.width = iA5;
        layoutParams.height = iA5;
        this.f46043c.f3910p.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f46043c.C.getLayoutParams();
        layoutParams2.width = iA7;
        layoutParams2.height = iA7;
        this.f46043c.C.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f46043c.f3924w.getLayoutParams();
        layoutParams3.width = iA7;
        layoutParams3.height = iA7;
        this.f46043c.f3924w.setLayoutParams(layoutParams3);
        this.f46043c.f3912q.setTextSize(0, iA6);
        float f16 = iA8;
        this.f46043c.D.setTextSize(0, f16);
        this.f46043c.f3926x.setTextSize(0, f16);
        this.f46043c.f3908o.setMinWidth(iMeasureText3);
        this.f46043c.f3908o.setTextSize(0, f14);
        this.f46043c.f3916s.setTextSize(0, i11);
        this.f46043c.B.setTextSize(0, f15);
        this.f46043c.F.setTextSize(0, iA4);
        this.f46043c.f3922v.setTextSize(0, iA);
        this.f46043c.f3930z.setTextSize(0, iA2);
    }

    public void P0() {
        if (this.f46044d.c() == 3) {
            this.f46044d.i(0);
        } else {
            l lVar = this.f46044d;
            lVar.i(lVar.c() + 1);
        }
        x.K(this, this.f46044d.c());
        if (this.f46044d.c() != 3 || this.f46052l == null) {
            return;
        }
        X0();
    }

    void U0() {
        if (!w4.e.d(this)) {
            this.f46043c.Q0.setVisibility(0);
            this.f46043c.B0.setVisibility(8);
            this.f46043c.f3929y0.setVisibility(8);
            this.f46043c.V0.setVisibility(8);
            return;
        }
        bindService(new Intent(this, (Class<?>) LocationService.class), this.f46057q, 1);
        this.f46043c.Q0.setVisibility(8);
        this.f46043c.B0.setVisibility(0);
        this.f46043c.f3929y0.setVisibility(0);
        this.f46043c.V0.setVisibility(0);
    }

    void V0() {
        if (w4.e.d(this)) {
            try {
                unbindService(this.f46057q);
            } catch (Exception unused) {
            }
            this.f46047g = null;
            this.f46043c.B0.setVisibility(8);
            this.f46043c.f3929y0.setVisibility(8);
            this.f46043c.V0.setVisibility(8);
            this.f46043c.Q0.setVisibility(0);
        }
    }

    @Override // x4.j.b
    public void a(ProductDetails productDetails) {
    }

    @Override // x4.j.b
    public void d() {
        S0();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // x4.u.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.location.Location r7) {
        /*
            r6 = this;
            w4.a r0 = r6.f46054n
            android.location.Location r0 = r0.h()
            r1 = 1099431936(0x41880000, float:17.0)
            if (r0 != 0) goto L32
            w4.a r0 = r6.f46054n
            r0.w(r7)
            com.google.android.gms.maps.GoogleMap r0 = r6.f46052l
            if (r0 == 0) goto L32
            com.ktwapps.speedometer.LocationService r0 = r6.f46047g
            if (r0 != 0) goto L32
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            double r2 = r7.getLatitude()
            double r4 = r7.getLongitude()
            r0.<init>(r2, r4)
            com.google.android.gms.maps.GoogleMap r2 = r6.f46052l
            com.google.android.gms.maps.CameraUpdate r0 = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(r0, r1)
            r2.animateCamera(r0)
            r6.W0(r7)
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            float r2 = r7.getAccuracy()
            r3 = 1101004800(0x41a00000, float:20.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto La3
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r7.getTime()
            long r2 = r2 - r4
            r4 = 5000(0x1388, double:2.4703E-320)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto La3
            float r2 = r7.getSpeed()
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto La3
            float r2 = r7.getSpeed()
            r3 = 2139095040(0x7f800000, float:Infinity)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto La3
            float r2 = r7.getSpeed()
            r3 = -8388608(0xffffffffff800000, float:-Infinity)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto La3
            w4.a r2 = r6.f46054n
            r2.x(r7)
            com.google.android.gms.maps.GoogleMap r2 = r6.f46052l
            if (r2 == 0) goto La3
            com.ktwapps.speedometer.LocationService r2 = r6.f46047g
            if (r2 != 0) goto La3
            if (r0 != 0) goto La3
            long r2 = java.lang.System.currentTimeMillis()
            w4.a r0 = r6.f46054n
            long r4 = r0.e()
            long r2 = r2 - r4
            r4 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto La0
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            double r2 = r7.getLatitude()
            double r4 = r7.getLongitude()
            r0.<init>(r2, r4)
            com.google.android.gms.maps.GoogleMap r2 = r6.f46052l
            com.google.android.gms.maps.CameraUpdate r0 = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(r0, r1)
            r2.animateCamera(r0)
        La0:
            r6.W0(r7)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ktwapps.speedometer.MainActivity.e(android.location.Location):void");
    }

    @Override // x4.j.b
    public void h() {
        S0();
    }

    @Override // x4.u.d
    public void i(int i10, int i11) {
        this.f46054n.A(i10);
        this.f46054n.z(i11);
    }

    @Override // com.ktwapps.speedometer.LocationService.c
    public void k(Location location) {
        if (this.f46052l != null) {
            if (System.currentTimeMillis() - this.f46054n.e() >= 30000) {
                this.f46052l.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder().target(new LatLng(location.getLatitude(), location.getLongitude())).zoom(17.0f).build()));
            }
            W0(location);
            if (this.f46044d.c() == 3) {
                X0();
            }
        }
    }

    @Override // x4.j.b
    public void l() {
        if (this.f46054n.u()) {
            return;
        }
        this.f46054n.E(true);
        Toast.makeText(this, R.string.toast_premium_subscribed, 1).show();
    }

    @Override // x4.o.a
    public void m() {
        this.f46043c.f3920u.setText(new SimpleDateFormat(DateFormat.is24HourFormat(this) ? "HH:mm" : "hh:mm", Locale.getDefault()).format(new Date()));
        this.f46043c.f3904m.setText(new SimpleDateFormat(DateFormat.is24HourFormat(this) ? "HH:mm" : "hh:mm", Locale.getDefault()).format(new Date()));
        this.f46043c.R.setVisibility(8);
        long jT = x.t(this);
        if (jT == 0) {
            this.f46043c.f3911p0.setVisibility(8);
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis() - jT;
            if (jCurrentTimeMillis < 0 || jCurrentTimeMillis >= 3600000) {
                x.c0(this, 0L);
                this.f46043c.f3911p0.setVisibility(8);
            } else {
                this.f46043c.f3909o0.setText(x4.l.j(3600000 - jCurrentTimeMillis));
                this.f46043c.f3911p0.setVisibility(0);
            }
        }
        LocationService locationService = this.f46047g;
        if (locationService != null) {
            w4.c cVarD = locationService.d();
            int iZ = cVarD.z();
            String string = getResources().getString(R.string.gps_unavailble);
            String str = "(" + cVarD.y() + ")";
            if (iZ == 1) {
                string = getResources().getString(R.string.gps_weak);
            } else if (iZ == 2) {
                string = getResources().getString(R.string.gps_moderate);
            } else if (iZ == 3) {
                string = getResources().getString(R.string.gps_strong);
            }
            SpannableString spannableString = new SpannableString(string + " " + str);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), string.length() + 1, spannableString.length(), 33);
            this.f46043c.P.setImageResource(x4.l.r(iZ));
            this.f46043c.Q.setText(spannableString);
            s sVar = this.f46046f;
            if (sVar != null) {
                sVar.f4042f.setImageResource(x4.l.r(iZ));
                if (iZ == 1) {
                    this.f46046f.f4043g.setText(R.string.weak);
                    this.f46046f.f4043g.setTextColor(Color.parseColor("#E74C3C"));
                } else if (iZ == 2) {
                    this.f46046f.f4043g.setText(R.string.moderate);
                    this.f46046f.f4043g.setTextColor(Color.parseColor("#F39C12"));
                } else if (iZ != 3) {
                    this.f46046f.f4043g.setText(R.string.unavailble);
                    this.f46046f.f4043g.setTextColor(Color.parseColor("#E74C3C"));
                } else {
                    this.f46046f.f4043g.setText(R.string.strong);
                    this.f46046f.f4043g.setTextColor(Color.parseColor("#2ECC71"));
                }
                this.f46046f.f4050n.setText(cVarD.y());
                this.f46046f.f4046j.setText(cVarD.n());
                this.f46046f.f4048l.setText(cVarD.o());
                this.f46046f.f4039c.setText(cVarD.i(this));
                this.f46046f.f4038b.setText((cVarD.z() == 0 || cVarD.I()) ? getResources().getString(R.string.no_gps_hint) : cVarD.f());
                this.f46046f.f4038b.setVisibility((cVarD.z() == 0 || cVarD.I() || !cVarD.f().isEmpty()) ? 0 : 8);
            }
            String strM = cVarD.m();
            String strL = cVarD.l(this);
            String strP = cVarD.p(this);
            String strJ = cVarD.j(this);
            this.f46043c.K.setText(strL);
            this.f46043c.f3894h.setText(strJ);
            this.f46043c.f3897i0.setText(strP);
            this.f46043c.X0.setText(strM);
            if (!this.f46047g.f()) {
                String strK = cVarD.k(this);
                boolean zK = cVarD.K(this);
                if (this.f46046f != null) {
                    this.f46046f.f4052p.setText(strK + " " + x4.l.z(this, this.f46044d.e()));
                }
                this.f46044d.l(zK);
                this.f46043c.f3880a0.setText(strK);
                this.f46043c.E0.setText(strK);
                this.f46043c.B.setText(strK);
                this.f46043c.f3908o.setText(strK);
                this.f46043c.f3922v.setText(strK);
                this.f46043c.f3931z0.d(x4.l.w(this.f46044d.e(), cVarD.A(), this.f46044d.d()));
                m mVar = this.f46045e;
                if (mVar != null) {
                    mVar.f3997d.setText(x4.l.s(this));
                }
            }
        } else if (this.f46048h.f(this) && this.f46048h.h()) {
            String strD = this.f46054n.d(this);
            this.f46043c.f3880a0.setText(strD);
            this.f46043c.E0.setText(strD);
            this.f46043c.B.setText(strD);
            this.f46043c.f3908o.setText(strD);
            this.f46043c.f3922v.setText(strD);
            this.f46043c.f3931z0.d(x4.l.w(this.f46044d.e(), this.f46054n.m(), this.f46044d.d()));
            this.f46044d.l(this.f46054n.r(this));
            int iL = this.f46054n.l();
            String str2 = "(" + this.f46054n.k() + ")";
            String string2 = getResources().getString(R.string.gps_unavailble);
            if (iL == 1) {
                string2 = getResources().getString(R.string.gps_weak);
            } else if (iL == 2) {
                string2 = getResources().getString(R.string.gps_moderate);
            } else if (iL == 3) {
                string2 = getResources().getString(R.string.gps_strong);
            }
            SpannableString spannableString2 = new SpannableString(string2 + " " + str2);
            spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), string2.length() + 1, spannableString2.length(), 33);
            this.f46043c.P.setImageResource(x4.l.r(iL));
            this.f46043c.Q.setText(spannableString2);
            s sVar2 = this.f46046f;
            if (sVar2 != null) {
                sVar2.f4042f.setImageResource(x4.l.r(iL));
                if (iL == 1) {
                    this.f46046f.f4043g.setText(R.string.weak);
                    this.f46046f.f4043g.setTextColor(Color.parseColor("#E74C3C"));
                } else if (iL == 2) {
                    this.f46046f.f4043g.setText(R.string.moderate);
                    this.f46046f.f4043g.setTextColor(Color.parseColor("#F39C12"));
                } else if (iL != 3) {
                    this.f46046f.f4043g.setText(R.string.unavailble);
                    this.f46046f.f4043g.setTextColor(Color.parseColor("#E74C3C"));
                } else {
                    this.f46046f.f4043g.setText(R.string.strong);
                    this.f46046f.f4043g.setTextColor(Color.parseColor("#2ECC71"));
                }
                this.f46046f.f4052p.setText(strD + " " + x4.l.z(this, this.f46044d.e()));
                this.f46046f.f4050n.setText(this.f46054n.k());
                this.f46046f.f4046j.setText(this.f46054n.b());
                this.f46046f.f4048l.setText(this.f46054n.c());
                this.f46046f.f4039c.setText(this.f46054n.a(this));
                this.f46046f.f4038b.setText((iL == 0 || this.f46054n.o()) ? getResources().getString(R.string.no_gps_hint) : "");
                this.f46046f.f4038b.setVisibility((iL == 0 || this.f46054n.o()) ? 0 : 8);
            }
        }
        this.f46050j.sendEmptyMessageDelayed(2, 50L);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i10) {
        if (i10 == 1) {
            this.f46054n.y(System.currentTimeMillis());
        }
    }

    @Override // android.view.View.OnClickListener
    @SuppressLint({"RestrictedApi", "SetTextI18n", "NonConstantResourceId"})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.displayView /* 2131362265 */:
                P0();
                break;
            case R.id.gpsView /* 2131362436 */:
                n2();
                break;
            case R.id.hudView /* 2131362459 */:
                a1();
                break;
            case R.id.minimizeView /* 2131363089 */:
                a2();
                break;
            case R.id.moreView /* 2131363099 */:
                b2();
                break;
            case R.id.navigationImageButton /* 2131363153 */:
                c2();
                break;
            case R.id.playbackView /* 2131363233 */:
                e2();
                break;
            case R.id.resetView /* 2131363327 */:
                f2();
                break;
            case R.id.rotateView /* 2131363351 */:
                g2();
                break;
            case R.id.speedLimitView /* 2131363432 */:
                t2();
                break;
            case R.id.startView /* 2131363473 */:
                u2();
                break;
            case R.id.stopView /* 2131363487 */:
                if (x.E(this) != 1) {
                    int iB = x.b(this);
                    long jCurrentTimeMillis = System.currentTimeMillis() - x.k(this);
                    boolean z10 = (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 1800000) && iB >= 4;
                    if (Appodeal.isLoaded(3) && Appodeal.canShow(3) && z10) {
                        Appodeal.show(this, 3);
                    } else {
                        x.J(this, iB + 1);
                        LocationService locationService = this.f46047g;
                        if (locationService != null && locationService.d().g() > 0.0f) {
                            s2(false);
                        }
                    }
                } else {
                    LocationService locationService2 = this.f46047g;
                    if (locationService2 != null && locationService2.d().g() > 0.0f) {
                        s2(false);
                    }
                }
                v2();
                break;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        SplashScreen.installSplashScreen(this);
        EdgeToEdge.enable(this);
        R0();
        super.onCreate(bundle);
        a5.e eVarC = a5.e.c(getLayoutInflater());
        this.f46043c = eVarC;
        setContentView(eVarC.getRoot());
        MapsInitializer.initialize(this);
        m2();
        k2(bundle != null);
        l2();
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: s4.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99727b.R0();
            }
        }, 100L);
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(GoogleMap googleMap) {
        this.f46052l = googleMap;
        googleMap.setMapColorScheme(x.l(this) == 0 ? 1 : 0);
        this.f46052l.getUiSettings().setZoomControlsEnabled(false);
        this.f46052l.setOnCameraMoveStartedListener(this);
        this.f46052l.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: s4.l2
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                return MainActivity.w0(marker);
            }
        });
        if (this.f46048h.f(this)) {
            LocationService locationService = this.f46047g;
            if (locationService != null) {
                Location locationU = locationService.d().u();
                if (locationU != null) {
                    W0(locationU);
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(locationU.getLatitude(), locationU.getLongitude()), 17.0f));
                    return;
                }
                return;
            }
            Location locationH = this.f46054n.h();
            if (locationH != null) {
                W0(locationH);
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(locationH.getLatitude(), locationH.getLongitude()), 17.0f));
            }
        }
    }

    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_exit /* 2131363074 */:
                Y0();
                break;
            case R.id.menu_history /* 2131363075 */:
                Z0();
                break;
            case R.id.menu_odometer /* 2131363077 */:
                d2();
                break;
            case R.id.menu_setting /* 2131363079 */:
                j2();
                break;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (this.f46048h.f(this) && this.f46048h.h()) {
            this.f46048h.j(this, 1000L);
        }
        if (i10 == 1) {
            if (this.f46048h.f(this)) {
                u2();
                return;
            } else {
                if (this.f46048h.g(this)) {
                    r2();
                    return;
                }
                return;
            }
        }
        if (i10 == 3) {
            if (!this.f46048h.f(this) || this.f46048h.d(this)) {
                return;
            }
            this.f46048h.l(this);
            return;
        }
        if (i10 == 4) {
            if (this.f46048h.f(this)) {
                a2();
                return;
            } else {
                if (this.f46048h.g(this)) {
                    r2();
                    return;
                }
                return;
            }
        }
        if (i10 == 5) {
            if (this.f46048h.f(this)) {
                a1();
            } else if (this.f46048h.g(this)) {
                r2();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        List list;
        super.onResume();
        R0();
        j jVar = this.f46049i;
        if (jVar != null) {
            jVar.u();
        }
        if (!this.f46048h.h() || !this.f46048h.f(this)) {
            h2();
        }
        if (w4.e.d(this)) {
            return;
        }
        this.f46043c.X0.setText("–");
        this.f46043c.f3897i0.setText("–");
        this.f46043c.K.setText("–");
        this.f46043c.f3894h.setText("–");
        if (this.f46052l == null || (list = this.f46051k) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Polyline) it.next()).remove();
        }
        this.f46051k = null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        U0();
        this.f46044d.n(this);
        this.f46050j.sendEmptyMessage(2);
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.f46056p, new IntentFilter("STOP_SERVICE_BROADCAST_RECEIVER"), 4);
        } else {
            registerReceiver(this.f46056p, new IntentFilter("STOP_SERVICE_BROADCAST_RECEIVER"));
        }
        registerReceiver(this.f46055o, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        if (x.x(this)) {
            getWindow().addFlags(128);
        } else {
            getWindow().clearFlags(128);
        }
        if (this.f46048h.f(this) && this.f46048h.h()) {
            this.f46048h.j(this, 1000L);
        }
        S0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        V0();
        this.f46050j.removeMessages(2);
        unregisterReceiver(this.f46056p);
        unregisterReceiver(this.f46055o);
        getWindow().clearFlags(128);
        if (this.f46048h.f(this)) {
            this.f46048h.n();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        R0();
    }
}
