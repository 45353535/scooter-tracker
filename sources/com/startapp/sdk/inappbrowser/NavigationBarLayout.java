package com.startapp.sdk.inappbrowser;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.startapp.sdk.internal.g2;
import com.startapp.sdk.internal.li;
import com.startapp.sdk.internal.td;
import com.startapp.startappsdk.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class NavigationBarLayout extends RelativeLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f64212j = R.id.io_start_navigation_bar;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f64213k = R.id.io_start_navigation_bar_title;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f64214l = R.id.io_start_navigation_bar_close;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f64215m = R.id.io_start_navigation_bar_external;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f64216n = R.id.io_start_navigation_bar_back;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f64217o = R.id.io_start_navigation_bar_forward;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f64218p = R.id.io_start_navigation_bar_title_url;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f64219q = Color.rgb(78, 86, 101);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f64220r = Color.rgb(148, ModuleDescriptor.MODULE_VERSION, 166);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f64221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f64222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f64223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f64224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f64225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f64226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f64227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f64228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashMap f64229i;

    public NavigationBarLayout(Context context) {
        super(context);
        this.f64228h = Boolean.FALSE;
    }

    public final void a(WebView webView) {
        if (this.f64228h.booleanValue()) {
            if (webView.canGoBack()) {
                this.f64225e.setImageBitmap(((td) this.f64229i.get("BACK_DARK")).f65318a);
                this.f64225e.setEnabled(true);
            } else {
                this.f64225e.setImageBitmap(((td) this.f64229i.get("BACK")).f65318a);
                this.f64225e.setEnabled(false);
            }
            if (webView.canGoForward()) {
                this.f64223c.setImageBitmap(((td) this.f64229i.get("FORWARD_DARK")).f65318a);
                this.f64223c.setEnabled(true);
            } else {
                this.f64223c.setImageBitmap(((td) this.f64229i.get("FORWARD")).f65318a);
                this.f64223c.setEnabled(false);
            }
            if (webView.getTitle() != null) {
                this.f64226f.setText(webView.getTitle());
                return;
            }
            return;
        }
        if (webView.canGoBack()) {
            this.f64225e.setImageBitmap(((td) this.f64229i.get("BACK_DARK")).f65318a);
            addView(this.f64225e, li.a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
            View view = this.f64223c;
            int i10 = f64216n;
            RelativeLayout.LayoutParams layoutParamsA = li.a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15});
            layoutParamsA.addRule(1, i10);
            addView(view, layoutParamsA);
            removeView(this.f64221a);
            this.f64221a.removeView(this.f64227g);
            this.f64221a.removeView(this.f64226f);
            this.f64221a.addView(this.f64226f, li.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
            RelativeLayout relativeLayout = this.f64221a;
            TextView textView = this.f64227g;
            int i11 = f64213k;
            RelativeLayout.LayoutParams layoutParamsA2 = li.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14});
            layoutParamsA2.addRule(3, i11);
            relativeLayout.addView(textView, layoutParamsA2);
            int i12 = f64217o;
            RelativeLayout.LayoutParams layoutParamsA3 = li.a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15});
            layoutParamsA3.addRule(1, i12);
            layoutParamsA3.addRule(0, f64215m);
            addView(this.f64221a, layoutParamsA3);
            this.f64228h = Boolean.TRUE;
        }
    }

    public final TextView b() {
        return this.f64227g;
    }

    public final void c() throws Throwable {
        Typeface typeface = Typeface.DEFAULT;
        Context context = getContext();
        int i10 = f64219q;
        int i11 = f64213k;
        TextView textView = new TextView(context);
        textView.setTypeface(typeface, 1);
        textView.setTextSize(1, 16.46f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(i10);
        textView.setId(i11);
        this.f64226f = textView;
        Context context2 = getContext();
        int i12 = f64220r;
        int i13 = f64218p;
        TextView textView2 = new TextView(context2);
        textView2.setTypeface(typeface, 1);
        textView2.setTextSize(1, 12.12f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(i12);
        textView2.setId(i13);
        this.f64227g = textView2;
        this.f64226f.setText("Loading…");
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f64221a = relativeLayout;
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f64221a.addView(this.f64226f, li.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]));
        RelativeLayout relativeLayout2 = this.f64221a;
        TextView textView3 = this.f64227g;
        RelativeLayout.LayoutParams layoutParamsA = li.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]);
        layoutParamsA.addRule(3, i11);
        relativeLayout2.addView(textView3, layoutParamsA);
        for (td tdVar : this.f64229i.values()) {
            Context context3 = getContext();
            String str = tdVar.f65321d;
            Bitmap bitmapB = g2.b(context3, str);
            if (bitmapB == null) {
                bitmapB = g2.b(context3, str);
            }
            if (bitmapB != null) {
                tdVar.f65318a = Bitmap.createScaledBitmap(bitmapB, li.a(getContext(), tdVar.f65319b), li.a(getContext(), tdVar.f65320c), true);
            }
        }
        Context context4 = getContext();
        Bitmap bitmap = ((td) this.f64229i.get("X")).f65318a;
        int i14 = f64214l;
        ImageView imageView = new ImageView(context4);
        imageView.setImageBitmap(bitmap);
        imageView.setId(i14);
        this.f64222b = imageView;
        Context context5 = getContext();
        Bitmap bitmap2 = ((td) this.f64229i.get("BROWSER")).f65318a;
        int i15 = f64215m;
        ImageView imageView2 = new ImageView(context5);
        imageView2.setImageBitmap(bitmap2);
        imageView2.setId(i15);
        this.f64224d = imageView2;
        Context context6 = getContext();
        Bitmap bitmap3 = ((td) this.f64229i.get("BACK")).f65318a;
        int i16 = f64216n;
        ImageView imageView3 = new ImageView(context6);
        imageView3.setImageBitmap(bitmap3);
        imageView3.setId(i16);
        this.f64225e = imageView3;
        Context context7 = getContext();
        Bitmap bitmap4 = ((td) this.f64229i.get("FORWARD")).f65318a;
        int i17 = f64217o;
        ImageView imageView4 = new ImageView(context7);
        imageView4.setImageBitmap(bitmap4);
        imageView4.setId(i17);
        this.f64223c = imageView4;
        int iA = li.a(getContext(), 10);
        this.f64223c.setPadding(iA, iA, iA, iA);
        this.f64223c.setEnabled(false);
        this.f64225e.setPadding(iA, iA, iA, iA);
        addView(this.f64222b, li.a(getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
        View view = this.f64224d;
        RelativeLayout.LayoutParams layoutParamsA2 = li.a(getContext(), new int[]{0, 0, 17, 0}, new int[]{15});
        layoutParamsA2.addRule(0, i14);
        addView(view, layoutParamsA2);
        View view2 = this.f64221a;
        RelativeLayout.LayoutParams layoutParamsA3 = li.a(getContext(), new int[]{16, 6, 16, 0}, new int[]{9});
        layoutParamsA3.addRule(0, i15);
        addView(view2, layoutParamsA3);
    }

    public final void d() {
        setDescendantFocusability(262144);
        setBackgroundColor(Color.parseColor("#e9e9e9"));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, li.a(getContext(), 60)));
        setId(f64212j);
        HashMap map = new HashMap();
        map.put("BACK", new td(14, 22, "back_.png"));
        map.put("BACK_DARK", new td(14, 22, "back_dark.png"));
        map.put("FORWARD", new td(14, 22, "forward_.png"));
        map.put("FORWARD_DARK", new td(14, 22, "forward_dark.png"));
        map.put("X", new td(23, 23, "x_dark.png"));
        map.put("BROWSER", new td(28, 28, "browser_icon_dark.png"));
        this.f64229i = map;
    }

    public final void e() {
        this.f64229i = null;
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.f64222b.setOnClickListener(onClickListener);
        this.f64225e.setOnClickListener(onClickListener);
        this.f64223c.setOnClickListener(onClickListener);
        this.f64224d.setOnClickListener(onClickListener);
    }

    public final TextView a() {
        return this.f64226f;
    }
}
