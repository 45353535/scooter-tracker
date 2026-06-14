package com.my.target.nativeads.views;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.kb;
import com.my.target.nativeads.NativeAppwallAd;
import com.my.target.nativeads.banners.NativeAppwallBanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AppwallAdView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListView f60324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kb f60325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f60326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppwallAdViewListener f60327d;

    public interface AppwallAdViewListener {
        void onBannerClick(@NonNull NativeAppwallBanner nativeAppwallBanner);

        void onBannersShow(@NonNull List<NativeAppwallBanner> list);
    }

    public static class AppwallAdapter extends ArrayAdapter<NativeAppwallBanner> {
        public AppwallAdapter(Context context, List list) {
            super(context, 0, list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @NonNull
        public View getView(int i10, View view, @NonNull ViewGroup viewGroup) {
            NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) getItem(i10);
            if (view == null) {
                view = new AppwallCardPlaceholder(new AppwallAdTeaserView(getContext()), getContext());
            }
            if (nativeAppwallBanner != null) {
                ((AppwallCardPlaceholder) view).getView().setNativeAppwallBanner(nativeAppwallBanner);
            }
            return view;
        }
    }

    @SuppressLint({"ViewConstructor"})
    public static class AppwallCardPlaceholder extends FrameLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AppwallAdTeaserView f60328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinearLayout f60329b;

        public AppwallCardPlaceholder(@NonNull AppwallAdTeaserView appwallAdTeaserView, Context context) {
            super(context);
            kb kbVarE = kb.e(context);
            this.f60328a = appwallAdTeaserView;
            int iB = kbVarE.b(9);
            int iB2 = kbVarE.b(4);
            int iB3 = kbVarE.b(2);
            LinearLayout linearLayout = new LinearLayout(context);
            this.f60329b = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(iB, iB2, iB, iB2);
            appwallAdTeaserView.setLayoutParams(layoutParams);
            linearLayout.addView(appwallAdTeaserView);
            appwallAdTeaserView.setElevation(iB3);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{-1, -1});
            GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{MediaAdView.COLOR_PLACEHOLDER_GRAY, MediaAdView.COLOR_PLACEHOLDER_GRAY});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
            stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
            appwallAdTeaserView.setBackground(stateListDrawable);
            addView(linearLayout, -2, -2);
        }

        @NonNull
        public AppwallAdTeaserView getView() {
            return this.f60328a;
        }
    }

    public AppwallAdView(@NonNull Context context) {
        super(context);
        this.f60326c = new HashMap();
        setVerticalFadingEdgeEnabled(false);
        setBackgroundColor(-1);
        this.f60325b = kb.e(context);
        this.f60324a = new ListView(context);
        b();
    }

    public final void a() {
        AppwallAdViewListener appwallAdViewListener;
        if (this.f60324a.getAdapter() == null) {
            return;
        }
        int lastVisiblePosition = this.f60324a.getLastVisiblePosition();
        ArrayList arrayList = new ArrayList();
        for (int firstVisiblePosition = this.f60324a.getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
            NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) this.f60324a.getAdapter().getItem(firstVisiblePosition);
            if (this.f60326c.get(nativeAppwallBanner) == null) {
                arrayList.add(nativeAppwallBanner);
                this.f60326c.put(nativeAppwallBanner, Boolean.TRUE);
            }
        }
        if (arrayList.size() <= 0 || (appwallAdViewListener = this.f60327d) == null) {
            return;
        }
        appwallAdViewListener.onBannersShow(arrayList);
    }

    public final void b() {
        int iB = this.f60325b.b(4);
        int iB2 = this.f60325b.b(4);
        this.f60324a.setDividerHeight(0);
        this.f60324a.setVerticalFadingEdgeEnabled(false);
        this.f60324a.setOnItemClickListener(this);
        this.f60324a.setOnScrollListener(this);
        this.f60324a.setPadding(0, iB, 0, iB2);
        this.f60324a.setClipToPadding(false);
        addView(this.f60324a, -1, -1);
        this.f60324a.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
    }

    public void notifyDataSetChanged() {
        ((AppwallAdapter) this.f60324a.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        a();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) this.f60324a.getAdapter().getItem(i10);
        AppwallAdViewListener appwallAdViewListener = this.f60327d;
        if (appwallAdViewListener != null) {
            appwallAdViewListener.onBannerClick(nativeAppwallBanner);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        a();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
    }

    public void setAppwallAdViewListener(@Nullable AppwallAdViewListener appwallAdViewListener) {
        this.f60327d = appwallAdViewListener;
    }

    public void setupView(@NonNull NativeAppwallAd nativeAppwallAd) {
        this.f60324a.setAdapter((ListAdapter) new AppwallAdapter(getContext(), nativeAppwallAd.getBanners()));
    }
}
