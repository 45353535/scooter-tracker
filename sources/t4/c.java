package t4;

import a5.b0;
import a5.c0;
import a5.d0;
import a5.e0;
import a5.f0;
import a5.g0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.PowerManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ktwapps.speedometer.R;
import java.util.ArrayList;
import java.util.List;
import x4.k;
import x4.l;
import x4.x;

/* JADX INFO: loaded from: classes10.dex */
public class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f104946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f104947j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f104949l = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f104948k = c();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f104950a;

        static {
            int[] iArr = new int[w4.g.values().length];
            f104950a = iArr;
            try {
                iArr[w4.g.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104950a[w4.g.UNITS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104950a[w4.g.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f104950a[w4.g.HUD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f104950a[w4.g.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f104950a[w4.g.ADS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f104950a[w4.g.SCREEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f104950a[w4.g.CLOCK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f104950a[w4.g.SAVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f104950a[w4.g.PAUSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f104950a[w4.g.VIBRATE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f104950a[w4.g.KEEP_ALERT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f104950a[w4.g.HUD_CLOCK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f104950a[w4.g.HUD_DISTANCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f104950a[w4.g.HUD_BATTERY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f104950a[w4.g.BATTERY_OPTIMIZATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f104950a[w4.g.COLOR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f104950a[w4.g.CUSTOMISE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f104950a[w4.g.THEME.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f104950a[w4.g.UNIT_SPEED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f104950a[w4.g.RESOLUTION_SPEED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f104950a[w4.g.UNIT_DISTANCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f104950a[w4.g.UNIT_ODOMETER.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f104950a[w4.g.SPEED_LIMIT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f104950a[w4.g.SOUND.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f104950a[w4.g.MORE_APP.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f104950a[w4.g.RATE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f104950a[w4.g.PRIVACY.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f104950a[w4.g.FEEDBACK.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f104950a[w4.g.VERSION.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    private class b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        b0 f104951m;

        b(b0 b0Var) {
            super(b0Var.getRoot());
            this.f104951m = b0Var;
            b0Var.getRoot().setOnClickListener(this);
        }

        public void b() {
            this.f104951m.f3812e.setText(R.string.battery_optimization);
            this.f104951m.f3809b.setText(R.string.battery_optimization_hint);
            this.f104951m.f3810c.setImageResource(R.drawable.ic_setting_battery_optimization);
            this.f104951m.f3811d.setImageResource(R.drawable.ic_setting_battery_optimization_on);
            this.f104951m.getRoot().setBackgroundResource(R.drawable.background_rounded_top_16dp);
            PowerManager powerManager = (PowerManager) c.this.f104947j.getSystemService("power");
            if (powerManager == null) {
                this.f104951m.f3811d.setImageResource(8);
            } else {
                this.f104951m.f3811d.setVisibility(powerManager.isIgnoringBatteryOptimizations(c.this.f104947j.getPackageName()) ? 0 : 8);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f104946i != null) {
                c.this.f104946i.g(view, getLayoutPosition());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4.c$c, reason: collision with other inner class name */
    class ViewOnClickListenerC1306c extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        c0 f104953m;

        ViewOnClickListenerC1306c(final c0 c0Var) {
            super(c0Var.getRoot());
            this.f104953m = c0Var;
            c0Var.getRoot().setOnClickListener(new View.OnClickListener() { // from class: t4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f104963b.c(c0Var, view);
                }
            });
            c0Var.f3840b.setOnClickListener(this);
            c0Var.f3841c.setOnClickListener(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(c0 c0Var, View view) {
            c0Var.f3841c.toggle();
            if (c.this.f104946i != null) {
                c.this.f104946i.g(view, getLayoutPosition());
            }
        }

        public void b(w4.g gVar) {
            this.f104953m.getRoot().setBackgroundResource(R.drawable.background_rounded_2dp);
            this.f104953m.f3840b.setVisibility(8);
            switch (a.f104950a[gVar.ordinal()]) {
                case 7:
                    this.f104953m.f3843e.setText(R.string.setting_screen_on);
                    this.f104953m.f3841c.setChecked(x.x(c.this.f104947j));
                    this.f104953m.f3842d.setImageResource(R.drawable.ic_setting_display);
                    this.f104953m.getRoot().setBackgroundResource(R.drawable.background_rounded_top_16dp);
                    break;
                case 8:
                    this.f104953m.f3843e.setText(R.string.show_clock);
                    this.f104953m.f3841c.setChecked(x.w(c.this.f104947j));
                    this.f104953m.f3842d.setImageResource(R.drawable.ic_setting_clock);
                    break;
                case 9:
                    this.f104953m.f3843e.setText(R.string.save_tracking);
                    this.f104953m.f3841c.setChecked(x.F(c.this.f104947j));
                    this.f104953m.f3842d.setImageResource(R.drawable.ic_setting_save);
                    break;
                case 10:
                    this.f104953m.f3843e.setText(R.string.auto_pause);
                    this.f104953m.f3841c.setChecked(x.D(c.this.f104947j));
                    this.f104953m.f3842d.setImageResource(R.drawable.ic_setting_auto_pause);
                    this.f104953m.f3840b.setVisibility(0);
                    break;
                case 11:
                    this.f104953m.f3843e.setText(R.string.setting_vibrate);
                    this.f104953m.f3841c.setChecked(x.G(c.this.f104947j));
                    this.f104953m.f3842d.setImageResource(R.drawable.ic_setting_vibrate);
                    break;
                case 12:
                    this.f104953m.f3843e.setText(R.string.keep_alert);
                    this.f104953m.f3841c.setChecked(x.C(c.this.f104947j));
                    this.f104953m.f3842d.setImageResource(R.drawable.ic_setting_repeat_alert);
                    this.f104953m.getRoot().setBackgroundResource(R.drawable.background_rounded_bottom_16dp);
                    break;
                case 13:
                    this.f104953m.f3843e.setText(R.string.clock);
                    this.f104953m.f3841c.setChecked(x.A(c.this.f104947j));
                    this.f104953m.f3842d.setImageResource(R.drawable.ic_setting_clock);
                    this.f104953m.getRoot().setBackgroundResource(R.drawable.background_rounded_top_16dp);
                    break;
                case 14:
                    this.f104953m.f3843e.setText(R.string.distance);
                    this.f104953m.f3841c.setChecked(x.B(c.this.f104947j));
                    this.f104953m.f3842d.setImageResource(R.drawable.ic_setting_distance_unit);
                    break;
                case 15:
                    this.f104953m.f3843e.setText(R.string.battery);
                    this.f104953m.f3841c.setChecked(x.z(c.this.f104947j));
                    this.f104953m.f3842d.setImageResource(R.drawable.ic_setting_battery);
                    this.f104953m.getRoot().setBackgroundResource(R.drawable.background_rounded_bottom_16dp);
                    break;
            }
            this.f104953m.f3841c.setButtonTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{((Integer) k.b(c.this.f104947j).get(x.d(c.this.f104947j))).intValue(), ContextCompat.getColor(c.this.f104947j, R.color.colorSecondaryText)}));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f104946i != null) {
                if (view.getId() == R.id.askImageView) {
                    c.this.f104946i.o(view, getLayoutPosition());
                } else {
                    c.this.f104946i.g(view, getLayoutPosition());
                }
            }
        }
    }

    private class d extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        d0 f104955m;

        public d(d0 d0Var) {
            super(d0Var.getRoot());
            this.f104955m = d0Var;
            d0Var.f3873f.setOnClickListener(this);
            d0Var.f3871d.setOnClickListener(this);
            d0Var.f3870c.setOnClickListener(this);
            d0Var.f3874g.setOnClickListener(this);
            d0Var.f3869b.setOnClickListener(this);
            d0Var.f3872e.setOnClickListener(this);
        }

        public void b() {
            this.f104955m.getRoot().setBackgroundResource(R.drawable.background_rounded_bottom_16dp);
            this.f104955m.f3873f.setChecked(false);
            this.f104955m.f3871d.setChecked(false);
            this.f104955m.f3870c.setChecked(false);
            this.f104955m.f3874g.setChecked(false);
            this.f104955m.f3869b.setChecked(false);
            this.f104955m.f3872e.setChecked(false);
            String strD = x.d(c.this.f104947j);
            strD.getClass();
            switch (strD) {
                case "ORANGE":
                    this.f104955m.f3871d.setChecked(true);
                    d0 d0Var = this.f104955m;
                    d0Var.f3876i.scrollTo(d0Var.f3871d.getRight(), 0);
                    break;
                case "PURPLE":
                    this.f104955m.f3872e.setChecked(true);
                    d0 d0Var2 = this.f104955m;
                    d0Var2.f3876i.scrollTo(d0Var2.f3872e.getRight(), 0);
                    break;
                case "RED":
                    this.f104955m.f3873f.setChecked(true);
                    d0 d0Var3 = this.f104955m;
                    d0Var3.f3876i.scrollTo(d0Var3.f3873f.getRight(), 0);
                    break;
                case "BLUE":
                    this.f104955m.f3869b.setChecked(true);
                    d0 d0Var4 = this.f104955m;
                    d0Var4.f3876i.scrollTo(d0Var4.f3869b.getRight(), 0);
                    break;
                case "TEAL":
                    this.f104955m.f3874g.setChecked(true);
                    d0 d0Var5 = this.f104955m;
                    d0Var5.f3876i.scrollTo(d0Var5.f3874g.getRight(), 0);
                    break;
                case "GREEN":
                    this.f104955m.f3870c.setChecked(true);
                    d0 d0Var6 = this.f104955m;
                    d0Var6.f3876i.scrollTo(d0Var6.f3870c.getRight(), 0);
                    break;
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f104946i != null) {
                switch (view.getId()) {
                    case R.id.colorBlueView /* 2131362178 */:
                        c.this.f104946i.j("BLUE");
                        break;
                    case R.id.colorGreenView /* 2131362179 */:
                        c.this.f104946i.j("GREEN");
                        break;
                    case R.id.colorOrangeView /* 2131362180 */:
                        c.this.f104946i.j("ORANGE");
                        break;
                    case R.id.colorPurpleView /* 2131362181 */:
                        c.this.f104946i.j("PURPLE");
                        break;
                    case R.id.colorRedView /* 2131362182 */:
                        c.this.f104946i.j("RED");
                        break;
                    case R.id.colorTealView /* 2131362183 */:
                        c.this.f104946i.j("TEAL");
                        break;
                }
            }
        }
    }

    private class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        e0 f104957m;

        e(e0 e0Var) {
            super(e0Var.getRoot());
            this.f104957m = e0Var;
        }

        public void a(w4.g gVar) {
            if (gVar == w4.g.GENERAL) {
                this.f104957m.f3933b.setText(R.string.general_capital);
                return;
            }
            if (gVar == w4.g.UNITS) {
                this.f104957m.f3933b.setText(c.this.f104947j.getResources().getString(R.string.unit).toUpperCase());
                return;
            }
            if (gVar == w4.g.WARNING) {
                this.f104957m.f3933b.setText(R.string.warning_capital);
            } else if (gVar == w4.g.HUD) {
                this.f104957m.f3933b.setText("HUD");
            } else {
                this.f104957m.f3933b.setText(R.string.other_capital);
            }
        }
    }

    private class f extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        f0 f104959m;

        f(f0 f0Var) {
            super(f0Var.getRoot());
            this.f104959m = f0Var;
            f0Var.getRoot().setOnClickListener(this);
        }

        public void a(w4.g gVar) {
            this.f104959m.getRoot().setBackgroundResource(R.drawable.background_rounded_2dp);
            switch (a.f104950a[gVar.ordinal()]) {
                case 18:
                    this.f104959m.f3941d.setText(R.string.setting_custom_floating);
                    this.f104959m.f3939b.setText("");
                    this.f104959m.f3939b.setVisibility(8);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_setting_customise);
                    break;
                case 19:
                    this.f104959m.f3941d.setText(R.string.theme);
                    this.f104959m.f3939b.setText(x.l(c.this.f104947j) == 0 ? R.string.dark : R.string.light);
                    this.f104959m.f3939b.setVisibility(0);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_theme);
                    break;
                case 20:
                    String strZ = l.z(c.this.f104947j, x.u(c.this.f104947j));
                    this.f104959m.f3941d.setText(R.string.setting_unit);
                    this.f104959m.f3939b.setText(strZ);
                    this.f104959m.f3939b.setVisibility(0);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_setting_unit);
                    this.f104959m.getRoot().setBackgroundResource(R.drawable.background_rounded_top_16dp);
                    break;
                case 21:
                    String strU = l.u(x.o(c.this.f104947j));
                    this.f104959m.f3941d.setText(R.string.setting_resolution);
                    this.f104959m.f3939b.setText(strU);
                    this.f104959m.f3939b.setVisibility(0);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_setting_resolution);
                    break;
                case 22:
                    String strF = l.f(c.this.f104947j, x.v(c.this.f104947j));
                    this.f104959m.f3941d.setText(R.string.setting_distance_unit);
                    this.f104959m.f3939b.setText(strF);
                    this.f104959m.f3939b.setVisibility(0);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_setting_distance_unit);
                    break;
                case 23:
                    String strT = l.t(c.this.f104947j, x.n(c.this.f104947j));
                    this.f104959m.f3941d.setText(R.string.odometer_unit);
                    this.f104959m.f3939b.setText(strT);
                    this.f104959m.f3939b.setVisibility(0);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_odometer);
                    this.f104959m.getRoot().setBackgroundResource(R.drawable.background_rounded_bottom_16dp);
                    break;
                case 24:
                    String strP = l.p(c.this.f104947j);
                    this.f104959m.f3941d.setText(R.string.setting_speed_limit);
                    this.f104959m.f3939b.setText(strP);
                    this.f104959m.f3939b.setVisibility(0);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_speed_limit);
                    this.f104959m.getRoot().setBackgroundResource(R.drawable.background_rounded_top_16dp);
                    break;
                case 25:
                    String strL = l.l(c.this.f104947j);
                    this.f104959m.f3941d.setText(R.string.setting_sound_effect);
                    this.f104959m.f3939b.setText(strL);
                    this.f104959m.f3939b.setVisibility(0);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_setting_alert);
                    break;
                case 26:
                    this.f104959m.f3941d.setText(R.string.setting_more_app);
                    this.f104959m.f3939b.setText("");
                    this.f104959m.f3939b.setVisibility(8);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_setting_app);
                    break;
                case 27:
                    this.f104959m.f3941d.setText(R.string.setting_rate_us);
                    this.f104959m.f3939b.setText("");
                    this.f104959m.f3939b.setVisibility(8);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_setting_rate);
                    break;
                case 28:
                    this.f104959m.f3941d.setText(R.string.setting_privacy);
                    this.f104959m.f3939b.setText("");
                    this.f104959m.f3939b.setVisibility(8);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_setting_privacy);
                    break;
                case 29:
                    this.f104959m.f3941d.setText(R.string.send_feedback);
                    this.f104959m.f3939b.setText("");
                    this.f104959m.f3939b.setVisibility(8);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_setting_email);
                    break;
                case 30:
                    this.f104959m.f3941d.setText(R.string.setting_version);
                    this.f104959m.f3939b.setText(R.string.version_info);
                    this.f104959m.f3939b.setVisibility(0);
                    this.f104959m.f3940c.setImageResource(R.drawable.ic_setting_version);
                    this.f104959m.getRoot().setBackgroundResource(R.drawable.background_rounded_bottom_16dp);
                    break;
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f104946i != null) {
                c.this.f104946i.g(view, getLayoutPosition());
            }
        }
    }

    public interface g {
        void f();

        void g(View view, int i10);

        void j(String str);

        void o(View view, int i10);
    }

    private class h extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        g0 f104961m;

        public h(g0 g0Var) {
            super(g0Var.getRoot());
            this.f104961m = g0Var;
            g0Var.f3960b.setOnClickListener(this);
        }

        public void a(String str) {
            if (x.E(c.this.f104947j) == 2) {
                this.f104961m.f3960b.setText(R.string.pending);
                this.f104961m.f3960b.setEnabled(false);
                return;
            }
            Button button = this.f104961m.f3960b;
            if (str.isEmpty()) {
                str = c.this.f104947j.getResources().getString(R.string.go_premium);
            }
            button.setText(str);
            this.f104961m.f3960b.setEnabled(true);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f104946i != null) {
                c.this.f104946i.f();
            }
        }
    }

    public c(Context context) {
        this.f104947j = context;
    }

    private List c() {
        int iE = x.E(this.f104947j);
        ArrayList arrayList = new ArrayList();
        if (iE != 1) {
            arrayList.add(w4.g.ADS);
        }
        arrayList.add(w4.g.GENERAL);
        arrayList.add(w4.g.SCREEN);
        arrayList.add(w4.g.CLOCK);
        arrayList.add(w4.g.SAVE);
        arrayList.add(w4.g.PAUSE);
        arrayList.add(w4.g.CUSTOMISE);
        arrayList.add(w4.g.THEME);
        arrayList.add(w4.g.COLOR);
        arrayList.add(w4.g.UNITS);
        arrayList.add(w4.g.UNIT_SPEED);
        arrayList.add(w4.g.RESOLUTION_SPEED);
        arrayList.add(w4.g.UNIT_DISTANCE);
        arrayList.add(w4.g.UNIT_ODOMETER);
        arrayList.add(w4.g.WARNING);
        arrayList.add(w4.g.SPEED_LIMIT);
        arrayList.add(w4.g.SOUND);
        arrayList.add(w4.g.VIBRATE);
        arrayList.add(w4.g.KEEP_ALERT);
        arrayList.add(w4.g.HUD);
        arrayList.add(w4.g.HUD_CLOCK);
        arrayList.add(w4.g.HUD_DISTANCE);
        arrayList.add(w4.g.HUD_BATTERY);
        arrayList.add(w4.g.OTHER);
        arrayList.add(w4.g.BATTERY_OPTIMIZATION);
        arrayList.add(w4.g.MORE_APP);
        arrayList.add(w4.g.RATE);
        arrayList.add(w4.g.PRIVACY);
        arrayList.add(w4.g.FEEDBACK);
        arrayList.add(w4.g.VERSION);
        return arrayList;
    }

    public List d() {
        return this.f104948k;
    }

    public void e() {
        this.f104948k = c();
    }

    public void f(g gVar) {
        this.f104946i = gVar;
    }

    public void g(String str) {
        this.f104949l = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f104948k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        switch (a.f104950a[((w4.g) this.f104948k.get(i10)).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 0;
            case 6:
                return 4;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 1;
            case 16:
                return 3;
            case 17:
                return 5;
            default:
                return 2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        int itemViewType = getItemViewType(i10);
        if (itemViewType == 0) {
            ((e) viewHolder).a((w4.g) this.f104948k.get(i10));
            return;
        }
        if (itemViewType == 1) {
            ((ViewOnClickListenerC1306c) viewHolder).b((w4.g) this.f104948k.get(i10));
            return;
        }
        if (itemViewType == 3) {
            ((b) viewHolder).b();
            return;
        }
        if (itemViewType == 2) {
            ((f) viewHolder).a((w4.g) this.f104948k.get(i10));
        } else if (itemViewType == 4) {
            ((h) viewHolder).a(this.f104949l);
        } else {
            ((d) viewHolder).b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return i10 == 0 ? new e(e0.c(LayoutInflater.from(this.f104947j), viewGroup, false)) : i10 == 1 ? new ViewOnClickListenerC1306c(c0.c(LayoutInflater.from(this.f104947j), viewGroup, false)) : i10 == 2 ? new f(f0.c(LayoutInflater.from(this.f104947j), viewGroup, false)) : i10 == 3 ? new b(b0.c(LayoutInflater.from(this.f104947j), viewGroup, false)) : i10 == 4 ? new h(g0.c(LayoutInflater.from(this.f104947j), viewGroup, false)) : new d(d0.c(LayoutInflater.from(this.f104947j), viewGroup, false));
    }
}
