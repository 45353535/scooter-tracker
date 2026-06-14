package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class BadgeState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final State f25435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final State f25436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f25437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f25438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float f25439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f25440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f25441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f25442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f25443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f25444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f25445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f25446l;

    BadgeState(Context context, int i10, int i11, int i12, State state) {
        State state2 = new State();
        this.f25436b = state2;
        state = state == null ? new State() : state;
        if (i10 != 0) {
            state.f25447b = i10;
        }
        TypedArray typedArrayC = c(context, state.f25447b, i11, i12);
        Resources resources = context.getResources();
        this.f25437c = typedArrayC.getDimensionPixelSize(R.styleable.Badge_badgeRadius, -1);
        this.f25443i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f25444j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f25438d = typedArrayC.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, -1);
        int i13 = R.styleable.Badge_badgeWidth;
        int i14 = R.dimen.m3_badge_size;
        this.f25439e = typedArrayC.getDimension(i13, resources.getDimension(i14));
        int i15 = R.styleable.Badge_badgeWithTextWidth;
        int i16 = R.dimen.m3_badge_with_text_size;
        this.f25441g = typedArrayC.getDimension(i15, resources.getDimension(i16));
        this.f25440f = typedArrayC.getDimension(R.styleable.Badge_badgeHeight, resources.getDimension(i14));
        this.f25442h = typedArrayC.getDimension(R.styleable.Badge_badgeWithTextHeight, resources.getDimension(i16));
        boolean z10 = true;
        this.f25445k = typedArrayC.getInt(R.styleable.Badge_offsetAlignmentMode, 1);
        this.f25446l = typedArrayC.getInt(R.styleable.Badge_badgeFixedEdge, 0);
        state2.f25455j = state.f25455j == -2 ? 255 : state.f25455j;
        if (state.f25457l != -2) {
            state2.f25457l = state.f25457l;
        } else {
            int i17 = R.styleable.Badge_number;
            if (typedArrayC.hasValue(i17)) {
                state2.f25457l = typedArrayC.getInt(i17, 0);
            } else {
                state2.f25457l = -1;
            }
        }
        if (state.f25456k != null) {
            state2.f25456k = state.f25456k;
        } else {
            int i18 = R.styleable.Badge_badgeText;
            if (typedArrayC.hasValue(i18)) {
                state2.f25456k = typedArrayC.getString(i18);
            }
        }
        state2.f25461p = state.f25461p;
        state2.f25462q = state.f25462q == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : state.f25462q;
        state2.f25463r = state.f25463r == 0 ? R.plurals.mtrl_badge_content_description : state.f25463r;
        state2.f25464s = state.f25464s == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : state.f25464s;
        if (state.f25466u != null && !state.f25466u.booleanValue()) {
            z10 = false;
        }
        state2.f25466u = Boolean.valueOf(z10);
        state2.f25458m = state.f25458m == -2 ? typedArrayC.getInt(R.styleable.Badge_maxCharacterCount, -2) : state.f25458m;
        state2.f25459n = state.f25459n == -2 ? typedArrayC.getInt(R.styleable.Badge_maxNumber, -2) : state.f25459n;
        state2.f25451f = Integer.valueOf(state.f25451f == null ? typedArrayC.getResourceId(R.styleable.Badge_badgeShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.f25451f.intValue());
        state2.f25452g = Integer.valueOf(state.f25452g == null ? typedArrayC.getResourceId(R.styleable.Badge_badgeShapeAppearanceOverlay, 0) : state.f25452g.intValue());
        state2.f25453h = Integer.valueOf(state.f25453h == null ? typedArrayC.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.f25453h.intValue());
        state2.f25454i = Integer.valueOf(state.f25454i == null ? typedArrayC.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0) : state.f25454i.intValue());
        state2.f25448c = Integer.valueOf(state.f25448c == null ? J(context, typedArrayC, R.styleable.Badge_backgroundColor) : state.f25448c.intValue());
        state2.f25450e = Integer.valueOf(state.f25450e == null ? typedArrayC.getResourceId(R.styleable.Badge_badgeTextAppearance, R.style.TextAppearance_MaterialComponents_Badge) : state.f25450e.intValue());
        if (state.f25449d != null) {
            state2.f25449d = state.f25449d;
        } else {
            int i19 = R.styleable.Badge_badgeTextColor;
            if (typedArrayC.hasValue(i19)) {
                state2.f25449d = Integer.valueOf(J(context, typedArrayC, i19));
            } else {
                state2.f25449d = Integer.valueOf(new TextAppearance(context, state2.f25450e.intValue()).getTextColor().getDefaultColor());
            }
        }
        state2.f25465t = Integer.valueOf(state.f25465t == null ? typedArrayC.getInt(R.styleable.Badge_badgeGravity, 8388661) : state.f25465t.intValue());
        state2.f25467v = Integer.valueOf(state.f25467v == null ? typedArrayC.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : state.f25467v.intValue());
        state2.f25468w = Integer.valueOf(state.f25468w == null ? typedArrayC.getDimensionPixelSize(R.styleable.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : state.f25468w.intValue());
        state2.f25469x = Integer.valueOf(state.f25469x == null ? typedArrayC.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0) : state.f25469x.intValue());
        state2.f25470y = Integer.valueOf(state.f25470y == null ? typedArrayC.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0) : state.f25470y.intValue());
        state2.f25471z = Integer.valueOf(state.f25471z == null ? typedArrayC.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, state2.f25469x.intValue()) : state.f25471z.intValue());
        state2.A = Integer.valueOf(state.A == null ? typedArrayC.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, state2.f25470y.intValue()) : state.A.intValue());
        state2.D = Integer.valueOf(state.D == null ? typedArrayC.getDimensionPixelOffset(R.styleable.Badge_largeFontVerticalOffsetAdjustment, 0) : state.D.intValue());
        state2.B = Integer.valueOf(state.B == null ? 0 : state.B.intValue());
        state2.C = Integer.valueOf(state.C == null ? 0 : state.C.intValue());
        state2.E = Boolean.valueOf(state.E == null ? typedArrayC.getBoolean(R.styleable.Badge_autoAdjustToWithinGrandparentBounds, false) : state.E.booleanValue());
        typedArrayC.recycle();
        if (state.f25460o == null) {
            state2.f25460o = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            state2.f25460o = state.f25460o;
        }
        this.f25435a = state;
    }

    private static int J(Context context, TypedArray typedArray, int i10) {
        return MaterialResources.getColorStateList(context, typedArray, i10).getDefaultColor();
    }

    private TypedArray c(Context context, int i10, int i11, int i12) {
        AttributeSet drawableXml;
        int styleAttribute;
        if (i10 != 0) {
            drawableXml = DrawableUtils.parseDrawableXml(context, i10, "badge");
            styleAttribute = drawableXml.getStyleAttribute();
        } else {
            drawableXml = null;
            styleAttribute = 0;
        }
        return ThemeEnforcement.obtainStyledAttributes(context, drawableXml, R.styleable.Badge, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    State A() {
        return this.f25435a;
    }

    String B() {
        return this.f25436b.f25456k;
    }

    int C() {
        return this.f25436b.f25450e.intValue();
    }

    int D() {
        return this.f25436b.A.intValue();
    }

    int E() {
        return this.f25436b.f25470y.intValue();
    }

    boolean F() {
        return this.f25436b.f25457l != -1;
    }

    boolean G() {
        return this.f25436b.f25456k != null;
    }

    boolean H() {
        return this.f25436b.E.booleanValue();
    }

    boolean I() {
        return this.f25436b.f25466u.booleanValue();
    }

    void K(int i10) {
        this.f25435a.B = Integer.valueOf(i10);
        this.f25436b.B = Integer.valueOf(i10);
    }

    void L(int i10) {
        this.f25435a.C = Integer.valueOf(i10);
        this.f25436b.C = Integer.valueOf(i10);
    }

    void M(int i10) {
        this.f25435a.f25455j = i10;
        this.f25436b.f25455j = i10;
    }

    void N(boolean z10) {
        this.f25435a.E = Boolean.valueOf(z10);
        this.f25436b.E = Boolean.valueOf(z10);
    }

    void O(int i10) {
        this.f25435a.f25448c = Integer.valueOf(i10);
        this.f25436b.f25448c = Integer.valueOf(i10);
    }

    void P(int i10) {
        this.f25435a.f25465t = Integer.valueOf(i10);
        this.f25436b.f25465t = Integer.valueOf(i10);
    }

    void Q(int i10) {
        this.f25435a.f25467v = Integer.valueOf(i10);
        this.f25436b.f25467v = Integer.valueOf(i10);
    }

    void R(int i10) {
        this.f25435a.f25452g = Integer.valueOf(i10);
        this.f25436b.f25452g = Integer.valueOf(i10);
    }

    void S(int i10) {
        this.f25435a.f25451f = Integer.valueOf(i10);
        this.f25436b.f25451f = Integer.valueOf(i10);
    }

    void T(int i10) {
        this.f25435a.f25449d = Integer.valueOf(i10);
        this.f25436b.f25449d = Integer.valueOf(i10);
    }

    void U(int i10) {
        this.f25435a.f25468w = Integer.valueOf(i10);
        this.f25436b.f25468w = Integer.valueOf(i10);
    }

    void V(int i10) {
        this.f25435a.f25454i = Integer.valueOf(i10);
        this.f25436b.f25454i = Integer.valueOf(i10);
    }

    void W(int i10) {
        this.f25435a.f25453h = Integer.valueOf(i10);
        this.f25436b.f25453h = Integer.valueOf(i10);
    }

    void X(int i10) {
        this.f25435a.f25464s = i10;
        this.f25436b.f25464s = i10;
    }

    void Y(CharSequence charSequence) {
        this.f25435a.f25461p = charSequence;
        this.f25436b.f25461p = charSequence;
    }

    void Z(CharSequence charSequence) {
        this.f25435a.f25462q = charSequence;
        this.f25436b.f25462q = charSequence;
    }

    void a() {
        g0(-1);
    }

    void a0(int i10) {
        this.f25435a.f25463r = i10;
        this.f25436b.f25463r = i10;
    }

    void b() {
        i0(null);
    }

    void b0(int i10) {
        this.f25435a.f25471z = Integer.valueOf(i10);
        this.f25436b.f25471z = Integer.valueOf(i10);
    }

    void c0(int i10) {
        this.f25435a.f25469x = Integer.valueOf(i10);
        this.f25436b.f25469x = Integer.valueOf(i10);
    }

    int d() {
        return this.f25436b.B.intValue();
    }

    void d0(int i10) {
        this.f25435a.D = Integer.valueOf(i10);
        this.f25436b.D = Integer.valueOf(i10);
    }

    int e() {
        return this.f25436b.C.intValue();
    }

    void e0(int i10) {
        this.f25435a.f25458m = i10;
        this.f25436b.f25458m = i10;
    }

    int f() {
        return this.f25436b.f25455j;
    }

    void f0(int i10) {
        this.f25435a.f25459n = i10;
        this.f25436b.f25459n = i10;
    }

    int g() {
        return this.f25436b.f25448c.intValue();
    }

    void g0(int i10) {
        this.f25435a.f25457l = i10;
        this.f25436b.f25457l = i10;
    }

    int h() {
        return this.f25436b.f25465t.intValue();
    }

    void h0(Locale locale) {
        this.f25435a.f25460o = locale;
        this.f25436b.f25460o = locale;
    }

    int i() {
        return this.f25436b.f25467v.intValue();
    }

    void i0(String str) {
        this.f25435a.f25456k = str;
        this.f25436b.f25456k = str;
    }

    int j() {
        return this.f25436b.f25452g.intValue();
    }

    void j0(int i10) {
        this.f25435a.f25450e = Integer.valueOf(i10);
        this.f25436b.f25450e = Integer.valueOf(i10);
    }

    int k() {
        return this.f25436b.f25451f.intValue();
    }

    void k0(int i10) {
        this.f25435a.A = Integer.valueOf(i10);
        this.f25436b.A = Integer.valueOf(i10);
    }

    int l() {
        return this.f25436b.f25449d.intValue();
    }

    void l0(int i10) {
        this.f25435a.f25470y = Integer.valueOf(i10);
        this.f25436b.f25470y = Integer.valueOf(i10);
    }

    int m() {
        return this.f25436b.f25468w.intValue();
    }

    void m0(boolean z10) {
        this.f25435a.f25466u = Boolean.valueOf(z10);
        this.f25436b.f25466u = Boolean.valueOf(z10);
    }

    int n() {
        return this.f25436b.f25454i.intValue();
    }

    int o() {
        return this.f25436b.f25453h.intValue();
    }

    int p() {
        return this.f25436b.f25464s;
    }

    CharSequence q() {
        return this.f25436b.f25461p;
    }

    CharSequence r() {
        return this.f25436b.f25462q;
    }

    int s() {
        return this.f25436b.f25463r;
    }

    int t() {
        return this.f25436b.f25471z.intValue();
    }

    int u() {
        return this.f25436b.f25469x.intValue();
    }

    int v() {
        return this.f25436b.D.intValue();
    }

    int w() {
        return this.f25436b.f25458m;
    }

    int x() {
        return this.f25436b.f25459n;
    }

    int y() {
        return this.f25436b.f25457l;
    }

    Locale z() {
        return this.f25436b.f25460o;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State createFromParcel(@NonNull Parcel parcel) {
                return new State(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State[] newArray(int i10) {
                return new State[i10];
            }
        };
        private Integer A;
        private Integer B;
        private Integer C;
        private Integer D;
        private Boolean E;
        private Integer F;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f25448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f25449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f25450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f25451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f25452g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f25453h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Integer f25454i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f25455j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f25456k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f25457l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f25458m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f25459n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Locale f25460o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private CharSequence f25461p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private CharSequence f25462q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f25463r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f25464s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f25465t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Boolean f25466u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Integer f25467v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f25468w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private Integer f25469x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Integer f25470y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Integer f25471z;

        public State() {
            this.f25455j = 255;
            this.f25457l = -2;
            this.f25458m = -2;
            this.f25459n = -2;
            this.f25466u = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeInt(this.f25447b);
            parcel.writeSerializable(this.f25448c);
            parcel.writeSerializable(this.f25449d);
            parcel.writeSerializable(this.f25450e);
            parcel.writeSerializable(this.f25451f);
            parcel.writeSerializable(this.f25452g);
            parcel.writeSerializable(this.f25453h);
            parcel.writeSerializable(this.f25454i);
            parcel.writeInt(this.f25455j);
            parcel.writeString(this.f25456k);
            parcel.writeInt(this.f25457l);
            parcel.writeInt(this.f25458m);
            parcel.writeInt(this.f25459n);
            CharSequence charSequence = this.f25461p;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f25462q;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f25463r);
            parcel.writeSerializable(this.f25465t);
            parcel.writeSerializable(this.f25467v);
            parcel.writeSerializable(this.f25468w);
            parcel.writeSerializable(this.f25469x);
            parcel.writeSerializable(this.f25470y);
            parcel.writeSerializable(this.f25471z);
            parcel.writeSerializable(this.A);
            parcel.writeSerializable(this.D);
            parcel.writeSerializable(this.B);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.f25466u);
            parcel.writeSerializable(this.f25460o);
            parcel.writeSerializable(this.E);
            parcel.writeSerializable(this.F);
        }

        State(Parcel parcel) {
            this.f25455j = 255;
            this.f25457l = -2;
            this.f25458m = -2;
            this.f25459n = -2;
            this.f25466u = Boolean.TRUE;
            this.f25447b = parcel.readInt();
            this.f25448c = (Integer) parcel.readSerializable();
            this.f25449d = (Integer) parcel.readSerializable();
            this.f25450e = (Integer) parcel.readSerializable();
            this.f25451f = (Integer) parcel.readSerializable();
            this.f25452g = (Integer) parcel.readSerializable();
            this.f25453h = (Integer) parcel.readSerializable();
            this.f25454i = (Integer) parcel.readSerializable();
            this.f25455j = parcel.readInt();
            this.f25456k = parcel.readString();
            this.f25457l = parcel.readInt();
            this.f25458m = parcel.readInt();
            this.f25459n = parcel.readInt();
            this.f25461p = parcel.readString();
            this.f25462q = parcel.readString();
            this.f25463r = parcel.readInt();
            this.f25465t = (Integer) parcel.readSerializable();
            this.f25467v = (Integer) parcel.readSerializable();
            this.f25468w = (Integer) parcel.readSerializable();
            this.f25469x = (Integer) parcel.readSerializable();
            this.f25470y = (Integer) parcel.readSerializable();
            this.f25471z = (Integer) parcel.readSerializable();
            this.A = (Integer) parcel.readSerializable();
            this.D = (Integer) parcel.readSerializable();
            this.B = (Integer) parcel.readSerializable();
            this.C = (Integer) parcel.readSerializable();
            this.f25466u = (Boolean) parcel.readSerializable();
            this.f25460o = (Locale) parcel.readSerializable();
            this.E = (Boolean) parcel.readSerializable();
            this.F = (Integer) parcel.readSerializable();
        }
    }
}
