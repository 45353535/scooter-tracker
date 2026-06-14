package com.my.target;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.navigation.NavigationBarView;
import com.my.target.common.menu.Menu;
import com.my.target.common.menu.MenuAction;
import com.my.target.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends FrameLayout implements k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListView f59672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f59673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f59676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f59677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f59678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f59679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MenuAction f59680i;

    public g(Context context, List list, WeakReference weakReference) {
        super(context);
        this.f59680i = null;
        this.f59676e = new ArrayList(list);
        this.f59677f = weakReference;
        kb kbVarE = kb.e(context);
        this.f59674c = kbVarE.b(500);
        this.f59675d = kbVarE.a(0.5f);
        ListView listView = new ListView(context);
        this.f59672a = listView;
        listView.setDivider(null);
        addView(listView);
        View view = new View(context);
        this.f59673b = view;
        view.setBackgroundColor(-5131855);
        addView(view);
    }

    @Override // com.my.target.k.a
    public void a(k kVar, FrameLayout frameLayout) {
        frameLayout.addView(this, -1, -1);
        c();
    }

    @Override // com.my.target.k.a
    public void b(boolean z10) {
    }

    public void c() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 512.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setFillAfter(true);
        this.f59672a.startAnimation(translateAnimation);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax = Math.max((i12 - this.f59672a.getMeasuredWidth()) / 2, getPaddingLeft());
        View view = this.f59678g;
        if (view != null) {
            view.layout(iMax, (i13 - getPaddingBottom()) - this.f59678g.getMeasuredHeight(), this.f59678g.getMeasuredWidth() + iMax, i13 - getPaddingBottom());
        }
        this.f59673b.layout(iMax, this.f59678g.getTop() - this.f59673b.getMeasuredHeight(), this.f59673b.getMeasuredWidth() + iMax, this.f59678g.getTop());
        this.f59672a.layout(iMax, this.f59673b.getTop() - this.f59672a.getMeasuredHeight(), this.f59672a.getMeasuredWidth() + iMax, this.f59673b.getTop());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int iMin = (Math.min(size, this.f59674c) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        View view = this.f59678g;
        if (view != null) {
            view.measure(iMakeMeasureSpec, paddingTop);
        }
        this.f59673b.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.f59675d, 1073741824));
        this.f59672a.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((paddingTop - this.f59675d) - this.f59678g.getMeasuredHeight(), Integer.MIN_VALUE));
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.k.a
    public void r() {
        MenuAction menuAction;
        WeakReference weakReference = this.f59679h;
        if (weakReference != null) {
            weakReference.clear();
            this.f59679h = null;
            Menu.Listener listener = (Menu.Listener) this.f59677f.get();
            if (listener == null || (menuAction = this.f59680i) == null) {
                return;
            }
            listener.onActionClick(menuAction);
        }
    }

    public void b() {
        if (this.f59676e.size() == 0 || (this.f59676e.size() == 1 && ((MenuAction) this.f59676e.get(0)).style == 1)) {
            gb.a("AdChoicesOptionsView: there are no actions. Can't open dialog");
            return;
        }
        Iterator it = this.f59676e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            final MenuAction menuAction = (MenuAction) it.next();
            if (menuAction.style != 0) {
                this.f59680i = menuAction;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: k5.k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f86067b.a(menuAction, view);
                    }
                };
                View viewA = a(onClickListener, getContext());
                this.f59678g = viewA;
                addView(viewA);
                setOnClickListener(onClickListener);
                break;
            }
        }
        MenuAction menuAction2 = this.f59680i;
        if (menuAction2 != null) {
            this.f59676e.remove(menuAction2);
        }
        this.f59672a.setAdapter((ListAdapter) new a(this.f59676e, this.f59677f));
        try {
            k kVarA = k.a(this, getContext());
            this.f59679h = new WeakReference(kVarA);
            kVarA.show();
        } catch (Throwable th2) {
            th2.printStackTrace();
            gb.b("AdChoicesOptionsController: Unable to start adchoices dialog");
            r();
        }
    }

    public final /* synthetic */ void a(MenuAction menuAction, View view) {
        Menu.Listener listener = (Menu.Listener) this.f59677f.get();
        if (listener == null) {
            gb.a("AdChoicesOptionsView: listener is null, can't call on action click.");
        } else {
            listener.onActionClick(menuAction);
        }
    }

    public void a() {
        k kVar;
        WeakReference weakReference = this.f59679h;
        if (weakReference == null || (kVar = (k) weakReference.get()) == null) {
            return;
        }
        kVar.dismiss();
    }

    public final View a(View.OnClickListener onClickListener, Context context) {
        ImageButton imageButton = new ImageButton(context);
        imageButton.setImageBitmap(l0.a(context));
        kb.a(imageButton, -1, -3158065);
        imageButton.setOnClickListener(onClickListener);
        return imageButton;
    }

    public static class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f59681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference f59682b;

        public a(List list, WeakReference weakReference) {
            this.f59681a = list;
            this.f59682b = weakReference;
        }

        public static Drawable a(kb kbVar, boolean z10) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{-1, -1});
            GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{-3158065, -3158065});
            if (z10) {
                float fB = kbVar.b(8);
                float[] fArr = {fB, fB, fB, fB, 0.0f, 0.0f, 0.0f, 0.0f};
                gradientDrawable.setCornerRadii(fArr);
                gradientDrawable2.setCornerRadii(fArr);
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
            int[] iArr = StateSet.WILD_CARD;
            stateListDrawable.addState(iArr, gradientDrawable);
            return new RippleDrawable(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, iArr}, new int[]{kb.a(-3158065), kb.a(-1)}), stateListDrawable, null);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f59681a.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return this.f59681a.get(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(final int i10, View view, ViewGroup viewGroup) {
            return a(((MenuAction) this.f59681a.get(i10)).title, i10 == 0, viewGroup.getContext(), new View.OnClickListener() { // from class: k5.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f86078b.a(i10, view2);
                }
            });
        }

        public final /* synthetic */ void a(int i10, View view) {
            if (i10 < 0 || i10 >= this.f59681a.size()) {
                return;
            }
            MenuAction menuAction = (MenuAction) this.f59681a.get(i10);
            Menu.Listener listener = (Menu.Listener) this.f59682b.get();
            if (listener == null) {
                return;
            }
            listener.onActionClick(menuAction);
        }

        public View a(String str, boolean z10, Context context, View.OnClickListener onClickListener) {
            Button button = new Button(context);
            button.setOnClickListener(onClickListener);
            kb kbVarE = kb.e(context);
            int iB = kbVarE.b(24);
            button.setPadding(iB, button.getPaddingTop(), iB, button.getPaddingBottom());
            button.setAllCaps(false);
            button.setStateListAnimator(null);
            button.setLines(1);
            button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            button.setEllipsize(TextUtils.TruncateAt.END);
            button.setTypeface(null, 0);
            button.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
            button.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            button.setBackground(a(kbVarE, z10));
            button.setText(str);
            return button;
        }
    }
}
