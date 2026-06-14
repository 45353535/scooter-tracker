package com.my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.nativeads.views.PromoCardRecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class g8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f59725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f59726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f59727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f59728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f59729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f59730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f59731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WeakReference f59732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WeakReference f59733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WeakReference f59734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WeakReference f59735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference f59736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference f59737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public WeakReference f59738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference f59739p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59724a = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f59740q = false;

    public void a(i iVar) {
        this.f59729f = new WeakReference(iVar);
    }

    public View b() {
        WeakReference weakReference = this.f59729f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View c() {
        WeakReference weakReference = this.f59732i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View d() {
        WeakReference weakReference = this.f59733j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public List e() {
        if (this.f59726c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f59726c.iterator();
        while (it.hasNext()) {
            arrayList.add((View) ((WeakReference) it.next()).get());
        }
        return arrayList;
    }

    public Context f() {
        ViewGroup viewGroupO = o();
        if (viewGroupO != null) {
            return viewGroupO.getContext();
        }
        return null;
    }

    public View g() {
        WeakReference weakReference = this.f59731h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View h() {
        WeakReference weakReference = this.f59734k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View i() {
        WeakReference weakReference = this.f59735l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View j() {
        WeakReference weakReference = this.f59736m;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public IconAdView k() {
        WeakReference weakReference = this.f59728e;
        if (weakReference != null) {
            return (IconAdView) weakReference.get();
        }
        return null;
    }

    public MediaAdView l() {
        WeakReference weakReference = this.f59727d;
        if (weakReference != null) {
            return (MediaAdView) weakReference.get();
        }
        return null;
    }

    public List m() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f59724a.iterator();
        while (it.hasNext()) {
            arrayList.add((View) ((WeakReference) it.next()).get());
        }
        return arrayList;
    }

    public c9 n() {
        WeakReference weakReference = this.f59730g;
        if (weakReference != null) {
            return (c9) weakReference.get();
        }
        return null;
    }

    public ViewGroup o() {
        WeakReference weakReference = this.f59725b;
        if (weakReference != null) {
            return (ViewGroup) weakReference.get();
        }
        return null;
    }

    public View p() {
        WeakReference weakReference = this.f59739p;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View q() {
        WeakReference weakReference = this.f59737n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View r() {
        WeakReference weakReference = this.f59738o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public boolean s() {
        return this.f59726c == null || this.f59740q;
    }

    public void a() {
        List list = this.f59726c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((WeakReference) it.next()).clear();
            }
            this.f59726c.clear();
            this.f59726c = null;
        }
        Iterator it2 = this.f59724a.iterator();
        while (it2.hasNext()) {
            ((WeakReference) it2.next()).clear();
        }
        this.f59724a.clear();
        WeakReference weakReference = this.f59732i;
        if (weakReference != null) {
            weakReference.clear();
            this.f59732i = null;
        }
        WeakReference weakReference2 = this.f59733j;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.f59733j = null;
        }
        WeakReference weakReference3 = this.f59731h;
        if (weakReference3 != null) {
            weakReference3.clear();
            this.f59731h = null;
        }
        WeakReference weakReference4 = this.f59734k;
        if (weakReference4 != null) {
            weakReference4.clear();
            this.f59734k = null;
        }
        WeakReference weakReference5 = this.f59735l;
        if (weakReference5 != null) {
            weakReference5.clear();
            this.f59735l = null;
        }
        WeakReference weakReference6 = this.f59736m;
        if (weakReference6 != null) {
            weakReference6.clear();
            this.f59736m = null;
        }
        WeakReference weakReference7 = this.f59728e;
        if (weakReference7 != null) {
            weakReference7.clear();
            this.f59728e = null;
        }
        WeakReference weakReference8 = this.f59739p;
        if (weakReference8 != null) {
            weakReference8.clear();
            this.f59739p = null;
        }
        WeakReference weakReference9 = this.f59737n;
        if (weakReference9 != null) {
            weakReference9.clear();
            this.f59737n = null;
        }
        WeakReference weakReference10 = this.f59738o;
        if (weakReference10 != null) {
            weakReference10.clear();
            this.f59738o = null;
        }
        WeakReference weakReference11 = this.f59727d;
        if (weakReference11 != null) {
            weakReference11.clear();
            this.f59727d = null;
        }
        WeakReference weakReference12 = this.f59730g;
        if (weakReference12 != null) {
            weakReference12.clear();
            this.f59730g = null;
        }
        WeakReference weakReference13 = this.f59725b;
        if (weakReference13 != null) {
            weakReference13.clear();
            this.f59725b = null;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewGroup f59741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public NativeAdViewBinder f59742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public NativeBannerAdViewBinder f59743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public MediaAdView f59744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f59745e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f59746f = 0;

        public g8 a() {
            NativeBannerAdViewBinder nativeBannerAdViewBinder;
            NativeAdViewBinder nativeAdViewBinder;
            NativeBannerAdViewBinder nativeBannerAdViewBinder2;
            NativeAdViewBinder nativeAdViewBinder2;
            g8 g8Var = new g8();
            if (this.f59745e != null) {
                g8Var.f59726c = new ArrayList();
                for (View view : this.f59745e) {
                    if (view != null) {
                        g8Var.f59726c.add(new WeakReference(view));
                        if (view instanceof MediaAdView) {
                            g8Var.f59740q = true;
                        }
                    }
                }
            }
            int i10 = this.f59746f;
            if (i10 != 0) {
                ViewGroup rootAdBannerView = i10 == 1 ? this.f59741a : (i10 != 2 || (nativeAdViewBinder = this.f59742b) == null) ? (i10 != 3 || (nativeBannerAdViewBinder = this.f59743c) == null) ? null : nativeBannerAdViewBinder.getRootAdBannerView() : nativeAdViewBinder.getRootAdView();
                if (rootAdBannerView == null) {
                    gb.c("NativeViewsHolderBuilder: can't init root ad view");
                    return g8Var;
                }
                g8Var.f59725b = new WeakReference(rootAdBannerView);
                List listA = a(rootAdBannerView);
                int i11 = this.f59746f;
                if (i11 == 1) {
                    a(g8Var, listA);
                    return g8Var;
                }
                if (i11 == 2 && (nativeAdViewBinder2 = this.f59742b) != null) {
                    a(g8Var, nativeAdViewBinder2, listA);
                    return g8Var;
                }
                if (i11 == 3 && (nativeBannerAdViewBinder2 = this.f59743c) != null) {
                    a(g8Var, nativeBannerAdViewBinder2, listA);
                }
            }
            return g8Var;
        }

        public a b(ViewGroup viewGroup) {
            this.f59746f = 1;
            this.f59741a = viewGroup;
            return this;
        }

        public final void a(g8 g8Var, NativeBannerAdViewBinder nativeBannerAdViewBinder, List list) {
            View advertisingView = nativeBannerAdViewBinder.getAdvertisingView();
            if (advertisingView != null) {
                g8Var.f59732i = new WeakReference(advertisingView);
                list.remove(advertisingView);
            }
            View ageRestrictionView = nativeBannerAdViewBinder.getAgeRestrictionView();
            if (ageRestrictionView != null) {
                g8Var.f59733j = new WeakReference(ageRestrictionView);
                list.remove(ageRestrictionView);
            }
            View ctaView = nativeBannerAdViewBinder.getCtaView();
            if (ctaView != null) {
                g8Var.f59731h = new WeakReference(ctaView);
                list.remove(ctaView);
            }
            View disclaimerView = nativeBannerAdViewBinder.getDisclaimerView();
            if (disclaimerView != null) {
                g8Var.f59735l = new WeakReference(disclaimerView);
                list.remove(disclaimerView);
            }
            View starsRatingView = nativeBannerAdViewBinder.getStarsRatingView();
            if (starsRatingView != null) {
                g8Var.f59739p = new WeakReference(starsRatingView);
                list.remove(starsRatingView);
            }
            View titleView = nativeBannerAdViewBinder.getTitleView();
            if (titleView != null) {
                g8Var.f59737n = new WeakReference(titleView);
                list.remove(titleView);
            }
            View domainView = nativeBannerAdViewBinder.getDomainView();
            if (domainView != null) {
                g8Var.f59736m = new WeakReference(domainView);
                list.remove(domainView);
            }
            View votesView = nativeBannerAdViewBinder.getVotesView();
            if (votesView != null) {
                g8Var.f59738o = new WeakReference(votesView);
                list.remove(votesView);
            }
            View adChoicesView = nativeBannerAdViewBinder.getAdChoicesView();
            if (votesView != null) {
                g8Var.f59729f = new WeakReference(adChoicesView);
                list.remove(adChoicesView);
            }
            IconAdView iconView = nativeBannerAdViewBinder.getIconView();
            g8Var.f59728e = new WeakReference(iconView);
            list.remove(iconView);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g8Var.f59724a.add(new WeakReference((View) it.next()));
            }
        }

        public final void a(g8 g8Var, NativeAdViewBinder nativeAdViewBinder, List list) {
            View advertisingView = nativeAdViewBinder.getAdvertisingView();
            if (advertisingView != null) {
                g8Var.f59732i = new WeakReference(advertisingView);
                list.remove(advertisingView);
            }
            View ageRestrictionView = nativeAdViewBinder.getAgeRestrictionView();
            if (ageRestrictionView != null) {
                g8Var.f59733j = new WeakReference(ageRestrictionView);
                list.remove(ageRestrictionView);
            }
            View ctaView = nativeAdViewBinder.getCtaView();
            if (ctaView != null) {
                g8Var.f59731h = new WeakReference(ctaView);
                list.remove(ctaView);
            }
            View descriptionView = nativeAdViewBinder.getDescriptionView();
            if (descriptionView != null) {
                g8Var.f59734k = new WeakReference(descriptionView);
                list.remove(descriptionView);
            }
            View disclaimerView = nativeAdViewBinder.getDisclaimerView();
            if (disclaimerView != null) {
                g8Var.f59735l = new WeakReference(disclaimerView);
                list.remove(disclaimerView);
            }
            View domainOrCategoryView = nativeAdViewBinder.getDomainOrCategoryView();
            if (domainOrCategoryView != null) {
                g8Var.f59736m = new WeakReference(domainOrCategoryView);
                list.remove(domainOrCategoryView);
            }
            PromoCardRecyclerView promoCardRecyclerView = nativeAdViewBinder.getPromoCardRecyclerView();
            if (promoCardRecyclerView != null) {
                g8Var.f59730g = new WeakReference(promoCardRecyclerView);
                list.remove(promoCardRecyclerView);
            }
            View starsRatingView = nativeAdViewBinder.getStarsRatingView();
            if (starsRatingView != null) {
                g8Var.f59739p = new WeakReference(starsRatingView);
                list.remove(starsRatingView);
            }
            View titleView = nativeAdViewBinder.getTitleView();
            if (titleView != null) {
                g8Var.f59737n = new WeakReference(titleView);
                list.remove(titleView);
            }
            View votesView = nativeAdViewBinder.getVotesView();
            if (votesView != null) {
                g8Var.f59738o = new WeakReference(votesView);
                list.remove(votesView);
            }
            View adChoicesView = nativeAdViewBinder.getAdChoicesView();
            if (votesView != null) {
                g8Var.f59729f = new WeakReference(adChoicesView);
                list.remove(adChoicesView);
            }
            MediaAdView mediaAdView = nativeAdViewBinder.getMediaAdView();
            if (mediaAdView != null) {
                g8Var.f59727d = new WeakReference(mediaAdView);
                list.remove(mediaAdView);
            }
            IconAdView iconView = nativeAdViewBinder.getIconView();
            g8Var.f59728e = new WeakReference(iconView);
            list.remove(iconView);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g8Var.f59724a.add(new WeakReference((View) it.next()));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(g8 g8Var, List list) {
            if (this.f59744d != null) {
                g8Var.f59727d = new WeakReference(this.f59744d);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof IconAdView) {
                    g8Var.f59728e = new WeakReference((IconAdView) view);
                } else if (view instanceof i) {
                    g8Var.f59729f = new WeakReference(view);
                } else if (view instanceof PromoCardRecyclerView) {
                    g8Var.f59730g = new WeakReference((c9) view);
                } else if (view instanceof MediaAdView) {
                    if (g8Var.f59727d == null) {
                        g8Var.f59727d = new WeakReference((MediaAdView) view);
                    }
                } else if (R.id.nativeads_advertising == view.getId()) {
                    g8Var.f59732i = new WeakReference(view);
                } else if (R.id.nativeads_title == view.getId()) {
                    g8Var.f59737n = new WeakReference(view);
                } else if (R.id.nativeads_description == view.getId()) {
                    g8Var.f59734k = new WeakReference(view);
                } else if (R.id.nativeads_rating == view.getId()) {
                    g8Var.f59739p = new WeakReference(view);
                } else if (R.id.nativeads_domain == view.getId()) {
                    g8Var.f59736m = new WeakReference(view);
                } else if (R.id.nativeads_age_restrictions == view.getId()) {
                    g8Var.f59733j = new WeakReference(view);
                } else if (R.id.nativeads_disclaimer == view.getId()) {
                    g8Var.f59735l = new WeakReference(view);
                } else if (R.id.nativeads_call_to_action == view.getId()) {
                    g8Var.f59731h = new WeakReference((Button) view);
                } else if (R.id.nativeads_votes == view.getId()) {
                    g8Var.f59738o = new WeakReference(view);
                } else {
                    g8Var.f59724a.add(new WeakReference(view));
                }
            }
        }

        public a a(List list) {
            this.f59745e = list;
            return this;
        }

        public a a(NativeAdViewBinder nativeAdViewBinder) {
            this.f59746f = 2;
            this.f59742b = nativeAdViewBinder;
            return this;
        }

        public a a(NativeBannerAdViewBinder nativeBannerAdViewBinder) {
            this.f59746f = 3;
            this.f59743c = nativeBannerAdViewBinder;
            return this;
        }

        public a a(MediaAdView mediaAdView) {
            this.f59744d = mediaAdView;
            return this;
        }

        public final List a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof IconAdView) {
                    arrayList.add(childAt);
                } else if (childAt instanceof PromoCardRecyclerView) {
                    arrayList.add(childAt);
                } else if (childAt instanceof MediaAdView) {
                    arrayList.add(childAt);
                } else if (childAt instanceof ViewGroup) {
                    arrayList.addAll(a((ViewGroup) childAt));
                } else {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }
    }
}
