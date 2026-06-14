package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.s;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.network.w0;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;

/* JADX INFO: loaded from: classes7.dex */
public class FyberAdIdentifierLocal extends IFyberAdIdentifier implements View.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f23803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f23804n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23805o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Animator f23806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f23807q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f23808r;

    public FyberAdIdentifierLocal(r rVar) {
        super(rVar);
        this.f23805o = false;
        this.f23807q = 0.0f;
    }

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier
    public final void a(ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ia_identifier_overlay);
        int i10 = 0;
        ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(R.layout.ia_layout_fyber_ad_identifier, viewGroup2, false);
        this.f23803m = (ImageView) viewGroup3.findViewById(R.id.ia_fyber_identifier_image);
        TextView textView = (TextView) viewGroup3.findViewById(R.id.ia_fyber_identifier_text);
        this.f23804n = textView;
        if (this.f23824j) {
            int i11 = this.f23816b;
            int i12 = this.f23817c;
            if (textView != null && textView.getLayoutParams() != null) {
                textView.getLayoutParams().width = o.b(i11);
                textView.getLayoutParams().height = o.b(i12);
            }
            ImageView imageView = this.f23803m;
            int i13 = this.f23818d;
            int i14 = this.f23819e;
            if (imageView != null && imageView.getLayoutParams() != null) {
                imageView.getLayoutParams().width = o.b(i13);
                imageView.getLayoutParams().height = o.b(i14);
            }
            TextView textView2 = this.f23804n;
            int i15 = this.f23820f;
            if (s.a(textView2)) {
                textView2.setTextSize(i15);
            }
            a(this.f23803m, this.f23821g);
            this.f23804n.setOnClickListener(this);
            this.f23804n.setText(this.f23822h);
            String str = this.f23823i;
            if (!TextUtils.isEmpty(str)) {
                IAConfigManager.O.f20313s.a(new w0(new b(this), viewGroup2.getContext(), new com.fyber.inneractive.sdk.cache.b(str)));
            }
        }
        IFyberAdIdentifier.Corner corner = this.f23825k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            viewGroup3.removeView(this.f23804n);
            viewGroup3.addView(this.f23804n);
            viewGroup3.setLayoutDirection(0);
        }
        viewGroup3.addOnLayoutChangeListener(new c(this));
        this.f23803m.setOnClickListener(this);
        a();
        viewGroup2.addView(viewGroup3);
        IFyberAdIdentifier.Corner corner2 = this.f23825k;
        corner2.getClass();
        int i16 = j.f23839a[corner2.ordinal()];
        if (i16 == 1) {
            i10 = 51;
        } else if (i16 == 2) {
            i10 = 53;
        } else if (i16 == 3) {
            i10 = 83;
        } else if (i16 == 4) {
            i10 = 85;
        }
        o.a(viewGroup3, i10);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.f23803m) {
            if (view == this.f23804n && this.f23826l == com.fyber.inneractive.sdk.config.global.features.a.OPEN) {
                a();
                IFyberAdIdentifier.ClickListener clickListener = this.f23815a;
                if (clickListener != null) {
                    clickListener.a();
                    return;
                }
                return;
            }
            return;
        }
        if (this.f23806p != null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ImageView imageView = this.f23803m;
        Property property = View.ROTATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 90.0f);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f23803m, "imageAlpha", 255, 25);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfInt);
        animatorSet2.addListener(new d(this, animatorSet));
        animatorSet2.setDuration(225L);
        this.f23806p = animatorSet2;
        animatorSet2.start();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f23803m, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this.f23803m, "imageAlpha", 25, 255);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(objectAnimatorOfFloat2, objectAnimatorOfInt2);
        animatorSet3.setDuration(225L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f23804n, (Property<TextView, Float>) View.TRANSLATION_X, this.f23805o ? this.f23807q : 0.0f);
        objectAnimatorOfFloat3.setDuration(450L);
        animatorSet.setDuration(450L);
        animatorSet.playTogether(objectAnimatorOfFloat3, animatorSet3);
        animatorSet.addListener(new e(this));
    }

    public final void a() {
        this.f23805o = false;
        this.f23803m.setImageResource(R.drawable.ia_fyber_info_button);
        a(this.f23803m, this.f23821g);
        Animator animator = this.f23806p;
        if (animator != null) {
            animator.removeAllListeners();
            this.f23806p = null;
        }
    }

    public static void a(ImageView imageView, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                com.fyber.inneractive.sdk.widget.a.a(imageView, ColorStateList.valueOf(Color.parseColor(str)));
                return;
            } catch (Exception unused) {
                IAlog.f("could not parse color %s", str);
                return;
            }
        }
        com.fyber.inneractive.sdk.widget.a.a(imageView, null);
    }
}
