package com.mbridge.msdk.config.dynamic.utils;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.tools.q0;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47576a;

        static {
            int[] iArr = new int[c.values().length];
            f47576a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47576a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47576a[c.layout_margin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47576a[c.layout_marginLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47576a[c.layout_marginTop.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47576a[c.layout_marginRight.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47576a[c.layout_marginBottom.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47576a[c.layout_marginStart.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47576a[c.layout_marginEnd.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47576a[c.layout_weight.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47576a[c.layout_centerInParent.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47576a[c.layout_centerHorizontal.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f47576a[c.layout_centerVertical.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f47576a[c.layout_alignParentLeft.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f47576a[c.layout_alignParentTop.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f47576a[c.layout_alignParentRight.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f47576a[c.layout_alignParentBottom.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f47576a[c.layout_alignLeft.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f47576a[c.layout_alignTop.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f47576a[c.layout_alignRight.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f47576a[c.layout_alignBottom.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f47576a[c.layout_above.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f47576a[c.layout_below.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f47576a[c.layout_toLeftOf.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f47576a[c.layout_toRightOf.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f47576a[c.layout_alignBaseline.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f47576a[c.layout_alignWithParentIfMissing.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f47576a[c.layout_alignParentStart.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f47576a[c.layout_alignParentEnd.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f47576a[c.layout_alignStart.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f47576a[c.layout_alignEnd.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f47576a[c.layout_toStartOf.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f47576a[c.layout_toEndOf.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f47576a[c.layout_orientation.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f47576a[c.layout_foregroundGravity.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f47576a[c.layout_row.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f47576a[c.layout_column.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f47576a[c.layout_gravity.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
        }
    }

    private static void A(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (obj instanceof Integer) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((Integer) obj).intValue();
            } else {
                q0.b("ComponentLayoutParams", "handleMarginLeft 无效");
            }
        }
    }

    private static void B(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (obj instanceof Integer) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ((Integer) obj).intValue();
            } else {
                q0.b("ComponentLayoutParams", "handleMarginRight 无效");
            }
        }
    }

    private static void C(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (!(obj instanceof Integer)) {
                q0.b("ComponentLayoutParams", "handleMarginStart 无效");
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(((Integer) obj).intValue());
            }
        }
    }

    private static void D(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (obj instanceof Integer) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((Integer) obj).intValue();
            } else {
                q0.b("ComponentLayoutParams", "handleMarginTop 无效");
            }
        }
    }

    private static void E(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof LinearLayout.LayoutParams)) {
            if ("horizontal".equalsIgnoreCase(obj.toString())) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
            } else if ("vertical".equalsIgnoreCase(obj.toString())) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = 1;
            }
        }
    }

    private static void F(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof GridLayout.LayoutParams)) {
            try {
                ((GridLayout.LayoutParams) layoutParams).rowSpec = GridLayout.spec(Integer.parseInt(obj.toString()));
            } catch (NumberFormatException e10) {
                q0.b("ComponentLayoutParams", e10.getMessage());
            }
        }
    }

    private static void G(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(17, ((Integer) obj).intValue());
        }
    }

    private static void H(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(0, ((Integer) obj).intValue());
        }
    }

    private static void I(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(1, ((Integer) obj).intValue());
        }
    }

    private static void J(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(16, ((Integer) obj).intValue());
        }
    }

    private static void K(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof LinearLayout.LayoutParams)) {
            try {
                ((LinearLayout.LayoutParams) layoutParams).weight = Float.parseFloat(obj.toString());
            } catch (NumberFormatException e10) {
                q0.b("ComponentLayoutParams", e10.getMessage());
            }
        }
    }

    private static void L(ViewGroup.LayoutParams layoutParams, Object obj) {
        try {
            if (!(obj instanceof String)) {
                if (obj instanceof Integer) {
                    layoutParams.width = ((Integer) obj).intValue();
                    return;
                } else {
                    q0.b("ComponentLayoutParams", "width 无效");
                    return;
                }
            }
            String string = obj.toString();
            if (!string.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !string.startsWith("m")) {
                if (string.startsWith("wrap")) {
                    layoutParams.width = -2;
                    return;
                }
                return;
            }
            layoutParams.width = -1;
        } catch (Exception e10) {
            q0.b("ComponentLayoutParams", e10.getMessage());
        }
    }

    public static ViewGroup.LayoutParams a(String str, Object obj, ViewGroup.LayoutParams layoutParams) {
        c cVar;
        try {
            cVar = (c) com.mbridge.msdk.config.dynamic.c.a().b().get(str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (cVar == null) {
            return null;
        }
        switch (a.f47576a[cVar.ordinal()]) {
            case 1:
                L(layoutParams, obj);
                return layoutParams;
            case 2:
                w(layoutParams, obj);
                return layoutParams;
            case 3:
                x(layoutParams, obj);
                return layoutParams;
            case 4:
                A(layoutParams, obj);
                return layoutParams;
            case 5:
                D(layoutParams, obj);
                return layoutParams;
            case 6:
                B(layoutParams, obj);
                return layoutParams;
            case 7:
                y(layoutParams, obj);
                return layoutParams;
            case 8:
                C(layoutParams, obj);
                return layoutParams;
            case 9:
                z(layoutParams, obj);
                return layoutParams;
            case 10:
                K(layoutParams, obj);
                return layoutParams;
            case 11:
                r(layoutParams, obj);
                return layoutParams;
            case 12:
                q(layoutParams, obj);
                return layoutParams;
            case 13:
                s(layoutParams, obj);
                return layoutParams;
            case 14:
                h(layoutParams, obj);
                return layoutParams;
            case 15:
                k(layoutParams, obj);
                return layoutParams;
            case 16:
                i(layoutParams, obj);
                return layoutParams;
            case 17:
                f(layoutParams, obj);
                return layoutParams;
            case 18:
                e(layoutParams, obj);
                return layoutParams;
            case 19:
                n(layoutParams, obj);
                return layoutParams;
            case 20:
                l(layoutParams, obj);
                return layoutParams;
            case 21:
                c(layoutParams, obj);
                return layoutParams;
            case 22:
                a(layoutParams, obj);
                return layoutParams;
            case 23:
                p(layoutParams, obj);
                return layoutParams;
            case 24:
                H(layoutParams, obj);
                return layoutParams;
            case 25:
                I(layoutParams, obj);
                return layoutParams;
            case 26:
                b(layoutParams, obj);
                return layoutParams;
            case 27:
                o(layoutParams, obj);
                return layoutParams;
            case 28:
                j(layoutParams, obj);
                return layoutParams;
            case 29:
                g(layoutParams, obj);
                return layoutParams;
            case 30:
                m(layoutParams, obj);
                return layoutParams;
            case 31:
                d(layoutParams, obj);
                return layoutParams;
            case 32:
                J(layoutParams, obj);
                return layoutParams;
            case 33:
                G(layoutParams, obj);
                return layoutParams;
            case 34:
                E(layoutParams, obj);
                return layoutParams;
            case 35:
                u(layoutParams, obj);
                return layoutParams;
            case 36:
                F(layoutParams, obj);
                return layoutParams;
            case 37:
                t(layoutParams, obj);
                return layoutParams;
            case 38:
                v(layoutParams, obj);
                return layoutParams;
            default:
                return layoutParams;
        }
    }

    private static void b(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(4, ((Integer) obj).intValue());
        }
    }

    private static void c(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(8, ((Integer) obj).intValue());
        }
    }

    private static void d(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(19, ((Integer) obj).intValue());
        }
    }

    private static void e(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(5, ((Integer) obj).intValue());
        }
    }

    private static void f(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof RelativeLayout.LayoutParams) && Boolean.parseBoolean(obj.toString())) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12);
        }
    }

    private static void g(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(21, ((Integer) obj).intValue());
        }
    }

    private static void h(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof RelativeLayout.LayoutParams) && Boolean.parseBoolean(obj.toString())) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(9);
        }
    }

    private static void i(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof RelativeLayout.LayoutParams) && Boolean.parseBoolean(obj.toString())) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(11);
        }
    }

    private static void j(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(20, ((Integer) obj).intValue());
        }
    }

    private static void k(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof RelativeLayout.LayoutParams) && Boolean.parseBoolean(obj.toString())) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(10);
        }
    }

    private static void l(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(7, ((Integer) obj).intValue());
        }
    }

    private static void m(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(18, ((Integer) obj).intValue());
        }
    }

    private static void n(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(6, ((Integer) obj).intValue());
        }
    }

    private static void o(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof String) && Boolean.parseBoolean((String) obj)) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(20);
            layoutParams2.addRule(21);
        }
    }

    private static void p(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(3, ((Integer) obj).intValue());
        }
    }

    private static void q(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (obj instanceof String) {
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                if (Boolean.parseBoolean(obj.toString())) {
                    ((RelativeLayout.LayoutParams) layoutParams).addRule(14);
                }
            } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = 1;
            }
        }
    }

    private static void r(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof RelativeLayout.LayoutParams) && Boolean.parseBoolean(obj.toString())) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
    }

    private static void s(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof RelativeLayout.LayoutParams)) {
            if (Boolean.parseBoolean(obj.toString())) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(15);
            }
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        }
    }

    private static void t(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof GridLayout.LayoutParams)) {
            try {
                ((GridLayout.LayoutParams) layoutParams).columnSpec = GridLayout.spec(Integer.parseInt(obj.toString()));
            } catch (NumberFormatException e10) {
                q0.b("ComponentLayoutParams", e10.getMessage());
            }
        }
    }

    private static void u(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((obj instanceof String) && (layoutParams instanceof FrameLayout.LayoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = a(obj.toString());
        }
    }

    private static void v(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (obj instanceof String) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = com.mbridge.msdk.config.dynamic.c.a().c(obj.toString());
            } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = com.mbridge.msdk.config.dynamic.c.a().c(obj.toString());
            }
        }
    }

    private static void w(ViewGroup.LayoutParams layoutParams, Object obj) {
        try {
            if (!(obj instanceof String)) {
                if (obj instanceof Integer) {
                    layoutParams.height = ((Integer) obj).intValue();
                    return;
                } else {
                    q0.b("ComponentLayoutParams", "height 无效");
                    return;
                }
            }
            String string = obj.toString();
            if (!string.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !string.startsWith("m")) {
                if (string.startsWith("wrap")) {
                    layoutParams.height = -2;
                    return;
                }
                return;
            }
            layoutParams.height = -1;
        } catch (Exception e10) {
            q0.b("ComponentLayoutParams", e10.getMessage());
        }
    }

    private static void x(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (!(obj instanceof Integer)) {
                q0.b("ComponentLayoutParams", "handleMargin 无效");
            } else {
                int iIntValue = ((Integer) obj).intValue();
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(iIntValue, iIntValue, iIntValue, iIntValue);
            }
        }
    }

    private static void y(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (obj instanceof Integer) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ((Integer) obj).intValue();
            } else {
                q0.b("ComponentLayoutParams", "handleMarginBottom 无效");
            }
        }
    }

    private static void z(ViewGroup.LayoutParams layoutParams, Object obj) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (!(obj instanceof Integer)) {
                q0.b("ComponentLayoutParams", "handleMarginEnd 无效");
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((Integer) obj).intValue());
            }
        }
    }

    private static void a(ViewGroup.LayoutParams layoutParams, Object obj) {
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (obj instanceof Integer)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(2, ((Integer) obj).intValue());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        int i10;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int i11 = 0;
        for (String str2 : str.split("\\|")) {
            String lowerCase = str2.trim().toLowerCase();
            lowerCase.getClass();
            byte b10 = -1;
            switch (lowerCase.hashCode()) {
                case -1633016142:
                    if (lowerCase.equals("fill_vertical")) {
                        b10 = 0;
                    }
                    break;
                case -1383228885:
                    if (lowerCase.equals("bottom")) {
                        b10 = 1;
                    }
                    break;
                case -1364013995:
                    if (lowerCase.equals("center")) {
                        b10 = 2;
                    }
                    break;
                case -831189901:
                    if (lowerCase.equals("clip_horizontal")) {
                        b10 = 3;
                    }
                    break;
                case -483365792:
                    if (lowerCase.equals("fill_horizontal")) {
                        b10 = 4;
                    }
                    break;
                case -348726240:
                    if (lowerCase.equals("center_vertical")) {
                        b10 = 5;
                    }
                    break;
                case -55726203:
                    if (lowerCase.equals("clip_vertical")) {
                        b10 = 6;
                    }
                    break;
                case 100571:
                    if (lowerCase.equals("end")) {
                        b10 = 7;
                    }
                    break;
                case 115029:
                    if (lowerCase.equals("top")) {
                        b10 = 8;
                    }
                    break;
                case 3143043:
                    if (lowerCase.equals(Reporting.EventType.FILL)) {
                        b10 = 9;
                    }
                    break;
                case 3317767:
                    if (lowerCase.equals("left")) {
                        b10 = 10;
                    }
                    break;
                case 108511772:
                    if (lowerCase.equals("right")) {
                        b10 = Ascii.VT;
                    }
                    break;
                case 109757538:
                    if (lowerCase.equals("start")) {
                        b10 = Ascii.FF;
                    }
                    break;
                case 1063616078:
                    if (lowerCase.equals("center_horizontal")) {
                        b10 = 13;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    i10 = 112;
                    i11 |= i10;
                    break;
                case 1:
                    i10 = 80;
                    i11 |= i10;
                    break;
                case 2:
                    i10 = 17;
                    i11 |= i10;
                    break;
                case 3:
                    i10 = 8;
                    i11 |= i10;
                    break;
                case 4:
                    i10 = 7;
                    i11 |= i10;
                    break;
                case 5:
                    i10 = 16;
                    i11 |= i10;
                    break;
                case 6:
                    i10 = 128;
                    i11 |= i10;
                    break;
                case 7:
                    i10 = GravityCompat.END;
                    i11 |= i10;
                    break;
                case 8:
                    i10 = 48;
                    i11 |= i10;
                    break;
                case 9:
                    i10 = 119;
                    i11 |= i10;
                    break;
                case 10:
                    i10 = 3;
                    i11 |= i10;
                    break;
                case 11:
                    i10 = 5;
                    i11 |= i10;
                    break;
                case 12:
                    i10 = GravityCompat.START;
                    i11 |= i10;
                    break;
                case 13:
                    i10 = 1;
                    i11 |= i10;
                    break;
            }
        }
        return i11;
    }
}
