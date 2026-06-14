package com.ktwapps.speedometer;

import a5.j;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.ktwapps.speedometer.HUD;
import com.ktwapps.speedometer.LocationService;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import x4.k;
import x4.l;
import x4.o;
import x4.u;
import x4.x;

/* JADX INFO: loaded from: classes10.dex */
public class HUD extends AppCompatActivity implements View.OnClickListener, o.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a5.d f46000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f46001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u f46002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LocationService f46003f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ServiceConnection f46004g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    BroadcastReceiver f46005h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    BroadcastReceiver f46006i = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    BroadcastReceiver f46007j = new d();

    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HUD.this.f46003f = ((LocationService.b) iBinder).a();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            HUD.this.f46003f = null;
        }
    }

    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            HUD.this.J();
        }
    }

    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (HUD.this.f46002e.h()) {
                return;
            }
            HUD.this.J();
        }
    }

    class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = (int) ((intent.getIntExtra("level", 0) / intent.getIntExtra("scale", 0)) * 100.0f);
            HUD.this.f46000c.f3847d.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf(intExtra)));
            HUD hud = HUD.this;
            hud.f46000c.f3846c.setImageResource(l.c(intExtra, x.l(hud.getApplicationContext())));
        }
    }

    class e extends OnBackPressedCallback {
        e(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            HUD.this.setResult(-1);
            HUD.this.finish();
        }
    }

    public static /* synthetic */ WindowInsetsCompat C(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsetsCompat.Type.systemBars());
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setStatusBarContrastEnforced(false);
            getWindow().setNavigationBarContrastEnforced(false);
        }
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        insetsController.setAppearanceLightStatusBars(x.l(this) == 1);
        insetsController.setAppearanceLightNavigationBars(x.l(this) == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(AlertDialog alertDialog, View view) {
        alertDialog.dismiss();
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(j jVar, DialogInterface dialogInterface, int i10) {
        if (jVar.f3979d.isChecked()) {
            x.a(this);
        }
    }

    private void M() {
        this.f46002e = new u(this);
        o oVar = new o(Looper.getMainLooper());
        this.f46001d = oVar;
        oVar.a(this);
        setRequestedOrientation(10);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        getOnBackPressedDispatcher().addCallback(new e(true));
    }

    private void N() {
        this.f46000c.f3867x.setText(l.z(this, x.u(this)));
        this.f46000c.f3866w.setText(l.z(this, x.u(this)));
        this.f46000c.f3862s.setText(String.valueOf(x.s(this)));
        this.f46000c.f3859p.setText(String.valueOf(x.s(this)));
        if (x.c(this) == 2) {
            this.f46000c.f3850g.setVisibility(8);
            this.f46000c.f3849f.setVisibility(0);
        } else {
            this.f46000c.f3850g.setVisibility(0);
            this.f46000c.f3849f.setVisibility(8);
        }
        this.f46000c.f3865v.setVisibility(x.A(this) ? 0 : 8);
        this.f46000c.f3848e.setVisibility(x.z(this) ? 0 : 8);
        this.f46000c.f3853j.setVisibility(x.B(this) ? 0 : 8);
        this.f46000c.f3845b.setOnClickListener(this);
        this.f46000c.getRoot().setOnClickListener(this);
        ViewCompat.setOnApplyWindowInsetsListener(this.f46000c.getRoot(), new OnApplyWindowInsetsListener() { // from class: s4.u
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return HUD.C(view, windowInsetsCompat);
            }
        });
    }

    private void O() {
        a5.l lVarC = a5.l.c(LayoutInflater.from(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(lVarC.getRoot());
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        lVarC.f3992e.setBackgroundTintList(ColorStateList.valueOf(((Integer) k.b(this).get(x.d(this))).intValue()));
        lVarC.f3992e.setOnClickListener(new View.OnClickListener() { // from class: s4.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99696b.K(alertDialogCreate, view);
            }
        });
        lVarC.f3990c.setOnClickListener(new View.OnClickListener() { // from class: s4.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreate.dismiss();
            }
        });
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    private void P() {
        final j jVarC = j.c(LayoutInflater.from(this));
        jVarC.f3979d.setChecked(true);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(jVarC.getRoot());
        builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() { // from class: s4.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f99708b.L(jVarC, dialogInterface, i10);
            }
        });
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        jVarC.f3977b.setOnClickListener(new View.OnClickListener() { // from class: s4.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreate.dismiss();
            }
        });
        alertDialogCreate.getButton(-1).setTextColor(((Integer) k.b(this).get(x.d(this))).intValue());
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    void I() {
        if (w4.e.d(this)) {
            bindService(new Intent(this, (Class<?>) LocationService.class), this.f46004g, 1);
        }
    }

    void J() {
        if (w4.e.d(this)) {
            unbindService(this.f46004g);
            this.f46003f = null;
        }
    }

    @Override // x4.o.a
    public void m() {
        this.f46000c.f3864u.setText(new SimpleDateFormat(DateFormat.is24HourFormat(this) ? "HH:mm" : "hh:mm", Locale.getDefault()).format(new Date()));
        if (this.f46003f == null || !this.f46002e.h()) {
            this.f46000c.f3854k.setImageResource(l.r(0));
            this.f46000c.f3857n.setText(TokenBuilder.TOKEN_DELIMITER);
            this.f46000c.f3858o.setText("–");
            this.f46000c.f3852i.setText("–");
            this.f46000c.f3860q.setVisibility(4);
            this.f46000c.f3863t.setVisibility(4);
            this.f46000c.f3858o.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryText));
            this.f46000c.f3857n.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryText));
        } else {
            w4.c cVarD = this.f46003f.d();
            String strK = cVarD.k(this);
            String strL = cVarD.l(this);
            boolean zK = cVarD.K(this);
            this.f46000c.f3854k.setImageResource(l.r(cVarD.z()));
            this.f46000c.f3852i.setText(strL);
            if (this.f46003f.f()) {
                this.f46000c.f3858o.setText("–");
                this.f46000c.f3857n.setText(TokenBuilder.TOKEN_DELIMITER);
                this.f46000c.f3860q.setVisibility(4);
                this.f46000c.f3863t.setVisibility(4);
                this.f46000c.f3858o.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryText));
                this.f46000c.f3857n.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryText));
            } else {
                this.f46000c.f3858o.setText(strK);
                this.f46000c.f3857n.setText(strK);
                int color = zK ? Color.parseColor("#FF454A") : ContextCompat.getColor(this, R.color.colorPrimaryText);
                this.f46000c.f3860q.setVisibility(zK ? 0 : 4);
                this.f46000c.f3863t.setVisibility(zK ? 0 : 4);
                this.f46000c.f3858o.setTextColor(color);
                this.f46000c.f3857n.setTextColor(color);
            }
        }
        this.f46001d.sendEmptyMessageDelayed(2, 100L);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.backView) {
            setResult(-1);
            finish();
            return;
        }
        if (this.f46003f != null) {
            if (this.f46002e.h()) {
                return;
            }
            O();
        } else {
            if (!this.f46002e.h()) {
                O();
                return;
            }
            Intent intent = new Intent(this, (Class<?>) LocationService.class);
            if (Build.VERSION.SDK_INT >= 26) {
                startForegroundService(intent);
            } else {
                startService(intent);
            }
            I();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        EdgeToEdge.enable(this);
        H();
        super.onCreate(bundle);
        a5.d dVarC = a5.d.c(LayoutInflater.from(this));
        this.f46000c = dVarC;
        setContentView(dVarC.getRoot());
        M();
        N();
        if (bundle == null && x.f0(this)) {
            P();
        }
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: s4.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f99689b.H();
            }
        }, 100L);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        H();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        I();
        this.f46001d.sendEmptyMessage(2);
        if (x.x(this)) {
            getWindow().addFlags(128);
        } else {
            getWindow().clearFlags(128);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.f46005h, new IntentFilter("STOP_SERVICE_BROADCAST_RECEIVER"), 4);
        } else {
            registerReceiver(this.f46005h, new IntentFilter("STOP_SERVICE_BROADCAST_RECEIVER"));
        }
        registerReceiver(this.f46006i, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        registerReceiver(this.f46007j, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        J();
        this.f46001d.removeMessages(2);
        getWindow().clearFlags(128);
        unregisterReceiver(this.f46005h);
        unregisterReceiver(this.f46006i);
        unregisterReceiver(this.f46007j);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            H();
        }
    }
}
