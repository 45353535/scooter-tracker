package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes4.dex */
public class t extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public volatile sg.bigo.ads.ad.b.b f101734c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ImageView f101736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ImageView f101737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f101738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Bitmap f101739h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f101742k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<v> f101743l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f101744m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f101745n = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f101740i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final AtomicBoolean f101741j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final d f101735d = new d();

    public interface a {
        Pair<String, String> a(@NonNull TextView textView, @Nullable String str, @Nullable String str2);
    }

    public t(@NonNull sg.bigo.ads.ad.b.b bVar) {
        this.f101734c = bVar;
    }

    final synchronized void a(@Nullable Bitmap bitmap) {
        try {
            this.f101738g = bitmap;
            Iterator<v> it = this.f101743l.iterator();
            while (it.hasNext()) {
                it.next().a();
                it.remove();
            }
            this.f101742k = 2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected void b(@NonNull final ViewGroup viewGroup) {
        sg.bigo.ads.common.utils.d.a(viewGroup.getContext(), this.f101738g, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.t.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                if (viewFindViewWithTag instanceof ImageView) {
                    t.this.f101737f = (ImageView) viewFindViewWithTag;
                } else {
                    Context context = viewGroup.getContext();
                    if (context != null) {
                        t.this.f101737f = new ImageView(context);
                        t.this.f101737f.setTag("adview_background_main_tag");
                        t.this.f101737f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        sg.bigo.ads.common.utils.u.a(t.this.f101737f, viewGroup, null, 0);
                    }
                }
                ImageView imageView = t.this.f101737f;
                if (imageView == null || bitmap2 == null) {
                    return;
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                t.this.f101737f.setImageBitmap(bitmap2);
            }
        });
    }

    public final void d() {
        if (this.f101738g == null) {
            ImageView imageView = this.f101736e;
            if (imageView != null && this.f101744m) {
                a(imageView);
            }
            if (this.f101737f == null || !this.f101745n) {
                return;
            }
            a(new v() { // from class: sg.bigo.ads.ad.interstitial.t.9
                @Override // sg.bigo.ads.ad.interstitial.v
                public final void a() {
                    final Bitmap bitmapB = sg.bigo.ads.common.utils.d.b(t.this.f101737f.getContext(), t.this.f101738g);
                    t.this.f101737f.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.t.9.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            t.this.f101737f.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            sg.bigo.ads.common.utils.d.a(t.this.f101737f, bitmapB);
                        }
                    });
                }
            });
        }
    }

    @NonNull
    public d e() {
        return this.f101735d;
    }

    public void f() {
    }

    @Nullable
    public final synchronized Bitmap g() {
        Bitmap bitmap = this.f101739h;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return this.f101739h;
    }

    @NonNull
    public final synchronized sg.bigo.ads.common.p h() {
        Bitmap bitmap = this.f101739h;
        if (bitmap != null) {
            return new sg.bigo.ads.common.p(bitmap.getWidth(), this.f101739h.getHeight());
        }
        return new sg.bigo.ads.common.p(-1, -1);
    }

    public final synchronized void i() {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.f101734c.f();
        if (aVar.aR()) {
            Bitmap bitmap = this.f101739h;
            if (bitmap == null || bitmap.isRecycled()) {
                if (this.f101741j.compareAndSet(false, true)) {
                    String strAT = aVar.aT();
                    if (sg.bigo.ads.common.utils.q.a((CharSequence) strAT)) {
                        return;
                    }
                    sg.bigo.ads.common.p.e.a(this.f101734c.f100335b.f102178e, strAT, aVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.t.6
                        @Override // sg.bigo.ads.common.p.g
                        public final void a(int i10, @NonNull String str, String str2) {
                            t.this.f101741j.set(false);
                        }

                        @Override // sg.bigo.ads.common.p.g
                        public final void a(@NonNull Bitmap bitmap2, @NonNull sg.bigo.ads.common.p.f fVar) {
                            t tVar = t.this;
                            tVar.f101739h = bitmap2;
                            tVar.f101740i = sg.bigo.ads.common.w.b.a(bitmap2, 0);
                            t.this.f101741j.set(false);
                        }
                    });
                }
            }
        }
    }

    public static void a(@Nullable View view) {
        AdOptionsView adOptionsView;
        if (view == null || (adOptionsView = (AdOptionsView) view.findViewById(R.id.inter_options)) == null) {
            return;
        }
        adOptionsView.setVisibility(adOptionsView.findViewWithTag("ad_options_real_view") == null ? 8 : 0);
    }

    private synchronized void b(final ValueCallback<Bitmap> valueCallback) {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) this.f101734c.f();
        if (!aVar.aR()) {
            String strAT = aVar.aT();
            if (sg.bigo.ads.common.utils.q.a((CharSequence) strAT)) {
                valueCallback.onReceiveValue(null);
                return;
            } else {
                sg.bigo.ads.common.p.e.a(this.f101734c.f100335b.f102178e, strAT, aVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.t.14
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i10, @NonNull String str, String str2) {
                        valueCallback.onReceiveValue(null);
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        valueCallback.onReceiveValue(bitmap);
                    }
                });
                return;
            }
        }
        String strB = sg.bigo.ads.common.o.b(this.f101734c.f100335b.f102178e, aVar.aN());
        if (sg.bigo.ads.common.utils.q.a((CharSequence) strB)) {
            valueCallback.onReceiveValue(null);
        } else {
            final String path = Uri.parse(strB).getPath();
            sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.t.13
                @Override // java.lang.Runnable
                public final void run() {
                    valueCallback.onReceiveValue(sg.bigo.ads.common.utils.d.a(Uri.parse(path).getPath(), t.this.f101734c.f100335b.f102178e));
                }
            });
        }
    }

    public void a(@NonNull final ViewGroup viewGroup) {
        this.f101745n = true;
        a(new v() { // from class: sg.bigo.ads.ad.interstitial.t.3
            @Override // sg.bigo.ads.ad.interstitial.v
            public final void a() {
                Integer numA = sg.bigo.ads.common.w.b.a(t.this.f101738g);
                if (numA != null) {
                    t.this.f101735d.a(numA.intValue());
                }
                t.this.b(viewGroup);
            }
        });
    }

    public final void a(@NonNull final ViewGroup viewGroup, final int i10) {
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.t.5
            @Override // java.lang.Runnable
            @RequiresApi(api = 17)
            public final void run() {
                View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                if (viewFindViewWithTag instanceof ImageView) {
                    t.this.f101737f = (ImageView) viewFindViewWithTag;
                } else {
                    Context context = viewGroup.getContext();
                    if (context != null) {
                        t.this.f101737f = new ImageView(context);
                        t.this.f101737f.setTag("adview_background_main_tag");
                        t.this.f101737f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        sg.bigo.ads.common.utils.u.a(t.this.f101737f, viewGroup, null, 0);
                    }
                }
                ImageView imageView = t.this.f101737f;
                if (imageView != null) {
                    imageView.setBackgroundColor(i10);
                }
            }
        });
    }

    public void a(@NonNull ViewGroup viewGroup, @NonNull View view, int i10, int i11, int i12, @Nullable View... viewArr) {
        a(viewGroup, view, null, i10, i11, i12, viewArr);
    }

    /* JADX WARN: Type inference failed for: r15v26, types: [sg.bigo.ads.api.core.b] */
    public void a(@NonNull ViewGroup viewGroup, @NonNull View view, a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        ArrayList arrayList = new ArrayList();
        b.d popPage = this.f101734c.getPopPage();
        TextView textView = (TextView) view.findViewById(R.id.inter_title);
        if (textView != null) {
            textView.setTag(2);
            a(aVar, textView, this.f101734c.getTitle(), popPage == null ? "" : popPage.b());
            arrayList.add(textView);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.inter_description);
        if (textView2 != null) {
            textView2.setTag(6);
            a(aVar, textView2, this.f101734c.getDescription(), popPage == null ? "" : popPage.c());
            arrayList.add(textView2);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.inter_warning);
        if (textView3 != null) {
            textView3.setTag(8);
            String warning = this.f101734c.getWarning();
            if (TextUtils.isEmpty(warning)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(warning);
            }
            arrayList.add(textView3);
        }
        TextView textView4 = (TextView) view.findViewById(R.id.inter_btn_cta);
        if (textView4 != null) {
            textView4.setTag(7);
            a(aVar, textView4, this.f101734c.getCallToAction(), "");
            arrayList.add(textView4);
        }
        TextView textView5 = (TextView) view.findViewById(R.id.inter_btn_cta_main);
        if (textView5 != null) {
            textView5.setTag(7);
            a(aVar, textView5, sg.bigo.ads.common.utils.a.a(textView5.getContext(), R.string.bigo_ad_cta_default, new Object[0]), "");
            arrayList.add(textView5);
        }
        final ImageView imageView = (ImageView) view.findViewById(R.id.inter_end_page_image);
        if (imageView != null) {
            imageView.setTag(5);
            final ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.t.1
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    final Bitmap bitmap2 = bitmap;
                    imageView.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.t.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            imageView.setImageBitmap(bitmap2);
                        }
                    });
                }
            };
            Bitmap bitmap = this.f101739h;
            if (bitmap != null) {
                valueCallback.onReceiveValue(bitmap);
            } else {
                a(new v() { // from class: sg.bigo.ads.ad.interstitial.t.7
                    @Override // sg.bigo.ads.ad.interstitial.v
                    public final void a() {
                        valueCallback.onReceiveValue(t.this.f101738g);
                    }
                });
            }
        }
        TextView textView6 = (TextView) view.findViewById(R.id.inter_company);
        if (textView6 != null) {
            textView6.setTag(26);
            if (popPage == null || sg.bigo.ads.common.utils.q.a((CharSequence) popPage.f())) {
                textView6.setVisibility(8);
            } else {
                a(aVar, textView6, popPage.f(), "");
            }
            arrayList.add(textView6);
        }
        TextView textView7 = (TextView) view.findViewById(R.id.inter_star_num);
        View viewFindViewById = view.findViewById(R.id.inter_star_layout);
        if (textView7 != null && viewFindViewById != null) {
            viewFindViewById.setTag(26);
            textView7.setText(sg.bigo.ads.ad.b.e.c(((sg.bigo.ads.core.a.a) this.f101734c.f()).n()));
            arrayList.add(viewFindViewById);
        }
        TextView textView8 = (TextView) view.findViewById(R.id.inter_commit_num);
        if (textView8 != null) {
            textView8.setTag(26);
            textView8.setText(sg.bigo.ads.ad.b.e.b(((sg.bigo.ads.core.a.a) this.f101734c.f()).n()) + " " + sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.string.bigo_ad_comment_num_text, new Object[0]));
            arrayList.add(textView8);
        }
        TextView textView9 = (TextView) view.findViewById(R.id.inter_download_num);
        View viewFindViewById2 = view.findViewById(R.id.inter_download_num_layout);
        if (textView9 != null && viewFindViewById2 != null) {
            viewFindViewById2.setTag(26);
            textView9.setText(sg.bigo.ads.ad.b.e.a(((sg.bigo.ads.core.a.a) this.f101734c.f()).n()));
            arrayList.add(viewFindViewById2);
        }
        View viewFindViewById3 = view.findViewById(R.id.inter_everyone_layout);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setTag(26);
            arrayList.add(viewFindViewById3);
        }
        this.f101736e = (ImageView) view.findViewById(R.id.inter_icon);
        AdOptionsView adOptionsView = (AdOptionsView) view.findViewById(R.id.inter_options);
        MediaView mediaView = (MediaView) view.findViewById(R.id.inter_media);
        this.f101734c.H = i12;
        this.f101734c.a(viewGroup, mediaView, this.f101736e, adOptionsView, (List<View>) arrayList, i11, viewArr);
        if (this.f101736e == null || this.f101734c.hasIcon()) {
            return;
        }
        String strA = popPage != null ? popPage.a() : "";
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) strA) && URLUtil.isNetworkUrl(strA)) {
            if (!sg.bigo.ads.api.a.i.f102116a.n().a(9) || !URLUtil.isHttpUrl(strA)) {
                sg.bigo.ads.common.p.e.b(this.f101734c.f100335b.f102178e, null, strA, ((sg.bigo.ads.core.a.a) this.f101734c.f()).al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.t.8
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i13, @NonNull String str, String str2) {
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap2, @NonNull sg.bigo.ads.common.p.f fVar) {
                        ImageView imageView2 = t.this.f101736e;
                        if (imageView2 != null) {
                            imageView2.setImageBitmap(bitmap2);
                        }
                    }
                });
                return;
            } else {
                if (this.f101734c == null || this.f101734c.f() == 0) {
                    return;
                }
                sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) this.f101734c.f(), 3000, 10220, "Invalid http url: ".concat(String.valueOf(strA)));
                return;
            }
        }
        if (i10 == 2) {
            this.f101736e.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f101736e.getContext(), R.drawable.bigo_ad_icon_default));
        } else if (i10 == 1) {
            a(this.f101736e);
        } else if (i10 == 3) {
            this.f101736e.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f101736e.getContext(), R.drawable.bigo_ad_icon_novideo_default));
        }
    }

    public final synchronized void a(final ValueCallback<Bitmap> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        a(new v() { // from class: sg.bigo.ads.ad.interstitial.t.12
            @Override // sg.bigo.ads.ad.interstitial.v
            public final void a() {
                valueCallback.onReceiveValue(t.this.f101738g);
            }
        });
    }

    final void a(@NonNull final ImageView imageView) {
        this.f101744m = true;
        a(new v() { // from class: sg.bigo.ads.ad.interstitial.t.2
            @Override // sg.bigo.ads.ad.interstitial.v
            public final void a() {
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.t.2.1
                    @Override // java.lang.Runnable
                    @RequiresApi(api = 17)
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        imageView.setImageBitmap(t.this.f101738g);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    }
                });
            }
        });
    }

    private static void a(a aVar, @NonNull TextView textView, @Nullable String str, @Nullable String str2) {
        Pair<String, String> pairA;
        if (aVar != null && (pairA = aVar.a(textView, str, str2)) != null) {
            str = (String) pairA.first;
            str2 = (String) pairA.second;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            textView.setText(str2);
        }
    }

    private synchronized void a(@NonNull v vVar) {
        if (this.f101738g != null) {
            vVar.a();
            return;
        }
        this.f101743l.add(vVar);
        if (this.f101742k == 1) {
            return;
        }
        this.f101742k = 1;
        b(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.t.11
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                t.this.a(bitmap);
            }
        });
    }
}
