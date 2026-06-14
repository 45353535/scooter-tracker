package com.ktwapps.speedometer;

import a5.a;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.util.Consumer;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.slider.Slider;
import com.ktwapps.speedometer.Widget.DigitalTextView;
import i3.c;
import j3.b;
import x4.k;
import x4.l;
import x4.m;
import x4.x;
import y4.d;

/* JADX INFO: loaded from: classes10.dex */
public class CustomMinimize extends AppCompatActivity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, Slider.OnChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a f45992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d f45993d;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(View view, DialogInterface dialogInterface, int i10, Integer[] numArr) {
        final String strA = m.a(i10);
        int id2 = view.getId();
        if (id2 == R.id.backgroundView) {
            x.M(getApplicationContext(), strA);
            this.f45993d.c(new Consumer() { // from class: s4.b
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((w4.d) obj).g(strA);
                }
            });
        } else if (id2 == R.id.normalTextView) {
            x.Q(getApplicationContext(), strA);
            this.f45993d.c(new Consumer() { // from class: s4.c
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((w4.d) obj).h(strA);
                }
            });
        } else {
            if (id2 != R.id.warningTextView) {
                return;
            }
            x.R(getApplicationContext(), strA);
            this.f45993d.c(new Consumer() { // from class: s4.d
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((w4.d) obj).m(strA);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(w4.d dVar) {
        dVar.j(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(DialogInterface dialogInterface, int i10) {
        x.I(getApplicationContext());
        this.f45993d.c(new Consumer() { // from class: s4.m
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f99670b.N((w4.d) obj);
            }
        });
        this.f45992c.C.setValue(x.h(getApplicationContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsetsCompat P(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        int i10 = insets.top;
        int i11 = insets.bottom;
        view.setPadding(insets.left, i10, insets.right, 0);
        this.f45992c.A.setPadding(0, 0, 0, k.a(this, 24.0f) + i11);
        this.f45992c.A.setClipToPadding(false);
        if (getResources().getConfiguration().orientation == 2) {
            int iA = k.a(this, 16.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f45992c.f3800y.getLayoutParams();
            marginLayoutParams.setMargins(iA, iA, iA, i11 + iA);
            this.f45992c.f3800y.setLayoutParams(marginLayoutParams);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(w4.d dVar) {
        if (dVar != null) {
            int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
            this.f45992c.G.setBackgroundTintList(ColorStateList.valueOf(dVar.e() == 0 ? iIntValue : ContextCompat.getColor(this, R.color.colorPrimaryBackground)));
            this.f45992c.J.setBackgroundTintList(ColorStateList.valueOf(dVar.e() == 1 ? iIntValue : ContextCompat.getColor(this, R.color.colorPrimaryBackground)));
            this.f45992c.f3785j.setBackgroundTintList(ColorStateList.valueOf(dVar.c() == 1 ? iIntValue : ContextCompat.getColor(this, R.color.colorSecondaryBackground)));
            ConstraintLayout constraintLayout = this.f45992c.f3786k;
            if (dVar.c() != 2) {
                iIntValue = ContextCompat.getColor(this, R.color.colorSecondaryBackground);
            }
            constraintLayout.setBackgroundTintList(ColorStateList.valueOf(iIntValue));
            this.f45992c.f3797v.setVisibility(dVar.c() == 1 ? 0 : 8);
            this.f45992c.f3795t.setVisibility(dVar.c() != 1 ? 0 : 8);
            this.f45992c.f3778c.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(dVar.a())));
            this.f45992c.f3790o.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(dVar.b())));
            this.f45992c.L.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(dVar.f())));
            int color = Color.parseColor(dVar.a());
            int color2 = Color.parseColor(dVar.b());
            int color3 = Color.parseColor(dVar.f());
            int iD = m.d(getApplicationContext(), dVar.d());
            int iE = m.e(this, dVar.d());
            int iC = m.c(this, dVar.d());
            int iB = m.b(this, dVar.d());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color);
            gradientDrawable.setCornerRadius(iD);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f45992c.f3801z.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).height = iE;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = iE;
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f45992c.f3793r.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = iC;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = iC;
            layoutParams2.setMargins(iB, iB, 0, 0);
            this.f45992c.f3801z.setLayoutParams(layoutParams);
            this.f45992c.f3801z.setBackground(gradientDrawable);
            this.f45992c.f3793r.setLayoutParams(layoutParams2);
            this.f45992c.f3796u.setTextSize(1, m.f(dVar.d()));
            this.f45992c.f3799x.setTextSize(1, m.g(dVar.d()));
            this.f45992c.f3794s.setTextSize(1, m.f(dVar.d()));
            this.f45992c.f3798w.setTextSize(1, m.g(dVar.d()));
            this.f45992c.f3793r.setColorFilter(color2, PorterDuff.Mode.SRC_IN);
            this.f45992c.f3796u.setTextColor(dVar.e() == 0 ? color2 : color3);
            DigitalTextView digitalTextView = this.f45992c.f3794s;
            if (dVar.e() == 0) {
                color3 = color2;
            }
            digitalTextView.setTextColor(color3);
            this.f45992c.f3799x.setTextColor(color2);
        }
    }

    private void R() {
        setSupportActionBar(this.f45992c.E);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.customisation);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        int alphaComponent = ColorUtils.setAlphaComponent(iIntValue, 63);
        int i10 = getResources().getBoolean(R.bool.isTablet) ? 30 : 20;
        int iH = x.h(this);
        this.f45992c.f3800y.setBackgroundTintList(ColorStateList.valueOf(iIntValue));
        this.f45992c.C.setValue(Math.min(i10, iH));
        this.f45992c.C.setValueTo(i10);
        this.f45992c.C.setTrackActiveTintList(ColorStateList.valueOf(iIntValue));
        this.f45992c.C.setTrackInactiveTintList(ColorStateList.valueOf(alphaComponent));
        this.f45992c.C.setThumbTintList(ColorStateList.valueOf(iIntValue));
        this.f45992c.C.setHaloTintList(ColorStateList.valueOf(alphaComponent));
        this.f45992c.f3799x.setText(l.z(getApplicationContext(), x.u(this)));
        this.f45992c.C.addOnChangeListener(this);
        this.f45992c.f3780e.setOnClickListener(this);
        this.f45992c.f3792q.setOnClickListener(this);
        this.f45992c.N.setOnClickListener(this);
        this.f45992c.G.setOnClickListener(this);
        this.f45992c.J.setOnClickListener(this);
        this.f45992c.f3785j.setOnClickListener(this);
        this.f45992c.f3786k.setOnClickListener(this);
        if (Build.VERSION.SDK_INT >= 35) {
            ViewCompat.setOnApplyWindowInsetsListener(this.f45992c.getRoot(), new OnApplyWindowInsetsListener() { // from class: s4.j
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return this.f99641b.P(view, windowInsetsCompat);
                }
            });
        }
    }

    private void S() {
        d dVar = (d) new ViewModelProvider(this).get(d.class);
        this.f45993d = dVar;
        dVar.b(new w4.d(this));
        this.f45993d.a().observe(this, new Observer() { // from class: s4.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f99663b.Q((w4.d) obj);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(final View view) {
        switch (view.getId()) {
            case R.id.fontPickerView1 /* 2131362418 */:
                x.N(this, 1);
                this.f45993d.c(new Consumer() { // from class: s4.f
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        ((w4.d) obj).i(1);
                    }
                });
                break;
            case R.id.fontPickerView2 /* 2131362419 */:
                x.N(this, 2);
                this.f45993d.c(new Consumer() { // from class: s4.g
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        ((w4.d) obj).i(2);
                    }
                });
                break;
            case R.id.typeNormalView /* 2131363587 */:
                this.f45993d.c(new Consumer() { // from class: s4.a
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        ((w4.d) obj).l(0);
                    }
                });
                break;
            case R.id.typeWarningView /* 2131363590 */:
                this.f45993d.c(new Consumer() { // from class: s4.e
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        ((w4.d) obj).l(1);
                    }
                });
                break;
            default:
                b bVarN = b.n(this);
                bVarN.k(R.string.dialog_color_title);
                int id2 = view.getId();
                bVarN.g(id2 != R.id.normalTextView ? id2 != R.id.warningTextView ? Color.parseColor(x.e(this)) : Color.parseColor(x.j(this)) : Color.parseColor(x.i(this)));
                bVarN.m(c.EnumC0917c.CIRCLE);
                bVarN.c(8);
                bVarN.l(false);
                bVarN.j(R.string.done, new j3.a() { // from class: s4.h
                    @Override // j3.a
                    public final void a(DialogInterface dialogInterface, int i10, Integer[] numArr) {
                        this.f99622a.M(view, dialogInterface, i10, numArr);
                    }
                });
                bVarN.i(R.string.cancel, null);
                AlertDialog alertDialogB = bVarN.b();
                int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
                alertDialogB.show();
                alertDialogB.getButton(-2).setTextColor(iIntValue);
                alertDialogB.getButton(-1).setTextColor(iIntValue);
                if (alertDialogB.getWindow() != null) {
                    alertDialogB.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
                }
                break;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVarC = a.c(LayoutInflater.from(this));
        this.f45992c = aVarC;
        setContentView(aVarC.getRoot());
        R();
        S();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_customise, menu);
        for (int i10 = 0; i10 < menu.size(); i10++) {
            Drawable icon = menu.getItem(i10).getIcon();
            if (icon != null) {
                icon.mutate();
                icon.setColorFilter(ContextCompat.getColor(this, R.color.colorPrimaryText), PorterDuff.Mode.SRC_ATOP);
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_reset) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.dialog_custom_reset_title);
        builder.setMessage(R.string.dialog_custom_reset_message);
        builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: s4.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f99651b.O(dialogInterface, i10);
            }
        });
        builder.setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        alertDialogCreate.getButton(-2).setTextColor(iIntValue);
        alertDialogCreate.getButton(-1).setTextColor(iIntValue);
        if (alertDialogCreate.getWindow() == null) {
            return true;
        }
        alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        return true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
    public void onValueChange(Slider slider, float f10, boolean z10) {
        if (z10) {
            final int i10 = (int) f10;
            x.P(this, i10);
            this.f45993d.c(new Consumer() { // from class: s4.i
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((w4.d) obj).k(i10);
                }
            });
        }
    }
}
