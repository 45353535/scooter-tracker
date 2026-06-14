package com.applovin.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s2 extends BaseAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f10385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f10386b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f10387c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f10388d;

    public interface a {
        void a(j2 j2Var, r2 r2Var);
    }

    protected s2(Context context) {
        this.f10385a = context.getApplicationContext();
    }

    protected r2 a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    protected abstract int b();

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r2 getItem(int i10) {
        return (r2) this.f10386b.get(i10);
    }

    protected abstract List c(int i10);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.yd
            @Override // java.lang.Runnable
            public final void run() {
                this.f11565b.notifyDataSetChanged();
            }
        });
    }

    protected abstract int d(int i10);

    protected abstract r2 e(int i10);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f10386b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        return getItem(i10).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        q2 q2Var;
        r2 item = getItem(i10);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            q2Var = new q2();
            q2Var.f10224a = (TextView) view.findViewById(R.id.text1);
            q2Var.f10225b = (TextView) view.findViewById(R.id.text2);
            q2Var.f10226c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            q2Var.f10227d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(q2Var);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            q2Var = (q2) view.getTag();
        }
        q2Var.a(i10);
        q2Var.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return r2.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return getItem(i10).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i10;
        this.f10386b = new ArrayList();
        int iB = b();
        this.f10387c = new HashMap(iB);
        r2 r2VarA = a();
        if (r2VarA != null) {
            this.f10386b.add(r2VarA);
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < iB; i11++) {
            int iD = d(i11);
            if (iD != 0) {
                this.f10386b.add(e(i11));
                this.f10386b.addAll(c(i11));
                this.f10387c.put(Integer.valueOf(i11), Integer.valueOf(i10));
                i10 += iD + 1;
            }
        }
        this.f10386b.add(new v4(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        q2 q2Var = (q2) view.getTag();
        r2 r2VarB = q2Var.b();
        j2 j2VarA = a(q2Var.a());
        a aVar = this.f10388d;
        if (aVar == null || j2VarA == null) {
            return;
        }
        aVar.a(j2VarA, r2VarB);
    }

    public void a(a aVar) {
        this.f10388d = aVar;
    }

    private j2 a(int i10) {
        for (int i11 = 0; i11 < b(); i11++) {
            Integer num = (Integer) this.f10387c.get(Integer.valueOf(i11));
            if (num != null) {
                if (i10 <= num.intValue() + d(i11)) {
                    return new j2(i11, i10 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(m0.a(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor, this.f10385a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }
}
