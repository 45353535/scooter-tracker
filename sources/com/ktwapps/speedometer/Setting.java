package com.ktwapps.speedometer;

import a5.f;
import a5.o;
import a5.r;
import a5.t;
import a5.u;
import a5.v;
import a5.w;
import android.animation.Animator;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.net.MailTo;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.billingclient.api.ProductDetails;
import com.ktwapps.speedometer.Setting;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.skydoves.balloon.Balloon;
import net.pubnative.lite.sdk.models.Protocol;
import t4.c;
import w4.g;
import x4.a0;
import x4.j;
import x4.k;
import x4.l;
import x4.x;

/* JADX INFO: loaded from: classes10.dex */
public class Setting extends AppCompatActivity implements c.g, j.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    f f46195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    j f46196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    t4.c f46197e;

    class a extends OnBackPressedCallback {
        a(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            Setting.this.setResult(-1);
            Setting.this.finish();
        }
    }

    class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Setting.this.f46195c.f3935b.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46200a;

        static {
            int[] iArr = new int[g.values().length];
            f46200a = iArr;
            try {
                iArr[g.SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46200a[g.CLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46200a[g.SAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46200a[g.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46200a[g.THEME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46200a[g.CUSTOMISE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46200a[g.UNIT_SPEED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46200a[g.RESOLUTION_SPEED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f46200a[g.UNIT_DISTANCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f46200a[g.UNIT_ODOMETER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f46200a[g.SPEED_LIMIT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f46200a[g.SOUND.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f46200a[g.VIBRATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f46200a[g.KEEP_ALERT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f46200a[g.HUD_CLOCK.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f46200a[g.HUD_DISTANCE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f46200a[g.HUD_BATTERY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f46200a[g.BATTERY_OPTIMIZATION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f46200a[g.MORE_APP.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f46200a[g.RATE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f46200a[g.PRIVACY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f46200a[g.FEEDBACK.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(AlertDialog alertDialog, View view) {
        O0(alertDialog, 70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(AlertDialog alertDialog, View view) {
        O0(alertDialog, 80);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(AlertDialog alertDialog, View view) {
        O0(alertDialog, 90);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(AlertDialog alertDialog, View view) {
        O0(alertDialog, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(AlertDialog alertDialog, View view) {
        O0(alertDialog, 110);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(AlertDialog alertDialog, View view) {
        O0(alertDialog, 120);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(AlertDialog alertDialog, View view) {
        alertDialog.dismiss();
        i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(AlertDialog alertDialog, View view) {
        O0(alertDialog, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(AlertDialog alertDialog, View view) {
        O0(alertDialog, 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(AlertDialog alertDialog, View view) {
        O0(alertDialog, 40);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(AlertDialog alertDialog, View view) {
        O0(alertDialog, 50);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(AlertDialog alertDialog, RadioGroup radioGroup, int i10) {
        switch (i10) {
            case R.id.radioButton1 /* 2131363308 */:
                x.e0(getApplicationContext(), 1);
                break;
            case R.id.radioButton2 /* 2131363309 */:
                x.e0(getApplicationContext(), 2);
                break;
            case R.id.radioButton3 /* 2131363310 */:
                x.e0(getApplicationContext(), 3);
                break;
            case R.id.radioButton4 /* 2131363311 */:
                x.e0(getApplicationContext(), 4);
                break;
            case R.id.radioButton5 /* 2131363312 */:
                x.e0(getApplicationContext(), 5);
                break;
        }
        this.f46197e.notifyDataSetChanged();
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(AlertDialog alertDialog, RadioGroup radioGroup, int i10) {
        switch (i10) {
            case R.id.radioButton1 /* 2131363308 */:
                x.W(getApplicationContext(), 2);
                break;
            case R.id.radioButton2 /* 2131363309 */:
                x.W(getApplicationContext(), 5);
                break;
        }
        this.f46197e.notifyDataSetChanged();
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(AlertDialog alertDialog, RadioGroup radioGroup, int i10) {
        switch (i10) {
            case R.id.radioButton1 /* 2131363308 */:
                x.d0(getApplicationContext(), 2);
                break;
            case R.id.radioButton2 /* 2131363309 */:
                x.d0(getApplicationContext(), 3);
                break;
            case R.id.radioButton3 /* 2131363310 */:
                x.d0(getApplicationContext(), 4);
                break;
            case R.id.radioButton4 /* 2131363311 */:
                x.d0(getApplicationContext(), 1);
                break;
        }
        this.f46197e.notifyDataSetChanged();
        alertDialog.dismiss();
    }

    private void O0(Dialog dialog, int i10) {
        dialog.dismiss();
        x.b0(getApplicationContext(), i10);
        this.f46197e.notifyDataSetChanged();
    }

    private void P0() {
        setSupportActionBar(this.f46195c.f3937d);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.setting);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        this.f46195c.f3936c.setLayoutManager(new LinearLayoutManager(this));
        this.f46195c.f3936c.setAdapter(this.f46197e);
        h0();
        if (Build.VERSION.SDK_INT >= 35) {
            ViewCompat.setOnApplyWindowInsetsListener(this.f46195c.getRoot(), new OnApplyWindowInsetsListener() { // from class: s4.f3
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return this.f99611b.u0(view, windowInsetsCompat);
                }
            });
        }
    }

    private void Q0() {
        this.f46195c.f3935b.setVisibility(0);
        this.f46195c.f3935b.q();
        this.f46195c.f3935b.g(new b());
    }

    private void R0() {
        v vVarC = v.c(getLayoutInflater());
        int iL = x.l(this);
        if (iL == 0) {
            vVarC.f4085c.setChecked(true);
        } else if (iL == 1) {
            vVarC.f4086d.setChecked(true);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(vVarC.getRoot());
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        vVarC.f4087e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: s4.n3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                this.f99680a.v0(alertDialogCreate, radioGroup, i10);
            }
        });
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{iIntValue, ContextCompat.getColor(this, R.color.colorSecondaryText)});
        vVarC.f4085c.setButtonTintList(colorStateList);
        vVarC.f4086d.setButtonTintList(colorStateList);
        alertDialogCreate.getButton(-2).setTextColor(iIntValue);
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    private void S0() {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/developer?id=KTW Apps")));
        } catch (ActivityNotFoundException unused) {
        }
    }

    private void T0() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://www.ktwapps.com/privacy.html"));
        startActivity(intent);
    }

    public static /* synthetic */ void U(a5.g gVar, View view) {
        String string = gVar.f3957p.getText().toString();
        if (string.isEmpty()) {
            return;
        }
        gVar.f3957p.setText(string.substring(0, string.length() - 1));
    }

    private void U0() {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
        } catch (ActivityNotFoundException unused) {
        }
    }

    private void V0() {
        r rVarC = r.c(getLayoutInflater());
        int iO = x.o(this);
        if (iO == 1) {
            rVarC.f4028c.setChecked(true);
        } else if (iO == 2) {
            rVarC.f4029d.setChecked(true);
        } else if (iO == 3) {
            rVarC.f4030e.setChecked(true);
        } else if (iO == 4) {
            rVarC.f4031f.setChecked(true);
        } else if (iO == 5) {
            rVarC.f4032g.setChecked(true);
        } else if (iO == 6) {
            rVarC.f4033h.setChecked(true);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(rVarC.getRoot());
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        rVarC.f4034i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: s4.p3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                this.f99694a.w0(alertDialogCreate, radioGroup, i10);
            }
        });
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{iIntValue, ContextCompat.getColor(this, R.color.colorSecondaryText)});
        rVarC.f4028c.setButtonTintList(colorStateList);
        rVarC.f4029d.setButtonTintList(colorStateList);
        rVarC.f4030e.setButtonTintList(colorStateList);
        rVarC.f4031f.setButtonTintList(colorStateList);
        rVarC.f4032g.setButtonTintList(colorStateList);
        rVarC.f4033h.setButtonTintList(colorStateList);
        alertDialogCreate.getButton(-2).setTextColor(iIntValue);
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    private void X0() {
        int i10;
        int color;
        u uVarC = u.c(getLayoutInflater());
        String str = x.s(getApplicationContext()) + "";
        String strZ = l.z(this, x.u(this));
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        uVarC.f4082r.setText(strZ);
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
        uVarC.f4072h.setBackgroundTintList(ColorStateList.valueOf(str.equals("0") ? iIntValue : ContextCompat.getColor(this, R.color.colorDialogButtonBackground)));
        Button button = uVarC.f4077m;
        if (str.equals("30")) {
            color = iIntValue;
            i10 = R.color.colorDialogButtonBackground;
        } else {
            i10 = R.color.colorDialogButtonBackground;
            color = ContextCompat.getColor(this, R.color.colorDialogButtonBackground);
        }
        button.setBackgroundTintList(ColorStateList.valueOf(color));
        uVarC.f4076l.setBackgroundTintList(ColorStateList.valueOf(str.equals("40") ? iIntValue : ContextCompat.getColor(this, i10)));
        uVarC.f4070f.setBackgroundTintList(ColorStateList.valueOf(str.equals("50") ? iIntValue : ContextCompat.getColor(this, i10)));
        uVarC.f4069e.setBackgroundTintList(ColorStateList.valueOf(str.equals("60") ? iIntValue : ContextCompat.getColor(this, i10)));
        uVarC.f4074j.setBackgroundTintList(ColorStateList.valueOf(str.equals("70") ? iIntValue : ContextCompat.getColor(this, i10)));
        uVarC.f4073i.setBackgroundTintList(ColorStateList.valueOf(str.equals("80") ? iIntValue : ContextCompat.getColor(this, i10)));
        uVarC.f4067c.setBackgroundTintList(ColorStateList.valueOf(str.equals("90") ? iIntValue : ContextCompat.getColor(this, i10)));
        uVarC.f4071g.setBackgroundTintList(ColorStateList.valueOf(str.equals("100") ? iIntValue : ContextCompat.getColor(this, i10)));
        uVarC.f4075k.setBackgroundTintList(ColorStateList.valueOf(str.equals("110") ? iIntValue : ContextCompat.getColor(this, i10)));
        uVarC.f4068d.setBackgroundTintList(ColorStateList.valueOf(str.equals("120") ? iIntValue : ContextCompat.getColor(this, i10)));
        uVarC.f4080p.setVisibility(str.equals("0") ? 8 : 0);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(uVarC.getRoot());
        builder.setPositiveButton(R.string.done, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-1).setTextColor(iIntValue);
        alertDialogCreate.getButton(-2).setTextColor(iIntValue);
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
        uVarC.f4072h.setOnClickListener(new View.OnClickListener() { // from class: s4.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99612b.H0(alertDialogCreate, view);
            }
        });
        uVarC.f4077m.setOnClickListener(new View.OnClickListener() { // from class: s4.i4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99639b.I0(alertDialogCreate, view);
            }
        });
        uVarC.f4076l.setOnClickListener(new View.OnClickListener() { // from class: s4.j4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99649b.J0(alertDialogCreate, view);
            }
        });
        uVarC.f4070f.setOnClickListener(new View.OnClickListener() { // from class: s4.k4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99661b.K0(alertDialogCreate, view);
            }
        });
        uVarC.f4069e.setOnClickListener(new View.OnClickListener() { // from class: s4.l4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99668b.z0(alertDialogCreate, view);
            }
        });
        uVarC.f4074j.setOnClickListener(new View.OnClickListener() { // from class: s4.g3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99618b.A0(alertDialogCreate, view);
            }
        });
        uVarC.f4073i.setOnClickListener(new View.OnClickListener() { // from class: s4.h3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99628b.B0(alertDialogCreate, view);
            }
        });
        uVarC.f4067c.setOnClickListener(new View.OnClickListener() { // from class: s4.i3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99637b.C0(alertDialogCreate, view);
            }
        });
        uVarC.f4071g.setOnClickListener(new View.OnClickListener() { // from class: s4.j3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99647b.D0(alertDialogCreate, view);
            }
        });
        uVarC.f4075k.setOnClickListener(new View.OnClickListener() { // from class: s4.k3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99659b.E0(alertDialogCreate, view);
            }
        });
        uVarC.f4068d.setOnClickListener(new View.OnClickListener() { // from class: s4.g4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99620b.F0(alertDialogCreate, view);
            }
        });
        uVarC.f4066b.setOnClickListener(new View.OnClickListener() { // from class: s4.h4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99630b.G0(alertDialogCreate, view);
            }
        });
    }

    private void Y0() {
        w wVarC = w.c(getLayoutInflater());
        int iV = x.v(this);
        if (iV == 1) {
            wVarC.f4092c.setChecked(true);
        } else if (iV == 2) {
            wVarC.f4093d.setChecked(true);
        } else if (iV == 3) {
            wVarC.f4094e.setChecked(true);
        } else if (iV == 4) {
            wVarC.f4095f.setChecked(true);
        } else if (iV == 5) {
            wVarC.f4096g.setChecked(true);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(wVarC.getRoot());
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        wVarC.f4097h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: s4.b4
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                this.f99574a.L0(alertDialogCreate, radioGroup, i10);
            }
        });
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{iIntValue, ContextCompat.getColor(this, R.color.colorSecondaryText)});
        wVarC.f4092c.setButtonTintList(colorStateList);
        wVarC.f4093d.setButtonTintList(colorStateList);
        wVarC.f4094e.setButtonTintList(colorStateList);
        wVarC.f4095f.setButtonTintList(colorStateList);
        wVarC.f4096g.setButtonTintList(colorStateList);
        alertDialogCreate.getButton(-2).setTextColor(iIntValue);
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    private void Z0() {
        o oVarC = o.c(getLayoutInflater());
        int iN = x.n(this);
        if (iN == 2) {
            oVarC.f4007c.setChecked(true);
        } else if (iN == 5) {
            oVarC.f4008d.setChecked(true);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(oVarC.getRoot());
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        oVarC.f4009e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: s4.o3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                this.f99687a.M0(alertDialogCreate, radioGroup, i10);
            }
        });
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{iIntValue, ContextCompat.getColor(this, R.color.colorSecondaryText)});
        oVarC.f4007c.setButtonTintList(colorStateList);
        oVarC.f4008d.setButtonTintList(colorStateList);
        alertDialogCreate.getButton(-2).setTextColor(iIntValue);
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    private void a1() {
        a5.x xVarC = a5.x.c(getLayoutInflater());
        int iU = x.u(this);
        if (iU == 2) {
            xVarC.f4102c.setChecked(true);
        } else if (iU == 3) {
            xVarC.f4103d.setChecked(true);
        } else if (iU == 4) {
            xVarC.f4104e.setChecked(true);
        } else {
            xVarC.f4105f.setChecked(true);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(xVarC.getRoot());
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        xVarC.f4106g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: s4.q3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                this.f99701a.N0(alertDialogCreate, radioGroup, i10);
            }
        });
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{iIntValue, ContextCompat.getColor(this, R.color.colorSecondaryText)});
        xVarC.f4102c.setButtonTintList(colorStateList);
        xVarC.f4103d.setButtonTintList(colorStateList);
        xVarC.f4104e.setButtonTintList(colorStateList);
        xVarC.f4105f.setButtonTintList(colorStateList);
        alertDialogCreate.getButton(-2).setTextColor(iIntValue);
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    private void g0(TextView textView, String str) {
        String string = textView.getText().toString();
        if (string.length() < 3) {
            if (string.equals("0") || string.isEmpty()) {
                textView.setText(str);
                return;
            }
            textView.setText(string + str);
        }
    }

    private void h0() {
        this.f46197e.e();
        this.f46197e.notifyDataSetChanged();
    }

    private void i0() {
        final a5.g gVarC = a5.g.c(getLayoutInflater());
        gVarC.f3957p.setText("");
        gVarC.f3943b.setOnClickListener(new View.OnClickListener() { // from class: s4.r3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gVarC.f3957p.setText("");
            }
        });
        gVarC.f3949h.setOnClickListener(new View.OnClickListener() { // from class: s4.v3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99731b.j0(gVarC, view);
            }
        });
        gVarC.f3953l.setOnClickListener(new View.OnClickListener() { // from class: s4.w3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99739b.k0(gVarC, view);
            }
        });
        gVarC.f3952k.setOnClickListener(new View.OnClickListener() { // from class: s4.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99748b.l0(gVarC, view);
            }
        });
        gVarC.f3947f.setOnClickListener(new View.OnClickListener() { // from class: s4.y3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99757b.m0(gVarC, view);
            }
        });
        gVarC.f3946e.setOnClickListener(new View.OnClickListener() { // from class: s4.z3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99767b.n0(gVarC, view);
            }
        });
        gVarC.f3951j.setOnClickListener(new View.OnClickListener() { // from class: s4.a4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99563b.o0(gVarC, view);
            }
        });
        gVarC.f3950i.setOnClickListener(new View.OnClickListener() { // from class: s4.c4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99584b.p0(gVarC, view);
            }
        });
        gVarC.f3944c.setOnClickListener(new View.OnClickListener() { // from class: s4.d4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99595b.q0(gVarC, view);
            }
        });
        gVarC.f3948g.setOnClickListener(new View.OnClickListener() { // from class: s4.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99603b.r0(gVarC, view);
            }
        });
        gVarC.f3954m.setOnClickListener(new View.OnClickListener() { // from class: s4.s3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99714b.s0(gVarC, view);
            }
        });
        gVarC.f3945d.setOnClickListener(new View.OnClickListener() { // from class: s4.t3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Setting.U(gVarC, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(gVarC.getRoot());
        builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() { // from class: s4.u3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f99723b.t0(gVarC, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        alertDialogCreate.getButton(-1).setTextColor(iIntValue);
        alertDialogCreate.getButton(-2).setTextColor(iIntValue);
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(a5.g gVar, View view) {
        g0(gVar.f3957p, "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(a5.g gVar, View view) {
        g0(gVar.f3957p, "2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(a5.g gVar, View view) {
        g0(gVar.f3957p, "3");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(a5.g gVar, View view) {
        g0(gVar.f3957p, Protocol.VAST_1_0_WRAPPER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(a5.g gVar, View view) {
        g0(gVar.f3957p, "5");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(a5.g gVar, View view) {
        g0(gVar.f3957p, "6");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(a5.g gVar, View view) {
        g0(gVar.f3957p, "7");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(a5.g gVar, View view) {
        g0(gVar.f3957p, "8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(a5.g gVar, View view) {
        g0(gVar.f3957p, "9");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(a5.g gVar, View view) {
        g0(gVar.f3957p, "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(a5.g gVar, DialogInterface dialogInterface, int i10) {
        int i11;
        try {
            i11 = Integer.parseInt(gVar.f3957p.getText().toString().trim());
        } catch (NumberFormatException unused) {
            i11 = 0;
        }
        x.b0(getApplicationContext(), i11);
        this.f46197e.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsetsCompat u0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        int i10 = insets.top;
        int i11 = insets.bottom;
        view.setPadding(insets.left, i10, insets.right, 0);
        this.f46195c.f3936c.setPadding(0, 0, 0, i11 + k.a(this, 24.0f));
        this.f46195c.f3936c.setClipToPadding(false);
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(AlertDialog alertDialog, RadioGroup radioGroup, int i10) {
        switch (i10) {
            case R.id.radioButton1 /* 2131363308 */:
                x.T(getApplicationContext(), 0);
                break;
            case R.id.radioButton2 /* 2131363309 */:
                x.T(getApplicationContext(), 1);
                break;
        }
        this.f46197e.notifyDataSetChanged();
        alertDialog.dismiss();
        AppCompatDelegate.setDefaultNightMode(x.l(this) == 0 ? 2 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(AlertDialog alertDialog, RadioGroup radioGroup, int i10) {
        switch (i10) {
            case R.id.resolutionButton1 /* 2131363328 */:
                x.Y(getApplicationContext(), 1);
                break;
            case R.id.resolutionButton2 /* 2131363329 */:
                x.Y(getApplicationContext(), 2);
                break;
            case R.id.resolutionButton3 /* 2131363330 */:
                x.Y(getApplicationContext(), 3);
                break;
            case R.id.resolutionButton4 /* 2131363331 */:
                x.Y(getApplicationContext(), 4);
                break;
            case R.id.resolutionButton5 /* 2131363332 */:
                x.Y(getApplicationContext(), 5);
                break;
            case R.id.resolutionButton6 /* 2131363333 */:
                x.Y(getApplicationContext(), 6);
                break;
        }
        this.f46197e.notifyDataSetChanged();
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(t tVar, DialogInterface dialogInterface, int i10) {
        switch (tVar.f4063i.getCheckedRadioButtonId()) {
            case R.id.radioButton1 /* 2131363308 */:
                x.Z(getApplicationContext(), 0);
                break;
            case R.id.radioButton2 /* 2131363309 */:
                x.Z(getApplicationContext(), 1);
                break;
            case R.id.radioButton3 /* 2131363310 */:
                x.Z(getApplicationContext(), 2);
                break;
            case R.id.radioButton4 /* 2131363311 */:
                x.Z(getApplicationContext(), 3);
                break;
            case R.id.radioButton5 /* 2131363312 */:
                x.Z(getApplicationContext(), 4);
                break;
            case R.id.radioButton6 /* 2131363313 */:
                x.Z(getApplicationContext(), 5);
                break;
        }
        this.f46197e.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(RadioGroup radioGroup, int i10) {
        switch (i10) {
            case R.id.radioButton2 /* 2131363309 */:
                a0.a(this).b(0);
                break;
            case R.id.radioButton3 /* 2131363310 */:
                a0.a(this).b(1);
                break;
            case R.id.radioButton4 /* 2131363311 */:
                a0.a(this).b(2);
                break;
            case R.id.radioButton5 /* 2131363312 */:
                a0.a(this).b(3);
                break;
            case R.id.radioButton6 /* 2131363313 */:
                a0.a(this).b(4);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(AlertDialog alertDialog, View view) {
        O0(alertDialog, 60);
    }

    public void W0() {
        final t tVarC = t.c(getLayoutInflater());
        int iP = x.p(this);
        if (iP == 0) {
            tVarC.f4057c.setChecked(true);
        } else if (iP == 1) {
            tVarC.f4058d.setChecked(true);
        } else if (iP == 2) {
            tVarC.f4059e.setChecked(true);
        } else if (iP == 3) {
            tVarC.f4060f.setChecked(true);
        } else if (iP == 4) {
            tVarC.f4061g.setChecked(true);
        } else if (iP == 5) {
            tVarC.f4062h.setChecked(true);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(tVarC.getRoot());
        builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() { // from class: s4.l3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f99666b.x0(tVarC, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogShow = builder.show();
        tVarC.f4063i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: s4.m3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                this.f99675a.y0(radioGroup, i10);
            }
        });
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{iIntValue, ContextCompat.getColor(this, R.color.colorSecondaryText)});
        tVarC.f4057c.setButtonTintList(colorStateList);
        tVarC.f4058d.setButtonTintList(colorStateList);
        tVarC.f4059e.setButtonTintList(colorStateList);
        tVarC.f4060f.setButtonTintList(colorStateList);
        tVarC.f4061g.setButtonTintList(colorStateList);
        tVarC.f4062h.setButtonTintList(colorStateList);
        alertDialogShow.getButton(-1).setTextColor(iIntValue);
        alertDialogShow.getButton(-2).setTextColor(iIntValue);
        if (alertDialogShow.getWindow() != null) {
            alertDialogShow.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    @Override // x4.j.b
    public void a(ProductDetails productDetails) {
        if (productDetails.getOneTimePurchaseOfferDetails() != null) {
            this.f46197e.g(productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice());
            this.f46197e.notifyDataSetChanged();
        }
    }

    @Override // x4.j.b
    public void d() {
        h0();
    }

    @Override // t4.c.g
    public void f() {
        try {
            this.f46196d.s(this);
        } catch (Exception unused) {
        }
    }

    @Override // t4.c.g
    public void g(View view, int i10) {
        try {
            switch (c.f46200a[((g) this.f46197e.d().get(i10)).ordinal()]) {
                case 1:
                    x.h0(this);
                    break;
                case 2:
                    x.g0(this);
                    break;
                case 3:
                    x.n0(this);
                    break;
                case 4:
                    x.m0(this);
                    break;
                case 5:
                    R0();
                    break;
                case 6:
                    startActivity(new Intent(getApplicationContext(), (Class<?>) CustomMinimize.class));
                    break;
                case 7:
                    a1();
                    break;
                case 8:
                    V0();
                    break;
                case 9:
                    Y0();
                    break;
                case 10:
                    Z0();
                    break;
                case 11:
                    X0();
                    break;
                case 12:
                    W0();
                    break;
                case 13:
                    x.o0(this);
                    break;
                case 14:
                    x.l0(this);
                    break;
                case 15:
                    x.j0(this);
                    break;
                case 16:
                    x.k0(this);
                    break;
                case 17:
                    x.i0(this);
                    break;
                case 18:
                    if (!((PowerManager) getSystemService("power")).isIgnoringBatteryOptimizations(getPackageName())) {
                        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                        intent.setData(Uri.parse("package:" + getPackageName()));
                        startActivity(intent);
                    }
                    break;
                case 19:
                    S0();
                    break;
                case 20:
                    U0();
                    break;
                case 21:
                    T0();
                    break;
                case 22:
                    Intent intent2 = new Intent("android.intent.action.SENDTO");
                    intent2.setData(Uri.parse(MailTo.MAILTO_SCHEME));
                    intent2.putExtra("android.intent.extra.EMAIL", new String[]{"support@ktwapps.com"});
                    intent2.putExtra("android.intent.extra.SUBJECT", getResources().getString(R.string.app_name));
                    startActivity(Intent.createChooser(intent2, getResources().getString(R.string.send_feedback)));
                    break;
            }
        } catch (Exception unused) {
        }
    }

    @Override // x4.j.b
    public void h() {
        h0();
    }

    @Override // t4.c.g
    public void j(String str) {
        x.L(this, str);
        this.f46197e.notifyDataSetChanged();
    }

    @Override // x4.j.b
    public void l() {
        Q0();
    }

    @Override // t4.c.g
    public void o(View view, int i10) {
        if (((g) this.f46197e.d().get(i10)) == g.PAUSE) {
            new Balloon.a(this).j1(getResources().getString(R.string.auto_pause_hint)).e1(8).Z0(8).l1(14.0f).V0(Color.parseColor(x.l(this) == 0 ? "#FFFFFF" : POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR)).k1(Color.parseColor(x.l(this) == 0 ? "#202020" : "#E0E0E0")).U0(q5.b.ALIGN_ANCHOR).W0(q5.k.FADE).a().z0(view);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46195c = f.c(getLayoutInflater());
        this.f46197e = new t4.c(this);
        j jVar = new j(this);
        this.f46196d = jVar;
        jVar.v(this);
        this.f46197e.f(this);
        setContentView(this.f46195c.getRoot());
        P0();
        this.f46196d.w();
        getOnBackPressedDispatcher().addCallback(new a(true));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        j jVar = this.f46196d;
        if (jVar != null) {
            jVar.u();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        setResult(-1);
        finish();
        return true;
    }
}
