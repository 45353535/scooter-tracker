package com.google.maps.android.data.kml;

import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.Style;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
public class KmlStyle extends Style {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f34016h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34014f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34015g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f34018j = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f34012d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet f34013e = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f34017i = 1.0d;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f34022n = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34019k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f34020l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f34021m = false;

    KmlStyle() {
    }

    private static String a(String str) {
        String strTrim = str.trim();
        if (strTrim.length() <= 6) {
            return strTrim.substring(4, 6) + strTrim.substring(2, 4) + strTrim.substring(0, 2);
        }
        return strTrim.substring(0, 2) + strTrim.substring(6, 8) + strTrim.substring(4, 6) + strTrim.substring(2, 4);
    }

    private static MarkerOptions b(MarkerOptions markerOptions, boolean z10, float f10) {
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.rotation(markerOptions.getRotation());
        markerOptions2.anchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        if (z10) {
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(e(computeRandomColor((int) f10))));
        }
        markerOptions2.icon(markerOptions.getIcon());
        return markerOptions2;
    }

    private static PolygonOptions c(PolygonOptions polygonOptions, boolean z10, boolean z11) {
        float strokeWidth;
        PolygonOptions polygonOptions2 = new PolygonOptions();
        if (z10) {
            polygonOptions2.fillColor(polygonOptions.getFillColor());
        }
        if (z11) {
            polygonOptions2.strokeColor(polygonOptions.getStrokeColor());
            strokeWidth = polygonOptions.getStrokeWidth();
        } else {
            strokeWidth = 0.0f;
        }
        polygonOptions2.strokeWidth(strokeWidth);
        polygonOptions2.clickable(polygonOptions.isClickable());
        return polygonOptions2;
    }

    public static int computeRandomColor(int i10) {
        Random random = new Random();
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        if (iRed != 0) {
            iRed = random.nextInt(iRed);
        }
        if (iBlue != 0) {
            iBlue = random.nextInt(iBlue);
        }
        if (iGreen != 0) {
            iGreen = random.nextInt(iGreen);
        }
        return Color.rgb(iRed, iGreen, iBlue);
    }

    private static PolylineOptions d(PolylineOptions polylineOptions) {
        PolylineOptions polylineOptions2 = new PolylineOptions();
        polylineOptions2.color(polylineOptions.getColor());
        polylineOptions2.width(polylineOptions.getWidth());
        polylineOptions2.clickable(polylineOptions.isClickable());
        return polylineOptions2;
    }

    private static float e(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        return fArr[0];
    }

    String f() {
        return this.f34018j;
    }

    boolean g() {
        return this.f34019k;
    }

    public HashMap<String, String> getBalloonOptions() {
        return this.f34012d;
    }

    public double getIconScale() {
        return this.f34017i;
    }

    public String getIconUrl() {
        return this.f34016h;
    }

    public MarkerOptions getMarkerOptions() {
        return b(this.f33956a, g(), this.f34022n);
    }

    public PolygonOptions getPolygonOptions() {
        return c(this.f33958c, this.f34014f, this.f34015g);
    }

    public PolylineOptions getPolylineOptions() {
        return d(this.f33957b);
    }

    void h(String str) {
        setPolygonFillColor(Color.parseColor("#" + a(str)));
        this.f34013e.add("fillColor");
    }

    public boolean hasBalloonStyle() {
        return this.f34012d.size() > 0;
    }

    public boolean hasFill() {
        return this.f34014f;
    }

    public boolean hasOutline() {
        return this.f34015g;
    }

    void i(float f10) {
        setMarkerRotation(f10);
        this.f34013e.add("heading");
    }

    public boolean isLineRandomColorMode() {
        return this.f34020l;
    }

    public boolean isPolyRandomColorMode() {
        return this.f34021m;
    }

    public boolean isStyleSet(String str) {
        return this.f34013e.contains(str);
    }

    void j(float f10, float f11, String str, String str2) {
        setMarkerHotSpot(f10, f11, str, str2);
        this.f34013e.add("hotSpot");
    }

    void k(String str) {
        this.f34019k = str.equals("random");
        this.f34013e.add("iconColorMode");
    }

    void l(double d10) {
        this.f34017i = d10;
        this.f34013e.add("iconScale");
    }

    void m(String str) {
        this.f34016h = str;
        this.f34013e.add("iconUrl");
    }

    void n(String str) {
        this.f34012d.put("text", str);
    }

    void o(String str) {
        this.f34020l = str.equals("random");
        this.f34013e.add("lineColorMode");
    }

    void p(String str) {
        float fE = e(Color.parseColor("#" + a(str)));
        this.f34022n = fE;
        this.f33956a.icon(BitmapDescriptorFactory.defaultMarker(fE));
        this.f34013e.add("markerColor");
    }

    void q(boolean z10) {
        this.f34015g = z10;
        this.f34013e.add("outline");
    }

    void r(String str) {
        this.f33957b.color(Color.parseColor("#" + a(str)));
        this.f33958c.strokeColor(Color.parseColor("#" + a(str)));
        this.f34013e.add("outlineColor");
    }

    void s(String str) {
        this.f34021m = str.equals("random");
        this.f34013e.add("polyColorMode");
    }

    public void setFill(boolean z10) {
        this.f34014f = z10;
    }

    void t(String str) {
        this.f34018j = str;
    }

    public String toString() {
        return "Style{\n balloon options=" + this.f34012d + ",\n fill=" + this.f34014f + ",\n outline=" + this.f34015g + ",\n icon url=" + this.f34016h + ",\n scale=" + this.f34017i + ",\n style id=" + this.f34018j + "\n}\n";
    }

    void u(Float f10) {
        setLineStringWidth(f10.floatValue());
        setPolygonStrokeWidth(f10.floatValue());
        this.f34013e.add("width");
    }
}
